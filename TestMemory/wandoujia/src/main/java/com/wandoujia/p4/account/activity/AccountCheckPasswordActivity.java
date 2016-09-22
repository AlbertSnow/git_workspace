package com.wandoujia.p4.account.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import com.wandoujia.account.dto.WandouResponse;

public class AccountCheckPasswordActivity extends AccountBaseActivity
{
  private Button c;
  private EditText d;
  private String e;
  private String f;

  final void a()
  {
    Intent localIntent = new Intent(this, AccountChangeActivity.class);
    localIntent.putExtra("phoenix.intent.extra_ACCOUNT_BIND_TYPE", this.e);
    localIntent.putExtra("phoenix.intent.extra.ACCOUNT_PASSWORD", this.f);
    startActivity(localIntent);
    finish();
  }

  final void a(WandouResponse paramWandouResponse)
  {
    a(getString(2131624164), paramWandouResponse);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903045);
    this.e = getIntent().getStringExtra("phoenix.intent.extra_ACCOUNT_BIND_TYPE");
    if ("email".equals(this.e))
      setTitle(2131623976);
    while (true)
    {
      this.c = ((Button)findViewById(2131493091));
      this.d = ((EditText)findViewById(2131493090));
      this.c.setOnClickListener(new y(this));
      return;
      setTitle(2131623984);
      this.e = "tel";
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.activity.AccountCheckPasswordActivity
 * JD-Core Version:    0.6.0
 */