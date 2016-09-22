import android.view.Choreographer;
import android.view.View;

final class atb
  implements Runnable
{
  atb(asz paramasz)
  {
  }

  public final void run()
  {
    this.a.b.setOnTouchListener(null);
    Choreographer.getInstance().removeFrameCallback(this.a);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     atb
 * JD-Core Version:    0.6.0
 */