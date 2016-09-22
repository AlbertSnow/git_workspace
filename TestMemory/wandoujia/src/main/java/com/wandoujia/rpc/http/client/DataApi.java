package com.wandoujia.rpc.http.client;

import android.os.Handler;
import com.wandoujia.rpc.http.callback.Callback;
import com.wandoujia.rpc.http.delegate.ApiDelegate;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.apache.http.HttpHost;

public abstract interface DataApi
{
  public abstract <T, E extends Exception> T execute(ApiDelegate<T, E> paramApiDelegate);

  public abstract <T, E extends Exception> Future<T> executeAsync(ApiDelegate<T, E> paramApiDelegate, Callback<T, ExecutionException> paramCallback);

  public abstract <T, E extends Exception> Future<T> executeAsync(ApiDelegate<T, E> paramApiDelegate, Callback<T, ExecutionException> paramCallback, Handler paramHandler);

  public abstract void setProxyHttpHost(HttpHost paramHttpHost);

  public abstract void shutdown();

  public abstract void start();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.rpc.http.client.DataApi
 * JD-Core Version:    0.6.0
 */