package com.wandoujia.image;

import android.graphics.Bitmap;
import java.util.LinkedList;

final class q
{
  private final s a;
  private final LinkedList<r> b = new LinkedList();
  private Bitmap c;

  public q(s params, r paramr)
  {
    this.a = params;
    this.b.add(paramr);
  }

  public final void a(r paramr)
  {
    this.b.add(paramr);
  }

  public final boolean b(r paramr)
  {
    this.b.remove(paramr);
    if (this.b.isEmpty())
    {
      this.a.b();
      return true;
    }
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.image.q
 * JD-Core Version:    0.6.0
 */