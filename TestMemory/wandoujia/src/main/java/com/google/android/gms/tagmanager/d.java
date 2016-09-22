package com.google.android.gms.tagmanager;

import java.util.Arrays;

final class d
{
  public final String a;
  public final Object b;

  d(String paramString, Object paramObject)
  {
    this.a = paramString;
    this.b = paramObject;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof d));
    d locald;
    do
    {
      return false;
      locald = (d)paramObject;
    }
    while ((!this.a.equals(locald.a)) || (!this.b.equals(locald.b)));
    return true;
  }

  public final int hashCode()
  {
    Integer[] arrayOfInteger = new Integer[2];
    arrayOfInteger[0] = Integer.valueOf(this.a.hashCode());
    arrayOfInteger[1] = Integer.valueOf(this.b.hashCode());
    return Arrays.hashCode(arrayOfInteger);
  }

  public final String toString()
  {
    return "Key: " + this.a + " value: " + this.b.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.tagmanager.d
 * JD-Core Version:    0.6.0
 */