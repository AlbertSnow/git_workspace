package com.alipay.wandoujia;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.app.exception.AppErrorException;
import com.alipay.android.app.exception.FailOperatingException;
import com.alipay.android.app.exception.NetErrorException;
import java.util.Calendar;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.json.JSONException;
import org.json.JSONObject;

public final class ag
{
  private int a = 0;
  private com.wandoujia.clean.b.a b;

  public ag()
  {
  }

  public ag(com.wandoujia.clean.b.a parama)
  {
    this.b = parama;
  }

  private String a(Context paramContext, String paramString1, String paramString2, com.wandoujia.clean.b.a parama, u paramu)
  {
    try
    {
      HttpResponse localHttpResponse = android.support.v4.app.b.a(paramContext, paramString1, paramString2, parama);
      StatusLine localStatusLine = localHttpResponse.getStatusLine();
      paramu.a(localStatusLine.getStatusCode());
      paramu.a(localStatusLine.getReasonPhrase());
      android.support.v4.app.d.a(this.b, localHttpResponse);
      String str = android.support.v4.app.b.a(localHttpResponse);
      return str;
    }
    catch (Exception localException)
    {
    }
    throw new NetErrorException();
  }

  private JSONObject a(Context paramContext, t paramt, u paramu)
  {
    String str1 = com.wandoujia.image.c.a.f();
    try
    {
      str2 = a(paramContext, paramt.a(), paramt.a(str1).toString(), paramt.b(), paramu);
      android.support.v4.app.b.f();
      paramu.a(Calendar.getInstance().getTimeInMillis());
      if (paramt.c())
      {
        localJSONObject2 = a(str2, paramu);
        if ((paramu.h() == 1000) && (this.a < 3))
        {
          this.a = (1 + this.a);
          return a(paramContext, paramt, paramu);
        }
        if (paramu.h() != 0)
        {
          i.a().a("server cann't respone data", paramt.toString());
          throw new FailOperatingException(paramu.i());
        }
      }
    }
    catch (NetErrorException localNetErrorException)
    {
      JSONObject localJSONObject2;
      throw localNetErrorException;
      this.a = 0;
      str3 = localJSONObject2.optString("res_data");
      if (TextUtils.isEmpty(str3))
        throw new AppErrorException(getClass(), "response data is empty");
    }
    catch (FailOperatingException localFailOperatingException)
    {
      String str3;
      throw localFailOperatingException;
      String str4 = com.alipay.android.app.a.b.b(str1, str3);
      android.support.v4.app.b.e();
      JSONObject localJSONObject3 = new JSONObject(str4);
      return localJSONObject3;
    }
    catch (AppErrorException localAppErrorException)
    {
      String str2;
      throw localAppErrorException;
      JSONObject localJSONObject1 = a(str2, paramu);
      new StringBuilder("respData:").append(localJSONObject1.toString());
      android.support.v4.app.b.e();
      return localJSONObject1;
    }
    catch (Exception localException)
    {
      android.support.v4.app.b.b(localException);
    }
    throw new NetErrorException();
  }

  private static JSONObject a(String paramString, u paramu)
  {
    JSONObject localJSONObject1 = new JSONObject(paramString).optJSONObject("data");
    if (localJSONObject1 != null)
    {
      paramu.a(localJSONObject1.optInt("code", 503));
      paramu.a(localJSONObject1.optString("error_msg", ""));
      JSONObject localJSONObject2 = localJSONObject1.optJSONObject("params");
      if (localJSONObject2 != null)
      {
        if (paramu.h() == 1000)
        {
          String str = localJSONObject2.optString("public_key");
          if (TextUtils.isEmpty(str))
            break label154;
          com.wandoujia.image.c.a.a().c().a(str);
        }
        while (true)
        {
          r localr = new r();
          localr.c(localJSONObject2.optString("next_api_name"));
          localr.d(localJSONObject2.optString("next_api_version"));
          localr.b(localJSONObject2.optString("next_namespace"));
          localr.a(localJSONObject2.optString("next_request_url"));
          paramu.a = localr;
          return localJSONObject2;
          label154: i.a().a("update rsa key", "rsponse data is no key");
        }
      }
      if (paramu.h() == 1000)
        i.a().a("update rsa key", "rsponse data is no key");
    }
    while (true)
    {
      return null;
      paramu.a(503);
      paramu.a("");
    }
  }

  public final ae a(Context paramContext, t paramt)
  {
    u localu = new u();
    JSONObject localJSONObject1 = a(paramContext, paramt, localu);
    JSONObject localJSONObject2 = localJSONObject1.optJSONObject("reflected_data");
    md localmd = paramt.d();
    if (localJSONObject2 != null)
    {
      if (!TextUtils.equals("true", localJSONObject2.optString("minipay")))
        break label127;
      localmd = md.b;
    }
    try
    {
      boolean bool;
      if (localmd == md.b)
        if (localJSONObject1.has("form"))
          if (localJSONObject1.has("https"))
            if (localJSONObject1.getBoolean("https"))
            {
              bool = false;
              label100: localu.a(bool);
            }
      while (true)
      {
        label106: ae localae = new ae(paramt, localu);
        localae.a(localJSONObject1);
        return localae;
        label127: localmd = md.a;
        break;
        bool = true;
        break label100;
        localu.a(false);
        continue;
        localu.a(paramt.c());
        continue;
        localu.a(true);
      }
    }
    catch (JSONException localJSONException)
    {
      break label106;
    }
  }

  public final ae b(Context paramContext, t paramt)
  {
    return af.a(paramt.d(), a(paramContext, paramt));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.ag
 * JD-Core Version:    0.6.0
 */