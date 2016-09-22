package com.wandoujia.p4.account.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.b;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.wandoujia.account.dto.WandouResponse;

public class AccountBindActivity extends AccountBaseActivity
{
  private Button c;
  private TextView d;
  private EditText e;
  private EditText f;
  private String g;
  private String h;
  private String i;
  private boolean j = false;
  private boolean k = false;
  private String l;
  private com.wandoujia.account.widget.a m;
  private final View.OnClickListener n = new e(this);

  private void b(String paramString)
  {
    com.wandoujia.account.h.a.a(this, paramString, getString(2131623972), new d()).show();
  }

  final void a()
  {
    if ((this.g.equals("tel")) && (this.k))
    {
      this.k = false;
      com.wandoujia.account.a.c(true);
      com.wandoujia.account.a.h(this.h);
      setResult(100);
      finish();
      return;
    }
    if (this.g.equals("tel"))
    {
      this.k = true;
      com.wandoujia.account.a.n(this.e.getText().toString());
    }
    while (true)
    {
      runOnUiThread(new f(this));
      return;
      com.wandoujia.account.a.o(this.e.getText().toString());
    }
  }

  final void a(WandouResponse paramWandouResponse)
  {
    a(getString(2131623972), paramWandouResponse);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.g = getIntent().getStringExtra("phoenix.intent.extra_ACCOUNT_BIND_TYPE");
    this.l = getIntent().getStringExtra("phoenix.intent.extra.TITLE");
    setContentView(2130903041);
    String str;
    if (!TextUtils.isEmpty(this.l))
    {
      setTitle(this.l);
      this.c = ((Button)findViewById(2131493091));
      this.d = ((TextView)findViewById(2131493088));
      this.e = ((EditText)findViewById(2131493089));
      this.f = ((EditText)findViewById(2131493090));
      str = getIntent().getStringExtra("phoenix.intent.extra.HINT");
      if (!this.g.equals("email"))
        break label267;
      this.e.setHint(2131623992);
      TextView localTextView2 = this.d;
      if (str == null)
        str = getString(2131623971);
      localTextView2.setText(str);
      this.j = false;
    }
    while (true)
    {
      if ((b.B()) && (!com.wandoujia.account.a.o()))
        this.f.setVisibility(0);
      this.c.setOnClickListener(this.n);
      return;
      if (this.g.equals("email"))
      {
        this.l = getString(2131623970);
        setTitle(this.l);
        break;
      }
      if (!this.g.equals("tel"))
        break;
      this.l = getString(2131623973);
      setTitle(this.l);
      break;
      label267: if (!this.g.equals("tel"))
        continue;
      this.e.setHint(2131624153);
      TextView localTextView1 = this.d;
      if (str == null)
        str = getString(2131623974);
      localTextView1.setText(str);
      this.e.setRawInputType(2);
      this.j = true;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.activity.AccountBindActivity
 * JD-Core Version:    0.6.0
 */