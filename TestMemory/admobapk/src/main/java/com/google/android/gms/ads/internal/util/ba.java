package com.google.android.gms.ads.internal.util;

import et;
import ev;
import ez;
import fb;
import fs;
import java.io.ByteArrayInputStream;

public final class ba extends ev
{
  private final az l;
  private final fb m;

  public ba(String paramString, az paramaz, fb paramfb)
  {
    super(0, paramString, new bb(paramfb, paramaz));
    this.l = paramaz;
    this.m = paramfb;
  }

  protected final ez a(et paramet)
  {
    return ez.a(new ByteArrayInputStream(paramet.a), fs.a(paramet));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.ba
 * JD-Core Version:    0.6.0
 */