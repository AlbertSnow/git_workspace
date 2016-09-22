package com.google.android.gms.tagmanager;

import java.util.Arrays;

final class ao
{
  final String a;
  final byte[] b;

  ao(String paramString, byte[] paramArrayOfByte)
  {
    this.a = paramString;
    this.b = paramArrayOfByte;
  }

  public final String toString()
  {
    return "KeyAndSerialized: key = " + this.a + " serialized hash = " + Arrays.hashCode(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.tagmanager.ao
 * JD-Core Version:    0.6.0
 */