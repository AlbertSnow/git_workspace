package com.wandoujia.jupiter.library.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.b;
import android.support.v7.widget.by;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wandoujia.accessibility.AccessibilityManager;
import com.wandoujia.api.proto.Action;
import com.wandoujia.api.proto.Action.Builder;
import com.wandoujia.api.proto.ApkDetail;
import com.wandoujia.api.proto.ApkDetail.Builder;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.AppDetail.Builder;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.Detail;
import com.wandoujia.api.proto.Detail.Builder;
import com.wandoujia.api.proto.DownloadUrl.Builder;
import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.api.proto.Image.Builder;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppChangedListener;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.appmanager.LocalAppInfo.UpgradeInfo;
import com.wandoujia.appmanager.ar;
import com.wandoujia.appmanager.model.MarketAppInfo.NotRecommendReason;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.base.utils.TextUtil;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.jupiter.a.d;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.jupiter.library.activity.LibActivity;
import com.wandoujia.jupiter.paid.model.RecommendAppInfo;
import com.wandoujia.jupiter.q;
import com.wandoujia.jupiter.util.AutoInstallGuideUtil;
import com.wandoujia.jupiter.view.AutoInstallCardView;
import com.wandoujia.jupiter.view.OperationGuideCardView;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.online_config.ConfigStorage;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.ripple_framework.c.bs;
import com.wandoujia.ripple_framework.fragment.BaseListFragment.ViewConfig;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import com.wandoujia.ripple_framework.view.ObservableRecyclerView;
import com.wandoujia.ripple_framework.view.RecyclerViewAutoLoadingLayout;
import com.wandoujia.ripple_framework.view.StatefulButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AppUpgradeFragment extends ListFragment
{
  private static final ContentTypeEnum.ContentType b = ContentTypeEnum.ContentType.APP;
  private View c;
  private final LocalAppChangedListener m = new i(this);
  private TextView n;
  private TextView o;
  private View p;
  private AutoInstallCardView q;
  private OperationGuideCardView r;
  private OperationGuideCardView s;
  private com.wandoujia.nirvana.framework.ui.recycler.g t;
  private com.wandoujia.nirvana.framework.ui.recycler.g u;
  private bs v;
  private com.wandoujia.p4.app.upgrade.j w;
  private com.wandoujia.accessibility.j x = new x(this);

  public static Model a(LocalAppInfo paramLocalAppInfo, TemplateTypeEnum.TemplateType paramTemplateType)
  {
    DownloadUrl.Builder localBuilder = new DownloadUrl.Builder();
    if (paramLocalAppInfo.getUpgradeInfo() != null)
      localBuilder.url(paramLocalAppInfo.getUpgradeInfo().getFullUrl());
    ApkDetail localApkDetail = new ApkDetail.Builder().bytes_(Integer.valueOf((int)paramLocalAppInfo.getSize())).version_name(paramLocalAppInfo.getVersionName()).version_code(Integer.valueOf(paramLocalAppInfo.getVersionCode())).md5(paramLocalAppInfo.getMD5()).download_url(localBuilder.build()).build();
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localApkDetail);
    AppDetail localAppDetail = new AppDetail.Builder().apk(localArrayList).package_name(paramLocalAppInfo.getPackageName()).build();
    Detail localDetail = new Detail.Builder().app_detail(localAppDetail).build();
    Action localAction = new Action.Builder().intent("wdj://apps/" + paramLocalAppInfo.getPackageName()).build();
    Model localModel = new Model(new Entity.Builder().id(Long.valueOf(-1L)).type(Integer.valueOf(b.getValue())).title(paramLocalAppInfo.getTitle()).content_type(ContentTypeEnum.ContentType.APP).template(Integer.valueOf(paramTemplateType.getValue())).action(localAction).detail(localDetail).build());
    LocalAppInfo.UpgradeInfo localUpgradeInfo = paramLocalAppInfo.getUpgradeInfo();
    if ((localUpgradeInfo != null) && ("NOT_RECOMMEND".equals(localUpgradeInfo.getRecommendedType())) && (localUpgradeInfo.getNotRecommendReason() != null) && (!localUpgradeInfo.getNotRecommendReason().isSignatureMatch()));
    for (boolean bool = true; ; bool = false)
    {
      localModel.a(2131492883, Boolean.valueOf(bool));
      return localModel;
    }
  }

  private static boolean a(List<Model> paramList1, List<Model> paramList2)
  {
    if ((paramList1 == null) || (paramList2 == null));
    do
      return false;
    while (paramList1.size() != paramList2.size());
    for (int i = 0; ; i++)
    {
      if (i >= paramList1.size())
        break label87;
      Model localModel1 = (Model)paramList2.get(i);
      Model localModel2 = (Model)paramList1.get(i);
      if (!TextUtils.equals(localModel1.F().package_name, localModel2.F().package_name))
        break;
    }
    label87: return true;
  }

  private void e()
  {
    try
    {
      List localList = r();
      if ((CollectionUtils.isEmpty(localList)) || (this.q != null) || (this.r != null) || (this.s != null));
      while (a(localList, this.j.c()))
      {
        return;
        ArrayList localArrayList = new ArrayList();
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext())
        {
          Model localModel = (Model)localIterator.next();
          if (localModel.g() != TemplateTypeEnum.TemplateType.UPGRADE_APP)
            continue;
          localArrayList.add(localModel.F().package_name);
        }
        ThreadPool.execute(new r(this, localArrayList, localList));
      }
      ((q)this.j).a(localList);
      t();
      if ((this.j.c() != null) && (this.j.c().size() > 0))
      {
        this.u.a(true);
        return;
      }
      this.u.a(false);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private List<Model> r()
  {
    List localList1 = ((AppManager)com.wandoujia.ripple_framework.i.k().a("app")).i();
    localList1.removeAll(((AppManager)com.wandoujia.ripple_framework.i.k().a("app")).k());
    Collections.sort(localList1, new ar());
    String str;
    Object localObject;
    if (getActivity() != null)
    {
      str = ((LibActivity)getActivity()).b();
      if ((CollectionUtils.isEmpty(localList1)) || (TextUtils.isEmpty(str)))
        localObject = localList1;
    }
    while (true)
    {
      ArrayList localArrayList1 = new ArrayList();
      Iterator localIterator1 = ((List)localObject).iterator();
      while (true)
        if (localIterator1.hasNext())
        {
          localArrayList1.add(a((LocalAppInfo)localIterator1.next(), TemplateTypeEnum.TemplateType.UPGRADE_APP));
          continue;
          ArrayList localArrayList2 = new ArrayList();
          Iterator localIterator2 = localList1.iterator();
          while (localIterator2.hasNext())
          {
            LocalAppInfo localLocalAppInfo = (LocalAppInfo)localIterator2.next();
            if (str.equals(localLocalAppInfo.getPackageName()))
            {
              localArrayList2.add(0, localLocalAppInfo);
              continue;
            }
            localArrayList2.add(localLocalAppInfo);
          }
          localObject = localArrayList2;
          break;
        }
      Model localModel = new Model(new Entity.Builder().id(Long.valueOf(-1L)).type(Integer.valueOf(b.getValue())).template(Integer.valueOf(TemplateTypeEnum.TemplateType.UPGRADE_APP_DIVIDER.getValue())).build());
      new Model(new Entity.Builder().id(Long.valueOf(-1L)).type(Integer.valueOf(b.getValue())).template(Integer.valueOf(TemplateTypeEnum.TemplateType.END.getValue())).build());
      List localList2 = s();
      if (!CollectionUtils.isEmpty(localList2))
        localArrayList1.addAll(localList2);
      if (!CollectionUtils.isEmpty(localArrayList1))
        localArrayList1.add(0, localModel);
      return localArrayList1;
      localObject = localList1;
    }
  }

  private List<Model> s()
  {
    List localList = ((AppManager)com.wandoujia.ripple_framework.i.k().a("app")).k();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
      localArrayList.add(a((LocalAppInfo)localIterator.next(), TemplateTypeEnum.TemplateType.IGNORE_UPGRADE_APP));
    if (!CollectionUtils.isEmpty(localArrayList))
      if (isAdded())
        break label98;
    label98: for (Object localObject = null; ; localObject = new Model(new Entity.Builder().id(Long.valueOf(-1L)).type(Integer.valueOf(b.getValue())).title(getString(2131624940)).content_type(ContentTypeEnum.ContentType.APP).template(Integer.valueOf(TemplateTypeEnum.TemplateType.UPGRADE_APP_DIVIDER.getValue())).build()))
    {
      if (localObject != null)
        localArrayList.add(0, localObject);
      return localArrayList;
    }
  }

  private void t()
  {
    long l1 = 0L;
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    Context localContext = com.wandoujia.p4.a.a();
    List localList = ((AppManager)com.wandoujia.ripple_framework.i.k().a("app")).i();
    localList.removeAll(((AppManager)com.wandoujia.ripple_framework.i.k().a("app")).k());
    if (CollectionUtils.isEmpty(localList))
    {
      this.c.setVisibility(8);
      this.p.setVisibility(8);
      return;
    }
    this.c.setVisibility(0);
    this.p.setVisibility(0);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(localList.size());
    localSpannableStringBuilder.append(localContext.getString(2131625557, arrayOfObject));
    Iterator localIterator = localList.iterator();
    long l2 = l1;
    if (localIterator.hasNext())
    {
      LocalAppInfo.UpgradeInfo localUpgradeInfo = ((LocalAppInfo)localIterator.next()).getUpgradeInfo();
      long l3;
      if (localUpgradeInfo.isPatchUpgradable())
        l3 = localUpgradeInfo.getPatchSize();
      while (true)
      {
        long l4 = l3 + l1;
        l2 += localUpgradeInfo.getFullSize();
        l1 = l4;
        break;
        l3 = localUpgradeInfo.getFullSize();
      }
    }
    localSpannableStringBuilder.append(localContext.getString(2131625558));
    localSpannableStringBuilder.append(" ");
    if (l2 != l1)
    {
      String str = TextUtil.formatSizeInfo(l2);
      int i = localSpannableStringBuilder.length();
      localSpannableStringBuilder.append(str);
      localSpannableStringBuilder.setSpan(new StrikethroughSpan(), i, i + str.length(), 17);
      localSpannableStringBuilder.append(" ");
    }
    localSpannableStringBuilder.append(TextUtil.formatSizeInfo(l1));
    this.n.setText(localSpannableStringBuilder);
  }

  protected final int a()
  {
    return 2130903327;
  }

  protected final com.wandoujia.nirvana.framework.network.page.a<Model> a(String paramString)
  {
    return new q("app_upgrade", r());
  }

  public final void a(DataLoadListener.Op paramOp)
  {
  }

  public final void a(DataLoadListener.Op paramOp, com.wandoujia.nirvana.framework.network.page.g<Model> paramg)
  {
  }

  public final void a(DataLoadListener.Op paramOp, Exception paramException)
  {
    if (isAdded())
      p.a(getActivity(), this.j, paramException).a();
  }

  protected final com.wandoujia.ripple_framework.adapter.a g()
  {
    return new d();
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    e();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getArguments() == null)
      setArguments(new Bundle());
    if (!getArguments().containsKey("view_config"))
    {
      BaseListFragment.ViewConfig localViewConfig = new BaseListFragment.ViewConfig();
      localViewConfig.swipeRefresh = false;
      getArguments().putSerializable("view_config", localViewConfig);
    }
  }

  public void onDestroyView()
  {
    com.wandoujia.ripple_framework.i.k().a("accessibility");
    AccessibilityManager.b(this.x);
    com.wandoujia.p4.app.upgrade.a.b(this.w);
    super.onDestroyView();
  }

  public void onResume()
  {
    super.onResume();
    if ((BadgeUtil.c(getActivity())) && (BadgeUtil.b(getActivity())) && (this.q != null) && (this.t != null))
    {
      this.t.a(false);
      this.q = null;
      e();
    }
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.h.setEmptyLayout(2130903418);
    this.h.setEmptyViewRender(new n(this));
    ((AppManager)com.wandoujia.ripple_framework.i.k().a("app")).a(this.m);
    this.p = paramView.findViewById(2131493711);
    ViewGroup localViewGroup = (ViewGroup)getActivity().findViewById(2131493779);
    this.c = b.a(localViewGroup, 2130903323);
    localViewGroup.addView(this.c);
    this.n = ((TextView)this.c.findViewById(2131493705));
    this.o = ((TextView)this.c.findViewById(2131493706));
    ((View)this.o.getParent()).post(new t(this));
    t();
    int i;
    if ((!Config.u()) && (((SystemUtil.aboveApiLevel(16)) && (!Config.u()) && (!com.wandoujia.accessibility.a.c()) && (!AccessibilityManager.a()) && ((!BadgeUtil.c(GlobalConfig.getAppContext())) || (!BadgeUtil.b(GlobalConfig.getAppContext()))) && (!Config.D())) || (AutoInstallGuideUtil.a())))
    {
      i = 1;
      if (i == 0)
        break label422;
      if (this.q == null)
      {
        this.q = AutoInstallCardView.a(this.g);
        this.q.setListener(new y(this));
        com.wandoujia.ripple_framework.i.k().a("accessibility");
        AccessibilityManager.a(this.x);
        com.wandoujia.ripple_framework.i.k().h().a(this.q, Logger.Module.APPS, ViewLogPackage.Element.CARD, ViewLogPackage.Action.REDIRECT, "system://settings/auto_install", null);
      }
      this.t = new z(this);
      ((d)this.g.getAdapter()).a(this.t);
      this.g.getAdapter().b();
    }
    label422: label951: label1223: 
    while (true)
    {
      this.u = new aa((LinearLayout)com.wandoujia.p4.utils.c.a(this.g, 2130903326));
      this.u.a(new Model(new Entity.Builder().build()));
      ((d)this.g.getAdapter()).b(this.u);
      this.g.getAdapter().b();
      return;
      i = 0;
      break;
      RecommendAppInfo localRecommendAppInfo1 = RecommendAppInfo.get("cleaner", "content");
      if ((localRecommendAppInfo1 != null) && (!((AppManager)com.wandoujia.ripple_framework.i.k().a("app")).h(localRecommendAppInfo1.packageName)) && (Config.ah()));
      for (int j = 1; ; j = 0)
      {
        if (j == 0)
          break label951;
        this.r = OperationGuideCardView.a(this.g);
        RecommendAppInfo localRecommendAppInfo2 = RecommendAppInfo.get("cleaner", "content");
        com.wandoujia.ripple_framework.i.k().h().a(this.r, Logger.Module.APPS, ViewLogPackage.Element.CARD, ViewLogPackage.Action.REDIRECT, "MatrixRecommend", null).a(this.r, localRecommendAppInfo2.title, localRecommendAppInfo2.packageName);
        com.wandoujia.ripple_framework.i.k().h().a(this.r.getSettingButton(), Logger.Module.APPS, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.DOWNLOAD, "MatrixRecommend", null).a(this.r.getSettingButton(), localRecommendAppInfo2.title, localRecommendAppInfo2.packageName);
        com.wandoujia.ripple_framework.i.k().h().a(this.r.getDeleteView(), Logger.Module.APPS, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.CLOSE, "MatrixRecommend", null).a(this.r.getDeleteView(), localRecommendAppInfo2.title, localRecommendAppInfo2.packageName);
        this.t = new ad(this);
        com.wandoujia.nirvana.framework.ui.recycler.g localg = this.t;
        String str1 = localRecommendAppInfo2.packageName;
        String str2 = localRecommendAppInfo2.downloadUrl;
        String str3 = localRecommendAppInfo2.title;
        String str4 = localRecommendAppInfo2.iconUrl;
        Entity.Builder localBuilder = new Entity.Builder();
        Detail.Builder localBuilder1 = new Detail.Builder();
        AppDetail.Builder localBuilder2 = new AppDetail.Builder();
        localBuilder2.package_name(str1);
        ArrayList localArrayList = new ArrayList();
        ApkDetail.Builder localBuilder3 = new ApkDetail.Builder();
        localBuilder3.version_code(Integer.valueOf(0));
        localBuilder3.compatible(Integer.valueOf(1));
        localBuilder3.download_url(new DownloadUrl.Builder().url(str2).build());
        localBuilder3.bytes_(Integer.valueOf(0));
        localArrayList.add(localBuilder3.build());
        localBuilder2.apk(localArrayList);
        localBuilder1.app_detail(localBuilder2.build());
        localBuilder.detail(localBuilder1.build());
        localBuilder.content_type(ContentTypeEnum.ContentType.APP);
        localBuilder.icon(str4);
        localBuilder.icon_image(new Image.Builder().url(str4).build());
        Model localModel = new Model(localBuilder.build());
        localModel.a(str3);
        localg.a(localModel);
        this.r.setListener(new j(this));
        ((d)this.g.getAdapter()).a(this.t);
        this.g.getAdapter().b();
        break;
      }
      if (Config.E())
      {
        com.wandoujia.online_config.c.a();
        if (com.wandoujia.online_config.c.l())
        {
          int i1 = com.wandoujia.launcher.launcher.b.c.a().d();
          com.wandoujia.online_config.c.a();
          if ((i1 < ConfigStorage.a("gl_guide_game_limit", 1)) || (AppManager.a().h("com.wandoujia.game_launcher")) || (com.wandoujia.launcher.e.a.c(getActivity())));
        }
      }
      for (int k = 1; ; k = 0)
      {
        if (k == 0)
          break label1223;
        this.s = OperationGuideCardView.a(this.g);
        this.v = new bs(this.s.getSettingButton());
        this.s.setListener(new k(this));
        com.wandoujia.online_config.c.a();
        if (!TextUtils.equals(ConfigStorage.a("gl_guide_action", "apk"), "native"))
        {
          this.v.a(b.C());
          com.wandoujia.ripple_framework.i.k().h().a(this.s.getSettingButton(), Logger.Module.ME_APPS, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.OPEN, "install_apk_gl", Long.valueOf(0L));
          this.s.getSettingButton().a(new l());
        }
        this.t = new m(this);
        ((d)this.g.getAdapter()).a(this.t);
        this.g.getAdapter().b();
        b.a(TaskEvent.Status.END, TaskEvent.Result.SUCCESS, TaskEvent.Action.OPEN, b.a("me_apps", ViewLogPackage.Element.PAGE, ViewLogPackage.Action.OPEN, "show_gl_card"), "");
        break;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.AppUpgradeFragment
 * JD-Core Version:    0.6.0
 */