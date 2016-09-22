package com.wandoujia.jupiter.search.view;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.wandoujia.jupiter.search.d.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

final class e
  implements TextWatcher
{
  e(SearchSuggestionTextView paramSearchSuggestionTextView)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    if (TextUtils.isEmpty(paramEditable))
      this.a.dismissDropDown();
    while (true)
    {
      return;
      if (!SearchSuggestionTextView.a(this.a))
      {
        SearchSuggestionTextView.b(this.a);
        return;
      }
      String str1 = paramEditable.toString();
      try
      {
        String str4 = URLEncoder.encode(str1, "UTF-8");
        str2 = str4;
        if ((this.a.isPerformingCompletion()) || (TextUtils.isEmpty(str2)))
          continue;
        String str3 = String.format("http://apis.wandoujia.com/five/v1/search/%s/suggestions?format=proto&max=5", new Object[] { str2 });
        if (SearchSuggestionTextView.c(this.a) != null)
          SearchSuggestionTextView.c(this.a).f();
        SearchSuggestionTextView.a(this.a, new a(str3, new k(this.a, str1, 0), new i(this.a, str1, 0)));
        SearchSuggestionTextView.c(this.a).u();
        return;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        while (true)
          String str2 = null;
      }
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.a.isPopupShowing())
      this.a.dismissDropDown();
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.view.e
 * JD-Core Version:    0.6.0
 */