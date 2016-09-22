package com.wandoujia.p4.b;

import android.os.Handler;
import com.wandoujia.p4.utils.x;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

public class a<T>
{
  private WeakReference<Handler> a;
  private final x<T> b = new x();

  public final Handler a()
  {
    if (this.a != null)
      return (Handler)this.a.get();
    return null;
  }

  public final void a(Handler paramHandler)
  {
    this.a = new WeakReference(paramHandler);
  }

  protected final void b()
  {
    Iterator localIterator = this.b.b().iterator();
    while (localIterator.hasNext())
      localIterator.next();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.b.a
 * JD-Core Version:    0.6.0
 */