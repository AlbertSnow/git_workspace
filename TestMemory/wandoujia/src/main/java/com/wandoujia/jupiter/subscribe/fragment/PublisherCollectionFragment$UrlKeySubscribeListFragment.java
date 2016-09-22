package com.wandoujia.jupiter.subscribe.fragment;

import android.os.Bundle;
import com.wandoujia.jupiter.p;
import com.wandoujia.nirvana.framework.network.page.a;
import com.wandoujia.ripple_framework.model.Model;
import java.util.HashMap;
import java.util.Map;

public class PublisherCollectionFragment$UrlKeySubscribeListFragment extends SubscribeListFragment
{
  private String b;

  protected final a<Model> a(String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("hideMore", Boolean.TRUE.toString());
    p localp = new p(paramString, localHashMap);
    localp.a(false);
    return localp;
  }

  protected final String e()
  {
    return this.b;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.b = getArguments().getString("page_api_url");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.fragment.PublisherCollectionFragment.UrlKeySubscribeListFragment
 * JD-Core Version:    0.6.0
 */