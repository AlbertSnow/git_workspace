package com.wandoujia.ripple_framework;

import android.util.SparseArray;
import com.wandoujia.nirvana.framework.network.page.a;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.video.ViewFocusManager;

public class k
{
  private a<Model> a;
  private SparseArray<Object> b = new SparseArray();
  private ViewFocusManager c;

  public final a<Model> a()
  {
    return this.a;
  }

  public final <T> T a(Integer paramInteger)
  {
    return this.b.get(paramInteger.intValue());
  }

  public final void a(a<Model> parama)
  {
    this.a = parama;
  }

  public final void a(ViewFocusManager paramViewFocusManager)
  {
    this.c = paramViewFocusManager;
  }

  public final void a(Integer paramInteger, Object paramObject)
  {
    this.b.put(paramInteger.intValue(), paramObject);
  }

  public final void b()
  {
    if (this.c != null)
    {
      this.c.d();
      this.c = null;
    }
    this.b.clear();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.k
 * JD-Core Version:    0.6.0
 */