package com.wandoujia.p4.account.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import com.wandoujia.jupiter.activity.BaseToolBarActivity;
import com.wandoujia.p4.campaign.CampaignFragment;

public class WebViewActivity extends BaseToolBarActivity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903213);
    CampaignFragment localCampaignFragment = new CampaignFragment();
    Bundle localBundle = new Bundle();
    localBundle.putSerializable("phoenix.intent.extra.URL", getIntent().getStringExtra("phoenix.intent.extra.URL"));
    localCampaignFragment.setArguments(localBundle);
    getSupportFragmentManager().a().b(2131493502, localCampaignFragment).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.activity.WebViewActivity
 * JD-Core Version:    0.6.0
 */