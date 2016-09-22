package com.wandoujia.jupiter.library.fragment;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.wandoujia.api.proto.Action;
import com.wandoujia.api.proto.Action.Builder;
import com.wandoujia.api.proto.ApkDetail;
import com.wandoujia.api.proto.ApkDetail.Builder;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.AppDetail.Builder;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.Detail;
import com.wandoujia.api.proto.Detail.Builder;
import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppChangedListener;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.appmanager.ap;
import com.wandoujia.appmanager.aq;
import com.wandoujia.appmanager.ar;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.jupiter.library.presenter.m;
import com.wandoujia.jupiter.q;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.nirvana.framework.network.page.g;
import com.wandoujia.ripple_framework.EventBusManager.Type;
import com.wandoujia.ripple_framework.fragment.BaseListFragment.ViewConfig;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.ObservableRecyclerView;
import com.wandoujia.ripple_framework.view.RecyclerViewAutoLoadingLayout;
import de.greenrobot.event.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.List<Lcom.wandoujia.ripple_framework.model.Model;>;
import java.util.Set;

public class AppInstalledFragment extends ListFragment
{
  private static final ContentTypeEnum.ContentType b = ContentTypeEnum.ContentType.APP;
  private RelativeLayout c;
  private ImageView m;
  private View n;
  private TextView o;
  private TextView p;
  private ViewGroup q;
  private Set<String> r;
  private AppInstalledFragment.SortType s = AppInstalledFragment.SortType.TIME;
  private final LocalAppChangedListener t = new a(this);

  private void e()
  {
    if (-2 + ((com.wandoujia.jupiter.a.d)this.g.getAdapter()).f().size() == this.r.size())
      this.p.setText(getString(2131625013));
    while (true)
    {
      TextView localTextView = this.o;
      String str = getString(2131625011);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(this.r.size());
      localTextView.setText(String.format(str, arrayOfObject));
      return;
      this.p.setText(getString(2131625009));
    }
  }

  private void r()
  {
    a(new q("", s()));
  }

  private List<Model> s()
  {
    List localList = ((AppManager)i.k().a("app")).d();
    Object localObject;
    switch (h.a[this.s.ordinal()])
    {
    default:
      throw new RuntimeException("unknown sort type");
    case 1:
      localObject = new ar();
    case 2:
    case 3:
    }
    ArrayList localArrayList1;
    while (true)
    {
      Collections.sort(localList, (Comparator)localObject);
      localArrayList1 = new ArrayList();
      Iterator localIterator1 = localList.iterator();
      while (localIterator1.hasNext())
      {
        LocalAppInfo localLocalAppInfo = (LocalAppInfo)localIterator1.next();
        ApkDetail localApkDetail = new ApkDetail.Builder().bytes_(Integer.valueOf((int)localLocalAppInfo.getSize())).version_name(localLocalAppInfo.getVersionName()).version_code(Integer.valueOf(localLocalAppInfo.getVersionCode())).md5(localLocalAppInfo.getMD5()).build();
        ArrayList localArrayList3 = new ArrayList();
        localArrayList3.add(localApkDetail);
        AppDetail localAppDetail = new AppDetail.Builder().apk(localArrayList3).package_name(localLocalAppInfo.getPackageName()).build();
        Detail localDetail = new Detail.Builder().app_detail(localAppDetail).build();
        Action localAction = new Action.Builder().intent("wdj://apps/" + localLocalAppInfo.getPackageName()).build();
        localArrayList1.add(new Model(new Entity.Builder().id(Long.valueOf(-1L)).type(Integer.valueOf(b.getValue())).title(localLocalAppInfo.getTitle()).template(Integer.valueOf(TemplateTypeEnum.TemplateType.INSTALLED_APP.getValue())).action(localAction).detail(localDetail).build()));
      }
      localObject = new ap();
      continue;
      localObject = new aq();
    }
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator2 = localArrayList1.iterator();
    while (localIterator2.hasNext())
    {
      Model localModel3 = (Model)localIterator2.next();
      if (!"com.wandoujia.game_launcher".equals(localModel3.F().package_name))
        continue;
      localArrayList2.add(localModel3);
    }
    localArrayList1.removeAll(localArrayList2);
    Model localModel1 = new Model(new Entity.Builder().id(Long.valueOf(-1L)).type(Integer.valueOf(b.getValue())).template(Integer.valueOf(TemplateTypeEnum.TemplateType.UPGRADE_APP_DIVIDER.getValue())).build());
    Model localModel2 = new Model(new Entity.Builder().id(Long.valueOf(-1L)).type(Integer.valueOf(b.getValue())).template(Integer.valueOf(TemplateTypeEnum.TemplateType.END.getValue())).build());
    if (!CollectionUtils.isEmpty(localArrayList1))
    {
      localArrayList1.add(0, localModel1);
      localArrayList1.add(localModel2);
      return localArrayList1;
    }
    this.q.setVisibility(8);
    return (List<Model>)localArrayList1;
  }

