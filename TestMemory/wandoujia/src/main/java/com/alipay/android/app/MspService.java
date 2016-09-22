package com.alipay.android.app;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Handler;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.support.v4.app.b;
import android.support.v4.app.d;
import android.text.TextUtils;
import com.alipay.android.mini.widget.s;
import com.alipay.wandoujia.ae;
import com.alipay.wandoujia.af;
import com.alipay.wandoujia.ag;
import com.alipay.wandoujia.aj;
import com.alipay.wandoujia.ak;
import com.alipay.wandoujia.t;
import com.alipay.wandoujia.w;
import java.io.InputStream;
import java.net.MalformedURLException;
import org.json.JSONObject;

public class MspService extends Service
{
  private static boolean a = false;
  private MspService.a b;
  private Handler c = new Handler();
  private Thread.UncaughtExceptionHandler d = new f();

  private String a(String paramString)
  {
    Object localObject1 = null;
    String[] arrayOfString1;
    try
    {
      arrayOfString1 = paramString.split("\\?");
      if (!arrayOfString1[0].contains("alipay"))
        throw new MalformedURLException();
    }
    catch (Exception localException)
    {
      return i.b();
    }
    String[] arrayOfString2 = arrayOfString1[1].split("&");
    int i = arrayOfString2.length;
    int j = 0;
    String str1 = null;
    String str2 = null;
    Object localObject2 = null;
    while (true)
    {
      String str3;
      if (j >= i)
      {
        str3 = "extern_token=\"" + str2 + "\"&trade_no=\"" + str1 + "\"&app_name=\"tb\"&partner=\"TAOBAO_PARTNER_ORDER\"";
        if (TextUtils.isEmpty((CharSequence)localObject1))
          break label325;
      }
      label325: for (String str4 = str3 + "&appevn=\"" + (String)localObject1 + "\""; ; str4 = str3)
      {
        if (!TextUtils.isEmpty((CharSequence)localObject2));
        for (String str5 = str4 + "&payPhaseId=\"" + (String)localObject2 + "\""; ; str5 = str4)
        {
          return b(str5);
          String str6 = arrayOfString2[j];
          if (str6.contains("sid"))
          {
            str2 = str6.substring(4 + str6.indexOf("sid="));
            break;
          }
          if (str6.contains("trade_no"))
          {
            str1 = str6.substring(9 + str6.indexOf("trade_no="));
            break;
          }
          if (str6.contains("appevn"))
          {
            localObject1 = str6.substring(7 + str6.indexOf("appevn="));
            break;
          }
          if (!str6.contains("payPhaseId"))
            break;
          String str7 = str6.substring(11 + str6.indexOf("payPhaseId="));
          localObject2 = str7;
          break;
        }
      }
      j++;
    }
  }

  private String b(String paramString)
  {
    e locale = new e();
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
    if (localSharedPreferences != null)
    {
      locale.a = localSharedPreferences.getString("alixtid", "");
      locale.b = localSharedPreferences.getString("config", "");
      locale.c = localSharedPreferences.getString("errorMessage", "");
      locale.d = localSharedPreferences.getString("downloadMessage", "");
      locale.e = localSharedPreferences.getString("downloadType", "");
      locale.f = localSharedPreferences.getString("downloadUrl", "");
      locale.g = localSharedPreferences.getString("downloadVersion", "");
      locale.h = localSharedPreferences.getInt("state", 4000);
      locale.i = localSharedPreferences.getInt("timeout", 15);
      locale.j = localSharedPreferences.getString("url", "");
    }
    String str = new i(this, paramString, locale).a();
    this.c.post(new g(this, paramString));
    return str;
  }

  private boolean b()
  {
    t localt = d.c();
    try
    {
      boolean bool = new ag().a(getApplicationContext(), localt).d().optBoolean("hasAccount", false);
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public IBinder onBind(Intent paramIntent)
  {
    return this.b;
  }

  public void onCreate()
  {
    super.onCreate();
    s.a();
    Thread.currentThread().setUncaughtExceptionHandler(this.d);
    Context localContext = getApplicationContext();
    com.wandoujia.image.c.a.a().a(localContext, com.alipay.wandoujia.g.z());
    if (!a)
      a = true;
    try
    {
      InputStream localInputStream = getAssets().open("msp.dat");
      com.alipay.android.app.pay.c.a(getApplicationContext(), localInputStream);
      localInputStream.close();
      com.alipay.android.app.pay.c.a(getApplicationContext());
      com.alipay.wandoujia.a.a(com.alipay.wandoujia.e.class);
      af.a(new w());
      af.a(new ak());
      aj.a(0, com.alipay.android.mini.window.sdk.c.class);
      aj.a(4, com.alipay.android.mini.window.sdk.c.class);
      aj.a(6, com.alipay.android.mini.window.sdk.c.class);
      aj.a(7, com.alipay.android.mini.window.sdk.c.class);
      aj.a(8, com.alipay.android.mini.window.sdk.c.class);
      aj.a(-10, com.alipay.android.mini.window.sdk.c.class);
      aj.a(10, com.alipay.android.mini.window.sdk.c.class);
      aj.a(5, com.alipay.android.mini.window.sdk.c.class);
      aj.a(9, com.alipay.android.mini.window.sdk.c.class);
      com.alipay.android.app.b.a.a();
      com.alipay.wandoujia.i.b();
      if (this.b == null)
        this.b = new MspService.a(this);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        b.b(localException);
    }
  }

  public void onDestroy()
  {
    a = false;
    super.onDestroy();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.MspService
 * JD-Core Version:    0.6.0
 */