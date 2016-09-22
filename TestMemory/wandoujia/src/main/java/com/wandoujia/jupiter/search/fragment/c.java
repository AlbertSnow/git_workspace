package com.wandoujia.jupiter.search.fragment;

import android.content.Context;
import android.view.View;
import com.wandoujia.p4.feedback.FeedbackActivity;
import com.wandoujia.p4.search.utils.SearchConst.SearchType;
import com.wandoujia.ripple_framework.log.h;

final class c extends h
{
  c(b paramb)
  {
  }

  public final boolean a(View paramView)
  {
    SearchConst.SearchType localSearchType = SearchConst.SearchType.ALL;
    Context localContext = paramView.getContext();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = localSearchType.name();
    FeedbackActivity.a(localContext, String.format("t:%s", arrayOfObject), SearchHomeFragment.a(this.a.a));
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.fragment.c
 * JD-Core Version:    0.6.0
 */