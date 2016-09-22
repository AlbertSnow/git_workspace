package com.android.volley.toolbox;

import android.graphics.Bitmap;
import com.android.volley.Request;
import java.util.LinkedList;

final class n
{
  private final Request<?> a;
  private Bitmap b;
  private final LinkedList<p> c = new LinkedList();

  public n(p paramp)
  {
    this.a = paramp;
    Object localObject;
    this.c.add(localObject);
  }

  public final void a(p paramp)
  {
    this.c.add(paramp);
  }

  public final boolean b(p paramp)
  {
    this.c.remove(paramp);
    if (this.c.size() == 0)
    {
      this.a.f();
      return true;
    }
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.toolbox.n
 * JD-Core Version:    0.6.0
 */