package com.google.android.gms.ads.internal.gmsg;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.util.y;
import com.google.android.gms.ads.internal.webview.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ah
{
  final b a;

  public ah(b paramb)
  {
    this.a = paramb;
  }

  public static Intent a(Intent paramIntent, ResolveInfo paramResolveInfo)
  {
    Intent localIntent = new Intent(paramIntent);
    localIntent.setClassName(paramResolveInfo.activityInfo.packageName, paramResolveInfo.activityInfo.name);
    return localIntent;
  }

  public static Intent a(Uri paramUri)
  {
    if (paramUri == null)
      return null;
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.addFlags(268435456);
    localIntent.setData(paramUri);
    localIntent.setAction("android.intent.action.VIEW");
    return localIntent;
  }

  public static ResolveInfo a(Context paramContext, Intent paramIntent, ArrayList paramArrayList)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    if (localPackageManager == null)
      return null;
    List localList = localPackageManager.queryIntentActivities(paramIntent, 65536);
    ResolveInfo localResolveInfo1 = localPackageManager.resolveActivity(paramIntent, 65536);
    int i;
    if ((localList != null) && (localResolveInfo1 != null))
    {
      i = 0;
      if (i < localList.size())
      {
        ResolveInfo localResolveInfo3 = (ResolveInfo)localList.get(i);
        if ((localResolveInfo1 == null) || (!localResolveInfo1.activityInfo.name.equals(localResolveInfo3.activityInfo.name)));
      }
    }
    for (ResolveInfo localResolveInfo2 = localResolveInfo1; ; localResolveInfo2 = null)
    {
      paramArrayList.addAll(localList);
      return localResolveInfo2;
      i++;
      break;
    }
  }

  public final Intent a(Context paramContext, Map paramMap)
  {
    ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
    String str = (String)paramMap.get("u");
    boolean bool1 = TextUtils.isEmpty(str);
    Intent localIntent1 = null;
    if (bool1)
      return localIntent1;
    if (this.a != null)
      str = bc.a().e.a(this.a, str);
    Uri localUri1 = Uri.parse(str);
    boolean bool2 = Boolean.parseBoolean((String)paramMap.get("use_first_package"));
    boolean bool3 = Boolean.parseBoolean((String)paramMap.get("use_running_process"));
    Uri localUri2;
    if ("http".equalsIgnoreCase(localUri1.getScheme()))
      localUri2 = localUri1.buildUpon().scheme("https").build();
    while (true)
    {
      ArrayList localArrayList = new ArrayList();
      Intent localIntent2 = a(localUri1);
      Intent localIntent3 = a(localUri2);
      ResolveInfo localResolveInfo1 = a(paramContext, localIntent2, localArrayList);
      if (localResolveInfo1 != null)
      {
        return a(localIntent2, localResolveInfo1);
        if ("https".equalsIgnoreCase(localUri1.getScheme()))
        {
          localUri2 = localUri1.buildUpon().scheme("http").build();
          continue;
        }
      }
      else
      {
        if (localIntent3 != null)
        {
          ResolveInfo localResolveInfo3 = a(paramContext, localIntent3);
          if (localResolveInfo3 != null)
          {
            localIntent1 = a(localIntent2, localResolveInfo3);
            if (a(paramContext, localIntent1) != null)
              break;
          }
        }
        if (localArrayList.size() == 0)
          return localIntent2;
        if ((bool3) && (localActivityManager != null))
        {
          List localList = localActivityManager.getRunningAppProcesses();
          if (localList != null)
          {
            Iterator localIterator1 = localArrayList.iterator();
            while (true)
              while (true)
                if (localIterator1.hasNext())
                {
                  ResolveInfo localResolveInfo2 = (ResolveInfo)localIterator1.next();
                  Iterator localIterator2 = localList.iterator();
                  if (!localIterator2.hasNext())
                    continue;
                  if (!((ActivityManager.RunningAppProcessInfo)localIterator2.next()).processName.equals(localResolveInfo2.activityInfo.packageName))
                    break;
                  return a(localIntent2, localResolveInfo2);
                }
          }
        }
        if (bool2)
          return a(localIntent2, (ResolveInfo)localArrayList.get(0));
        return localIntent2;
      }
      localUri2 = null;
    }
  }

  public final ResolveInfo a(Context paramContext, Intent paramIntent)
  {
    return a(paramContext, paramIntent, new ArrayList());
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.ah
 * JD-Core Version:    0.6.0
 */