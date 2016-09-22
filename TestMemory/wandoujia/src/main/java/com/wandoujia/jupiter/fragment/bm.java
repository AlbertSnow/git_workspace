package com.wandoujia.jupiter.fragment;

import android.support.v4.app.b;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wandoujia.api.proto.MorphData;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

final class bm extends com.wandoujia.ripple_framework.c.c
{
  protected final void a(Model paramModel)
  {
    View localView1 = h().a(2131493733).a();
    View localView2 = h().a(2131493712).a();
    LinearLayout localLinearLayout = (LinearLayout)h().a(2131493133).a();
    if ((paramModel.B() == null) || (paramModel.B().size() == 0))
    {
      localView1.setVisibility(8);
      localLinearLayout.setVisibility(8);
      localView2.setVisibility(8);
      return;
    }
    localView1.setVisibility(0);
    localLinearLayout.setVisibility(0);
    localView2.setVisibility(0);
    localLinearLayout.removeAllViews();
    Iterator localIterator = paramModel.B().iterator();
    label321: label326: 
    while (true)
    {
      label114: Model localModel;
      HashMap localHashMap;
      String str1;
      if (localIterator.hasNext())
      {
        localModel = (Model)localIterator.next();
        localHashMap = com.wandoujia.jupiter.morph.c.a(localModel);
        str1 = "";
        if (localHashMap.containsKey("title"))
          str1 = ((MorphData)localHashMap.get("title")).value;
        if (!localHashMap.containsKey("cover"))
          break label321;
      }
      for (String str2 = ((MorphData)localHashMap.get("cover")).value; ; str2 = "")
      {
        if ((TextUtils.isEmpty(str1)) || (TextUtils.isEmpty(str2)))
          break label326;
        View localView3 = b.b(f(), 2130903357);
        AsyncImageView localAsyncImageView = (AsyncImageView)localView3.findViewById(2131492889);
        TextView localTextView = (TextView)localView3.findViewById(2131492998);
        localAsyncImageView.a(str2, 2131361863);
        localTextView.setText(str1);
        if (localModel.t() != null)
        {
          bn localbn = new bn(this, localModel);
          localbn.a(localView3, Logger.Module.UI, ViewLogPackage.Element.CARD, ViewLogPackage.Action.REDIRECT, str1, null);
          localView3.setOnClickListener(localbn);
        }
        localLinearLayout.addView(localView3);
        break label114;
        break;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.bm
 * JD-Core Version:    0.6.0
 */