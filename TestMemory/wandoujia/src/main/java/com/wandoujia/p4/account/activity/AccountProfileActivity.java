package com.wandoujia.p4.account.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import com.wandoujia.p4.account.fragment.AccountProfileFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;

public class AccountProfileActivity extends BaseActivity
{
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    AccountProfileFragment localAccountProfileFragment = new AccountProfileFragment();
    getSupportFragmentManager().a().b(16908290, localAccountProfileFragment).a();
    i.k().h().a(this, "wdj://me/profile").a(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.activity.AccountProfileActivity
 * JD-Core Version:    0.6.0
 */