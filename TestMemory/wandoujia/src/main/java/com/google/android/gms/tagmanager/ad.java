package com.google.android.gms.tagmanager;

import android.os.Handler;

final class ad extends ac
{
  private static final Object a = new Object();
  private static ad e;
  private int b = 1800000;
  private boolean c = true;
  private boolean d;

  private ad()
  {
    new ae();
    this.d = false;
  }

  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    monitorenter;
    while (true)
    {
      try
      {
        if (this.d != paramBoolean1)
          continue;
        boolean bool = this.c;
        if (bool == paramBoolean2)
          return;
        if (((!paramBoolean1) && (paramBoolean2)) || (this.b <= 0))
          continue;
        null.removeMessages(1, a);
        if ((paramBoolean1) || (!paramBoolean2) || (this.b <= 0))
          continue;
        null.sendMessageDelayed(null.obtainMessage(1, a), this.b);
        StringBuilder localStringBuilder = new StringBuilder("PowerSaveMode ");
        if (paramBoolean1)
          break label139;
        if (!paramBoolean2)
        {
          break label139;
          localStringBuilder.append(str);
          q.e();
          this.d = paramBoolean1;
          this.c = paramBoolean2;
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      String str = "terminated.";
      continue;
      label139: str = "initiated.";
    }
  }

  public static ad c()
  {
    if (e == null)
      e = new ad();
    return e;
  }

  public final void a()
  {
    monitorenter;
    try
    {
      q.e();
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  final void a(boolean paramBoolean)
  {
    monitorenter;
    try
    {
      a(this.d, paramBoolean);
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  final void b()
  {
    monitorenter;
    try
    {
      if ((!this.d) && (this.c) && (this.b > 0))
      {
        null.removeMessages(1, a);
        null.sendMessage(null.obtainMessage(1, a));
      }
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.tagmanager.ad
 * JD-Core Version:    0.6.0
 */