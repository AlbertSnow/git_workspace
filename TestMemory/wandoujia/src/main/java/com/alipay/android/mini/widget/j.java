package com.alipay.android.mini.widget;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.view.View;

public final class j
{
  private final l a = new l(0);

  public j(Context paramContext)
  {
    this.a.c = paramContext;
  }

  public final i a()
  {
    i locali = new i(this.a);
    if (this.a.e != null)
      locali.a(-1, this.a.e, this.a.g, null);
    if (this.a.f != null)
      locali.a(-2, this.a.f, this.a.h, null);
    locali.setCanceledOnTouchOutside(false);
    locali.setCancelable(false);
    locali.setOnCancelListener(null);
    locali.show();
    return locali;
  }

  public final j a(int paramInt)
  {
    return b(this.a.c.getText(paramInt));
  }

  public final j a(DialogInterface.OnClickListener paramOnClickListener)
  {
    return a(this.a.c.getString(17039370), paramOnClickListener);
  }

  public final j a(View paramView)
  {
    this.a.d = paramView;
    return this;
  }

  public final j a(CharSequence paramCharSequence)
  {
    this.a.b = paramCharSequence;
    return this;
  }

  public final j a(CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.a.e = paramCharSequence;
    this.a.g = paramOnClickListener;
    return this;
  }

  public final j b(CharSequence paramCharSequence)
  {
    this.a.a = paramCharSequence;
    return this;
  }

  public final j b(CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.a.f = paramCharSequence;
    this.a.h = paramOnClickListener;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.widget.j
 * JD-Core Version:    0.6.0
 */