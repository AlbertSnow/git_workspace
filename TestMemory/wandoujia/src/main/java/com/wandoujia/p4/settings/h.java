package com.wandoujia.p4.settings;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v4.app.b;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.p4.account.manager.d;
import com.wandoujia.ripple_framework.i;

final class h
  implements DialogInterface.OnClickListener
{
  h(Activity paramActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    b.a(d.a().d());
    i.k().a("navigation");
    NavigationManager.a(this.a);
    this.a.finish();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.settings.h
 * JD-Core Version:    0.6.0
 */