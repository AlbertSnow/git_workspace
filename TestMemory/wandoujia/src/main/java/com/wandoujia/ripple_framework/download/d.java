package com.wandoujia.ripple_framework.download;

import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.network.page.e;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class d
  implements e<Model>
{
  private Map<DownloadDataList.DownloadSection, Integer> a = new HashMap();

  private d()
  {
    for (DownloadDataList.DownloadSection localDownloadSection : DownloadDataList.DownloadSection.values())
      this.a.put(localDownloadSection, Integer.valueOf(0));
  }

  private int a(DownloadDataList.DownloadSection paramDownloadSection)
  {
    return ((Integer)this.a.get(paramDownloadSection)).intValue();
  }

  private static DownloadDataList.DownloadSection b(DownloadInfo paramDownloadInfo)
  {
    if ((paramDownloadInfo.c.isSucceed()) || (paramDownloadInfo.c.isCanceled()))
      if (b.b(paramDownloadInfo))
      {
        if (b.a(paramDownloadInfo))
          return DownloadDataList.DownloadSection.COMPLETE_APP;
      }
      else
        return DownloadDataList.DownloadSection.COMPLETE_MM;
    return DownloadDataList.DownloadSection.INCOMPLETE;
  }

  public final List<Model> a(List<Model> paramList)
  {
    Hashtable localHashtable = new Hashtable();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      Model localModel = (Model)localIterator.next();
      DownloadDataList.DownloadSection localDownloadSection2 = b((DownloadInfo)localModel.a(R.id.download_info));
      if (localHashtable.get(localDownloadSection2) == null)
        localHashtable.put(localDownloadSection2, new ArrayList());
      ((List)localHashtable.get(localDownloadSection2)).add(localModel);
    }
    ArrayList localArrayList = new ArrayList();
    for (DownloadDataList.DownloadSection localDownloadSection1 : DownloadDataList.DownloadSection.values())
    {
      List localList = (List)localHashtable.get(localDownloadSection1);
      if (CollectionUtils.isEmpty(localList))
        continue;
      localArrayList.add(DownloadDataList.DownloadSection.access$1100(localDownloadSection1));
      localArrayList.addAll(localList);
      this.a.put(localDownloadSection1, Integer.valueOf(localList.size()));
    }
    localArrayList.add(new Model(new Entity.Builder().template_type(TemplateTypeEnum.TemplateType.END).build()));
    return localArrayList;
  }

  public final void a()
  {
    Iterator localIterator = this.a.keySet().iterator();
    while (localIterator.hasNext())
    {
      DownloadDataList.DownloadSection localDownloadSection = (DownloadDataList.DownloadSection)localIterator.next();
      this.a.put(localDownloadSection, Integer.valueOf(0));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.d
 * JD-Core Version:    0.6.0
 */