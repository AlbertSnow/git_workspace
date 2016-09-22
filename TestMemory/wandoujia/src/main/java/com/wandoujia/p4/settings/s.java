package com.wandoujia.p4.settings;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import com.wandoujia.p4.configs.Config;

final class s
  implements Preference.OnPreferenceChangeListener
{
  public final boolean onPreferenceChange(Preference paramPreference, Object paramObject)
  {
    if (((Boolean)paramObject).booleanValue())
      Config.b(false);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.settings.s
 * JD-Core Version:    0.6.0
 */