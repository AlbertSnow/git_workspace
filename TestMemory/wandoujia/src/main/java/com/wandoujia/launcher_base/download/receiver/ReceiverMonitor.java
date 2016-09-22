package com.wandoujia.launcher_base.download.receiver;

import android.support.v7.app.f;
import com.wandoujia.p4.utils.x;
import com.wandoujia.p4.utils.y;

public final class ReceiverMonitor
{
  private static ReceiverMonitor a = new ReceiverMonitor();
  private final x<f> b = new x();
  private final x<a> c = new x();
  private final x<f> d = new x();

  private ReceiverMonitor()
  {
    new x();
    new x();
  }

  public static ReceiverMonitor a()
  {
    return a;
  }

  public final void a(a parama)
  {
    if (parama != null)
      this.c.a(parama);
  }

  public final void b()
  {
    y localy = this.b.a();
    while ((f)localy.a() != null);
  }

  public final void c()
  {
    y localy = this.d.a();
    while ((f)localy.a() != null);
  }

  public final void d()
  {
    y localy = this.c.a();
    while (true)
    {
      a locala = (a)localy.a();
      if (locala == null)
        break;
      locala.a();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.download.receiver.ReceiverMonitor
 * JD-Core Version:    0.6.0
 */