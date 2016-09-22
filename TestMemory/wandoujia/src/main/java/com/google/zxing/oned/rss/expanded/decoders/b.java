package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.a;

final class b extends f
{
  b(a parama)
  {
    super(parama);
  }

  protected final int a(int paramInt)
  {
    if (paramInt < 10000)
      return paramInt;
    return paramInt - 10000;
  }

  protected final void a(StringBuilder paramStringBuilder, int paramInt)
  {
    if (paramInt < 10000)
    {
      paramStringBuilder.append("(3202)");
      return;
    }
    paramStringBuilder.append("(3203)");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.rss.expanded.decoders.b
 * JD-Core Version:    0.6.0
 */