package com.wandoujia.accessibility.hibernation;

import android.accessibilityservice.AccessibilityService;
import android.annotation.TargetApi;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.wandoujia.accessibility.hibernation.a.b;
import com.wandoujia.base.utils.SystemUtil;
import java.util.HashSet;
import java.util.Set;

public final class a
  implements com.wandoujia.accessibility.i
{
  private static Set<Integer> a = new HashSet();

  public static void d()
  {
    a.clear();
  }

  public final void a()
  {
  }

  @TargetApi(16)
  public final void a(AccessibilityEvent paramAccessibilityEvent, AccessibilityService paramAccessibilityService)
  {
    if (!HibernationManager.a().f());
    AccessibilityNodeInfo localAccessibilityNodeInfo2;
    do
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo1;
      do
      {
        do
          return;
        while ((!HibernationManager.b().equals(paramAccessibilityEvent.getPackageName())) || (a.contains(Integer.valueOf(paramAccessibilityEvent.getWindowId()))));
        localAccessibilityNodeInfo1 = paramAccessibilityEvent.getSource();
      }
      while ((localAccessibilityNodeInfo1 == null) || (localAccessibilityNodeInfo1.getPackageName() == null));
      localAccessibilityNodeInfo2 = paramAccessibilityService.getRootInActiveWindow();
    }
    while (localAccessibilityNodeInfo2 == null);
    try
    {
      if (localAccessibilityNodeInfo2.getPackageName() == null)
        throw new NullPointerException();
      b localb;
      if (SystemUtil.isMIUI())
        localb = b.a();
      com.wandoujia.accessibility.hibernation.a.a locala;
      for (Object localObject = localb; ((i)localObject).a(localAccessibilityNodeInfo2); localObject = locala)
      {
        a.add(Integer.valueOf(paramAccessibilityEvent.getWindowId()));
        return;
        locala = com.wandoujia.accessibility.hibernation.a.a.a();
      }
      ((i)localObject).b(localAccessibilityNodeInfo2);
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
    }
  }

  public final void b()
  {
  }

  public final Set<String> c()
  {
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.a
 * JD-Core Version:    0.6.0
 */