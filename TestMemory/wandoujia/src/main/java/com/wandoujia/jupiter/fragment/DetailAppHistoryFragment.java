package com.wandoujia.jupiter.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.wandoujia.api.proto.ApkDetail;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.download2.DownloadRequestParam;
import com.wandoujia.jupiter.j;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.DownloadInfo.Status;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.installer.install.InstallManager;
import com.wandoujia.ripple_framework.installer.install.PackageChangeEvent;
import com.wandoujia.ripple_framework.installer.install.PackageChangeEvent.EventType;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.RecyclerViewAutoLoadingLayout;
import de.greenrobot.event.c;

public class DetailAppHistoryFragment extends ListFragment
{
  private Model b;
  private ApkDetail c;

  private void a(ApkDetail paramApkDetail)
  {
    DownloadInfo localDownloadInfo = ((DownloadManager)i.k().a("download")).a(this.b.F().package_name);
    if ((localDownloadInfo != null) && ("history_version".equals(localDownloadInfo.p)) && (paramApkDetail.version_code.intValue() == Integer.parseInt(localDownloadInfo.q)))
      if (localDownloadInfo.c == DownloadInfo.Status.SUCCESS)
        ((InstallManager)i.k().a("install")).b(localDownloadInfo.d.a.e, this.b.F().package_name);
    while (true)
    {
      if (isAdded())
        getActivity().onBackPressed();
      return;
      ((DownloadManager)i.k().a("download")).b(localDownloadInfo);
      continue;
      ((AppTaskManager)i.k().a("app_task")).a(this.b, paramApkDetail, getCurrentPagePackage());
    }
  }

  public static DetailAppHistoryFragment b(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("page_api_url", paramString);
    DetailAppHistoryFragment localDetailAppHistoryFragment = new DetailAppHistoryFragment();
    localDetailAppHistoryFragment.setArguments(localBundle);
    return localDetailAppHistoryFragment;
  }

  protected final int a()
  {
    return 2130903310;
  }

  protected boolean initializePageUri(View paramView)
  {
    if (this.b == null)
      return false;
    i.k().h().a(paramView, "wdj://apps/" + this.b.F().package_name + "/history");
    return true;
  }

  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    ((c)i.k().a("event_bus")).a(this);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    String str = getArguments().getString("page_api_url");
    if ((getActivity() instanceof com.wandoujia.ripple_framework.model.h))
    {
      com.wandoujia.nirvana.framework.network.page.a locala = ((com.wandoujia.ripple_framework.model.h)getActivity()).findList(str);
      if ((locala != null) && (!CollectionUtils.isEmpty(locala.c())))
        this.b = ((Model)locala.a(0));
    }
    if (this.b != null)
    {
      FragmentActivity localFragmentActivity = getActivity();
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = this.b.n();
      localFragmentActivity.setTitle(getString(2131625097, arrayOfObject1));
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = this.b.F().package_name;
      this.k = String.format("http://apis.wandoujia.com/five/v2/apps/%s/history?format=proto", arrayOfObject2);
    }
  }

  public void onDetach()
  {
    super.onDetach();
    ((c)i.k().a("event_bus")).c(this);
  }

  public void onEventMainThread(com.wandoujia.jupiter.b.a.a parama)
  {
    ApkDetail localApkDetail;
    if ((parama != null) && (parama.a != null))
    {
      if (!((AppManager)i.k().a("app")).h(this.b.F().package_name))
        break label276;
      localApkDetail = parama.a;
      if ((this.b != null) && (localApkDetail != null));
    }
    else
    {
      return;
    }
    LocalAppInfo localLocalAppInfo = ((AppManager)i.k().a("app")).f(this.b.F().package_name);
    if (localLocalAppInfo.getVersionCode() > localApkDetail.version_code.intValue())
    {
      Context localContext = j.a().c();
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = this.b.n();
      arrayOfObject[1] = (localLocalAppInfo.getVersionName() + "(" + localLocalAppInfo.getVersionCode() + ")");
      arrayOfObject[2] = (localApkDetail.version_name + "(" + localApkDetail.version_code + ")");
      String str = localContext.getString(2131624271, arrayOfObject);
      new com.wandoujia.ripple_framework.view.a.h(getActivity()).a(2131624273).b(str).b(2131624272, new b()).a(2131624274, new a(this, localApkDetail)).a(true).b();
      return;
    }
    a(localApkDetail);
    return;
    label276: a(parama.a);
  }

  public void onEventMainThread(PackageChangeEvent paramPackageChangeEvent)
  {
    if ((paramPackageChangeEvent != null) && (paramPackageChangeEvent.b() == PackageChangeEvent.EventType.REMOVE) && (this.c != null) && (this.b != null) && (!TextUtils.isEmpty(paramPackageChangeEvent.a())) && (paramPackageChangeEvent.a().equals(this.b.F().package_name)))
      a(this.c);
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.h.setSwipeRefreshEnabled(false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.DetailAppHistoryFragment
 * JD-Core Version:    0.6.0
 */