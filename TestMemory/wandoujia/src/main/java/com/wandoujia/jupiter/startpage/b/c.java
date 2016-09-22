package com.wandoujia.jupiter.startpage.b;

import android.support.v4.app.d;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.update.toolkit.SelfUpdateResult;
import com.wandoujia.update.toolkit.g;

final class c
  implements View.OnClickListener
{
  public final void onClick(View paramView)
  {
    SelfUpdateResult localSelfUpdateResult = g.b();
    if (localSelfUpdateResult != null)
      d.a(paramView.getContext(), localSelfUpdateResult.installerPath);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.startpage.b.c
 * JD-Core Version:    0.6.0
 */