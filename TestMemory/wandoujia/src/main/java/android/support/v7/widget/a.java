package android.support.v7.widget;

import android.support.v7.internal.view.menu.ac;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.y;
import android.view.MenuItem;
import android.view.View;

final class a
  implements y
{
  private a(ActionMenuPresenter paramActionMenuPresenter)
  {
  }

  static int a(cm paramcm, bs parambs, View paramView1, View paramView2, ce paramce, boolean paramBoolean)
  {
    if ((paramce.p() == 0) || (paramcm.e() == 0) || (paramView1 == null) || (paramView2 == null))
      return 0;
    if (!paramBoolean)
      return 1 + Math.abs(ce.e(paramView1) - ce.e(paramView2));
    int i = parambs.b(paramView2) - parambs.a(paramView1);
    return Math.min(parambs.f(), i);
  }

  static int a(cm paramcm, bs parambs, View paramView1, View paramView2, ce paramce, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = paramce.p();
    int j = 0;
    if (i != 0)
    {
      int k = paramcm.e();
      j = 0;
      if (k != 0)
      {
        j = 0;
        if (paramView1 != null)
        {
          j = 0;
          if (paramView2 != null)
            break label46;
        }
      }
    }
    while (true)
    {
      return j;
      label46: int m = Math.min(ce.e(paramView1), ce.e(paramView2));
      int n = Math.max(ce.e(paramView1), ce.e(paramView2));
      if (paramBoolean2);
      for (j = Math.max(0, -1 + (paramcm.e() - n)); paramBoolean1; j = Math.max(0, m))
      {
        int i1 = Math.abs(parambs.b(paramView2) - parambs.a(paramView1));
        int i2 = 1 + Math.abs(ce.e(paramView1) - ce.e(paramView2));
        return Math.round(i1 / i2 * j + (parambs.c() - parambs.a(paramView1)));
      }
    }
  }

  static int b(cm paramcm, bs parambs, View paramView1, View paramView2, ce paramce, boolean paramBoolean)
  {
    if ((paramce.p() == 0) || (paramcm.e() == 0) || (paramView1 == null) || (paramView2 == null))
      return 0;
    if (!paramBoolean)
      return paramcm.e();
    int i = parambs.b(paramView2) - parambs.a(paramView1);
    int j = 1 + Math.abs(ce.e(paramView1) - ce.e(paramView2));
    return (int)(i / j * paramcm.e());
  }

  public final void a(i parami, boolean paramBoolean)
  {
    if ((parami instanceof ac))
      ((ac)parami).o().a(false);
    y localy = this.a.a();
    if (localy != null)
      localy.a(parami, paramBoolean);
  }

  public final boolean a(i parami)
  {
    if (parami == null)
      return false;
    ((ac)parami).getItem().getItemId();
    y localy = this.a.a();
    if (localy != null)
      return localy.a(parami);
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.a
 * JD-Core Version:    0.6.0
 */