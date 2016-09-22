package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.f;
import android.support.v4.view.a.m;
import android.support.v4.view.bg;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public final class cp extends a
{
  final RecyclerView b;
  final a c = new cq(this);

  public cp(RecyclerView paramRecyclerView)
  {
    this.b = paramRecyclerView;
  }

  public final void a(View paramView, f paramf)
  {
    super.a(paramView, paramf);
    paramf.b(RecyclerView.class.getName());
    if ((!this.b.e()) && (this.b.getLayoutManager() != null))
    {
      ce localce = this.b.getLayoutManager();
      ch localch = localce.f.a;
      cm localcm = localce.f.e;
      if ((bg.b(localce.f, -1)) || (bg.a(localce.f, -1)))
      {
        paramf.a(8192);
        paramf.i(true);
      }
      if ((bg.b(localce.f, 1)) || (bg.a(localce.f, 1)))
      {
        paramf.a(4096);
        paramf.i(true);
      }
      paramf.a(m.a(localce.a(localch, localcm), localce.b(localch, localcm)));
    }
  }

  public final boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    int i;
    if (super.a(paramView, paramInt, paramBundle))
      i = 1;
    ce localce2;
    int m;
    int k;
    do
    {
      RecyclerView localRecyclerView;
      do
      {
        ce localce1;
        do
        {
          boolean bool;
          do
          {
            return i;
            bool = this.b.e();
            i = 0;
          }
          while (bool);
          localce1 = this.b.getLayoutManager();
          i = 0;
        }
        while (localce1 == null);
        localce2 = this.b.getLayoutManager();
        localRecyclerView = localce2.f;
        i = 0;
      }
      while (localRecyclerView == null);
      switch (paramInt)
      {
      default:
        m = 0;
        k = 0;
        if (k != 0)
          break label139;
        i = 0;
      case 8192:
      case 4096:
      }
    }
    while (m == 0);
    label139: localce2.f.scrollBy(m, k);
    return true;
    if (bg.b(localce2.f, -1));
    for (int j = -(localce2.r() - localce2.t() - localce2.v()); ; j = 0)
    {
      if (bg.a(localce2.f, -1))
      {
        int i1 = -(localce2.q() - localce2.s() - localce2.u());
        k = j;
        m = i1;
        break;
        if (!bg.b(localce2.f, 1))
          break label311;
      }
      label311: for (j = localce2.r() - localce2.t() - localce2.v(); ; j = 0)
      {
        if (bg.a(localce2.f, 1))
        {
          int n = localce2.q() - localce2.s() - localce2.u();
          k = j;
          m = n;
          break;
        }
        k = j;
        m = 0;
        break;
      }
    }
  }

  public final void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.d(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(RecyclerView.class.getName());
    if (((paramView instanceof RecyclerView)) && (!this.b.e()))
    {
      RecyclerView localRecyclerView = (RecyclerView)paramView;
      if (localRecyclerView.getLayoutManager() != null)
        localRecyclerView.getLayoutManager().a(paramAccessibilityEvent);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.cp
 * JD-Core Version:    0.6.0
 */