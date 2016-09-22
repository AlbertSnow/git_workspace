package com.wandoujia.jupiter.anim;

import android.support.v7.widget.co;
import java.util.ArrayList;
import java.util.Iterator;

final class b
  implements Runnable
{
  b(a parama, ArrayList paramArrayList)
  {
  }

  public final void run()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      co localco = (co)localIterator.next();
      a.a(this.b, localco);
    }
    this.a.clear();
    a.a(this.b).remove(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.anim.b
 * JD-Core Version:    0.6.0
 */