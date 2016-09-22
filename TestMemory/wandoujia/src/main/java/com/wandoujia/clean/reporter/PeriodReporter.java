package com.wandoujia.clean.reporter;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Base64;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.base.utils.SharePrefSubmitor;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.clean.http.Config;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.List<Lorg.apache.http.message.BasicNameValuePair;>;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

public final class PeriodReporter
{
  private static List<BasicNameValuePair> a(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    if (paramString2 == null);
    while (true)
    {
      return null;
      if (paramBoolean);
      try
      {
        String str;
        for (Object localObject = android.support.v4.app.b.g(paramString2); !android.support.v4.app.b.d((String)localObject); localObject = str)
        {
          ArrayList localArrayList = new ArrayList();
          StringBuilder localStringBuilder = new StringBuilder();
          if (!android.support.v4.app.b.d(paramString1))
          {
            localArrayList.add(new BasicNameValuePair("serviceId", paramString1));
            localStringBuilder.append("serviceId=");
            localStringBuilder.append(paramString1);
            localStringBuilder.append("&");
          }
          if (!android.support.v4.app.b.d(paramString3))
          {
            localArrayList.add(new BasicNameValuePair("version", paramString3));
            localStringBuilder.append("version=");
            localStringBuilder.append(paramString3);
            localStringBuilder.append("&");
          }
          localArrayList.add(new BasicNameValuePair("data", (String)localObject));
          localStringBuilder.append("data=");
          localStringBuilder.append((String)localObject);
          localStringBuilder.append("02000016-0010-0080-8000-10CA006D2CA5");
          localArrayList.add(new BasicNameValuePair("sign", android.support.v4.app.b.e(localStringBuilder.toString())));
          new StringBuilder(String.valueOf(localStringBuilder.toString())).append(localArrayList.toString());
          return localArrayList;
          str = Base64.encodeToString(paramString2.getBytes(), 8);
        }
      }
      catch (Exception localException)
      {
        localException.getMessage();
      }
    }
    return (List<BasicNameValuePair>)null;
  }

  public static HttpResponse a(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean)
  {
    if (paramString3 == null);
    while (true)
    {
      return null;
      try
      {
        HttpPost localHttpPost = new HttpPost(paramString1);
        List localList = a(paramString2, paramString3, paramString4, paramBoolean);
        if (localList == null)
          continue;
        localHttpPost.setEntity(new UrlEncodedFormEntity(localList, "UTF-8"));
        BasicHttpParams localBasicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, 5000);
        HttpConnectionParams.setSoTimeout(localBasicHttpParams, 5000);
        HttpResponse localHttpResponse = new DefaultHttpClient(localBasicHttpParams).execute(localHttpPost);
        return localHttpResponse;
      }
      catch (Exception localException)
      {
        localException.getMessage();
      }
    }
    return null;
  }

  public static void a()
  {
    if (!SystemUtil.aboveApiLevel(9));
    long l1;
    long l2;
    do
    {
      return;
      l1 = Config.a().getLong("last_fp_connection_time", 0L);
      l2 = System.currentTimeMillis();
    }
    while ((l2 - l1 <= 604800000L) || (!NetworkUtil.isWifiConnected(GlobalConfig.getAppContext())));
    SharedPreferences.Editor localEditor = Config.a().edit();
    localEditor.putLong("last_fp_connection_time", l2);
    SharePrefSubmitor.submit(localEditor);
    new Thread(new a()).start();
  }

  private static void a(int paramInt, File paramFile, List<PeriodReporter.FileLogBean> paramList)
  {
    int i = 0;
    PeriodReporter.FileLogBean localFileLogBean = new PeriodReporter.FileLogBean(null);
    localFileLogBean.filePath = com.wandoujia.clean.b.a.a(paramFile.getAbsolutePath());
    String[] arrayOfString = paramFile.list();
    int j;
    if (arrayOfString != null)
    {
      j = arrayOfString.length;
      localFileLogBean.childCount = j;
      if (!TextUtils.isEmpty(localFileLogBean.filePath))
      {
        paramList.add(localFileLogBean);
        if (paramList.size() >= 10)
        {
          if (NetworkUtil.isWifiConnected(GlobalConfig.getAppContext()))
            new HashMap();
          paramList.clear();
        }
      }
      if (localFileLogBean.childCount <= 300)
        break label119;
    }
    label119: 
    do
    {
      return;
      j = 0;
      break;
      if (!com.wandoujia.clean.b.b.b(localFileLogBean.filePath))
        continue;
      paramInt = 0;
    }
    while ((paramInt + 1 >= 4) || (arrayOfString == null));
    int k = arrayOfString.length;
    label149: File localFile;
    if (i < k)
    {
      String str = arrayOfString[i];
      localFile = new File(paramFile.getAbsolutePath(), str);
      if (!localFile.isDirectory())
        break label199;
      a(paramInt + 1, localFile, paramList);
    }
    while (true)
    {
      i++;
      break label149;
      break;
      label199: if ((localFile.length() <= 10485760L) || (!NetworkUtil.isWifiConnected(GlobalConfig.getAppContext())))
        continue;
      HashMap localHashMap = new HashMap();
      localHashMap.put("size", String.valueOf(localFile.length()));
      localHashMap.put("path", com.wandoujia.clean.b.a.a(localFile.getAbsolutePath()));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.reporter.PeriodReporter
 * JD-Core Version:    0.6.0
 */