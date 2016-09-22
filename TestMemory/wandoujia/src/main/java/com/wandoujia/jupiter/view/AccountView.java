package com.wandoujia.jupiter.view;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wandoujia.p4.pay.httpapi.GetPayParamsDelegate;
import com.wandoujia.p4.views.CircleAsyncImageView;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.view.e;

public class AccountView extends LinearLayout
{
  private final h a = new a(this);
  private AccountView.AccountChangeReceiver b;
  private CircleAsyncImageView c;
  private TextView d;
  private TextView e;

  public AccountView(Context paramContext)
  {
    super(paramContext);
  }

  public AccountView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private void a()
  {
    this.d.setTextColor(getResources().getColor(2131361989));
    this.d.setText(2131625025);
    this.d.setTextSize(1, 13.0F);
    this.e.setVisibility(8);
  }

  private void b()
  {
    String str = com.wandoujia.account.a.k();
    new e();
    e.a(this.c, str, 2130837817);
    this.d.setTextColor(getResources().getColor(2131361992));
    this.d.setText(com.wandoujia.account.a.l());
    this.d.setTextSize(1, 15.0F);
    this.e.setVisibility(0);
    this.e.setText("");
    com.wandoujia.p4.a.b().executeAsync(new GetPayParamsDelegate(getBalanceUrl(), null), new b(this));
  }

  private String getBalanceUrl()
  {
    return "http://innerpay.wandoujia.com/pay/account/query?wdj_auth=" + com.wandoujia.account.a.i();
  }

  protected void onAttachedToWindow()
  {
    if (this.b == null)
    {
      this.b = new AccountView.AccountChangeReceiver(this);
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("pheonix.intent.action.LOGIN_SUCCESS");
      localIntentFilter.addAction("pheonix.intent.action.REGISTER_SUCCESS");
      localIntentFilter.addAction("pheonix.intent.action.LOGOUT_SUCCESS");
      localIntentFilter.addAction("account.intent.action.MODIFY_SUCCESS");
      getContext().registerReceiver(this.b, localIntentFilter);
    }
    super.onAttachedToWindow();
  }

  protected void onDetachedFromWindow()
  {
    if (this.b != null)
    {
      getContext().unregisterReceiver(this.b);
      this.b = null;
    }
    super.onDetachedFromWindow();
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.c = ((CircleAsyncImageView)findViewById(2131492903));
    this.d = ((TextView)findViewById(2131492998));
    this.e = ((TextView)findViewById(2131492972));
    this.c.setOnClickListener(this.a);
    this.d.setOnClickListener(this.a);
    this.e.setOnClickListener(this.a);
    if (com.wandoujia.account.a.z())
    {
      b();
      return;
    }
    a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.view.AccountView
 * JD-Core Version:    0.6.0
 */