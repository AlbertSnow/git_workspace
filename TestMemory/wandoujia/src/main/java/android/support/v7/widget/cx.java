package android.support.v7.widget;

import android.view.View;
import android.view.View.OnFocusChangeListener;

final class cx
  implements View.OnFocusChangeListener
{
  cx(SearchView paramSearchView)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (SearchView.c(this.a) != null)
      SearchView.c(this.a).onFocusChange(this.a, paramBoolean);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.cx
 * JD-Core Version:    0.6.0
 */