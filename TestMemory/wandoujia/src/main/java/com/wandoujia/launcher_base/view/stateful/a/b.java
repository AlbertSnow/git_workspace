package com.wandoujia.launcher_base.view.stateful.a;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;

final class b
  implements View.OnClickListener
{
  b(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    switch (e.b[a.a(this.a).getState().ordinal()])
    {
    default:
      return;
    case 1:
      a.a(this.a, paramView.getContext());
      a.a(this.a, paramView, ViewLogPackage.Action.DOWNLOAD, "download_app");
      return;
    case 2:
      a.b(this.a);
      a.a(this.a, paramView, ViewLogPackage.Action.PAUSE, "pause_download");
      return;
    case 3:
      a.b(this.a, paramView.getContext());
      a.a(this.a, paramView, ViewLogPackage.Action.RESUME, "resume_download");
      return;
    case 4:
    case 5:
      if (a.c(this.a))
        a.d(this.a);
      while (true)
      {
        a.a(this.a, paramView, ViewLogPackage.Action.OPEN, "install_app");
        return;
        a.a(this.a, paramView.getContext());
      }
    case 6:
    }
    a.e(this.a);
    a.a(this.a, paramView, ViewLogPackage.Action.OPEN, "launch_local_app");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.view.stateful.a.b
 * JD-Core Version:    0.6.0
 */