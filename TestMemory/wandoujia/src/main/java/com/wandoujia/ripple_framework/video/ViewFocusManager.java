package com.wandoujia.ripple_framework.video;

import android.graphics.Rect;
import android.view.View;
import com.wandoujia.ripple_framework.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class ViewFocusManager
{
  private static final int a = android.support.v4.app.b.b(i.k().g(), 40.0F);
  private Map<b, c> b = new HashMap();
  private b c;
  private Rect d = new Rect();
  private boolean e = true;

  private void a(b paramb, c paramc)
  {
    switch (a.a[paramc.a.ordinal()])
    {
    default:
    case 1:
      do
        return;
      while (this.c == paramb);
      this.c = paramb;
      b(paramb, paramc);
      return;
    case 2:
      if ((this.c != paramb) && ((this.c == null) || (this.b.get(this.c) == null) || (paramc.a((c)this.b.get(this.c)))))
      {
        this.c = paramb;
        b(paramb, paramc);
      }
      this.b.put(paramb, paramc);
      return;
    case 3:
      if (this.c == paramb)
      {
        b localb = b(paramb);
        if (localb != null)
        {
          this.c = localb;
          b(localb, (c)this.b.get(localb));
        }
      }
      this.b.put(paramb, paramc);
      return;
    case 4:
    }
    if (this.c == paramb)
    {
      this.c = null;
      paramb.k();
    }
    this.b.put(paramb, paramc);
  }

  private b b(b paramb)
  {
    Object localObject1 = null;
    Iterator localIterator = this.b.entrySet().iterator();
    Object localObject2 = null;
    Map.Entry localEntry;
    Object localObject3;
    if (localIterator.hasNext())
    {
      localEntry = (Map.Entry)localIterator.next();
      if ((paramb == localEntry.getKey()) || (!((c)localEntry.getValue()).a((c)localObject2)))
        break label105;
      localObject3 = (b)localEntry.getKey();
    }
    for (Object localObject4 = (c)localEntry.getValue(); ; localObject4 = localObject2)
    {
      localObject1 = localObject3;
      localObject2 = localObject4;
      break;
      return localObject1;
      label105: localObject3 = localObject1;
    }
  }

  private void b(b paramb, c paramc)
  {
    if ((this.e) || (paramc.a == ViewFocusManager.STATE.CLICK))
      if (paramc.a != ViewFocusManager.STATE.CLICK)
        break label120;
    label120: for (boolean bool = true; ; bool = false)
    {
      paramb.a(bool);
      Iterator localIterator = this.b.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if ((localEntry.getKey() == paramb) || (!paramc.a((c)localEntry.getValue())))
          continue;
        ((b)localEntry.getKey()).k();
      }
    }
  }

  public final void a()
  {
    this.e = false;
  }

  public final void a(b paramb)
  {
    a(paramb, new c(ViewFocusManager.STATE.INVISIBLE));
  }

  public final void b()
  {
    Iterator localIterator = this.b.keySet().iterator();
    while (localIterator.hasNext())
    {
      b localb2 = (b)localIterator.next();
      View localView = localb2.getView();
      if (localView == null)
        continue;
      boolean bool = localView.getGlobalVisibleRect(this.d);
      ViewFocusManager.STATE localSTATE;
      label80: c localc;
      if ((!localb2.l()) || (localView.getVisibility() != 0))
      {
        localSTATE = ViewFocusManager.STATE.INVISIBLE;
        localc = (c)this.b.get(localView);
        if (localc == null)
          break label204;
        this.d.centerX();
        localc.a(localSTATE, this.d.centerY());
      }
      while (true)
      {
        this.b.put(localb2, localc);
        break;
        if ((bool) && (this.d.height() >= 0.6F * localView.getMeasuredHeight()))
        {
          localSTATE = ViewFocusManager.STATE.VISIBLE;
          break label80;
        }
        if ((!bool) || (this.d.height() <= 0))
        {
          localSTATE = ViewFocusManager.STATE.INVISIBLE;
          break label80;
        }
        localSTATE = ViewFocusManager.STATE.PART;
        break label80;
        label204: this.d.centerX();
        localc = new c(localSTATE, this.d.centerY());
      }
    }
    b localb1 = b(null);
    if ((localb1 != null) && (localb1 != this.c))
    {
      this.c = localb1;
      b(localb1, (c)this.b.get(localb1));
    }
  }

  public final void c()
  {
    Iterator localIterator = this.b.keySet().iterator();
    while (localIterator.hasNext())
      a((b)localIterator.next(), new c(ViewFocusManager.STATE.INVISIBLE));
  }

  public final void d()
  {
    c();
    this.b.clear();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.video.ViewFocusManager
 * JD-Core Version:    0.6.0
 */