package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.ads.internal.formats.client.t;
import com.google.android.gms.ads.internal.util.client.e;
import dh;
import java.util.Arrays;
import java.util.List;

@com.google.android.gms.ads.internal.report.client.a
public final class f extends t
  implements i
{
  private final a a;
  private final String b;
  private final dh c;
  private final dh d;
  private final Object e = new Object();
  private h f;

  public f(String paramString, dh paramdh1, dh paramdh2, a parama)
  {
    this.b = paramString;
    this.c = paramdh1;
    this.d = paramdh2;
    this.a = parama;
  }

  public final String a(String paramString)
  {
    return (String)this.d.get(paramString);
  }

  public final List a()
  {
    String[] arrayOfString = new String[this.c.size() + this.d.size()];
    int i = 0;
    int j = 0;
    int m;
    while (true)
    {
      int k = this.c.size();
      m = 0;
      if (i >= k)
        break;
      arrayOfString[j] = ((String)this.c.b(i));
      int n = i + 1;
      j++;
      i = n;
    }
    while (m < this.d.size())
    {
      arrayOfString[j] = ((String)this.d.b(m));
      m++;
      j++;
    }
    return Arrays.asList(arrayOfString);
  }

  public final void a(h paramh)
  {
    synchronized (this.e)
    {
      this.f = paramh;
      return;
    }
  }

  public final com.google.android.gms.ads.internal.formats.client.a b(String paramString)
  {
    return (com.google.android.gms.ads.internal.formats.client.a)this.c.get(paramString);
  }

  public final void b()
  {
    synchronized (this.e)
    {
      if (this.f == null)
      {
        e.c("Attempt to perform recordImpression before ad initialized.");
        return;
      }
      this.f.a();
      return;
    }
  }

  public final void c(String paramString)
  {
    synchronized (this.e)
    {
      if (this.f == null)
      {
        e.c("Attempt to call performClick before ad initialized.");
        return;
      }
      this.f.a(paramString, null, null, null);
      return;
    }
  }

  public final String j()
  {
    return "3";
  }

  public final String k()
  {
    return this.b;
  }

  public final a l()
  {
    return this.a;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.f
 * JD-Core Version:    0.6.0
 */