package com.wandoujia.p4.settings;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.RadioButton;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.base.utils.SystemUtil.InstallOption;
import com.wandoujia.ripple_framework.util.BadgeUtil;

final class k
  implements DialogInterface.OnClickListener
{
  k(MainSettingActivity paramMainSettingActivity, RadioButton paramRadioButton1, RadioButton paramRadioButton2, RadioButton paramRadioButton3)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.b.isChecked())
      MainSettingActivity.a(this.a, SystemUtil.InstallOption.AUTO);
    while ((MainSettingActivity.b(this.a) == SystemUtil.InstallOption.EXTERNAL) && (!SystemUtil.isExternalSDCardMounted()))
    {
      MainSettingActivity.a(paramDialogInterface, false);
      if (this.a != null)
        this.a.runOnUiThread(new l(this));
      return;
      if (this.c.isChecked())
      {
        MainSettingActivity.a(this.a, SystemUtil.InstallOption.EXTERNAL);
        continue;
      }
      if (!this.d.isChecked())
        continue;
      MainSettingActivity.a(this.a, SystemUtil.InstallOption.INTERNAL);
    }
    BadgeUtil.a(this.a, MainSettingActivity.b(this.a));
    MainSettingActivity.a(paramDialogInterface, true);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.settings.k
 * JD-Core Version:    0.6.0
 */