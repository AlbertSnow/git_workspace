package com.wandoujia.p4.pay.fragment;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.p4.pay.PayImpl;
import com.wandoujia.p4.pay.model.PayCallBack;
import com.wandoujia.p4.pay.model.PayMethod;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.storage.LocalStorage;

public class PayFragment extends Fragment
{
  private static final String INPUT_ITEM = "手动输入";
  private static final int POLLING_COUNT = 5;
  private static final String TAG = PayFragment.class.getSimpleName();
  private static boolean loopbreak = false;
  private TextView amountLabelText;
  private EditText balancePayPasswordInput;
  private TextView balanceValueText;
  private TextView bonusValueText;
  private WandouOrder currentOrder;
  private TextView forgotPassword;
  private LocalStorage localStorage;
  private ArrayAdapter<String> moneyListAdapter;
  private TextView needRechargeValueText;
  private String orderDesc;
  private Long orderPriceInFen;
  private View otherPaymentsPanel;
  private Button payButton;
  private PayImpl payImpl;
  private TextView payWandouCoinText;
  private PayFragment.PaymentCallback paymentCallback = new PayFragment.PaymentCallback(this);
  private ProgressDialog progressDialog;
  private TextView promptText;
  private TextView purchaseItemName;
  private TextView purchaseItemPrice;
  private TextView purchaseItemSupplement;
  private Spinner rechargeAmountSelector;
  private Spinner rechargeChannelSelector;
  private String[] rechargeMoneyList;
  private View rootView;
  private PayFragment.ShenzhouLooperCallBack shenzhouCallback = new PayFragment.ShenzhouLooperCallBack(this);
  private TextView shenzhouCardNumber;
  private View shenzhouInput;
  private TextView shenzhouPassword;
  private TextView wdbCountInput;

  private void bindInfo()
  {
    this.purchaseItemName.setText(this.currentOrder.getName());
    this.purchaseItemPrice.setText(this.currentOrder.getShowMoney());
    this.purchaseItemSupplement.setText(2131624316);
    this.payButton.setText(2131625255);
    this.payButton.setOnClickListener(new PayFragment.3(this));
    setUpOtherPaymentPanel();
  }

  private void confirmDialog(String paramString1, String paramString2, String paramString3, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(getActivity());
    localBuilder.setMessage(paramString3).setTitle(paramString2);
    localBuilder.setPositiveButton("确定", new PayFragment.11(this, paramString1, paramOnClickListener));
    localBuilder.setNegativeButton("取消", new PayFragment.12(this, paramString1));
    localBuilder.create().show();
  }

  private void confirmMoneyNotEnough(DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(getActivity());
    localBuilder.setMessage(getString(2131624558)).setTitle(getString(2131624555));
    localBuilder.setPositiveButton(2131624557, new PayFragment.13(this, paramOnClickListener));
    localBuilder.setNegativeButton(2131624556, new PayFragment.14(this));
    localBuilder.create().show();
  }

  private void dismissProgress()
  {
    if ((this.progressDialog != null) && (this.progressDialog.isShowing()))
      this.progressDialog.dismiss();
  }

  public static PayFragment newInstance(Bundle paramBundle)
  {
    PayFragment localPayFragment = new PayFragment();
    localPayFragment.setArguments(paramBundle);
    return localPayFragment;
  }

  private void queryResultMessage()
  {
    this.payImpl.queryOrderResult(PayImpl.resultUrl, new PayFragment.10(this));
  }

