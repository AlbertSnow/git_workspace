package com.wandoujia.jupiter.award;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.TextUtils;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;

public class AwardActivity extends BaseActivity
{
  private String a;
  private String b;

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if ((getIntent() == null) || (getIntent().getData() == null));
    while (true)
    {
      String str1 = getIntent().getStringExtra("page_api_url");
      if (!TextUtils.isEmpty(str1))
        this.a = str1;
      String str2 = getIntent().getStringExtra("page_intent_uri");
      if (!TextUtils.isEmpty(str2))
        this.b = str2;
      ListFragment localListFragment = new ListFragment();
      localListFragment.setArguments(ListFragment.b(this.b, this.a, getResources().getString(2131624236)));
      getSupportFragmentManager().a().b(16908290, localListFragment).a();
      return;
      this.b = getIntent().getData().toString();
      if (this.b.equals("wdj://games/award"))
      {
        this.a = "http://apis.wandoujia.com/games/v1/list/award?format=proto";
        continue;
      }
      this.a = "http://apis.wandoujia.com/apps/v1/list/award?format=proto";
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.award.AwardActivity
 * JD-Core Version:    0.6.0
 */