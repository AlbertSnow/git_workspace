package com.wandoujia.p4.community.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.TextUtils;
import com.wandoujia.p4.community.b.ax;
import com.wandoujia.p4.community.fragmant.CommunityTopicListTabFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;

public class CommunityTopicListActivity extends BaseActivity
{
  private String a;
  private String b;

  private void a()
  {
    if ((TextUtils.isEmpty(this.a)) && (TextUtils.isEmpty(this.b)))
      finish();
    if (!TextUtils.isEmpty(this.a))
    {
      a(this.a);
      return;
    }
    new ax(this.b, "game", new a(this)).execute();
  }

  public static void a(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent(paramContext, CommunityTopicListActivity.class);
    localIntent.putExtra("group_id", paramString);
    paramContext.startActivity(localIntent);
  }

  private void a(Intent paramIntent)
  {
    String str = paramIntent.getDataString();
    this.b = null;
    this.a = null;
    if (!TextUtils.isEmpty(str))
    {
      if ((str.contains("group.wandoujia.com")) && (str.contains("groups")))
      {
        if (str.contains("pn"))
          this.b = str.substring(4 + str.lastIndexOf("?pn="));
      }
      else
        return;
      this.a = str.substring(1 + str.lastIndexOf("/"));
      return;
    }
    this.a = paramIntent.getStringExtra("group_id");
  }

  private void a(String paramString)
  {
    CommunityTopicListTabFragment localCommunityTopicListTabFragment = new CommunityTopicListTabFragment();
    Bundle localBundle = new Bundle();
    localBundle.putSerializable("group_id", paramString);
    localCommunityTopicListTabFragment.setArguments(localBundle);
    getSupportFragmentManager().a().b(2131493502, localCommunityTopicListTabFragment).a();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
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
 * Qualified Name:     com.wandoujia.p4.community.activity.CommunityTopicListActivity
 * JD-Core Version:    0.6.0
 */