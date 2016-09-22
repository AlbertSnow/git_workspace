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
import java.util.Set;

public final class b
  implements com.wandoujia.accessibility.autoinstall.b
{
  private final String a = "com.android.packageinstaller.UninstallerActivity";
  private final String b = "com.android.packageinstaller.UninstallAppProgress";
  private final String c;
  private final Set<String> d;
  private Set<Integer> e = new HashSet();

  public b()
  {
    Resources localResources = GlobalConfig.getAppContext().getResources();
    String[] arrayOfString = new String[2];
    arrayOfString[0] = localResources.getString(R.string.app_auto_install_confirm);
    arrayOfString[1] = localResources.getString(R.string.app_auto_install_confirm_uppercase);
    this.d = new HashSet(Arrays.asList(arrayOfString));
    this.c = localResources.getString(R.string.app_auto_install_install);
  }

  public final boolean a(AccessibilityEvent paramAccessibilityEvent)
  {
    CharSequence localCharSequence = paramAccessibilityEvent.getClassName();
    if ((this.a.equals(localCharSequence)) || (this.b.equals(localCharSequence)))
      this.e.add(Integer.valueOf(paramAccessibilityEvent.getWindowId()));
    do
      return false;
    while (this.e.contains(Integer.valueOf(paramAccessibilityEvent.getWindowId())));
    return true;
  }

  public final boolean a(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return false;
  }

  public final boolean a(AccessibilityNodeInfo paramAccessibilityNodeInfo, String paramString)
  {
    com.wandoujia.accessibility.autoinstall.a.a(paramString);
    return false;
  }

  public final boolean b(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    Iterator localIterator = this.d.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo = android.support.v4.app.b.a(paramAccessibilityNodeInfo, (String)localIterator.next());
      if (localAccessibilityNodeInfo == null)
        break label64;
      android.support.v4.app.b.a(localAccessibilityNodeInfo, TaskEvent.Action.AUTO_INSTALL_CLICK);
      com.wandoujia.accessibility.autoinstall.view.a.a();
    }
    label64: for (int j = 1; ; j = i)
    {
      i = j;
      break;
      return i;
    }
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
 * Qualified Name:     com.wandoujia.accessibility.autoinstall.a.b
 * JD-Core Version:    0.6.0
 */