  protected final int a()
  {
    return 2130903318;
  }

  public final void a(DataLoadListener.Op paramOp)
  {
  }

  public final void a(DataLoadListener.Op paramOp, g<Model> paramg)
  {
  }

  public final void a(DataLoadListener.Op paramOp, Exception paramException)
  {
  }

  protected final com.wandoujia.ripple_framework.adapter.a g()
  {
    return new com.wandoujia.jupiter.a.d();
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    r();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ((c)i.k().a("event_bus")).a(this);
    if (getArguments() == null)
      setArguments(new Bundle());
    if (!getArguments().containsKey("view_config"))
    {
      BaseListFragment.ViewConfig localViewConfig = new BaseListFragment.ViewConfig();
      localViewConfig.swipeRefresh = false;
      getArguments().putSerializable("view_config", localViewConfig);
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    ((c)i.k().a("event_bus")).c(this);
  }

  public void onEvent(AppInstalledFragment.SortType paramSortType)
  {
    this.s = paramSortType;
    r();
  }

  public void onEventMainThread(com.wandoujia.ripple_framework.j paramj)
  {
    if ((paramj.a == EventBusManager.Type.MULTI_UNINSTALL) && ((paramj.b instanceof Boolean)))
      if (((Boolean)paramj.b).booleanValue())
      {
        this.c.setVisibility(0);
        e();
      }
    while (true)
    {
      return;
      this.c.setVisibility(8);
      Iterator localIterator4 = ((com.wandoujia.jupiter.a.d)this.g.getAdapter()).f().iterator();
      while (localIterator4.hasNext())
      {
        Model localModel3 = (Model)localIterator4.next();
        localModel3.a((int)localModel3.e(), Boolean.valueOf(false));
      }
      this.r = new HashSet();
      e();
      return;
      if ((paramj.a == EventBusManager.Type.MULTI_UNINSTALL_SELECT) && ((paramj.b instanceof com.wandoujia.jupiter.library.presenter.j)))
      {
        com.wandoujia.jupiter.library.presenter.j localj = (com.wandoujia.jupiter.library.presenter.j)paramj.b;
        if (localj.b)
          this.r.add(localj.a);
        while (true)
        {
          e();
          if (!CollectionUtils.isEmpty(this.r))
            break;
          ((c)i.k().a("event_bus")).d(new com.wandoujia.ripple_framework.j(EventBusManager.Type.MULTI_UNINSTALL, Boolean.valueOf(false)));
          return;
          this.r.remove(localj.a);
        }
      }
      if ((paramj.a == EventBusManager.Type.UNINSTALL_ALL) && ((paramj.b instanceof Boolean)))
      {
        boolean bool = ((Boolean)paramj.b).booleanValue();
        List localList = ((com.wandoujia.jupiter.a.d)this.g.getAdapter()).f();
        if (bool)
        {
          Iterator localIterator3 = localList.iterator();
          while (localIterator3.hasNext())
          {
            Model localModel2 = (Model)localIterator3.next();
            if ((localModel2.g() != TemplateTypeEnum.TemplateType.INSTALLED_APP) || (localModel2.F() == null) || (localModel2.F().package_name == null))
              continue;
            localModel2.a((int)localModel2.e(), Boolean.valueOf(true));
            this.r.add(localModel2.F().package_name);
          }
        }
        Iterator localIterator2 = localList.iterator();
        while (localIterator2.hasNext())
        {
          Model localModel1 = (Model)localIterator2.next();
          localModel1.a((int)localModel1.e(), Boolean.valueOf(false));
        }
        this.r = new HashSet();
        e();
        return;
      }
      if (paramj.a != EventBusManager.Type.UNINSTALL_APP)
        continue;
      AppTaskManager localAppTaskManager = (AppTaskManager)i.k().a("app_task");
      Iterator localIterator1 = this.r.iterator();
      while (localIterator1.hasNext())
        localAppTaskManager.b((String)localIterator1.next());
    }
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.h.setEmptyLayout(2130903418);
    this.h.setEmptyViewRender(new b());
    ((AppManager)i.k().a("app")).a(this.t);
    this.c = ((RelativeLayout)paramView.findViewById(2131493694));
    this.m = ((ImageView)paramView.findViewById(2131493696));
    this.n = paramView.findViewById(2131493700);
    this.o = ((TextView)paramView.findViewById(2131493698));
    this.p = ((TextView)paramView.findViewById(2131493699));
    this.r = new HashSet();
    this.q = ((ViewGroup)paramView.findViewById(2131493691));
    new com.wandoujia.nirvana.framework.ui.a(this.q).a(new m()).a(null);
    this.m.setOnClickListener(new d());
    this.p.setOnClickListener(new e(this));
    this.n.setOnClickListener(new f(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.AppInstalledFragment
 * JD-Core Version:    0.6.0
 */