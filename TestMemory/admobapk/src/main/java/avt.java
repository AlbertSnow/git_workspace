import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class avt
{
  final ByteBuffer a;

  private avt(ByteBuffer paramByteBuffer)
  {
    this.a = paramByteBuffer;
    this.a.order(ByteOrder.LITTLE_ENDIAN);
  }

  private avt(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this(ByteBuffer.wrap(paramArrayOfByte, paramInt1, paramInt2));
  }

  public static int a(int paramInt)
  {
    if (paramInt >= 0)
      return d(paramInt);
    return 10;
  }

  private static int a(CharSequence paramCharSequence)
  {
    int i = 0;
    int j = paramCharSequence.length();
    for (int k = 0; (k < j) && (paramCharSequence.charAt(k) < ''); k++);
    while (true)
    {
      if (k < j)
      {
        int i1 = paramCharSequence.charAt(k);
        if (i1 < 2048)
        {
          m += (127 - i1 >>> 31);
          k++;
          continue;
        }
        int i2 = paramCharSequence.length();
        if (k < i2)
        {
          int i3 = paramCharSequence.charAt(k);
          if (i3 < 2048)
            i += (127 - i3 >>> 31);
          while (true)
          {
            k++;
            break;
            i += 2;
            if ((55296 > i3) || (i3 > 57343))
              continue;
            if (Character.codePointAt(paramCharSequence, k) < 65536)
              throw new IllegalArgumentException(39 + "Unpaired surrogate at index " + k);
            k++;
          }
        }
      }
      for (int n = m + i; ; n = m)
      {
        if (n < j)
        {
          long l = 4294967296L + n;
          throw new IllegalArgumentException(54 + "UTF-8 length does not fit in int: " + l);
        }
        return n;
      }
      int m = j;
    }
  }

  private static int a(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramCharSequence.length();
    int j = 0;
    int k = paramInt1 + paramInt2;
    while ((j < i) && (j + paramInt1 < k))
    {
      int i10 = paramCharSequence.charAt(j);
      if (i10 >= 128)
        break;
      paramArrayOfByte[(paramInt1 + j)] = (byte)i10;
      j++;
    }
    if (j == i)
      return paramInt1 + i;
    int m = paramInt1 + j;
    if (j < i)
    {
      int n = paramCharSequence.charAt(j);
      int i6;
      if ((n < 128) && (m < k))
      {
        i6 = m + 1;
        paramArrayOfByte[m] = (byte)n;
      }
      while (true)
      {
        j++;
        m = i6;
        break;
        if ((n < 2048) && (m <= k - 2))
        {
          int i9 = m + 1;
          paramArrayOfByte[m] = (byte)(0x3C0 | n >>> 6);
          i6 = i9 + 1;
          paramArrayOfByte[i9] = (byte)(0x80 | n & 0x3F);
          continue;
        }
        if (((n < 55296) || (57343 < n)) && (m <= k - 3))
        {
          int i7 = m + 1;
          paramArrayOfByte[m] = (byte)(0x1E0 | n >>> 12);
          int i8 = i7 + 1;
          paramArrayOfByte[i7] = (byte)(0x80 | 0x3F & n >>> 6);
          i6 = i8 + 1;
          paramArrayOfByte[i8] = (byte)(0x80 | n & 0x3F);
          continue;
        }
        if (m > k - 4)
          break label466;
        char c;
        if (j + 1 != paramCharSequence.length())
        {
          j++;
          c = paramCharSequence.charAt(j);
          if (Character.isSurrogatePair(n, c));
        }
        else
        {
          int i1 = j - 1;
          throw new IllegalArgumentException(39 + "Unpaired surrogate at index " + i1);
        }
        int i2 = Character.toCodePoint(n, c);
        int i3 = m + 1;
        paramArrayOfByte[m] = (byte)(0xF0 | i2 >>> 18);
        int i4 = i3 + 1;
        paramArrayOfByte[i3] = (byte)(0x80 | 0x3F & i2 >>> 12);
        int i5 = i4 + 1;
        paramArrayOfByte[i4] = (byte)(0x80 | 0x3F & i2 >>> 6);
        i6 = i5 + 1;
        paramArrayOfByte[i5] = (byte)(0x80 | i2 & 0x3F);
      }
      label466: throw new ArrayIndexOutOfBoundsException(37 + "Failed writing " + n + " at index " + m);
    }
    return m;
  }

  public static int a(String paramString)
  {
    int i = a(paramString);
    return i + d(i);
  }

  public static int a(byte[] paramArrayOfByte)
  {
    return d(paramArrayOfByte.length) + paramArrayOfByte.length;
  }

  public static avt a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new avt(paramArrayOfByte, paramInt1, paramInt2);
  }

  private static void a(CharSequence paramCharSequence, ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer.isReadOnly())
      throw new ReadOnlyBufferException();
    if (paramByteBuffer.hasArray())
      try
      {
        paramByteBuffer.position(a(paramCharSequence, paramByteBuffer.array(), paramByteBuffer.arrayOffset() + paramByteBuffer.position(), paramByteBuffer.remaining()) - paramByteBuffer.arrayOffset());
        return;
      }
      catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
      {
        BufferOverflowException localBufferOverflowException = new BufferOverflowException();
        localBufferOverflowException.initCause(localArrayIndexOutOfBoundsException);
        throw localBufferOverflowException;
      }
    b(paramCharSequence, paramByteBuffer);
  }

  public static int b(int paramInt)
  {
    return d(0x0 | paramInt << 3);
  }

  public static int b(int paramInt, long paramLong)
  {
    return b(paramInt) + b(paramLong);
  }

  public static int b(int paramInt, awb paramawb)
  {
    int i = b(paramInt);
    int j = paramawb.e();
    return i + (j + d(j));
  }

  public static int b(int paramInt, String paramString)
  {
    return b(paramInt) + a(paramString);
  }

  public static int b(int paramInt, byte[] paramArrayOfByte)
  {
    return b(paramInt) + a(paramArrayOfByte);
  }

  public static int b(long paramLong)
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

  private static void b(CharSequence paramCharSequence, ByteBuffer paramByteBuffer)
  {
    int i = paramCharSequence.length();
    int j = 0;
    if (j < i)
    {
      int k = paramCharSequence.charAt(j);
      if (k < 128)
        paramByteBuffer.put((byte)k);
      while (true)
      {
        j++;
        break;
        if (k < 2048)
        {
          paramByteBuffer.put((byte)(0x3C0 | k >>> 6));
          paramByteBuffer.put((byte)(0x80 | k & 0x3F));
          continue;
        }
        if ((k < 55296) || (57343 < k))
        {
          paramByteBuffer.put((byte)(0x1E0 | k >>> 12));
          paramByteBuffer.put((byte)(0x80 | 0x3F & k >>> 6));
          paramByteBuffer.put((byte)(0x80 | k & 0x3F));
          continue;
        }
        char c;
        if (j + 1 != paramCharSequence.length())
        {
          j++;
          c = paramCharSequence.charAt(j);
          if (Character.isSurrogatePair(k, c));
        }
        else
        {
          int m = j - 1;
          throw new IllegalArgumentException(39 + "Unpaired surrogate at index " + m);
        }
        int n = Character.toCodePoint(k, c);
        paramByteBuffer.put((byte)(0xF0 | n >>> 18));
        paramByteBuffer.put((byte)(0x80 | 0x3F & n >>> 12));
        paramByteBuffer.put((byte)(0x80 | 0x3F & n >>> 6));
        paramByteBuffer.put((byte)(0x80 | n & 0x3F));
      }
    }
  }

  public static int c(int paramInt1, int paramInt2)
  {
    return b(paramInt1) + a(paramInt2);
  }

  public static int d(int paramInt)
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

  public static int d(int paramInt1, int paramInt2)
  {
    return b(paramInt1) + d(paramInt2);
  }

  public static long d(long paramLong)
  {
    return paramLong << 1 ^ paramLong >> 63;
  }

  private void e(int paramInt)
  {
    byte b = (byte)paramInt;
    if (!this.a.hasRemaining())
      throw new avu(this.a.position(), this.a.limit());
    this.a.put(b);
  }

  public final void a(int paramInt, double paramDouble)
  {
    e(paramInt, 1);
    c(Double.doubleToLongBits(paramDouble));
  }

  public final void a(int paramInt, float paramFloat)
  {
    e(paramInt, 5);
    int i = Float.floatToIntBits(paramFloat);
    if (this.a.remaining() < 4)
      throw new avu(this.a.position(), this.a.limit());
    this.a.putInt(i);
  }

  public final void a(int paramInt1, int paramInt2)
  {
    e(paramInt1, 0);
    if (paramInt2 >= 0)
    {
      c(paramInt2);
      return;
    }
    a(paramInt2);
  }

  public final void a(int paramInt, long paramLong)
  {
    e(paramInt, 0);
    a(paramLong);
  }

  public final void a(int paramInt, awb paramawb)
  {
    e(paramInt, 2);
    if (paramawb.I < 0)
      paramawb.e();
    c(paramawb.I);
    paramawb.a(this);
  }

  public final void a(int paramInt, String paramString)
  {
    e(paramInt, 2);
    int i;
    int j;
    try
    {
      i = d(paramString.length());
      if (i != d(3 * paramString.length()))
        break label167;
      j = this.a.position();
      if (this.a.remaining() < i)
        throw new avu(i + j, this.a.limit());
    }
    catch (BufferOverflowException localBufferOverflowException)
    {
      avu localavu = new avu(this.a.position(), this.a.limit());
      localavu.initCause(localBufferOverflowException);
      throw localavu;
    }
    this.a.position(j + i);
    a(paramString, this.a);
    int k = this.a.position();
    this.a.position(j);
    c(k - j - i);
    this.a.position(k);
    return;
    label167: c(a(paramString));
    a(paramString, this.a);
  }

  public final void a(int paramInt, boolean paramBoolean)
  {
    e(paramInt, 0);
    int i = 0;
    if (paramBoolean)
      i = 1;
    byte b = (byte)i;
    if (!this.a.hasRemaining())
      throw new avu(this.a.position(), this.a.limit());
    this.a.put(b);
  }

  public final void a(int paramInt, byte[] paramArrayOfByte)
  {
    e(paramInt, 2);
    c(paramArrayOfByte.length);
    b(paramArrayOfByte);
  }

  public final void a(long paramLong)
  {
    while (true)
    {
      if ((0xFFFFFF80 & paramLong) == 0L)
      {
        e((int)paramLong);
        return;
      }
      e(0x80 | 0x7F & (int)paramLong);
      paramLong >>>= 7;
    }
  }

  public final void b(int paramInt1, int paramInt2)
  {
    e(paramInt1, 0);
    c(paramInt2);
  }

  public final void b(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    if (this.a.remaining() >= i)
    {
      this.a.put(paramArrayOfByte, 0, i);
      return;
    }
    throw new avu(this.a.position(), this.a.limit());
  }

  public final void c(int paramInt)
  {
    while (true)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        e(paramInt);
        return;
      }
      e(0x80 | paramInt & 0x7F);
      paramInt >>>= 7;
    }
  }

  public final void c(long paramLong)
  {
    if (this.a.remaining() < 8)
      throw new avu(this.a.position(), this.a.limit());
    this.a.putLong(paramLong);
  }

  public final void e(int paramInt1, int paramInt2)
  {
    c(paramInt2 | paramInt1 << 3);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     avt
 * JD-Core Version:    0.6.0
 */