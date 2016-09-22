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

final class ae
  implements ViewTreeObserver.OnPreDrawListener
{
  ae(View paramView1, ah paramah, Map paramMap1, Map paramMap2, Transition paramTransition, ArrayList paramArrayList, View paramView2)
  {
  }

  public final boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    View localView1 = this.b.a();
    if (localView1 != null)
    {
      if (!this.c.isEmpty())
      {
        b.a(this.d, localView1);
        this.d.keySet().retainAll(this.c.values());
        Iterator localIterator = this.c.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          String str = (String)localEntry.getValue();
          View localView2 = (View)this.d.get(str);
          if (localView2 == null)
            continue;
          localView2.setTransitionName((String)localEntry.getKey());
        }
      }
      if (this.e != null)
      {
        b.a(this.f, localView1);
        this.f.removeAll(this.d.values());
        this.f.add(this.g);
        this.e.removeTarget(this.g);
        b.b(this.e, this.f);
      }
    }
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.ae
 * JD-Core Version:    0.6.0
 */