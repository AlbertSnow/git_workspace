package com.wandoujia.p4.campaign;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;
import com.tencent.mm.sdk.openapi.WXMediaMessage;
import com.tencent.mm.sdk.openapi.WXWebpageObject;
import com.tencent.mm.sdk.openapi.d;
import com.tencent.mm.sdk.openapi.h;
import com.tencent.mm.sdk.openapi.k;
import com.tencent.mm.sdk.openapi.l;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.ImageUtil;
import com.wandoujia.p4.a;

public final class v
{
  private static String c;
  private static WebView d;
  private static v e;
  private d a;
  private Context b;

  private v(Context paramContext)
  {
    this.b = paramContext;
    this.a = k.a(this.b, "wxed6dfca0ae67f7a3");
    boolean bool = this.a.a("wxed6dfca0ae67f7a3");
    Log.d("weixin", "WeixinAPI register result:" + bool, new Object[0]);
  }

  private static WXMediaMessage a(String paramString1, String paramString2, Bitmap paramBitmap, l paraml)
  {
    WXMediaMessage localWXMediaMessage = new WXMediaMessage();
    if (!TextUtils.isEmpty(paramString1))
      localWXMediaMessage.title = paramString1;
    if (!TextUtils.isEmpty(paramString2))
      localWXMediaMessage.description = paramString2;
    if (paramBitmap != null)
      localWXMediaMessage.setThumbImage(paramBitmap);
    localWXMediaMessage.mediaObject = paraml;
    return localWXMediaMessage;
  }

  public static v a()
  {
    Context localContext = a.a();
    if (e == null)
      e = new v(localContext);
    return e;
  }

  public static void a(WebView paramWebView)
  {
    d = paramWebView;
  }

  public static void a(String paramString)
  {
    c = paramString;
  }

  public static void a(String paramString1, String paramString2, String paramString3, Uri paramUri)
  {
    if (!d().a())
    {
      Toast.makeText(a.a(), 2131625406, 0).show();
      return;
    }
    WXWebpageObject localWXWebpageObject = new WXWebpageObject();
    localWXWebpageObject.webpageUrl = paramString1;
    h localh = new h();
    localh.a = ("wandoujia" + String.valueOf(System.currentTimeMillis()));
    String str = paramUri.getPath();
    Bitmap.Config[] arrayOfConfig = new Bitmap.Config[1];
    arrayOfConfig[0] = Bitmap.Config.ARGB_8888;
    localh.b = a(paramString2, paramString3, ImageUtil.decodeBitmap(str, 160, 160, arrayOfConfig), localWXWebpageObject);
    if (d().b() >= 553779201)
      localh.c = 0;
    d().a(localh);
  }

  public static WebView b()
  {
    return d;
  }

  public static void b(String paramString1, String paramString2, String paramString3, Uri paramUri)
  {
    if (!d().a())
    {
      Toast.makeText(a.a(), 2131625406, 0).show();
      return;
    }
    if (d().b() < 553779201)
    {
      Toast.makeText(a.a(), 2131625765, 0).show();
      return;
    }
    WXWebpageObject localWXWebpageObject = new WXWebpageObject();
    localWXWebpageObject.webpageUrl = paramString1;
    h localh = new h();
    localh.a = ("wandoujia" + String.valueOf(System.currentTimeMillis()));
    String str = paramUri.getPath();
    Bitmap.Config[] arrayOfConfig = new Bitmap.Config[1];
    arrayOfConfig[0] = Bitmap.Config.ARGB_8888;
    localh.b = a(paramString2, paramString3, ImageUtil.decodeBitmap(str, 160, 160, arrayOfConfig), localWXWebpageObject);
    if (d().b() >= 553779201)
      localh.c = 1;
    d().a(localh);
  }

  public static String c()
  {
    return c;
  }

  private static d d()
  {
    if (e != null)
      return e.a;
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.campaign.v
 * JD-Core Version:    0.6.0
 */