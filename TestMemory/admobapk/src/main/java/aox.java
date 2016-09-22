import android.os.Bundle;
import java.util.LinkedList;

public abstract class aox
{
  public apm a;
  public Bundle b;
  LinkedList c;
  private final apo d = new aoy(this);

  public final void a(int paramInt)
  {
    while ((!this.c.isEmpty()) && (((ape)this.c.getLast()).a() >= paramInt))
      this.c.removeLast();
  }

  public final void a(Bundle paramBundle, ape paramape)
  {
    if (this.a != null)
    {
      paramape.b();
      return;
    }
    if (this.c == null)
      this.c = new LinkedList();
    this.c.add(paramape);
    if (paramBundle != null)
    {
      if (this.b != null)
        break label72;
      this.b = ((Bundle)paramBundle.clone());
    }
    while (true)
    {
      a(this.d);
      return;
      label72: this.b.putAll(paramBundle);
    }
  }

  public abstract void a(apo paramapo);
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aox
 * JD-Core Version:    0.6.0
 */