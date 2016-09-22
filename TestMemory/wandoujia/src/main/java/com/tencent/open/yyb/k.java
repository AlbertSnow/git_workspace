package com.tencent.open.yyb;

import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.open.a.f;
import com.tencent.open.utils.a;
import com.tencent.open.utils.o;
import com.tencent.open.utils.q;
import org.json.JSONObject;

final class k extends AsyncTask<Bundle, Void, Void>
{
  private static Void a(Bundle[] paramArrayOfBundle)
  {
    if (paramArrayOfBundle == null)
      return null;
    String str;
    if (paramArrayOfBundle.length == 2)
    {
      str = paramArrayOfBundle[1].getString("uri");
      if (TextUtils.isEmpty(str));
    }
    while (true)
    {
      try
      {
        int i = o.c(a.a(null, str, "GET", paramArrayOfBundle[0]).a).getInt("ret");
        f.b("openSDK_LOG.AppbarUtil", "-->(ViaAsyncTask)doInBackground : ret = " + i);
        return null;
      }
      catch (Exception localException)
      {
        f.b("openSDK_LOG.AppbarUtil", "-->(ViaAsyncTask)doInBackground : Exception = ", localException);
        return null;
      }
      str = "http://analy.qq.com/cgi-bin/mapp_apptrace";
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.yyb.k
 * JD-Core Version:    0.6.0
 */