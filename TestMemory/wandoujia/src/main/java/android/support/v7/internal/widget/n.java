package android.support.v7.internal.widget;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

public final class n
  implements Comparable<n>
{
  public final ResolveInfo a;

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    do
    {
      return true;
      if (paramObject == null)
        return false;
      if (getClass() != paramObject.getClass())
        return false;
    }
    while (Float.floatToIntBits(0.0F) == Float.floatToIntBits(0.0F));
    return false;
  }

  public final int hashCode()
  {
    return 31 + Float.floatToIntBits(0.0F);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    localStringBuilder.append("resolveInfo:").append(this.a.toString());
    localStringBuilder.append("; weight:").append(new BigDecimal(0.0D));
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.n
 * JD-Core Version:    0.6.0
 */