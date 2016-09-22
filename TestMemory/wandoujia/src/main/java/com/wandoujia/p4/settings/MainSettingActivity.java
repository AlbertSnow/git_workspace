package com.wandoujia.p4.settings;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.wandoujia.accessibility.AccessibilityManager;
import com.wandoujia.base.storage.StorageManager;
import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.base.utils.SharePrefSubmitor;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.base.utils.SystemUtil.InstallOption;
import com.wandoujia.base.utils.TextUtil;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.base.utils.ThreadPool.Priority;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.p4.app.activity.AppAutoInstallSettingPopupDialogActivity;
import com.wandoujia.p4.connection.ui.ConnectionActivity;
import com.wandoujia.p4.feedback.FeedbackActivity;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class MainSettingActivity extends a
{
  private SystemUtil.InstallOption a;
  private ad b;
  private ac c;
  private boolean d = false;
  private final com.wandoujia.accessibility.j e = new g(this);

  private String a(String paramString1, String paramString2)
  {
    String str1 = paramString1.toLowerCase();
    String str2 = "";
    if (!TextUtils.isEmpty(paramString2))
      str2 = ", " + paramString2 + getString(2131624189);
    if (str1.contains("usb"))
      return String.format(getString(2131624194), new Object[] { paramString1, str2 });
    if (str1.contains("emulated"))
      return String.format(getString(2131624190), new Object[] { paramString1, str2 });
    if (str1.contains("sdcard"))
      return String.format(getString(2131624191), new Object[] { paramString1, str2 });
    return String.format(getString(2131624190), new Object[] { paramString1, str2 });
  }

  private static List<File> b(String paramString1, String paramString2)
  {
    ArrayList localArrayList = new ArrayList();
    if (!FileUtil.exists(paramString1));
    while (true)
    {
      return localArrayList;
      for (File localFile : new File(paramString1).listFiles())
      {
        if (!localFile.getName().endsWith(paramString2))
          continue;
        localArrayList.add(localFile.getAbsoluteFile());
      }
    }
  }

  private void d()
  {
    android.support.v7.app.j localj = new android.support.v7.app.j(this);
    localj.a(getString(2131624188));
    HashMap localHashMap = StorageManager.getInstance().getAvailableDirectories(0L);
    String str = com.wandoujia.ripple_framework.Config.r();
    int i;
    if (localHashMap.size() <= 1)
      i = 1;
    String[] arrayOfString;
    int j;
    while (true)
    {
      arrayOfString = new String[i];
      arrayOfString[0] = getString(2131624192);
      if (localHashMap.size() > 1)
      {
        Iterator localIterator = localHashMap.entrySet().iterator();
        j = 0;
        int m;
        for (int k = 1; localIterator.hasNext(); k = m)
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          if (((String)localEntry.getKey()).equals(str))
            j = k;
          m = k + 1;
          arrayOfString[k] = a((String)localEntry.getKey(), TextUtil.formatSizeInfo(((Long)localEntry.getValue()).longValue()));
        }
        i = 1 + localHashMap.size();
        continue;
      }
      j = 0;
    }
    localj.a(arrayOfString, j, new ab()).a(new aa(this, localHashMap)).b(new z());
    android.support.v7.app.i locali = localj.b();
    locali.setCanceledOnTouchOutside(true);
    locali.show();
  }

  private void e()
  {
    Preference localPreference = findPreference("setting_root_install_location");
    SystemUtil.InstallOption localInstallOption = BadgeUtil.f(this);
    if (localPreference != null);
    switch (q.a[localInstallOption.ordinal()])
    {
    default:
      localPreference.setSummary(2131624965);
      return;
    case 1:
      localPreference.setSummary(2131624965);
      return;
    case 2:
      localPreference.setSummary(2131624966);
      return;
    case 3:
    }
    localPreference.setSummary(2131624967);
  }

  protected final int a()
  {
    return 2131099653;
  }

  public final void a(String paramString, boolean paramBoolean)
  {
    if (paramString.equals("setting_notify_entry"))
    {
      ListView localListView = getListView();
      com.wandoujia.ripple_framework.i.k().h().a(localListView, Logger.Module.SETTINGS, ViewLogPackage.Element.MENU_ITEM, ViewLogPackage.Action.REDIRECT, "notification", null).c(localListView);
      SettingActivityHelper.a(this, SettingActivityHelper.SettingActivityLabel.NOTIFY);
    }
    do
    {
      while (true)
      {
        return;
        if (paramString.equals("setting_about_entry"))
        {
          SettingActivityHelper.a(this, SettingActivityHelper.SettingActivityLabel.ABOUT);
          return;
        }
        if (paramString.equals("setting_wechat_following"))
        {
          android.support.v4.app.b.v(this);
          return;
        }
        if (paramString.equals("setting_shortcut"))
        {
          com.wandoujia.ripple_framework.view.a.h localh1 = new com.wandoujia.ripple_framework.view.a.h(this);
          View localView1 = LayoutInflater.from(this).inflate(2130903063, null);
          if (!OemUtil.canCreateShortcut())
          {
            localView1.findViewById(2131493160).setVisibility(8);
            localView1.findViewById(2131493163).setVisibility(8);
          }
          localh1.a(2131625398);
          localh1.a(localView1);
          com.wandoujia.ripple_framework.view.a.a locala = localh1.b();
          localView1.findViewById(2131493159).setOnClickListener(new n(this, locala));
          if (!OemUtil.canCreateShortcut())
            continue;
          localView1.findViewById(2131493162).setOnClickListener(new o(this, locala));
          localView1.findViewById(2131493165).setOnClickListener(new p(this, locala));
          return;
        }
        if (paramString.equals("setting_root_install"))
        {
          b("root_install", paramBoolean);
          if (paramBoolean)
          {
            if (BadgeUtil.a(this))
            {
              SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
              if (localSharedPreferences != null)
              {
                SharedPreferences.Editor localEditor = localSharedPreferences.edit();
                localEditor.putBoolean("key_first_setting", false);
                SharePrefSubmitor.submit(localEditor);
              }
              com.wandoujia.ripple_framework.view.a.h localh4 = new com.wandoujia.ripple_framework.view.a.h(this);
              localh4.a(getString(2131625498));
              localh4.b(getString(2131624169));
              localh4.a(getString(2131624170), new t(this));
              localh4.b();
              return;
            }
            ThreadPool.execute(new w(this), ThreadPool.Priority.LOW);
            return;
          }
          a(false);
          return;
        }
        if (paramString.equals("setting_root_install_location"))
        {
          com.wandoujia.ripple_framework.view.a.h localh2 = new com.wandoujia.ripple_framework.view.a.h(this);
          View localView2 = LayoutInflater.from(this).inflate(2130903079, null);
          RadioGroup localRadioGroup = (RadioGroup)localView2.findViewById(2131493196);
          RadioButton localRadioButton1 = (RadioButton)localRadioGroup.findViewById(2131493197);
          RadioButton localRadioButton2 = (RadioButton)localRadioGroup.findViewById(2131493198);
          RadioButton localRadioButton3 = (RadioButton)localRadioGroup.findViewById(2131493199);
          this.a = BadgeUtil.f(this);
          switch (q.a[this.a.ordinal()])
          {
          default:
            localRadioButton1.setChecked(true);
          case 1:
          case 2:
          case 3:
          }
          while (true)
          {
            if (!SystemUtil.isExternalSDCardMounted())
              localRadioButton2.setEnabled(false);
            localh2.a(2131624970);
            localh2.a(localView2);
            localh2.a(2131624552, new k(this, localRadioButton1, localRadioButton2, localRadioButton3)).b(2131624330, new j());
            localh2.b().setOnDismissListener(new m(this));
            return;
            localRadioButton1.setChecked(true);
            continue;
            localRadioButton2.setChecked(true);
            continue;
            localRadioButton3.setChecked(true);
          }
        }
        if (paramString.equals("setting_auto_install_apk"))
        {
          if ((this.d) && (!paramBoolean))
            com.wandoujia.p4.configs.Config.C();
          if ((paramBoolean) && (!AccessibilityManager.a()))
          {
            com.wandoujia.jupiter.j.a().a("accessibility");
            AccessibilityManager.a(this.e);
            new Handler(Looper.getMainLooper()).postDelayed(new y(this), 120000L);
            AccessibilityManager.a(this);
            startActivity(new Intent(this, AppAutoInstallSettingPopupDialogActivity.class));
          }
          com.wandoujia.accessibility.a.b(paramBoolean);
          return;
        }
        if (paramString.equals("account_logout"))
        {
          com.wandoujia.ripple_framework.view.a.h localh3 = new com.wandoujia.ripple_framework.view.a.h(this);
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = com.wandoujia.account.a.l();
          String str = getString(2131625029, arrayOfObject);
          localh3.a(2131625028);
          localh3.a(2131625304, new h(this));
          localh3.b(2131624330, new i());
          localh3.b(str);
          localh3.b();
          return;
        }
        if (paramString.equals("setting_feed_back"))
        {
          FeedbackActivity.a(this);
          return;
        }
        if (!paramString.equals("setting_clear_cache"))
          break;
        if ((this.c != null) && (!this.c.isCancelled()))
          continue;
        this.c = new ac(this);
        android.support.v4.app.b.a(this.c, new Void[0]);
        return;
      }
      if (paramString.equals("setting_apk_download_location"))
      {
        d();
        return;
      }
      if (!paramString.equals("setting_auto_check_app_upgrade"))
        continue;
      com.wandoujia.p4.app.upgrade.a.a(false, true);
      return;
    }
    while (!paramString.equals("setting_connection"));
    startActivity(new Intent(this, ConnectionActivity.class));
  }

  public final void a(boolean paramBoolean)
  {
    CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)findPreference("setting_root_install");
    if (localCheckBoxPreference != null)
      localCheckBoxPreference.setChecked(paramBoolean);
    Preference localPreference = findPreference("setting_root_install_location");
    if (localPreference != null)
    {
      if (paramBoolean)
        break label42;
      localPreference.setEnabled(paramBoolean);
    }
    label42: 
    do
      return;
    while (!SystemUtil.isExternalSDCardMounted());
    localPreference.setEnabled(paramBoolean);
  }

  protected final SettingActivityHelper.SettingActivityLabel b()
  {
    return SettingActivityHelper.SettingActivityLabel.MAIN;
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ListView localListView = (ListView)findViewById(16908298);
    localListView.setDivider(getResources().getDrawable(2131362002));
    localListView.setDividerHeight(getResources().getDimensionPixelOffset(2131427696));
    if (SystemUtil.isKindleFire())
      findPreference("setting_shortcut").setEnabled(false);
    com.wandoujia.rootkit.b.a();
    if (!com.wandoujia.rootkit.b.b())
    {
      BadgeUtil.a(getBaseContext(), false);
      findPreference("setting_root_install").setEnabled(false);
      a(false);
      findPreference("setting_root_install_location").setEnabled(false);
    }
    while (true)
    {
      CheckBoxPreference localCheckBoxPreference1 = (CheckBoxPreference)findPreference("is_delete_after_install");
      CheckBoxPreference localCheckBoxPreference2 = (CheckBoxPreference)findPreference("setting_custom_font");
      String str1 = com.wandoujia.ripple_framework.Config.r();
      if (!TextUtils.isEmpty(str1))
      {
        Preference localPreference2 = findPreference("setting_apk_download_location");
        String str2 = getString(2131624195);
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = a(str1, null);
        localPreference2.setSummary(String.format(str2, arrayOfObject));
      }
      localCheckBoxPreference1.setOnPreferenceChangeListener(new r());
      localCheckBoxPreference2.setOnPreferenceChangeListener(new s());
      if ((this.b != null) && (!this.b.isCancelled()))
        this.b.cancel(true);
      this.b = new ad(this);
      android.support.v4.app.b.a(this.b, new Void[0]);
      PreferenceScreen localPreferenceScreen = getPreferenceScreen();
      if (!com.wandoujia.account.a.z())
        localPreferenceScreen.removePreference(findPreference("account_logout_category"));
      if ((SystemUtil.aboveApiLevel(16)) && (!com.wandoujia.accessibility.a.c()))
      {
        Preference localPreference1 = findPreference("setting_auto_install_apk");
        if (localPreference1 != null)
          localPreference1.setEnabled(true);
      }
      if (!OemUtil.canShowAutoInstall())
      {
        PreferenceCategory localPreferenceCategory2 = (PreferenceCategory)findPreference("setting_common");
        localPreferenceCategory2.removePreference(localPreferenceCategory2.findPreference("setting_auto_install_apk"));
      }
      if (!OemUtil.canShowFeedbackEntry())
        localPreferenceScreen.removePreference(findPreference("setting_feedback_category"));
      if (!OemUtil.canShowComputerConnection())
      {
        PreferenceCategory localPreferenceCategory1 = (PreferenceCategory)findPreference("setting_basic");
        localPreferenceCategory1.removePreference(localPreferenceCategory1.findPreference("setting_connection"));
      }
      com.wandoujia.ripple_framework.i.k().h().a(this, "wdj://settings").a(this);
      return;
      if ((!BadgeUtil.b(this)) || (!SystemUtil.isExternalSDCardMounted()))
        break;
      findPreference("setting_root_install_location").setEnabled(true);
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
    if (this.b != null)
      this.b.cancel(true);
    com.wandoujia.jupiter.j.a().a("accessibility");
    AccessibilityManager.b(this.e);
  }

  protected void onResume()
  {
    super.onResume();
    com.wandoujia.jupiter.j.a().a("accessibility");
    AccessibilityManager.b(this.e);
    Preference localPreference = findPreference("setting_about_entry");
    if (localPreference != null)
      localPreference.setSummary(getString(2131623958) + SystemUtil.getVersionName(this) + "." + SystemUtil.getVersionCode(this));
    e();
    CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)findPreference("setting_auto_install_apk");
    if (localCheckBoxPreference == null)
      return;
    if ((SystemUtil.aboveApiLevel(16)) && (!com.wandoujia.accessibility.a.c()) && (AccessibilityManager.a()))
      findPreference("setting_auto_install_apk").setEnabled(true);
    if ((localCheckBoxPreference.isEnabled()) && (AccessibilityManager.a()) && (com.wandoujia.accessibility.a.d()))
      localCheckBoxPreference.setChecked(true);
    while (true)
    {
      this.d = localCheckBoxPreference.isChecked();
      return;
      localCheckBoxPreference.setChecked(false);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.settings.MainSettingActivity
 * JD-Core Version:    0.6.0
 */