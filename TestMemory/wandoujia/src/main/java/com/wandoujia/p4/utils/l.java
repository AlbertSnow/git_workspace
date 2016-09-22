package com.wandoujia.p4.utils;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.wandoujia.image.b;
import com.wandoujia.jupiter.h;
import com.wandoujia.p4.campaign.v;
import com.wandoujia.p4.search.utils.SearchConst.ShareType;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.util.AppUtils;
import java.io.File;

public final class l
{
  private static final String a = i.k().c() + "/.cache/share/";

  public static void a(Context paramContext, SearchConst.ShareType paramShareType, com.wandoujia.p4.model.a parama)
  {
    if (AppUtils.a(com.wandoujia.p4.a.a(), paramShareType.getPackageName()) == null)
      Toast.makeText(paramContext, 2131625406, 0).show();
    String str;
    File localFile1;
    File localFile2;
    do
    {
      return;
      str = parama.c();
      localFile1 = new File(a, String.valueOf(str.hashCode()));
      if (localFile1.exists())
      {
        b(paramContext, paramShareType, parama, Uri.fromFile(localFile1));
        return;
      }
      localFile2 = new File(a);
    }
    while ((!localFile2.exists()) && (!localFile2.mkdirs()));
    ((b)i.k().a("image")).a(str, new m(localFile1, paramContext, paramShareType, parama));
  }

  private static void b(Context paramContext, SearchConst.ShareType paramShareType, com.wandoujia.p4.model.a parama, Uri paramUri)
  {
    if (SearchConst.ShareType.WECHAT == paramShareType)
    {
      if (TextUtils.isEmpty(parama.d()));
      for (String str5 = "http://www.wandoujia.com"; ; str5 = parama.d())
      {
        String str6 = parama.a();
        String str7 = parama.b();
        v.a();
        v.a(str5, str6, str7, paramUri);
        return;
      }
    }
    if (SearchConst.ShareType.WECHAT_TIMELINE == paramShareType)
    {
      if (TextUtils.isEmpty(parama.d()));
      for (String str2 = "http://www.wandoujia.com"; ; str2 = parama.d())
      {
        String str3 = parama.a();
        String str4 = parama.b();
        v.a();
        v.b(str2, str3, str4, paramUri);
        return;
      }
    }
    if (SearchConst.ShareType.SINA_WEIBO == paramShareType)
    {
      ((b)h.k().a("image")).a(parama.c(), new n(paramContext, parama));
      return;
    }
    String str1 = parama.b();
    if (!TextUtils.isEmpty(parama.d()))
      str1 = str1 + " " + parama.d();
    Intent localIntent = new Intent("android.intent.action.SEND");
    localIntent.setType("image/*");
    localIntent.putExtra("android.intent.extra.TEXT", str1);
    localIntent.putExtra("android.intent.extra.STREAM", paramUri);
    localIntent.setPackage(paramShareType.getPackageName());
    try
    {
      paramContext.startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      Toast.makeText(paramContext, 2131625406, 0).show();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.utils.l
 * JD-Core Version:    0.6.0
 */