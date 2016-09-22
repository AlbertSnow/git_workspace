package com.wandoujia.jupiter.gift;

import android.app.Activity;
import android.content.ClipData;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import com.nispok.snackbar.Snackbar;
import com.wandoujia.appmanager.AppManager;

final class d
  implements DialogInterface.OnClickListener
{
  d(Activity paramActivity, String paramString1, String paramString2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 11)
      ((android.content.ClipboardManager)this.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("wdj_gift_code", this.b));
    while (true)
    {
      Snackbar.a(this.a).a(2131624862).b(this.a);
      AppManager.a();
      AppManager.b(this.c);
      return;
      ((android.text.ClipboardManager)this.a.getSystemService("clipboard")).setText(this.b);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.gift.d
 * JD-Core Version:    0.6.0
 */