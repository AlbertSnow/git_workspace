package com.wandoujia.p4.pay.httpapi;

import android.content.Context;
import android.support.v4.app.b;
import com.android.volley.i;
import com.android.volley.j;
import com.android.volley.k;
import com.android.volley.m;
import com.android.volley.toolbox.f;
import com.android.volley.toolbox.s;
import com.android.volley.toolbox.x;
import com.wandoujia.p4.pay.model.ZendeskModels.TicketFieldResponse;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.p4.pay.utils.HttpUtil;
import com.wandoujia.p4.pay.utils.MD5;
import com.wandoujia.p4.pay.utils.SLog;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.json.JSONObject;

public class PayHttp
{
  public static final String PUBLICKEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCd95FnJFhPinpNiE/h4VA6bU1rzRa5+a25BxsnFX8TzquWxqDCoe4xG6QKXMXuKvV57tTRpzRo2jeto40eHKClzEgjx9lTYVb2RFHHFWio/YGTfnqIPTVpi7d7uHY+0FZ0lYL5LlW4E2+CQMxFOPRwfqGzMjs1SDlH7lVrLEVy6QIDAQAB";
  private static final int SOCKET_TIMEOUT = 3000;
  private i queue;

  public PayHttp(Context paramContext)
  {
    try
    {
      localf = new f(HttpUtil.getHttpClient());
      this.queue = b.a(paramContext, localf);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        f localf = new f(new DefaultHttpClient());
    }
  }

  public static ZendeskModels.TicketFieldResponse getTicketFieldResponse(Context paramContext)
  {
    return null;
  }

  private String shortUrl(String paramString)
  {
    String str = paramString.split("\\?")[0];
    return "[..." + str.substring(-20 + str.length()) + "] ";
  }

  private String urlJoinParams(String paramString, HashMap<String, String> paramHashMap)
  {
    Object localObject1;
    int i;
    String str2;
    if ((paramHashMap != null) && (paramHashMap.size() > 0))
    {
      String str1 = paramString + "?";
      Iterator localIterator = paramHashMap.keySet().iterator();
      localObject1 = str1;
      i = 1;
      if (localIterator.hasNext())
      {
        str2 = (String)localIterator.next();
        if (i != 0)
          break label171;
      }
    }
    label145: label171: for (Object localObject2 = (String)localObject1 + '&'; ; localObject2 = localObject1)
      try
      {
        String str3 = (String)localObject2 + str2 + "=" + URLEncoder.encode((String)paramHashMap.get(str2), "UTF-8");
        localObject2 = str3;
        localObject1 = localObject2;
        i = 0;
        break;
        paramString = (String)localObject1;
        SLog.i("URL", paramString);
        return paramString;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        break label145;
      }
  }

  public void addCookie(String paramString1, String paramString2, String paramString3)
  {
    BasicClientCookie localBasicClientCookie = new BasicClientCookie(paramString1, paramString2);
    localBasicClientCookie.setDomain(paramString3);
    localBasicClientCookie.setPath("/");
  }

  public void getJSON(String paramString, HashMap<String, String> paramHashMap, k<JSONObject> paramk, j paramj)
  {
    s locals = new s(urlJoinParams(paramString, paramHashMap), new PayHttp.1(this, paramk), new PayHttp.2(this, paramj));
    locals.a(getRetryPolicy());
    this.queue.a(locals);
  }

  public m getRetryPolicy()
  {
    return new m(3000, 1, 1.0F);
  }

  public void getString(String paramString, HashMap<String, String> paramHashMap, k<String> paramk, j paramj)
  {
    x localx = new x(urlJoinParams(paramString, paramHashMap), paramk, paramj, 0);
    localx.a(getRetryPolicy());
    this.queue.a(localx);
  }

  public void getWithMD5(String paramString, JSONObject paramJSONObject, k<JSONObject> paramk, j paramj)
  {
    String str1 = paramJSONObject.toString();
    String str2 = MD5.sign(str1, LocalStorage.getCurrentConfig().getSecretKey());
    HashMap localHashMap = new HashMap();
    localHashMap.put("content", str1);
    localHashMap.put("signType", "MD5");
    localHashMap.put("sign", str2);
    localHashMap.put("version", LocalStorage.getCurrentConfig().getSdkVersion());
    SLog.i("get", str1);
    getJSON(paramString, localHashMap, new PayHttp.3(this, paramk), paramj);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.httpapi.PayHttp
 * JD-Core Version:    0.6.0
 */