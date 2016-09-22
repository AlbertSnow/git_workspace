import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

final class hr extends Handler
{
  hr(hq paramhq)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    hq localhq = this.a;
    switch (paramMessage.what)
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return;
      localhq.c = paramMessage.arg1;
      Iterator localIterator3 = localhq.a.iterator();
      while (localIterator3.hasNext())
        ((hp)localIterator3.next()).a(localhq.b, localhq.c);
      continue;
      localhq.d = (-1 + localhq.d);
      if (localhq.d != 0)
        continue;
      Iterator localIterator2 = localhq.a.iterator();
      while (localIterator2.hasNext())
        localIterator2.next();
      continue;
      hm localhm = (hm)paramMessage.obj;
      Iterator localIterator1 = localhq.a.iterator();
      while (localIterator1.hasNext())
        ((hp)localIterator1.next()).a(localhm);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     hr
 * JD-Core Version:    0.6.0
 */