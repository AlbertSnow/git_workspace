package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

public final class au
{
  final List a = new ArrayList();
  final List b = new ArrayList();
  final List c = new ArrayList();

  public final au a(String paramString, double paramDouble1, double paramDouble2)
  {
    for (int i = 0; i < this.a.size(); i++)
    {
      double d1 = ((Double)this.c.get(i)).doubleValue();
      double d2 = ((Double)this.b.get(i)).doubleValue();
      if ((paramDouble1 < d1) || ((d1 == paramDouble1) && (paramDouble2 < d2)))
        break;
    }
    this.a.add(i, paramString);
    this.c.add(i, Double.valueOf(paramDouble1));
    this.b.add(i, Double.valueOf(paramDouble2));
    return this;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.au
 * JD-Core Version:    0.6.0
 */