package com.alipay.ut.device;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

public class BFoundIt extends BroadcastReceiver
{
  private static List<CountDownLatch> a = new Vector();
  private static volatile a b = null;
  private static Object c = new Object();

  public static a a()
  {
    synchronized (c)
    {
      a locala = b;
      return locala;
    }
  }

  public static void a(CountDownLatch paramCountDownLatch)
  {
    monitorenter;
    try
    {
      a.add(paramCountDownLatch);
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

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    monitorenter;
    a locala;
    if ((paramContext != null) && (paramIntent != null))
    {
      try
      {
        String str1 = paramIntent.getStringExtra("e");
        String str2 = paramIntent.getStringExtra("s");
        String str3 = paramIntent.getStringExtra("d");
        String str4 = paramIntent.getStringExtra("u");
        long l1 = paramIntent.getLongExtra("S", 0L);
        if ((android.support.v4.app.b.i(str1)) || (android.support.v4.app.b.i(str2)) || (android.support.v4.app.b.i(str3)) || (android.support.v4.app.b.i(str4)))
          break label254;
        synchronized (c)
        {
          locala = new a();
          locala.a(str1);
          locala.b(str2);
          locala.c(str3);
          locala.d(str4);
          locala.a(l1);
          long l2 = paramIntent.getLongExtra("t", 0L);
          if (l2 > 0L)
            locala.b(l2);
          long l3 = b.a(locala);
          b = locala;
          if (l3 != l1)
            break label251;
          if (a.size() <= 0)
            break label257;
          b = locala;
          Iterator localIterator = a.iterator();
          if (localIterator.hasNext())
            ((CountDownLatch)localIterator.next()).countDown();
        }
      }
      finally
      {
        monitorexit;
      }
      a.clear();
    }
    while (true)
    {
      label251: monitorexit;
      label254: monitorexit;
      return;
      label257: b.a(locala, paramContext);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.ut.device.BFoundIt
 * JD-Core Version:    0.6.0
 */