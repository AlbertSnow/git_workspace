package com.wandoujia.jupiter.search.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.model.Model;

public class InAppCampaignActivity extends BaseActivity
{
  public static void a(Context paramContext, String paramString1, String paramString2, Model paramModel)
  {
    Intent localIntent = new Intent(paramContext, InAppCampaignActivity.class);
    if (!(paramContext instanceof Activity))
      localIntent.addFlags(268435456);
    localIntent.putExtra("phoenix.intent.extra.TITLE", paramString1);
    localIntent.putExtra("phoenix.intent.extra.URL", paramString2);
    localIntent.putExtra("key_app_card_model", paramModel);
    paramContext.startActivity(localIntent);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a locala = new a();
    locala.setArguments(getIntent().getExtras());
    getSupportFragmentManager().a().b(16908290, locala).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.activity.InAppCampaignActivity
 * JD-Core Version:    0.6.0
 */