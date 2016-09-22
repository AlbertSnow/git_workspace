package com.google.android.gms.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class zzaa extends ByteArrayOutputStream
{
  private final zzu zzar;

  public zzaa(zzu paramzzu, int paramInt)
  {
    this.zzar = paramzzu;
    this.buf = this.zzar.zzb(Math.max(paramInt, 256));
  }

  public void close()
    throws IOException
  {
    this.zzar.zza(this.buf);
    this.buf = null;
    super.close();
  }

  public void finalize()
  {
    this.zzar.zza(this.buf);
  }

  private void zzd(int paramInt)
  {
    if (this.count + paramInt <= this.buf.length)
      return;
    byte[] arrayOfByte = this.zzar.zzb((this.count + paramInt) * 2);
    System.arraycopy(this.buf, 0, arrayOfByte, 0, this.count);
    this.zzar.zza(this.buf);
    this.buf = arrayOfByte;
  }

  public synchronized void write(byte[] buffer, int offset, int len)
  {
    zzd(len);
    super.write(buffer, offset, len);
  }

  public synchronized void write(int oneByte)
  {
    zzd(1);
    super.write(oneByte);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzaa
 * JD-Core Version:    0.6.0
 */