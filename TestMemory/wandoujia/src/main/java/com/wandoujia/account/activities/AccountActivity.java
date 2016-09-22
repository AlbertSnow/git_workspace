package com.wandoujia.account.activities;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ac;
import android.support.v4.app.b;
import android.support.v4.app.q;
import android.view.KeyEvent;
import android.view.Menu;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.R.id;
import com.wandoujia.account.R.layout;
import com.wandoujia.account.constants.AccountParamConstants.FinishType;
import com.wandoujia.account.fragment.AccountFragment;
import com.wandoujia.account.fragment.AccountLoginFragment;
import com.wandoujia.account.fragment.AccountRegisterFragment;
import com.wandoujia.account.fragment.c;
import com.wandoujia.account.fragment.f;

public class AccountActivity extends FragmentActivity
  implements c, f
{
  public final void a(Context paramContext, AccountParamConstants.FinishType paramFinishType, AccountParams paramAccountParams)
  {
    finish();
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    b.a(this, paramInt1, paramInt2, paramIntent);
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    Fragment localFragment;
    if (this != null)
    {
      int i = R.layout.account_sdk_main_activity;
      if (this != null)
      {
        if (i != 0)
          setContentView(i);
        localFragment = getSupportFragmentManager().a(R.id.account_fragment_layout);
        if ((localFragment == null) || (!(localFragment instanceof AccountLoginFragment)))
          break label86;
        AccountLoginFragment localAccountLoginFragment = AccountLoginFragment.a(localFragment.getArguments());
        ac localac2 = getSupportFragmentManager().a();
        localac2.b(R.id.account_fragment_layout, localAccountLoginFragment, "login");
        localac2.b();
      }
    }
    label86: 
    do
      return;
    while ((localFragment == null) || (!(localFragment instanceof AccountRegisterFragment)));
    AccountRegisterFragment localAccountRegisterFragment = AccountRegisterFragment.a(localFragment.getArguments());
    ac localac1 = getSupportFragmentManager().a();
    localac1.b(R.id.account_fragment_layout, localAccountRegisterFragment, "register");
    localac1.b();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.account_sdk_main_activity);
    ac localac = getSupportFragmentManager().a();
    AccountFragment localAccountFragment = new AccountFragment();
    AccountParams localAccountParams = (AccountParams)getIntent().getParcelableExtra("account.intent.extra.ACCOUNT_PARAMS");
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("account.intent.extra.ACCOUNT_PARAMS", localAccountParams);
    localBundle.putString("account.intent.extra.ACCOUNT_MANAGER_KEY", getIntent().getStringExtra("account.intent.extra.ACCOUNT_MANAGER_KEY"));
    localAccountFragment.setArguments(localBundle);
    localac.b(R.id.account_fragment_layout, localAccountFragment, "accountContainer");
    localac.a();
  }

  public void onDestroy()
  {
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (b.a(this, paramInt, paramKeyEvent))
      return true;
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.activities.AccountActivity
 * JD-Core Version:    0.6.0
 */