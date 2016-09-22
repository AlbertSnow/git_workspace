package com.wandoujia.p4.community.activity;

import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import com.wandoujia.p4.community.fragmant.CommunityHomePageTabFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;

public class CommunityHomePageActivity extends BaseActivity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    CommunityHomePageTabFragment localCommunityHomePageTabFragment = new CommunityHomePageTabFragment();
    getSupportFragmentManager().a().b(16908290, localCommunityHomePageTabFragment).a();
    i.k().h().a(this, "wdj://groups").a(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.activity.CommunityHomePageActivity
 * JD-Core Version:    0.6.0
 */