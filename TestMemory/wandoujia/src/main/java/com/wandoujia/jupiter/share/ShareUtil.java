package com.wandoujia.jupiter.share;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.volley.j;
import com.android.volley.k;
import com.tencent.mm.sdk.openapi.WXWebpageObject;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.ClipboardUtil;
import com.wandoujia.jupiter.activity.EntryWeiboActivity;
import com.wandoujia.jupiter.h;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public final class ShareUtil
{
  private static e a = new e();

  public static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    Bitmap localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    localCanvas.drawColor(-1);
    localCanvas.drawBitmap(paramBitmap, new Rect(0, 0, paramBitmap.getWidth(), paramBitmap.getHeight()), new Rect(0, 0, paramInt1, paramInt2), null);
    return localBitmap;
  }

  public static ShareInfo a(Context paramContext, SharePlatformEnum paramSharePlatformEnum, Model paramModel, ShareUtil.ShareContentType paramShareContentType)
  {
    ShareInfo localShareInfo = new ShareInfo();
    String str1 = "";
    String str2 = "";
    String str3 = "";
    String str4 = "";
    String str5 = a(paramShareContentType, paramModel);
    switch (d.b[paramShareContentType.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      localShareInfo.setTitle(str1);
      localShareInfo.setUrl(str2);
      localShareInfo.setDescription(str3);
      localShareInfo.setImageUrl(str4);
      return localShareInfo;
      str2 = c(str5, paramSharePlatformEnum.name());
      if (paramSharePlatformEnum == SharePlatformEnum.WEIBO)
      {
        String str8 = paramContext.getString(2131625417);
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = paramModel.F().title;
        arrayOfObject3[1] = str2;
        str3 = String.format(str8, arrayOfObject3);
        continue;
      }
      str1 = paramModel.F().title;
      str3 = paramModel.F().description;
      str4 = paramModel.i();
      continue;
      str2 = b(paramModel.b().review_name, paramSharePlatformEnum.name());
      if (paramSharePlatformEnum == SharePlatformEnum.WEIBO)
      {
        String str7 = paramContext.getString(2131625418);
        Object[] arrayOfObject2 = new Object[3];
        arrayOfObject2[0] = paramModel.n();
        arrayOfObject2[1] = paramModel.F().title;
        arrayOfObject2[2] = str2;
        str3 = String.format(str7, arrayOfObject2);
        continue;
      }
      str1 = paramModel.n();
      str3 = paramModel.F().editor_comment;
      str4 = paramModel.i();
      continue;
      str2 = a(paramModel.b().review_name, paramSharePlatformEnum.name());
      if (paramSharePlatformEnum == SharePlatformEnum.WEIBO)
      {
        String str6 = paramContext.getString(2131625419);
        Object[] arrayOfObject1 = new Object[3];
        arrayOfObject1[0] = paramModel.n();
        arrayOfObject1[1] = paramModel.q();
        arrayOfObject1[2] = str2;
        str3 = String.format(str6, arrayOfObject1);
        continue;
      }
      str1 = paramModel.n();
      str3 = paramModel.q();
      str4 = paramModel.i();
    }
  }

  public static String a(ShareUtil.ShareContentType paramShareContentType, Model paramModel)
  {
    switch (d.b[paramShareContentType.ordinal()])
    {
    default:
      return "";
    case 1:
      return paramModel.F().package_name;
    case 2:
    case 3:
    }
    return paramModel.b().review_name;
  }

  private static String a(String paramString1, String paramString2)
  {
    return String.format("http://www.wandoujia.com/reviews/topic/%1$s?utm_source=%2$s&utm_medium=share&utm_campaign=routine", new Object[] { paramString1, paramString2 });
  }

  public static void a(Context paramContext, Bitmap paramBitmap, String paramString)
  {
    Intent localIntent = new Intent(paramContext, EntryWeiboActivity.class);
    com.wandoujia.ripple_framework.navigation.b localb = (com.wandoujia.ripple_framework.navigation.b)h.k().a("holder");
    Bundle localBundle = new Bundle();
    localb.a(paramBitmap, "BITMAP", localBundle);
    localb.a(paramString, "CONTENT", localBundle);
    localIntent.putExtras(localBundle);
    if (!(paramContext instanceof Activity))
      localIntent.setFlags(268435456);
    paramContext.startActivity(localIntent);
  }

  public static void a(Context paramContext, ShareInfo paramShareInfo, SharePlatformEnum paramSharePlatformEnum, Model paramModel, ShareUtil.ShareContentType paramShareContentType)
  {
    int i = 0;
    switch (d.a[paramSharePlatformEnum.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    label387: String str1;
    do
    {
      return;
      if (!a.a())
        Toast.makeText(paramContext, 2131625414, 0).show();
      while (i == 0)
      {
        ((NavigationManager)h.k().a("navigation")).a(paramContext, "com.tencent.mm");
        return;
        i = 1;
      }
      if (TextUtils.isEmpty(paramShareInfo.getImageUrl()))
      {
        a(paramContext, paramSharePlatformEnum, paramModel, paramShareContentType, paramShareInfo, null);
        return;
      }
      ((com.wandoujia.image.b)h.k().a("image")).a(paramShareInfo.getImageUrl(), new a(paramContext, paramSharePlatformEnum, paramModel, paramShareContentType, paramShareInfo));
      return;
      if (!((AppManager)h.k().a("app")).h("com.tencent.mobileqq"))
        Toast.makeText(paramContext, 2131625413, 0).show();
      for (int j = 0; j == 0; j = 1)
      {
        ((NavigationManager)h.k().a("navigation")).a(paramContext, "com.tencent.mobileqq");
        return;
      }
      String str2 = paramShareInfo.getTitle();
      if (TextUtils.isEmpty(str2))
      {
        str2 = paramContext.getString(2131624296);
        if ((paramModel == null) || (TextUtils.isEmpty(paramModel.r())))
          break label387;
        str2 = paramModel.r();
      }
      while (true)
      {
        String str3 = paramShareInfo.getDescription();
        String str4 = android.support.v4.app.b.D(paramShareInfo.getImageUrl());
        String str5 = paramShareInfo.getUrl();
        com.tencent.tauth.c localc = com.tencent.tauth.c.a("100724372", paramContext.getApplicationContext());
        Bundle localBundle = new Bundle();
        localBundle.putString("title", str2);
        localBundle.putString("appName", GlobalConfig.getAppContext().getResources().getString(2131624296));
        localBundle.putString("summary", str3);
        localBundle.putString("targetUrl", str5);
        localBundle.putString("imageUrl", str4);
        localBundle.putInt("req_type", 1);
        localc.a((Activity)paramContext, localBundle, new c(str2));
        return;
        if ((paramModel != null) && (!TextUtils.isEmpty(paramModel.n())))
        {
          str2 = paramModel.n();
          continue;
        }
        if ((paramModel == null) || (paramModel.m() == null) || (TextUtils.isEmpty(paramModel.m().n())))
          continue;
        str2 = paramModel.m().n();
      }
      str1 = paramShareInfo.getUrl();
    }
    while (TextUtils.isEmpty(str1));
    ClipboardUtil.copyText(str1);
    Toast.makeText(paramContext, 2131624186, 0).show();
  }

  public static void a(Context paramContext, SharePlatformEnum paramSharePlatformEnum, Model paramModel, ShareUtil.ShareContentType paramShareContentType, ShareInfo paramShareInfo, Bitmap paramBitmap)
  {
    switch (d.a[paramSharePlatformEnum.ordinal()])
    {
    default:
      a(paramContext, paramModel, paramShareContentType);
      return;
    case 3:
      if (paramBitmap != null);
      for (Bitmap localBitmap = a(paramBitmap, paramBitmap.getWidth(), paramBitmap.getHeight()); ; localBitmap = null)
      {
        a(paramContext, localBitmap, paramShareInfo.getDescription());
        return;
      }
    case 1:
      if (paramBitmap == null)
        paramBitmap = BitmapFactory.decodeResource(paramContext.getResources(), 2130838369);
      byte[] arrayOfByte2 = com.tencent.mm.sdk.platformtools.c.a(a(paramBitmap, 100, 100));
      e locale2 = a;
      String str4 = paramShareInfo.getTitle();
      String str5 = paramShareInfo.getDescription();
      String str6 = paramShareInfo.getUrl();
      WXWebpageObject localWXWebpageObject2 = new WXWebpageObject();
      localWXWebpageObject2.webpageUrl = str6;
      locale2.b(str4, str5, arrayOfByte2, localWXWebpageObject2);
      return;
    case 2:
    }
    if (paramBitmap == null)
      paramBitmap = BitmapFactory.decodeResource(paramContext.getResources(), 2130838369);
    byte[] arrayOfByte1 = com.tencent.mm.sdk.platformtools.c.a(a(paramBitmap, 100, 100));
    e locale1 = a;
    String str1 = paramShareInfo.getTitle();
    String str2 = paramShareInfo.getDescription();
    String str3 = paramShareInfo.getUrl();
    WXWebpageObject localWXWebpageObject1 = new WXWebpageObject();
    localWXWebpageObject1.webpageUrl = str3;
    locale1.a(str1, str2, arrayOfByte1, localWXWebpageObject1);
  }

  public static void a(Context paramContext, Model paramModel, ShareUtil.ShareContentType paramShareContentType)
  {
    Intent localIntent = new Intent("android.intent.action.SEND");
    localIntent.setType("text/plain");
    localIntent.putExtra("android.intent.extra.SUBJECT", paramContext.getString(2131625405));
    String str;
    switch (d.b[paramShareContentType.ordinal()])
    {
    default:
      return;
    case 1:
      str = paramModel.F().title + ":" + c(a(paramShareContentType, paramModel), SharePlatformEnum.OTHERS.name());
    case 2:
    case 3:
    }
    while (true)
    {
      localIntent.putExtra("android.intent.extra.TEXT", str);
      List localList = paramContext.getPackageManager().queryIntentActivities(localIntent, 0);
      try
      {
        if (localList.size() <= 0)
          break;
        paramContext.startActivity(Intent.createChooser(localIntent, paramContext.getString(2131625405)));
        return;
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        Toast.makeText(paramContext, 2131625406, 0).show();
        return;
      }
      str = paramModel.n() + " - " + paramModel.F().title + ":" + b(a(paramShareContentType, paramModel), SharePlatformEnum.OTHERS.name());
      continue;
      str = paramModel.n() + ":" + a(a(paramShareContentType, paramModel), SharePlatformEnum.OTHERS.name());
    }
    paramContext.startActivity(localIntent);
  }

  public static void a(Model paramModel, SharePlatformEnum paramSharePlatformEnum, ShareUtil.ShareContentType paramShareContentType, k<ShareInfo> paramk, j paramj)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramShareContentType.name().toUpperCase();
    arrayOfObject[1] = a(paramShareContentType, paramModel);
    arrayOfObject[2] = paramSharePlatformEnum.name().toUpperCase();
    String str = String.format("http://startpage.wandoujia.com/five/v3/share?shareContentId=%1$s:%2$s&shareDstType=%3$s", arrayOfObject);
    ((com.wandoujia.nirvana.framework.network.a)com.wandoujia.ripple_framework.i.k().a("api_context")).a().a(new com.wandoujia.ripple_framework.a.a(str, ShareInfo.class, paramk, paramj, new com.wandoujia.gson.c()));
  }

  private static String b(String paramString1, String paramString2)
  {
    return String.format("http://www.wandoujia.com/reviews/item/%1$s?utm_source=%2$s&utm_medium=share&utm_campaign=routine", new Object[] { paramString1, paramString2 });
  }

  private static String c(String paramString1, String paramString2)
  {
    return String.format("http://apps.wandoujia.com/apps/%1$s?utm_source=%2$s&utm_medium=share&utm_campaign=routine", new Object[] { paramString1, paramString2 });
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.share.ShareUtil
 * JD-Core Version:    0.6.0
 */