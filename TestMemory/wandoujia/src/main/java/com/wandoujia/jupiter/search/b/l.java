package com.wandoujia.jupiter.search.b;

import android.view.View;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.jupiter.search.view.SearchSuggestionTextView;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;

final class l extends h
{
  l(Model paramModel)
  {
  }

  public final boolean a(View paramView)
  {
    SearchSuggestionTextView localSearchSuggestionTextView = (SearchSuggestionTextView)paramView.getRootView().findViewById(2131493984);
    if (localSearchSuggestionTextView != null)
      localSearchSuggestionTextView.dismissDropDown();
    i.k().a("navigation");
    NavigationManager.a(paramView.getContext(), this.a.n(), "SUGGESTION");
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.b.l
 * JD-Core Version:    0.6.0
 */