package com.wandoujia.p4.settings;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.preference.Preference;
import android.support.v7.app.i;
import android.widget.ListView;
import com.wandoujia.ripple_framework.Config;
import java.util.HashMap;

final class aa
  implements DialogInterface.OnClickListener
{
  aa(MainSettingActivity paramMainSettingActivity, HashMap paramHashMap)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    int i = ((i)paramDialogInterface).a().getCheckedItemPosition();
    if (i == 0)
      Config.c(null);
    String str1;
    for (String str2 = this.b.getString(2131624192); ; str2 = String.format(this.b.getString(2131624195), new Object[] { str1 }))
    {
      this.b.findPreference("setting_apk_download_location").setSummary(str2);
      paramDialogInterface.dismiss();
      return;
      str1 = (String)this.a.keySet().toArray()[(i - 1)];
      Config.c(str1);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.settings.aa
 * JD-Core Version:    0.6.0
 */