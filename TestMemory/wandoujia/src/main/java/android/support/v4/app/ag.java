package android.support.v4.app;

import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class ag
  implements ViewTreeObserver.OnPreDrawListener
{
  ag(View paramView1, Transition paramTransition1, View paramView2, ArrayList paramArrayList1, Transition paramTransition2, ArrayList paramArrayList2, Transition paramTransition3, ArrayList paramArrayList3, Map paramMap, ArrayList paramArrayList4, Transition paramTransition4)
  {
  }

  public final boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    if (this.b != null)
    {
      this.b.removeTarget(this.c);
      b.a(this.b, this.d);
    }
    if (this.e != null)
      b.a(this.e, this.f);
    if (this.g != null)
      b.a(this.g, this.h);
    Iterator localIterator = this.i.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      ((View)localEntry.getValue()).setTransitionName((String)localEntry.getKey());
    }
    int m = this.j.size();
    for (int n = 0; n < m; n++)
      this.k.excludeTarget((View)this.j.get(n), false);
    this.k.excludeTarget(this.c, false);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.ag
 * JD-Core Version:    0.6.0
 */