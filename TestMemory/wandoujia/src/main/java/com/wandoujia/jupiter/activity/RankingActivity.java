package com.wandoujia.jupiter.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.TextUtils;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.jupiter.fragment.TabListFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;

public class RankingActivity extends BaseActivity
{
  private String a;
  private String b = "wdj://apps/top";

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    TabListFragment localTabListFragment = new TabListFragment();
    this.a = getIntent().getStringExtra("page_api_url");
    if (TextUtils.isEmpty(this.a))
    {
      Intent localIntent = getIntent();
      if ((localIntent != null) && (localIntent.getData() != null))
        break label106;
    }
    while (true)
    {
      Bundle localBundle = ListFragment.a(this.b, this.a, null);
      localBundle.putString("title", getResources().getString(2131625305));
      localTabListFragment.setArguments(localBundle);
      getSupportFragmentManager().a().b(16908290, localTabListFragment).a();
      return;
      label106: if ("wdj://games/top".equals(getIntent().getData().toString()))
      {
        this.a = "http://apis.wandoujia.com/games/v1/tops?format=proto";
        this.b = "wdj://games/top";
        continue;
      }
      this.a = "http://apis.wandoujia.com/apps/v1/tops?format=proto";
      this.b = "wdj://apps/top";
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.RankingActivity
 * JD-Core Version:    0.6.0
 */