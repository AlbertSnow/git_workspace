import java.util.concurrent.BlockingQueue;

final class el
  implements Runnable
{
  el(ek paramek, ev paramev)
  {
  }

  public final void run()
  {
    try
    {
      this.b.a.put(this.a);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     el
 * JD-Core Version:    0.6.0
 */