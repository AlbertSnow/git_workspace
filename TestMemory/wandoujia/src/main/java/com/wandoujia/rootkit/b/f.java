package com.wandoujia.rootkit.b;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;

public final class f extends Thread
{
  public int a = -911;
  private DataInputStream b;
  private DataOutputStream c;

  private f(DataInputStream paramDataInputStream, DataOutputStream paramDataOutputStream)
  {
    this.b = paramDataInputStream;
    this.c = paramDataOutputStream;
  }

  public final void run()
  {
    try
    {
      this.c.write("echo Started\n".getBytes());
      this.c.flush();
      str = this.b.readLine();
      if (str == null)
        throw new EOFException();
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        String str;
        this.a = -42;
        if (localIOException.getMessage() == null)
          break;
        c.a(localIOException.getMessage());
        return;
        if ("".equals(str))
          continue;
        if ("Started".equals(str))
        {
          this.a = 1;
          return;
        }
        c.a("unkown error occured.");
      }
      c.a("RootAccess denied?.");
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rootkit.b.f
 * JD-Core Version:    0.6.0
 */