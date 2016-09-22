package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class DataHolder
  implements SafeParcelable
{
  public static final d CREATOR = new d();
  private final int a;
  private final String[] b;
  private Bundle c;
  private final CursorWindow[] d;
  private final int e;
  private final Bundle f;
  private int[] g;
  private boolean h = false;
  private boolean i = true;

  static
  {
    new a(new String[0]);
  }

  DataHolder(int paramInt1, String[] paramArrayOfString, CursorWindow[] paramArrayOfCursorWindow, int paramInt2, Bundle paramBundle)
  {
    this.a = paramInt1;
    this.b = paramArrayOfString;
    this.d = paramArrayOfCursorWindow;
    this.e = paramInt2;
    this.f = paramBundle;
  }

  private boolean g()
  {
    monitorenter;
    try
    {
      boolean bool = this.h;
      return bool;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private void h()
  {
    monitorenter;
    try
    {
      if (!this.h)
      {
        this.h = true;
        for (int j = 0; j < this.d.length; j++)
          this.d[j].close();
      }
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void a()
  {
    int j = 0;
    this.c = new Bundle();
    for (int k = 0; k < this.b.length; k++)
      this.c.putInt(this.b[k], k);
    this.g = new int[this.d.length];
    int m = 0;
    while (j < this.d.length)
    {
      this.g[j] = m;
      int n = m - this.d[j].getStartPosition();
      m += this.d[j].getNumRows() - n;
      j++;
    }
  }

  final int b()
  {
    return this.a;
  }

  final String[] c()
  {
    return this.b;
  }

  final CursorWindow[] d()
  {
    return this.d;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final int e()
  {
    return this.e;
  }

  public final Bundle f()
  {
    return this.f;
  }

  protected final void finalize()
  {
    try
    {
      if ((this.i) && (this.d.length > 0) && (!g()))
      {
        String str = "internal object: " + toString();
        new StringBuilder("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (").append(str).append(")");
        h();
      }
      return;
    }
    finally
    {
      super.finalize();
    }
    throw localObject;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    d.a(this, paramParcel, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.data.DataHolder
 * JD-Core Version:    0.6.0
 */