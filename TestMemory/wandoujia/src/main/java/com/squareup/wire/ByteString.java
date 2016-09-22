package com.squareup.wire;

import B;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public final class ByteString
{
  public static final ByteString EMPTY = of(new byte[0]);
  private final byte[] data;
  private transient int hashCode;

  private ByteString(byte[] paramArrayOfByte)
  {
    this.data = paramArrayOfByte;
  }

  public static ByteString of(String paramString)
  {
    return new ByteString(l.a(paramString));
  }

  public static ByteString of(byte[] paramArrayOfByte)
  {
    return new ByteString((byte[])paramArrayOfByte.clone());
  }

  public static ByteString of(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
    return new ByteString(arrayOfByte);
  }

  public static ByteString read(InputStream paramInputStream, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    int i = 0;
    while (i < paramInt)
    {
      int j = paramInputStream.read(arrayOfByte, i, paramInt - i);
      if (j == -1)
        throw new EOFException("Expected " + paramInt + "; received " + i);
      i += j;
    }
    return new ByteString(arrayOfByte);
  }

  public final byte byteAt(int paramInt)
  {
    return this.data[paramInt];
  }

  public final boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof ByteString)) && (Arrays.equals(((ByteString)paramObject).data, this.data)));
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i != 0)
      return i;
    int j = Arrays.hashCode(this.data);
    this.hashCode = j;
    return j;
  }

  public final int size()
  {
    return this.data.length;
  }

  public final byte[] toByteArray()
  {
    return (byte[])this.data.clone();
  }

  public final String toString()
  {
    return l.a(this.data);
  }

  public final void write(OutputStream paramOutputStream)
  {
    paramOutputStream.write(this.data);
  }

  public final void write(OutputStream paramOutputStream, int paramInt1, int paramInt2)
  {
    paramOutputStream.write(this.data, paramInt1, paramInt2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.ByteString
 * JD-Core Version:    0.6.0
 */