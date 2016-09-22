package com.wandoujia.gson.internal;

import java.math.BigDecimal;

public final class LazilyParsedNumber extends Number
{
  private final String value;

  public LazilyParsedNumber(String paramString)
  {
    this.value = paramString;
  }

  private Object writeReplace()
  {
    return new BigDecimal(this.value);
  }

  public final double doubleValue()
  {
    return Double.parseDouble(this.value);
  }

  public final float floatValue()
  {
    return Float.parseFloat(this.value);
  }

  public final int intValue()
  {
    try
    {
      int i = Integer.parseInt(this.value);
      return i;
    }
    catch (NumberFormatException localNumberFormatException1)
    {
      try
      {
        long l = Long.parseLong(this.value);
        return (int)l;
      }
      catch (NumberFormatException localNumberFormatException2)
      {
      }
    }
    return new BigDecimal(this.value).intValue();
  }

  public final long longValue()
  {
    try
    {
      long l = Long.parseLong(this.value);
      return l;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return new BigDecimal(this.value).longValue();
  }

  public final String toString()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.LazilyParsedNumber
 * JD-Core Version:    0.6.0
 */