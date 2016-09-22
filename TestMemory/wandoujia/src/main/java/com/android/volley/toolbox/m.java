package com.android.volley.toolbox;

import com.android.volley.VolleyError;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

final class m
  implements Runnable
{
  m(j paramj, VolleyError paramVolleyError)
  {
  }

  public final void run()
  {
    Iterator localIterator1 = j.b(this.b).values().iterator();
    while (localIterator1.hasNext())
    {
      n localn = (n)localIterator1.next();
      Iterator localIterator2 = n.a(localn).iterator();
      while (localIterator2.hasNext())
      {
        p localp = (p)localIterator2.next();
        if (p.a(localp) == null)
          continue;
        if (this.a == null)
        {
          p.a(localp, n.b(localn));
          p.a(localp).a(localp, false);
          continue;
        }
        p.a(localp).onErrorResponse(this.a);
      }
    }
    j.b(this.b).clear();
    j.c(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.toolbox.m
 * JD-Core Version:    0.6.0
 */