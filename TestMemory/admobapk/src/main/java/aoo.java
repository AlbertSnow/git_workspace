import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;

public final class aoo
{
  public static Boolean a;
  public static Boolean b;
  private static Boolean c;
  private static Boolean d;

  @TargetApi(20)
  public static boolean a(Context paramContext)
  {
    if (c == null)
      if ((!aoq.a(20)) || (!paramContext.getPackageManager().hasSystemFeature("android.hardware.type.watch")))
        break label42;
    label42: for (boolean bool = true; ; bool = false)
    {
      c = Boolean.valueOf(bool);
      return c.booleanValue();
    }
  }

  @TargetApi(21)
  public static boolean b(Context paramContext)
  {
    if (d == null)
      if ((!aoq.a(21)) || (!paramContext.getPackageManager().hasSystemFeature("cn.google")))
        break label42;
    label42: for (boolean bool = true; ; bool = false)
    {
      d = Boolean.valueOf(bool);
      return d.booleanValue();
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aoo
 * JD-Core Version:    0.6.0
 */