package com.wandoujia.ripple_framework.view.a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.view.View;

public final class h
{
  private Context a;
  private g b;

  public h(Context paramContext)
  {
    this.a = paramContext;
    this.b = new g();
  }

  public final a a()
  {
    a locala = new a(this.a);
    if (this.b.a > 0)
    {
      locala.a(this.a.getString(this.b.a));
      if (this.b.c <= 0)
        break label299;
      locala.b(this.a.getString(this.b.c));
      label68: if (this.b.e <= 0)
        break label323;
      locala.a(-1, this.a.getString(this.b.e), this.b.g, null);
      label105: if (this.b.h <= 0)
        break label356;
      locala.a(-2, this.a.getString(this.b.h), this.b.j, null);
    }
    while (true)
    {
      if (this.b.k != null)
        locala.a(-3, this.b.k, this.b.l, null);
      locala.setCancelable(this.b.m);
      if (this.b.n != null)
        locala.setOnCancelListener(this.b.n);
      if (this.b.o != null)
        locala.setOnDismissListener(this.b.o);
      if (this.b.p != null)
        locala.setOnKeyListener(this.b.p);
      if (this.b.q != null)
        locala.a(this.b.q);
      locala.b();
      return locala;
      if (this.b.b == null)
        break;
      locala.a(this.b.b);
      break;
      label299: if (this.b.d == null)
        break label68;
      locala.b(this.b.d);
      break label68;
      label323: if (this.b.f == null)
        break label105;
      locala.a(-1, this.b.f, this.b.g, null);
      break label105;
      label356: if (this.b.i == null)
        continue;
      locala.a(-2, this.b.i, this.b.j, null);
    }
  }

  public final h a(int paramInt)
  {
    this.b.a = paramInt;
    return this;
  }

  public final h a(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.b.e = paramInt;
    this.b.g = paramOnClickListener;
    return this;
  }

  public final h a(DialogInterface.OnCancelListener paramOnCancelListener)
  {
    this.b.n = paramOnCancelListener;
    return this;
  }

  public final h a(DialogInterface.OnDismissListener paramOnDismissListener)
  {
    this.b.o = paramOnDismissListener;
    return this;
  }

  public final h a(DialogInterface.OnKeyListener paramOnKeyListener)
  {
    this.b.p = paramOnKeyListener;
    return this;
  }

  public final h a(View paramView)
  {
    this.b.q = paramView;
    return this;
  }

  public final h a(CharSequence paramCharSequence)
  {
    this.b.b = paramCharSequence;
    return this;
  }

  public final h a(CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.b.f = paramCharSequence;
    this.b.g = paramOnClickListener;
    return this;
  }

  public final h a(boolean paramBoolean)
  {
    this.b.m = paramBoolean;
    return this;
  }

  public final a b()
  {
    a locala = a();
    if (((this.a instanceof Activity)) && (!((Activity)this.a).isFinishing()))
      locala.show();
    return locala;
  }

  public final h b(int paramInt)
  {
    this.b.c = paramInt;
    return this;
  }

  public final h b(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.b.h = paramInt;
    this.b.j = paramOnClickListener;
    return this;
  }

  public final h b(CharSequence paramCharSequence)
  {
    this.b.d = paramCharSequence;
    return this;
  }

  public final h b(CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.b.i = paramCharSequence;
    this.b.j = paramOnClickListener;
    return this;
  }

  public final h c(CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.b.k = paramCharSequence;
    this.b.l = paramOnClickListener;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.a.h
 * JD-Core Version:    0.6.0
 */