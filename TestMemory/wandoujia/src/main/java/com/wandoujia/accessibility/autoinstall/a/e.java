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

public final class e
  implements com.wandoujia.accessibility.autoinstall.b
{
  private final String a = "com.android.packageinstaller.UninstallerActivity";
  private final String b = "com.android.packageinstaller.UninstallAppProgress";
  private final String c;
  private final String d;
  private final Set<String> e;
  private final String f;
  private Set<Integer> g = new HashSet();

  public e()
  {
    Resources localResources = GlobalConfig.getAppContext().getResources();
    this.c = localResources.getString(R.string.app_auto_install_install);
    this.d = localResources.getString(R.string.app_auto_install_confirm);
    String[] arrayOfString = new String[3];
    arrayOfString[0] = localResources.getString(R.string.app_auto_install_done_miui);
    arrayOfString[1] = localResources.getString(R.string.app_auto_install_done);
    arrayOfString[2] = localResources.getString(R.string.app_auto_install_finish_miui);
    this.e = new HashSet(Arrays.asList(arrayOfString));
    this.f = localResources.getString(R.string.app_auto_install_allow_once);
  }

  public final boolean a(AccessibilityEvent paramAccessibilityEvent)
  {
    CharSequence localCharSequence = paramAccessibilityEvent.getClassName();
    if ((this.a.equals(localCharSequence)) || (this.b.equals(localCharSequence)))
      this.g.add(Integer.valueOf(paramAccessibilityEvent.getWindowId()));
    do
      return false;
    while (this.g.contains(Integer.valueOf(paramAccessibilityEvent.getWindowId())));
    return true;
  }

  public final boolean a(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    int i = 0;
    Iterator localIterator = paramAccessibilityNodeInfo.findAccessibilityNodeInfosByText(this.f).iterator();
    while (localIterator.hasNext())
    {
      android.support.v4.app.b.a((AccessibilityNodeInfo)localIterator.next(), TaskEvent.Action.AUTO_INSTALL_CLICK);
      i = 1;
    }
    return i;
  }

  public final boolean a(AccessibilityNodeInfo paramAccessibilityNodeInfo, String paramString)
  {
    Iterator localIterator = this.e.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo = android.support.v4.app.b.a(paramAccessibilityNodeInfo, (String)localIterator.next());
      if (localAccessibilityNodeInfo == null)
        break label73;
      android.support.v4.app.b.a(localAccessibilityNodeInfo, TaskEvent.Action.AUTO_INSTALL_CLICK);
    }
    label73: for (int j = 1; ; j = i)
    {
      i = j;
      break;
      if (i != 0)
        com.wandoujia.accessibility.autoinstall.a.a(paramString);
      return i;
    }
  }

  public final boolean b(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo = android.support.v4.app.b.a(paramAccessibilityNodeInfo, this.d);
    int i = 0;
    if (localAccessibilityNodeInfo != null)
    {
      android.support.v4.app.b.a(localAccessibilityNodeInfo, TaskEvent.Action.AUTO_INSTALL_CLICK);
      com.wandoujia.accessibility.autoinstall.view.a.a();
      i = 1;
    }
    return i;
  }

  public final boolean c(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return false;
  }

  public final boolean d(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo = android.support.v4.app.b.a(paramAccessibilityNodeInfo, this.c);
    int i = 0;
    if (localAccessibilityNodeInfo != null)
    {
      android.support.v4.app.b.a(localAccessibilityNodeInfo, TaskEvent.Action.AUTO_INSTALL_CLICK);
      com.wandoujia.accessibility.autoinstall.view.a.a();
      i = 1;
    }
    return i;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.autoinstall.a.e
 * JD-Core Version:    0.6.0
 */