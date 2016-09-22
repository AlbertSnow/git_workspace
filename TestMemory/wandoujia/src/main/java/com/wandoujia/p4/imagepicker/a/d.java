package com.wandoujia.p4.imagepicker.a;

import android.content.Context;
import android.content.res.Resources;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.p4.b.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d extends a<j>
{
  public d(Context paramContext, int paramInt, c paramc)
  {
    super(paramContext, paramInt, paramc);
  }

  protected final void a(long paramLong)
  {
    if ((!c(paramLong)) && (c() >= this.c))
    {
      Context localContext = this.a;
      Resources localResources = this.a.getResources();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(this.c);
      p.a(localContext, localResources.getString(2131624948, arrayOfObject), p.b).a();
      return;
    }
    super.a(paramLong);
  }

  protected final void b(long paramLong)
  {
    a(paramLong);
  }

  public final long getItemId(int paramInt)
  {
    return ((j)a(paramInt)).a;
  }

  protected final boolean h()
  {
    return false;
  }

  protected final int i()
  {
    return 0;
  }

  protected final int j()
  {
    return 0;
  }

  protected final void k()
  {
  }

  public final ArrayList<String> m()
  {
    List localList = l();
    if ((localList == null) || (localList.isEmpty()))
      return null;
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
      localArrayList.add(((j)localIterator.next()).b);
    return localArrayList;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.imagepicker.a.d
 * JD-Core Version:    0.6.0
 */