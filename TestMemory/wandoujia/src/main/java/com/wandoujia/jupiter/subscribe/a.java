package com.wandoujia.jupiter.subscribe;

import android.content.Context;
import android.content.res.Resources;
import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.api.proto.PublisherDetail;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.nirvana.framework.network.page.e;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a extends com.wandoujia.jupiter.a.a
{
  private e<Model> a;

  public a(e<Model> parame)
  {
    this.a = parame;
  }

  public final List<Model> a(List<Model> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      Model localModel = (Model)localIterator.next();
      if (TemplateTypeEnum.TemplateType.DETAIL_HEADER.equals(localModel.g()))
      {
        PublisherDetail localPublisherDetail = localModel.I();
        Entity.Builder localBuilder = new Entity.Builder(localModel.b());
        String str = JupiterApplication.e().getResources().getString(2131625286);
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = localPublisherDetail.subscribedCount;
        arrayOfObject[1] = localPublisherDetail.feedCount;
        localBuilder.sub_title(String.format(str, arrayOfObject));
        localArrayList.add(new Model(localBuilder.build()));
        if (localPublisherDetail.relatedApp == null)
          continue;
        localArrayList.add(new Model(new Entity.Builder(localModel.b()).template_type(TemplateTypeEnum.TemplateType.SINGLE_MICRO).build()));
        continue;
      }
      localArrayList.add(localModel);
    }
    if (this.a != null)
      return this.a.a(localArrayList);
    return localArrayList;
  }

  public final void a()
  {
    super.a();
    if (this.a != null)
      this.a.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.a
 * JD-Core Version:    0.6.0
 */