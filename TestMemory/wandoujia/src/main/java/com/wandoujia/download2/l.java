package com.wandoujia.download2;

import java.util.Arrays;

final class l
{
  private long[] a = new long[5];
  private int b;
  private long c;

  final long a(long paramLong)
  {
    int i = 1 + this.b;
    this.b = i;
    int j = i % 5;
    this.a[j] = paramLong;
    long l1 = 0L;
    long[] arrayOfLong = this.a;
    int k = arrayOfLong.length;
    for (int m = 0; m < k; m++)
      l1 += arrayOfLong[m];
    long l2;
    if (this.b < 5)
      l2 = l1 * 2L / this.b;
    while (true)
    {
      this.c = l2;
      return this.c;
      l2 = l1 * 2L / 5L;
    }
  }

  final void a()
  {
    Arrays.fill(this.a, 0L);
    this.b = 0;
    this.c = 0L;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.download2.l
 * JD-Core Version:    0.6.0
 */