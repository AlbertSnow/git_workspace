package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.report.client.a;
import java.util.ArrayList;
import java.util.List;

@a
public final class as
{
  public final double[] a;
  public final double[] b;
  public final int[] c;
  public int d;
  private final String[] e;

  public as(au paramau)
  {
    int i = paramau.b.size();
    this.e = ((String[])paramau.a.toArray(new String[i]));
    this.a = a(paramau.b);
    this.b = a(paramau.c);
    this.c = new int[i];
    this.d = 0;
  }

  private static double[] a(List paramList)
  {
    double[] arrayOfDouble = new double[paramList.size()];
    for (int i = 0; i < arrayOfDouble.length; i++)
      arrayOfDouble[i] = ((Double)paramList.get(i)).doubleValue();
    return arrayOfDouble;
  }

  public final List a()
  {
    ArrayList localArrayList = new ArrayList(this.e.length);
    for (int i = 0; i < this.e.length; i++)
      localArrayList.add(new at(this.e[i], this.b[i], this.a[i], this.c[i] / this.d, this.c[i]));
    return localArrayList;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.as
 * JD-Core Version:    0.6.0
 */