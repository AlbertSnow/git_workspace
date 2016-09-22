package com.wandoujia.p4.gift.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v4.app.b;
import android.text.TextUtils;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.model.Model;

final class f
  implements DialogInterface.OnClickListener
{
  f(c paramc)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (c.b(this.a) != null)
    {
      if (!TextUtils.isEmpty(c.b(this.a).F().title))
        c.b(this.a).a(c.b(this.a).F().title);
      if (((DownloadManager)i.k().a("download")).a(c.b(this.a).F().package_name) == null)
        ((AppTaskManager)i.k().a("app_task")).a(c.b(this.a), b.w(c.a(this.a)));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.a.f
 * JD-Core Version:    0.6.0
 */