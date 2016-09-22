package com.wandoujia.p4.community.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.wandoujia.p4.campaign.CampaignActivity;
import com.wandoujia.p4.community.b.ao;

public class CommunityCampaignActivity extends CampaignActivity
{
  private String a;

  public void onBackPressed()
  {
    super.onBackPressed();
    if (TextUtils.isEmpty(this.a))
      return;
    new ao(this.a, this).execute();
    finish();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = getIntent().getStringExtra("group_id");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.activity.CommunityCampaignActivity
 * JD-Core Version:    0.6.0
 */