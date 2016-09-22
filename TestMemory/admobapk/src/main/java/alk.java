import android.os.Bundle;

final class alk
  implements Runnable
{
  alk(alj paramalj, alc paramalc, String paramString)
  {
  }

  public final void run()
  {
    alc localalc;
    if (this.c.a > 0)
    {
      localalc = this.a;
      if (this.c.W == null)
        break label82;
    }
    label82: for (Bundle localBundle = this.c.W.getBundle(this.b); ; localBundle = null)
    {
      localalc.a(localBundle);
      if (this.c.a >= 2)
        this.a.a();
      if (this.c.a >= 3)
        this.a.b();
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     alk
 * JD-Core Version:    0.6.0
 */