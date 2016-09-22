package com.wandoujia.jupiter.app.activity;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.jupiter.b.a.b;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager.Status;
import de.greenrobot.event.c;

final class a
  implements View.OnClickListener
{
  a(DownloadInjectorDialogActivity paramDownloadInjectorDialogActivity)
  {
  }

  public final void onClick(View paramView)
  {
    ((c)i.k().a("event_bus")).d(new b(DownloadInjectorDialogActivity.a(this.a), AppTaskManager.Status.CREATED));
    this.a.onBackPressed();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.app.activity.a
 * JD-Core Version:    0.6.0
 */