package com.wandoujia.p4.settings;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.preference.Preference;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.update.toolkit.UpdateClient;

public class AboutSettingActivity extends a
{
  private UpdateClient a;

  protected final int a()
  {
    return 2131099651;
  }

  public final void a(String paramString, boolean paramBoolean)
  {
    if (paramString.equals("setting_about"))
      new com.wandoujia.p4.views.a.a(this).a();
    do
    {
      return;
      if (paramString.equals("setting_update"))
      {
        if (this.a == null)
          this.a = new UpdateClient();
        this.a.a(this, JupiterApplication.d().i());
        return;
      }
      if (!paramString.equals("setting_multimedia_legal"))
        continue;
      try
      {
        Intent localIntent2 = new Intent("android.intent.action.VIEW");
        localIntent2.setData(Uri.parse("http://www.wandoujia.com/multimedia_legal.html"));
        startActivity(localIntent2);
        return;
      }
      catch (ActivityNotFoundException localActivityNotFoundException2)
      {
        p.a(getApplicationContext(), 2131625181, p.b).a();
        return;
      }
    }
    while (!paramString.equals("setting_terms"));
    try
    {
      Intent localIntent1 = new Intent("android.intent.action.VIEW");
      localIntent1.setData(Uri.parse("http://www.wandoujia.com/terms"));
      startActivity(localIntent1);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException1)
    {
      p.a(getApplicationContext(), 2131625181, p.b).a();
    }
  }

  protected final SettingActivityHelper.SettingActivityLabel b()
  {
    return SettingActivityHelper.SettingActivityLabel.ABOUT;
  }

  protected void onDestroy()
  {
    if (this.a != null)
    {
      this.a.a();
      this.a = null;
    }
    super.onDestroy();
  }

  protected void onResume()
  {
    super.onResume();
    Preference localPreference = findPreference("setting_about");
    if (localPreference != null)
      localPreference.setSummary(getString(2131623958) + SystemUtil.getVersionName(this) + "." + SystemUtil.getVersionCode(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.settings.AboutSettingActivity
 * JD-Core Version:    0.6.0
 */