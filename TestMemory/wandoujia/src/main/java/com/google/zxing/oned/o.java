package com.google.zxing.oned;

import com.google.zxing.ReaderException;
import com.google.zxing.common.a;
import com.google.zxing.e;

final class o
{
  private static final int[] a = { 1, 1, 2 };
  private final m b = new m();
  private final n c = new n();

  final e a(int paramInt1, a parama, int paramInt2)
  {
    int[] arrayOfInt = p.a(parama, paramInt2, false, a);
    try
    {
      e locale = this.c.a(paramInt1, parama, arrayOfInt);
      return locale;
    }
    catch (ReaderException localReaderException)
    {
    }
    return this.b.a(paramInt1, parama, arrayOfInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.o
 * JD-Core Version:    0.6.0
 */