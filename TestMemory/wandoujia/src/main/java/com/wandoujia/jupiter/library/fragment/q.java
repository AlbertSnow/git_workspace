package com.wandoujia.jupiter.library.fragment;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.view.View;
import com.wandoujia.base.utils.SharePrefSubmitor;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.p4.app.upgrade.a;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.view.StatefulButton;

final class q extends h
{
  q(boolean paramBoolean, StatefulButton paramStatefulButton)
  {
  }

  public final boolean a(View paramView)
  {
    if (this.a)
    {
      SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(i.k().g());
      if (localSharedPreferences != null)
      {
        SharedPreferences.Editor localEditor = localSharedPreferences.edit();
        localEditor.putBoolean("setting_auto_check_app_upgrade", true);
        SharePrefSubmitor.submit(localEditor);
      }
      this.b.setEnabled(false);
      a.a(false, true);
      return false;
    }
    i.k().a("navigation");
    NavigationManager.a(paramView.getContext());
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.q
 * JD-Core Version:    0.6.0
 */