package com.alipay.mobilesecuritysdk.deviceID;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import com.wandoujia.clean.reporter.PeriodReporter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class g
{
  private h a = new h();

  public g()
  {
    new com.wandoujia.appmanager.a();
  }

  public static Map<String, String> a(Context paramContext)
  {
    new b();
    String str1 = paramContext.getSharedPreferences("profiles", 0).getString("deviceid", "");
    if (android.support.v4.app.b.d(str1));
    String str2;
    do
    {
      return null;
      str2 = j.b(j.a(), str1);
    }
    while (android.support.v4.app.b.d(str2));
    new com.wandoujia.appmanager.a();
    return com.wandoujia.appmanager.a.b(str2);
  }

  public static boolean a(Map<String, String> paramMap)
  {
    if ((paramMap == null) || (paramMap.size() < 0) || (android.support.v4.app.b.d((String)paramMap.get("deviceId"))) || (android.support.v4.app.b.d((String)paramMap.get("checkcode"))) || (android.support.v4.app.b.d((String)paramMap.get("apdtk"))) || (android.support.v4.app.b.d((String)paramMap.get("time"))) || (android.support.v4.app.b.d((String)paramMap.get("rule"))))
      return false;
    return (((String)paramMap.get("deviceId")).length() > 0) && (((String)paramMap.get("checkcode")).length() > 0) && (((String)paramMap.get("apdtk")).length() > 0) && (((String)paramMap.get("time")).length() > 0) && (((String)paramMap.get("rule")).length() > 0);
  }

  private void c(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    if (android.support.v4.app.b.d(this.a.e()))
      localArrayList.add(this.a.e().substring(0, 20));
    if (android.support.v4.app.b.d(this.a.f()))
      localArrayList.add(this.a.f().substring(0, 20));
    if (android.support.v4.app.b.d(this.a.a()))
      localArrayList.add(this.a.a().substring(0, 20));
    localArrayList.add(paramString);
    i.a(localArrayList);
  }

  private String d()
  {
    String str1 = System.getProperty("deviceid");
    boolean bool1 = android.support.v4.app.b.d(str1);
    String str2 = null;
    if (!bool1);
    try
    {
      String str4 = new JSONObject(str1).getString("device");
      str3 = str4;
      boolean bool2 = android.support.v4.app.b.d(str3);
      str2 = null;
      if (!bool2)
        str2 = j.b(j.a(), str3);
      return str2;
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        c(i.a(localJSONException));
        String str3 = null;
      }
    }
  }

  private String e()
  {
    String str1;
    if (android.support.v4.app.b.j())
    {
      File localFile = new File(Environment.getExternalStorageDirectory(), ".SystemConfig");
      if (!localFile.exists())
        localFile.mkdir();
      str1 = android.support.v4.app.b.f(localFile.getAbsolutePath() + File.separator + "data");
      if (!android.support.v4.app.b.d(str1))
        break label72;
    }
    while (true)
    {
      return null;
      try
      {
        label72: String str3 = new JSONObject(str1).getString("device");
        str2 = str3;
        if (android.support.v4.app.b.d(str2))
          continue;
        return j.b(j.a(), str2);
      }
      catch (JSONException localJSONException)
      {
        while (true)
        {
          c(i.a(localJSONException));
          String str2 = null;
        }
      }
    }
  }

  private String f()
  {
    Object localObject;
    if (android.support.v4.app.b.d(this.a.d()))
      localObject = null;
    while (true)
    {
      return localObject;
      try
      {
        JSONArray localJSONArray = new JSONObject(this.a.d()).getJSONArray("params");
        if (localJSONArray == null)
          return null;
        localObject = new String();
        for (int i = 0; i != localJSONArray.length(); i++)
        {
          if (localJSONArray.getString(i).equals("AC1"))
            localObject = localObject + this.a.e();
          if (localJSONArray.getString(i).equals("AC2"))
            localObject = localObject + this.a.f();
          if (localJSONArray.getString(i).equals("AH1"))
            localObject = localObject + this.a.g();
          if (localJSONArray.getString(i).equals("AH2"))
            localObject = localObject + this.a.h();
          if (localJSONArray.getString(i).equals("AH3"))
            localObject = localObject + this.a.i();
          if (localJSONArray.getString(i).equals("AH4"))
            localObject = localObject + this.a.j();
          if (localJSONArray.getString(i).equals("AH5"))
            localObject = localObject + this.a.k();
          if (localJSONArray.getString(i).equals("AH6"))
            localObject = localObject + this.a.l();
          if (localJSONArray.getString(i).equals("AH7"))
            localObject = localObject + this.a.m();
          if (localJSONArray.getString(i).equals("AH8"))
            localObject = localObject + this.a.n();
          if (localJSONArray.getString(i).equals("AH9"))
            localObject = localObject + this.a.o();
          if (localJSONArray.getString(i).equals("AH10"))
            localObject = localObject + this.a.p();
          if (localJSONArray.getString(i).equals("AS1"))
            localObject = localObject + this.a.s();
          if (localJSONArray.getString(i).equals("AS2"))
            localObject = localObject + this.a.t();
          if (localJSONArray.getString(i).equals("AS3"))
            localObject = localObject + this.a.u();
          if (!localJSONArray.getString(i).equals("AS4"))
            continue;
          String str = localObject + this.a.v();
          localObject = str;
        }
      }
      catch (JSONException localJSONException)
      {
        c(i.a(localJSONException));
      }
    }
    return (String)null;
  }

  private com.wandoujia.account.h.a g()
  {
    com.wandoujia.account.h.a locala = new com.wandoujia.account.h.a();
    locala.a(false);
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    if (!android.support.v4.app.b.d(this.a.g()))
      localHashMap2.put("AH1", this.a.g());
    if (!android.support.v4.app.b.d(this.a.h()))
      localHashMap2.put("AH2", this.a.h());
    if (!android.support.v4.app.b.d(this.a.i()))
      localHashMap2.put("AH3", this.a.i());
    if (!android.support.v4.app.b.d(this.a.j()))
      localHashMap2.put("AH4", this.a.j());
    if (!android.support.v4.app.b.d(this.a.k()))
      localHashMap2.put("AH5", this.a.k());
    if (!android.support.v4.app.b.d(this.a.l()))
      localHashMap2.put("AH6", this.a.l());
    if (!android.support.v4.app.b.d(this.a.m()))
      localHashMap2.put("AH7", this.a.m());
    if (!android.support.v4.app.b.d(this.a.n()))
      localHashMap2.put("AH8", this.a.n());
    if (!android.support.v4.app.b.d(this.a.o()))
      localHashMap2.put("AH9", this.a.o());
    if (!android.support.v4.app.b.d(this.a.p()))
      localHashMap2.put("AH10", this.a.p());
    if (!android.support.v4.app.b.d(this.a.s()))
      localHashMap2.put("AS1", this.a.s());
    if (!android.support.v4.app.b.d(this.a.t()))
      localHashMap2.put("AS2", this.a.t());
    if (!android.support.v4.app.b.d(this.a.u()))
      localHashMap2.put("AS3", this.a.u());
    if (!android.support.v4.app.b.d(this.a.v()))
      localHashMap2.put("AS4", this.a.v());
    if (!android.support.v4.app.b.d(this.a.e()))
      localHashMap2.put("AC1", this.a.e());
    if (!android.support.v4.app.b.d(this.a.f()))
      localHashMap2.put("AC2", this.a.f());
    localHashMap1.put("deviceInfo", localHashMap2);
    if (!android.support.v4.app.b.d(this.a.b()))
      localHashMap1.put("deviceId", this.a.b());
    if (!android.support.v4.app.b.d(this.a.c()))
      localHashMap1.put("priDeviceId", this.a.c());
    if (!android.support.v4.app.b.d(this.a.a()))
      localHashMap1.put("appId", this.a.a());
    if (!android.support.v4.app.b.d(this.a.q()))
      localHashMap1.put("time", this.a.q());
    if (!android.support.v4.app.b.d(this.a.r()))
      localHashMap1.put("apdtk", this.a.r());
    String str = com.wandoujia.appmanager.a.b(localHashMap1);
    if ((str == null) || (str.length() < 0))
      return locala;
    try
    {
      new PeriodReporter();
      HttpResponse localHttpResponse = PeriodReporter.a("http://seccliprod.d5198.alipay.net/api/do.htm", "deviceFingerprint", str, "1", false);
      if ((localHttpResponse != null) && (localHttpResponse.getStatusLine().getStatusCode() == 200))
      {
        new com.wandoujia.appmanager.a();
        return com.wandoujia.appmanager.a.a(EntityUtils.toString(localHttpResponse.getEntity()));
      }
      locala.a(false);
      return locala;
    }
    catch (IOException localIOException)
    {
      c(i.a(localIOException));
    }
    return locala;
  }

  public final void a(Context paramContext, Map<String, String> paramMap)
  {
    a.a();
    i.a(paramContext);
    if (paramMap != null);
    try
    {
      if (paramMap.size() > 0)
      {
        if (!android.support.v4.app.b.d((String)paramMap.get("tid")))
          this.a.e((String)paramMap.get("tid"));
        if (!android.support.v4.app.b.d((String)paramMap.get("utdid")))
          this.a.f((String)paramMap.get("utdid"));
      }
      if (!android.support.v4.app.b.d(a.b(paramContext)))
        this.a.g(a.b(paramContext));
      if (!android.support.v4.app.b.d(a.c(paramContext)))
        this.a.h(a.c(paramContext));
      if (!android.support.v4.app.b.d(a.a(paramContext)))
        this.a.i(a.a(paramContext));
      if (!android.support.v4.app.b.d(a.f()))
        this.a.j(a.f());
      if (!android.support.v4.app.b.d(a.b()))
        this.a.k(a.b());
      if (!android.support.v4.app.b.d(a.j()))
        this.a.l(a.j());
      if (!android.support.v4.app.b.d(Long.toString(a.g())))
        this.a.m(Long.toString(a.g()));
      if (!android.support.v4.app.b.d(Long.toString(a.h())))
        this.a.n(Long.toString(a.h()));
      if (!android.support.v4.app.b.d(a.d(paramContext)))
        this.a.o(a.d(paramContext));
      if (!android.support.v4.app.b.d(a.e()))
        this.a.p(a.e());
      if (!android.support.v4.app.b.d(a.i()))
        this.a.s(a.i());
      if (!android.support.v4.app.b.d(a.c()))
        this.a.t(a.c());
      if (!android.support.v4.app.b.d(a.k()))
        this.a.u(a.k());
      if (!android.support.v4.app.b.d(a.d()))
        this.a.v(a.d());
      if (!android.support.v4.app.b.d(a.e(paramContext)))
        this.a.a(a.e(paramContext));
      Map localMap = a(paramContext);
      if ((localMap != null) && (localMap.size() > 0))
      {
        if (!android.support.v4.app.b.d((String)localMap.get("apdtk")))
          this.a.r((String)localMap.get("apdtk"));
        if (!android.support.v4.app.b.d((String)localMap.get("deviceId")))
          this.a.c((String)localMap.get("deviceId"));
        if (!android.support.v4.app.b.d((String)localMap.get("time")))
          this.a.q((String)localMap.get("time"));
        if (!android.support.v4.app.b.d((String)localMap.get("rule")))
          this.a.d((String)localMap.get("rule"));
      }
      if (!android.support.v4.app.b.d(d()))
      {
        this.a.b(d().substring(0, 32));
        return;
      }
      if (!android.support.v4.app.b.d(e()))
      {
        this.a.b(e().substring(0, 32));
        return;
      }
    }
    catch (Exception localException)
    {
      c(i.a(localException));
    }
  }

  public final void a(String paramString)
  {
    if (android.support.v4.app.b.d(paramString));
    String str;
    do
    {
      return;
      str = j.a(j.a(), paramString);
    }
    while (android.support.v4.app.b.d(str));
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("device", str);
      System.setProperty("deviceid", localJSONObject.toString());
      new StringBuilder("WriteDataToSettings: data is").append(paramString).append("  encrypt  data  is").append(localJSONObject.toString());
      return;
    }
    catch (JSONException localJSONException)
    {
      c(i.a(localJSONException));
    }
  }

  public final boolean a()
  {
    int i;
    if ((!android.support.v4.app.b.d(d())) && (d().length() > 0))
    {
      i = 1;
      if (i != 0)
        break label64;
      if ((android.support.v4.app.b.d(e())) || (e().length() <= 0))
        break label59;
    }
    label59: for (int j = 1; ; j = 0)
    {
      if (j != 0)
        break label64;
      return false;
      i = 0;
      break;
    }
    label64: return true;
  }

  public final String b()
  {
    String str = f();
    if (android.support.v4.app.b.d(str))
      return null;
    return android.support.v4.app.b.e(str);
  }

  // ERROR //
  public final String b(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 450	com/alipay/mobilesecuritysdk/deviceID/g:g	()Lcom/wandoujia/account/h/a;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull +234 -> 240
    //   9: aload_2
    //   10: invokevirtual 452	com/wandoujia/account/h/a:c	()Z
    //   13: ifeq +227 -> 240
    //   16: new 156	java/lang/StringBuilder
    //   19: dup
    //   20: aload_2
    //   21: invokevirtual 453	com/wandoujia/account/h/a:d	()Ljava/lang/String;
    //   24: invokestatic 163	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   27: invokespecial 164	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   30: aload_2
    //   31: invokevirtual 454	com/wandoujia/account/h/a:b	()Ljava/lang/String;
    //   34: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: invokevirtual 177	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: astore 4
    //   42: new 281	java/util/HashMap
    //   45: dup
    //   46: invokespecial 282	java/util/HashMap:<init>	()V
    //   49: astore 5
    //   51: aload 5
    //   53: ldc 66
    //   55: aload_2
    //   56: invokevirtual 453	com/wandoujia/account/h/a:d	()Ljava/lang/String;
    //   59: invokeinterface 286 3 0
    //   64: pop
    //   65: aload 5
    //   67: ldc_w 294
    //   70: aload_2
    //   71: invokevirtual 453	com/wandoujia/account/h/a:d	()Ljava/lang/String;
    //   74: invokeinterface 286 3 0
    //   79: pop
    //   80: aload 5
    //   82: ldc 78
    //   84: aload_2
    //   85: invokevirtual 454	com/wandoujia/account/h/a:b	()Ljava/lang/String;
    //   88: invokeinterface 286 3 0
    //   93: pop
    //   94: aload 5
    //   96: ldc 74
    //   98: aload_2
    //   99: invokevirtual 455	com/wandoujia/account/h/a:a	()Ljava/lang/String;
    //   102: invokeinterface 286 3 0
    //   107: pop
    //   108: aload 5
    //   110: ldc 80
    //   112: aload_2
    //   113: invokevirtual 456	com/wandoujia/account/h/a:f	()Ljava/lang/String;
    //   116: invokeinterface 286 3 0
    //   121: pop
    //   122: aload 5
    //   124: ldc 76
    //   126: aload_2
    //   127: invokevirtual 457	com/wandoujia/account/h/a:e	()Ljava/lang/String;
    //   130: invokeinterface 286 3 0
    //   135: pop
    //   136: new 17	com/wandoujia/appmanager/a
    //   139: dup
    //   140: invokespecial 18	com/wandoujia/appmanager/a:<init>	()V
    //   143: pop
    //   144: aload 5
    //   146: invokestatic 459	com/wandoujia/appmanager/a:a	(Ljava/util/Map;)Ljava/lang/String;
    //   149: astore 15
    //   151: new 21	com/alipay/mobilesecuritysdk/deviceID/b
    //   154: dup
    //   155: invokespecial 22	com/alipay/mobilesecuritysdk/deviceID/b:<init>	()V
    //   158: pop
    //   159: invokestatic 51	com/alipay/mobilesecuritysdk/deviceID/j:a	()Ljava/lang/String;
    //   162: aload 15
    //   164: invokestatic 433	com/alipay/mobilesecuritysdk/deviceID/j:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   167: astore 17
    //   169: aload 17
    //   171: invokestatic 46	android/support/v4/app/b:d	(Ljava/lang/String;)Z
    //   174: ifne +36 -> 210
    //   177: new 281	java/util/HashMap
    //   180: dup
    //   181: invokespecial 282	java/util/HashMap:<init>	()V
    //   184: astore 18
    //   186: aload 18
    //   188: ldc 32
    //   190: aload 17
    //   192: invokeinterface 286 3 0
    //   197: pop
    //   198: aload_1
    //   199: ldc 24
    //   201: iconst_0
    //   202: invokevirtual 30	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   205: aload 18
    //   207: invokestatic 462	com/alipay/mobilesecuritysdk/deviceID/b:a	(Landroid/content/SharedPreferences;Ljava/util/Map;)V
    //   210: aload_0
    //   211: aload 4
    //   213: invokevirtual 463	com/alipay/mobilesecuritysdk/deviceID/g:a	(Ljava/lang/String;)V
    //   216: aload_0
    //   217: aload 4
    //   219: invokevirtual 464	com/alipay/mobilesecuritysdk/deviceID/g:b	(Ljava/lang/String;)V
    //   222: aload_2
    //   223: invokevirtual 453	com/wandoujia/account/h/a:d	()Ljava/lang/String;
    //   226: astore 14
    //   228: aload 14
    //   230: areturn
    //   231: astore_3
    //   232: aload_0
    //   233: aload_3
    //   234: invokestatic 129	com/alipay/mobilesecuritysdk/deviceID/i:a	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   237: invokespecial 131	com/alipay/mobilesecuritysdk/deviceID/g:c	(Ljava/lang/String;)V
    //   240: aconst_null
    //   241: areturn
    //   242: astore 13
    //   244: goto -34 -> 210
    //
    // Exception table:
    //   from	to	target	type
    //   9	144	231	java/lang/Exception
    //   144	210	231	java/lang/Exception
    //   210	228	231	java/lang/Exception
    //   144	210	242	org/json/JSONException
  }

  public final void b(String paramString)
  {
    String str;
    File localFile;
    JSONObject localJSONObject;
    if (android.support.v4.app.b.j())
    {
      str = j.a(j.a(), paramString);
      localFile = new File(Environment.getExternalStorageDirectory(), ".SystemConfig");
      if (!localFile.exists())
        localFile.mkdir();
      localJSONObject = new JSONObject();
    }
    try
    {
      localJSONObject.put("device", str);
    }
    catch (JSONException localJSONException)
    {
      try
      {
        while (true)
        {
          new StringBuilder("WriteDataToSdCard: data is").append(paramString).append("  encrypt  data  is").append(localJSONObject.toString());
          android.support.v4.app.b.d(localFile.getAbsolutePath() + File.separator + "data", localJSONObject.toString());
          return;
          localJSONException = localJSONException;
          c(i.a(localJSONException));
        }
      }
      catch (IOException localIOException)
      {
        c(i.a(localIOException));
      }
    }
  }

  public final boolean c()
  {
    String str1 = d();
    String str2 = e();
    boolean bool2;
    if (!android.support.v4.app.b.d(str1))
      bool2 = this.a.c().equals(str1.substring(0, 32));
    boolean bool1;
    do
    {
      return bool2;
      bool1 = android.support.v4.app.b.d(str2);
      bool2 = false;
    }
    while (bool1);
    return this.a.c().equals(str2.subSequence(0, 32));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.mobilesecuritysdk.deviceID.g
 * JD-Core Version:    0.6.0
 */