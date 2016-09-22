package com.alipay.wandoujia;

public enum sf
{
  private String v;

  static
  {
    sf[] arrayOfsf = new sf[21];
    arrayOfsf[0] = a;
    arrayOfsf[1] = b;
    arrayOfsf[2] = c;
    arrayOfsf[3] = d;
    arrayOfsf[4] = e;
    arrayOfsf[5] = f;
    arrayOfsf[6] = g;
    arrayOfsf[7] = h;
    arrayOfsf[8] = i;
    arrayOfsf[9] = j;
    arrayOfsf[10] = k;
    arrayOfsf[11] = l;
    arrayOfsf[12] = m;
    arrayOfsf[13] = n;
    arrayOfsf[14] = o;
    arrayOfsf[15] = p;
    arrayOfsf[16] = q;
    arrayOfsf[17] = r;
    arrayOfsf[18] = s;
    arrayOfsf[19] = t;
    arrayOfsf[20] = u;
    w = arrayOfsf;
  }

  private sf(String arg3)
  {
    Object localObject;
    this.v = localObject;
  }

  public static sf a(String paramString)
  {
    sf[] arrayOfsf = values();
    int i1 = arrayOfsf.length;
    for (int i2 = 0; ; i2++)
    {
      sf localsf;
      if (i2 >= i1)
        localsf = null;
      do
      {
        return localsf;
        localsf = arrayOfsf[i2];
      }
      while (localsf.a().equalsIgnoreCase(paramString));
    }
  }

  public final String a()
  {
    return this.v;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.sf
 * JD-Core Version:    0.6.0
 */