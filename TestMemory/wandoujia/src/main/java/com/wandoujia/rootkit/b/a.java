package com.wandoujia.rootkit.b;

import java.io.IOException;

public abstract class a
{
  final String[] a;
  int b = 0;
  private boolean c = false;
  private int d = 5000;

  public a(int paramInt, String[] paramArrayOfString)
  {
    this.a = paramArrayOfString;
    this.b = paramInt;
  }

  public a(int paramInt, String[] paramArrayOfString, byte paramByte)
  {
    this.a = paramArrayOfString;
    this.b = paramInt;
    this.d = 180000;
  }

  public final void a()
  {
    monitorenter;
    try
    {
      this.c = true;
      a(this.b);
      notifyAll();
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public void a(int paramInt)
  {
    new StringBuilder("Command ").append(paramInt).append("finished.");
  }

  public abstract void a(int paramInt, String paramString);

  public final void b()
  {
    a();
    new StringBuilder("Command ").append(this.b).append(" did not finish.");
  }

  public final void c()
  {
    monitorenter;
    try
    {
      int i = this.d;
      monitorenter;
      try
      {
        while (!this.c)
        {
          wait(i);
          if (this.c)
            continue;
          this.c = true;
          try
          {
            c.b();
            b();
          }
          catch (IOException localIOException)
          {
          }
        }
        monitorexit;
        return;
      }
      finally
      {
        monitorexit;
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject1;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rootkit.b.a
 * JD-Core Version:    0.6.0
 */