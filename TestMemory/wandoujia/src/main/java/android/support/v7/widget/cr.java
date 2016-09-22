package android.support.v7.widget;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;

final class cr
  implements Runnable
{
  cr(SearchView paramSearchView)
  {
  }

  public final void run()
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)this.a.getContext().getSystemService("input_method");
    if (localInputMethodManager != null)
      SearchView.a.a(localInputMethodManager, this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.cr
 * JD-Core Version:    0.6.0
 */