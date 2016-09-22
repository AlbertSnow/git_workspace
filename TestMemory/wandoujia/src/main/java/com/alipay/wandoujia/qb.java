package com.alipay.wandoujia;

public enum qb
{
  private String k;

  static
  {
    qb[] arrayOfqb = new qb[10];
    arrayOfqb[0] = a;
    arrayOfqb[1] = b;
    arrayOfqb[2] = c;
    arrayOfqb[3] = d;
    arrayOfqb[4] = e;
    arrayOfqb[5] = f;
    arrayOfqb[6] = g;
    arrayOfqb[7] = h;
    arrayOfqb[8] = i;
    arrayOfqb[9] = j;
    l = arrayOfqb;
  }

  private qb(String arg3)
  {
    Object localObject;
    this.k = localObject;
  }

  public static qb a(String paramString)
  {
    Object localObject1 = null;
    qb[] arrayOfqb = values();
    int m = arrayOfqb.length;
    int n = 0;
    if (n >= m)
      return localObject1;
    Object localObject2 = arrayOfqb[n];
    if (paramString.startsWith(((qb)localObject2).a()));
    while (true)
    {
      n++;
      localObject1 = localObject2;
      break;
      localObject2 = localObject1;
    }
  }

  public final String a()
  {
    return this.k;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.qb
 * JD-Core Version:    0.6.0
 */