  private void setUpOtherPaymentPanel()
  {
    this.forgotPassword.setOnClickListener(new PayFragment.4(this));
    if (this.localStorage.getBalance().longValue() == 0L)
    {
      this.rootView.findViewById(2131494054).setVisibility(8);
      this.balanceValueText.setVisibility(8);
    }
    if (this.localStorage.getBonusMoney().longValue() == 0L)
    {
      this.rootView.findViewById(2131494052).setVisibility(8);
      this.bonusValueText.setVisibility(8);
    }
    if (!this.payImpl.needRecharge())
    {
      this.rootView.findViewById(2131494056).setVisibility(8);
      this.rootView.findViewById(2131494057).setVisibility(8);
      this.localStorage.setCurPayMethod("BALANCEPAY");
      showSoftKeyboard(this.balancePayPasswordInput);
      if (this.localStorage.getBonusMoney().longValue() >= this.localStorage.getOrder().getMoneyInFen().longValue())
      {
        this.bonusValueText.setText(this.payImpl.showMoney(this.localStorage.getOrder().getMoneyInFen().longValue()));
        this.balanceValueText.setText("0");
        this.bonusValueText.setText(this.payImpl.showMoney(0L - this.localStorage.getOrder().getMoneyInFen().longValue()));
        this.purchaseItemSupplement.setVisibility(8);
        this.purchaseItemPrice.setText(this.payImpl.showMoney(this.localStorage.getOrder().getMoneyInFen().longValue()));
        return;
      }
      if (this.localStorage.getBonusMoney().longValue() != 0L)
      {
        this.purchaseItemSupplement.setVisibility(8);
        this.purchaseItemPrice.setText(this.payImpl.showMoney(this.localStorage.getOrder().getMoneyInFen().longValue()));
        this.bonusValueText.setText(this.payImpl.showMoney(0L - this.localStorage.getBonusMoney().longValue()));
        this.balanceValueText.setText(this.payImpl.showMoney(this.localStorage.getOrder().getMoneyInFen().longValue() - this.localStorage.getBonusMoney().longValue()));
        return;
      }
      this.rootView.findViewById(2131494054).setVisibility(8);
      this.balanceValueText.setVisibility(8);
      this.rootView.findViewById(2131494054).setVisibility(8);
      this.balanceValueText.setVisibility(8);
      return;
    }
    ((TextView)this.rootView.findViewById(2131494054)).setText("账户余额");
    this.balanceValueText.setTextSize(13.0F);
    this.balanceValueText.setTextColor(getActivity().getResources().getColor(2131362201));
    this.balanceValueText.setText(this.payImpl.showMoney(0L - this.localStorage.getBalance().longValue()));
    this.bonusValueText.setText(this.payImpl.showMoney(0L - this.localStorage.getBonusMoney().longValue()));
    this.balancePayPasswordInput.setVisibility(8);
    this.forgotPassword.setVisibility(8);
    this.otherPaymentsPanel.setVisibility(0);
    this.purchaseItemSupplement.setVisibility(8);
    this.payButton.setText(2131625307);
    this.payButton.setEnabled(true);
    if ((this.localStorage.getBonusMoney().longValue() == 0L) && (this.localStorage.getBalance().longValue() == 0L))
    {
      this.rootView.findViewById(2131494056).setVisibility(8);
      this.needRechargeValueText.setVisibility(8);
    }
    String[] arrayOfString;
    while (true)
    {
      arrayOfString = this.localStorage.getPayMethodList().split(",");
      if (!TextUtils.isEmpty(this.localStorage.getPayMethodList()))
        break label814;
      if (getActivity() == null)
        break;
      p.a(getActivity(), "网络请求失败，请重试。", p.b).a();
      getActivity().finish();
      return;
      this.purchaseItemPrice.setTextColor(getActivity().getResources().getColor(2131362201));
      ((TextView)this.rootView.findViewById(2131494048)).setTextColor(getActivity().getResources().getColor(2131362201));
      this.needRechargeValueText.setText(this.payImpl.showMoney(this.localStorage.getOrder().getMoneyInFen().longValue() - this.localStorage.getBalance().longValue() - this.localStorage.getBonusMoney().longValue()));
    }
    label814: for (int i = 0; i < arrayOfString.length; i++)
      arrayOfString[i] = PayMethod.getByName(arrayOfString[i]).title();
    ArrayAdapter localArrayAdapter = new ArrayAdapter(getActivity(), 2130903608, arrayOfString);
    localArrayAdapter.setDropDownViewResource(17367049);
    this.rechargeChannelSelector.setAdapter(localArrayAdapter);
    this.rechargeChannelSelector.setOnItemSelectedListener(new PayFragment.5(this, arrayOfString));
    this.rechargeChannelSelector.setSelection(0);
    this.payImpl.getPromptText("sdk-charge", new PayFragment.6(this), new PayFragment.7(this));
  }

