package com.wandoujia.jupiter.app.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.b;
import android.view.KeyEvent;
import com.wandoujia.jupiter.activity.JupiterDialogActivity;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.model.IncompatibleAppInfo;

public class IncompatibleDialogActivity extends JupiterDialogActivity
{
  private IncompatibleAppInfo a;

  public static void a(Context paramContext, IncompatibleAppInfo paramIncompatibleAppInfo)
  {
    Intent localIntent = new Intent(paramContext, IncompatibleDialogActivity.class);
    localIntent.putExtra("EXTRA_INCOMPATIBLE_APP_INFO", paramIncompatibleAppInfo);
    if (!(paramContext instanceof Activity))
      localIntent.addFlags(268435456);
    localIntent.addFlags(65536);
    paramContext.startActivity(localIntent);
  }

  protected Intent createBackIntent()
  {
    return null;
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getIntent().getExtras() == null)
    {
      finish();
      return;
    }
    this.a = ((IncompatibleAppInfo)getIntent().getSerializableExtra("EXTRA_INCOMPATIBLE_APP_INFO"));
    if (this.a == null)
    {
      finish();
      return;
    }
    a(getString(2131624276));
    b(this.a.incompatibleDetail + '\n' + getString(2131624275));
    a(getString(2131624330), new c(this));
    b(getString(2131624961), new d(this));
    b.a("incompatible_dialog", ViewLogPackage.Element.PAGE, ViewLogPackage.Action.OPEN, "incompatible_show", this.a.packageName);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
      ((de.greenrobot.event.c)i.k().a("event_bus")).d(new com.wandoujia.jupiter.b.a.c(this.a.packageName, false));
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.app.activity.IncompatibleDialogActivity
 * JD-Core Version:    0.6.0
 */