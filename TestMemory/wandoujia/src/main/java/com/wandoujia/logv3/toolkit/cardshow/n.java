package com.wandoujia.logv3.toolkit.cardshow;

import android.support.v7.widget.by;
import android.support.v7.widget.co;
import com.wandoujia.logv3.toolkit.v;

public abstract class n<VH extends co> extends by<VH>
{
  private j a;

  public void a(VH paramVH, int paramInt)
  {
    v.b().a(paramVH.a, paramInt);
  }

  public final boolean a(j paramj)
  {
    this.a = paramj;
    return true;
  }

  public long b(int paramInt)
  {
    return paramInt;
  }

  public void b(VH paramVH)
  {
    super.b(paramVH);
    if (this.a != null)
      this.a.a(paramVH.a, b(paramVH.c()));
  }

  public void c(VH paramVH)
  {
    super.c(paramVH);
    if (this.a != null)
      this.a.a(paramVH.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.cardshow.n
 * JD-Core Version:    0.6.0
 */