package com.tencent.connect.c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.connect.common.e;
import com.tencent.open.utils.o;
import java.io.File;

public final class a extends com.tencent.connect.common.b
{
  private String b = "";

  public a(com.tencent.connect.b.c paramc)
  {
    super(paramc, 0);
  }

  private void b(Activity paramActivity, Bundle paramBundle, com.tencent.tauth.b paramb)
  {
    com.tencent.open.a.f.c("openSDK_LOG.QQShare", "doShareToQQ() -- start");
    StringBuffer localStringBuffer = new StringBuffer("mqqapi://share/to_fri?src_type=app&version=1&file_type=news");
    String str1 = paramBundle.getString("imageUrl");
    String str2 = paramBundle.getString("title");
    String str3 = paramBundle.getString("summary");
    String str4 = paramBundle.getString("targetUrl");
    String str5 = paramBundle.getString("audio_url");
    int i = paramBundle.getInt("req_type", 1);
    int j = paramBundle.getInt("cflag", 0);
    String str6 = paramBundle.getString("share_qq_ext_str");
    String str7 = o.b(paramActivity);
    if (str7 == null)
      str7 = paramBundle.getString("appName");
    String str8 = paramBundle.getString("imageLocalUrl");
    String str9 = this.a.b();
    String str10 = this.a.d();
    com.tencent.open.a.f.a("openSDK_LOG.QQShare", "doShareToQQ -- openid: " + str10);
    if (!TextUtils.isEmpty(str1))
      localStringBuffer.append("&image_url=" + Base64.encodeToString(o.j(str1), 2));
    if (!TextUtils.isEmpty(str8))
      localStringBuffer.append("&file_data=" + Base64.encodeToString(o.j(str8), 2));
    if (!TextUtils.isEmpty(str2))
      localStringBuffer.append("&title=" + Base64.encodeToString(o.j(str2), 2));
    if (!TextUtils.isEmpty(str3))
      localStringBuffer.append("&description=" + Base64.encodeToString(o.j(str3), 2));
    if (!TextUtils.isEmpty(str9))
      localStringBuffer.append("&share_id=" + str9);
    if (!TextUtils.isEmpty(str4))
      localStringBuffer.append("&url=" + Base64.encodeToString(o.j(str4), 2));
    if (!TextUtils.isEmpty(str7))
    {
      if (str7.length() > 20)
        str7 = str7.substring(0, 20) + "...";
      localStringBuffer.append("&app_name=" + Base64.encodeToString(o.j(str7), 2));
    }
    if (!TextUtils.isEmpty(str10))
      localStringBuffer.append("&open_id=" + Base64.encodeToString(o.j(str10), 2));
    if (!TextUtils.isEmpty(str5))
      localStringBuffer.append("&audioUrl=" + Base64.encodeToString(o.j(str5), 2));
    localStringBuffer.append("&req_type=" + Base64.encodeToString(o.j(String.valueOf(i)), 2));
    if (!TextUtils.isEmpty(str6))
      localStringBuffer.append("&share_qq_ext_str=" + Base64.encodeToString(o.j(str6), 2));
    localStringBuffer.append("&cflag=" + Base64.encodeToString(o.j(String.valueOf(j)), 2));
    com.tencent.open.a.f.a("openSDK_LOG.QQShare", "doShareToQQ -- url: " + localStringBuffer.toString());
    com.tencent.connect.a.a.a(android.support.v4.app.b.t(), this.a, "requireApi", new String[] { "shareToNativeQQ" });
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse(localStringBuffer.toString()));
    localIntent.putExtra("pkg_name", paramActivity.getPackageName());
    if (android.support.v4.app.b.f(paramActivity, "4.6.0") < 0)
    {
      com.tencent.open.a.f.c("openSDK_LOG.QQShare", "doShareToQQ, qqver below 4.6.");
      if (android.support.v4.app.b.b(android.support.v4.app.b.t(), localIntent))
      {
        e.a().a(11103, paramb);
        a(paramActivity, localIntent, 11103);
      }
      if (!android.support.v4.app.b.b(android.support.v4.app.b.t(), localIntent))
        break label899;
      com.tencent.open.b.d.a();
      com.tencent.open.b.d.a(this.a.d(), this.a.b(), "ANDROIDQQ.SHARETOQQ.XX", "10", "3", "0", this.b, "0", "1", "0");
      com.tencent.open.b.d.a();
      com.tencent.open.b.d.a(0, "SHARE_CHECK_SDK", "1000", this.a.b(), "0", Long.valueOf(SystemClock.elapsedRealtime()), "");
    }
    while (true)
    {
      com.tencent.open.a.f.c("openSDK_LOG.QQShare", "doShareToQQ() --end");
      return;
      com.tencent.open.a.f.c("openSDK_LOG.QQShare", "doShareToQQ, qqver greater than 4.6.");
      if (e.a().a("shareToQQ", paramb) != null)
        com.tencent.open.a.f.c("openSDK_LOG.QQShare", "doShareToQQ, last listener is not null, cancel it.");
      if (!android.support.v4.app.b.b(android.support.v4.app.b.t(), localIntent))
        break;
      a(paramActivity, 10103, localIntent, true);
      break;
      label899: com.tencent.open.b.d.a();
      com.tencent.open.b.d.a(this.a.d(), this.a.b(), "ANDROIDQQ.SHARETOQQ.XX", "10", "3", "1", this.b, "0", "1", "0");
      com.tencent.open.b.d.a();
      com.tencent.open.b.d.a(1, "SHARE_CHECK_SDK", "1000", this.a.b(), "0", Long.valueOf(SystemClock.elapsedRealtime()), "hasActivityForIntent fail");
    }
  }

  public final void a(Activity paramActivity, Bundle paramBundle, com.tencent.tauth.b paramb)
  {
    com.tencent.open.a.f.c("openSDK_LOG.QQShare", "shareToQQ() -- start.");
    String str1 = paramBundle.getString("imageUrl");
    String str2 = paramBundle.getString("title");
    String str3 = paramBundle.getString("summary");
    String str4 = paramBundle.getString("targetUrl");
    String str5 = paramBundle.getString("imageLocalUrl");
    int i = paramBundle.getInt("req_type", 1);
    com.tencent.open.a.f.c("openSDK_LOG.QQShare", "shareToQQ -- type: " + i);
    switch (i)
    {
    case 3:
    case 4:
    default:
    case 1:
    case 2:
    case 5:
    case 6:
    }
    while (i == 6)
    {
      if (android.support.v4.app.b.f(paramActivity, "5.0.0") < 0)
      {
        paramb.a(new com.tencent.tauth.d(-15, "手Q版本过低，应用分享只支持手Q5.0及其以上版本"));
        com.tencent.open.a.f.e("openSDK_LOG.QQShare", "shareToQQ, app share is not support below qq5.0.");
        com.tencent.open.b.d.a();
        com.tencent.open.b.d.a(1, "SHARE_CHECK_SDK", "1000", this.a.b(), "0", Long.valueOf(SystemClock.elapsedRealtime()), "shareToQQ, app share is not support below qq5.0.");
        return;
        this.b = "1";
        continue;
        this.b = "3";
        continue;
        this.b = "2";
        continue;
        this.b = "4";
        continue;
      }
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = this.a.b();
      arrayOfObject[1] = "mqq";
      str4 = String.format("http://fusion.qq.com/cgi-bin/qzapps/unified_jump?appid=%1$s&from=%2$s&isOpenAppID=1", arrayOfObject);
      paramBundle.putString("targetUrl", str4);
    }
    if ((!o.a()) && (android.support.v4.app.b.f(paramActivity, "4.5.0") < 0))
    {
      paramb.a(new com.tencent.tauth.d(-6, "分享图片失败，检测不到SD卡!"));
      com.tencent.open.a.f.e("openSDK_LOG.QQShare", "shareToQQ sdcard is null--end");
      com.tencent.open.b.d.a();
      com.tencent.open.b.d.a(1, "SHARE_CHECK_SDK", "1000", this.a.b(), "0", Long.valueOf(SystemClock.elapsedRealtime()), "shareToQQ sdcard is null");
      return;
    }
    if (i == 5)
    {
      if (android.support.v4.app.b.f(paramActivity, "4.3.0") < 0)
      {
        paramb.a(new com.tencent.tauth.d(-6, "低版本手Q不支持该项功能!"));
        com.tencent.open.a.f.e("openSDK_LOG.QQShare", "shareToQQ, version below 4.3 is not support.");
        com.tencent.open.b.d.a();
        com.tencent.open.b.d.a(1, "SHARE_CHECK_SDK", "1000", this.a.b(), "0", Long.valueOf(SystemClock.elapsedRealtime()), "shareToQQ, version below 4.3 is not support.");
        return;
      }
      if (!o.h(str5))
      {
        paramb.a(new com.tencent.tauth.d(-6, "非法的图片地址!"));
        com.tencent.open.a.f.e("openSDK_LOG.QQShare", "shareToQQ -- error: 非法的图片地址!");
        com.tencent.open.b.d.a();
        com.tencent.open.b.d.a(1, "SHARE_CHECK_SDK", "1000", this.a.b(), "0", Long.valueOf(SystemClock.elapsedRealtime()), "非法的图片地址!");
        return;
      }
    }
    if (i != 5)
    {
      if ((TextUtils.isEmpty(str4)) || ((!str4.startsWith("http://")) && (!str4.startsWith("https://"))))
      {
        paramb.a(new com.tencent.tauth.d(-6, "传入参数有误!"));
        com.tencent.open.a.f.e("openSDK_LOG.QQShare", "shareToQQ, targetUrl is empty or illegal..");
        com.tencent.open.b.d.a();
        com.tencent.open.b.d.a(1, "SHARE_CHECK_SDK", "1000", this.a.b(), "0", Long.valueOf(SystemClock.elapsedRealtime()), "shareToQQ, targetUrl is empty or illegal..");
        return;
      }
      if (TextUtils.isEmpty(str2))
      {
        paramb.a(new com.tencent.tauth.d(-6, "title不能为空!"));
        com.tencent.open.a.f.e("openSDK_LOG.QQShare", "shareToQQ, title is empty.");
        com.tencent.open.b.d.a();
        com.tencent.open.b.d.a(1, "SHARE_CHECK_SDK", "1000", this.a.b(), "0", Long.valueOf(SystemClock.elapsedRealtime()), "shareToQQ, title is empty.");
        return;
      }
    }
    if ((!TextUtils.isEmpty(str1)) && (!str1.startsWith("http://")) && (!str1.startsWith("https://")) && (!new File(str1).exists()))
    {
      paramb.a(new com.tencent.tauth.d(-6, "非法的图片地址!"));
      com.tencent.open.a.f.e("openSDK_LOG.QQShare", "shareToQQ, image url is emprty or illegal.");
      com.tencent.open.b.d.a();
      com.tencent.open.b.d.a(1, "SHARE_CHECK_SDK", "1000", this.a.b(), "0", Long.valueOf(SystemClock.elapsedRealtime()), "shareToQQ, image url is emprty or illegal.");
      return;
    }
    if ((!TextUtils.isEmpty(str2)) && (str2.length() > 45))
      paramBundle.putString("title", o.a(str2, 45));
    if ((!TextUtils.isEmpty(str3)) && (str3.length() > 60))
      paramBundle.putString("summary", o.a(str3, 60));
    String str6;
    String str7;
    String str8;
    if (o.a(paramActivity))
    {
      com.tencent.open.a.f.c("openSDK_LOG.QQShare", "shareToQQ, support share");
      com.tencent.open.a.f.c("openSDK_LOG.QQShare", "shareToMobileQQ() -- start.");
      str6 = paramBundle.getString("imageUrl");
      str7 = paramBundle.getString("title");
      str8 = paramBundle.getString("summary");
      com.tencent.open.a.f.a("openSDK_LOG.QQShare", "shareToMobileQQ -- imageUrl: " + str6);
      if (!TextUtils.isEmpty(str6))
        if (o.f(str6))
          if ((TextUtils.isEmpty(str7)) && (TextUtils.isEmpty(str8)))
          {
            if (paramb != null)
            {
              paramb.a(new com.tencent.tauth.d(-6, "分享图片失败，检测不到SD卡!"));
              com.tencent.open.a.f.e("openSDK_LOG.QQShare", "分享图片失败，检测不到SD卡!");
            }
            com.tencent.open.b.d.a();
            com.tencent.open.b.d.a(1, "SHARE_CHECK_SDK", "1000", this.a.b(), "0", Long.valueOf(SystemClock.elapsedRealtime()), "分享图片失败，检测不到SD卡!");
          }
    }
    while (true)
    {
      com.tencent.open.a.f.c("openSDK_LOG.QQShare", "shareToQQ() -- end.");
      return;
      if (android.support.v4.app.b.f(paramActivity, "4.3.0") < 0)
        new com.tencent.open.utils.a(paramActivity).a(str6, new b(this, paramBundle, str7, str8, paramb, paramActivity));
      while (true)
      {
        com.tencent.open.a.f.c("openSDK_LOG.QQShare", "shareToMobileQQ() -- end");
        break;
        paramBundle.putString("imageUrl", null);
        if (android.support.v4.app.b.f(paramActivity, "4.3.0") < 0)
        {
          com.tencent.open.a.f.b("openSDK_LOG.QQShare", "shareToMobileQQ -- QQ Version is < 4.3.0 ");
          b(paramActivity, paramBundle, paramb);
          continue;
        }
        com.tencent.open.a.f.b("openSDK_LOG.QQShare", "shareToMobileQQ -- QQ Version is > 4.3.0 ");
        c localc = new c(this, paramBundle, str7, str8, paramb, paramActivity);
        com.tencent.open.a.f.b("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage");
        if (TextUtils.isEmpty(str6))
        {
          localc.a(1, null);
          continue;
        }
        if (!o.a())
        {
          localc.a(2, null);
          continue;
        }
        new Thread(new g(str6, new f(paramActivity.getMainLooper(), localc))).start();
      }
      try
      {
        com.tencent.open.a.f.d("openSDK_LOG.QQShare", "shareToQQ, don't support share, will show download dialog");
        new com.tencent.open.a(paramActivity, "", a("")).show();
      }
      catch (RuntimeException localRuntimeException)
      {
        com.tencent.open.a.f.b("openSDK_LOG.QQShare", " shareToQQ, TDialog.show not in main thread", localRuntimeException);
        paramb.a(new com.tencent.tauth.d(-6, "没有在主线程调用！"));
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.c.a
 * JD-Core Version:    0.6.0
 */