import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

final class r
  implements ViewTreeObserver.OnPreDrawListener
{
  r(o paramo, View paramView, t paramt, int paramInt, Object paramObject)
  {
  }

  public final boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    this.e.a(this.b, this.c, this.d);
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     r
 * JD-Core Version:    0.6.0
 */