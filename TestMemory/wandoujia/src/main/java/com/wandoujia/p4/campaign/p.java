package com.wandoujia.p4.campaign;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.i;
import com.wandoujia.api.proto.HttpResponse;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.jupiter.j;
import com.wandoujia.nirvana.framework.network.a;
import com.wandoujia.p4.search.utils.SearchConst.ShareType;
import com.wandoujia.ripple_framework.a.b;
import java.net.URISyntaxException;

public final class p
{
  private static Handler a = new Handler(Looper.getMainLooper());

  static void a(Context paramContext, String paramString)
  {
    com.wandoujia.jupiter.view.p.a(paramContext, paramString, com.wandoujia.jupiter.view.p.b).a();
  }

  static void a(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      Intent localIntent = new Intent("android.intent.action.SEND");
      localIntent.setType("text/plain");
      localIntent.putExtra("android.intent.extra.SUBJECT", paramString1);
      localIntent.putExtra("android.intent.extra.TEXT", paramString2);
      paramContext.startActivity(Intent.createChooser(localIntent, paramString1));
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      com.wandoujia.jupiter.view.p.a(paramContext, 2131625181, com.wandoujia.jupiter.view.p.b).a();
    }
  }

  static void a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    new Handler(Looper.getMainLooper()).post(new s(paramString1, paramString3, paramString2, paramString4, paramInt, paramContext));
  }

  static void a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    try
    {
      SearchConst.ShareType localShareType = SearchConst.ShareType.valueOf(paramString5);
      q localq = new q(paramString2, paramString1, paramString3, paramString4);
      a.post(new r(paramContext, localShareType, localq));
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
    }
  }

  static boolean a(String paramString)
  {
    if (!AppManager.a().h(paramString))
      return false;
    AppManager.a();
    AppManager.b(paramString);
    return true;
  }

  static int b(String paramString)
  {
    LocalAppInfo localLocalAppInfo = AppManager.a().f(paramString);
    if (localLocalAppInfo != null)
      return localLocalAppInfo.getVersionCode();
    return 0;
  }

  static void b(Context paramContext, String paramString)
  {
    if (!TextUtils.isEmpty(paramString));
    try
    {
      paramContext.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)));
      return;
      com.wandoujia.jupiter.view.p.a(paramContext, 2131624979, com.wandoujia.jupiter.view.p.b).a();
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
    }
  }

  static String c(String paramString)
  {
    LocalAppInfo localLocalAppInfo = AppManager.a().f(paramString);
    if (localLocalAppInfo != null)
      return localLocalAppInfo.getVersionName();
    return null;
  }

  static void c(Context paramContext, String paramString)
  {
    try
    {
      Intent localIntent = Intent.parseUri("wdj://apps/" + paramString, 1);
      if (localIntent != null)
        paramContext.startActivity(localIntent);
      return;
    }
    catch (URISyntaxException localURISyntaxException)
    {
    }
  }

  public static void d(Context paramContext, String paramString)
  {
    b localb = new b(String.format("http://apis.wandoujia.com/apps/v1/%s", new Object[] { paramString }), null, HttpResponse.class, new t(paramContext), new u(), 0);
    ((a)j.a().a("api_context")).a().a(localb);
  }

  static void e(Context paramContext, String paramString)
  {
    if (!TextUtils.isEmpty(paramString));
    try
    {
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setData(Uri.parse("market://details?id=" + paramString));
      paramContext.startActivity(localIntent);
      return;
      com.wandoujia.jupiter.view.p.a(paramContext, 2131624978, com.wandoujia.jupiter.view.p.b).a();
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.campaign.p
 * JD-Core Version:    0.6.0
 */