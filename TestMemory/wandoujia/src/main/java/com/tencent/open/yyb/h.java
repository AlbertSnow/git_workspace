package com.tencent.open.yyb;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.tencent.open.a.f;
import com.tencent.open.utils.o;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class h
{
  private WebView a;

  public h(WebView paramWebView)
  {
    this.a = paramWebView;
  }

  private void a(Uri paramUri, String paramString1, int paramInt, String paramString2)
  {
    f.a("openSDK_LOG.AppbarJsBridge", "-->callAMethod : uri = " + paramUri);
    try
    {
      Class[] arrayOfClass = new Class[4];
      arrayOfClass[0] = Uri.class;
      arrayOfClass[1] = Integer.TYPE;
      arrayOfClass[2] = String.class;
      arrayOfClass[3] = String.class;
      Method localMethod = h.class.getDeclaredMethod(paramString1, arrayOfClass);
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = paramUri;
      arrayOfObject[1] = Integer.valueOf(paramInt);
      arrayOfObject[2] = paramString1;
      arrayOfObject[3] = paramString2;
      localMethod.invoke(this, arrayOfObject);
      return;
    }
    catch (Exception localException)
    {
      do
        f.a("openSDK_LOG.AppbarJsBridge", "-->callAMethod : Exception = ", localException);
      while (TextUtils.isEmpty(paramString2));
      a(paramString2, paramInt, paramString1, -3);
    }
  }

  private void a(String paramString1, int paramInt, String paramString2, Map<String, String> paramMap)
  {
    if (TextUtils.isEmpty(paramString1))
      return;
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("result", 0);
      localJSONObject.put("data", paramString2);
      if (!TextUtils.isEmpty(null))
        localJSONObject.put("method", null);
      localJSONObject.put("seqid", paramInt);
      if (paramMap != null)
      {
        Iterator localIterator = paramMap.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          localJSONObject.put(str, paramMap.get(str));
        }
      }
      a(paramString1, localJSONObject.toString());
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private void a(String paramString1, String paramString2)
  {
    if (this.a != null)
    {
      StringBuffer localStringBuffer = new StringBuffer("javascript:");
      localStringBuffer.append("if(!!").append(paramString1).append("){");
      localStringBuffer.append(paramString1);
      localStringBuffer.append("(");
      localStringBuffer.append(paramString2);
      localStringBuffer.append(")}");
      this.a.loadUrl(localStringBuffer.toString());
    }
  }

  public final void a(int paramInt)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("type", String.valueOf(paramInt));
    a("shareCallback", 0, "0", localHashMap);
  }

  public final void a(String paramString)
  {
    f.a("openSDK_LOG.AppbarJsBridge", "-->invoke : url = " + paramString);
    Uri localUri = Uri.parse(paramString);
    String str1 = localUri.getHost();
    f.a("openSDK_LOG.AppbarJsBridge", "-->invoke : hostAsMethodName = " + str1);
    if (TextUtils.isEmpty(str1))
      return;
    List localList = localUri.getPathSegments();
    int i;
    String str2;
    if ((localList != null) && (localList.size() > 0))
    {
      i = o.i((String)localList.get(0));
      int n = localList.size();
      str2 = null;
      if (n > 1)
        str2 = (String)localList.get(1);
    }
    while (true)
    {
      f.a("openSDK_LOG.AppbarJsBridge", "-->invoke : seqid = " + i + " callbackName = " + str2);
      if (str1.equals("callBatch"))
        while (true)
        {
          int k;
          String str3;
          int m;
          String str4;
          StringBuilder localStringBuilder1;
          try
          {
            JSONArray localJSONArray = new JSONArray(localUri.getQueryParameter("param"));
            int j = localJSONArray.length();
            k = 0;
            if (k >= j)
              break;
            JSONObject localJSONObject1 = localJSONArray.getJSONObject(k);
            str3 = localJSONObject1.getString("method");
            m = localJSONObject1.getInt("seqid");
            str4 = localJSONObject1.optString("callback");
            JSONObject localJSONObject2 = localJSONObject1.getJSONObject("args");
            localStringBuilder1 = new StringBuilder();
            StringBuilder localStringBuilder2 = localStringBuilder1.append("jsb://").append(str3).append("/").append(m).append("/");
            if (TextUtils.isEmpty(str4))
              break label408;
            str5 = str4;
            localStringBuilder2.append(str5).append("?");
            if (localJSONObject2 == null)
              break label416;
            Iterator localIterator = localJSONObject2.keys();
            if (!localIterator.hasNext())
              break label416;
            String str6 = (String)localIterator.next();
            String str7 = Uri.decode(localJSONObject2.getString(str6));
            localStringBuilder1.append(str6).append("=").append(Uri.encode(str7)).append("&");
            continue;
          }
          catch (Exception localException)
          {
          }
          if (TextUtils.isEmpty(str2))
            break;
          a(str2, i, str1, -5);
          return;
          label408: String str5 = "";
          continue;
          label416: a(Uri.parse(localStringBuilder1.toString()), str3, m, str4);
          k++;
        }
      a(localUri, str1, i, str2);
      return;
      str2 = null;
      i = 0;
    }
  }

  public final void a(String paramString1, int paramInt, String paramString2)
  {
    a(paramString1, paramInt, paramString2, null);
  }

  public final void a(String paramString1, int paramInt1, String paramString2, int paramInt2)
  {
    if (TextUtils.isEmpty(paramString1))
      return;
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("result", -1);
      localJSONObject.put("code", paramInt2);
      localJSONObject.put("method", paramString2);
      localJSONObject.put("seqid", paramInt1);
      a(paramString1, localJSONObject.toString());
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final void b(int paramInt)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("type", String.valueOf(paramInt));
    a("shareCallback", 0, "1", localHashMap);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.yyb.h
 * JD-Core Version:    0.6.0
 */