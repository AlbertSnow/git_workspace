package com.wandoujia.p4.account.activity;

import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import com.wandoujia.account.a;
import com.wandoujia.account.fragment.AccountModifyProfileFragment;
import com.wandoujia.jupiter.activity.BaseToolBarActivity;
import com.wandoujia.p4.account.manager.d;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;

public class AccountModifyProfileActivity extends BaseToolBarActivity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903136);
    setTitle(getString(2131623997));
    a.e(false);
    AccountModifyProfileFragment localAccountModifyProfileFragment = AccountModifyProfileFragment.b(d.a().d());
    ac localac = getSupportFragmentManager().a();
    localac.a(2131493344, localAccountModifyProfileFragment);
    localac.b();
    i.k().h().a(this, "wdj://account/settings").a(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.activity.AccountModifyProfileActivity
 * JD-Core Version:    0.6.0
 */