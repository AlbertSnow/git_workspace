import java.nio.charset.Charset;
import java.util.Arrays;

public final class avz
{
  public static final Charset a = Charset.forName("UTF-8");
  public static final Object b;

  static
  {
    Charset.forName("ISO-8859-1");
    b = new Object();
  }

  public static int a(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
      return 0;
    return Arrays.hashCode(paramArrayOfInt);
  }

  public static int a(long[] paramArrayOfLong)
  {
    if ((paramArrayOfLong == null) || (paramArrayOfLong.length == 0))
      return 0;
    return Arrays.hashCode(paramArrayOfLong);
  }

  public static int a(Object[] paramArrayOfObject)
  {
    int i = 0;
    if (paramArrayOfObject == null);
    for (int j = 0; ; j = paramArrayOfObject.length)
      for (int k = 0; k < j; k++)
      {
        Object localObject = paramArrayOfObject[k];
        if (localObject == null)
          continue;
        i = i * 31 + localObject.hashCode();
      }
    return i;
  }

  public static int a(byte[][] paramArrayOfByte)
  {
    int i = 0;
    if (paramArrayOfByte == null);
    for (int j = 0; ; j = paramArrayOfByte.length)
      for (int k = 0; k < j; k++)
      {
        byte[] arrayOfByte = paramArrayOfByte[k];
        if (arrayOfByte == null)
          continue;
        i = i * 31 + Arrays.hashCode(arrayOfByte);
      }
    return i;
  }

  public static void a(avv paramavv1, avv paramavv2)
  {
    if (paramavv1.H != null)
      paramavv2.H = ((avx)paramavv1.H.clone());
  }

  public static boolean a(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    if ((paramArrayOfInt1 == null) || (paramArrayOfInt1.length == 0))
      return (paramArrayOfInt2 == null) || (paramArrayOfInt2.length == 0);
    return Arrays.equals(paramArrayOfInt1, paramArrayOfInt2);
  }

  public static boolean a(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    if ((paramArrayOfLong1 == null) || (paramArrayOfLong1.length == 0))
      return (paramArrayOfLong2 == null) || (paramArrayOfLong2.length == 0);
    return Arrays.equals(paramArrayOfLong1, paramArrayOfLong2);
  }

  public static boolean a(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    int i;
    if (paramArrayOfObject1 == null)
    {
      i = 0;
      if (paramArrayOfObject2 != null)
        break label43;
    }
    int k;
    int m;
    label43: for (int j = 0; ; j = paramArrayOfObject2.length)
    {
      k = 0;
      for (m = 0; (m < i) && (paramArrayOfObject1[m] == null); m++);
      i = paramArrayOfObject1.length;
      break;
    }
    while (true)
    {
      if ((n < j) && (paramArrayOfObject2[n] == null))
      {
        n++;
        continue;
      }
      int i1;
      int i2;
      label86: int i3;
      if (m >= i)
      {
        i1 = 1;
        if (n < j)
          break label108;
        i2 = 1;
        if ((i1 == 0) || (i2 == 0))
          break label114;
        i3 = 1;
      }
      label108: label114: boolean bool;
      do
      {
        do
        {
          return i3;
          i1 = 0;
          break;
          i2 = 0;
          break label86;
          i3 = 0;
        }
        while (i1 != i2);
        bool = paramArrayOfObject1[m].equals(paramArrayOfObject2[n]);
        i3 = 0;
      }
      while (!bool);
      int i4 = m + 1;
      k = n + 1;
      m = i4;
      break;
      int n = k;
    }
  }

  public static boolean a(byte[][] paramArrayOfByte1, byte[][] paramArrayOfByte2)
  {
    int i;
    if (paramArrayOfByte1 == null)
    {
      i = 0;
      if (paramArrayOfByte2 != null)
        break label43;
    }
    int k;
    int m;
    label43: for (int j = 0; ; j = paramArrayOfByte2.length)
    {
      k = 0;
      for (m = 0; (m < i) && (paramArrayOfByte1[m] == null); m++);
      i = paramArrayOfByte1.length;
      break;
    }
    while (true)
    {
      if ((n < j) && (paramArrayOfByte2[n] == null))
      {
        n++;
        continue;
      }
      int i1;
      int i2;
      label86: int i3;
      if (m >= i)
      {
        i1 = 1;
        if (n < j)
          break label108;
        i2 = 1;
        if ((i1 == 0) || (i2 == 0))
          break label114;
        i3 = 1;
      }
      label108: label114: boolean bool;
      do
      {
        do
        {
          return i3;
          i1 = 0;
          break;
          i2 = 0;
          break label86;
          i3 = 0;
        }
        while (i1 != i2);
        bool = Arrays.equals(paramArrayOfByte1[m], paramArrayOfByte2[n]);
        i3 = 0;
      }
      while (!bool);
      int i4 = m + 1;
      k = n + 1;
      m = i4;
      break;
      int n = k;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     avz
 * JD-Core Version:    0.6.0
 */