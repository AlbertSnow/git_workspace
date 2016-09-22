package com.wandoujia.p4.account.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import com.wandoujia.account.f.b;
import com.wandoujia.account.fragment.AccountBaseFragment;
import com.wandoujia.account.fragment.AccountVerificationFragmentContainer;
import com.wandoujia.jupiter.activity.BaseToolBarActivity;

public class AccountVerificationActivity extends BaseToolBarActivity
  implements com.wandoujia.account.fragment.d
{
  public final void a()
  {
    setResult(-1);
    finish();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903155);
    setTitle(getIntent().getStringExtra("account.intent.extra.ACCOUNT_VERIFICATION_TITLE"));
    Bundle localBundle = new Bundle();
    localBundle.putString("account.intent.extra.ACCOUNT_VERIFICATION_TITLE", getIntent().getStringExtra("account.intent.extra.ACCOUNT_VERIFICATION_TITLE"));
    localBundle.putSerializable("account.intent.extra.ACCOUNT_VERIFICATION_GROUPS", (Object[])getIntent().getSerializableExtra("account.intent.extra.ACCOUNT_VERIFICATION_GROUPS"));
    AccountVerificationFragmentContainer localAccountVerificationFragmentContainer = new AccountVerificationFragmentContainer();
    localBundle.putString("account.intent.extra.ACCOUNT_MANAGER_KEY", com.wandoujia.p4.account.manager.d.a().d().f());
    AccountBaseFragment.a(com.wandoujia.p4.account.manager.d.a().d());
    localAccountVerificationFragmentContainer.setArguments(localBundle);
    getSupportFragmentManager().a().b(2131493345, localAccountVerificationFragmentContainer).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.activity.AccountVerificationActivity
 * JD-Core Version:    0.6.0
 */