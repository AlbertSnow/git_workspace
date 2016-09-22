package com.wandoujia.accessibility.autoinstall.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.ripple_framework.accessibility.R.string;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class a
  implements com.wandoujia.accessibility.autoinstall.b
{
  private final String a = "com.android.packageinstaller.PackageInstallerActivity";
  private final String b = "com.android.packageinstaller.InstallAppProgress";
  private final String c;
  private final String d;
  private final String e;
  private final String f;
  private Set<Integer> g = new HashSet();
  private Set<Integer> h = new HashSet();
  private final Set<String> i;

  public a()
  {
    Resources localResources = GlobalConfig.getAppContext().getResources();
    String[] arrayOfString = new String[2];
    arrayOfString[0] = localResources.getString(R.string.app_auto_install_confirm);
    arrayOfString[1] = localResources.getString(R.string.app_auto_install_confirm_uppercase);
    this.i = new HashSet(Arrays.asList(arrayOfString));
    this.c = localResources.getString(R.string.app_auto_install_install);
    this.d = localResources.getString(R.string.app_auto_install_next);
    this.e = localResources.getString(R.string.app_auto_install_done);
    this.f = localResources.getString(R.string.app_auto_install_replace);
  }

  public final boolean a(AccessibilityEvent paramAccessibilityEvent)
  {
    CharSequence localCharSequence = paramAccessibilityEvent.getClassName();
    if ((this.a.equals(localCharSequence)) || (this.b.equals(localCharSequence)))
      this.g.add(Integer.valueOf(paramAccessibilityEvent.getWindowId()));
    do
    {
      do
        return true;
      while (this.g.contains(Integer.valueOf(paramAccessibilityEvent.getWindowId())));
      AccessibilityNodeInfo localAccessibilityNodeInfo = paramAccessibilityEvent.getSource();
      if ((localAccessibilityNodeInfo == null) || (localAccessibilityNodeInfo.findAccessibilityNodeInfosByText(this.f) == null) || (localAccessibilityNodeInfo.findAccessibilityNodeInfosByText(this.f).size() <= 0))
        continue;
      this.h.contains(Integer.valueOf(paramAccessibilityEvent.getWindowId()));
      return true;
    }
    while (this.h.contains(Integer.valueOf(paramAccessibilityEvent.getWindowId())));
    return false;
  }

  public final boolean a(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return false;
  }

  public final boolean a(AccessibilityNodeInfo paramAccessibilityNodeInfo, String paramString)
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo = android.support.v4.app.b.a(paramAccessibilityNodeInfo, this.e);
    int j = 0;
    if (localAccessibilityNodeInfo != null)
    {
      android.support.v4.app.b.a(localAccessibilityNodeInfo, TaskEvent.Action.AUTO_INSTALL_CLICK);
      j = 1;
    }
    if (j != 0)
      com.wandoujia.accessibility.autoinstall.a.a(paramString);
    return j;
  }

  public final boolean b(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    Iterator localIterator = this.i.iterator();
    int j = 0;
    if (localIterator.hasNext())
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo = android.support.v4.app.b.a(paramAccessibilityNodeInfo, (String)localIterator.next());
      if (localAccessibilityNodeInfo == null)
        break label64;
      android.support.v4.app.b.a(localAccessibilityNodeInfo, TaskEvent.Action.AUTO_INSTALL_CLICK);
      com.wandoujia.accessibility.autoinstall.view.a.a();
    }
    label64: for (int k = 1; ; k = j)
    {
      j = k;
      break;
      return j;
    }
  }

  public final boolean c(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo = android.support.v4.app.b.a(paramAccessibilityNodeInfo, this.d);
    int j = 0;
    if (localAccessibilityNodeInfo != null)
    {
      android.support.v4.app.b.a(localAccessibilityNodeInfo, TaskEvent.Action.AUTO_INSTALL_CLICK);
      com.wandoujia.accessibility.autoinstall.view.a.a();
      j = 1;
    }
    return j;
  }

  public final boolean d(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo = android.support.v4.app.b.a(paramAccessibilityNodeInfo, this.c);
    int j = 0;
    if (localAccessibilityNodeInfo != null)
    {
      android.support.v4.app.b.a(localAccessibilityNodeInfo, TaskEvent.Action.AUTO_INSTALL_CLICK);
      com.wandoujia.accessibility.autoinstall.view.a.a();
      j = 1;
    }
    return j;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.autoinstall.a.a
 * JD-Core Version:    0.6.0
 */