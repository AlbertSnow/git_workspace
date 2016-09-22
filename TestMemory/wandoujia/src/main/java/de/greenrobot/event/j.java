package de.greenrobot.event;

import java.util.ArrayList;
import java.util.List;

final class j
{
  private static final List<j> d = new ArrayList();
  Object a;
  o b;
  j c;

  private j(Object paramObject, o paramo)
  {
    this.a = paramObject;
    this.b = paramo;
  }

  static j a(o paramo, Object paramObject)
  {
    synchronized (d)
    {
      int i = d.size();
      if (i > 0)
      {
        j localj = (j)d.remove(i - 1);
        localj.a = paramObject;
        localj.b = paramo;
        localj.c = null;
        return localj;
      }
      return new j(paramObject, paramo);
    }
  }

  static void a(j paramj)
  {
    paramj.a = null;
    paramj.b = null;
    paramj.c = null;
    synchronized (d)
    {
      if (d.size() < 10000)
        d.add(paramj);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     de.greenrobot.event.j
 * JD-Core Version:    0.6.0
 */