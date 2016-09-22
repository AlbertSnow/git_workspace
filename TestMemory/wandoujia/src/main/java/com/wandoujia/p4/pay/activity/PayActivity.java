package com.wandoujia.p4.pay.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.view.KeyEvent;
import com.wandoujia.p4.pay.PayImpl;
import com.wandoujia.p4.pay.callback.CallbackWrapper;
import com.wandoujia.p4.pay.callback.CallbackWrapper.Status;
import com.wandoujia.p4.pay.callback.CallbackWrapper.Type;
import com.wandoujia.p4.pay.fragment.PayFragment;
import com.wandoujia.p4.pay.fragment.QuitDialogFragment;
import com.wandoujia.p4.pay.model.PayCallBack;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.paymethod.Alipay;
import com.wandoujia.p4.pay.paymethod.UnionPay;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.p4.pay.utils.ProgressDialogUtil;

public class PayActivity extends FragmentActivity
{
  public static final int REQUEST_ALIPAY = 100;
  public static final int REQUEST_UNIONPAY = 200;
  private static final String TAG = PayActivity.class.getSimpleName();
  private FragmentActivity activity;
  private LocalStorage localStorage;
  private PayFragment payFragment;

  private void createOrder()
  {
    PayImpl.setFinishStatus(CallbackWrapper.Status.CANCEL);
    ProgressDialogUtil.show(this.activity, null, this.activity.getString(2131625725));
    Bundle localBundle = this.activity.getIntent().getExtras();
    if (localBundle != null);
    try
    {
      WandouOrder localWandouOrder = new WandouOrder(localBundle.getString("order_desc"), localBundle.getString("order_desc"), Long.valueOf(Long.parseLong(localBundle.getString("order_price"))));
      localWandouOrder.setOut_trade_no(localBundle.getString("order_outtrade_no"));
      PayImpl localPayImpl = PayImpl.getInstance(this.activity, this.localStorage.getAppId());
      localPayImpl.createOrder(localWandouOrder, new PayActivity.2(this, localPayImpl), new PayActivity.3(this));
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      new StringBuilder("Order price is invalid, ").append(localNumberFormatException.toString());
      ProgressDialogUtil.dismiss();
      String str = this.localStorage.getOrder().toJSONString();
      CallbackWrapper.invoke(this.activity, -1, CallbackWrapper.Type.PAY, CallbackWrapper.Status.FAIL, CallbackWrapper.Status.FAIL.name() + str, str);
    }
  }

  private void exitDialog()
  {
    QuitDialogFragment.showQuitDialog(this.activity, "支付尚未完成", "确认退出支付？", new PayActivity.1(this));
  }

  private void failToPay()
  {
    ProgressDialogUtil.dismiss();
    String str = this.localStorage.getOrder().toJSONString();
    CallbackWrapper.invoke(this.activity, -1, CallbackWrapper.Type.PAY, CallbackWrapper.Status.FAIL, CallbackWrapper.Status.FAIL.name() + str, str);
  }

  private PayCallBack getPayCallback()
  {
    if (this.payFragment != null)
      return this.payFragment.getPayCallback();
    return null;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 100)
      new Alipay().onResult(paramIntent, getPayCallback());
    do
      return;
    while (paramInt1 != 200);
    new UnionPay().onResult(paramIntent, getPayCallback());
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.localStorage = LocalStorage.getCurrentConfig();
    this.activity.setContentView(2130903156);
    this.activity = this;
    if (this.activity.getIntent() != null)
      createOrder();
  }

  public void onDestroy()
  {
    super.onDestroy();
    ProgressDialogUtil.dismiss();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() != 0) || (4 != paramKeyEvent.getKeyCode()) || (this.activity.getSupportFragmentManager().e() > 0));
    do
      return false;
    while (this.localStorage.getFinish());
    exitDialog();
    return true;
  }

  void showPaymentFragment()
  {
    if ((this.activity == null) || (this.activity.isFinishing()))
      return;
    Bundle localBundle = this.activity.getIntent().getExtras();
    localBundle.putString("appkey", this.localStorage.getAppId());
    localBundle.putString("seckey", this.localStorage.getSecretKey());
    this.payFragment = PayFragment.newInstance(localBundle);
    this.activity.getSupportFragmentManager().a().b(2131493404, this.payFragment).b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.activity.PayActivity
 * JD-Core Version:    0.6.0
 */