package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.text.Html;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.api.proto.Action;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class ListPresenterFactory$11 extends c
{
  protected final void a(Model paramModel)
  {
    int i = 35;
    List localList = paramModel.B();
    TextView localTextView = (TextView)e();
    if (CollectionUtils.isEmpty(localList))
    {
      localTextView.setText(paramModel.n());
      return;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      Model localModel = (Model)localIterator.next();
      String str2 = e().getContext().getString(2131625328);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = localModel.t().intent;
      arrayOfObject[1] = localModel.n();
      localArrayList.add(String.format(str2, arrayOfObject));
    }
    Spannable localSpannable = (Spannable)Html.fromHtml(String.format(paramModel.n(), localArrayList.toArray()));
    localSpannable.setSpan(new ListPresenterFactory.11.NoUnderlineSpan(), 0, localSpannable.length(), 17);
    if (localSpannable.length() <= i)
      i = localSpannable.length();
    while (true)
    {
      localTextView.setText(localSpannable.subSequence(0, i));
      localTextView.setMovementMethod(LinkMovementMethod.getInstance());
      return;
      String str1 = localSpannable.toString().substring(0, i);
      if (str1.endsWith(" "))
        continue;
      i = str1.lastIndexOf(" ");
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.ListPresenterFactory.11
 * JD-Core Version:    0.6.0
 */