package com.wandoujia.jupiter.fragment;

import android.os.Bundle;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.homepage.HomeScrollFragment;
import com.wandoujia.jupiter.j;
import com.wandoujia.jupiter.p;
import com.wandoujia.jupiter.startpage.manager.LocalFeedManager;
import com.wandoujia.jupiter.startpage.manager.LocalFeedManager.Entrance;
import com.wandoujia.nirvana.framework.network.page.e;
import com.wandoujia.p4.utils.k;
import com.wandoujia.ripple_framework.fragment.BaseListFragment;
import com.wandoujia.ripple_framework.model.Model;
import java.util.HashMap;
import java.util.Map;

public class StartPageFragment extends HomeScrollFragment
{
  private com.wandoujia.jupiter.startpage.a.a b;
  private com.wandoujia.jupiter.startpage.c.d c = new bp(this);
  private com.wandoujia.jupiter.startpage.manager.d m = new bq(this);

  public StartPageFragment()
  {
    setArguments(BaseListFragment.a("ripple://items", "http://ripple.wandoujia.com/api/v2/apps/box.proto", null));
  }

  protected final com.wandoujia.nirvana.framework.network.page.a<Model> a(String paramString)
  {
    HashMap localHashMap = new HashMap();
    LocalFeedManager localLocalFeedManager = (LocalFeedManager)j.a().a("local_feed");
    localHashMap.put("vc", String.valueOf(SystemUtil.getVersionCode(com.wandoujia.p4.a.a())));
    localHashMap.put("entry", LocalFeedManager.Entrance.OTHER.getName());
    localHashMap.put("netStatus", NetworkUtil.getNetworkTypeName(JupiterApplication.e()));
    localHashMap.put("launchedCount", String.valueOf(localLocalFeedManager.e()));
    localHashMap.put("closedFeeds", localLocalFeedManager.a());
    localHashMap.put("sectionItemNum", String.valueOf(k.b()));
    localHashMap.put("isIntroductionShow", String.valueOf(com.wandoujia.p4.configs.Config.R()));
    localHashMap.put("ch", com.wandoujia.ripple_framework.Config.d());
    localHashMap.put("source", com.wandoujia.ripple_framework.Config.d());
    p localp = new p(paramString, com.wandoujia.jupiter.d.a.b(), localHashMap);
    localp.a(new com.wandoujia.jupiter.startpage.c.a(this.c));
    return localp;
  }

  protected final com.wandoujia.ripple_framework.adapter.a g()
  {
    if (this.b == null)
      this.b = new com.wandoujia.jupiter.startpage.a.a();
    return this.b;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ((LocalFeedManager)j.a().a("local_feed")).a(this.m);
  }

  public void onDetach()
  {
    super.onDetach();
    if ((this.j != null) && (this.j.g() != null))
      this.j.g().a();
  }

  public void onResume()
  {
    super.onResume();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.StartPageFragment
 * JD-Core Version:    0.6.0
 */