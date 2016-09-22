package com.wandoujia.jupiter.gift;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v4.app.b;
import android.text.TextUtils;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.model.Model;

final class g
  implements DialogInterface.OnClickListener
{
  g(Model paramModel, Activity paramActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.a != null)
    {
      if (!TextUtils.isEmpty(this.a.F().title))
        this.a.a(this.a.F().title);
      ((AppTaskManager)i.k().a("app_task")).a(this.a, b.w(this.b));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.gift.g
 * JD-Core Version:    0.6.0
 */