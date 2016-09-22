package com.wandoujia.p4.button.a;

import android.content.Context;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.mvc.Action;
import java.util.ArrayList;
import java.util.List;

public final class a
{
  private int a;
  private CharSequence b;
  private Action c;
  private List<Action> d = new ArrayList();
  private boolean e;

  public a(int paramInt1, int paramInt2, Action paramAction)
  {
    this(paramInt1, JupiterApplication.e().getString(paramInt2), paramAction, true);
  }

  public a(int paramInt, Action paramAction, boolean paramBoolean)
  {
    this(2130772010, JupiterApplication.e().getString(paramInt), paramAction, paramBoolean);
  }

  private a(int paramInt, CharSequence paramCharSequence, Action paramAction, boolean paramBoolean)
  {
    this.a = paramInt;
    this.b = paramCharSequence;
    this.c = paramAction;
    this.e = paramBoolean;
    if (paramAction != null)
      this.d.add(paramAction);
  }

  public a(CharSequence paramCharSequence, Action paramAction)
  {
    this(2130772010, paramCharSequence, paramAction, true);
  }

  public final int a()
  {
    return this.a;
  }

  public final CharSequence b()
  {
    return this.b;
  }

  public final Action c()
  {
    return this.c;
  }

  public final List<Action> d()
  {
    return this.d;
  }

  public final boolean e()
  {
    return this.e;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.button.a.a
 * JD-Core Version:    0.6.0
 */