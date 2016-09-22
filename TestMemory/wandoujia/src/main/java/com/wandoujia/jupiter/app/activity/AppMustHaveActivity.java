package com.wandoujia.jupiter.app.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.TextUtils;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;

public class AppMustHaveActivity extends BaseActivity
{
  private String a;
  private String b;
  private String c;

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
      Bundle localBundle = ListFragment.b(this.b, this.a, this.c);
      localListFragment.a(com.wandoujia.jupiter.d.a.c());
      localListFragment.a(new com.wandoujia.jupiter.app.a.a());
      localListFragment.setArguments(localBundle);
      getSupportFragmentManager().a().b(16908290, localListFragment).a();
      return;
      this.b = getIntent().getData().toString();
      if ("wdj://games/essential".equals(this.b))
      {
        this.a = "http://apis.wandoujia.com/games/v1/list/essentials?format=proto";
        this.c = getString(2131624850);
        continue;
      }
      this.a = "http://apis.wandoujia.com/apps/v1/list/essentials?format=proto";
      this.c = getString(2131624295);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.app.activity.AppMustHaveActivity
 * JD-Core Version:    0.6.0
 */