package com.wandoujia.accessibility.hibernation.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.b;
import android.view.accessibility.AccessibilityNodeInfo;
import com.wandoujia.accessibility.hibernation.HibernationManager;
import com.wandoujia.accessibility.hibernation.i;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.ripple_framework.accessibility.R.string;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class a
  implements i
{
  private static a e;
  private final String a;
  private final String b;
  private final Set<String> c;
  private final Set<String> d;

  private a()
  {
    Resources localResources = GlobalConfig.getAppContext().getResources();
    this.a = (HibernationManager.b() + ":id/left_button");
    this.b = (HibernationManager.b() + ":id/right_button");
    String[] arrayOfString1 = new String[3];
    arrayOfString1[0] = localResources.getString(R.string.hibernation_force_stop);
    arrayOfString1[1] = localResources.getString(R.string.hibernation_force_stop_samsung);
    arrayOfString1[2] = localResources.getString(R.string.hibernation_force_stop_miui);
    this.c = new HashSet(Arrays.asList(arrayOfString1));
    String[] arrayOfString2 = new String[2];
    arrayOfString2[0] = localResources.getString(R.string.app_auto_install_confirm);
    arrayOfString2[1] = localResources.getString(R.string.app_auto_install_confirm_uppercase);
    this.d = new HashSet(Arrays.asList(arrayOfString2));
  }

  @TargetApi(18)
  private AccessibilityNodeInfo a(AccessibilityNodeInfo paramAccessibilityNodeInfo, String paramString)
  {
    List localList = paramAccessibilityNodeInfo.findAccessibilityNodeInfosByViewId(paramString);
    Iterator localIterator1 = localList.iterator();
    Object localObject2;
    for (Object localObject1 = null; ; localObject1 = localObject2)
    {
      if (localIterator1.hasNext())
      {
        localObject2 = (AccessibilityNodeInfo)localIterator1.next();
        Iterator localIterator2 = this.c.iterator();
        while (localIterator2.hasNext())
        {
          if (!((String)localIterator2.next()).equals(((AccessibilityNodeInfo)localObject2).getText().toString()))
            continue;
          localList.remove(localObject2);
        }
      }
      while (localObject2 != null)
      {
        localObject1 = localObject2;
        while (localList.size() > 0)
          ((AccessibilityNodeInfo)localList.remove(-1 + localList.size())).recycle();
        return localObject1;
        localObject2 = localObject1;
      }
    }
  }

  public static a a()
  {
    if (e == null)
      e = new a();
    return e;
  }

  public final boolean a(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    boolean bool = SystemUtil.aboveApiLevel(18);
    AccessibilityNodeInfo localAccessibilityNodeInfo = null;
    if (bool)
    {
      localAccessibilityNodeInfo = a(paramAccessibilityNodeInfo, this.b);
      if (localAccessibilityNodeInfo == null)
      {
        localAccessibilityNodeInfo = a(paramAccessibilityNodeInfo, this.a);
        if (localAccessibilityNodeInfo != null);
      }
    }
    else if (SystemUtil.aboveApiLevel(16))
    {
      Iterator localIterator = this.c.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        localAccessibilityNodeInfo = b.a(paramAccessibilityNodeInfo, (String)localIterator.next());
      }
      while (localAccessibilityNodeInfo == null);
    }
    if (localAccessibilityNodeInfo == null)
      return false;
    return b.a(localAccessibilityNodeInfo, TaskEvent.Action.HIBERNATION_CLICK);
  }

  public final boolean b(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    Iterator localIterator = this.d.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo = b.a(paramAccessibilityNodeInfo, (String)localIterator.next());
      if (localAccessibilityNodeInfo == null)
        break label61;
      b.a(localAccessibilityNodeInfo, TaskEvent.Action.HIBERNATION_CLICK);
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
 * Qualified Name:     com.wandoujia.accessibility.hibernation.a.a
 * JD-Core Version:    0.6.0
 */