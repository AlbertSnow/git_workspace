package com.google.android.gms.internal;

import java.nio.ByteBuffer;

public final class zzrg
{
  private final ByteBuffer a;

  private zzrg(ByteBuffer paramByteBuffer)
  {
    this.a = paramByteBuffer;
  }

  private zzrg(byte[] paramArrayOfByte, int paramInt)
  {
    this(ByteBuffer.wrap(paramArrayOfByte, 0, paramInt));
  }

  public static zzrg a(byte[] paramArrayOfByte)
  {
    return new zzrg(paramArrayOfByte, paramArrayOfByte.length);
  }

  private void b(int paramInt)
  {
    byte b = (byte)paramInt;
    if (!this.a.hasRemaining())
      throw new zzrg.zza(this.a.position(), this.a.limit());
    this.a.put(b);
  }

  public final void a(int paramInt)
  {
    while (true)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        b(paramInt);
        return;
      }
      b(0x80 | paramInt & 0x7F);
      paramInt >>>= 7;
    }
  }

  public final void b(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    if (this.a.remaining() >= i)
    {
      this.a.put(paramArrayOfByte, 0, i);
      return;
    }
    throw new zzrg.zza(this.a.position(), this.a.limit());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.zzrg
 * JD-Core Version:    0.6.0
 */