  private void startSheznouLoop(WandouOrder paramWandouOrder, PayCallBack paramPayCallBack)
  {
    loopbreak = false;
    new Thread(new PayFragment.9(this, paramWandouOrder, paramPayCallBack)).start();
  }

  private void toast(String paramString)
  {
    new Handler(getActivity().getMainLooper()).post(new PayFragment.8(this, paramString));
  }

  public PayCallBack getPayCallback()
  {
    return this.paymentCallback;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getArguments() != null)
      this.orderDesc = getArguments().getString("order_desc");
    try
    {
      this.orderPriceInFen = Long.valueOf(Long.parseLong(getArguments().getString("order_price")));
      String str1 = getArguments().getString("appkey");
      String str2 = getArguments().getString("seckey");
      LocalStorage.init(getActivity(), str1, str2);
      this.localStorage = LocalStorage.getCurrentConfig();
      this.payImpl = PayImpl.getInstance(getActivity(), this.localStorage.getAppId());
      this.currentOrder = this.localStorage.getOrder();
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
        new StringBuilder("Order price is invalid, ").append(localNumberFormatException.toString());
    }
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.rootView = paramLayoutInflater.inflate(2130903602, paramViewGroup, false);
    this.progressDialog = new ProgressDialog(getActivity());
    this.purchaseItemName = ((TextView)this.rootView.findViewById(2131494047));
    this.purchaseItemPrice = ((TextView)this.rootView.findViewById(2131494049));
    this.purchaseItemSupplement = ((TextView)this.rootView.findViewById(2131494050));
    this.otherPaymentsPanel = this.rootView.findViewById(2131494058);
    this.rechargeChannelSelector = ((Spinner)this.rootView.findViewById(2131494097));
    this.rechargeAmountSelector = ((Spinner)this.rootView.findViewById(2131494099));
    this.otherPaymentsPanel.setVisibility(8);
    this.balanceValueText = ((TextView)this.rootView.findViewById(2131494055));
    this.bonusValueText = ((TextView)this.rootView.findViewById(2131494053));
    this.promptText = ((TextView)this.rootView.findViewById(2131494101));
    this.amountLabelText = ((TextView)this.rootView.findViewById(2131494098));
    this.needRechargeValueText = ((TextView)this.rootView.findViewById(2131494057));
    this.wdbCountInput = ((TextView)this.rootView.findViewById(2131494100));
    this.forgotPassword = ((TextView)this.rootView.findViewById(2131494059));
    this.payWandouCoinText = ((TextView)this.rootView.findViewById(2131494048));
    this.payButton = ((Button)this.rootView.findViewById(2131494061));
    this.payButton.setEnabled(false);
    this.shenzhouInput = this.rootView.findViewById(2131494102);
    this.shenzhouCardNumber = ((TextView)this.rootView.findViewById(2131494103));
    this.shenzhouPassword = ((TextView)this.rootView.findViewById(2131494104));
    this.balancePayPasswordInput = ((EditText)this.rootView.findViewById(2131494060));
    this.balancePayPasswordInput.addTextChangedListener(new PayFragment.1(this));
    bindInfo();
    this.rootView.findViewById(2131494062).setOnClickListener(new PayFragment.2(this));
    return this.rootView;
  }

  public void showSoftKeyboard(View paramView)
  {
    if ((paramView.isShown()) || (paramView.requestFocus()))
    {
      FragmentActivity localFragmentActivity = getActivity();
      getActivity();
      ((InputMethodManager)localFragmentActivity.getSystemService("input_method")).showSoftInput(paramView, 1);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.PayFragment
 * JD-Core Version:    0.6.0
 */