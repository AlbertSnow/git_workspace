package com.wandoujia.jupiter.search.view;

import com.wandoujia.api.proto.HttpResponse;
import java.lang.ref.WeakReference;

final class k
  implements com.android.volley.k<HttpResponse>
{
  private final WeakReference<SearchSuggestionTextView> a;
  private final String b;

  private k(SearchSuggestionTextView paramSearchSuggestionTextView, String paramString)
  {
    this.b = paramString;
    this.a = new WeakReference(paramSearchSuggestionTextView);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.view.k
 * JD-Core Version:    0.6.0
 */