package com.wandoujia.jupiter.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import com.wandoujia.jupiter.fragment.TabListFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;

public class OnlineGameActivity extends BaseActivity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    TabListFragment localTabListFragment = new TabListFragment();
    Bundle localBundle = getIntent().getExtras();
    if (localBundle == null)
      localBundle = new Bundle();
    localBundle.putString("title", getString(2131625598));
    localTabListFragment.setArguments(localBundle);
    getSupportFragmentManager().a().b(16908290, localTabListFragment).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.OnlineGameActivity
 * JD-Core Version:    0.6.0
 */