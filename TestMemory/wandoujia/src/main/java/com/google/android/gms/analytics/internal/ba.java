package com.google.android.gms.analytics.internal;

import android.support.v4.app.d;
import com.google.android.gms.internal.i;

public final class ba<V>
{
  private final V a;

  private ba(i<V> parami, V paramV)
  {
    d.a(parami);
    this.a = paramV;
  }

  static ba<Float> a(String paramString)
  {
    return new ba(i.a(paramString, Float.valueOf(0.5F)), Float.valueOf(0.5F));
  }

  static ba<Integer> a(String paramString, int paramInt)
  {
    return a(paramString, paramInt, paramInt);
  }

  static ba<Integer> a(String paramString, int paramInt1, int paramInt2)
  {
    return new ba(i.a(paramString, Integer.valueOf(paramInt2)), Integer.valueOf(paramInt1));
  }

  static ba<Long> a(String paramString, long paramLong)
  {
    return a(paramString, paramLong, paramLong);
  }

  static ba<Long> a(String paramString, long paramLong1, long paramLong2)
  {
    return new ba(i.a(paramString, Long.valueOf(paramLong2)), Long.valueOf(paramLong1));
  }

  static ba<String> a(String paramString1, String paramString2)
  {
    return a(paramString1, paramString2, paramString2);
  }

  static ba<String> a(String paramString1, String paramString2, String paramString3)
  {
    return new ba(i.a(paramString1, paramString3), paramString2);
  }

  static ba<Boolean> a(String paramString, boolean paramBoolean)
  {
    return new ba(i.a(paramString, paramBoolean), Boolean.valueOf(paramBoolean));
  }

  public final V a()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.ba
 * JD-Core Version:    0.6.0
 */