import android.util.Log;
import java.util.Locale;

public class fh
{
  public static String a = "Volley";
  public static boolean b = Log.isLoggable("Volley", 2);

  public static void a(String paramString, Object[] paramArrayOfObject)
  {
    if (b)
      Log.v(a, d(paramString, paramArrayOfObject));
  }

  public static void b(String paramString, Object[] paramArrayOfObject)
  {
    Log.d(a, d(paramString, paramArrayOfObject));
  }

  public static void c(String paramString, Object[] paramArrayOfObject)
  {
    Log.e(a, d(paramString, paramArrayOfObject));
  }

  static String d(String paramString, Object[] paramArrayOfObject)
  {
    int i;
    label20: String str4;
    String str5;
    if (paramArrayOfObject == null)
    {
      StackTraceElement[] arrayOfStackTraceElement = new Throwable().fillInStackTrace().getStackTrace();
      i = 2;
      if (i >= arrayOfStackTraceElement.length)
        break label200;
      if (arrayOfStackTraceElement[i].getClass().equals(fh.class))
        break label194;
      String str2 = arrayOfStackTraceElement[i].getClassName();
      String str3 = str2.substring(1 + str2.lastIndexOf('.'));
      str4 = str3.substring(1 + str3.lastIndexOf('$'));
      str5 = String.valueOf(arrayOfStackTraceElement[i].getMethodName());
    }
    label194: label200: for (String str1 = 1 + String.valueOf(str4).length() + String.valueOf(str5).length() + str4 + "." + str5; ; str1 = "<unknown>")
    {
      Locale localLocale = Locale.US;
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Long.valueOf(Thread.currentThread().getId());
      arrayOfObject[1] = str1;
      arrayOfObject[2] = paramString;
      return String.format(localLocale, "[%d] %s: %s", arrayOfObject);
      paramString = String.format(Locale.US, paramString, paramArrayOfObject);
      break;
      i++;
      break label20;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     fh
 * JD-Core Version:    0.6.0
 */