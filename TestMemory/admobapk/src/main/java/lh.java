import android.os.Looper;
import java.util.concurrent.ExecutorService;

public final class lh
{
  public final ExecutorService a;
  lj b;
  public boolean c;

  public lh(String paramString)
  {
    this.a = ly.a(paramString);
  }

  public final void a()
  {
    lp.b(this.c);
    lj locallj = this.b;
    locallj.a.a();
    if (locallj.b != null)
      locallj.b.interrupt();
  }

  public final void a(lk paramlk, li paramli)
  {
    Looper localLooper = Looper.myLooper();
    boolean bool1;
    if (localLooper != null)
    {
      bool1 = true;
      lp.b(bool1);
      if (this.c)
        break label73;
    }
    label73: for (boolean bool2 = true; ; bool2 = false)
    {
      lp.b(bool2);
      this.c = true;
      this.b = new lj(this, localLooper, paramlk, paramli, 0);
      this.a.submit(this.b);
      return;
      bool1 = false;
      break;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     lh
 * JD-Core Version:    0.6.0
 */