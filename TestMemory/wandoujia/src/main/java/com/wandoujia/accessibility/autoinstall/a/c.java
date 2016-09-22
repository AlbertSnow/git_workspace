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

public class c
  implements com.wandoujia.accessibility.autoinstall.b
{
  private final String a = "com.lenovo.safecenter.install.InstallerActivity";
  private final String b = "com.lenovo.safecenter.defense.install.fragment.InstallInterceptActivity";
  private final String c = "com.lenovo.safecenter.install.InstallProgress";
  private final String d = "com.lenovo.safecenter.install.InstallAppProgress";
  private final String e = "com.android.packageinstaller.PackageInstallerActivity";
  private final String f = "com.lenovo.safecenter.defense.fragment.install.InstallInterceptActivity";
  private final String g;
  private final String h;
  private final String i;
  private final String j;
  private final String k;
  private final String l;
  private final Set<String> m;
  private Set<Integer> n = new HashSet();

  public c()
  {
    Resources localResources = GlobalConfig.getAppContext().getResources();
    this.h = localResources.getString(R.string.app_auto_install_lenovo_no_perm);
    this.i = localResources.getString(R.string.app_auto_install_lenovo_perm);
    this.j = localResources.getString(R.string.app_auto_install_lenovo_install_success);
    this.k = localResources.getString(R.string.app_auto_install_lenovo_pass_le_security);
    this.l = localResources.getString(R.string.app_auto_install_lenovo_install_success);
    this.g = localResources.getString(R.string.app_auto_install_lenovo_install_success_button);
    String[] arrayOfString = new String[2];
    arrayOfString[0] = localResources.getString(R.string.app_auto_install_install);
    arrayOfString[1] = localResources.getString(R.string.app_auto_install_confirm);
    this.m = new HashSet(Arrays.asList(arrayOfString));
  }

  public final boolean a(AccessibilityEvent paramAccessibilityEvent)
  {
    CharSequence localCharSequence = paramAccessibilityEvent.getClassName();
    if ((this.a.equals(localCharSequence)) || (this.b.equals(localCharSequence)) || (this.c.equals(localCharSequence)) || (this.d.equals(localCharSequence)) || (this.e.equals(localCharSequence)) || (this.f.equals(localCharSequence)))
      this.n.add(Integer.valueOf(paramAccessibilityEvent.getWindowId()));
    do
      return true;
    while (this.n.contains(Integer.valueOf(paramAccessibilityEvent.getWindowId())));
    return false;
  }

  public final boolean a(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return false;
  }

  public boolean a(AccessibilityNodeInfo paramAccessibilityNodeInfo, String paramString)
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo1 = android.support.v4.app.b.a(paramAccessibilityNodeInfo, this.j);
    AccessibilityNodeInfo localAccessibilityNodeInfo2 = android.support.v4.app.b.a(paramAccessibilityNodeInfo, this.l);
    int i1;
    if (localAccessibilityNodeInfo1 == null)
    {
      i1 = 0;
      if (localAccessibilityNodeInfo2 == null);
    }
    else
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo3 = android.support.v4.app.b.a(paramAccessibilityNodeInfo, this.g);
      i1 = 0;
      if (localAccessibilityNodeInfo3 != null)
      {
        android.support.v4.app.b.a(localAccessibilityNodeInfo3, TaskEvent.Action.AUTO_INSTALL_CLICK);
        i1 = 1;
      }
    }
    if (i1 != 0)
      com.wandoujia.accessibility.autoinstall.a.a(paramString);
    return i1;
  }

  public final boolean b(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return false;
  }

  public final boolean c(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return false;
  }

  public boolean d(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo1 = android.support.v4.app.b.a(paramAccessibilityNodeInfo, this.i);
    AccessibilityNodeInfo localAccessibilityNodeInfo2 = android.support.v4.app.b.a(paramAccessibilityNodeInfo, this.h);
    AccessibilityNodeInfo localAccessibilityNodeInfo3 = android.support.v4.app.b.a(paramAccessibilityNodeInfo, this.k);
    int i2;
    int i1;
    if ((localAccessibilityNodeInfo1 == null) && (localAccessibilityNodeInfo2 == null))
    {
      i2 = 0;
      if (localAccessibilityNodeInfo3 == null);
    }
    else
    {
      Iterator localIterator = this.m.iterator();
      i1 = 0;
      if (localIterator.hasNext())
      {
        AccessibilityNodeInfo localAccessibilityNodeInfo4 = android.support.v4.app.b.a(paramAccessibilityNodeInfo, (String)localIterator.next());
        if (localAccessibilityNodeInfo4 == null)
          break label118;
        android.support.v4.app.b.a(localAccessibilityNodeInfo4, TaskEvent.Action.AUTO_INSTALL_CLICK);
        com.wandoujia.accessibility.autoinstall.view.a.a();
      }
    }
    label118: for (int i3 = 1; ; i3 = i1)
    {
      i1 = i3;
      break;
      i2 = i1;
      return i2;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.autoinstall.a.c
 * JD-Core Version:    0.6.0
 */