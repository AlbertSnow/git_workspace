package com.wandoujia.jupiter.presenter;

import android.os.Handler;
import android.text.TextUtils;
import com.wandoujia.ripple_framework.installer.a.a;
import com.wandoujia.ripple_framework.installer.install.InstallTaskInfo;

final class aq
  implements a
{
  aq(ap paramap)
  {
  }

  public final void onEvent(InstallTaskInfo paramInstallTaskInfo)
  {
    if ((paramInstallTaskInfo == null) || (!TextUtils.equals(paramInstallTaskInfo.a(), ap.a(this.a))))
      return;
    ap.d(this.a).post(new ar(this, paramInstallTaskInfo));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.aq
 * JD-Core Version:    0.6.0
 */