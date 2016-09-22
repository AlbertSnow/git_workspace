package com.unipay.b;

import android.content.Context;
import java.util.ArrayList;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b
{
  private JSONObject a = null;
  private Context b;

  public b(Context paramContext)
  {
    this.b = paramContext;
  }

  private String c(String paramString)
  {
    try
    {
      String str = this.a.getString(paramString);
      return str;
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  private static ArrayList<a> d(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    try
    {
      JSONArray localJSONArray = new JSONArray(paramString);
      for (int i = 0; i < localJSONArray.length(); i++)
      {
        JSONObject localJSONObject = localJSONArray.getJSONObject(i);
        localArrayList.add(new a(Integer.valueOf(localJSONObject.getString("errorCode")).intValue(), localJSONObject.getString("errorMsg"), localJSONObject.getString("errorNotice"), localJSONObject.getString("errorAdv")));
      }
    }
    catch (Exception localException)
    {
    }
    return localArrayList;
  }

  private static String e(String paramString)
  {
    try
    {
      HttpGet localHttpGet = new HttpGet(paramString);
      BasicHttpParams localBasicHttpParams = new BasicHttpParams();
      HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, 10000);
      HttpConnectionParams.setSoTimeout(localBasicHttpParams, 10000);
      localHttpGet.setParams(localBasicHttpParams);
      HttpResponse localHttpResponse = new DefaultHttpClient().execute(localHttpGet);
      if (localHttpResponse.getStatusLine().getStatusCode() == 200)
      {
        String str = EntityUtils.toString(localHttpResponse.getEntity());
        return str;
      }
    }
    catch (Exception localException)
    {
    }
    return "";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.b.b
 * JD-Core Version:    0.6.0
 */