package com.wandoujia.p4.pay.fragment;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import com.wandoujia.p4.pay.PayImpl;
import com.wandoujia.p4.pay.callback.CallbackWrapper;
import com.wandoujia.p4.pay.callback.CallbackWrapper.Status;
import com.wandoujia.p4.pay.callback.CallbackWrapper.Type;
import com.wandoujia.p4.pay.model.PayCallBack;
import com.wandoujia.p4.pay.model.PayChannel;
import com.wandoujia.p4.pay.model.PayChannel.RechargeItem;
import com.wandoujia.p4.pay.model.PayMethod;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.paymethod.Alipay;
import com.wandoujia.p4.pay.paymethod.ShenzhouPay;
import com.wandoujia.p4.pay.paymethod.TelecomPay;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.p4.pay.utils.ProgressDialogUtil;
import com.wandoujia.p4.pay.utils.SLog;
import java.util.List;

public class RechargeFragment extends Fragment
  implements View.OnClickListener
{
  private static final String INPUT_ITEM = "手动输入";
  private static final int POLLING_COUNT = 5;
  private static final String RECHARGE_APP_KEY_ID = "100000225";
  private static final String RECHARGE_DESC = "豌豆币充值";
  private static final String RECHARGE_SECRET_KEY = "9e45e1d5cfcd2ad21f86c1b43a12b3d8";
  private static final String TAG = RechargeFragment.class.getSimpleName();
  private static boolean loopbreak = false;
  private TextView amountLabelText;
  private WandouOrder currentOrder;
  private Long defaultRechargeMoney;
  private LocalStorage localStorage;
  private List<PayChannel> payChannels;
  private PayImpl payImpl;
  private RechargeFragment.PaymentCallback paymentCallback = new RechargeFragment.PaymentCallback(this);
  private TextView promptText;
  private Spinner rechargeAmountSelector;
  private Button rechargeButton;
  private Spinner rechargeChannelSelector;
  private View rootView;
  private String selectedPayMethod;
  private RechargeFragment.ShenzhouLooperCallBack shenzhouCallback = new RechargeFragment.ShenzhouLooperCallBack(this);
  private TextView shenzhouCardNumber;
  private View shenzhouInput;
  private TextView shenzhouPassword;
  private TextView wdbCountInput;

  private void confirmDialog(String paramString1, String paramString2, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(getActivity());
    localBuilder.setMessage(paramString2).setTitle(paramString1);
    localBuilder.setPositiveButton("确定", paramOnClickListener);
    localBuilder.setNegativeButton("取消", new RechargeFragment.9(this));
    localBuilder.create().show();
  }

  private void createOrder(PayMethod paramPayMethod, long paramLong)
  {
    PayImpl.setFinishStatus(CallbackWrapper.Status.CANCEL);
    ProgressDialogUtil.show(getActivity(), null, getActivity().getString(2131625725));
    WandouOrder localWandouOrder = new WandouOrder("豌豆币充值", "豌豆币充值", Long.valueOf(paramLong));
    localWandouOrder.setOut_trade_no("豌豆币充值" + paramLong);
    this.payImpl.createOrder(localWandouOrder, new RechargeFragment.5(this, paramLong, paramPayMethod), new RechargeFragment.6(this));
  }

  private void failToRecharge()
  {
    ProgressDialogUtil.dismiss();
    String str = this.localStorage.getOrder().toJSONString();
    FragmentActivity localFragmentActivity = getActivity();
    getActivity();
    CallbackWrapper.invoke(localFragmentActivity, -1, CallbackWrapper.Type.RECHARGE, CallbackWrapper.Status.FAIL, CallbackWrapper.Status.FAIL.name() + str, str);
  }

  public static RechargeFragment newInstance(Bundle paramBundle)
  {
    RechargeFragment localRechargeFragment = new RechargeFragment();
    localRechargeFragment.setArguments(paramBundle);
    return localRechargeFragment;
  }

  private void queryResultMessage()
  {
    this.payImpl.queryOrderResult(PayImpl.rechargeResultUrl, new RechargeFragment.7(this));
  }

  private void recharge(PayMethod paramPayMethod, WandouOrder paramWandouOrder)
  {
    if (PayMethod.ALIPAY.equals(paramPayMethod))
    {
      SLog.i("order", paramWandouOrder.toJSONString());
      paramWandouOrder.setRechargeInfo(this.localStorage.getOrderIdPrefix() + paramWandouOrder.getOrderId());
      new Alipay().pay(getActivity(), paramWandouOrder, 100);
    }
    do
    {
      return;
      if (PayMethod.UNIONPAY.equals(paramPayMethod))
      {
        SLog.i(TAG, "Do UnionPay... nothing happened ...");
        this.payImpl.getUnionPayTN(new RechargeFragment.10(this));
        return;
      }
      if (PayMethod.SHENZHOUPAY.equals(paramPayMethod))
      {
        String str3 = this.shenzhouCardNumber.getText().toString();
        String str4 = this.shenzhouPassword.getText().toString();
        new ShenzhouPay().pay(this.payImpl, paramWandouOrder, "1", (int)(paramWandouOrder.getMoneyInFen().longValue() / 100L), str3, str4, new RechargeFragment.11(this, paramWandouOrder));
        return;
      }
      if (!PayMethod.TELECOM.equals(paramPayMethod))
        continue;
      new TelecomPay().pay(getActivity(), paramWandouOrder, this.paymentCallback);
      return;
    }
    while (!PayMethod.UNICOM.equals(paramPayMethod));
    String str1 = this.payImpl.showMoney(this.localStorage.getChoseMoney().longValue());
    String str2 = this.payImpl.showMoney(2L * this.localStorage.getChoseMoney().longValue());
    confirmDialog("确认使用话费支付", "支付 " + str2 + "元购买" + str1 + "豌豆币", new RechargeFragment.12(this, paramWandouOrder));
  }

  private void setUpPaythods()
  {
    String[] arrayOfString = this.localStorage.getPayMethodList().split(",");
    if ((arrayOfString.length == 0) || (TextUtils.isEmpty(arrayOfString[0])))
    {
      SLog.e("setUpPaythods", "payMethodNameList is null");
      return;
    }
    for (int i = 0; i < arrayOfString.length; i++)
    {
      if (PayMethod.getByName(arrayOfString[i]) == null)
        continue;
      arrayOfString[i] = PayMethod.getByName(arrayOfString[i]).title();
    }
    ArrayAdapter localArrayAdapter = new ArrayAdapter(getActivity(), 2130903608, arrayOfString);
    localArrayAdapter.setDropDownViewResource(17367049);
    this.rechargeChannelSelector.setAdapter(localArrayAdapter);
    this.rechargeChannelSelector.setOnItemSelectedListener(new RechargeFragment.1(this, arrayOfString));
    this.rechargeChannelSelector.setSelection(0);
    this.payImpl.getPromptText("sdk-charge", new RechargeFragment.2(this), new RechargeFragment.3(this));
  }

  private void startSheznouLoop(WandouOrder paramWandouOrder, PayCallBack paramPayCallBack)
  {
    loopbreak = false;
    new Thread(new RechargeFragment.4(this, paramWandouOrder, paramPayCallBack)).start();
  }

  private void toast(String paramString)
  {
    if (getActivity() == null)
    {
      SLog.w(TAG, "Activity is null, stop to use this context to show toast.");
      return;
    }
    new Handler(getActivity().getMainLooper()).post(new RechargeFragment.8(this, paramString));
  }

  public PayCallBack getPayCallback()
  {
    return this.paymentCallback;
  }

  public void onClick(View paramView)
  {
    int i = paramView.getId();
    if (2131494085 == i)
      FeedbackFragment.showFeedback(getActivity());
    PayMethod localPayMethod;
    do
    {
      do
        return;
      while (2131494084 != i);
      localPayMethod = PayMethod.getByTitle(this.rechargeChannelSelector.getSelectedItem());
    }
    while (localPayMethod == null);
    Object localObject = Long.valueOf(1L);
    List localList = PayChannel.getRechargeMoneyList(localPayMethod.title());
    if (this.rechargeAmountSelector.getVisibility() == 0)
    {
      PayChannel.RechargeItem localRechargeItem = (PayChannel.RechargeItem)localList.get(this.rechargeAmountSelector.getSelectedItemPosition());
      SLog.d("rechargePay", localRechargeItem.toString());
      localObject = Long.valueOf(localRechargeItem.money);
    }
    while (true)
    {
      Long localLong2 = Long.valueOf(((Long)localObject).longValue());
      if (localLong2.longValue() <= 0L)
        break;
      createOrder(localPayMethod, localLong2.longValue());
      return;
      if (this.wdbCountInput.getVisibility() != 0)
        continue;
      String str = this.wdbCountInput.getText().toString();
      try
      {
        Long localLong1 = Long.valueOf(100L * Long.valueOf(str).longValue());
        localObject = localLong1;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        toast(getString(2131625748));
        return;
      }
    }
    toast(getString(2131625748));
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.payChannels = PayChannel.getChannels();
    LocalStorage.init(getActivity(), "100000225", "9e45e1d5cfcd2ad21f86c1b43a12b3d8");
    this.localStorage = LocalStorage.getCurrentConfig();
    this.payImpl = PayImpl.getInstance(getActivity(), this.localStorage.getAppId());
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.rootView = paramLayoutInflater.inflate(2130903605, paramViewGroup, false);
    this.rechargeChannelSelector = ((Spinner)this.rootView.findViewById(2131494097));
    this.rechargeAmountSelector = ((Spinner)this.rootView.findViewById(2131494099));
    this.promptText = ((TextView)this.rootView.findViewById(2131494101));
    this.rechargeButton = ((Button)this.rootView.findViewById(2131494084));
    this.rechargeButton.setOnClickListener(this);
    this.shenzhouInput = this.rootView.findViewById(2131494102);
    this.shenzhouCardNumber = ((TextView)this.rootView.findViewById(2131494103));
    this.shenzhouPassword = ((TextView)this.rootView.findViewById(2131494104));
    this.amountLabelText = ((TextView)this.rootView.findViewById(2131494098));
    this.wdbCountInput = ((TextView)this.rootView.findViewById(2131494100));
    this.rootView.findViewById(2131494085).setOnClickListener(this);
    setUpPaythods();
    return this.rootView;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.RechargeFragment
 * JD-Core Version:    0.6.0
 */