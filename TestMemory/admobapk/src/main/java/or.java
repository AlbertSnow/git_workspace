import android.content.Context;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class or
  implements ns
{
  static Boolean a;
  private static final Charset b = Charset.forName("UTF-8");
  private os c;

  static
  {
    a = null;
  }

  public or()
  {
    this(new os(null));
  }

  public or(Context paramContext)
  {
    this(new os(paramContext));
  }

  private or(os paramos)
  {
    this.c = ((os)anw.a(paramos));
  }

  private static long a(String paramString, long paramLong)
  {
    if ((paramString == null) || (paramString.isEmpty()))
      return ok.a(ByteBuffer.allocate(8).putLong(paramLong).array());
    byte[] arrayOfByte = paramString.getBytes(b);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8 + arrayOfByte.length);
    localByteBuffer.put(arrayOfByte);
    localByteBuffer.putLong(paramLong);
    return ok.a(localByteBuffer.array());
  }

  private static ot a(String paramString)
  {
    if (paramString == null)
      return null;
    String str1 = "";
    int i = paramString.indexOf(',');
    int j = 0;
    if (i >= 0)
    {
      str1 = paramString.substring(0, i);
      j = i + 1;
    }
    int k = paramString.indexOf('/', j);
    if (k <= 0)
    {
      String str4 = String.valueOf(paramString);
      if (str4.length() != 0);
      for (String str5 = "Failed to parse the rule: ".concat(str4); ; str5 = new String("Failed to parse the rule: "))
      {
        Log.e("LogSamplerImpl", str5);
        return null;
      }
    }
    long l1;
    long l2;
    try
    {
      l1 = Long.parseLong(paramString.substring(j, k));
      l2 = Long.parseLong(paramString.substring(k + 1));
      if ((l1 < 0L) || (l2 < 0L))
      {
        Log.e("LogSamplerImpl", 72 + "negative values not supported: " + l1 + "/" + l2);
        return null;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      String str2 = String.valueOf(paramString);
      if (str2.length() != 0);
      for (String str3 = "parseLong() failed while parsing: ".concat(str2); ; str3 = new String("parseLong() failed while parsing: "))
      {
        Log.e("LogSamplerImpl", str3, localNumberFormatException);
        return null;
      }
    }
    return new ot(str1, l1, l2);
  }

  public final boolean a(String paramString, int paramInt)
  {
    if ((paramString != null) && (!paramString.isEmpty()));
    while (true)
    {
      if (paramString == null)
      {
        return true;
        if (paramInt >= 0)
        {
          paramString = String.valueOf(paramInt);
          continue;
        }
      }
      else
      {
        os localos1 = this.c;
        long l1;
        os localos2;
        String str1;
        String str3;
        if (localos1.a == null)
        {
          l1 = 0L;
          localos2 = this.c;
          str1 = String.valueOf("gms:playlog:service:sampling_");
          String str2 = String.valueOf(paramString);
          if (str2.length() == 0)
            break label120;
          str3 = str1.concat(str2);
          label80: if (localos2.a != null)
            break label134;
        }
        ot localot;
        label134: for (String str4 = null; ; str4 = ase.a(localos2.a, str3, null))
        {
          localot = a(str4);
          if (localot != null)
            break label150;
          return true;
          l1 = ase.a(localos1.a, "android_id", 0L);
          break;
          label120: str3 = new String(str1);
          break label80;
        }
        label150: long l2 = a(localot.a, l1);
        long l3 = localot.b;
        long l4 = localot.c;
        if ((l3 < 0L) || (l4 < 0L))
          throw new IllegalArgumentException(72 + "negative values not supported: " + l3 + "/" + l4);
        if (l4 > 0L)
        {
          long l5;
          if (l2 >= 0L)
            l5 = l2 % l4;
          while (l5 < l3)
          {
            return true;
            l5 = (1L + 9223372036854775807L % l4 + (l2 & 0xFFFFFFFF) % l4) % l4;
          }
        }
        return false;
      }
      paramString = null;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     or
 * JD-Core Version:    0.6.0
 */