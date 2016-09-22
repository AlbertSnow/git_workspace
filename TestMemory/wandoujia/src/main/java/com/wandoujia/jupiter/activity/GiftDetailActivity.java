package com.wandoujia.jupiter.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import com.wandoujia.jupiter.fragment.GiftDetailFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;

public class GiftDetailActivity extends BaseActivity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    GiftDetailFragment localGiftDetailFragment = new GiftDetailFragment();
    Bundle localBundle = new Bundle();
    String str = getIntent().getStringExtra("page_api_url");
    localBundle.putString("page_intent_uri", getIntent().getDataString());
    localBundle.putString("page_api_url", str);
    localBundle.putString("title", getResources().getString(2131625219));
    localBundle.putBoolean("api_url_enable_cache", false);
    localGiftDetailFragment.setArguments(localBundle);
    getSupportFragmentManager().a().b(16908290, localGiftDetailFragment).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.GiftDetailActivity
 * JD-Core Version:    0.6.0
 */