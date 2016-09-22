import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.k;
import com.google.android.gms.ads.internal.config.m;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public final class gu
{
  public static volatile np b = null;
  private static volatile Random d = null;
  private static final Object e = new Object();
  public hf a;
  public boolean c = false;

  public gu(hf paramhf)
  {
    this.a = paramhf;
    m.a(paramhf.a);
    d locald = m.ak;
    this.c = ((Boolean)bc.a().n.a(locald)).booleanValue();
    if ((this.c) && (b == null))
      synchronized (e)
      {
        if (b == null)
          b = new np(paramhf.a, "ADSHIELD", null);
        return;
      }
  }

  public static int a()
  {
    try
    {
      int i = ThreadLocalRandom.current().nextInt();
      return i;
    }
    catch (NoClassDefFoundError localNoClassDefFoundError)
    {
      return b().nextInt();
    }
    catch (RuntimeException localRuntimeException)
    {
    }
    return b().nextInt();
  }

  private static Random b()
  {
    if (d == null);
    synchronized (e)
    {
      if (d == null)
        d = new Random();
      return d;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     gu
 * JD-Core Version:    0.6.0
 */