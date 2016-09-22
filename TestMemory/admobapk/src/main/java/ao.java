import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class ao
  implements Animation.AnimationListener
{
  View a = null;
  private Animation.AnimationListener b = null;
  private boolean c = false;

  public ao(View paramView, Animation paramAnimation)
  {
    if ((paramView == null) || (paramAnimation == null))
      return;
    this.a = paramView;
  }

  public ao(View paramView, Animation paramAnimation, Animation.AnimationListener paramAnimationListener)
  {
    if ((paramView == null) || (paramAnimation == null))
      return;
    this.b = paramAnimationListener;
    this.a = paramView;
  }

  public void onAnimationEnd(Animation paramAnimation)
  {
    if ((this.a != null) && (this.c))
      this.a.post(new aq(this));
    if (this.b != null)
      this.b.onAnimationEnd(paramAnimation);
  }

  public void onAnimationRepeat(Animation paramAnimation)
  {
    if (this.b != null)
      this.b.onAnimationRepeat(paramAnimation);
  }

  public void onAnimationStart(Animation paramAnimation)
  {
    if (this.a != null)
    {
      this.c = ak.a(this.a, paramAnimation);
      if (this.c)
        this.a.post(new ap(this));
    }
    if (this.b != null)
      this.b.onAnimationStart(paramAnimation);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ao
 * JD-Core Version:    0.6.0
 */