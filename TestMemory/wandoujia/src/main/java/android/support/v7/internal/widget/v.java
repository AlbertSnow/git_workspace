package android.support.v7.internal.widget;

import android.content.pm.ResolveInfo;
import android.support.v4.view.j;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow.OnDismissListener;

final class v
  implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  private v(ActivityChooserView paramActivityChooserView)
  {
  }

  public final void onClick(View paramView)
  {
    if (paramView == ActivityChooserView.e(this.a))
    {
      this.a.b();
      ResolveInfo localResolveInfo = ActivityChooserView.a(this.a).b();
      ActivityChooserView.a(this.a).e().a(localResolveInfo);
      ActivityChooserView.a(this.a).e().b();
      return;
    }
    if (paramView == ActivityChooserView.f(this.a))
    {
      ActivityChooserView.a(this.a, false);
      ActivityChooserView.a(this.a, ActivityChooserView.g(this.a));
      return;
    }
    throw new IllegalArgumentException();
  }

  public final void onDismiss()
  {
    if (ActivityChooserView.h(this.a) != null)
      ActivityChooserView.h(this.a).onDismiss();
    if (this.a.a != null)
      this.a.a.a(false);
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    switch (((u)paramAdapterView.getAdapter()).getItemViewType(paramInt))
    {
    default:
      throw new IllegalArgumentException();
    case 1:
      ActivityChooserView.a(this.a, 2147483647);
    case 0:
    }
    while (true)
    {
      return;
      this.a.b();
      if (!ActivityChooserView.d(this.a))
        break;
      if (paramInt <= 0)
        continue;
      ActivityChooserView.a(this.a).e().b(paramInt);
      return;
    }
    ActivityChooserView.a(this.a).e().b();
  }

  public final boolean onLongClick(View paramView)
  {
    if (paramView == ActivityChooserView.e(this.a))
    {
      if (ActivityChooserView.a(this.a).getCount() > 0)
      {
        ActivityChooserView.a(this.a, true);
        ActivityChooserView.a(this.a, ActivityChooserView.g(this.a));
      }
      return true;
    }
    throw new IllegalArgumentException();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.v
 * JD-Core Version:    0.6.0
 */