import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import java.lang.reflect.Field;

final class dq
{
  private static Field a;
  private static boolean b;

  static void a(LayoutInflater paramLayoutInflater, LayoutInflater.Factory2 paramFactory2)
  {
    if (!b);
    try
    {
      Field localField = LayoutInflater.class.getDeclaredField("mFactory2");
      a = localField;
      localField.setAccessible(true);
      b = true;
      if (a == null);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      try
      {
        a.set(paramLayoutInflater, paramFactory2);
        return;
        localNoSuchFieldException = localNoSuchFieldException;
        Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", localNoSuchFieldException);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + paramLayoutInflater + "; inflation may have unexpected results.", localIllegalAccessException);
      }
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     dq
 * JD-Core Version:    0.6.0
 */