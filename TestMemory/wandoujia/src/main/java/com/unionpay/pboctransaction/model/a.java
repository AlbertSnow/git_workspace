package com.unionpay.pboctransaction.model;

public final class a
  implements b
{
  private int a = 2;
  private int b = 0;
  private String c = null;
  private String d = null;
  private String e = null;

  public a()
  {
    this.c = null;
    this.d = null;
    this.e = null;
  }

  public a(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2)
  {
    this.b = paramInt1;
    this.a = paramInt2;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramString3;
  }

  private a(String paramString1, String paramString2, String paramString3)
  {
    this(0, paramString1, paramString2, paramString3, 2);
  }

  public a(String paramString1, String paramString2, String paramString3, byte paramByte)
  {
    this(paramString1, paramString2, paramString3);
  }

  public final String a()
  {
    return this.c;
  }

  public final String b()
  {
    return this.e;
  }

  public final String c()
  {
    int i = this.e.length();
    if (this.b == 0)
      return this.d + " " + this.e.substring(i - 4);
    String str1 = this.e.substring(0, 4) + ".." + this.e.substring(i - 4);
    String str2 = "";
    if (this.b == 4)
      str2 = String.format(" - <font color=\"#FF0000\">%s</font>", new Object[] { "SIM卡" });
    while (true)
    {
      return str1 + str2;
      if (this.b == 8)
      {
        str2 = String.format(" - <font color=\"#FF0000\">%s</font>", new Object[] { "SD卡" });
        continue;
      }
      if (this.b == 16)
      {
        str2 = String.format(" - <font color=\"#FF0000\">%s</font>", new Object[] { "独立IC卡" });
        continue;
      }
      if (this.b != 1)
        continue;
      str2 = String.format(" - <font color=\"#FF0000\">%s</font>", new Object[] { "芯片卡" });
    }
  }

  public final int d()
  {
    return this.b;
  }

  public final int e()
  {
    return this.a;
  }

  public final String toString()
  {
    return this.c + "," + this.d + "," + this.e;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.pboctransaction.model.a
 * JD-Core Version:    0.6.0
 */