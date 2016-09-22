package android.support.v7.internal.widget;

import android.support.v7.widget.ListPopupWindow;
import android.support.v7.widget.bi;
import android.view.View;

final class s extends bi
{
  s(ActivityChooserView paramActivityChooserView, View paramView)
  {
    super(paramView);
  }

  public final ListPopupWindow a()
  {
    return ActivityChooserView.b(this.a);
  }

  protected final boolean b()
  {
    this.a.a();
    return true;
  }

  protected final boolean c()
  {
    this.a.b();
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.s
 * JD-Core Version:    0.6.0
 */