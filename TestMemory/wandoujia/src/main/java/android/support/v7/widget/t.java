package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

final class t
  implements Runnable
{
  t(s params, ArrayList paramArrayList)
  {
  }

  public final void run()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      ac localac = (ac)localIterator.next();
      s.a(this.b, localac.a, localac.b, localac.c, localac.d, localac.e);
    }
    this.a.clear();
    s.a(this.b).remove(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.t
 * JD-Core Version:    0.6.0
 */