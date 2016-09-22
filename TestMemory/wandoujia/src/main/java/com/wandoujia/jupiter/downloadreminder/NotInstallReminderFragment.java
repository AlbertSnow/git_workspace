package com.wandoujia.jupiter.downloadreminder;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.online_config.ConfigStorage;
import com.wandoujia.online_config.c;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.fragment.AsyncLoadFragment;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class NotInstallReminderFragment extends AsyncLoadFragment
{
  private a a;

  protected final int a()
  {
    return 2130903341;
  }

  protected final void d_()
  {
  }

  public void onDestroyView()
  {
    if (this.a != null)
      this.a.e();
    super.onDestroyView();
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    int i = 1;
    super.onViewCreated(paramView, paramBundle);
    List localList1 = ((DownloadManager)i.k().a("download")).d();
    List localList2;
    com.wandoujia.online_config.l locall1;
    String str;
    com.wandoujia.online_config.l locall2;
    int k;
    if (localList1 != null)
    {
      localList2 = android.support.v4.app.b.a(i, localList1);
      if (!CollectionUtils.isEmpty(localList2))
      {
        locall1 = Config.k();
        str = String.valueOf(Calendar.getInstance().get(6));
        if (locall1 == null)
        {
          locall2 = new com.wandoujia.online_config.l(i, str);
          Config.b(locall2);
          c.a();
          k = ConfigStorage.a("jupiter_dialog_not_install_max_num_one_time", 3);
          if (localList2.size() <= k)
            break label286;
          if (i == 0)
            break label479;
        }
      }
    }
    label286: label479: for (List localList3 = localList2.subList(0, k); ; localList3 = localList2)
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator1 = localList3.iterator();
      while (true)
        if (localIterator1.hasNext())
        {
          DownloadInfo localDownloadInfo = (DownloadInfo)localIterator1.next();
          Model localModel = new Model(new Entity.Builder().title(localDownloadInfo.f).icon(localDownloadInfo.g).id_string(localDownloadInfo.a).content_type(ContentTypeEnum.ContentType.DOWNLOAD_INFO).template_type(TemplateTypeEnum.TemplateType.DOWNLOAD_ITEM).build());
          localModel.a(2131492894, localDownloadInfo);
          localArrayList.add(localModel);
          continue;
          if (str.equals(locall1.b()));
          for (int m = 1 + locall1.a(); ; m = i)
          {
            locall2 = new com.wandoujia.online_config.l(m, str);
            break;
          }
          int j = 0;
          break;
        }
      this.a = new a();
      this.a.a(localArrayList);
      paramView.findViewById(2131493635).setOnClickListener(new k(this));
      paramView.findViewById(2131493724).setOnClickListener(new l(this, localList3));
      RecyclerView localRecyclerView = (RecyclerView)paramView.findViewById(2131492960);
      paramView.getContext();
      localRecyclerView.setLayoutManager(new m(localRecyclerView));
      localRecyclerView.setAdapter(this.a);
      i.k().h().a(Logger.Module.NOTINSTALL_APPS, ViewLogPackage.Action.POPUP, "notinstall_apps_show", Long.valueOf(localList3.size()), com.wandoujia.ripple_framework.download.b.b(localList3));
      HashSet localHashSet = new HashSet();
      Iterator localIterator2 = localList3.iterator();
      while (localIterator2.hasNext())
        localHashSet.add(((DownloadInfo)localIterator2.next()).m);
      Config.c(localHashSet);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.downloadreminder.NotInstallReminderFragment
 * JD-Core Version:    0.6.0
 */