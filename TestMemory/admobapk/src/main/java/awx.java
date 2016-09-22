import android.content.ComponentName;
import java.lang.ref.WeakReference;

public final class awx extends f
{
  private WeakReference a;

  public awx(awy paramawy)
  {
    this.a = new WeakReference(paramawy);
  }

  public final void a(b paramb)
  {
    awy localawy = (awy)this.a.get();
    if (localawy != null)
      localawy.a(paramb);
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    awy localawy = (awy)this.a.get();
    if (localawy != null)
      localawy.b();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     awx
 * JD-Core Version:    0.6.0
 */