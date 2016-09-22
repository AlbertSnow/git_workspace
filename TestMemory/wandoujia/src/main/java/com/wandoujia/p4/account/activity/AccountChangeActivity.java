package com.wandoujia.p4.account.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wandoujia.account.dto.AccountError;
import com.wandoujia.account.dto.AccountVerificationGroup;
import com.wandoujia.account.dto.WandouResponse;
import com.wandoujia.p4.account.manager.d;

public class AccountChangeActivity extends AccountBaseActivity
{
  private String c;
  private Button d;
  private LinearLayout e;
  private TextView f;
  private TextView g;
  private TextView h;
  private EditText i;
  private String j;

  private void b()
  {
    if ("email".equals(this.c))
      if (com.wandoujia.account.a.n())
      {
        this.j = getString(2131623976);
        setTitle(this.j);
        this.d = ((Button)findViewById(2131493091));
        this.f = ((TextView)findViewById(2131493094));
        this.e = ((LinearLayout)findViewById(2131493093));
        this.g = ((TextView)findViewById(2131493095));
        this.i = ((EditText)findViewById(2131493096));
        this.h = ((TextView)findViewById(2131493092));
        if (!this.c.equals("email"))
          break label276;
        if (!com.wandoujia.account.a.n())
          break label255;
        this.e.setVisibility(0);
        this.f.setText(2131623989);
        this.g.setText(com.wandoujia.account.a.q());
        this.h.setText(2131623978);
        label168: this.i.setHint(2131623998);
        this.i.setRawInputType(32);
      }
    label255: 
    do
    {
      this.d.setOnClickListener(new k(this));
      return;
      this.j = getString(2131623970);
      break;
      if (com.wandoujia.account.a.p());
      for (this.j = getString(2131623984); ; this.j = getString(2131623973))
      {
        setTitle(this.j);
        break;
      }
      this.e.setVisibility(8);
      this.h.setText(2131623971);
      break label168;
    }
    while (!this.c.equals("tel"));
    label276: if (com.wandoujia.account.a.p())
    {
      this.e.setVisibility(0);
      this.f.setText(2131623990);
      this.g.setText(com.wandoujia.account.a.r());
      this.h.setText(2131623986);
    }
    while (true)
    {
      this.i.setHint(2131623999);
      this.i.setRawInputType(2);
      break;
      this.e.setVisibility(8);
      this.h.setText(2131623974);
    }
  }

  private boolean d()
  {
    String str = this.i.getText().toString();
    if (this.c.equals("email"))
      switch (q.a[android.support.v4.app.b.s(str).ordinal()])
      {
      default:
      case 1:
      case 2:
      case 3:
      }
    do
    {
      return false;
      com.wandoujia.account.h.a.a(this, getString(2131623993), getString(2131623977), new l()).show();
      return false;
      com.wandoujia.account.h.a.a(this, getString(2131623994), getString(2131623977), new m()).show();
      return false;
      return true;
    }
    while (!this.c.equals("tel"));
    switch (q.a[android.support.v4.app.b.t(str).ordinal()])
    {
    default:
      return false;
    case 3:
      return true;
    case 4:
      com.wandoujia.account.h.a.a(this, getString(2131625491), getString(2131623985), new n()).show();
      return false;
    case 5:
    }
    com.wandoujia.account.h.a.a(this, getString(2131625492), getString(2131623985), new o()).show();
    return false;
  }

  final void a()
  {
    setResult(100);
    finish();
  }

  final void a(WandouResponse paramWandouResponse)
  {
    int k = 1;
    d.a();
    int n;
    if (paramWandouResponse != null)
    {
      int m = paramWandouResponse.getError();
      AccountVerificationGroup[] arrayOfAccountVerificationGroup = paramWandouResponse.getVerificationGroups();
      if ((m == AccountError.NEED_VERIFY_ACCOUNT.getError()) && (arrayOfAccountVerificationGroup != null) && (arrayOfAccountVerificationGroup.length > 0))
      {
        n = k;
        if (n == 0)
          break label150;
      }
    }
    while (true)
    {
      if (k == 0)
        break label155;
      b();
      if (d())
      {
        Intent localIntent2 = new Intent(this, AccountVerificationActivity.class);
        localIntent2.putExtra("account.intent.extra.ACCOUNT_VERIFICATION_TITLE", this.j);
        localIntent2.putExtra("account.intent.extra.ACCOUNT_VERIFICATION_GROUPS", paramWandouResponse.getVerificationGroups());
        p localp = new p(this);
        if (!(this instanceof Activity))
          localIntent2.setFlags(268435456);
        com.wandoujia.account.fragment.AccountVerificationFragmentContainer.a = localp;
        startActivity(localIntent2);
      }
      return;
      n = 0;
      break;
      label150: k = 0;
    }
    label155: if ((paramWandouResponse.getError() == AccountError.PASSWORD_NEED_RESET.getError()) && (paramWandouResponse.getArgs() != null))
    {
      Intent localIntent1 = new Intent(this, AccountChangePasswordActivity.class);
      localIntent1.putExtra("phoenix.intent.extra.ACCOUNT_PASSCODE", paramWandouResponse.getArgs());
      startActivityForResult(localIntent1, 20);
      return;
    }
    a(getString(2131623980), paramWandouResponse);
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 20)
    {
      setResult(100);
      finish();
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getIntent() != null)
      this.c = getIntent().getStringExtra("phoenix.intent.extra_ACCOUNT_BIND_TYPE");
    setContentView(2130903042);
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.activity.AccountChangeActivity
 * JD-Core Version:    0.6.0
 */