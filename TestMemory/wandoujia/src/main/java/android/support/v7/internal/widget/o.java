package android.support.v7.internal.widget;

import android.content.ComponentName;
import java.math.BigDecimal;

public final class o
{
  public final ComponentName a;
  public final long b;
  public final float c;

  public o(ComponentName paramComponentName, long paramLong, float paramFloat)
  {
    this.a = paramComponentName;
    this.b = paramLong;
    this.c = paramFloat;
  }

  public o(String paramString, long paramLong, float paramFloat)
  {
    this(ComponentName.unflattenFromString(paramString), paramLong, paramFloat);
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    o localo;
    do
    {
      return true;
      if (paramObject == null)
        return false;
      if (getClass() != paramObject.getClass())
        return false;
      localo = (o)paramObject;
      if (this.a == null)
      {
        if (localo.a != null)
          return false;
      }
      else if (!this.a.equals(localo.a))
        return false;
      if (this.b != localo.b)
        return false;
    }
    while (Float.floatToIntBits(this.c) == Float.floatToIntBits(localo.c));
    return false;
  }

  public final int hashCode()
  {
    if (this.a == null);
    for (int i = 0; ; i = this.a.hashCode())
      return 31 * (31 * (i + 31) + (int)(this.b ^ this.b >>> 32)) + Float.floatToIntBits(this.c);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    localStringBuilder.append("; activity:").append(this.a);
    localStringBuilder.append("; time:").append(this.b);
    localStringBuilder.append("; weight:").append(new BigDecimal(this.c));
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.o
 * JD-Core Version:    0.6.0
 */