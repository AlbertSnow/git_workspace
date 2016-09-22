package com.wandoujia.p4.app_launcher.clean;

import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.MemoryUtil;
import com.wandoujia.clean.a.a;
import com.wandoujia.clean.a.b;
import com.wandoujia.p4.utils.x;
import java.util.Iterator;
import java.util.List;

public final class c
  implements Runnable
{
  private x<a> a = new x();

  private void a(int paramInt)
  {
    Iterator localIterator = this.a.b().iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (paramInt == 0)
      {
        locala.a();
        continue;
      }
      if (paramInt == 100)
      {
        locala.b();
        continue;
      }
      locala.a(paramInt);
    }
  }

  public final void a(a parama)
  {
    this.a.a(parama);
  }

  public final void run()
  {
    a(0);
    try
    {
      MemoryUtil.killAllProcesses(GlobalConfig.getAppContext(), null);
      label12: a(60);
      b.a();
      a(100);
      return;
    }
    catch (Exception localException)
    {
      break label12;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.clean.c
 * JD-Core Version:    0.6.0
 */