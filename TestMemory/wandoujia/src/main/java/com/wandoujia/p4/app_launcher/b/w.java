package com.wandoujia.p4.app_launcher.b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.accessibility.AccessibilityManager;
import com.wandoujia.accessibility.a;
import com.wandoujia.logv3.model.packages.ContentPackage.Builder;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.toolkit.v;

final class w
  implements View.OnClickListener
{
  public final void onClick(View paramView)
  {
    Context localContext = paramView.getContext();
    if (AccessibilityManager.a())
      a.a(localContext);
    while (true)
    {
      v.b().a(new TaskEvent.Builder().action(TaskEvent.Action.TOAST).status(TaskEvent.Status.TRIGGER).result(TaskEvent.Result.SUCCESS), new ExtraPackage.Builder().content_package(new ContentPackage.Builder().identity("ONEKEY_CLEAN").build()));
      return;
      AccessibilityManager.a(localContext);
      new Handler(Looper.getMainLooper()).postDelayed(new x(localContext), 50L);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.b.w
 * JD-Core Version:    0.6.0
 */