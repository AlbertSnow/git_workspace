package com.android.volley.toolbox;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.LinkedList;

public final class p
{
  private Bitmap a;
  private final q b;
  private final String c;
  private final String d;

  public p(j paramj, Bitmap paramBitmap, String paramString1, String paramString2, q paramq)
  {
    this.a = paramBitmap;
    this.d = paramString1;
    this.c = paramString2;
    this.b = paramq;
  }

  public final void a()
  {
    if (this.b == null);
    n localn2;
    do
    {
      do
      {
        while (true)
        {
          return;
          n localn1 = (n)j.a(this.e).get(this.c);
          if (localn1 == null)
            break;
          if (!localn1.b(this))
            continue;
          j.a(this.e).remove(this.c);
          return;
        }
        localn2 = (n)j.b(this.e).get(this.c);
      }
      while (localn2 == null);
      localn2.b(this);
    }
    while (n.a(localn2).size() != 0);
    j.b(this.e).remove(this.c);
  }

  public final Bitmap b()
  {
    return this.a;
  }

  public final String c()
  {
    return this.d;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.toolbox.p
 * JD-Core Version:    0.6.0
 */