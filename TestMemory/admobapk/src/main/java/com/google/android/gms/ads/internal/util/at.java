package com.google.android.gms.ads.internal.util;

import anu;
import anv;
import java.util.Arrays;

public final class at
{
  public final String a;
  public final double b;
  public final int c;
  private double d;
  private double e;

  public at(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt)
  {
    this.a = paramString;
    this.e = paramDouble1;
    this.d = paramDouble2;
    this.b = paramDouble3;
    this.c = paramInt;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof at));
    at localat;
    do
    {
      return false;
      localat = (at)paramObject;
    }
    while ((!anu.a(this.a, localat.a)) || (this.d != localat.d) || (this.e != localat.e) || (this.c != localat.c) || (Double.compare(this.b, localat.b) != 0));
    return true;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this.a;
    arrayOfObject[1] = Double.valueOf(this.d);
    arrayOfObject[2] = Double.valueOf(this.e);
    arrayOfObject[3] = Double.valueOf(this.b);
    arrayOfObject[4] = Integer.valueOf(this.c);
    return Arrays.hashCode(arrayOfObject);
  }

  public final String toString()
  {
    return anu.a(this).a("name", this.a).a("minBound", Double.valueOf(this.e)).a("maxBound", Double.valueOf(this.d)).a("percent", Double.valueOf(this.b)).a("count", Integer.valueOf(this.c)).toString();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.at
 * JD-Core Version:    0.6.0
 */