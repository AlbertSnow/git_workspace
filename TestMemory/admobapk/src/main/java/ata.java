import android.view.Choreographer;
import android.view.View;

final class ata
  implements Runnable
{
  ata(asz paramasz)
  {
  }

  public final void run()
  {
    this.a.b.setOnTouchListener(this.a);
    Choreographer.getInstance().postFrameCallback(this.a);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ata
 * JD-Core Version:    0.6.0
 */