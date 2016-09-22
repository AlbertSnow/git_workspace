package com.alipay.wandoujia;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.TextView;
import com.alipay.android.app.pay.c;
import com.wandoujia.image.c.a;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Random;

public final class g
  implements com.alipay.android.app.d
{
  private static g a;
  private String b;
  private String c;
  private String d = "9.0.0";
  private boolean e = true;
  private String f = "sdk-and";
  private String g;

  private static String A()
  {
    String str = Long.toHexString(System.currentTimeMillis());
    Random localRandom = new Random();
    return str + (1000 + localRandom.nextInt(9000));
  }

  public static g z()
  {
    if (a == null)
      a = new g();
    return a;
  }

  public final String a()
  {
    return a.a().b().getFilesDir().getAbsolutePath() + File.separator + "alipay" + File.separator + "logs" + File.separator;
  }

  public final String a(Context paramContext)
  {
    return Float.toString(new TextView(paramContext).getTextSize());
  }

  public final String a(Context paramContext, HashMap paramHashMap)
  {
    return android.support.v4.app.b.a(paramContext, paramHashMap);
  }

  public final String a(ac paramac)
  {
    Context localContext = a.a().b();
    x localx = x.a(localContext);
    if (TextUtils.isEmpty(this.d))
      this.d = localx.a();
    try
    {
      this.d = URLEncoder.encode(this.d, "UTF-8");
      if (TextUtils.isEmpty(this.b))
      {
        String str14 = "Msp/" + this.d;
        String str15 = x.g();
        String str16 = android.support.v4.app.d.a();
        String str17 = android.support.v4.app.d.a(localContext);
        String str18 = android.support.v4.app.d.b();
        String str19 = android.support.v4.app.d.b(localContext);
        String str20 = a(localContext);
        this.b = (str14 + " (" + str15 + ";" + str16 + ";" + str17 + ";" + str18 + ";" + str19 + ";" + str20);
      }
      String str1 = x.b(localContext).b();
      String str2 = android.support.v4.app.d.c(localContext);
      String str3 = g();
      String str4 = localx.b();
      String str5 = localx.c();
      String str6 = x();
      String str7 = w();
      if (paramac != null)
      {
        this.g = paramac.b();
        String str8 = Build.MANUFACTURER.replace(";", " ");
        String str9 = Build.MODEL.replace(";", " ");
        boolean bool = a.e();
        String str10 = localx.e();
        String str11 = b(localContext);
        String str12 = c(localContext);
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(this.b).append(";").append(str1).append(";").append(str2).append(";").append(str3).append(";").append(str4).append(";").append(str5).append(";").append(this.g).append(";").append(str8).append(";").append(str9).append(";").append(bool).append(";").append(str10).append(";").append(y.a()).append(";").append(this.f).append(";").append(str6).append(";").append(str7).append(";").append(str11).append(";").append(str12);
        if (paramac != null)
        {
          HashMap localHashMap = new HashMap();
          localHashMap.put("tid", paramac.a());
          localHashMap.put("utdid", android.support.v4.app.b.b(localContext));
          String str13 = a(localContext, localHashMap);
          if (!TextUtils.isEmpty(str13))
            localStringBuilder.append(";").append(str13);
        }
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
      {
        android.support.v4.app.b.b(localUnsupportedEncodingException);
        continue;
        this.g = ac.h();
      }
    }
  }

  public final void a(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return;
    PreferenceManager.getDefaultSharedPreferences(a.a().b()).edit().putString("trideskey", paramString).commit();
    c.g = paramString;
  }

  public final int b()
  {
    return 20480;
  }

  public final String b(Context paramContext)
  {
    WifiInfo localWifiInfo = ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo();
    if (localWifiInfo != null)
      return localWifiInfo.getSSID();
    return "-1";
  }

  public final String c(Context paramContext)
  {
    WifiInfo localWifiInfo = ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo();
    if (localWifiInfo != null)
      return localWifiInfo.getBSSID();
    return "00";
  }

  public final boolean c()
  {
    return b.a().d() > 0;
  }

  public final String d(Context paramContext)
  {
    if (TextUtils.isEmpty(this.c))
    {
      String str1 = x.g();
      String str2 = android.support.v4.app.d.a();
      String str3 = android.support.v4.app.d.a(paramContext);
      String str4 = android.support.v4.app.d.b(paramContext);
      this.c = (" (" + str1 + ";" + str2 + ";" + str3 + ";;" + str4 + ")(sdk android)");
    }
    return this.c;
  }

  public final boolean d()
  {
    if (this.e)
      return this.e;
    return c.d;
  }

  public final int e()
  {
    return c.f;
  }

  public final String f()
  {
    return c.g;
  }

  public final String g()
  {
    return c.l;
  }

  public final String h()
  {
    return c.h;
  }

  public final int i()
  {
    return c.a;
  }

  public final int j()
  {
    return c.b;
  }

  public final int k()
  {
    return c.c;
  }

  public final boolean l()
  {
    return c.e;
  }

  public final String m()
  {
    return c.i;
  }

  public final String n()
  {
    return c.j;
  }

  public final String o()
  {
    return c.k;
  }

  public final String p()
  {
    return a.a().a(android.support.v4.app.d.g("msp_memo_user_cancel"));
  }

  public final String q()
  {
    return a.a().a(android.support.v4.app.d.g("msp_memo_server_cancel"));
  }

  public final String r()
  {
    return a.a().a(android.support.v4.app.d.g("msp_memo_app_cancel"));
  }

  public final String s()
  {
    return a.a().a(android.support.v4.app.d.g("msp_memo_repeat_pay"));
  }

  public final boolean t()
  {
    return a.a().b().getSharedPreferences("global_settings", 0).getBoolean("is_sim_imsi", false);
  }

  public final boolean u()
  {
    return a.a().b().getSharedPreferences("global_settings", 0).getBoolean("is_sim_no_imsi", false);
  }

  public final md v()
  {
    return md.b;
  }

  public final String w()
  {
    Context localContext = a.a().b();
    SharedPreferences localSharedPreferences = localContext.getSharedPreferences("virtualImeiAndImsi", 0);
    String str = localSharedPreferences.getString("virtual_imei", null);
    if (TextUtils.isEmpty(str))
    {
      ac.e();
      if (!ac.d())
        break label71;
    }
    label71: for (str = A(); ; str = x.a(localContext).c())
    {
      localSharedPreferences.edit().putString("virtual_imei", str).commit();
      return str;
    }
  }

  public final String x()
  {
    Context localContext = a.a().b();
    SharedPreferences localSharedPreferences = localContext.getSharedPreferences("virtualImeiAndImsi", 0);
    String str1 = localSharedPreferences.getString("virtual_imsi", null);
    String str2;
    if (TextUtils.isEmpty(str1))
    {
      ac.e();
      if (!ac.d())
        break label102;
      str2 = android.support.v4.app.b.b(a.a().b());
      if (!TextUtils.isEmpty(str2))
        break label90;
      str1 = A();
    }
    while (true)
    {
      localSharedPreferences.edit().putString("virtual_imsi", str1).commit();
      return str1;
      label90: str1 = str2.substring(3, 18);
      continue;
      label102: str1 = x.a(localContext).b();
    }
  }

  public final String y()
  {
    return "msp";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.g
 * JD-Core Version:    0.6.0
 */