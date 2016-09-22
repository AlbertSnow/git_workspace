package com.wandoujia.accessibility.autoinstall.a;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.b;
import android.view.accessibility.AccessibilityNodeInfo;
import com.wandoujia.accessibility.autoinstall.view.a;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.ripple_framework.accessibility.R.string;

public final class d extends c
{
  private final String a;
  private final String b;
  private final String c;
  private final String d;

  public d()
  {
    Resources localResources = GlobalConfig.getAppContext().getResources();
    this.a = localResources.getString(R.string.app_auto_install_install);
    this.b = localResources.getString(R.string.app_auto_install_done);
    this.c = localResources.getString(R.string.app_auto_install_lenovo_security_success);
    this.d = localResources.getString(R.string.app_auto_install_lenovo_security_change_permission);
  }

  public final boolean a(AccessibilityNodeInfo paramAccessibilityNodeInfo, String paramString)
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo1 = b.a(paramAccessibilityNodeInfo, this.c);
    AccessibilityNodeInfo localAccessibilityNodeInfo2 = b.a(paramAccessibilityNodeInfo, this.d);
    int i;
    if (localAccessibilityNodeInfo1 == null)
    {
      i = 0;
      if (localAccessibilityNodeInfo2 == null);
    }
    else
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo3 = b.a(paramAccessibilityNodeInfo, this.b);
      i = 0;
      if (localAccessibilityNodeInfo3 != null)
      {
        b.a(localAccessibilityNodeInfo3, TaskEvent.Action.AUTO_INSTALL_CLICK);
        i = 1;
      }
    }
    return i;
  }

  public final boolean d(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo = b.a(paramAccessibilityNodeInfo, this.a);
    int i = 0;
    if (localAccessibilityNodeInfo != null)
    {
      b.a(localAccessibilityNodeInfo, TaskEvent.Action.AUTO_INSTALL_CLICK);
      a.a();
      i = 1;
    }
    return i;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.autoinstall.a.d
 * JD-Core Version:    0.6.0
 */