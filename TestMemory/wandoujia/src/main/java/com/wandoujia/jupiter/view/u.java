package com.wandoujia.jupiter.view;

import android.content.Context;
import android.content.Intent;
import com.nispok.snackbar.Snackbar;
import com.nispok.snackbar.a.a;
import com.wandoujia.p4.settings.MainSettingActivity;

final class u
  implements a
{
  u(Context paramContext)
  {
  }

  public final void a(Snackbar paramSnackbar)
  {
    Intent localIntent = new Intent(this.a, MainSettingActivity.class);
    this.a.startActivity(localIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.view.u
 * JD-Core Version:    0.6.0
 */