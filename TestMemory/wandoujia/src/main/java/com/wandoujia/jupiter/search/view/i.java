package com.wandoujia.jupiter.search.view;

import com.android.volley.VolleyError;
import com.android.volley.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

final class i
  implements j
{
  private final WeakReference<SearchSuggestionTextView> a;
  private final String b;

  private i(SearchSuggestionTextView paramSearchSuggestionTextView, String paramString)
  {
    this.a = new WeakReference(paramSearchSuggestionTextView);
    this.b = paramString;
  }

  public final void onErrorResponse(VolleyError paramVolleyError)
  {
    if (this.a.get() == null)
      return;
    SearchSuggestionTextView.a((SearchSuggestionTextView)this.a.get(), new ArrayList(), this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.view.i
 * JD-Core Version:    0.6.0
 */