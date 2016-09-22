package android.support.v7.widget;

import android.support.v4.view.q;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

final class db
  implements View.OnKeyListener
{
  db(SearchView paramSearchView)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if (SearchView.o(this.a) == null);
    do
    {
      return false;
      if ((SearchView.m(this.a).isPopupShowing()) && (SearchView.m(this.a).getListSelection() != -1))
        return SearchView.a(this.a, paramInt, paramKeyEvent);
    }
    while ((SearchView.SearchAutoComplete.a(SearchView.m(this.a))) || (!q.b(paramKeyEvent)) || (paramKeyEvent.getAction() != 1) || (paramInt != 66));
    paramView.cancelLongPress();
    SearchView.a(this.a, SearchView.m(this.a).getText().toString());
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.db
 * JD-Core Version:    0.6.0
 */