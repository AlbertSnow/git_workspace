import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

final class ato
  implements Runnable
{
  ato(atj paramatj)
  {
  }

  public final void run()
  {
    try
    {
      avf localavf = new avf();
      localavf.f = new auw();
      while (!this.a.m.get())
      {
        localavf.f.a = System.nanoTime();
        atj.a.log(asn.d, "Ping?");
        this.a.f.a(localavf);
        Thread.sleep(5000L);
      }
    }
    catch (InterruptedException localInterruptedException)
    {
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ato
 * JD-Core Version:    0.6.0
 */