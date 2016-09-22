package com.wandoujia.accessibility;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.accessibility.AccessibilityEvent;
import com.wandoujia.accessibility.autoinstall.c;
import com.wandoujia.accessibility.hibernation.HibernationManager;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.toolkit.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AccessibilityDispatcher extends AccessibilityService
{
  private static final List<i> a = new ArrayList();
  private static final List<j> b = new ArrayList();

  public AccessibilityDispatcher()
  {
    a.add(new com.wandoujia.accessibility.autoinstall.a());
    a.add(new c());
    a.add(new com.wandoujia.accessibility.hibernation.a());
  }

  public static void a(j paramj)
  {
    synchronized (b)
    {
      if (!b.contains(paramj))
        b.add(paramj);
      return;
    }
  }

  public static void b(j paramj)
  {
    synchronized (b)
    {
      if (b.contains(paramj))
        b.remove(paramj);
      return;
    }
  }

  public void onAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
      ((i)localIterator.next()).a(paramAccessibilityEvent, this);
  }

  public void onInterrupt()
  {
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
      localIterator.next();
  }

  protected void onServiceConnected()
  {
    AccessibilityServiceInfo localAccessibilityServiceInfo = getServiceInfo();
    HashSet localHashSet = new HashSet();
    Iterator localIterator1 = a.iterator();
    while (localIterator1.hasNext())
    {
      Set localSet = ((i)localIterator1.next()).c();
      if (localSet == null)
        continue;
      localHashSet.addAll(localSet);
    }
    ComponentName localComponentName = HibernationManager.a(getApplicationContext());
    if (localComponentName != null)
      localHashSet.add(localComponentName.getPackageName());
    localAccessibilityServiceInfo.packageNames = ((String[])localHashSet.toArray(new String[localHashSet.size()]));
    setServiceInfo(localAccessibilityServiceInfo);
    Iterator localIterator2 = a.iterator();
    while (localIterator2.hasNext())
      ((i)localIterator2.next()).b();
    com.wandoujia.accessibility.a.a.b(true);
    Intent localIntent = new Intent("com.wandoujia.accessibility.state.change");
    localIntent.putExtra("extra_service_state", AccessibilityManager.ServiceState.BIND.name());
    GlobalConfig.getAppContext().sendBroadcast(localIntent);
    Iterator localIterator3 = b.iterator();
    while (localIterator3.hasNext())
      ((j)localIterator3.next()).a();
    TaskEvent.Builder localBuilder = new TaskEvent.Builder().action(TaskEvent.Action.ACCESSIBILITY_BIND).status(TaskEvent.Status.START).result(TaskEvent.Result.SUCCESS);
    v.b().a(localBuilder, new ExtraPackage.Builder());
  }

  public boolean onUnbind(Intent paramIntent)
  {
    Iterator localIterator1 = a.iterator();
    while (localIterator1.hasNext())
      ((i)localIterator1.next()).a();
    com.wandoujia.accessibility.a.a.b(false);
    Intent localIntent = new Intent("com.wandoujia.accessibility.state.change");
    localIntent.putExtra("extra_service_state", AccessibilityManager.ServiceState.UNBIND.name());
    GlobalConfig.getAppContext().sendBroadcast(localIntent);
    Iterator localIterator2 = b.iterator();
    while (localIterator2.hasNext())
      localIterator2.next();
    TaskEvent.Builder localBuilder = new TaskEvent.Builder().action(TaskEvent.Action.ACCESSIBILITY_UNBIND).status(TaskEvent.Status.END).result(TaskEvent.Result.SUCCESS);
    v.b().a(localBuilder, new ExtraPackage.Builder());
    return super.onUnbind(paramIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.AccessibilityDispatcher
 * JD-Core Version:    0.6.0
 */