import android.view.View;
import android.view.animation.Animation;

final class an extends ao
{
  an(ak paramak, View paramView, Animation paramAnimation, z paramz)
  {
    super(paramView, paramAnimation);
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    super.onAnimationEnd(paramAnimation);
    if (this.b.d != null)
    {
      this.b.d = null;
      this.c.a(this.b, this.b.e, 0, 0, false);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     an
 * JD-Core Version:    0.6.0
 */