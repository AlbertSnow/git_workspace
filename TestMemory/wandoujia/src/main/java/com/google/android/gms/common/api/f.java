package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.support.v4.app.d;
import android.support.v4.app.i;
import com.google.android.gms.common.internal.j;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class f
  implements p
{
  private final a a;

  public f(a parama)
  {
    this.a = parama;
  }

  public final void a()
  {
    while (!this.a.b.isEmpty())
      try
      {
        o localo = (o)this.a.b.remove();
        this.a.g.add(localo);
        a locala = this.a;
        i locali = localo.a();
        b localb = (b)locala.d.get(locali);
        d.a(localb, "Appropriate Api was not requested.");
        if ((localb.l()) || (!this.a.e.containsKey(localo.a())))
          continue;
        new Status(17);
      }
      catch (DeadObjectException localDeadObjectException)
      {
      }
  }

  public final void a(int paramInt)
  {
    int i;
    if (paramInt == -1)
    {
      i = 1;
      if (i == 0)
        break label67;
      this.a.e();
      this.a.e.clear();
    }
    while (true)
    {
      this.a.h();
      if (i == 0)
        this.a.a.d();
      this.a.a.a();
      return;
      i = 0;
      break;
      label67: Iterator localIterator = this.a.g.iterator();
      while (localIterator.hasNext())
      {
        localIterator.next();
        new Status(8, "The connection to Google Play services was lost");
      }
    }
  }

  public final void b()
  {
  }

  public final String c()
  {
    return "CONNECTED";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.api.f
 * JD-Core Version:    0.6.0
 */