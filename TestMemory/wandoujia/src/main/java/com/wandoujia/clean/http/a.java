package com.wandoujia.clean.http;

import android.os.Handler;
import com.wandoujia.rpc.http.callback.Callback;
import com.wandoujia.rpc.http.client.DataApi;
import com.wandoujia.rpc.http.client.DataClientCache;
import com.wandoujia.rpc.http.delegate.ApiDelegate;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.apache.http.HttpHost;

public final class a
  implements DataApi
{
  private DataClientCache a;
  private boolean b = true;
  private String c;
  private HttpHost d;

  public a(String paramString)
  {
    this.c = paramString;
  }

  private DataClientCache a()
  {
    monitorenter;
    try
    {
      if (this.a == null)
      {
        this.a = new DataClientCache(this.c);
        if (this.d != null)
          this.a.setProxyHttpHost(this.d);
        if (!this.b)
          break label65;
        this.a.start();
      }
      while (true)
      {
        DataClientCache localDataClientCache = this.a;
        return localDataClientCache;
        label65: this.a.shutdown();
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final <T, E extends Exception> T execute(ApiDelegate<T, E> paramApiDelegate)
  {
    return a().execute(paramApiDelegate);
  }

  public final <T, E extends Exception> Future<T> executeAsync(ApiDelegate<T, E> paramApiDelegate, Callback<T, ExecutionException> paramCallback)
  {
    return a().executeAsync(paramApiDelegate, paramCallback);
  }

  public final <T, E extends Exception> Future<T> executeAsync(ApiDelegate<T, E> paramApiDelegate, Callback<T, ExecutionException> paramCallback, Handler paramHandler)
  {
    return a().executeAsync(paramApiDelegate, paramCallback, paramHandler);
  }

  public final void setProxyHttpHost(HttpHost paramHttpHost)
  {
    if (this.a == null)
    {
      this.d = paramHttpHost;
      return;
    }
    this.a.setProxyHttpHost(paramHttpHost);
  }

  public final void shutdown()
  {
    monitorenter;
    try
    {
      if (this.a == null)
        this.b = false;
      while (true)
      {
        return;
        this.a.shutdown();
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void start()
  {
    monitorenter;
    try
    {
      if (this.a == null)
        this.b = true;
      while (true)
      {
        return;
        this.a.start();
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.http.a
 * JD-Core Version:    0.6.0
 */