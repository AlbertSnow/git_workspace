package android.support.v7.widget;

import android.view.View;
import android.view.View.OnClickListener;

final class da
  implements View.OnClickListener
{
  da(SearchView paramSearchView)
  {
  }

  public final void onClick(View paramView)
  {
    if (paramView == SearchView.e(this.a))
      SearchView.f(this.a);
    do
    {
      return;
      if (paramView == SearchView.g(this.a))
      {
        SearchView.h(this.a);
        return;
      }
      if (paramView == SearchView.i(this.a))
      {
        SearchView.j(this.a);
        return;
      }
      if (paramView != SearchView.k(this.a))
        continue;
      SearchView.l(this.a);
      return;
    }
    while (paramView != SearchView.m(this.a));
    SearchView.n(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.da
 * JD-Core Version:    0.6.0
 */