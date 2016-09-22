package com.wandoujia.p4.settings;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceGroup;
import android.preference.PreferenceScreen;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.ListView;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.p4.utils.c;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;

abstract class a extends PreferenceActivity
{
  private int a = 0;
  private boolean b;
  private Toolbar c;
  private View d;

  private boolean a(Preference paramPreference, String paramString, int[] paramArrayOfInt)
  {
    int i;
    if (paramString.equals(paramPreference.getKey()))
      i = 1;
    boolean bool;
    do
    {
      return i;
      paramArrayOfInt[0] = (1 + paramArrayOfInt[0]);
      bool = paramPreference instanceof PreferenceGroup;
      i = 0;
    }
    while (!bool);
    for (int j = 0; ; j++)
    {
      int k = ((PreferenceGroup)paramPreference).getPreferenceCount();
      i = 0;
      if (j >= k)
        break;
      if (a(((PreferenceGroup)paramPreference).getPreference(j), paramString, paramArrayOfInt))
        return true;
    }
  }

  protected abstract int a();

  abstract void a(String paramString, boolean paramBoolean);

  protected abstract SettingActivityHelper.SettingActivityLabel b();

  protected final void b(String paramString, boolean paramBoolean)
  {
    ListView localListView = getListView();
    Logger localLogger = i.k().h();
    Logger.Module localModule = Logger.Module.SETTINGS;
    ViewLogPackage.Element localElement = ViewLogPackage.Element.SLIDE;
    ViewLogPackage.Action localAction = ViewLogPackage.Action.TOGGLE;
    long l;
    if (paramBoolean)
      l = 1L;
    while (true)
    {
      localLogger.a(localListView, localModule, localElement, localAction, paramString, Long.valueOf(l)).c(localListView);
      return;
      l = 0L;
    }
  }

  public void onBackPressed()
  {
    super.onBackPressed();
  }

  protected void onCreate(Bundle paramBundle)
  {
    v.b().a(this, getIntent(), paramBundle);
    super.onCreate(paramBundle);
    setContentView(2130903505);
    findViewById(2131493000);
    this.c = ((Toolbar)findViewById(2131492999));
    findViewById(2131493001);
    this.d = findViewById(2131493002);
    if (this.c != null)
    {
      this.c.setTitle(getTitle());
      this.c.setNavigationIcon(2130838122);
      this.c.setBackgroundColor(getResources().getColor(2131361989));
      this.c.setTitleTextColor(getResources().getColor(2131362141));
      this.c.setNavigationOnClickListener(new b(this));
      if ((SystemUtil.aboveApiLevel(19)) && (this.d != null))
        this.d.setVisibility(0);
    }
    b();
    addPreferencesFromResource(a());
    Configuration localConfiguration = getResources().getConfiguration();
    int i;
    if ((localConfiguration != null) && (localConfiguration.orientation == 2))
    {
      i = 0;
      if ((i == 0) && (SystemUtil.aboveApiLevel(14)))
        break label296;
    }
    while (true)
    {
      Intent localIntent = getIntent();
      if (localIntent != null)
      {
        Bundle localBundle = localIntent.getExtras();
        if (localBundle != null)
        {
          String str = localBundle.getString(SettingActivityHelper.a);
          if (!TextUtils.isEmpty(str))
          {
            int[] arrayOfInt = { 0 };
            if (a(getPreferenceScreen(), str, arrayOfInt))
            {
              this.a = (-1 + arrayOfInt[0]);
              this.b = true;
            }
          }
        }
      }
      return;
      i = 1;
      break;
      label296: ViewParent localViewParent = getListView().getParent();
      if ((localViewParent == null) || (!(localViewParent instanceof View)))
        continue;
      View localView = (View)localViewParent;
      int j = getResources().getDimensionPixelSize(2131427718);
      int k = getResources().getDimensionPixelSize(2131427716);
      localView.setPadding(k, j, k, j);
    }
  }

  protected void onDestroy()
  {
    v.b().a(this);
    super.onDestroy();
  }

  protected void onNewIntent(Intent paramIntent)
  {
    v.b().a(this, paramIntent);
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
  }

  protected void onPause()
  {
    super.onPause();
    c.b(this);
  }

  public boolean onPreferenceTreeClick(PreferenceScreen paramPreferenceScreen, Preference paramPreference)
  {
    String str = paramPreference.getKey();
    if (str == null)
      return super.onPreferenceTreeClick(paramPreferenceScreen, paramPreference);
    boolean bool1 = paramPreference instanceof CheckBoxPreference;
    boolean bool2 = false;
    if (bool1)
      bool2 = ((CheckBoxPreference)paramPreference).isChecked();
    a(str, bool2);
    return super.onPreferenceTreeClick(paramPreferenceScreen, paramPreference);
  }

  protected void onRestart()
  {
    v.b().b(this, getIntent());
    super.onRestart();
  }

  protected void onResume()
  {
    super.onResume();
    c.a(this);
  }

  protected void onStart()
  {
    super.onStart();
    v.b().a(this);
  }

  protected void onUserLeaveHint()
  {
    v.b().b(this);
    super.onUserLeaveHint();
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    if (this.b)
    {
      setSelection(this.a);
      this.b = false;
    }
  }

  public void setTitle(int paramInt)
  {
    if (this.c != null)
      this.c.setTitle(getString(paramInt));
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    if (this.c != null)
      this.c.setTitle(paramCharSequence);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.settings.a
 * JD-Core Version:    0.6.0
 */