import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

final class ay extends Transition.EpicenterCallback
{
  private Rect a;

  ay(ba paramba)
  {
  }

  public final Rect onGetEpicenter(Transition paramTransition)
  {
    if ((this.a == null) && (this.b.a != null))
      this.a = av.a(this.b.a);
    return this.a;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ay
 * JD-Core Version:    0.6.0
 */