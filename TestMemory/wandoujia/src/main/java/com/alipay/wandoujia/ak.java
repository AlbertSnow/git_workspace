package com.alipay.wandoujia;

import android.support.v4.app.b;
import android.text.TextUtils;
import com.alipay.android.app.exception.AppErrorException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import org.json.JSONException;
import org.json.JSONObject;

public final class ak
  implements mc
{
  public final md a()
  {
    return md.b;
  }

  public final void b(ae paramae)
  {
    u localu = paramae.b();
    JSONObject localJSONObject1 = paramae.d();
    if (localJSONObject1.has("form"))
      paramae.a(localJSONObject1.optJSONObject("form").optString("time"));
    r localr1 = paramae.a().e();
    r localr2 = paramae.b().a;
    if (TextUtils.isEmpty(localr2.c()))
      localr2.c(localr1.c());
    if (TextUtils.isEmpty(localr2.d()))
      localr2.d(localr1.d());
    if (TextUtils.isEmpty(localr2.b()))
      localr2.b(localr1.b());
    if (TextUtils.isEmpty(localr2.a()))
      localr2.a(localr1.a());
    JSONObject localJSONObject2 = localJSONObject1.optJSONObject("reflected_data");
    if (localJSONObject2 != null)
    {
      new StringBuilder("session = ").append(localJSONObject2.optString("session", ""));
      b.f();
      paramae.b().a(localJSONObject2);
    }
    while (true)
    {
      localu.b(localJSONObject1.optString("end_code", "0"));
      localu.e(localJSONObject1.optString("user_id", ""));
      Object localObject = localJSONObject1.optString("result");
      try
      {
        String str = URLDecoder.decode(localJSONObject1.optString("result"), "UTF-8");
        localObject = str;
        localu.c((String)localObject);
        localu.d(localJSONObject1.optString("memo", ""));
        return;
        if (!localJSONObject1.has("session"))
          continue;
        JSONObject localJSONObject3 = new JSONObject();
        try
        {
          localJSONObject3.put("session", localJSONObject1.optString("session"));
          if (!TextUtils.isEmpty(ac.e().a()))
            localJSONObject3.put("tid", ac.e().a());
          localu.a(localJSONObject3);
        }
        catch (JSONException localJSONException)
        {
          throw new AppErrorException(getClass(), "can not put reflected values");
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        while (true)
          b.b(localUnsupportedEncodingException);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.ak
 * JD-Core Version:    0.6.0
 */