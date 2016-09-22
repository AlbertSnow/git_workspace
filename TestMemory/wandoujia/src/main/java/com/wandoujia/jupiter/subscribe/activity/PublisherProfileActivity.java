package com.wandoujia.jupiter.subscribe.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.support.v4.app.b;
import android.support.v4.app.q;
import android.text.TextUtils;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.j;
import com.wandoujia.jupiter.startpage.manager.LocalFeedManager;
import com.wandoujia.jupiter.subscribe.fragment.PublisherProfileFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import java.util.List;

public class PublisherProfileActivity extends BaseActivity
{
  private void a()
  {
    if (getIntent() == null)
    {
      finish();
      return;
    }
    List localList = b.a(getIntent());
    if (CollectionUtils.isEmpty(localList))
    {
      finish();
      return;
    }
    String str = (String)localList.get(-1 + localList.size());
    if (TextUtils.isEmpty(str))
    {
      Log.e("subscribe_p5", PublisherProfileActivity.class.getSimpleName() + " : " + "failed to know publisher id from url intent", new Object[0]);
      finish();
      return;
    }
    PublisherProfileFragment localPublisherProfileFragment = new PublisherProfileFragment();
    Bundle localBundle = new Bundle();
    localBundle.putString("page_intent_uri", "wdj://follow/" + str);
    localBundle.putString("argu_publisher_id", str);
    localPublisherProfileFragment.setArguments(localBundle);
    getSupportFragmentManager().a().a(16908290, localPublisherProfileFragment).a();
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
 * Qualified Name:     com.wandoujia.jupiter.subscribe.activity.PublisherProfileActivity
 * JD-Core Version:    0.6.0
 */