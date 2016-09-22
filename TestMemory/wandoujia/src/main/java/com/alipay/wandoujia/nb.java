package com.alipay.wandoujia;

public enum nb
{
  private String b;

  static
  {
    nb[] arrayOfnb = new nb[1];
    arrayOfnb[0] = a;
    c = arrayOfnb;
  }

  private nb(String arg3)
  {
    Object localObject;
    this.b = localObject;
  }

  public static nb a(String paramString)
  {
    nb[] arrayOfnb = values();
    int i = arrayOfnb.length;
    for (int j = 0; ; j++)
    {
      nb localnb;
      if (j >= i)
        localnb = null;
      do
      {
        return localnb;
        localnb = arrayOfnb[j];
      }
      while (localnb.a().equalsIgnoreCase(paramString));
    }
  }

  public final String a()
  {
    return this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.nb
 * JD-Core Version:    0.6.0
 */