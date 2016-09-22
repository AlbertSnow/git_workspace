package com.wandoujia.jupiter.topic.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;

public class TopicListActivity extends BaseActivity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if ((getIntent() != null) && (getIntent().getData() != null));
    for (String str = getIntent().getData().toString(); ; str = "wdj://topics/apps")
    {
      Bundle localBundle = ListFragment.b(str, "http://apis.wandoujia.com/apps/v1/topics?format=proto", getResources().getString(2131624336));
      ListFragment localListFragment = new ListFragment();
      if ((getIntent() != null) && (getIntent().getExtras() != null))
        localBundle.putAll(getIntent().getExtras());
      localListFragment.setArguments(localBundle);
      getSupportFragmentManager().a().b(16908290, localListFragment).a();
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.topic.activity.TopicListActivity
 * JD-Core Version:    0.6.0
 */