package com.wandoujia.ripple_framework.download;

import android.text.TextUtils;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppChangedListener;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.nirvana.framework.network.page.g;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.event.DownloadDBEvent;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.j;
import com.wandoujia.ripple_framework.model.Model;
import de.greenrobot.event.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class DownloadDataList extends com.wandoujia.nirvana.framework.network.page.a<Model>
{
  private final String a;
  private final List<Model> b = new ArrayList();
  private final com.wandoujia.ripple_framework.download.a.a c;
  private final d d = new d(0);
  private boolean e;
  private final LocalAppChangedListener f = new a(this);

  public DownloadDataList(String paramString)
  {
    super(null);
    a(this.d);
    this.a = paramString;
    this.c = ((DownloadManager)i.k().a("download")).c().a();
  }

  private void a(DownloadInfo paramDownloadInfo)
  {
    Iterator localIterator = this.b.iterator();
    for (int i = 0; ; i++)
    {
      Model localModel;
      if (localIterator.hasNext())
      {
        localModel = (Model)localIterator.next();
        DownloadInfo localDownloadInfo = (DownloadInfo)localModel.a(R.id.download_info);
        if ((localDownloadInfo == null) || (!TextUtils.equals(localDownloadInfo.a, paramDownloadInfo.a)))
          continue;
        if (d.a(this.d, i) != d.a(paramDownloadInfo))
        {
          b(localDownloadInfo);
          a(Collections.singletonList(paramDownloadInfo));
        }
      }
      else
      {
        return;
      }
      localModel.a(R.id.download_info, paramDownloadInfo);
      a(DataLoadListener.Op.UPDATE, new g(i, localModel, null, Collections.singletonList(localModel)));
      return;
    }
  }

  private void a(List<DownloadInfo> paramList)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      DownloadInfo localDownloadInfo = (DownloadInfo)localIterator.next();
      DownloadDataList.DownloadSection localDownloadSection2 = d.a(localDownloadInfo);
      if (localHashMap.get(localDownloadSection2) == null)
        localHashMap.put(localDownloadSection2, new ArrayList());
      List localList = (List)localHashMap.get(localDownloadSection2);
      Model localModel = new Model(new Entity.Builder().title(localDownloadInfo.f).icon(localDownloadInfo.g).id_string(localDownloadInfo.a).content_type(ContentTypeEnum.ContentType.DOWNLOAD_INFO).template_type(TemplateTypeEnum.TemplateType.DOWNLOAD_ITEM).build());
      localModel.a(R.id.download_info, localDownloadInfo);
      localList.add(localModel);
    }
    DownloadDataList.DownloadSection[] arrayOfDownloadSection = DownloadDataList.DownloadSection.values();
    int i = arrayOfDownloadSection.length;
    int j = 0;
    if (j < i)
    {
      DownloadDataList.DownloadSection localDownloadSection1 = arrayOfDownloadSection[j];
      int k;
      if (!CollectionUtils.isEmpty((Collection)localHashMap.get(localDownloadSection1)))
      {
        k = d.c(this.d, localDownloadSection1);
        if (d.b(this.d, localDownloadSection1) != 0)
          break label333;
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(DownloadDataList.DownloadSection.access$1100(localDownloadSection1));
        localArrayList.addAll((Collection)localHashMap.get(localDownloadSection1));
        this.b.addAll(k, localArrayList);
        d.a(this.d, localDownloadSection1, ((List)localHashMap.get(localDownloadSection1)).size());
        a(DataLoadListener.Op.ADD, new g(k, null, null, localArrayList));
      }
      while (true)
      {
        j++;
        break;
        label333: this.b.addAll(k + 1, (Collection)localHashMap.get(localDownloadSection1));
        d.a(this.d, localDownloadSection1, ((List)localHashMap.get(localDownloadSection1)).size());
        a(DataLoadListener.Op.ADD, new g(k + 1, null, null, (List)localHashMap.get(localDownloadSection1)));
      }
    }
  }

  private void a(boolean paramBoolean)
  {
    a(DataLoadListener.Op.REFRESH);
    this.c.b(new b(this, paramBoolean));
  }

  private void b(DownloadInfo paramDownloadInfo)
  {
    Iterator localIterator = this.b.iterator();
    for (int i = 0; localIterator.hasNext(); i++)
    {
      DownloadInfo localDownloadInfo = (DownloadInfo)((Model)localIterator.next()).a(R.id.download_info);
      if ((localDownloadInfo != null) && (TextUtils.equals(localDownloadInfo.a, paramDownloadInfo.a)))
        break;
    }
    if (i >= this.b.size())
      return;
    DownloadDataList.DownloadSection localDownloadSection = d.a(this.d, i);
    d.a(this.d, localDownloadSection);
    if (d.b(this.d, localDownloadSection) == 0)
    {
      this.b.remove(i);
      this.b.remove(i - 1);
      a(DataLoadListener.Op.REMOVE_RANGE, new g(i - 1, 2));
      return;
    }
    a(DataLoadListener.Op.REMOVE, new g(i, this.b.remove(i), null, null));
  }

  private Model c(int paramInt)
  {
    return (Model)this.b.get(paramInt);
  }

  public final String a()
  {
    return this.a;
  }

  public final boolean b()
  {
    return !this.e;
  }

  public final List<Model> c()
  {
    return this.b;
  }

  protected final void d()
  {
    a(false);
  }

  protected final void e()
  {
    a(true);
  }

  public final void l()
  {
    super.l();
    ((c)i.k().a("event_bus")).c(this);
    ((AppManager)i.k().a("app")).b(this.f);
  }

  public final boolean m()
  {
    int i;
    if (!super.m())
    {
      int j = this.b.size();
      i = 0;
      if (j == 1)
      {
        TemplateTypeEnum.TemplateType localTemplateType1 = c(0).g();
        TemplateTypeEnum.TemplateType localTemplateType2 = TemplateTypeEnum.TemplateType.END;
        i = 0;
        if (localTemplateType1 != localTemplateType2);
      }
    }
    else
    {
      i = 1;
    }
    return i;
  }

  public final void n()
  {
    ((c)i.k().a("event_bus")).a(this);
    ((AppManager)i.k().a("app")).a(this.f);
  }

  public final void onEventMainThread(DownloadDBEvent paramDownloadDBEvent)
  {
    switch (c.a[paramDownloadDBEvent.a.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return;
      a(paramDownloadDBEvent.b);
      return;
      Iterator localIterator2 = paramDownloadDBEvent.b.iterator();
      while (localIterator2.hasNext())
        a((DownloadInfo)localIterator2.next());
      continue;
      Iterator localIterator1 = paramDownloadDBEvent.b.iterator();
      while (localIterator1.hasNext())
        b((DownloadInfo)localIterator1.next());
    }
  }

  public final void onEventMainThread(j paramj)
  {
    switch (c.b[paramj.a.ordinal()])
    {
    default:
    case 1:
    }
    while (true)
    {
      return;
      String str = (String)paramj.b;
      if (TextUtils.isEmpty(str))
        continue;
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        Model localModel = (Model)localIterator.next();
        DownloadInfo localDownloadInfo = (DownloadInfo)localModel.a(R.id.download_info);
        if ((localDownloadInfo == null) || (!str.equals(localDownloadInfo.b)))
          continue;
        a(DataLoadListener.Op.UPDATE, new g(this.b.indexOf(localModel), localModel, null, Collections.singletonList(localModel)));
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.DownloadDataList
 * JD-Core Version:    0.6.0
 */