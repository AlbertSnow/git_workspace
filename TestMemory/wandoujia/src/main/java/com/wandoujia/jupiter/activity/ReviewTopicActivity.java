package com.wandoujia.jupiter.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.TextUtils;
import com.wandoujia.jupiter.fragment.ReviewTopicFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;

public class ReviewTopicActivity extends BaseActivity
{
  private void a(Intent paramIntent)
  {
    String str1 = paramIntent.getDataString();
    String str2 = paramIntent.getStringExtra("page_api_url");
    if ((TextUtils.isEmpty(str1)) || (TextUtils.isEmpty(str2)))
    {
      finish();
      return;
    }
    getSupportFragmentManager().a().b(16908290, ReviewTopicFragment.a(str1, str2)).a();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a(getIntent());
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    a(paramIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.ReviewTopicActivity
 * JD-Core Version:    0.6.0
 */