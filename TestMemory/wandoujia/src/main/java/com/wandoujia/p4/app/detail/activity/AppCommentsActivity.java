package com.wandoujia.p4.app.detail.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import com.wandoujia.p4.app.detail.fragment.AppCommentsFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;

public class AppCommentsActivity extends BaseActivity
{
  public static void a(Context paramContext, String paramString1, long paramLong, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean)
  {
    Intent localIntent = new Intent(paramContext, AppCommentsActivity.class);
    localIntent.putExtra("packageName", paramString1);
    localIntent.putExtra("appType", paramString2);
    localIntent.putExtra("vc", paramLong);
    localIntent.putExtra("title", paramString3);
    localIntent.putExtra("vn", paramString4);
    localIntent.putExtra("defaultApkMd5", paramString5);
    localIntent.putExtra("editMode", paramBoolean);
    paramContext.startActivity(localIntent);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getIntent().getExtras() != null)
    {
      AppCommentsFragment localAppCommentsFragment = new AppCommentsFragment();
      localAppCommentsFragment.setArguments(getIntent().getExtras());
      getSupportFragmentManager().a().b(16908290, localAppCommentsFragment).a();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.activity.AppCommentsActivity
 * JD-Core Version:    0.6.0
 */