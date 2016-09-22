package com.wandoujia.rootkit.b;

import com.wandoujia.rootkit.exceptions.RootDeniedException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

public final class c
{
  private static int f = 10000;
  private static String g = "";
  private static c h = null;
  private final Process a;
  private final DataInputStream b;
  private final DataOutputStream c;
  private final List<a> d = new ArrayList();
  private boolean e = false;
  private Runnable i = new d(this);
  private Runnable j = new e(this);

  private c(String paramString)
  {
    this.a = new ProcessBuilder(new String[] { paramString }).redirectErrorStream(true).start();
    this.b = new DataInputStream(this.a.getInputStream());
    this.c = new DataOutputStream(this.a.getOutputStream());
    f localf = new f(this.b, this.c, 0);
    localf.start();
    try
    {
      localf.join(f);
      if (localf.a == -911)
      {
        this.a.destroy();
        throw new TimeoutException(g);
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      localf.interrupt();
      Thread.currentThread().interrupt();
      throw new TimeoutException();
    }
    if (localf.a == -42)
    {
      this.a.destroy();
      throw new RootDeniedException("Root Access Denied");
    }
    new Thread(this.i, "Shell Input").start();
    new Thread(this.j, "Shell Output").start();
  }

  public static c a()
  {
    return c();
  }

  public static void b()
  {
    if (h != null)
    {
      c localc = h;
      if (localc == h)
        h = null;
      synchronized (localc.d)
      {
        localc.e = true;
        localc.d.notifyAll();
        return;
      }
    }
  }

  private static c c()
  {
    f = 10000;
    if (h == null)
    {
      int k = 0;
      while (h == null)
        try
        {
          h = new c("su");
        }
        catch (IOException localIOException)
        {
          int m = k + 1;
          if (k >= 3)
            throw localIOException;
          k = m;
        }
    }
    return h;
  }

  public final a a(a parama)
  {
    if (this.e)
      throw new IllegalStateException("Unable to add commands to a closed shell");
    synchronized (this.d)
    {
      this.d.add(parama);
      this.d.notifyAll();
      return parama;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rootkit.b.c
 * JD-Core Version:    0.6.0
 */