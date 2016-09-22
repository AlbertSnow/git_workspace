package com.wandoujia.jupiter.downloadreminder;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.ripple_framework.download.b;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import java.util.List;

final class l
  implements View.OnClickListener
{
  l(NotInstallReminderFragment paramNotInstallReminderFragment, List paramList)
  {
  }

  public final void onClick(View paramView)
  {
    i.k().h().a(Logger.Module.NOTINSTALL_APPS, ViewLogPackage.Action.POPUP, "notinstall_apps_close", Long.valueOf(this.a.size()), b.b(this.a));
    if (this.b.getActivity() != null)
      this.b.getActivity().finish();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.downloadreminder.l
 * JD-Core Version:    0.6.0
 */