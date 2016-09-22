import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;

final class q
  implements ViewTreeObserver.OnPreDrawListener
{
  q(o paramo, View paramView, Object paramObject, ArrayList paramArrayList, t paramt, boolean paramBoolean, z paramz1, z paramz2)
  {
  }

  public final boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    o localo1;
    t localt1;
    z localz;
    cw localcw1;
    cw localcw2;
    if (this.b != null)
    {
      av.a(this.b, this.c);
      this.c.clear();
      localo1 = this.h;
      localt1 = this.d;
      boolean bool = this.e;
      localz = this.f;
      localcw1 = new cw();
      View localView1 = localz.K;
      if ((localView1 == null) || (localo1.l == null))
        break label250;
      av.a(localcw1, localView1);
      if (!bool)
        break label240;
      localcw2 = o.a(localo1.l, localo1.m, localcw1);
      if (!bool)
        break label257;
      localo1.a(localt1, localcw2, true);
    }
    while (true)
    {
      av.a(this.b, this.d.d, localcw2, this.c);
      o localo2 = this.h;
      t localt2 = this.d;
      if ((localo2.m != null) && (!localcw2.isEmpty()))
      {
        View localView2 = (View)localcw2.get(localo2.m.get(0));
        if (localView2 != null)
          localt2.c.a = localView2;
      }
      o.a(this.f, this.g, this.e, localcw2);
      return true;
      label240: db.a(localcw1, localo1.m);
      label250: localcw2 = localcw1;
      break;
      label257: o.b(localt1, localcw2, true);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     q
 * JD-Core Version:    0.6.0
 */