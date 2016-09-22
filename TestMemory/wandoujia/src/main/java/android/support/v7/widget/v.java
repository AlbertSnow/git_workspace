package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

final class v
  implements Runnable
{
  v(s params, ArrayList paramArrayList)
  {
  }

  public final void run()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      co localco = (co)localIterator.next();
      s.a(this.b, localco);
    }
    this.a.clear();
    s.c(this.b).remove(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.v
 * JD-Core Version:    0.6.0
 */