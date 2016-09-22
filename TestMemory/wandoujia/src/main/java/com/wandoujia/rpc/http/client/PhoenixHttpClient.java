package com.wandoujia.rpc.http.client;

import com.wandoujia.base.http.HttpClientWrapper;

public class PhoenixHttpClient extends HttpClientWrapper
{
  private static final int CONNECTION_TIMEOUT_MS = 30000;
  private static final int SOCKET_TIMEOUT_MS = 60000;

  public PhoenixHttpClient()
  {
    super(HttpClientFactory.newInstance(60000, 30000));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.client.PhoenixHttpClient
 * JD-Core Version:    0.6.0
 */