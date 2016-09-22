package com.wandoujia.p4.community.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.support.v4.app.b;
import android.support.v4.app.q;
import android.text.TextUtils;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.p4.community.eventbus.CommunityEvent;
import com.wandoujia.p4.community.fragmant.CommunityBallotCompleteFragment;
import com.wandoujia.p4.community.fragmant.CommunityNewBallotFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import de.greenrobot.event.c;

public class CommunityNewNominateActivity extends BaseActivity
{
  public static void a(Context paramContext)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(paramContext, CommunityNewNominateActivity.class);
    if (!(paramContext instanceof Activity))
      localIntent.setFlags(268435456);
    paramContext.startActivity(localIntent);
  }

  private void a(Fragment paramFragment)
  {
    ac localac = getSupportFragmentManager().a();
    localac.b(16908290, paramFragment);
    localac.a();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a(new CommunityNewBallotFragment());
    b.O().a(this);
  }

  protected void onDestroy()
  {
    super.onDestroy();
    b.O().c(this);
  }

  public void onEventMainThread(CommunityEvent paramCommunityEvent)
  {
    if (paramCommunityEvent.b)
    {
      a(new CommunityBallotCompleteFragment());
      return;
    }
    String str = (String)paramCommunityEvent.c;
    if (TextUtils.isEmpty(str))
      str = getString(2131624414);
    p.a(this, str, p.a).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.activity.CommunityNewNominateActivity
 * JD-Core Version:    0.6.0
 */