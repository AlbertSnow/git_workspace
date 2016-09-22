package com.wandoujia.p4.connection.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.p4.connection.a.a;

final class h
  implements View.OnClickListener
{
  h(ConnectionFragment paramConnectionFragment)
  {
  }

  public final void onClick(View paramView)
  {
    ConnectionFragment.b(this.a).setEnabled(false);
    Intent localIntent = new Intent();
    localIntent.putExtra("phoenix.intent.extra.USER_AGENT", "phoenix");
    localIntent.putExtra("phoenix.intent.extra.SOURCE", 7);
    a.a(GlobalConfig.getAppContext(), localIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.connection.ui.h
 * JD-Core Version:    0.6.0
 */