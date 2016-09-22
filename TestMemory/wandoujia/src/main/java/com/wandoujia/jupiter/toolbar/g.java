package com.wandoujia.jupiter.toolbar;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;

final class g
  implements Runnable
{
  g(JupiterToolbarForSearch paramJupiterToolbarForSearch)
  {
  }

  public final void run()
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)this.a.getContext().getSystemService("input_method");
    if (localInputMethodManager != null)
      localInputMethodManager.showSoftInput(JupiterToolbarForSearch.a(this.a), 0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.toolbar.g
 * JD-Core Version:    0.6.0
 */