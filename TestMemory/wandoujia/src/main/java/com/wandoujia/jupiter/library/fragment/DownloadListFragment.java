package com.wandoujia.jupiter.library.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.cc;
import android.view.View;
import com.nispok.snackbar.Snackbar;
import com.nispok.snackbar.enums.SnackbarType;
import com.wandoujia.api.proto.Action;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.jupiter.a.d;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.net.HttpException;
import com.wandoujia.net.HttpException.Type;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.nirvana.framework.network.page.a;
import com.wandoujia.nirvana.framework.network.page.g;
import com.wandoujia.ripple_framework.download.DownloadDataList;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.DownloadInfo.Status;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.event.DownloadEvent;
import com.wandoujia.ripple_framework.fragment.BaseListFragment;
import com.wandoujia.ripple_framework.fragment.BaseListFragment.ViewConfig;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.j;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.RecyclerViewAutoLoadingLayout;
import de.greenrobot.event.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DownloadListFragment extends BaseListFragment
{
  private final d a = new d();

  protected final a<Model> a(String paramString)
  {
    DownloadDataList localDownloadDataList = new DownloadDataList(paramString);
    localDownloadDataList.a(localDownloadDataList.g());
    ((DownloadDataList)localDownloadDataList).n();
    return localDownloadDataList;
  }

  public final void a(DataLoadListener.Op paramOp)
  {
  }

  public final void a(DataLoadListener.Op paramOp, g<Model> paramg)
  {
  }

  public final void a(DataLoadListener.Op paramOp, Exception paramException)
  {
    if (isAdded())
      p.a(getActivity(), this.j, paramException).a();
  }

  protected final cc b()
  {
    return new al(this.a);
  }

  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    ((c)i.k().a("event_bus")).a(this);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getArguments() == null)
      setArguments(new Bundle());
    if (!getArguments().containsKey("page_api_url"))
      getArguments().putString("page_api_url", "download");
    for (this.k = "download"; ; this.k = getArguments().getString("page_api_url"))
    {
      if (!getArguments().containsKey("view_config"))
      {
        BaseListFragment.ViewConfig localViewConfig = new BaseListFragment.ViewConfig();
        localViewConfig.swipeRefresh = false;
        getArguments().putSerializable("view_config", localViewConfig);
      }
      return;
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
  }

  public void onDetach()
  {
    super.onDetach();
    ((c)i.k().a("event_bus")).c(this);
  }

  public void onEventMainThread(DownloadEvent paramDownloadEvent)
  {
    switch (ak.b[paramDownloadEvent.a.ordinal()])
    {
    default:
    case 1:
    case 2:
    }
    int i;
    do
    {
      do
      {
        return;
        Snackbar localSnackbar = Snackbar.a(getActivity());
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = paramDownloadEvent.b.f;
        localSnackbar.a(getString(2131624655, arrayOfObject)).a(p.a).a(SnackbarType.MULTI_LINE).b(getActivity());
        return;
      }
      while ((paramDownloadEvent.b.c != DownloadInfo.Status.FAILED) || (paramDownloadEvent.b.d.g == null) || (!(paramDownloadEvent.b.d.g instanceof HttpException)));
      i = ((HttpException)paramDownloadEvent.b.d.g).getType();
    }
    while ((i != HttpException.Type.CONNECT_ERROR.ordinal()) && (i != HttpException.Type.SOCKET_IO_ERROR.ordinal()) && (i != HttpException.Type.RESOLVE_IP_FAILED.ordinal()));
    p.a(getActivity(), 2131624644, p.a).a();
  }

  public void onEventMainThread(j paramj)
  {
    switch (ak.a[paramj.a.ordinal()])
    {
    default:
    case 1:
    }
    ArrayList localArrayList;
    do
    {
      return;
      Action localAction = (Action)paramj.b;
      localArrayList = new ArrayList();
      Iterator localIterator = this.j.c().iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        Model localModel = (Model)localIterator.next();
        if (i == 0)
        {
          if ((localModel.g() != TemplateTypeEnum.TemplateType.SECTION_TITLE_LITE) || (localModel.b().action_positive == null) || (localModel.b().action_positive.type == null) || (!localModel.b().action_positive.type.equals(localAction.type)))
            continue;
          i = 1;
          continue;
        }
        if ((localModel.g() == TemplateTypeEnum.TemplateType.SECTION_TITLE_LITE) || (localModel.g() == TemplateTypeEnum.TemplateType.END))
          break;
        localArrayList.add((DownloadInfo)localModel.a(2131492894));
      }
    }
    while (CollectionUtils.isEmpty(localArrayList));
    ((DownloadManager)i.k().a("download")).a(localArrayList);
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.h.setEmptyLayout(2130903418);
    this.h.setEmptyViewRender(new ai());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.DownloadListFragment
 * JD-Core Version:    0.6.0
 */