package com.wandoujia.jupiter.app.activity;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager.Status;
import de.greenrobot.event.c;

final class b
  implements View.OnClickListener
{
  b(DownloadInjectorDialogActivity paramDownloadInjectorDialogActivity)
  {
  }

  public final void onClick(View paramView)
  {
    ((c)i.k().a("event_bus")).d(new com.wandoujia.jupiter.b.a.b(DownloadInjectorDialogActivity.a(this.a), AppTaskManager.Status.PAUSE));
    this.a.onBackPressed();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.app.activity.b
 * JD-Core Version:    0.6.0
 */