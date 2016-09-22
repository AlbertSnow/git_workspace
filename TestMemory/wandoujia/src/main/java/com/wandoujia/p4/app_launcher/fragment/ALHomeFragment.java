package com.wandoujia.p4.app_launcher.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.launcher_base.launcher.b.e;
import com.wandoujia.launcher_base.launcher.fragment.HomeFragment;
import com.wandoujia.online_config.ConfigStorage;
import com.wandoujia.p4.app_launcher.b.i;
import com.wandoujia.p4.app_launcher.b.j;
import com.wandoujia.p4.app_launcher.b.z;
import com.wandoujia.p4.app_launcher.manager.ALManager;
import com.wandoujia.p4.app_launcher.manager.ALManager.CellEvent;
import com.wandoujia.p4.app_launcher.manager.l;
import com.wandoujia.p4.app_launcher.model.ALAppInfo;
import com.wandoujia.p4.app_launcher.model.ALSuggestion;
import com.wandoujia.p4.app_launcher.model.ALSuggestion.FunctionInfo;
import com.wandoujia.p4.app_launcher.model.ALSuggestion.SwitcherInfo;
import com.wandoujia.p4.app_launcher.switcher.BaseSwitcher;
import com.wandoujia.p4.app_launcher.switcher.BaseSwitcher.Type;
import com.wandoujia.ripple_framework.model.Model;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ALHomeFragment extends HomeFragment
{
  private com.wandoujia.launcher_base.launcher.b.a b;
  private ALSuggestion c;
  private List<Model> d;
  private Map<String, com.wandoujia.launcher_base.launcher.c.a> e = new HashMap();
  private com.wandoujia.launcher_base.launcher.c.m f = new a(this);
  private final l g = new b(this);

  private void a(com.wandoujia.launcher_base.launcher.a.a parama, String paramString)
  {
    Object localObject;
    if (this.e.containsKey(paramString))
      localObject = (com.wandoujia.launcher_base.launcher.c.a)this.e.get(paramString);
    while (true)
    {
      label28: if (localObject != null)
      {
        this.e.put(paramString, localObject);
        parama.a((com.wandoujia.launcher_base.launcher.c.a)localObject);
      }
      return;
      int i = -1;
      switch (paramString.hashCode())
      {
      default:
      case 65193513:
      case 249210798:
      case 2070860428:
      case 1433481724:
      }
      while (true)
        switch (i)
        {
        default:
          BaseSwitcher localBaseSwitcher = BaseSwitcher.a(paramString);
          localObject = null;
          if (localBaseSwitcher == null)
            break label28;
          localObject = new i(localBaseSwitcher);
          break label28;
          if (!paramString.equals("Clean"))
            continue;
          i = 0;
          continue;
          if (!paramString.equals("SuperClean"))
            continue;
          i = 1;
          continue;
          if (!paramString.equals("DiskClean"))
            continue;
          i = 2;
          continue;
          if (!paramString.equals("Upgrade"))
            continue;
          i = 3;
        case 0:
        case 1:
        case 2:
        case 3:
        }
      localObject = new com.wandoujia.p4.app_launcher.b.m();
      continue;
      boolean bool1 = SystemUtil.aboveApiLevel(16);
      localObject = null;
      if (!bool1)
        continue;
      boolean bool2 = com.wandoujia.accessibility.a.a();
      localObject = null;
      if (bool2)
        continue;
      localObject = new z();
      continue;
      localObject = new com.wandoujia.p4.app_launcher.b.d();
      continue;
      localObject = new j();
    }
  }

  private void d()
  {
    com.wandoujia.launcher_base.launcher.a.a locala = new com.wandoujia.launcher_base.launcher.a.a();
    locala.a(new com.wandoujia.launcher_base.launcher.b.b());
    Iterator localIterator3;
    if ((this.c != null) && (!CollectionUtils.isEmpty(this.c.switcherList)))
      localIterator3 = this.c.switcherList.iterator();
    while (localIterator3.hasNext())
    {
      a(locala, ((ALSuggestion.SwitcherInfo)localIterator3.next()).getType());
      continue;
      a(locala, BaseSwitcher.Type.Wifi.toString());
      a(locala, BaseSwitcher.Type.MobileData.toString());
      a(locala, BaseSwitcher.Type.FlashLight.toString());
      a(locala, BaseSwitcher.Type.ScreenRotation.toString());
      a(locala, "Clean");
      a(locala, "SuperClean");
      a(locala, "DiskClean");
      a(locala, "Upgrade");
    }
    if (!com.wandoujia.p4.app_launcher.manager.d.a(this.c))
    {
      Iterator localIterator2 = this.c.appsElemList.iterator();
      while (localIterator2.hasNext())
      {
        ALAppInfo localALAppInfo = (ALAppInfo)localIterator2.next();
        locala.a(new com.wandoujia.p4.app_launcher.b.a(new com.wandoujia.p4.app_launcher.model.a(localALAppInfo, locala.c())));
        ALSuggestion.FunctionInfo localFunctionInfo = com.wandoujia.p4.app_launcher.manager.d.a(this.c, localALAppInfo.packageName);
        if (localFunctionInfo == null)
          continue;
        locala.a(new com.wandoujia.p4.app_launcher.b.g(new com.wandoujia.p4.app_launcher.model.b(localFunctionInfo, locala.c())));
      }
    }
    locala.a(new com.wandoujia.launcher_base.launcher.b.d());
    com.wandoujia.online_config.c.a();
    if ((ConfigStorage.a("enable_al_install_suggestion", true)) && (!CollectionUtils.isEmpty(this.d)))
    {
      locala.a(new e(2130903161, new com.wandoujia.launcher_base.utils.g(4, 1)));
      Iterator localIterator1 = this.d.iterator();
      for (int i = 0; localIterator1.hasNext(); i++)
        locala.a(new com.wandoujia.launcher.a(new com.wandoujia.p4.app_launcher.model.c((Model)localIterator1.next())).a("app_suggestion", i).a(false).c());
    }
    locala.a(this.b);
    b().a(locala);
    locala.e();
    b().a(0);
    android.support.v4.app.d.d(-2 + locala.c());
  }

  protected final void a()
  {
    super.a();
    com.wandoujia.p4.a.e().a(this.g);
    this.b = new com.wandoujia.launcher_base.launcher.b.a();
    this.b.a(2130838323, this.a.getContext().getResources().getString(2131624285), new c());
    this.b.b(2130838113, this.a.getContext().getResources().getString(2131624279), new d());
    b().a(this.f);
    d();
  }

  public void onResume()
  {
    com.wandoujia.p4.a.e().a(ALManager.CellEvent.CLEAN_SCAN);
    Iterator localIterator = b().c().a().iterator();
    while (localIterator.hasNext())
      ((com.wandoujia.launcher_base.launcher.c.a)localIterator.next()).j();
    super.onResume();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.fragment.ALHomeFragment
 * JD-Core Version:    0.6.0
 */