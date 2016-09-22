package com.google.android.gms.internal;

public class zzsl
{
  private final byte[] zzbtW = new byte[256];
  private int zzbtX;
  private int zzbtY;

  public zzsl(byte[] paramArrayOfByte)
  {
    for (int i = 0; i < 256; i++)
      this.zzbtW[i] = (byte)i;
    i = 0;
    int j = 0;
    while (i < 256)
    {
      j = j + this.zzbtW[i] + paramArrayOfByte[(i % paramArrayOfByte.length)] & 0xFF;
      int k = this.zzbtW[i];
      this.zzbtW[i] = this.zzbtW[j];
      this.zzbtW[j] = k;
      i++;
    }
    this.zzbtX = 0;
    this.zzbtY = 0;
  }

  public void zzC(byte[] paramArrayOfByte)
  {
    int i = this.zzbtX;
    int j = this.zzbtY;
    for (int k = 0; k < paramArrayOfByte.length; k++)
    {
      i = i + 1 & 0xFF;
      j = j + this.zzbtW[i] & 0xFF;
      int m = this.zzbtW[i];
      this.zzbtW[i] = this.zzbtW[j];
      this.zzbtW[j] = m;
      int tmp72_70 = k;
      byte[] tmp72_69 = paramArrayOfByte;
      tmp72_69[tmp72_70] = (byte)(tmp72_69[tmp72_70] ^ this.zzbtW[(this.zzbtW[i] + this.zzbtW[j] & 0xFF)]);
    }
    this.zzbtX = i;
    this.zzbtY = j;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzsl
 * JD-Core Version:    0.6.0
 */