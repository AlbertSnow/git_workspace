package com.wandoujia.p4.community.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.TextUtils;
import com.wandoujia.p4.community.fragmant.CommunityBallotStatusFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;

public class CommunityBallotStatusActivity extends BaseActivity
{
  private String a;

  private void a()
  {
    CommunityBallotStatusFragment localCommunityBallotStatusFragment = new CommunityBallotStatusFragment();
    Bundle localBundle = new Bundle();
    localBundle.putString("group_id", this.a);
    localCommunityBallotStatusFragment.setArguments(localBundle);
    ac localac = getSupportFragmentManager().a();
    localac.b(16908290, localCommunityBallotStatusFragment);
    localac.a();
  }

  public static void a(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("group_id", paramString);
    localIntent.setClass(paramContext, CommunityBallotStatusActivity.class);
    if (!(paramContext instanceof Activity))
      localIntent.setFlags(268435456);
    paramContext.startActivity(localIntent);
  }

  private void a(Intent paramIntent)
  {
    if (paramIntent != null)
    {
      String str = paramIntent.getDataString();
      if (TextUtils.isEmpty(str))
        break label51;
      if ((str.contains("group.wandoujia.com")) && (str.contains("ballot")))
        this.a = str.substring(1 + str.lastIndexOf("/"));
    }
    return;
    label51: this.a = paramIntent.getStringExtra("group_id");
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a(getIntent());
    a();
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    a(paramIntent);
    a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.activity.CommunityBallotStatusActivity
 * JD-Core Version:    0.6.0
 */