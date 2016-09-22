import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class ax
  implements ViewTreeObserver.OnPreDrawListener
{
  ax(View paramView1, Transition paramTransition, View paramView2, bb parambb, Map paramMap1, Map paramMap2, ArrayList paramArrayList)
  {
  }

  public final boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    if (this.b != null)
      this.b.removeTarget(this.c);
    View localView1 = this.d.a();
    if (localView1 != null)
    {
      if (!this.e.isEmpty())
      {
        av.a(this.f, localView1);
        this.f.keySet().retainAll(this.e.values());
        Iterator localIterator = this.e.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          String str = (String)localEntry.getValue();
          View localView2 = (View)this.f.get(str);
          if (localView2 == null)
            continue;
          localView2.setTransitionName((String)localEntry.getKey());
        }
      }
      if (this.b != null)
      {
        av.a(this.g, localView1);
        this.g.removeAll(this.f.values());
        this.g.add(this.c);
        av.b(this.b, this.g);
      }
    }
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ax
 * JD-Core Version:    0.6.0
 */