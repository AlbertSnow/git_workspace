package com.b.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class d
{
  private final f a;
  private final boolean[] b;
  private boolean c;

  private d(a parama, f paramf)
  {
    this.a = paramf;
    if (f.e(paramf));
    for (boolean[] arrayOfBoolean = null; ; arrayOfBoolean = new boolean[a.c()])
    {
      this.b = arrayOfBoolean;
      return;
    }
  }

  public final OutputStream a()
  {
    synchronized (this.d)
    {
      if (f.b(this.a) != this)
        throw new IllegalStateException();
    }
    if (!f.e(this.a))
      this.b[0] = true;
    File localFile = this.a.b(0);
    OutputStream localOutputStream;
    try
    {
      FileOutputStream localFileOutputStream1 = new FileOutputStream(localFile);
      localObject2 = localFileOutputStream1;
      e locale = new e(this, (OutputStream)localObject2, 0);
      monitorexit;
      return locale;
    }
    catch (FileNotFoundException localFileNotFoundException1)
    {
      while (true)
      {
        Object localObject2;
        a.f(this.d).mkdirs();
        try
        {
          FileOutputStream localFileOutputStream2 = new FileOutputStream(localFile);
          localObject2 = localFileOutputStream2;
        }
        catch (FileNotFoundException localFileNotFoundException2)
        {
          localOutputStream = a.d();
          monitorexit;
        }
      }
    }
    return (OutputStream)localOutputStream;
  }

  public final void b()
  {
    if (this.c)
    {
      a.a(this.d, this, false);
      this.d.c(f.d(this.a));
      return;
    }
    a.a(this.d, this, true);
  }

  public final void c()
  {
    a.a(this.d, this, false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.b.a.d
 * JD-Core Version:    0.6.0
 */