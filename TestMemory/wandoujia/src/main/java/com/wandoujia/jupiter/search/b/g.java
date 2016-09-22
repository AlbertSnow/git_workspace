package com.wandoujia.jupiter.search.b;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.wandoujia.jupiter.search.activity.SearchHomeActivity;
import com.wandoujia.p4.feedback.FeedbackActivity;
import com.wandoujia.p4.search.utils.SearchConst.SearchType;
import com.wandoujia.ripple_framework.log.h;

final class g extends h
{
  public final boolean a(View paramView)
  {
    SearchConst.SearchType localSearchType = SearchConst.SearchType.ALL;
    Context localContext1 = paramView.getContext();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = localSearchType.name();
    String str1 = String.format("t:%s", arrayOfObject);
    Context localContext2 = paramView.getContext();
    SearchHomeActivity localSearchHomeActivity;
    String str2;
    if ((localContext2 instanceof SearchHomeActivity))
    {
      localSearchHomeActivity = (SearchHomeActivity)localContext2;
      String str3 = localSearchHomeActivity.a();
      if (!TextUtils.isEmpty(str3))
        str2 = str3;
    }
    while (true)
    {
      FeedbackActivity.a(localContext1, str1, str2);
      return false;
      str2 = localSearchHomeActivity.a();
      continue;
      str2 = "";
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.b.g
 * JD-Core Version:    0.6.0
 */