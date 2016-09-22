package com.wandoujia.jupiter.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.TextUtils;
import com.wandoujia.jupiter.fragment.ReviewFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.view.Anchor;

public class ReviewActivity extends BaseActivity
{
  private void a(Intent paramIntent)
  {
    String str1 = "";
    String str2 = "";
    Anchor localAnchor = null;
    if (paramIntent != null)
    {
      str1 = paramIntent.getDataString();
      str2 = paramIntent.getStringExtra("page_api_url");
      localAnchor = (Anchor)paramIntent.getParcelableExtra("anchor");
    }
    if ((TextUtils.isEmpty(str1)) || (TextUtils.isEmpty(str2)))
    {
      finish();
      return;
    }
    getSupportFragmentManager().a().b(16908290, ReviewFragment.a(str1, str2, localAnchor)).a();
  }

  protected boolean customSystemTintBar()
  {
    return true;
  }

  protected int getSystemBarColor()
  {
    return getResources().getColor(2131362159);
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
 * Qualified Name:     com.wandoujia.jupiter.activity.ReviewActivity
 * JD-Core Version:    0.6.0
 */