package com.google.android.gms.ads.internal.js;

import android.content.Context;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.ar;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.y;
import ha;

@a
public final class n
{
  final Object a = new Object();
  final Context b;
  final String c;
  final VersionInfoParcel d;
  ar e;
  ae f;
  int g = 1;
  private ar h;

  public n(Context paramContext, VersionInfoParcel paramVersionInfoParcel, String paramString)
  {
    this.c = paramString;
    this.b = paramContext.getApplicationContext();
    this.d = paramVersionInfoParcel;
    this.e = new z();
    this.h = new z();
  }

  public n(Context paramContext, VersionInfoParcel paramVersionInfoParcel, String paramString, ar paramar1, ar paramar2)
  {
    this(paramContext, paramVersionInfoParcel, paramString);
    this.e = paramar1;
    this.h = paramar2;
  }

  protected final ae a(ha paramha)
  {
    ae localae = new ae(this.h);
    y.a(new o(this, paramha, localae));
    localae.a(new w(this, localae), new x(this, localae));
    return localae;
  }

  public final aa b(ha paramha)
  {
    synchronized (this.a)
    {
      if ((this.f == null) || (this.f.b() == -1))
      {
        this.g = 2;
        this.f = a(paramha);
        aa localaa1 = this.f.a();
        return localaa1;
      }
      if (this.g == 0)
      {
        aa localaa5 = this.f.a();
        return localaa5;
      }
    }
    if (this.g == 1)
    {
      this.g = 2;
      a(paramha);
      aa localaa4 = this.f.a();
      monitorexit;
      return localaa4;
    }
    if (this.g == 2)
    {
      aa localaa3 = this.f.a();
      monitorexit;
      return localaa3;
    }
    aa localaa2 = this.f.a();
    monitorexit;
    return localaa2;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.js.n
 * JD-Core Version:    0.6.0
 */