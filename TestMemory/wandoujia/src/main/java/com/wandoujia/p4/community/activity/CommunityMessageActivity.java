package com.wandoujia.p4.community.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import com.wandoujia.p4.community.fragmant.CommunityNotificationListFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;

public class CommunityMessageActivity extends BaseActivity
{
  public static void a(Context paramContext)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(paramContext, CommunityMessageActivity.class);
    paramContext.startActivity(localIntent);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    CommunityNotificationListFragment localCommunityNotificationListFragment = new CommunityNotificationListFragment();
    ac localac = getSupportFragmentManager().a();
    localac.b(16908290, localCommunityNotificationListFragment);
    localac.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.activity.CommunityMessageActivity
 * JD-Core Version:    0.6.0
 */