import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import java.util.logging.Logger;

final class ati
{
  static final Logger a = aso.a("AppStreamingFragment", "ScreenUtil");
  Activity b;
  Context c;
  Display d;
  boolean e;
  public int f;
  public int g;
  public int h;
  public int i;
  public int j;
  int k;
  Point l;
  Point m;
  int n;
  int o;
  int p;
  int q;

  ati(Activity paramActivity)
  {
    this.b = paramActivity;
    this.c = paramActivity.getApplicationContext();
  }

  protected final int a(String paramString)
  {
    int i1 = this.c.getResources().getIdentifier(paramString, "dimen", "android");
    if (i1 != 0)
      return this.c.getResources().getDimensionPixelSize(i1);
    return -1;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ati
 * JD-Core Version:    0.6.0
 */