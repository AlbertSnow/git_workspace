import android.util.Pair;

public final class lq
{
  private static final byte[] a = { 0, 0, 0, 1 };
  private static final int[] b = { 96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350 };

  public static Pair a(byte[] paramArrayOfByte)
  {
    boolean bool1 = true;
    int i = 0x1F & paramArrayOfByte[0] >> 3;
    boolean bool2;
    int j;
    if ((i == 5) || (i == 29))
    {
      bool2 = bool1;
      j = (0x7 & paramArrayOfByte[bool2]) << 1 | 0x1 & paramArrayOfByte[(bool2 + true)] >> 7;
      if (j >= 13)
        break label95;
    }
    while (true)
    {
      lp.b(bool1);
      int k = b[j];
      int m = 0xF & paramArrayOfByte[(bool2 + true)] >> 3;
      return Pair.create(Integer.valueOf(k), Integer.valueOf(m));
      bool2 = false;
      break;
      label95: bool1 = false;
    }
  }

  public static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2 + a.length];
    System.arraycopy(a, 0, arrayOfByte, 0, a.length);
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, a.length, paramInt2);
    return arrayOfByte;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     lq
 * JD-Core Version:    0.6.0
 */