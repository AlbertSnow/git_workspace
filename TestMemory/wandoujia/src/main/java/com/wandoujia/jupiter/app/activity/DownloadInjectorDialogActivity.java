package com.wandoujia.jupiter.app.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.wandoujia.jupiter.activity.JupiterDialogActivity;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager.Status;
import com.wandoujia.ripple_framework.model.Model;
import de.greenrobot.event.c;

public class DownloadInjectorDialogActivity extends JupiterDialogActivity
{
  private Model a;

  public static void a(Context paramContext, Model paramModel)
  {
    Intent localIntent = new Intent(paramContext, DownloadInjectorDialogActivity.class);
    localIntent.putExtra("EXTRA_DOWNLOAD_INFO", paramModel);
    if (!(paramContext instanceof Activity))
      localIntent.addFlags(268435456);
    localIntent.addFlags(65536);
    paramContext.startActivity(localIntent);
  }

  private void a(Intent paramIntent)
  {
    if (paramIntent == null)
      return;
    this.a = ((Model)paramIntent.getParcelableExtra("EXTRA_DOWNLOAD_INFO"));
    a(getString(2131624647));
    b(getString(2131624646));
    a(getString(2131624648), new a(this));
    b(getString(2131624649), new b(this));
  }

  protected Intent createBackIntent()
  {
    return null;
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a(getIntent());
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
      ((c)i.k().a("event_bus")).d(new com.wandoujia.jupiter.b.a.b(this.a, AppTaskManager.Status.CANCEL));
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    a(paramIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.app.activity.DownloadInjectorDialogActivity
 * JD-Core Version:    0.6.0
 */