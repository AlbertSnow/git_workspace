package com.google.android.gms.ads.adshield.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import apj;
import apn;
import com.google.android.gms.ads.identifier.c;
import gw;
import gx;
import gz;
import ha;
import hb;

public final class a extends d
{
  private final gz a;
  private final ha b;
  private final gx c;
  private boolean d = false;

  public a(String paramString, Context paramContext, boolean paramBoolean)
  {
    this.a = gz.a(paramString, paramContext, paramBoolean);
    this.b = new ha(this.a);
    if (paramBoolean);
    for (gx localgx = null; ; localgx = gx.d(paramContext))
    {
      this.c = localgx;
      return;
    }
  }

  private final apj a(apj paramapj1, apj paramapj2, boolean paramBoolean)
  {
    try
    {
      Uri localUri1 = (Uri)apn.a(paramapj1);
      Context localContext = (Context)apn.a(paramapj2);
      if (paramBoolean);
      Uri localUri2;
      for (Object localObject = this.b.a(localUri1, localContext, null, false); ; localObject = localUri2)
      {
        return apn.a(localObject);
        localUri2 = this.b.a(localUri1, localContext);
      }
    }
    catch (hb localhb)
    {
    }
    return (apj)null;
  }

  public final apj a(apj paramapj1, apj paramapj2)
  {
    return a(paramapj1, paramapj2, true);
  }

  public final String a()
  {
    return "ms";
  }

  public final String a(apj paramapj, String paramString)
  {
    Context localContext = (Context)apn.a(paramapj);
    return this.a.a(localContext, paramString, true);
  }

  public final void a(String paramString)
  {
    this.b.c = paramString.split(",");
  }

  public final void a(String paramString1, String paramString2)
  {
    ha localha = this.b;
    localha.a = paramString1;
    localha.b = paramString2;
  }

  public final boolean a(apj paramapj)
  {
    Uri localUri = (Uri)apn.a(paramapj);
    return this.b.a(localUri);
  }

  public final boolean a(String paramString, boolean paramBoolean)
  {
    if (this.c == null)
      return false;
    c localc = new c(paramString, paramBoolean);
    this.c.i = localc;
    this.d = true;
    return true;
  }

  public final apj b(apj paramapj1, apj paramapj2)
  {
    return a(paramapj1, paramapj2, false);
  }

  public final boolean b(apj paramapj)
  {
    Uri localUri = (Uri)apn.a(paramapj);
    return this.b.b(localUri);
  }

  public final String c(apj paramapj)
  {
    Context localContext = (Context)apn.a(paramapj);
    String str1 = this.a.a(localContext, null, false);
    if ((this.c != null) && (this.d))
    {
      String str2 = gx.a(str1, this.c.a(localContext, null, false));
      this.d = false;
      return str2;
    }
    return str1;
  }

  public final void d(apj paramapj)
  {
    MotionEvent localMotionEvent = (MotionEvent)apn.a(paramapj);
    this.b.a(localMotionEvent);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.adshield.internal.a
 * JD-Core Version:    0.6.0
 */