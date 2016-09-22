package com.wandoujia.p4.account.view;

import android.content.Context;
import android.content.IntentFilter;
import android.support.v4.app.b;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.AccountParams.Page;
import com.wandoujia.account.a;
import com.wandoujia.p4.account.manager.AccountUtil;
import com.wandoujia.p4.views.CircleAsyncImageView;
import com.wandoujia.ripple_framework.view.e;

public class AccountBasicInfoView extends LinearLayout
  implements View.OnClickListener
{
  private TextView a;
  private TextView b;
  private CircleAsyncImageView c;
  private AccountBasicInfoView.AccountChangeReceiver d;

  public AccountBasicInfoView(Context paramContext)
  {
    super(paramContext);
  }

  public AccountBasicInfoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private void a()
  {
    if (this.a == null)
      return;
    this.a.setText(a.l());
    String str1 = a.c();
    if (!b.r(str1))
      this.b.setVisibility(8);
    while (true)
    {
      String str2 = a.k();
      new e();
      e.a(this.c, str2, 2130838110);
      return;
      this.b.setText(str1);
    }
  }

  private void b()
  {
    if (this.a == null)
      return;
    if (!a.w())
      this.a.setText(getContext().getString(2131624002));
    while (true)
    {
      this.c.setStaticImageResource(2130838110);
      return;
      this.a.setText(getContext().getString(2131623995));
    }
  }

  protected void onAttachedToWindow()
  {
    if (this.d == null)
    {
      this.d = new AccountBasicInfoView.AccountChangeReceiver(this);
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("pheonix.intent.action.LOGIN_SUCCESS");
      localIntentFilter.addAction("pheonix.intent.action.REGISTER_SUCCESS");
      localIntentFilter.addAction("pheonix.intent.action.LOGOUT_SUCCESS");
      localIntentFilter.addAction("account.intent.action.MODIFY_SUCCESS");
      getContext().registerReceiver(this.d, localIntentFilter);
    }
    if (TextUtils.isEmpty(a.i()))
      b();
    while (true)
    {
      super.onAttachedToWindow();
      return;
      a();
    }
  }

  public void onClick(View paramView)
  {
    AccountParams localAccountParams;
    if (TextUtils.isEmpty(a.i()))
    {
      localAccountParams = new AccountParams("mythings", 0);
      if (a.w())
        break label51;
      localAccountParams.a(AccountParams.Page.TEL_REGISTER);
    }
    while (true)
    {
      localAccountParams.n();
      localAccountParams.a(true);
      AccountUtil.a(getContext(), localAccountParams);
      return;
      label51: localAccountParams.a(AccountParams.Page.LOG_IN);
    }
  }

  protected void onDetachedFromWindow()
  {
    if (this.d != null)
    {
      getContext().unregisterReceiver(this.d);
      this.d = null;
    }
    super.onDetachedFromWindow();
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(2131493085));
    this.b = ((TextView)findViewById(2131493086));
    this.c = ((CircleAsyncImageView)findViewById(2131493084));
    setOnClickListener(this);
  }

  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.a.setEnabled(paramBoolean);
    this.b.setEnabled(paramBoolean);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.view.AccountBasicInfoView
 * JD-Core Version:    0.6.0
 */