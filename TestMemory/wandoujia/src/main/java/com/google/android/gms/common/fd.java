package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class fd extends e
{
  private static final WeakReference<byte[]> b = new WeakReference(null);
  private WeakReference<byte[]> a = b;

  fd(byte[] paramArrayOfByte)
  {
    super(paramArrayOfByte);
  }

  final byte[] a()
  {
    monitorenter;
    try
    {
      byte[] arrayOfByte = (byte[])this.a.get();
      if (arrayOfByte == null)
      {
        arrayOfByte = b();
        this.a = new WeakReference(arrayOfByte);
      }
      return arrayOfByte;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  protected abstract byte[] b();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.fd
 * JD-Core Version:    0.6.0
 */