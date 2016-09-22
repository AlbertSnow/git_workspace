package com.google.zxing.oned.rss.expanded;

import com.google.zxing.oned.rss.b;
import com.google.zxing.oned.rss.c;

final class a
{
  private final b a;
  private final b b;
  private final c c;

  a(b paramb1, b paramb2, c paramc)
  {
    this.a = paramb1;
    this.b = paramb2;
    this.c = paramc;
  }

  private static int a(Object paramObject)
  {
    if (paramObject == null)
      return 0;
    return paramObject.hashCode();
  }

  private static boolean a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null)
      return paramObject2 == null;
    return paramObject1.equals(paramObject2);
  }

  final b a()
  {
    return this.a;
  }

  final b b()
  {
    return this.b;
  }

  final c c()
  {
    return this.c;
  }

  public final boolean d()
  {
    return this.b == null;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a));
    a locala;
    do
    {
      return false;
      locala = (a)paramObject;
    }
    while ((!a(this.a, locala.a)) || (!a(this.b, locala.b)) || (!a(this.c, locala.c)));
    return true;
  }

  public final int hashCode()
  {
    return a(this.a) ^ a(this.b) ^ a(this.c);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("[ ").append(this.a).append(" , ").append(this.b).append(" : ");
    if (this.c == null);
    for (Object localObject = "null"; ; localObject = Integer.valueOf(this.c.a()))
      return localObject + " ]";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.rss.expanded.a
 * JD-Core Version:    0.6.0
 */