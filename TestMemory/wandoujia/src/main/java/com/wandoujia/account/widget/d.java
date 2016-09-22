package com.wandoujia.account.widget;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.view.View;

public final class d
{
  private Context a;
  private c b;

  public d(Context paramContext)
  {
    this.a = paramContext;
    this.b = new c();
  }

  public final a a()
  {
    a locala = new a(this.a);
    if (this.b.a > 0)
    {
      locala.a(this.a.getString(this.b.a));
      if (this.b.c != null)
        locala.b(this.b.c);
      if (this.b.d <= 0)
        break label198;
      locala.a(-1, this.a.getString(this.b.d), this.b.f, null);
      label98: if (this.b.g <= 0)
        break label231;
      locala.a(-2, this.a.getString(this.b.g), this.b.i, null);
    }
    while (true)
    {
      locala.setCancelable(this.b.j);
      if (this.b.k != null)
        locala.a(this.b.k);
      locala.a();
      return locala;
      if (this.b.b == null)
        break;
      locala.a(this.b.b);
      break;
      label198: if (this.b.e == null)
        break label98;
      locala.a(-1, this.b.e, this.b.f, null);
      break label98;
      label231: if (this.b.h == null)
        continue;
      locala.a(-2, this.b.h, this.b.i, null);
    }
  }

  public final d a(int paramInt)
  {
    this.b.a = paramInt;
    return this;
  }

  public final d a(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.b.d = paramInt;
    this.b.f = paramOnClickListener;
    return this;
  }

  public final d a(View paramView)
  {
    this.b.k = paramView;
    return this;
  }

  public final d a(CharSequence paramCharSequence)
  {
    this.b.b = paramCharSequence;
    return this;
  }

  public final d a(CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.b.e = paramCharSequence;
    this.b.f = paramOnClickListener;
    return this;
  }

  public final d a(boolean paramBoolean)
  {
    this.b.j = paramBoolean;
    return this;
  }

  public final a b()
  {
    a locala = a();
    if (((this.a instanceof Activity)) && (!((Activity)this.a).isFinishing()))
      locala.show();
    return locala;
  }

  public final d b(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.b.g = paramInt;
    this.b.i = paramOnClickListener;
    return this;
  }

  public final d b(CharSequence paramCharSequence)
  {
    this.b.c = paramCharSequence;
    return this;
  }

  public final d b(CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.b.h = paramCharSequence;
    this.b.i = paramOnClickListener;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.widget.d
 * JD-Core Version:    0.6.0
 */