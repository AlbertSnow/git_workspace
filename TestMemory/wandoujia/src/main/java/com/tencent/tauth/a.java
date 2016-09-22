package com.tencent.tauth;

import com.tencent.open.utils.HttpUtils.HttpStatusException;
import com.tencent.open.utils.HttpUtils.NetworkUnavailableException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public abstract interface a
{
  public abstract void a(HttpUtils.HttpStatusException paramHttpStatusException);

  public abstract void a(HttpUtils.NetworkUnavailableException paramNetworkUnavailableException);

  public abstract void a(IOException paramIOException);

  public abstract void a(Exception paramException);

  public abstract void a(MalformedURLException paramMalformedURLException);

  public abstract void a(SocketTimeoutException paramSocketTimeoutException);

  public abstract void a(ConnectTimeoutException paramConnectTimeoutException);

  public abstract void a(JSONException paramJSONException);

  public abstract void a(JSONObject paramJSONObject);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.tauth.a
 * JD-Core Version:    0.6.0
 */