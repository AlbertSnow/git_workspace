package com.wandoujia.nirvana.framework.ui.recycler;

import android.support.v7.app.f;
import android.view.ViewGroup;
import com.wandoujia.nirvana.framework.ui.a;
import java.util.ArrayList;
import java.util.List;

public abstract class g
{
  private h a;
  private boolean b;
  private Object c;
  private int d;
  private List<f> e = new ArrayList();

  public g()
  {
    this(false);
  }

  public g(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public abstract a a(ViewGroup paramViewGroup);

  public final void a(Object paramObject)
  {
    if (this.c != paramObject)
    {
      this.c = paramObject;
      if (this.a != null)
        this.a.b(this);
    }
  }

  public final void a(boolean paramBoolean)
  {
    if (this.b != paramBoolean)
    {
      this.b = paramBoolean;
      if (this.a != null)
        this.a.c(this);
    }
  }

  public final boolean a()
  {
    return this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.ui.recycler.g
 * JD-Core Version:    0.6.0
 */