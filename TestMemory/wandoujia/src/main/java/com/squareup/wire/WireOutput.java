package com.squareup.wire;

import java.io.IOException;

public final class WireOutput
{
  private final byte[] buffer;
  private final int limit;
  private int position;

  private WireOutput(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.buffer = paramArrayOfByte;
    this.position = paramInt1;
    this.limit = (paramInt1 + paramInt2);
  }

  public static int int32Size(int paramInt)
  {
    if (paramInt >= 0)
      return varint32Size(paramInt);
    return 10;
  }

  public static int int64Size(long paramLong)
  {
    if (paramLong >= 0L)
      return varint64Size(paramLong);
    return 10;
  }

  public static int makeTag(int paramInt, WireType paramWireType)
  {
    return paramInt << 3 | paramWireType.value();
  }

  public static int messageHeaderSize(int paramInt1, int paramInt2)
  {
    return tagSize(paramInt1, WireType.LENGTH_DELIMITED) + int32Size(paramInt2);
  }

  public static int messageSize(int paramInt1, int paramInt2)
  {
    return paramInt2 + (tagSize(paramInt1, WireType.LENGTH_DELIMITED) + int32Size(paramInt2));
  }

  static WireOutput newInstance(byte[] paramArrayOfByte)
  {
    return newInstance(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  static WireOutput newInstance(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new WireOutput(paramArrayOfByte, paramInt1, paramInt2);
  }

  public static int tagSize(int paramInt, WireType paramWireType)
  {
    return int32Size(makeTag(paramInt, paramWireType));
  }

  static int varint32Size(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0)
      return 1;
    if ((paramInt & 0xFFFFC000) == 0)
      return 2;
    if ((0xFFE00000 & paramInt) == 0)
      return 3;
    if ((0xF0000000 & paramInt) == 0)
      return 4;
    return 5;
  }

  static int varint64Size(long paramLong)
  {
    if ((0xFFFFFF80 & paramLong) == 0L)
      return 1;
    if ((0xFFFFC000 & paramLong) == 0L)
      return 2;
    if ((0xFFE00000 & paramLong) == 0L)
      return 3;
    if ((0xF0000000 & paramLong) == 0L)
      return 4;
    if ((0x0 & paramLong) == 0L)
      return 5;
    if ((0x0 & paramLong) == 0L)
      return 6;
    if ((0x0 & paramLong) == 0L)
      return 7;
    if ((0x0 & paramLong) == 0L)
      return 8;
    if ((0x0 & paramLong) == 0L)
      return 9;
    return 10;
  }

  static int varintTagSize(int paramInt)
  {
    return varint32Size(makeTag(paramInt, WireType.VARINT));
  }

  public static int writeMessageHeader(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = paramInt2 + writeTag(paramInt1, WireType.LENGTH_DELIMITED, paramArrayOfByte, paramInt2);
    return i + writeVarint(paramInt3, paramArrayOfByte, i) - paramInt2;
  }

  public static int writeTag(int paramInt1, WireType paramWireType, byte[] paramArrayOfByte, int paramInt2)
  {
    return writeVarint(makeTag(paramInt1, paramWireType), paramArrayOfByte, paramInt2);
  }

  public static int writeVarint(long paramLong, byte[] paramArrayOfByte, int paramInt)
  {
    int j;
    for (int i = paramInt; ; i = j)
    {
      if ((0xFFFFFF80 & paramLong) == 0L)
      {
        int k = i + 1;
        paramArrayOfByte[i] = (byte)(int)paramLong;
        return k - paramInt;
      }
      j = i + 1;
      paramArrayOfByte[i] = (byte)(int)(0x80 | 0x7F & paramLong);
      paramLong >>>= 7;
    }
  }

  static int zigZag32(int paramInt)
  {
    return paramInt << 1 ^ paramInt >> 31;
  }

  static long zigZag64(long paramLong)
  {
    return paramLong << 1 ^ paramLong >> 63;
  }

  final void writeFixed32(int paramInt)
  {
    writeRawByte(paramInt & 0xFF);
    writeRawByte(0xFF & paramInt >> 8);
    writeRawByte(0xFF & paramInt >> 16);
    writeRawByte(0xFF & paramInt >> 24);
  }

  final void writeFixed64(long paramLong)
  {
    writeRawByte(0xFF & (int)paramLong);
    writeRawByte(0xFF & (int)(paramLong >> 8));
    writeRawByte(0xFF & (int)(paramLong >> 16));
    writeRawByte(0xFF & (int)(paramLong >> 24));
    writeRawByte(0xFF & (int)(paramLong >> 32));
    writeRawByte(0xFF & (int)(paramLong >> 40));
    writeRawByte(0xFF & (int)(paramLong >> 48));
    writeRawByte(0xFF & (int)(paramLong >> 56));
  }

  final void writeRawByte(byte paramByte)
  {
    if (this.position == this.limit)
      throw new IOException("Out of space: position=" + this.position + ", limit=" + this.limit);
    byte[] arrayOfByte = this.buffer;
    int i = this.position;
    this.position = (i + 1);
    arrayOfByte[i] = paramByte;
  }

  final void writeRawByte(int paramInt)
  {
    writeRawByte((byte)paramInt);
  }

  final void writeRawBytes(byte[] paramArrayOfByte)
  {
    writeRawBytes(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  final void writeRawBytes(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.limit - this.position >= paramInt2)
    {
      System.arraycopy(paramArrayOfByte, paramInt1, this.buffer, this.position, paramInt2);
      this.position = (paramInt2 + this.position);
      return;
    }
    throw new IOException("Out of space: position=" + this.position + ", limit=" + this.limit);
  }

  final void writeSignedVarint32(int paramInt)
  {
    if (paramInt >= 0)
    {
      writeVarint32(paramInt);
      return;
    }
    writeVarint64(paramInt);
  }

  final void writeTag(int paramInt, WireType paramWireType)
  {
    writeVarint32(makeTag(paramInt, paramWireType));
  }

  final void writeVarint32(int paramInt)
  {
    while (true)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        writeRawByte(paramInt);
        return;
      }
      writeRawByte(0x80 | paramInt & 0x7F);
      paramInt >>>= 7;
    }
  }

  final void writeVarint64(long paramLong)
  {
    while (true)
    {
      if ((0xFFFFFF80 & paramLong) == 0L)
      {
        writeRawByte((int)paramLong);
        return;
      }
      writeRawByte(0x80 | 0x7F & (int)paramLong);
      paramLong >>>= 7;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.WireOutput
 * JD-Core Version:    0.6.0
 */