package android.support.v4.c;

import android.os.Build.VERSION;
import android.os.Parcelable.Creator;
import android.os.Trace;
import android.support.v4.view.bg;
import android.support.v4.view.cp;
import android.view.View;
import android.view.ViewParent;

public final class a
{
  private final View a;
  private ViewParent b;
  private boolean c;
  private int[] d;

  public a(View paramView)
  {
    this.a = paramView;
  }

  public static <T> Parcelable.Creator<T> a(c<T> paramc)
  {
    if (Build.VERSION.SDK_INT >= 13)
      return new d(paramc);
    return new b(paramc);
  }

  public static void a()
  {
    if (Build.VERSION.SDK_INT >= 18)
      Trace.endSection();
  }

  public static void a(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 18)
      Trace.beginSection(paramString);
  }

  public final void a(boolean paramBoolean)
  {
    if (this.c)
      bg.A(this.a);
    this.c = paramBoolean;
  }

  public final boolean a(float paramFloat1, float paramFloat2)
  {
    if ((this.c) && (this.b != null))
      return cp.a(this.b, this.a, paramFloat1, paramFloat2);
    return false;
  }

  public final boolean a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if ((this.c) && (this.b != null))
      return cp.a(this.b, this.a, paramFloat1, paramFloat2, paramBoolean);
    return false;
  }

  public final boolean a(int paramInt)
  {
    if (c())
      return true;
    if (this.c)
    {
      ViewParent localViewParent = this.a.getParent();
      View localView = this.a;
      while (localViewParent != null)
      {
        if (cp.a(localViewParent, localView, this.a, paramInt))
        {
          this.b = localViewParent;
          cp.b(localViewParent, localView, this.a, paramInt);
          return true;
        }
        if ((localViewParent instanceof View))
          localView = (View)localViewParent;
        localViewParent = localViewParent.getParent();
      }
    }
    return false;
  }

  public final boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    boolean bool = this.c;
    int i = 0;
    int m;
    int j;
    if (bool)
    {
      ViewParent localViewParent = this.b;
      i = 0;
      if (localViewParent != null)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0) && (paramInt3 == 0) && (paramInt4 == 0))
          break label133;
        if (paramArrayOfInt == null)
          break label153;
        this.a.getLocationInWindow(paramArrayOfInt);
        m = paramArrayOfInt[0];
        j = paramArrayOfInt[1];
      }
    }
    for (int k = m; ; k = 0)
    {
      cp.a(this.b, this.a, paramInt1, paramInt2, paramInt3, paramInt4);
      if (paramArrayOfInt != null)
      {
        this.a.getLocationInWindow(paramArrayOfInt);
        paramArrayOfInt[0] -= k;
        paramArrayOfInt[1] -= j;
      }
      i = 1;
      label133: 
      do
      {
        return i;
        i = 0;
      }
      while (paramArrayOfInt == null);
      paramArrayOfInt[0] = 0;
      paramArrayOfInt[1] = 0;
      return false;
      label153: j = 0;
    }
  }

  public final boolean a(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    boolean bool = this.c;
    int i = 0;
    int k;
    int j;
    if (bool)
    {
      ViewParent localViewParent = this.b;
      i = 0;
      if (localViewParent != null)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
          break label168;
        if (paramArrayOfInt2 == null)
          break label188;
        this.a.getLocationInWindow(paramArrayOfInt2);
        k = paramArrayOfInt2[0];
        j = paramArrayOfInt2[1];
      }
    }
    while (true)
    {
      if (paramArrayOfInt1 == null)
      {
        if (this.d == null)
          this.d = new int[2];
        paramArrayOfInt1 = this.d;
      }
      paramArrayOfInt1[0] = 0;
      paramArrayOfInt1[1] = 0;
      cp.a(this.b, this.a, paramInt1, paramInt2, paramArrayOfInt1);
      if (paramArrayOfInt2 != null)
      {
        this.a.getLocationInWindow(paramArrayOfInt2);
        paramArrayOfInt2[0] -= k;
        paramArrayOfInt2[1] -= j;
      }
      if (paramArrayOfInt1[0] == 0)
      {
        int m = paramArrayOfInt1[1];
        i = 0;
        if (m == 0);
      }
      else
      {
        i = 1;
      }
      label168: 
      do
      {
        return i;
        i = 0;
      }
      while (paramArrayOfInt2 == null);
      paramArrayOfInt2[0] = 0;
      paramArrayOfInt2[1] = 0;
      return false;
      label188: j = 0;
      k = 0;
    }
  }

  public final boolean b()
  {
    return this.c;
  }

  public final boolean c()
  {
    return this.b != null;
  }

  public final void d()
  {
    if (this.b != null)
    {
      cp.a(this.b, this.a);
      this.b = null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.c.a
 * JD-Core Version:    0.6.0
 */