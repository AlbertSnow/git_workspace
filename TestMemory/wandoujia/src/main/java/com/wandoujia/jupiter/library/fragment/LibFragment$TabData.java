package com.wandoujia.jupiter.library.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.wandoujia.account.dto.Role;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.jupiter.library.view.c;
import com.wandoujia.jupiter.library.view.f;
import com.wandoujia.ripple_framework.Config;
import com.wandoujia.ripple_framework.adapter.m;
import com.wandoujia.ripple_framework.fragment.BaseListFragment.ViewConfig;
import com.wandoujia.ripple_framework.view.slidingtab.e;
import java.util.ArrayList;
import java.util.List;

 enum LibFragment$TabData
{
  private final Class<? extends Fragment> clazz;
  private final String intent;
  private final Role role;
  private final String title;

  static
  {
    APP_MANAGE = new TabData("APP_MANAGE", 2, null, AppInstalledFragment.class, JupiterApplication.e().getString(2131624976), "wdj://me/apps");
    FAVORITE = new TabData("FAVORITE", 3, Role.ROLE_USER, FavoriteFragment.class, JupiterApplication.e().getString(2131624726), "wdj://me/favorite");
    HISTORY = new TabData("HISTORY", 4, Role.ROLE_USER, ListFragment.class, JupiterApplication.e().getString(2131624926), "wdj://me/history");
    GAME_GIFT = new TabData("GAME_GIFT", 5, Role.ROLE_GIFT, GiftLibFragment.class, JupiterApplication.e().getString(2131624835), "wdj://me/gifts");
    TabData[] arrayOfTabData = new TabData[6];
    arrayOfTabData[0] = DOWNLOAD;
    arrayOfTabData[1] = UPGRADE;
    arrayOfTabData[2] = APP_MANAGE;
    arrayOfTabData[3] = FAVORITE;
    arrayOfTabData[4] = HISTORY;
    arrayOfTabData[5] = GAME_GIFT;
    $VALUES = arrayOfTabData;
  }

  private LibFragment$TabData(Role paramRole, Class<? extends Fragment> paramClass, String paramString1, String paramString2)
  {
    this.role = paramRole;
    this.clazz = paramClass;
    this.title = paramString1;
    this.intent = paramString2;
  }

  private Bundle newBundle()
  {
    Bundle localBundle = new Bundle();
    if (this.intent != null)
      localBundle.putString("page_intent_uri", this.intent);
    localBundle.putBoolean("force_close_toolbar", true);
    switch (au.a[ordinal()])
    {
    default:
      return localBundle;
    case 3:
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = com.wandoujia.account.a.t();
      localBundle.putString("page_api_url", String.format("http://apis.wandoujia.com/five/v2/history/%s?format=proto", arrayOfObject2));
      localBundle.putBoolean("api_url_enable_cache", false);
      BaseListFragment.ViewConfig localViewConfig = new BaseListFragment.ViewConfig();
      localViewConfig.swipeRefresh = false;
      localBundle.putSerializable("view_config", localViewConfig);
      return localBundle;
    case 4:
    }
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = com.wandoujia.account.a.t();
    localBundle.putString("page_api_url", String.format("http://apis.wandoujia.com/five/v2/myGifts?uid=%s&format=proto&reuse=true", arrayOfObject1));
    localBundle.putBoolean("api_url_enable_cache", false);
    return localBundle;
  }

  private e newTab()
  {
    switch (au.a[ordinal()])
    {
    default:
      return new com.wandoujia.jupiter.library.view.a(name(), this.title);
    case 1:
      return new c(name());
    case 2:
    }
    return new f(name());
  }

  private m newTabFragmentData()
  {
    switch (au.a[ordinal()])
    {
    default:
      return new m(this.title, this.clazz, this.intent, newBundle(), newTab());
    case 3:
    }
    return new az(this.title, this.clazz, this.intent, newBundle(), newTab());
  }

  private static List<m> newTabs()
  {
    ArrayList localArrayList = new ArrayList();
    TabData[] arrayOfTabData = values();
    int i = arrayOfTabData.length;
    int j = 0;
    if (j < i)
    {
      TabData localTabData = arrayOfTabData[j];
      if ((localTabData.role != Role.ROLE_SUBSCRIBER) || ((!Config.e()) && (!OemUtil.isOemOrPaid())))
      {
        if (localTabData.role != null)
          break label76;
        localArrayList.add(localTabData.newTabFragmentData());
      }
      while (true)
      {
        j++;
        break;
        label76: if (!com.wandoujia.account.a.a(localTabData.role))
          continue;
        localArrayList.add(localTabData.newTabFragmentData());
      }
    }
    return localArrayList;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.LibFragment.TabData
 * JD-Core Version:    0.6.0
 */