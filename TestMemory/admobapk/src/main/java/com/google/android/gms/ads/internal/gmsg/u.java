package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.s;
import com.google.android.gms.ads.internal.webview.b;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@a
public final class u
  implements t
{
  private final Context a;
  private final VersionInfoParcel b;

  public u(Context paramContext, VersionInfoParcel paramVersionInfoParcel)
  {
    this.a = paramContext;
    this.b = paramVersionInfoParcel;
  }

  private static y a(JSONObject paramJSONObject)
  {
    String str1 = paramJSONObject.optString("http_request_id");
    String str2 = paramJSONObject.optString("url");
    String str3 = paramJSONObject.optString("post_body", null);
    URL localURL;
    ArrayList localArrayList;
    try
    {
      localURL = new URL(str2);
      localArrayList = new ArrayList();
      JSONArray localJSONArray = paramJSONObject.optJSONArray("headers");
      if (localJSONArray == null)
        localJSONArray = new JSONArray();
      for (int i = 0; i < localJSONArray.length(); i++)
      {
        JSONObject localJSONObject = localJSONArray.optJSONObject(i);
        if (localJSONObject == null)
          continue;
        localArrayList.add(new x(localJSONObject.optString("key"), localJSONObject.optString("value")));
      }
    }
    catch (MalformedURLException localMalformedURLException)
    {
      while (true)
      {
        c.b("Error constructing http request.", localMalformedURLException);
        localURL = null;
      }
    }
    return new y(str1, localURL, localArrayList, str3);
  }

  private z a(y paramy)
  {
    HttpURLConnection localHttpURLConnection;
    try
    {
      localHttpURLConnection = (HttpURLConnection)paramy.b.openConnection();
      bc.a().e.a(this.a, this.b.b, false, localHttpURLConnection);
      Iterator localIterator1 = paramy.c.iterator();
      while (localIterator1.hasNext())
      {
        x localx = (x)localIterator1.next();
        localHttpURLConnection.addRequestProperty(localx.a, localx.b);
      }
    }
    catch (Exception localException)
    {
      return new z(this, false, null, localException.toString());
    }
    if (!TextUtils.isEmpty(paramy.d))
    {
      localHttpURLConnection.setDoOutput(true);
      byte[] arrayOfByte = paramy.d.getBytes();
      localHttpURLConnection.setFixedLengthStreamingMode(arrayOfByte.length);
      BufferedOutputStream localBufferedOutputStream = new BufferedOutputStream(localHttpURLConnection.getOutputStream());
      localBufferedOutputStream.write(arrayOfByte);
      localBufferedOutputStream.close();
    }
    ArrayList localArrayList = new ArrayList();
    if (localHttpURLConnection.getHeaderFields() != null)
    {
      Iterator localIterator2 = localHttpURLConnection.getHeaderFields().entrySet().iterator();
      while (localIterator2.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator2.next();
        Iterator localIterator3 = ((List)localEntry.getValue()).iterator();
        while (localIterator3.hasNext())
        {
          String str2 = (String)localIterator3.next();
          localArrayList.add(new x((String)localEntry.getKey(), str2));
        }
      }
    }
    String str1 = paramy.a;
    int i = localHttpURLConnection.getResponseCode();
    z localz = new z(this, true, new aa(str1, i, localArrayList, com.google.android.gms.ads.internal.util.y.a(new InputStreamReader(localHttpURLConnection.getInputStream()))), null);
    return localz;
  }

  private static JSONObject a(aa paramaa)
  {
    JSONObject localJSONObject = new JSONObject();
    JSONArray localJSONArray;
    try
    {
      localJSONObject.put("http_request_id", paramaa.a);
      if (paramaa.d != null)
        localJSONObject.put("body", paramaa.d);
      localJSONArray = new JSONArray();
      Iterator localIterator = paramaa.c.iterator();
      while (localIterator.hasNext())
      {
        x localx = (x)localIterator.next();
        localJSONArray.put(new JSONObject().put("key", localx.a).put("value", localx.b));
      }
    }
    catch (JSONException localJSONException)
    {
      c.b("Error constructing JSON for http response.", localJSONException);
      return localJSONObject;
    }
    localJSONObject.put("headers", localJSONArray);
    localJSONObject.put("response_code", paramaa.b);
    return localJSONObject;
  }

  // ERROR //
  public final JSONObject a(String paramString)
  {
    // Byte code:
    //   0: new 27	org/json/JSONObject
    //   3: dup
    //   4: aload_1
    //   5: invokespecial 269	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   8: astore_2
    //   9: new 27	org/json/JSONObject
    //   12: dup
    //   13: invokespecial 240	org/json/JSONObject:<init>	()V
    //   16: astore_3
    //   17: ldc_w 271
    //   20: astore 4
    //   22: aload_2
    //   23: ldc 25
    //   25: invokevirtual 31	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   28: astore 4
    //   30: aload_0
    //   31: aload_2
    //   32: invokestatic 273	com/google/android/gms/ads/internal/gmsg/u:a	(Lorg/json/JSONObject;)Lcom/google/android/gms/ads/internal/gmsg/y;
    //   35: invokespecial 275	com/google/android/gms/ads/internal/gmsg/u:a	(Lcom/google/android/gms/ads/internal/gmsg/y;)Lcom/google/android/gms/ads/internal/gmsg/z;
    //   38: astore 10
    //   40: aload 10
    //   42: getfield 278	com/google/android/gms/ads/internal/gmsg/z:b	Z
    //   45: ifeq +67 -> 112
    //   48: aload_3
    //   49: ldc_w 280
    //   52: aload 10
    //   54: getfield 283	com/google/android/gms/ads/internal/gmsg/z:a	Lcom/google/android/gms/ads/internal/gmsg/aa;
    //   57: invokestatic 285	com/google/android/gms/ads/internal/gmsg/u:a	(Lcom/google/android/gms/ads/internal/gmsg/aa;)Lorg/json/JSONObject;
    //   60: invokevirtual 245	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   63: pop
    //   64: aload_3
    //   65: ldc_w 287
    //   68: iconst_1
    //   69: invokevirtual 290	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   72: pop
    //   73: aload_3
    //   74: areturn
    //   75: astore 16
    //   77: ldc_w 292
    //   80: invokestatic 294	com/google/android/gms/ads/internal/util/c:c	(Ljava/lang/String;)V
    //   83: new 27	org/json/JSONObject
    //   86: dup
    //   87: invokespecial 240	org/json/JSONObject:<init>	()V
    //   90: ldc_w 287
    //   93: iconst_0
    //   94: invokevirtual 290	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   97: astore 18
    //   99: aload 18
    //   101: areturn
    //   102: astore 17
    //   104: new 27	org/json/JSONObject
    //   107: dup
    //   108: invokespecial 240	org/json/JSONObject:<init>	()V
    //   111: areturn
    //   112: aload_3
    //   113: ldc_w 280
    //   116: new 27	org/json/JSONObject
    //   119: dup
    //   120: invokespecial 240	org/json/JSONObject:<init>	()V
    //   123: ldc 25
    //   125: aload 4
    //   127: invokevirtual 245	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   130: invokevirtual 245	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   133: pop
    //   134: aload_3
    //   135: ldc_w 287
    //   138: iconst_0
    //   139: invokevirtual 290	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   142: pop
    //   143: aload_3
    //   144: ldc_w 296
    //   147: aload 10
    //   149: getfield 298	com/google/android/gms/ads/internal/gmsg/z:c	Ljava/lang/String;
    //   152: invokevirtual 245	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   155: pop
    //   156: aload_3
    //   157: areturn
    //   158: astore 5
    //   160: aload_3
    //   161: ldc_w 280
    //   164: new 27	org/json/JSONObject
    //   167: dup
    //   168: invokespecial 240	org/json/JSONObject:<init>	()V
    //   171: ldc 25
    //   173: aload 4
    //   175: invokevirtual 245	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   178: invokevirtual 245	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   181: pop
    //   182: aload_3
    //   183: ldc_w 287
    //   186: iconst_0
    //   187: invokevirtual 290	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   190: pop
    //   191: aload_3
    //   192: ldc_w 296
    //   195: aload 5
    //   197: invokevirtual 149	java/lang/Exception:toString	()Ljava/lang/String;
    //   200: invokevirtual 245	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   203: pop
    //   204: aload_3
    //   205: areturn
    //   206: astore 6
    //   208: aload_3
    //   209: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   0	9	75	org/json/JSONException
    //   83	99	102	org/json/JSONException
    //   22	73	158	java/lang/Exception
    //   112	156	158	java/lang/Exception
    //   160	204	206	org/json/JSONException
  }

  public final void a(b paramb, Map paramMap)
  {
    s.a(new v(this, paramMap, paramb));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.u
 * JD-Core Version:    0.6.0
 */