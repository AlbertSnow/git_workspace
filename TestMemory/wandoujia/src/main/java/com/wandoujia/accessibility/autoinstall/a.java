package com.wandoujia.accessibility.autoinstall;

import android.accessibilityservice.AccessibilityService;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.wandoujia.accessibility.i;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.SystemUtil;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class a
  implements i
{
  private static PowerManager.WakeLock a;
  private static final Set<String> d = new HashSet();
  private b b;
  private final Set<String> c = new HashSet(Arrays.asList(new String[] { "com.android.packageinstaller", "com.google.android.packageinstaller", "com.lenovo.safecenter", "com.lenovo.security" }));

  public static void a(String paramString)
  {
    synchronized (d)
    {
      d.remove(paramString);
      return;
    }
  }

  public static void a(Set<String> paramSet)
  {
    synchronized (d)
    {
      Iterator localIterator = paramSet.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (d.contains(str))
          continue;
        d.add(str);
      }
    }
    monitorexit;
  }

  public static Set<String> d()
  {
    synchronized (d)
    {
      HashSet localHashSet = new HashSet(d);
      return localHashSet;
    }
  }

  public final void a()
  {
    com.wandoujia.accessibility.a.a.c(true);
  }

  @TargetApi(16)
  public final void a(AccessibilityEvent paramAccessibilityEvent, AccessibilityService paramAccessibilityService)
  {
    if (!com.wandoujia.accessibility.a.a.h());
    label6: AccessibilityNodeInfo localAccessibilityNodeInfo2;
    String str;
    do
    {
      do
      {
        AccessibilityNodeInfo localAccessibilityNodeInfo1;
        do
        {
          do
          {
            break label6;
            break label6;
            do
              return;
            while ((!SystemUtil.aboveApiLevel(16)) || (!this.c.contains(paramAccessibilityEvent.getPackageName())));
            localAccessibilityNodeInfo1 = paramAccessibilityEvent.getSource();
          }
          while ((localAccessibilityNodeInfo1 == null) || (localAccessibilityNodeInfo1.getPackageName() == null));
          localAccessibilityNodeInfo2 = paramAccessibilityService.getRootInActiveWindow();
        }
        while ((localAccessibilityNodeInfo2 == null) || (!localAccessibilityNodeInfo2.getPackageName().equals(paramAccessibilityEvent.getPackageName())));
        if (this.b == null)
          this.b = android.support.v4.app.b.a(localAccessibilityNodeInfo1);
        if (a == null)
          a = ((PowerManager)GlobalConfig.getAppContext().getSystemService("power")).newWakeLock(268435462, "AUTO_INSTALL_WAKE_LOCK");
        a.acquire(300000L);
      }
      while (!this.b.a(paramAccessibilityEvent));
      str = android.support.v4.app.b.b(localAccessibilityNodeInfo2);
    }
    while ((this.b.a(localAccessibilityNodeInfo2)) || (this.b.b(localAccessibilityNodeInfo2)) || (TextUtils.isEmpty(str)) || (this.b.c(localAccessibilityNodeInfo2)) || (this.b.d(localAccessibilityNodeInfo2)));
    this.b.a(localAccessibilityNodeInfo2, str);
  }

  public final void b()
  {
    com.wandoujia.accessibility.a.a.c(false);
  }

  public final Set<String> c()
  {
    return this.c;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.autoinstall.a
 * JD-Core Version:    0.6.0
 */