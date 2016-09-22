package com.wandoujia.p4.community.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import com.wandoujia.p4.community.fragmant.CommunityMembersTabFragment;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;
import com.wandoujia.ripple_framework.activity.BaseActivity;

public class CommunityMembersActivity extends BaseActivity
{
  private CommunityGroupModel a;

  public static void a(Activity paramActivity, CommunityGroupModel paramCommunityGroupModel)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("group_model", paramCommunityGroupModel);
    localIntent.setClass(paramActivity, CommunityMembersActivity.class);
    paramActivity.startActivity(localIntent);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Intent localIntent = getIntent();
    if ((localIntent != null) && (localIntent != null))
      this.a = ((CommunityGroupModel)localIntent.getSerializableExtra("group_model"));
    CommunityMembersTabFragment localCommunityMembersTabFragment = new CommunityMembersTabFragment();
    Bundle localBundle = new Bundle();
    if (this.a != null)
      localBundle.putSerializable("group_model", this.a);
    localCommunityMembersTabFragment.setArguments(localBundle);
    getSupportFragmentManager().a().b(16908290, localCommunityMembersTabFragment).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.activity.CommunityMembersActivity
 * JD-Core Version:    0.6.0
 */