package com.wandoujia.jupiter.presenter;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.wandoujia.api.proto.Detail;
import com.wandoujia.api.proto.MorphData;
import com.wandoujia.api.proto.MorphDetail;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.e;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class dx extends c
{
  private List<String> a = Arrays.asList(new String[] { "icon1", "icon2", "icon3", "icon4", "icon5" });
  private int g = 2130837953;

  protected final void a(Model paramModel)
  {
    MorphDetail localMorphDetail = paramModel.C().morph_detail;
    Iterator localIterator1 = this.a.iterator();
    while (localIterator1.hasNext())
    {
      String str1 = (String)localIterator1.next();
      View localView = h().a(str1).a();
      MorphData localMorphData;
      if ((localMorphDetail != null) && (!CollectionUtils.isEmpty(localMorphDetail.elements)))
      {
        Iterator localIterator2 = localMorphDetail.elements.iterator();
        do
        {
          if (!localIterator2.hasNext())
            break;
          localMorphData = (MorphData)localIterator2.next();
        }
        while (!str1.equals(localMorphData.key));
      }
      for (String str2 = localMorphData.value; ; str2 = null)
      {
        if (localView == null)
          break label183;
        if ((TextUtils.isEmpty(str2)) || (!(localView instanceof ImageView)))
          break label185;
        localView.setVisibility(0);
        i.k().f();
        new e(0);
        e.a((ImageView)localView, str2, this.g);
        break;
      }
      label183: continue;
      label185: localView.setVisibility(4);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.dx
 * JD-Core Version:    0.6.0
 */