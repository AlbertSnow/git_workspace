package com.wandoujia.p4.gift.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.p4.gift.http.model.GiftBeanModels.GiftBeanCdKey;
import com.wandoujia.p4.gift.http.model.GiftModel;

final class k
  implements DialogInterface.OnClickListener
{
  k(g paramg, GiftBeanModels.GiftBeanCdKey paramGiftBeanCdKey)
  {
  }

  @TargetApi(11)
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (SystemUtil.aboveApiLevel(11))
      ((ClipboardManager)c.a(this.b.a).getSystemService("clipboard")).setText(this.a.getCdkey());
    AppManager.a();
    AppManager.b(c.c(this.b.a).getPackageName());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.a.k
 * JD-Core Version:    0.6.0
 */