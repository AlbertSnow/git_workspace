import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

public final class ly
{
  public static final int a = Build.VERSION.SDK_INT;

  static
  {
    Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)(\\.(\\d+))?([Zz]|((\\+|\\-)(\\d\\d):(\\d\\d)))?");
    Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
  }

  public static int a(int paramInt1, int paramInt2)
  {
    return (-1 + (paramInt1 + paramInt2)) / paramInt2;
  }

  public static int a(long[] paramArrayOfLong, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = Arrays.binarySearch(paramArrayOfLong, paramLong);
    if (i < 0)
      i = -(i + 2);
    if (paramBoolean2)
      i = Math.max(0, i);
    return i;
  }

  public static long a(long paramLong1, long paramLong2, long paramLong3)
  {
    if ((paramLong3 >= 1000000L) && (paramLong3 % 1000000L == 0L))
      return paramLong1 / (paramLong3 / 1000000L);
    if ((paramLong3 < 1000000L) && (1000000L % paramLong3 == 0L))
      return paramLong1 * (1000000L / paramLong3);
    return ()(1000000.0D / paramLong3 * paramLong1);
  }

  public static ExecutorService a(String paramString)
  {
    return Executors.newSingleThreadExecutor(new lz(paramString));
  }

  public static void a(long[] paramArrayOfLong, long paramLong1, long paramLong2)
  {
    int i = 0;
    long l2;
    if ((paramLong2 >= 1000000L) && (paramLong2 % 1000000L == 0L))
      l2 = paramLong2 / 1000000L;
    while (i < paramArrayOfLong.length)
    {
      paramArrayOfLong[i] /= l2;
      i++;
      continue;
      long l1;
      if ((paramLong2 < 1000000L) && (1000000L % paramLong2 == 0L))
        l1 = 1000000L / paramLong2;
      while (i < paramArrayOfLong.length)
      {
        paramArrayOfLong[i] = (l1 * paramArrayOfLong[i]);
        i++;
        continue;
        double d = 1000000.0D / paramLong2;
        while (i < paramArrayOfLong.length)
        {
          paramArrayOfLong[i] = ()(d * paramArrayOfLong[i]);
          i++;
        }
      }
    }
  }

  public static boolean a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null)
      return paramObject2 == null;
    return paramObject1.equals(paramObject2);
  }

  public static int b(long[] paramArrayOfLong, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = Arrays.binarySearch(paramArrayOfLong, paramLong);
    if (i < 0)
      i ^= -1;
    return i;
  }

  public static String b(String paramString)
  {
    if (paramString == null)
      return null;
    return paramString.toLowerCase(Locale.US);
  }

  public static int c(String paramString)
  {
    int i = 0;
    int j = paramString.length();
    if (j <= 4);
    int k;
    for (boolean bool = true; ; bool = false)
    {
      lp.a(bool);
      k = 0;
      while (i < j)
      {
        k = k << 8 | paramString.charAt(i);
        i++;
      }
    }
    return k;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ly
 * JD-Core Version:    0.6.0
 */