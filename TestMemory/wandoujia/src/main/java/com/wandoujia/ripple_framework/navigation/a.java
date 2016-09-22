package com.wandoujia.ripple_framework.navigation;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.wandoujia.api.proto.Action;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.IntentUtils;
import com.wandoujia.ripple_framework.model.Model;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;

public class a
  implements com.wandoujia.ripple_framework.b.c
{
  private static Intent a(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      Intent localIntent = Intent.parseUri(paramString1, 1);
      List localList = IntentUtils.queryIntentActivities(paramContext, localIntent);
      if (!CollectionUtils.isEmpty(localList))
      {
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext())
        {
          if (!TextUtils.equals(((ResolveInfo)localIterator.next()).activityInfo.packageName, paramContext.getPackageName()))
            continue;
          localIntent.setPackage(paramContext.getPackageName());
        }
        if (!(paramContext instanceof Activity))
          localIntent.addFlags(268435456);
        a(localIntent, paramString1, paramString2);
        return localIntent;
      }
    }
    catch (URISyntaxException localURISyntaxException)
    {
    }
    return null;
  }

  public static void a(Context paramContext, String paramString1, String paramString2, Class<?> paramClass)
  {
    if (paramString1 == null);
    Intent localIntent;
    do
    {
      while (true)
      {
        return;
        Log.d("[Page Show]", "Go to " + paramString1, new Object[0]);
        boolean bool = TextUtils.isEmpty(paramString1);
        localIntent = null;
        if (bool)
          break;
        if (((paramContext instanceof c)) && (((c)paramContext).navigateTo(paramString1)))
          continue;
        localIntent = a(paramContext, paramString1, paramString2);
      }
      if ((localIntent != null) || (TextUtils.isEmpty(paramString2)))
        continue;
      localIntent = new Intent(paramContext, paramClass);
      a(localIntent, paramString1, paramString2);
    }
    while (localIntent == null);
    try
    {
      paramContext.startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
    }
  }

  private static void a(Intent paramIntent, String paramString1, String paramString2)
  {
    if (paramIntent == null);
    do
    {
      return;
      if (!TextUtils.isEmpty(paramString1))
        paramIntent.putExtra("page_intent_uri", paramString1);
      if (!TextUtils.isEmpty(paramString2))
        paramIntent.putExtra("page_api_url", paramString2);
      if (TextUtils.isEmpty(paramString1))
        continue;
      paramIntent.putExtra("page_intent_uri", paramString1);
    }
    while (TextUtils.isEmpty(null));
    paramIntent.putExtra("title", null);
  }

  public static boolean a(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null)
      return false;
    try
    {
      if (!(paramContext instanceof Activity))
        paramIntent.addFlags(268435456);
      paramContext.startActivity(paramIntent);
      return true;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static boolean a(Context paramContext, Action paramAction, String paramString)
  {
    if (paramAction.intent != null);
    Intent localIntent1;
    while (true)
    {
      try
      {
        Intent localIntent3 = Intent.parseUri(paramAction.intent, 1);
        localIntent1 = localIntent3;
        if ((localIntent1 == null) || (!IntentUtils.canHandleIntent(paramContext, localIntent1, paramString)))
          break;
        localIntent1.setPackage(paramString);
        if (!a(paramContext, localIntent1))
          break;
        return true;
      }
      catch (Exception localException3)
      {
      }
      localIntent1 = null;
    }
    if (paramAction.url != null);
    while (true)
    {
      try
      {
        localIntent2 = new Intent("android.intent.action.VIEW");
      }
      catch (Exception localException2)
      {
        try
        {
          localIntent2.setData(Uri.parse(paramAction.url));
          if ((localIntent2 == null) || (!IntentUtils.canHandleIntent(paramContext, localIntent2, paramString)))
            continue;
          localIntent2.setPackage(paramString);
          if (a(paramContext, localIntent2))
            break;
          if (localIntent1 == null)
            continue;
          localIntent1.setPackage(null);
          if (a(paramContext, localIntent1))
            break;
          if (localIntent2 == null)
            continue;
          localIntent2.setPackage(null);
          if (a(paramContext, localIntent2))
            break;
          return false;
          localException2 = localException2;
          localIntent2 = null;
          continue;
        }
        catch (Exception localException1)
        {
          continue;
        }
      }
      Intent localIntent2 = null;
    }
  }

  public void a()
  {
    throw new UnsupportedOperationException("Subclass must implement it!");
  }

  public void a(Context paramContext, View paramView, Model paramModel, int paramInt)
  {
    throw new UnsupportedOperationException("Subclass must implement it!");
  }

  public void a(Context paramContext, Action paramAction)
  {
    throw new UnsupportedOperationException("Subclass must implement it!");
  }

  public void a(Context paramContext, Model paramModel, View paramView)
  {
    throw new UnsupportedOperationException("Subclass must implement it!");
  }

  public void a(Context paramContext, String paramString, boolean paramBoolean)
  {
    throw new UnsupportedOperationException("Subclass must implement it!");
  }

  public Intent b(Context paramContext, String paramString1, String paramString2)
  {
    return a(paramContext, paramString1, paramString2);
  }

  public void b()
  {
    throw new UnsupportedOperationException("Subclass must implement it!");
  }

  public void b(Context paramContext, String paramString)
  {
    throw new UnsupportedOperationException("Subclass must implement it!");
  }

  public final void c()
  {
    throw new UnsupportedOperationException("Subclass must implement it!");
  }

  public void c(Context paramContext, String paramString)
  {
    throw new UnsupportedOperationException("Subclass must implement it!");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.navigation.a
 * JD-Core Version:    0.6.0
 */