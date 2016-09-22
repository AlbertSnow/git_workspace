package com.wandoujia.p4.app_launcher.b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.d;
import android.view.View;
import android.view.View.OnClickListener;

final class k
  implements View.OnClickListener
{
  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse("wdj://me/upgrade_apps"));
    paramView.getContext().startActivity(localIntent);
    d.a(paramView);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.b.k
 * JD-Core Version:    0.6.0
 */