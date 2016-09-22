package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class cs extends c
{
  protected final void a(Model paramModel)
  {
    List localList1 = paramModel.b().attach_entity;
    if (CollectionUtils.isEmpty(localList1))
      return;
    TextView localTextView = (TextView)e();
    List localList2 = ((Entity)localList1.get(0)).sub_entity;
    if (CollectionUtils.isEmpty(localList2))
    {
      localTextView.setText(((Entity)localList1.get(0)).title);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = localList2.iterator();
    while (localIterator.hasNext())
    {
      Entity localEntity = (Entity)localIterator.next();
      String str = e().getContext().getString(2131624307);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localEntity.title;
      localArrayList.add(String.format(str, arrayOfObject));
    }
    localTextView.setText(Html.fromHtml(String.format(((Entity)localList1.get(0)).title, localArrayList.toArray())));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.cs
 * JD-Core Version:    0.6.0
 */