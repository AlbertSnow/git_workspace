package com.google.android.gms.internal;

import java.security.MessageDigest;

@zzhb
public class zzbj extends zzbg
{
  private MessageDigest zztw;

  public byte[] zzu(String paramString)
  {
    String[] arrayOfString = paramString.split(" ");
    byte[] arrayOfByte1 = zza(arrayOfString);
    this.zztw = zzcL();
    synchronized (this.zzpV)
    {
      if (this.zztw == null)
        return new byte[0];
      this.zztw.reset();
      this.zztw.update(arrayOfByte1);
      byte[] arrayOfByte2 = this.zztw.digest();
      int i = 4;
      byte[] arrayOfByte3 = new byte[arrayOfByte2.length > i ? i : arrayOfByte2.length];
      System.arraycopy(arrayOfByte2, 0, arrayOfByte3, 0, arrayOfByte3.length);
      return arrayOfByte3;
    }
  }

  byte[] zza(String[] paramArrayOfString)
  {
    byte[] arrayOfByte = new byte[paramArrayOfString.length];
    for (int i = 0; i < paramArrayOfString.length; i++)
      arrayOfByte[i] = zzk(zzbi.zzx(paramArrayOfString[i]));
    return arrayOfByte;
  }

  byte zzk(int paramInt)
  {
    int i = paramInt & 0xFF ^ (paramInt & 0xFF00) >> 8 ^ (paramInt & 0xFF0000) >> 16 ^ (paramInt & 0xFF000000) >> 24;
    return (byte)i;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzbj
 * JD-Core Version:    0.6.0
 */