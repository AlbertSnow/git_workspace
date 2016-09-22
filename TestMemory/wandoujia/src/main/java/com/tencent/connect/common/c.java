package com.tencent.connect.common;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.tencent.open.utils.HttpUtils.HttpStatusException;
import com.tencent.open.utils.HttpUtils.NetworkUnavailableException;
import com.tencent.tauth.a;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
  implements a
{
  private final com.tencent.tauth.b a;
  private final Handler b;

  public c(com.tencent.tauth.b paramb)
  {
    this.a = paramb;
    this.b = new d(this, android.support.v4.app.b.t().getMainLooper());
  }

  public final void a(HttpUtils.HttpStatusException paramHttpStatusException)
  {
    Message localMessage = this.b.obtainMessage();
    localMessage.obj = paramHttpStatusException.getMessage();
    localMessage.what = -9;
    this.b.sendMessage(localMessage);
  }

  public final void a(HttpUtils.NetworkUnavailableException paramNetworkUnavailableException)
  {
    Message localMessage = this.b.obtainMessage();
    localMessage.obj = paramNetworkUnavailableException.getMessage();
    localMessage.what = -10;
    this.b.sendMessage(localMessage);
  }

  public final void a(IOException paramIOException)
  {
    Message localMessage = this.b.obtainMessage();
    localMessage.obj = paramIOException.getMessage();
    localMessage.what = -2;
    this.b.sendMessage(localMessage);
  }

  public final void a(Exception paramException)
  {
    Message localMessage = this.b.obtainMessage();
    localMessage.obj = paramException.getMessage();
    localMessage.what = -6;
    this.b.sendMessage(localMessage);
  }

  public final void a(MalformedURLException paramMalformedURLException)
  {
    Message localMessage = this.b.obtainMessage();
    localMessage.obj = paramMalformedURLException.getMessage();
    localMessage.what = -3;
    this.b.sendMessage(localMessage);
  }

  public final void a(SocketTimeoutException paramSocketTimeoutException)
  {
    Message localMessage = this.b.obtainMessage();
    localMessage.obj = paramSocketTimeoutException.getMessage();
    localMessage.what = -8;
    this.b.sendMessage(localMessage);
  }

  public final void a(ConnectTimeoutException paramConnectTimeoutException)
  {
    Message localMessage = this.b.obtainMessage();
    localMessage.obj = paramConnectTimeoutException.getMessage();
    localMessage.what = -7;
    this.b.sendMessage(localMessage);
  }

  public final void a(JSONException paramJSONException)
  {
    Message localMessage = this.b.obtainMessage();
    localMessage.obj = paramJSONException.getMessage();
    localMessage.what = -4;
    this.b.sendMessage(localMessage);
  }

  public final void a(JSONObject paramJSONObject)
  {
    Message localMessage = this.b.obtainMessage();
    localMessage.obj = paramJSONObject;
    localMessage.what = 0;
    this.b.sendMessage(localMessage);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.common.c
 * JD-Core Version:    0.6.0
 */