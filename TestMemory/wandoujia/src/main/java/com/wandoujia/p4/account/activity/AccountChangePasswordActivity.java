package com.wandoujia.p4.account.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import com.wandoujia.account.dto.WandouResponse;
import java.util.Timer;
import java.util.TimerTask;

public class AccountChangePasswordActivity extends AccountBaseActivity
{
  protected Handler c = new Handler();
  private EditText d;
  private EditText e;
  private Button f;
  private Timer g;
  private TimerTask h;
  private String i;
  private final TextWatcher j = new r(this);

  final void a()
  {
    if (this != null)
      finish();
  }

  final void a(WandouResponse paramWandouResponse)
  {
    a(getString(2131623982), paramWandouResponse);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903043);
    setTitle(2131623981);
    this.d = ((EditText)findViewById(2131493097));
    this.e = ((EditText)findViewById(2131493098));
    this.f = ((Button)findViewById(2131493091));
    this.i = getIntent().getStringExtra("phoenix.intent.extra.ACCOUNT_PASSCODE");
    this.e.addTextChangedListener(this.j);
    if (this.i == null)
      this.d.setVisibility(0);
    while (true)
    {
      this.f.setOnClickListener(new t(this));
      this.c = new x(this);
      return;
      this.d.setVisibility(8);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.activity.AccountChangePasswordActivity
 * JD-Core Version:    0.6.0
 */