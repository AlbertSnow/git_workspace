package com.wandoujia.jupiter.gift;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.TextUtils;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.entities.app.IAppLiteInfo.AppType;
import com.wandoujia.p4.gift.fragment.GiftListFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import java.util.List;

public class GiftListActivity extends BaseActivity
{
  private static String a()
  {
    List localList = AppManager.a().d();
    StringBuilder localStringBuilder = new StringBuilder("");
    if (CollectionUtils.isEmpty(localList))
      return localStringBuilder.toString();
    for (int i = 0; i < localList.size(); i++)
    {
      if (i != 0)
        localStringBuilder.append(',');
      localStringBuilder.append(((LocalAppInfo)localList.get(i)).getPackageName());
    }
    return localStringBuilder.toString();
  }

  private void a(Intent paramIntent)
  {
    if (paramIntent == null)
    {
      finish();
      return;
    }
    String str = paramIntent.getDataString();
    if (TextUtils.isEmpty(str))
    {
      finish();
      return;
    }
    Object localObject;
    if (str.contains("app"))
    {
      localObject = new GiftListFragment();
      Bundle localBundle1 = new Bundle();
      IAppLiteInfo.AppType localAppType = IAppLiteInfo.AppType.APP;
      boolean bool1 = paramIntent.getBooleanExtra("showMyGift", false);
      localBundle1.putSerializable("contentType", localAppType);
      localBundle1.putBoolean("showMyGift", bool1);
      localBundle1.putString("giftType", "APP");
      ((Fragment)localObject).setArguments(localBundle1);
    }
    while (true)
    {
      getSupportFragmentManager().a().a(16908290, (Fragment)localObject).a();
      return;
      boolean bool2 = str.contains("game");
      localObject = null;
      if (!bool2)
        continue;
      localObject = new CdKeyGiftListFragment();
      Bundle localBundle2 = new Bundle();
      localBundle2.putString("page_intent_uri", getIntent().getDataString());
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = a();
      localBundle2.putString("page_api_url", String.format("http://apis.wandoujia.com/five/v2/games/gifts?pns=%s&format=proto", arrayOfObject));
      localBundle2.putString("title", getResources().getString(2131625219));
      localBundle2.putBoolean("api_url_enable_cache", false);
      ((Fragment)localObject).setArguments(localBundle2);
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a(getIntent());
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    a(getIntent());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.gift.GiftListActivity
 * JD-Core Version:    0.6.0
 */