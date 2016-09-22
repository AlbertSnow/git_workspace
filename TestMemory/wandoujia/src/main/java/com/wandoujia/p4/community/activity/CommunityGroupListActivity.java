package com.wandoujia.p4.community.activity;

import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.support.v4.view.af;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import com.wandoujia.p4.community.fragmant.CommunityGroupListFragment;
import com.wandoujia.p4.community.views.CommunityUnReadCountMenuView;
import com.wandoujia.ripple_framework.activity.BaseActivity;

public class CommunityGroupListActivity extends BaseActivity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getIntent() == null)
    {
      finish();
      return;
    }
    CommunityGroupListFragment localCommunityGroupListFragment = new CommunityGroupListFragment();
    ac localac = getSupportFragmentManager().a();
    localac.b(16908290, localCommunityGroupListFragment);
    localac.a();
  }

  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131492887)
    {
      CommunityMessageActivity.a(this);
      return true;
    }
    return super.onMenuItemSelected(paramInt, paramMenuItem);
  }

  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    boolean bool = super.onPrepareOptionsMenu(paramMenu);
    paramMenu.clear();
    CommunityUnReadCountMenuView localCommunityUnReadCountMenuView = CommunityUnReadCountMenuView.a(new LinearLayout(this));
    af.a(paramMenu.add(0, 2131492887, 0, 2131624547).setActionView(localCommunityUnReadCountMenuView), 2);
    return bool;
  }

  protected void onResume()
  {
    super.onResume();
    supportInvalidateOptionsMenu();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.activity.CommunityGroupListActivity
 * JD-Core Version:    0.6.0
 */