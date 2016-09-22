import android.graphics.Paint;
import android.os.Build.VERSION;
import android.view.View;

public final class dt
{
  public static final eg a;

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23)
    {
      a = new ef();
      return;
    }
    if (i >= 21)
    {
      a = new ee();
      return;
    }
    if (i >= 19)
    {
      a = new ed();
      return;
    }
    if (i >= 17)
    {
      a = new eb();
      return;
    }
    if (i >= 16)
    {
      a = new ea();
      return;
    }
    if (i >= 15)
    {
      a = new dy();
      return;
    }
    if (i >= 14)
    {
      a = new dz();
      return;
    }
    if (i >= 11)
    {
      a = new dx();
      return;
    }
    if (i >= 9)
    {
      a = new dw();
      return;
    }
    if (i >= 7)
    {
      a = new dv();
      return;
    }
    a = new du();
  }

  public static void a(View paramView, int paramInt, Paint paramPaint)
  {
    a.a(paramView, paramInt, null);
  }

  public static void a(View paramView, boolean paramBoolean)
  {
    a.a(paramView, false);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     dt
 * JD-Core Version:    0.6.0
 */