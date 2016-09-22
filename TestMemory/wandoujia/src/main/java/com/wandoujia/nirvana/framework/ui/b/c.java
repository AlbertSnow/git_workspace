package com.wandoujia.nirvana.framework.ui.b;

import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.log.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class c<T> extends a<T>
{
  private final com.wandoujia.nirvana.framework.ui.c.a<View> b = new com.wandoujia.nirvana.framework.ui.c.a();
  private Set<d> c = new HashSet();

  protected abstract com.wandoujia.nirvana.framework.ui.a a(ViewGroup paramViewGroup, T paramT);

  public final void a()
  {
    super.a();
    Log.d("SubList", "Destroy view holders " + this + ", size is " + this.c.size(), new Object[0]);
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      if ((locald != null) && (locald.c != null))
      {
        locald.c.a();
        continue;
      }
      if (!GlobalConfig.isDebug())
        continue;
      StringBuilder localStringBuilder = new StringBuilder();
      if (locald == null);
      for (String str = "holder"; ; str = "holder.presenter")
        throw new NullPointerException(str + " is null");
    }
    this.c.clear();
  }

  protected final void a(int paramInt, b paramb)
  {
    Object localObject = this.a.get(paramInt);
    ((d)paramb).c.a(localObject);
    this.c.add((d)paramb);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.ui.b.c
 * JD-Core Version:    0.6.0
 */