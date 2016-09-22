package com.wandoujia.p4.pay.activity;

import android.app.NotificationManager;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import com.wandoujia.p4.pay.fragment.MyBonusFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;

public class MyBonusActivity extends BaseActivity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ((NotificationManager)getSystemService("notification")).cancel(2014092523);
    setContentView(2130903213);
    MyBonusFragment localMyBonusFragment = new MyBonusFragment();
    getSupportFragmentManager().a().b(2131493502, localMyBonusFragment).a();
    i.k().h().a(this, "wdj://me/bonus").a(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.activity.MyBonusActivity
 * JD-Core Version:    0.6.0
 */