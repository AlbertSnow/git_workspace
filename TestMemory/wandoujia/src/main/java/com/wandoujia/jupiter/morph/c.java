package com.wandoujia.jupiter.morph;

import android.content.Context;
import android.view.ViewGroup;
import com.wandoujia.api.proto.Detail;
import com.wandoujia.api.proto.MorphData;
import com.wandoujia.api.proto.MorphDetail;
import com.wandoujia.jupiter.presenter.aa;
import com.wandoujia.logv3.model.packages.FeedPackage.Builder;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.morph.engine.MoWidgetType;
import com.wandoujia.ripple_framework.k;
import com.wandoujia.ripple_framework.model.Model;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class c
{
  private static final com.wandoujia.morph.a.c a = new d();

  public static com.wandoujia.nirvana.framework.ui.a a(MorphDetail paramMorphDetail, ViewGroup paramViewGroup, k paramk)
  {
    if (paramMorphDetail.morph_type == null)
      return aa.s(paramViewGroup, paramk);
    switch (f.a[paramMorphDetail.morph_type.ordinal()])
    {
    default:
      return aa.s(paramViewGroup, paramk);
    case 1:
      return aa.t(paramViewGroup, paramk);
    case 2:
      return aa.s(paramViewGroup, paramk);
    case 3:
      return aa.s(paramViewGroup, paramk);
    case 4:
      return aa.s(paramViewGroup, paramk);
    case 5:
    }
    return aa.u(paramViewGroup, paramk);
  }

  public static HashMap<String, MorphData> a(Model paramModel)
  {
    HashMap localHashMap = new HashMap();
    if ((paramModel != null) && (paramModel.C() != null) && (paramModel.C().morph_detail != null) && (paramModel.C().morph_detail.elements != null))
    {
      Iterator localIterator = paramModel.C().morph_detail.elements.iterator();
      while (localIterator.hasNext())
      {
        MorphData localMorphData = (MorphData)localIterator.next();
        localHashMap.put(localMorphData.key, localMorphData);
      }
    }
    return localHashMap;
  }

  public static void a(Context paramContext)
  {
    com.wandoujia.morph.a.a().a(paramContext);
    com.wandoujia.morph.engine.d locald = com.wandoujia.morph.a.a().c();
    if (locald != null)
    {
      com.wandoujia.morph.a.a locala = (com.wandoujia.morph.a.a)locald.a(MoWidgetType.MorphCommonView);
      if (locala != null)
        locala.a(a);
    }
  }

  public static void a(ViewGroup paramViewGroup, MorphDetail paramMorphDetail)
  {
    FeedPackage.Builder localBuilder = new FeedPackage.Builder();
    localBuilder.name = "MorphDetail";
    localBuilder.template = paramMorphDetail.url;
    v.b().a(paramViewGroup, localBuilder.build());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.morph.c
 * JD-Core Version:    0.6.0
 */