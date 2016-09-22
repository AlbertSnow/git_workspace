import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;

public final class asr extends SurfaceView
  implements SurfaceHolder.Callback
{
  private ass a;

  public asr(Context paramContext, ass paramass)
  {
    super(paramContext);
    this.a = paramass;
    getHolder().addCallback(this);
  }

  public final void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    this.a.a();
  }

  public final void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     asr
 * JD-Core Version:    0.6.0
 */