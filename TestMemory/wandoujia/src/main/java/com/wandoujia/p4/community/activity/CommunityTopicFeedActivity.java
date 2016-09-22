package com.wandoujia.p4.community.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import com.wandoujia.p4.community.fragmant.CommunityUserTopicListFragment;
import com.wandoujia.p4.community.fragmant.CommunityUserTopicListFragment.TopicType;
import com.wandoujia.ripple_framework.activity.BaseActivity;

public class CommunityTopicFeedActivity extends BaseActivity
{
  private CommunityUserTopicListFragment.TopicType a;

  public static void a(Context paramContext, CommunityUserTopicListFragment.TopicType paramTopicType)
  {
    Intent localIntent = new Intent(paramContext, CommunityTopicFeedActivity.class);
    localIntent.putExtra("topics_type", paramTopicType);
    if (paramContext == paramContext.getApplicationContext())
      localIntent.setFlags(268435456);
    paramContext.startActivity(localIntent);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Intent localIntent = getIntent();
    if (localIntent == null)
    {
      finish();
      return;
    }
    this.a = ((CommunityUserTopicListFragment.TopicType)localIntent.getSerializableExtra("topics_type"));
    setContentView(2130903213);
    CommunityUserTopicListFragment localCommunityUserTopicListFragment = new CommunityUserTopicListFragment();
    Bundle localBundle = new Bundle();
    localBundle.putSerializable("topics_type", this.a);
    localCommunityUserTopicListFragment.setArguments(localBundle);
    getSupportFragmentManager().a().b(2131493502, localCommunityUserTopicListFragment).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.activity.CommunityTopicFeedActivity
 * JD-Core Version:    0.6.0
 */