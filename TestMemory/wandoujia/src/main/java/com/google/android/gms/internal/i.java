package com.google.android.gms.internal;

public abstract class i<T>
{
  static
  {
    new Object();
  }

  public static i<Float> a(String paramString, Float paramFloat)
  {
    return new m(paramString);
  }

  public static i<Integer> a(String paramString, Integer paramInteger)
  {
    return new l(paramString);
  }

  public static i<Long> a(String paramString, Long paramLong)
  {
    return new k(paramString);
  }

  public static i<String> a(String paramString1, String paramString2)
  {
    return new n(paramString1);
  }

  public static i<Boolean> a(String paramString, boolean paramBoolean)
  {
    Boolean.valueOf(paramBoolean);
    return new j(paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.i
 * JD-Core Version:    0.6.0
 */