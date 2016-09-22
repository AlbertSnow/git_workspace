package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

final class u
  implements Runnable
{
  u(s params, ArrayList paramArrayList)
  {
  }

  public final void run()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      ab localab = (ab)localIterator.next();
      s.a(this.b, localab);
    }
    this.a.clear();
    s.b(this.b).remove(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.u
 * JD-Core Version:    0.6.0
 */