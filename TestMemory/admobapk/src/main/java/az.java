import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class az
  implements ViewTreeObserver.OnPreDrawListener
{
  az(View paramView1, Transition paramTransition1, ArrayList paramArrayList1, Transition paramTransition2, ArrayList paramArrayList2, Transition paramTransition3, ArrayList paramArrayList3, Map paramMap, ArrayList paramArrayList4, Transition paramTransition4, View paramView2)
  {
  }

  public final boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    if (this.b != null)
      av.a(this.b, this.c);
    if (this.d != null)
      av.a(this.d, this.e);
    if (this.f != null)
      av.a(this.f, this.g);
    Iterator localIterator = this.h.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      ((View)localEntry.getValue()).setTransitionName((String)localEntry.getKey());
    }
    int m = this.i.size();
    for (int n = 0; n < m; n++)
      this.j.excludeTarget((View)this.i.get(n), false);
    this.j.excludeTarget(this.k, false);
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     az
 * JD-Core Version:    0.6.0
 */