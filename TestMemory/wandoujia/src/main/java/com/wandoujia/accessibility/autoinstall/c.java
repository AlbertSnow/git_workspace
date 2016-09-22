package com.wandoujia.accessibility.autoinstall;

import android.accessibilityservice.AccessibilityService;
import android.support.v4.app.b;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.wandoujia.accessibility.i;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class c
  implements i
{
  public final void a()
  {
  }

  public final void a(AccessibilityEvent paramAccessibilityEvent, AccessibilityService paramAccessibilityService)
  {
    if (!"com.xiaomi.gamecenter".equals(paramAccessibilityEvent.getPackageName()));
    while (true)
    {
      return;
      AccessibilityNodeInfo localAccessibilityNodeInfo1 = paramAccessibilityEvent.getSource();
      if ((localAccessibilityNodeInfo1 == null) || (localAccessibilityNodeInfo1.getPackageName() == null))
        continue;
      AccessibilityNodeInfo localAccessibilityNodeInfo2 = paramAccessibilityService.getRootInActiveWindow();
      if ((localAccessibilityNodeInfo2 == null) || (TextUtils.isEmpty(b.b(localAccessibilityNodeInfo2))))
        continue;
      Iterator localIterator = localAccessibilityNodeInfo2.findAccessibilityNodeInfosByViewId("com.xiaomi.gamecenter:id/replace_btn_install_oldpkg").iterator();
      while (localIterator.hasNext())
        b.a((AccessibilityNodeInfo)localIterator.next(), TaskEvent.Action.AUTO_INSTALL_CLICK);
    }
  }

  public final void b()
  {
  }

  public final Set<String> c()
  {
    return new HashSet(Arrays.asList(new String[] { "com.xiaomi.gamecenter" }));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.autoinstall.c
 * JD-Core Version:    0.6.0
 */