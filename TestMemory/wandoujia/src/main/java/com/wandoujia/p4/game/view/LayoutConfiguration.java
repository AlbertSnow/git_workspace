package com.wandoujia.p4.game.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.wandoujia.phoenix2.R.styleable;

class LayoutConfiguration
{
  private int a = 0;
  private boolean b = false;
  private float c = 0.0F;
  private int d = 51;
  private int e = 0;

  public LayoutConfiguration(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.FlowLayout);
    try
    {
      a(localTypedArray.getInteger(1, 0));
      this.b = localTypedArray.getBoolean(6, false);
      a(localTypedArray.getFloat(8, 0.0F));
      b(localTypedArray.getInteger(0, 0));
      c(localTypedArray.getInteger(5, 0));
      return;
    }
    finally
    {
      localTypedArray.recycle();
    }
    throw localObject;
  }

  public final int a()
  {
    return this.a;
  }

  public final void a(float paramFloat)
  {
    this.c = Math.max(0.0F, paramFloat);
  }

  public final void a(int paramInt)
  {
    if (paramInt == 1)
    {
      this.a = paramInt;
      return;
    }
    this.a = 0;
  }

  public final void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public final void b(int paramInt)
  {
    if ((paramInt & 0x7) == 0);
    for (int i = paramInt | 0x3; ; i = paramInt)
    {
      if ((i & 0x70) == 0)
        i |= 48;
      this.d = i;
      return;
    }
  }

  public final boolean b()
  {
    return this.b;
  }

  public final float c()
  {
    return this.c;
  }

  public final void c(int paramInt)
  {
    if (paramInt == 1)
    {
      this.e = paramInt;
      return;
    }
    this.e = 0;
  }

  public final int d()
  {
    return this.d;
  }

  public final int e()
  {
    return this.e;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.game.view.LayoutConfiguration
 * JD-Core Version:    0.6.0
 */