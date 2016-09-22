package com.tencent.open.utils;

import android.content.Context;
import android.os.Bundle;
import com.tencent.connect.b.c;
import com.tencent.open.a.f;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

final class e extends Thread
{
  e(c paramc, Context paramContext, String paramString1, Bundle paramBundle, String paramString2, com.tencent.tauth.a parama)
  {
  }

  public final void run()
  {
    try
    {
      JSONObject localJSONObject = a.a(this.a, this.b, this.c, this.d, this.e);
      if (this.f != null)
      {
        this.f.a(localJSONObject);
        f.b("openSDK_LOG.HttpUtils", "OpenApi onComplete");
      }
      return;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      while (this.f == null);
      this.f.a(localMalformedURLException);
      f.b("openSDK_LOG.HttpUtils", "OpenApi requestAsync MalformedURLException", localMalformedURLException);
      return;
    }
    catch (ConnectTimeoutException localConnectTimeoutException)
    {
      while (this.f == null);
      this.f.a(localConnectTimeoutException);
      f.b("openSDK_LOG.HttpUtils", "OpenApi requestAsync onConnectTimeoutException", localConnectTimeoutException);
      return;
    }
    catch (SocketTimeoutException localSocketTimeoutException)
    {
      while (this.f == null);
      this.f.a(localSocketTimeoutException);
      f.b("openSDK_LOG.HttpUtils", "OpenApi requestAsync onSocketTimeoutException", localSocketTimeoutException);
      return;
    }
    catch (HttpUtils.NetworkUnavailableException localNetworkUnavailableException)
    {
      while (this.f == null);
      this.f.a(localNetworkUnavailableException);
      f.b("openSDK_LOG.HttpUtils", "OpenApi requestAsync onNetworkUnavailableException", localNetworkUnavailableException);
      return;
    }
    catch (HttpUtils.HttpStatusException localHttpStatusException)
    {
      while (this.f == null);
      this.f.a(localHttpStatusException);
      f.b("openSDK_LOG.HttpUtils", "OpenApi requestAsync onHttpStatusException", localHttpStatusException);
      return;
    }
    catch (IOException localIOException)
    {
      while (this.f == null);
      this.f.a(localIOException);
      f.b("openSDK_LOG.HttpUtils", "OpenApi requestAsync IOException", localIOException);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (this.f == null);
      this.f.a(localJSONException);
      f.b("openSDK_LOG.HttpUtils", "OpenApi requestAsync JSONException", localJSONException);
      return;
    }
    catch (Exception localException)
    {
      while (this.f == null);
      this.f.a(localException);
      f.b("openSDK_LOG.HttpUtils", "OpenApi requestAsync onUnknowException", localException);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.utils.e
 * JD-Core Version:    0.6.0
 */