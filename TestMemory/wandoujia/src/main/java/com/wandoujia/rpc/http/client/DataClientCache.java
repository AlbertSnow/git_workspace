package com.wandoujia.rpc.http.client;

import com.wandoujia.gson.JsonParseException;
import com.wandoujia.rpc.http.cache.CacheItemWrapper;
import com.wandoujia.rpc.http.cache.Cacheable;
import com.wandoujia.rpc.http.cache.DataCache;
import com.wandoujia.rpc.http.cache.FileCache;
import com.wandoujia.rpc.http.delegate.GZipHttpDelegate;
import com.wandoujia.rpc.http.processor.Processor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DataClientCache extends DataClient
{
  private final DataCache cache;
  private final ExecutorService threadPool;

  public DataClientCache(String paramString)
  {
    this(paramString, Executors.newCachedThreadPool());
  }

  public DataClientCache(String paramString, ExecutorService paramExecutorService)
  {
    this.cache = new FileCache(paramString);
    this.threadPool = paramExecutorService;
  }

  private <T> void putItemToCache(String paramString1, Cacheable<T> paramCacheable, String paramString2)
  {
    CacheItemWrapper localCacheItemWrapper = CacheItemWrapper.from(paramString2, paramCacheable.getTimeoutInterval(), System.currentTimeMillis());
    this.cache.put(paramString1, localCacheItemWrapper);
  }

  // ERROR //
  public <T, E extends Exception> T execute(com.wandoujia.rpc.http.delegate.ApiDelegate<T, E> paramApiDelegate)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 71	com/wandoujia/rpc/http/client/DataClientCache:isWorking	Z
    //   4: ifne +20 -> 24
    //   7: new 73	java/util/concurrent/ExecutionException
    //   10: dup
    //   11: new 75	java/lang/IllegalStateException
    //   14: dup
    //   15: ldc 77
    //   17: invokespecial 78	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   20: invokespecial 81	java/util/concurrent/ExecutionException:<init>	(Ljava/lang/Throwable;)V
    //   23: athrow
    //   24: aload_1
    //   25: instanceof 38
    //   28: ifeq +193 -> 221
    //   31: aload_1
    //   32: instanceof 83
    //   35: ifeq +186 -> 221
    //   38: aload_1
    //   39: checkcast 38	com/wandoujia/rpc/http/cache/Cacheable
    //   42: invokeinterface 87 1 0
    //   47: astore_2
    //   48: aload_0
    //   49: getfield 28	com/wandoujia/rpc/http/client/DataClientCache:cache	Lcom/wandoujia/rpc/http/cache/DataCache;
    //   52: aload_2
    //   53: invokeinterface 91 2 0
    //   58: astore 9
    //   60: aload 9
    //   62: ifnull +50 -> 112
    //   65: invokestatic 47	java/lang/System:currentTimeMillis	()J
    //   68: aload 9
    //   70: invokevirtual 94	com/wandoujia/rpc/http/cache/CacheItemWrapper:getLastModificationTime	()J
    //   73: lsub
    //   74: aload 9
    //   76: invokevirtual 97	com/wandoujia/rpc/http/cache/CacheItemWrapper:getTimeout	()J
    //   79: lcmp
    //   80: ifgt +32 -> 112
    //   83: aload_1
    //   84: checkcast 83	com/wandoujia/rpc/http/delegate/GZipHttpDelegate
    //   87: invokevirtual 101	com/wandoujia/rpc/http/delegate/GZipHttpDelegate:getContentProcessor	()Lcom/wandoujia/rpc/http/processor/Processor;
    //   90: aload 9
    //   92: invokevirtual 104	com/wandoujia/rpc/http/cache/CacheItemWrapper:getContent	()Ljava/lang/String;
    //   95: invokeinterface 110 2 0
    //   100: astore 12
    //   102: aload 12
    //   104: ifnull +8 -> 112
    //   107: aload 12
    //   109: areturn
    //   110: astore 11
    //   112: aload_1
    //   113: instanceof 38
    //   116: ifeq +86 -> 202
    //   119: aload_1
    //   120: instanceof 83
    //   123: ifeq +79 -> 202
    //   126: aload_0
    //   127: aload_1
    //   128: invokeinterface 116 1 0
    //   133: invokespecial 120	com/wandoujia/rpc/http/client/DataClient:executeHttpRequest	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   136: astore_3
    //   137: new 122	com/wandoujia/rpc/http/processor/GZipHttpResponseProcessor
    //   140: dup
    //   141: invokespecial 123	com/wandoujia/rpc/http/processor/GZipHttpResponseProcessor:<init>	()V
    //   144: aload_3
    //   145: invokevirtual 126	com/wandoujia/rpc/http/processor/GZipHttpResponseProcessor:process	(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
    //   148: astore 5
    //   150: aload_1
    //   151: checkcast 83	com/wandoujia/rpc/http/delegate/GZipHttpDelegate
    //   154: invokevirtual 101	com/wandoujia/rpc/http/delegate/GZipHttpDelegate:getContentProcessor	()Lcom/wandoujia/rpc/http/processor/Processor;
    //   157: aload 5
    //   159: invokeinterface 110 2 0
    //   164: astore 8
    //   166: aload_0
    //   167: getfield 30	com/wandoujia/rpc/http/client/DataClientCache:threadPool	Ljava/util/concurrent/ExecutorService;
    //   170: new 128	com/wandoujia/rpc/http/client/DataClientCache$1
    //   173: dup
    //   174: aload_0
    //   175: aload_2
    //   176: aload_1
    //   177: aload 5
    //   179: invokespecial 131	com/wandoujia/rpc/http/client/DataClientCache$1:<init>	(Lcom/wandoujia/rpc/http/client/DataClientCache;Ljava/lang/String;Lcom/wandoujia/rpc/http/delegate/ApiDelegate;Ljava/lang/String;)V
    //   182: invokeinterface 136 2 0
    //   187: aload 8
    //   189: areturn
    //   190: astore 4
    //   192: new 73	java/util/concurrent/ExecutionException
    //   195: dup
    //   196: aload 4
    //   198: invokespecial 81	java/util/concurrent/ExecutionException:<init>	(Ljava/lang/Throwable;)V
    //   201: athrow
    //   202: aload_0
    //   203: aload_1
    //   204: invokespecial 138	com/wandoujia/rpc/http/client/DataClient:execute	(Lcom/wandoujia/rpc/http/delegate/ApiDelegate;)Ljava/lang/Object;
    //   207: areturn
    //   208: astore 7
    //   210: aconst_null
    //   211: areturn
    //   212: astore 6
    //   214: aconst_null
    //   215: areturn
    //   216: astore 10
    //   218: goto -106 -> 112
    //   221: aconst_null
    //   222: astore_2
    //   223: goto -111 -> 112
    //
    // Exception table:
    //   from	to	target	type
    //   83	102	110	java/lang/Exception
    //   137	150	190	com/wandoujia/rpc/http/exception/HttpException
    //   150	187	208	java/lang/Exception
    //   150	187	212	com/wandoujia/gson/JsonParseException
    //   83	102	216	com/wandoujia/gson/JsonParseException
  }

  public <T, M extends GZipHttpDelegate<?, T>,  extends Cacheable<T>> DataClientCache.CacheResult<T> executeByCache(M paramM)
  {
    String str = ((Cacheable)paramM).getCacheKey();
    CacheItemWrapper localCacheItemWrapper = this.cache.get(str);
    if (localCacheItemWrapper != null);
    try
    {
      Object localObject = paramM.getContentProcessor().process(localCacheItemWrapper.getContent());
      if (localObject != null)
      {
        if (System.currentTimeMillis() - localCacheItemWrapper.getLastModificationTime() > localCacheItemWrapper.getTimeout());
        for (boolean bool = true; ; bool = false)
        {
          DataClientCache.CacheResult localCacheResult = new DataClientCache.CacheResult(localObject, localCacheItemWrapper.getLastModificationTime(), bool);
          return localCacheResult;
        }
      }
    }
    catch (Exception localException)
    {
      return null;
    }
    catch (JsonParseException localJsonParseException)
    {
      label92: break label92;
    }
  }

  // ERROR //
  public <T, M extends GZipHttpDelegate<?, T>,  extends Cacheable<T>> T executeByNetwork(M paramM)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 71	com/wandoujia/rpc/http/client/DataClientCache:isWorking	Z
    //   4: ifne +20 -> 24
    //   7: new 73	java/util/concurrent/ExecutionException
    //   10: dup
    //   11: new 75	java/lang/IllegalStateException
    //   14: dup
    //   15: ldc 77
    //   17: invokespecial 78	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   20: invokespecial 81	java/util/concurrent/ExecutionException:<init>	(Ljava/lang/Throwable;)V
    //   23: athrow
    //   24: aload_1
    //   25: checkcast 38	com/wandoujia/rpc/http/cache/Cacheable
    //   28: invokeinterface 87 1 0
    //   33: astore_2
    //   34: aload_0
    //   35: aload_1
    //   36: invokevirtual 148	com/wandoujia/rpc/http/delegate/GZipHttpDelegate:getHttpRequest	()Lorg/apache/http/client/methods/HttpUriRequest;
    //   39: invokespecial 120	com/wandoujia/rpc/http/client/DataClient:executeHttpRequest	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   42: astore_3
    //   43: new 122	com/wandoujia/rpc/http/processor/GZipHttpResponseProcessor
    //   46: dup
    //   47: invokespecial 123	com/wandoujia/rpc/http/processor/GZipHttpResponseProcessor:<init>	()V
    //   50: aload_3
    //   51: invokevirtual 126	com/wandoujia/rpc/http/processor/GZipHttpResponseProcessor:process	(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
    //   54: astore 5
    //   56: aload_1
    //   57: invokevirtual 101	com/wandoujia/rpc/http/delegate/GZipHttpDelegate:getContentProcessor	()Lcom/wandoujia/rpc/http/processor/Processor;
    //   60: aload 5
    //   62: invokeinterface 110 2 0
    //   67: astore 8
    //   69: aload_0
    //   70: getfield 30	com/wandoujia/rpc/http/client/DataClientCache:threadPool	Ljava/util/concurrent/ExecutorService;
    //   73: new 150	com/wandoujia/rpc/http/client/DataClientCache$2
    //   76: dup
    //   77: aload_0
    //   78: aload_2
    //   79: aload_1
    //   80: aload 5
    //   82: invokespecial 153	com/wandoujia/rpc/http/client/DataClientCache$2:<init>	(Lcom/wandoujia/rpc/http/client/DataClientCache;Ljava/lang/String;Lcom/wandoujia/rpc/http/delegate/GZipHttpDelegate;Ljava/lang/String;)V
    //   85: invokeinterface 136 2 0
    //   90: aload 8
    //   92: areturn
    //   93: astore 4
    //   95: new 73	java/util/concurrent/ExecutionException
    //   98: dup
    //   99: aload 4
    //   101: invokespecial 81	java/util/concurrent/ExecutionException:<init>	(Ljava/lang/Throwable;)V
    //   104: athrow
    //   105: astore 7
    //   107: aconst_null
    //   108: areturn
    //   109: astore 6
    //   111: goto -4 -> 107
    //
    // Exception table:
    //   from	to	target	type
    //   43	56	93	com/wandoujia/rpc/http/exception/HttpException
    //   56	90	105	java/lang/Exception
    //   56	90	109	com/wandoujia/gson/JsonParseException
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.client.DataClientCache
 * JD-Core Version:    0.6.0
 */