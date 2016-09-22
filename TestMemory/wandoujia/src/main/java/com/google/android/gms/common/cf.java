package com.google.android.gms.common;

import java.util.Arrays;

final class cf extends e
{
  private final byte[] a;

  cf(byte[] paramArrayOfByte)
  {
    super(Arrays.copyOfRange(paramArrayOfByte, 0, 25));
    this.a = paramArrayOfByte;
  }

  final byte[] a()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.cf
 * JD-Core Version:    0.6.0
 */