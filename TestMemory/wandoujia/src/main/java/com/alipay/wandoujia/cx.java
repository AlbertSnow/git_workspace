package com.alipay.wandoujia;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.alipay.android.mini.window.sdk.MiniWebActivity;

final class cx
  implements DialogInterface.OnClickListener
{
  cx(Context paramContext, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Intent localIntent = new Intent(this.a, MiniWebActivity.class);
    localIntent.putExtra("url", this.b[paramInt]);
    localIntent.putExtra("title", this.c[paramInt]);
    this.a.startActivity(localIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.cx
 * JD-Core Version:    0.6.0
 */