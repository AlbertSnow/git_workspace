package com.google.android.gms.ads.internal.formats;

import android.graphics.Color;
import java.util.List;

@com.google.android.gms.ads.internal.report.client.a
public final class a
{
  private static final int h = Color.rgb(12, 174, 206);
  private static final int i;
  private static int j;
  private static int k;
  final String a;
  final List b;
  final int c;
  final int d;
  final int e;
  final int f;
  final int g;

  static
  {
    int m = Color.rgb(204, 204, 204);
    i = m;
    j = m;
    k = h;
  }

  public a(String paramString, List paramList, Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, int paramInt1, int paramInt2)
  {
    this.a = paramString;
    this.b = paramList;
    int m;
    int n;
    if (paramInteger1 != null)
    {
      m = paramInteger1.intValue();
      this.c = m;
      if (paramInteger2 == null)
        break label87;
      n = paramInteger2.intValue();
      label42: this.d = n;
      if (paramInteger3 == null)
        break label95;
    }
    label87: label95: for (int i1 = paramInteger3.intValue(); ; i1 = 12)
    {
      this.e = i1;
      this.f = paramInt1;
      this.g = paramInt2;
      return;
      m = j;
      break;
      n = k;
      break label42;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.a
 * JD-Core Version:    0.6.0
 */