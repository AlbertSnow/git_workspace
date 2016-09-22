package com.tencent.open.b;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.tencent.open.utils.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
{
  private static f d;
  protected List<Serializable> a = Collections.synchronizedList(new ArrayList());
  protected List<Serializable> b = Collections.synchronizedList(new ArrayList());
  protected Handler c;
  private Random e = new Random();
  private HandlerThread f = null;
  private Executor g = l.a();
  private Executor h = l.a();

  private f()
  {
    if (this.f == null)
    {
      this.f = new HandlerThread("opensdk.report.handlerthread", 10);
      this.f.start();
    }
    if ((this.f.isAlive()) && (this.f.getLooper() != null))
      this.c = new g(this, this.f.getLooper());
  }

  protected static int a(int paramInt)
  {
    int i;
    if (paramInt == 0)
    {
      i = com.tencent.open.utils.i.a(android.support.v4.app.b.t(), null).a("Common_CGIReportFrequencySuccess");
      if (i == 0)
        i = 10;
    }
    do
    {
      return i;
      i = com.tencent.open.utils.i.a(android.support.v4.app.b.t(), null).a("Common_CGIReportFrequencyFailed");
    }
    while (i != 0);
    return 100;
  }

  public static f a()
  {
    monitorenter;
    try
    {
      if (d == null)
        d = new f();
      f localf = d;
      return localf;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  protected static boolean a(String paramString, int paramInt)
  {
    int i = 5;
    int m;
    if (paramString.equals("report_cgi"))
    {
      m = com.tencent.open.utils.i.a(android.support.v4.app.b.t(), null).a("Common_CGIReportMaxcount");
      if (m != 0);
    }
    while (true)
    {
      com.tencent.open.a.f.b("openSDK_LOG.ReportManager", "-->availableCount, report: " + paramString + " | dataSize: " + paramInt + " | maxcount: " + i);
      int j = 0;
      if (paramInt >= i)
        j = 1;
      return j;
      i = m;
      continue;
      if (paramString.equals("report_via"))
      {
        int k = com.tencent.open.utils.i.a(android.support.v4.app.b.t(), null).a("Agent_ReportBatchCount");
        if (k == 0)
          continue;
        i = k;
        continue;
      }
      i = 0;
    }
  }

  private boolean a(String paramString1, String paramString2)
  {
    com.tencent.open.a.f.b("openSDK_LOG.ReportManager", "-->availableFrequency, report: " + paramString1 + " | ext: " + paramString2);
    if (TextUtils.isEmpty(paramString1))
      return false;
    if (paramString1.equals("report_cgi"));
    while (true)
    {
      try
      {
        int j = Integer.parseInt(paramString2);
        i = a(j);
        if (this.e.nextInt(100) >= i)
          continue;
        bool = true;
        com.tencent.open.a.f.b("openSDK_LOG.ReportManager", "-->availableFrequency, result: " + bool + " | frequency: " + i);
        return bool;
        bool = false;
        continue;
        if (paramString1.equals("report_via"))
        {
          i = android.support.v4.app.i.a(paramString2);
          if (this.e.nextInt(100) >= i)
            continue;
          bool = true;
          continue;
          bool = false;
          continue;
        }
      }
      catch (Exception localException)
      {
        return false;
      }
      int i = 100;
      boolean bool = false;
    }
  }

  public final void a(Bundle paramBundle, String paramString, boolean paramBoolean)
  {
    if (paramBundle == null);
    do
    {
      return;
      com.tencent.open.a.f.a("openSDK_LOG.ReportManager", "-->reportVia, bundle: " + paramBundle.toString());
    }
    while ((!a("report_via", paramString)) && (!paramBoolean));
    this.g.execute(new h(this, paramBundle, paramBoolean));
  }

  public final void a(String paramString, long paramLong1, long paramLong2, long paramLong3, int paramInt)
  {
    a(paramString, paramLong1, paramLong2, paramLong3, paramInt, "");
  }

  public final void a(String paramString1, long paramLong1, long paramLong2, long paramLong3, int paramInt, String paramString2)
  {
    com.tencent.open.a.f.a("openSDK_LOG.ReportManager", "-->reportCgi, command: " + paramString1 + " | startTime: " + paramLong1 + " | reqSize:" + paramLong2 + " | rspSize: " + paramLong3 + " | responseCode: " + paramInt + " | detail: " + paramString2);
    if (!a("report_cgi", String.valueOf(paramInt)))
      return;
    this.h.execute(new i(this, paramLong1, paramString1, paramString2, paramInt, paramLong2, paramLong3));
  }

  protected final void b()
  {
    this.h.execute(new j(this));
  }

  protected final Bundle c()
  {
    if (this.a.size() == 0)
      return null;
    b localb1 = (b)this.a.get(0);
    if (localb1 == null)
    {
      com.tencent.open.a.f.b("openSDK_LOG.ReportManager", "-->prepareCgiData, the 0th cgireportitem is null.");
      return null;
    }
    String str1 = (String)localb1.a.get("appid");
    List localList = e.a().a("report_cgi");
    if (localList != null)
      this.a.addAll(localList);
    com.tencent.open.a.f.b("openSDK_LOG.ReportManager", "-->prepareCgiData, mCgiList size: " + this.a.size());
    if (this.a.size() == 0)
      return null;
    Bundle localBundle = new Bundle();
    try
    {
      localBundle.putString("appid", str1);
      localBundle.putString("releaseversion", "OpenSdk_2.9.4");
      localBundle.putString("device", Build.DEVICE);
      localBundle.putString("qua", "V1_AND_OpenSDK_2.9.4_1077_RDM_B");
      localBundle.putString("key", "apn,frequency,commandid,resultcode,tmcost,reqsize,rspsize,detail,touin,deviceinfo");
      for (int i = 0; i < this.a.size(); i++)
      {
        b localb2 = (b)this.a.get(i);
        localBundle.putString(i + "_1", (String)localb2.a.get("apn"));
        localBundle.putString(i + "_2", (String)localb2.a.get("frequency"));
        localBundle.putString(i + "_3", (String)localb2.a.get("commandid"));
        localBundle.putString(i + "_4", (String)localb2.a.get("resultCode"));
        localBundle.putString(i + "_5", (String)localb2.a.get("timeCost"));
        localBundle.putString(i + "_6", (String)localb2.a.get("reqSize"));
        localBundle.putString(i + "_7", (String)localb2.a.get("rspSize"));
        localBundle.putString(i + "_8", (String)localb2.a.get("detail"));
        localBundle.putString(i + "_9", (String)localb2.a.get("uin"));
        String str2 = c.e(android.support.v4.app.b.t()) + "&" + (String)localb2.a.get("deviceInfo");
        localBundle.putString(i + "_10", str2);
      }
    }
    catch (Exception localException)
    {
      com.tencent.open.a.f.b("openSDK_LOG.ReportManager", "-->prepareCgiData, exception.", localException);
      return null;
    }
    com.tencent.open.a.f.a("openSDK_LOG.ReportManager", "-->prepareCgiData, end. params: " + localBundle.toString());
    return localBundle;
  }

  protected final Bundle d()
  {
    List localList = e.a().a("report_via");
    if (localList != null)
      this.b.addAll(localList);
    com.tencent.open.a.f.b("openSDK_LOG.ReportManager", "-->prepareViaData, mViaList size: " + this.b.size());
    if (this.b.size() == 0)
      return null;
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator1 = this.b.iterator();
    while (localIterator1.hasNext())
    {
      Serializable localSerializable = (Serializable)localIterator1.next();
      JSONObject localJSONObject2 = new JSONObject();
      b localb = (b)localSerializable;
      Iterator localIterator2 = localb.a.keySet().iterator();
      while (localIterator2.hasNext())
      {
        String str1 = (String)localIterator2.next();
        try
        {
          String str2 = (String)localb.a.get(str1);
          if (str2 == null)
            str2 = "";
          localJSONObject2.put(str1, str2);
        }
        catch (JSONException localJSONException2)
        {
          com.tencent.open.a.f.b("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", localJSONException2);
        }
      }
      localJSONArray.put(localJSONObject2);
    }
    com.tencent.open.a.f.a("openSDK_LOG.ReportManager", "-->prepareViaData, JSONArray array: " + localJSONArray.toString());
    Bundle localBundle = new Bundle();
    JSONObject localJSONObject1 = new JSONObject();
    try
    {
      localJSONObject1.put("data", localJSONArray);
      localBundle.putString("data", localJSONObject1.toString());
      return localBundle;
    }
    catch (JSONException localJSONException1)
    {
      com.tencent.open.a.f.b("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", localJSONException1);
    }
    return null;
  }

  protected final void e()
  {
    this.g.execute(new k(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.b.f
 * JD-Core Version:    0.6.0
 */