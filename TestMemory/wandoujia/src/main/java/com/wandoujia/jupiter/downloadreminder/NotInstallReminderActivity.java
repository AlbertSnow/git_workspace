package com.wandoujia.jupiter.downloadreminder;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.b;
import android.support.v4.app.q;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import java.util.List;

public class NotInstallReminderActivity extends BaseActivity
{
  public static boolean a(Context paramContext, List<DownloadInfo> paramList)
  {
    if (paramContext == null);
    do
      return false;
    while (CollectionUtils.isEmpty(b.a(true, paramList)));
    paramContext.startActivity(new Intent(paramContext, NotInstallReminderActivity.class));
    return true;
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getSupportFragmentManager().a().b(16908290, new NotInstallReminderFragment()).b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.downloadreminder.NotInstallReminderActivity
 * JD-Core Version:    0.6.0
 */