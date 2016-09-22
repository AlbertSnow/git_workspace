package com.wandoujia.ripple_framework.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.d;
import android.view.View;

public class Anchor
  implements Parcelable
{
  public static final Parcelable.Creator<Anchor> CREATOR = new a();
  public int a;
  public int b;
  public int c;
  public int d;
  public int e;
  public int f;
  public int g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  private int m;

  private Anchor(Parcel paramParcel)
  {
    this.l = paramParcel.readInt();
    this.a = paramParcel.readInt();
    this.m = paramParcel.readInt();
    this.b = paramParcel.readInt();
    this.i = paramParcel.readInt();
    this.h = paramParcel.readInt();
    this.j = paramParcel.readInt();
    this.k = paramParcel.readInt();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readInt();
    this.e = paramParcel.readInt();
    this.f = paramParcel.readInt();
    this.g = paramParcel.readInt();
  }

  public Anchor(View paramView)
  {
    a(paramView, null, false);
  }

  public Anchor(View paramView1, View paramView2)
  {
    a(paramView1, paramView2, true);
  }

  private void a(View paramView1, View paramView2, boolean paramBoolean)
  {
    View localView1 = paramView1.getRootView().findViewById(16908290);
    if (localView1 != null)
    {
      View localView2 = d.d(paramView1);
      if ((localView2 != null) && (paramBoolean))
        paramView1 = localView2;
      int[] arrayOfInt1 = a(paramView1, localView1);
      int n = arrayOfInt1[0];
      this.l = n;
      this.i = n;
      int i1 = arrayOfInt1[1];
      this.a = i1;
      this.h = i1;
      int i2 = paramView1.getWidth();
      this.m = i2;
      this.j = i2;
      int i3 = paramView1.getHeight();
      this.b = i3;
      this.k = i3;
      this.c = localView1.getHeight();
      if (this.a < 0)
      {
        this.b += this.a;
        this.a = 0;
      }
      if (this.b + this.a > this.c)
        this.b = (this.c - this.a);
      if (paramView2 != null)
      {
        int[] arrayOfInt2 = new int[2];
        paramView2.getLocationOnScreen(arrayOfInt2);
        this.d = a(paramView2, localView1)[1];
        this.e = arrayOfInt2[0];
        this.f = paramView2.getWidth();
        this.g = paramView2.getHeight();
      }
    }
  }

  private static int[] a(View paramView1, View paramView2)
  {
    int[] arrayOfInt = new int[2];
    arrayOfInt[1] = 0;
    arrayOfInt[0] = 0;
    if (paramView1 == paramView2)
      return arrayOfInt;
    View localView;
    do
    {
      paramView1 = localView;
      arrayOfInt[0] += paramView1.getLeft();
      arrayOfInt[1] += paramView1.getTop();
      localView = (View)paramView1.getParent();
      if (localView == null)
        continue;
      arrayOfInt[0] -= localView.getScrollX();
      arrayOfInt[1] -= localView.getScrollY();
    }
    while ((localView != paramView2) && (localView != null));
    return arrayOfInt;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.l);
    paramParcel.writeInt(this.a);
    paramParcel.writeInt(this.m);
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.i);
    paramParcel.writeInt(this.h);
    paramParcel.writeInt(this.j);
    paramParcel.writeInt(this.k);
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
    paramParcel.writeInt(this.g);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.Anchor
 * JD-Core Version:    0.6.0
 */