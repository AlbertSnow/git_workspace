package com.wandoujia.accessibility.hibernation.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.accessibility.AccessibilityNodeInfo;
import com.wandoujia.accessibility.hibernation.i;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.ripple_framework.accessibility.R.string;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class b
  implements i
{
  private static b c;
  private final String a;
  private final Set<String> b;

  private b()
  {
    Resources localResources = GlobalConfig.getAppContext().getResources();
    this.a = localResources.getString(R.string.hibernation_force_stop_miui);
    String[] arrayOfString = new String[2];
    arrayOfString[0] = localResources.getString(R.string.app_auto_install_confirm);
    arrayOfString[1] = localResources.getString(R.string.app_auto_install_confirm_uppercase);
    this.b = new HashSet(Arrays.asList(arrayOfString));
  }

  public static b a()
  {
    if (c == null)
      c = new b();
    return c;
  }

  public final boolean a(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo = android.support.v4.app.b.a(paramAccessibilityNodeInfo, this.a);
    if (localAccessibilityNodeInfo != null)
      return android.support.v4.app.b.a(localAccessibilityNodeInfo, TaskEvent.Action.HIBERNATION_CLICK);
    return false;
  }

  public final boolean b(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    Iterator localIterator = this.b.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo = android.support.v4.app.b.a(paramAccessibilityNodeInfo, (String)localIterator.next());
      if (localAccessibilityNodeInfo == null)
        break label61;
      android.support.v4.app.b.a(localAccessibilityNodeInfo, TaskEvent.Action.HIBERNATION_CLICK);
    }
    label61: for (int j = 1; ; j = i)
    {
      i = j;
      break;
      return i;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.a.b
 * JD-Core Version:    0.6.0
 */