package android.support.v7.widget;

import android.content.Context;
import android.support.v7.b.c;
import android.support.v7.internal.view.menu.ac;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.x;
import android.view.View;
import android.widget.ImageButton;

final class dp
  implements x
{
  m a;
  private i b;

  private dp(Toolbar paramToolbar)
  {
  }

  public final void a(Context paramContext, i parami)
  {
    if ((this.b != null) && (this.a != null))
      this.b.b(this.a);
    this.b = parami;
  }

  public final void a(i parami, boolean paramBoolean)
  {
  }

  public final boolean a(ac paramac)
  {
    return false;
  }

  public final void b(boolean paramBoolean)
  {
    int i;
    int j;
    if (this.a != null)
    {
      i locali = this.b;
      i = 0;
      if (locali != null)
        j = this.b.size();
    }
    for (int k = 0; ; k++)
    {
      i = 0;
      if (k < j)
      {
        if (this.b.getItem(k) != this.a)
          continue;
        i = 1;
      }
      if (i == 0)
        c(this.a);
      return;
    }
  }

  public final boolean b()
  {
    return false;
  }

  public final boolean b(m paramm)
  {
    Toolbar.access$200(this.c);
    if (Toolbar.access$300(this.c).getParent() != this.c)
      this.c.addView(Toolbar.access$300(this.c));
    this.c.mExpandedActionView = paramm.getActionView();
    this.a = paramm;
    if (this.c.mExpandedActionView.getParent() != this.c)
    {
      Toolbar.LayoutParams localLayoutParams = this.c.generateDefaultLayoutParams();
      localLayoutParams.a = (0x800003 | 0x70 & Toolbar.access$400(this.c));
      localLayoutParams.b = 2;
      this.c.mExpandedActionView.setLayoutParams(localLayoutParams);
      this.c.addView(this.c.mExpandedActionView);
    }
    Toolbar.access$500(this.c, true);
    this.c.requestLayout();
    paramm.e(true);
    if ((this.c.mExpandedActionView instanceof c))
      ((c)this.c.mExpandedActionView).a();
    return true;
  }

  public final boolean c(m paramm)
  {
    if ((this.c.mExpandedActionView instanceof c))
      ((c)this.c.mExpandedActionView).b();
    this.c.removeView(this.c.mExpandedActionView);
    this.c.removeView(Toolbar.access$300(this.c));
    this.c.mExpandedActionView = null;
    Toolbar.access$500(this.c, false);
    this.a = null;
    this.c.requestLayout();
    paramm.e(false);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.dp
 * JD-Core Version:    0.6.0
 */