package com.unipay.e.a;

import android.content.Context;
import android.os.Build;
import com.alipay.wandoujia.ac;
import com.alipay.wandoujia.id;
import com.alipay.wandoujia.x;
import java.io.PrintStream;
import java.util.Vector;
import org.json.JSONObject;

public final class b
{
  private Context a;
  private boolean b;
  private String c;

  public b(Context paramContext, boolean paramBoolean, String paramString)
  {
    this.a = paramContext;
    this.b = paramBoolean;
    this.c = paramString;
  }

  public static int a(d paramd, String paramString)
  {
    try
    {
      Vector localVector = paramd.a;
      for (int i = 0; i < localVector.size(); i++)
      {
        c localc = (c)localVector.elementAt(i);
        if (!new String(localc.b, "UTF-8").equals(paramString))
          continue;
        int j = android.support.v4.app.b.f(localc.d);
        return j;
      }
      return -1;
    }
    catch (Exception localException)
    {
    }
    return -1;
  }

  public static e a(a parama, String paramString)
  {
    if (parama != null)
    {
      Vector localVector = parama.a;
      if (localVector != null)
        for (int i = 0; i < localVector.size(); i++)
        {
          e locale = (e)localVector.elementAt(i);
          if (new String(locale.a, "UTF-8").equals(paramString))
            return locale;
        }
    }
    return null;
  }

  public static String b(d paramd, String paramString)
  {
    try
    {
      Vector localVector = paramd.a;
      for (int i = 0; i < localVector.size(); i++)
      {
        c localc = (c)localVector.elementAt(i);
        if (!new String(localc.b, "UTF-8").equals(paramString))
          continue;
        String str = new String(localc.d, "UTF-8");
        return str;
      }
      return null;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final com.alipay.android.app.e a()
  {
    try
    {
      JSONObject localJSONObject1 = new JSONObject();
      localJSONObject1.put("namespace", "com.alipay.mcashier");
      localJSONObject1.put("api_version", "1.0.0");
      localJSONObject1.put("api_name", "sdk_pay");
      JSONObject localJSONObject2 = new JSONObject();
      localJSONObject1.put("params", localJSONObject2);
      ac localac = ac.e();
      localJSONObject2.put("alixtid", localac.a());
      localJSONObject2.put("clientKey", localac.b());
      localJSONObject2.put("clientId", x.a(this.a).d());
      localJSONObject2.put("deviceVersion", Build.MODEL);
      String str1 = "quickpay";
      if (x.c(this.a))
        str1 = str1 + "|alipay";
      if (x.d(this.a))
        str1 = str1 + "|safepay";
      localJSONObject2.put("installedClient", str1);
      localJSONObject2.put("network", x.b(this.a).b());
      localJSONObject2.put("orderInfo", this.c);
      if (this.b);
      for (String str2 = "after"; ; str2 = "before")
      {
        localJSONObject2.put("pay_phase", str2);
        localJSONObject2.put("platform", "ANDROID");
        localJSONObject2.put("user_agent", com.wandoujia.image.c.a.a().c().a(localac));
        JSONObject localJSONObject3 = new JSONObject();
        localJSONObject3.put("data", localJSONObject1);
        com.alipay.android.app.e locale = new com.alipay.android.app.e(new JSONObject(android.support.v4.app.b.a(android.support.v4.app.b.a(this.a, com.wandoujia.image.c.a.a().c().h(), localJSONObject3.toString()))).getJSONObject("data").getJSONObject("params"));
        System.out.println(locale.toString());
        return locale;
      }
    }
    catch (Exception localException)
    {
      android.support.v4.app.b.b(localException);
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.e.a.b
 * JD-Core Version:    0.6.0
 */