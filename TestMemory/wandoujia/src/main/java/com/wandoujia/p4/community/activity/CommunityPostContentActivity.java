package com.wandoujia.p4.community.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.TextUtils;
import com.wandoujia.p4.community.fragmant.CommunityPostContentFragment;
import com.wandoujia.p4.community.fragmant.CommunityPostReplyFragment;
import com.wandoujia.p4.community.fragmant.CommunityPostTopicFragment;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;
import com.wandoujia.p4.community.http.model.CommunityReplyModel;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;
import com.wandoujia.ripple_framework.activity.BaseActivity;

public class CommunityPostContentActivity extends BaseActivity
{
  private String a;
  private CommunityGroupModel b;
  private CommunityTopicModel c;
  private CommunityReplyModel d;

  public static void a(Context paramContext, CommunityGroupModel paramCommunityGroupModel)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("group_model", paramCommunityGroupModel);
    localIntent.putExtra("activity_type", "topic");
    localIntent.setClass(paramContext, CommunityPostContentActivity.class);
    if (!(paramContext instanceof Activity))
      localIntent.setFlags(268435456);
    paramContext.startActivity(localIntent);
  }

  public static void a(Context paramContext, CommunityTopicModel paramCommunityTopicModel, CommunityReplyModel paramCommunityReplyModel)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("topic_model", paramCommunityTopicModel);
    localIntent.putExtra("reply_model", paramCommunityReplyModel);
    localIntent.putExtra("activity_type", "reply");
    localIntent.setClass(paramContext, CommunityPostContentActivity.class);
    if (!(paramContext instanceof Activity))
      localIntent.setFlags(268435456);
    paramContext.startActivity(localIntent);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Intent localIntent = getIntent();
    if (localIntent != null)
    {
      this.a = localIntent.getStringExtra("activity_type");
      this.b = ((CommunityGroupModel)localIntent.getSerializableExtra("group_model"));
      this.c = ((CommunityTopicModel)localIntent.getSerializableExtra("topic_model"));
      this.d = ((CommunityReplyModel)localIntent.getSerializableExtra("reply_model"));
    }
    if (!TextUtils.isEmpty(this.a))
      if (!"topic".equals(this.a))
        break label180;
    for (Object localObject = new CommunityPostTopicFragment(); ; localObject = new CommunityPostReplyFragment())
    {
      Bundle localBundle = new Bundle();
      if (this.b != null)
        localBundle.putSerializable("group_model", this.b);
      if (this.c != null)
        localBundle.putSerializable("topic_model", this.c);
      if (this.d != null)
        localBundle.putSerializable("reply_model", this.d);
      ((CommunityPostContentFragment)localObject).setArguments(localBundle);
      getSupportFragmentManager().a().b(16908290, (Fragment)localObject).a();
      label180: 
      do
        return;
      while (!"reply".equals(this.a));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.activity.CommunityPostContentActivity
 * JD-Core Version:    0.6.0
 */