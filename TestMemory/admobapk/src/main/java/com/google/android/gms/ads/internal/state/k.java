package com.google.android.gms.ads.internal.state;

import android.os.Bundle;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.report.client.a;

@a
public final class k
{
  public final Object a = new Object();
  public int b;
  public int c;
  public final h d;
  public final String e;

  private k(h paramh, String paramString)
  {
    this.d = paramh;
    this.e = paramString;
  }

  public k(String paramString)
  {
    this(bc.a().h, paramString);
  }

  public final Bundle a()
  {
    synchronized (this.a)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("pmnli", this.b);
      localBundle.putInt("pmnll", this.c);
      return localBundle;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.state.k
 * JD-Core Version:    0.6.0
 */