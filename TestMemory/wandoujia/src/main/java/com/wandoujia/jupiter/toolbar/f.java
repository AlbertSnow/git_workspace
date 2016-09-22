package com.wandoujia.jupiter.toolbar;

import android.support.v7.widget.l;
import android.text.TextUtils;
import android.view.MenuItem;
import com.wandoujia.jupiter.search.view.SearchSuggestionTextView;

final class f
  implements l
{
  f(JupiterToolbarForSearch paramJupiterToolbarForSearch)
  {
  }

  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() != 2131494121)
      return false;
    this.a.a(false);
    if ((TextUtils.isEmpty(JupiterToolbarForSearch.a(this.a).getText())) && (JupiterToolbarForSearch.a(this.a).a()) && (!TextUtils.isEmpty(JupiterToolbarForSearch.a(this.a).getHint())))
    {
      JupiterToolbarForSearch.a(this.a, JupiterToolbarForSearch.a(this.a).getHint().toString());
      return true;
    }
    if (JupiterToolbarForSearch.a(this.a).getText() != null)
      JupiterToolbarForSearch.a(this.a, JupiterToolbarForSearch.a(this.a).getText().toString());
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.toolbar.f
 * JD-Core Version:    0.6.0
 */