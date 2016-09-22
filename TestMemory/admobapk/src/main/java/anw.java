import android.os.Looper;
import android.text.TextUtils;

public final class anw
{
  public static Object a(Object paramObject)
  {
    if (paramObject == null)
      throw new NullPointerException("null reference");
    return paramObject;
  }

  public static Object a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null)
      throw new NullPointerException(String.valueOf(paramObject2));
    return paramObject1;
  }

  public static String a(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      throw new IllegalArgumentException("Given String is empty or null");
    return paramString;
  }

  public static void a(boolean paramBoolean)
  {
    if (!paramBoolean)
      throw new IllegalStateException();
  }

  public static void a(boolean paramBoolean, Object paramObject)
  {
    if (!paramBoolean)
      throw new IllegalStateException(String.valueOf(paramObject));
  }

  public static void b(String paramString)
  {
    if (Looper.myLooper() != Looper.getMainLooper())
      throw new IllegalStateException(paramString);
  }

  public static void b(boolean paramBoolean, Object paramObject)
  {
    if (!paramBoolean)
      throw new IllegalArgumentException(String.valueOf(paramObject));
  }

  public static void c(String paramString)
  {
    if (Looper.myLooper() == Looper.getMainLooper())
      throw new IllegalStateException(paramString);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     anw
 * JD-Core Version:    0.6.0
 */