package com.tencent.connect.c;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.connect.b.c;
import com.tencent.open.a.f;
import com.tencent.open.utils.o;
import java.util.ArrayList;

public final class d extends com.tencent.connect.common.b
{
  private String b = "";
  private boolean c = true;
  private boolean d = false;

  public d(c paramc)
  {
    super(paramc, 0);
  }

  public final void a(Activity paramActivity, Bundle paramBundle, com.tencent.tauth.b paramb)
  {
    f.c("openSDK_LOG.QzoneShare", "shareToQzone() -- start");
    String str1 = paramBundle.getString("title");
    String str2 = paramBundle.getString("summary");
    String str3 = paramBundle.getString("targetUrl");
    ArrayList localArrayList = paramBundle.getStringArrayList("imageUrl");
    String str4 = o.b(paramActivity);
    int i;
    if (str4 == null)
    {
      str4 = paramBundle.getString("appName");
      i = paramBundle.getInt("req_type");
      switch (i)
      {
      case 2:
      case 3:
      case 4:
      default:
        this.b = "1";
        switch (i)
        {
        case 2:
        case 3:
        case 4:
        default:
          label114: if ((o.d(str1)) && (o.d(str2)))
            if ((localArrayList != null) && (localArrayList.size() != 0))
              this.c = false;
        case 6:
        case 1:
        case 5:
        }
      case 6:
      case 1:
      case 5:
      }
    }
    String str5;
    Object localObject;
    while (true)
    {
      this.d = true;
      str5 = str1;
      String str8;
      for (localObject = str3; ; localObject = str8)
      {
        if ((o.a()) || (android.support.v4.app.b.f(paramActivity, "4.5.0") >= 0))
          break label572;
        paramb.a(new com.tencent.tauth.d(-6, "分享图片失败，检测不到SD卡!"));
        f.e("openSDK_LOG.QzoneShare", "shareToQzone() sdcard is null--end");
        com.tencent.open.b.d.a();
        com.tencent.open.b.d.a(1, "SHARE_CHECK_SDK", "1000", this.a.b(), "4", Long.valueOf(SystemClock.elapsedRealtime()), "分享图片失败，检测不到SD卡!");
        return;
        if (str4.length() <= 20)
          break;
        str4 = str4.substring(0, 20) + "...";
        break;
        this.b = "4";
        break label114;
        this.b = "1";
        break label114;
        this.b = "2";
        break label114;
        if (android.support.v4.app.b.f(paramActivity, "5.0.0") < 0)
        {
          paramb.a(new com.tencent.tauth.d(-15, "手Q版本过低，应用分享只支持手Q5.0及其以上版本"));
          f.e("openSDK_LOG.QzoneShare", "-->shareToQzone, app share is not support below qq5.0.");
          com.tencent.open.b.d.a();
          com.tencent.open.b.d.a(1, "SHARE_CHECK_SDK", "1000", this.a.b(), "4", Long.valueOf(SystemClock.elapsedRealtime()), "shareToQzone, app share is not support below qq5.0.");
          return;
        }
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = this.a.b();
        arrayOfObject[1] = "mqq";
        str8 = String.format("http://fusion.qq.com/cgi-bin/qzapps/unified_jump?appid=%1$s&from=%2$s&isOpenAppID=1", arrayOfObject);
        paramBundle.putString("targetUrl", str8);
        str5 = str1;
      }
      this.c = true;
      continue;
      paramb.a(new com.tencent.tauth.d(-5, "请选择支持的分享类型"));
      f.e("openSDK_LOG.QzoneShare", "shareToQzone() error--end请选择支持的分享类型");
      com.tencent.open.b.d.a();
      com.tencent.open.b.d.a(1, "SHARE_CHECK_SDK", "1000", this.a.b(), "4", Long.valueOf(SystemClock.elapsedRealtime()), "shareToQzone() 请选择支持的分享类型");
      return;
      str1 = "来自" + str4 + "的分享";
      this.c = true;
    }
    label572: if (this.c)
    {
      if (TextUtils.isEmpty((CharSequence)localObject))
      {
        paramb.a(new com.tencent.tauth.d(-5, "targetUrl为必填项，请补充后分享"));
        f.e("openSDK_LOG.QzoneShare", "shareToQzone() targetUrl null error--end");
        com.tencent.open.b.d.a();
        com.tencent.open.b.d.a(1, "SHARE_CHECK_SDK", "1000", this.a.b(), "4", Long.valueOf(SystemClock.elapsedRealtime()), "targetUrl为必填项，请补充后分享");
        return;
      }
      if (!o.f((String)localObject))
      {
        paramb.a(new com.tencent.tauth.d(-5, "targetUrl有误"));
        f.e("openSDK_LOG.QzoneShare", "shareToQzone() targetUrl error--end");
        com.tencent.open.b.d.a();
        com.tencent.open.b.d.a(1, "SHARE_CHECK_SDK", "1000", this.a.b(), "4", Long.valueOf(SystemClock.elapsedRealtime()), "targetUrl有误");
        return;
      }
    }
    if ((this.d) && (o.d(str5)))
    {
      paramb.a(new com.tencent.tauth.d(-6, "title不能为空!"));
      f.e("openSDK_LOG.QzoneShare", "shareToQzone() title is null--end");
      com.tencent.open.b.d.a();
      com.tencent.open.b.d.a(1, "SHARE_CHECK_SDK", "1000", this.a.b(), "4", Long.valueOf(SystemClock.elapsedRealtime()), "shareToQzone() title is null");
      return;
    }
    if ((!o.d(str5)) && (str5.length() > 200))
      paramBundle.putString("title", o.a(str5, 200));
    if ((!o.d(str2)) && (str2.length() > 600))
      paramBundle.putString("summary", o.a(str2, 600));
    if (!TextUtils.isEmpty(str4))
      paramBundle.putString("appName", str4);
    e locale;
    if ((localArrayList == null) || ((localArrayList != null) && (localArrayList.size() == 0)))
    {
      if (android.support.v4.app.b.f(paramActivity, "4.6.0") < 0)
        break label1117;
      f.c("openSDK_LOG.QzoneShare", "shareToQzone() qqver greater than 4.6.0");
      locale = new e(this, paramBundle, paramActivity, paramb);
      f.b("openSDK_LOG.AsynScaleCompressImage", "batchScaleCompressImage");
      if (localArrayList != null)
        break label1082;
      locale.a(1, null);
    }
    while (true)
    {
      f.c("openSDK_LOG.QzoneShare", "shareToQzone() --end");
      return;
      for (int j = 0; j < localArrayList.size(); j++)
      {
        String str7 = (String)localArrayList.get(j);
        if ((o.f(str7)) || (o.g(str7)))
          continue;
        localArrayList.remove(j);
      }
      if (localArrayList.size() == 0)
      {
        paramb.a(new com.tencent.tauth.d(-6, "非法的图片地址!"));
        f.e("openSDK_LOG.QzoneShare", "shareToQzone() MSG_PARAM_IMAGE_URL_FORMAT_ERROR--end");
        com.tencent.open.b.d.a();
        com.tencent.open.b.d.a(1, "SHARE_CHECK_SDK", "1000", this.a.b(), "4", Long.valueOf(SystemClock.elapsedRealtime()), "shareToQzone() 非法的图片地址!");
        return;
      }
      paramBundle.putStringArrayList("imageUrl", localArrayList);
      break;
      label1082: new Thread(new i(localArrayList, new h(paramActivity.getMainLooper(), locale))).start();
      continue;
      label1117: if ((android.support.v4.app.b.f(paramActivity, "4.2.0") >= 0) && (android.support.v4.app.b.f(paramActivity, "4.6.0") < 0))
      {
        f.d("openSDK_LOG.QzoneShare", "shareToQzone() qqver between 4.2.0 and 4.6.0, will use qqshare");
        a locala = new a(this.a);
        if ((localArrayList != null) && (localArrayList.size() > 0))
        {
          String str6 = (String)localArrayList.get(0);
          if ((i == 5) && (!o.h(str6)))
          {
            paramb.a(new com.tencent.tauth.d(-6, "手Q版本过低，纯图分享不支持网路图片"));
            f.e("openSDK_LOG.QzoneShare", "shareToQzone()手Q版本过低，纯图分享不支持网路图片");
            com.tencent.open.b.d.a();
            com.tencent.open.b.d.a(1, "SHARE_CHECK_SDK", "1000", this.a.b(), "4", Long.valueOf(SystemClock.elapsedRealtime()), "shareToQzone()手Q版本过低，纯图分享不支持网路图片");
            return;
          }
          paramBundle.putString("imageLocalUrl", str6);
        }
        if (android.support.v4.app.b.f(paramActivity, "4.5.0") >= 0)
          paramBundle.putInt("cflag", 1);
        locala.a(paramActivity, paramBundle, paramb);
        continue;
      }
      f.d("openSDK_LOG.QzoneShare", "shareToQzone() qqver below 4.2.0, will show download dialog");
      new com.tencent.open.a(paramActivity, "", a("")).show();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.c.d
 * JD-Core Version:    0.6.0
 */