package com.unionpay.mpay.net;

import java.util.HashMap;

public final class d
{
  private int a;
  private String b;
  private HashMap<String, String> c;
  private byte[] d;

  public d(int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    this.a = paramInt;
    this.b = paramString;
    this.c = null;
    this.d = paramArrayOfByte;
  }

  public d(String paramString)
  {
    this.a = 1;
    this.b = paramString;
    this.c = null;
    this.d = null;
  }

  public final int a()
  {
    return this.a;
  }

  public final void a(String paramString)
  {
    if (paramString != null)
      this.d = paramString.getBytes();
  }

  public final void a(HashMap<String, String> paramHashMap)
  {
    this.c = paramHashMap;
  }

  public final String b()
  {
    return this.b;
  }

  public final HashMap<String, String> c()
  {
    return this.c;
  }

  public final byte[] d()
  {
    return this.d;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.net.d
 * JD-Core Version:    0.6.0
 */