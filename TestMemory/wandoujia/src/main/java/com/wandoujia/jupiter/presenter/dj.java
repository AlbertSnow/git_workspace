package com.wandoujia.jupiter.presenter;

import android.view.View;
import com.wandoujia.api.proto.Detail;
import com.wandoujia.api.proto.MorphData;
import com.wandoujia.api.proto.MorphDetail;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import java.util.Iterator;
import java.util.List;

final class dj extends c
{
  protected final void a(Model paramModel)
  {
    MorphDetail localMorphDetail = paramModel.C().morph_detail;
    if ((localMorphDetail != null) && (!CollectionUtils.isEmpty(localMorphDetail.elements)))
    {
      Iterator localIterator = localMorphDetail.elements.iterator();
      while (localIterator.hasNext())
      {
        MorphData localMorphData = (MorphData)localIterator.next();
        if ("advantage_container".equals(localMorphData.key))
        {
          h().a("advantage_container").a().setVisibility(0);
          continue;
        }
        if (!"defect_container".equals(localMorphData.key))
          continue;
        h().a("defect_container").a().setVisibility(0);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.dj
 * JD-Core Version:    0.6.0
 */