package com.wandoujia.rpc.http.client;

import android.os.Handler;
import android.os.Looper;
import com.wandoujia.rpc.http.callback.Callback;
import com.wandoujia.rpc.http.delegate.ApiDelegate;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.params.ConnRouteParams;

public class DataClient
  implements DataApi
{
  private static final Handler UI_HANDLER = new Handler(Looper.getMainLooper());
  private HttpClient httpClient;
  protected boolean isWorking = true;
  private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
  private HttpHost proxyHost = null;
  private final ExecutorService threadPool;

  public DataClient()
  {
    this(Executors.newCachedThreadPool());
  }

  public DataClient(ExecutorService paramExecutorService)
  {
    this.threadPool = paramExecutorService;
    this.lock.writeLock().lock();
    this.httpClient = new PhoenixHttpClient();
    ConnRouteParams.setDefaultProxy(this.httpClient.getParams(), this.proxyHost);
    this.lock.writeLock().unlock();
  }

  private static <T> void onError(Callback<T, ExecutionException> paramCallback, ExecutionException paramExecutionException, Handler paramHandler)
  {
    if (paramCallback != null)
    {
      if (paramHandler == null)
        paramHandler = UI_HANDLER;
      paramHandler.post(new DataClient.4(paramCallback, paramExecutionException));
    }
  }

  private static <T> void onSuccess(Callback<T, ExecutionException> paramCallback, T paramT, Handler paramHandler)
  {
    if (paramCallback != null)
    {
      if (paramHandler == null)
        paramHandler = UI_HANDLER;
      paramHandler.post(new DataClient.3(paramCallback, paramT));
    }
  }

  public <T, E extends Exception> T execute(ApiDelegate<T, E> paramApiDelegate)
  {
    if (!this.isWorking)
      throw new ExecutionException(new IllegalStateException("The client has been shut down."));
    HttpUriRequest localHttpUriRequest = paramApiDelegate.getHttpRequest();
    if (localHttpUriRequest == null)
      throw new ExecutionException(new IllegalStateException("Request cannot be null, some error happens."));
    HttpResponse localHttpResponse = executeHttpRequest(localHttpUriRequest);
    try
    {
      Object localObject = paramApiDelegate.processResponse(localHttpResponse);
      return localObject;
    }
    catch (Exception localException)
    {
    }
    throw new ExecutionException(localException);
  }

  public <T, E extends Exception> Future<T> executeAsync(ApiDelegate<T, E> paramApiDelegate, Callback<T, ExecutionException> paramCallback)
  {
    return executeAsync(paramApiDelegate, paramCallback, null);
  }

  public <T, E extends Exception> Future<T> executeAsync(ApiDelegate<T, E> paramApiDelegate, Callback<T, ExecutionException> paramCallback, Handler paramHandler)
  {
    return this.threadPool.submit(new DataClient.1(this, paramApiDelegate, paramCallback, paramHandler));
  }

  // ERROR //
  protected HttpResponse executeHttpRequest(HttpUriRequest paramHttpUriRequest)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 50	com/wandoujia/rpc/http/client/DataClient:lock	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   4: invokevirtual 170	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   7: invokevirtual 173	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:lock	()V
    //   10: aload_0
    //   11: getfield 69	com/wandoujia/rpc/http/client/DataClient:httpClient	Lorg/apache/http/client/HttpClient;
    //   14: ifnonnull +77 -> 91
    //   17: aload_0
    //   18: getfield 50	com/wandoujia/rpc/http/client/DataClient:lock	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   21: invokevirtual 170	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   24: invokevirtual 174	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   27: aload_0
    //   28: getfield 50	com/wandoujia/rpc/http/client/DataClient:lock	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   31: invokevirtual 60	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   34: invokevirtual 64	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:lock	()V
    //   37: aload_0
    //   38: getfield 69	com/wandoujia/rpc/http/client/DataClient:httpClient	Lorg/apache/http/client/HttpClient;
    //   41: ifnonnull +30 -> 71
    //   44: aload_0
    //   45: new 66	com/wandoujia/rpc/http/client/PhoenixHttpClient
    //   48: dup
    //   49: invokespecial 67	com/wandoujia/rpc/http/client/PhoenixHttpClient:<init>	()V
    //   52: putfield 69	com/wandoujia/rpc/http/client/DataClient:httpClient	Lorg/apache/http/client/HttpClient;
    //   55: aload_0
    //   56: getfield 69	com/wandoujia/rpc/http/client/DataClient:httpClient	Lorg/apache/http/client/HttpClient;
    //   59: invokeinterface 75 1 0
    //   64: aload_0
    //   65: getfield 54	com/wandoujia/rpc/http/client/DataClient:proxyHost	Lorg/apache/http/HttpHost;
    //   68: invokestatic 81	org/apache/http/conn/params/ConnRouteParams:setDefaultProxy	(Lorg/apache/http/params/HttpParams;Lorg/apache/http/HttpHost;)V
    //   71: aload_0
    //   72: getfield 50	com/wandoujia/rpc/http/client/DataClient:lock	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   75: invokevirtual 170	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   78: invokevirtual 173	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:lock	()V
    //   81: aload_0
    //   82: getfield 50	com/wandoujia/rpc/http/client/DataClient:lock	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   85: invokevirtual 60	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   88: invokevirtual 84	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:unlock	()V
    //   91: invokestatic 180	com/wandoujia/base/config/GlobalConfig:isDebug	()Z
    //   94: ifeq +13 -> 107
    //   97: aload_1
    //   98: invokeinterface 186 1 0
    //   103: invokevirtual 192	java/net/URI:toString	()Ljava/lang/String;
    //   106: pop
    //   107: aload_0
    //   108: getfield 69	com/wandoujia/rpc/http/client/DataClient:httpClient	Lorg/apache/http/client/HttpClient;
    //   111: aload_1
    //   112: invokeinterface 194 2 0
    //   117: astore 7
    //   119: aload_0
    //   120: getfield 50	com/wandoujia/rpc/http/client/DataClient:lock	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   123: invokevirtual 170	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   126: invokevirtual 174	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   129: aload 7
    //   131: areturn
    //   132: astore 5
    //   134: aload_1
    //   135: invokeinterface 197 1 0
    //   140: new 120	java/util/concurrent/ExecutionException
    //   143: dup
    //   144: aload 5
    //   146: invokespecial 130	java/util/concurrent/ExecutionException:<init>	(Ljava/lang/Throwable;)V
    //   149: athrow
    //   150: astore 6
    //   152: new 120	java/util/concurrent/ExecutionException
    //   155: dup
    //   156: aload 6
    //   158: invokespecial 130	java/util/concurrent/ExecutionException:<init>	(Ljava/lang/Throwable;)V
    //   161: athrow
    //   162: astore 4
    //   164: aload_0
    //   165: getfield 50	com/wandoujia/rpc/http/client/DataClient:lock	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   168: invokevirtual 170	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   171: invokevirtual 174	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   174: aload 4
    //   176: athrow
    //   177: astore_2
    //   178: aload_1
    //   179: invokeinterface 197 1 0
    //   184: new 120	java/util/concurrent/ExecutionException
    //   187: dup
    //   188: aload_2
    //   189: invokespecial 130	java/util/concurrent/ExecutionException:<init>	(Ljava/lang/Throwable;)V
    //   192: athrow
    //   193: astore_3
    //   194: new 120	java/util/concurrent/ExecutionException
    //   197: dup
    //   198: aload_3
    //   199: invokespecial 130	java/util/concurrent/ExecutionException:<init>	(Ljava/lang/Throwable;)V
    //   202: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   91	107	132	java/io/IOException
    //   107	119	132	java/io/IOException
    //   134	150	150	java/lang/Throwable
    //   91	107	162	finally
    //   107	119	162	finally
    //   134	150	162	finally
    //   152	162	162	finally
    //   178	193	162	finally
    //   194	203	162	finally
    //   91	107	177	java/lang/Throwable
    //   107	119	177	java/lang/Throwable
    //   178	193	193	java/lang/Throwable
  }

  public void setProxyHttpHost(HttpHost paramHttpHost)
  {
    this.proxyHost = paramHttpHost;
    this.lock.readLock().lock();
    if (this.httpClient != null)
      ConnRouteParams.setDefaultProxy(this.httpClient.getParams(), this.proxyHost);
    this.lock.readLock().unlock();
  }

  public void shutdown()
  {
    this.isWorking = false;
    this.threadPool.execute(new DataClient.2(this));
  }

  public void start()
  {
    this.isWorking = true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.client.DataClient
 * JD-Core Version:    0.6.0
 */