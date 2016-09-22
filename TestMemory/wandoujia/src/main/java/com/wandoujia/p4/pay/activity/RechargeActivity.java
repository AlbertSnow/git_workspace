package com.wandoujia.p4.pay.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.view.KeyEvent;
import com.wandoujia.p4.pay.PayImpl;
import com.wandoujia.p4.pay.callback.CallbackWrapper.Status;
import com.wandoujia.p4.pay.fragment.QuitDialogFragment;
import com.wandoujia.p4.pay.fragment.RechargeFragment;
import com.wandoujia.p4.pay.model.PayCallBack;
import com.wandoujia.p4.pay.model.User;
import com.wandoujia.p4.pay.paymethod.Alipay;
import com.wandoujia.p4.pay.paymethod.UnionPay;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.p4.pay.utils.ProgressDialogUtil;

public class RechargeActivity extends FragmentActivity
{
  public static final int REQUEST_ALIPAY = 100;
  public static final int REQUEST_UNIONPAY = 200;
  private static final String TAG = RechargeActivity.class.getSimpleName();
  private FragmentActivity activity;
  private boolean hasDestoryed = false;
  private LocalStorage localStorage;
  private RechargeFragment rechargeFragment;

  private void exitDialog()
  {
    QuitDialogFragment.showQuitDialog(this, "充值尚未完成", "确认退出充值？", new RechargeActivity.1(this));
  }

  private PayCallBack getPayCallback()
  {
    if (this.rechargeFragment != null)
      return this.rechargeFragment.getPayCallback();
    return null;
  }

  public static void launch(Context paramContext)
  {
    Intent localIntent = new Intent(paramContext, RechargeActivity.class);
    localIntent.putExtra("appId", "100000225");
    paramContext.startActivity(localIntent);
  }

  private void listPayMethods()
  {
    ProgressDialogUtil.show(this.activity, null, this.activity.getString(2131625725));
    Bundle localBundle = this.activity.getIntent().getExtras();
    if (localBundle != null)
    {
      String str = localBundle.getString("appId");
      this.localStorage = LocalStorage.getInstance(this.activity, str);
      PayImpl localPayImpl = PayImpl.getInstance(this.activity, str);
      PayImpl.setFinishStatus(CallbackWrapper.Status.CANCEL);
      User localUser = this.localStorage.getUser();
      if (localUser != null)
        localPayImpl.listRechargeMethods(str, localUser.getUid(), this.localStorage.getAuth(), new RechargeActivity.2(this));
    }
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
    this.hasDestoryed = false;
    this.localStorage = LocalStorage.getCurrentConfig();
    setContentView(2130903156);
    this.activity = this;
    if (getIntent() != null)
      listPayMethods();
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.hasDestoryed = true;
    ProgressDialogUtil.dismiss();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 0) && (4 == paramKeyEvent.getKeyCode()) && (!this.localStorage.getFinish()))
    {
      exitDialog();
      return true;
    }
    return false;
  }

  void showRechargeFragment()
  {
    if (this.hasDestoryed)
      return;
    this.rechargeFragment = RechargeFragment.newInstance(this.activity.getIntent().getExtras());
    this.activity.getSupportFragmentManager().a().b(2131493404, this.rechargeFragment).b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.activity.RechargeActivity
 * JD-Core Version:    0.6.0
 */