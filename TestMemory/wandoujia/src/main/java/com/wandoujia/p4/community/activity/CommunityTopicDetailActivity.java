package com.wandoujia.p4.community.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.b;
import android.support.v4.app.q;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.wandoujia.p4.community.fragmant.CommunityTopicDetailFragment;
import com.wandoujia.p4.community.http.model.CommunityNotificationModel;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;
import com.wandoujia.ripple_framework.activity.BaseActivity;

public class CommunityTopicDetailActivity extends BaseActivity
{
  private String a;
  private boolean b = false;
  private CommunityTopicModel c;
  private CommunityNotificationModel d;

  private void a()
  {
    CommunityTopicDetailFragment localCommunityTopicDetailFragment = new CommunityTopicDetailFragment();
    Bundle localBundle = new Bundle();
    if (this.c != null)
      localBundle.putSerializable("topic_model", this.c);
    if (!TextUtils.isEmpty(this.a))
      localBundle.putString("topic_model_id", this.a);
    if (this.d != null)
      localBundle.putSerializable("notification_model", this.d);
    localBundle.putBoolean("need_back_to_group", this.b);
    localCommunityTopicDetailFragment.setArguments(localBundle);
    try
    {
      getSupportFragmentManager().a().b(2131493502, localCommunityTopicDetailFragment).a();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static void a(Activity paramActivity, CommunityNotificationModel paramCommunityNotificationModel)
  {
    Intent localIntent = new Intent(paramActivity, CommunityTopicDetailActivity.class);
    localIntent.putExtra("notification", paramCommunityNotificationModel);
    paramActivity.startActivity(localIntent);
  }

  public static void a(Activity paramActivity, CommunityTopicModel paramCommunityTopicModel)
  {
    Intent localIntent = new Intent(paramActivity, CommunityTopicDetailActivity.class);
    localIntent.putExtra("topic", paramCommunityTopicModel);
    paramActivity.startActivity(localIntent);
  }

  public static void a(Activity paramActivity, String paramString)
  {
    Intent localIntent = new Intent(paramActivity, CommunityTopicDetailActivity.class);
    localIntent.putExtra("topic_id", paramString);
    paramActivity.startActivity(localIntent);
  }

  private void a(Intent paramIntent)
  {
    String str = paramIntent.getDataString();
    if (!TextUtils.isEmpty(str))
      if ((str.contains("group.wandoujia.com")) && (str.contains("topics")))
      {
        this.a = str.substring(1 + str.lastIndexOf("/"));
        this.b = true;
      }
    while (true)
    {
      if ((TextUtils.isEmpty(this.a)) && (this.c == null) && (this.d == null))
        finish();
      return;
      this.a = paramIntent.getStringExtra("topic_id");
      this.c = ((CommunityTopicModel)paramIntent.getSerializableExtra("topic"));
      this.d = ((CommunityNotificationModel)paramIntent.getSerializableExtra("notification"));
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    b.a(this, true);
    setContentView(2130903213);
    Intent localIntent = getIntent();
    if (localIntent == null)
    {
      finish();
      return;
    }
    a(localIntent);
    a();
  }

  protected void onDestroy()
  {
    super.onDestroy();
    b.u(this);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 82)
    {
      openOptionsMenu();
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    if (paramIntent != null)
    {
      a(paramIntent);
      a();
      return;
    }
    finish();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.activity.CommunityTopicDetailActivity
 * JD-Core Version:    0.6.0
 */