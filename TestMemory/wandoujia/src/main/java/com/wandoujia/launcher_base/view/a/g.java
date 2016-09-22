package com.wandoujia.launcher_base.view.a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;

public final class g
{
  private Context a;
  private f b;

  public g(Context paramContext)
  {
    this.a = paramContext;
    this.b = new f();
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
        break label177;
      locala.a(-1, this.a.getString(this.b.d), this.b.f, null);
      label98: if (this.b.g <= 0)
        break label210;
      locala.a(-2, this.a.getString(this.b.g), this.b.i, null);
    }
    while (true)
    {
      locala.setCancelable(this.b.j);
      locala.b();
      return locala;
      if (this.b.b == null)
        break;
      locala.a(this.b.b);
      break;
      label177: if (this.b.e == null)
        break label98;
      locala.a(-1, this.b.e, this.b.f, null);
      break label98;
      label210: if (this.b.h == null)
        continue;
      locala.a(-2, this.b.h, this.b.i, null);
    }
  }

  public final g a(int paramInt)
  {
    this.b.a = paramInt;
    return this;
  }

  public final g a(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.b.d = paramInt;
    this.b.f = paramOnClickListener;
    return this;
  }

  public final g a(CharSequence paramCharSequence)
  {
    this.b.b = paramCharSequence;
    return this;
  }

  public final g a(CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.b.e = paramCharSequence;
    this.b.f = paramOnClickListener;
    return this;
  }

  public final a b()
  {
    a locala = a();
    if (((this.a instanceof Activity)) && (!((Activity)this.a).isFinishing()))
      locala.show();
    return locala;
  }

  public final g b(int paramInt)
  {
    this.b.g = paramInt;
    this.b.i = null;
    return this;
  }

  public final g b(CharSequence paramCharSequence)
  {
    this.b.c = paramCharSequence;
    return this;
  }

  public final g b(CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.b.h = paramCharSequence;
    this.b.i = paramOnClickListener;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.view.a.g
 * JD-Core Version:    0.6.0
 */