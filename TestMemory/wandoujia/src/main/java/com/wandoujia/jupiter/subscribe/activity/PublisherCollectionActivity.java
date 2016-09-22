package com.wandoujia.jupiter.subscribe.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.support.v4.app.b;
import android.support.v4.app.q;
import com.wandoujia.jupiter.j;
import com.wandoujia.jupiter.startpage.manager.LocalFeedManager;
import com.wandoujia.jupiter.subscribe.fragment.PublisherCollectionFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import java.util.List;

public class PublisherCollectionActivity extends BaseActivity
{
  private PublisherCollectionFragment a;

  private void a()
  {
    if (getIntent() == null)
      finish();
    List localList = b.a(getIntent());
    if (localList.size() >= 2)
    {
      Bundle localBundle1 = new Bundle();
      a locala = new a();
      localBundle1.putString("page_intent_uri", "wdj://follow/bundles/" + (String)localList.get(-1 + localList.size()));
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localList.get(-1 + localList.size());
      localBundle1.putString("page_api_url", String.format("http://apis.wandoujia.com/five/v1/follow/bundles/%s", arrayOfObject));
      locala.setArguments(localBundle1);
      getSupportFragmentManager().a().a(16908290, locala).a();
      ((LocalFeedManager)j.a().a("local_feed")).d();
      return;
    }
    Bundle localBundle2 = new Bundle();
    if (this.a != null)
    {
      this.a.e();
      return;
    }
    this.a = new PublisherCollectionFragment();
    localBundle2.putString("page_intent_uri", "wdj://follow/categories");
    localBundle2.putString("page_api_url", "http://apis.wandoujia.com/five/v1/follow/publishers/categories?format=proto");
    this.a.setArguments(localBundle2);
    getSupportFragmentManager().a().a(16908290, this.a).a();
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
 * Qualified Name:     com.wandoujia.jupiter.subscribe.activity.PublisherCollectionActivity
 * JD-Core Version:    0.6.0
 */