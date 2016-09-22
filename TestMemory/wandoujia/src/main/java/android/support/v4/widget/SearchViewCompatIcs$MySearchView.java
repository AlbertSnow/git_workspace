package android.support.v4.widget;

import android.widget.SearchView;

public class SearchViewCompatIcs$MySearchView extends SearchView
{
  public void onActionViewCollapsed()
  {
    setQuery("", false);
    super.onActionViewCollapsed();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.SearchViewCompatIcs.MySearchView
 * JD-Core Version:    0.6.0
 */