package com.google.android.gms.ads.internal.appcontent;

import com.google.android.gms.ads.internal.report.client.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

@a
public final class n extends i
{
  private MessageDigest b;

  public final byte[] a(String paramString)
  {
    int i = 0;
    String[] arrayOfString = paramString.split(" ");
    Object localObject1;
    if (arrayOfString.length == 1)
    {
      int i2 = m.a(arrayOfString[0]);
      ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
      localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
      localByteBuffer.putInt(i2);
      localObject1 = localByteBuffer.array();
      this.b = a();
    }
    while (true)
    {
      byte[] arrayOfByte2;
      synchronized (this.a)
      {
        if (this.b != null)
          continue;
        byte[] arrayOfByte1 = new byte[0];
        return arrayOfByte1;
        if (arrayOfString.length >= 5)
          continue;
        byte[] arrayOfByte4 = new byte[arrayOfString.length << 1];
        int m = 0;
        if (m >= arrayOfString.length)
          continue;
        int n = m.a(arrayOfString[m]);
        int i1 = 0xFFFF & n ^ n >> 16;
        byte[] arrayOfByte5 = new byte[2];
        arrayOfByte5[0] = (byte)i1;
        arrayOfByte5[1] = (byte)(i1 >> 8);
        arrayOfByte4[(m << 1)] = arrayOfByte5[0];
        arrayOfByte4[(1 + (m << 1))] = arrayOfByte5[1];
        m++;
        continue;
        localObject1 = arrayOfByte4;
        break;
        localObject1 = new byte[arrayOfString.length];
        if (i >= arrayOfString.length)
          break;
        int j = m.a(arrayOfString[i]);
        localObject1[i] = (byte)(j & 0xFF ^ 0xFF & j >> 8 ^ 0xFF & j >> 16 ^ j >> 24);
        i++;
        continue;
        this.b.reset();
        this.b.update(localObject1);
        arrayOfByte2 = this.b.digest();
        if (arrayOfByte2.length > 4)
        {
          k = 4;
          byte[] arrayOfByte3 = new byte[k];
          System.arraycopy(arrayOfByte2, 0, arrayOfByte3, 0, arrayOfByte3.length);
          return arrayOfByte3;
        }
      }
      int k = arrayOfByte2.length;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.appcontent.n
 * JD-Core Version:    0.6.0
 */