package com.wandoujia.jupiter.subscribe.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.TextUtils;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.jupiter.j;
import com.wandoujia.jupiter.startpage.manager.LocalFeedManager;
import com.wandoujia.ripple_framework.activity.BaseActivity;

public class SubscribeRankingActivity extends BaseActivity
{
  private String a;
  private String b;

  private void a()
  {
    if (getIntent() == null)
      return;
    String str = getIntent().getDataString();
    if (!TextUtils.isEmpty(str))
    {
      Uri localUri = Uri.parse(str);
      this.a = localUri.getQueryParameter("type");
      this.b = localUri.getQueryParameter("title");
    }
    Bundle localBundle = ListFragment.b("wdj://follow/top", "http://apis.wandoujia.com/five/v1/follow/tops?format=proto", this.b);
    localBundle.putString("type", this.a);
    ListFragment localListFragment = new ListFragment();
    localListFragment.setArguments(localBundle);
    getSupportFragmentManager().a().a(16908290, localListFragment).a();
    ((LocalFeedManager)j.a().a("local_feed")).d();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a();
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.activity.SubscribeRankingActivity
 * JD-Core Version:    0.6.0
 */