package com.alipay.wandoujia;

public enum id
{
  private int p;
  private String q;

  static
  {
    id[] arrayOfid = new id[15];
    arrayOfid[0] = a;
    arrayOfid[1] = b;
    arrayOfid[2] = c;
    arrayOfid[3] = d;
    arrayOfid[4] = e;
    arrayOfid[5] = f;
    arrayOfid[6] = g;
    arrayOfid[7] = h;
    arrayOfid[8] = i;
    arrayOfid[9] = j;
    arrayOfid[10] = k;
    arrayOfid[11] = l;
    arrayOfid[12] = m;
    arrayOfid[13] = n;
    arrayOfid[14] = o;
    r = arrayOfid;
  }

  private id(int arg3, String arg4)
  {
    int i1;
    this.p = i1;
    Object localObject;
    this.q = localObject;
  }

  public static id a(int paramInt)
  {
    id[] arrayOfid = values();
    int i1 = arrayOfid.length;
    for (int i2 = 0; ; i2++)
    {
      id localid;
      if (i2 >= i1)
        localid = o;
      do
      {
        return localid;
        localid = arrayOfid[i2];
      }
      while (localid.a() == paramInt);
    }
  }

  public final int a()
  {
    return this.p;
  }

  public final void a(String paramString)
  {
    this.q = paramString;
  }

  public final String b()
  {
    return this.q;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.id
 * JD-Core Version:    0.6.0
 */