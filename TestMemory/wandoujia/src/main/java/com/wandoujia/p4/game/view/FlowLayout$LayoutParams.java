package com.wandoujia.p4.game.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.wandoujia.phoenix2.R.styleable;

public class FlowLayout$LayoutParams extends ViewGroup.MarginLayoutParams
{
  public boolean a = false;

  @ViewDebug.ExportedProperty(mapping={@android.view.ViewDebug.IntToString(from=0, to="NONE"), @android.view.ViewDebug.IntToString(from=48, to="TOP"), @android.view.ViewDebug.IntToString(from=80, to="BOTTOM"), @android.view.ViewDebug.IntToString(from=3, to="LEFT"), @android.view.ViewDebug.IntToString(from=5, to="RIGHT"), @android.view.ViewDebug.IntToString(from=16, to="CENTER_VERTICAL"), @android.view.ViewDebug.IntToString(from=112, to="FILL_VERTICAL"), @android.view.ViewDebug.IntToString(from=1, to="CENTER_HORIZONTAL"), @android.view.ViewDebug.IntToString(from=7, to="FILL_HORIZONTAL"), @android.view.ViewDebug.IntToString(from=17, to="CENTER"), @android.view.ViewDebug.IntToString(from=119, to="FILL")})
  public int b = 0;
  public float c = -1.0F;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k;

  public FlowLayout$LayoutParams()
  {
    super(-2, -2);
  }

  public FlowLayout$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.FlowLayout_LayoutParams);
    try
    {
      this.a = localTypedArray.getBoolean(1, false);
      this.b = localTypedArray.getInt(0, 0);
      this.c = localTypedArray.getFloat(4, -1.0F);
      return;
    }
    finally
    {
      localTypedArray.recycle();
    }
    throw localObject;
  }

  public FlowLayout$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }

  final int a()
  {
    return this.f;
  }

  final void a(int paramInt)
  {
    this.f = paramInt;
  }

  final void a(int paramInt1, int paramInt2)
  {
    this.j = paramInt1;
    this.k = paramInt2;
  }

  final int b()
  {
    return this.g;
  }

  final void b(int paramInt)
  {
    this.g = paramInt;
  }

  final int c()
  {
    return this.h;
  }

  final void c(int paramInt)
  {
    this.h = paramInt;
  }

  final int d()
  {
    return this.i;
  }

  final void d(int paramInt)
  {
    this.i = paramInt;
  }

  final int e()
  {
    return this.d;
  }

  final void e(int paramInt)
  {
    if (paramInt == 0)
    {
      this.d = (this.leftMargin + this.rightMargin);
      this.e = (this.topMargin + this.bottomMargin);
      return;
    }
    this.d = (this.topMargin + this.bottomMargin);
    this.e = (this.leftMargin + this.rightMargin);
  }

  final int f()
  {
    return this.e;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.game.view.FlowLayout.LayoutParams
 * JD-Core Version:    0.6.0
 */