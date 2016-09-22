package com.wandoujia.rpc.http.cache;

import com.b.a.a;
import com.b.a.g;
import com.wandoujia.gson.c;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

public class FileCache
  implements DataCache
{
  private static final int CACHE_APP_VERSION = 1;
  private static final long MAX_FILE_CACHE_SIZE = 10485760L;
  private static final String TAG = FileCache.class.getSimpleName();
  private a cache;
  private final String cacheDirPath;
  private final byte[] cacheLock = new byte[0];
  private final c gson = new c();

  public FileCache(String paramString)
  {
    this.cacheDirPath = paramString;
  }

  private static String convertToHex(byte[] paramArrayOfByte)
  {
    Formatter localFormatter = new Formatter();
    int i = paramArrayOfByte.length;
    for (int j = 0; j < i; j++)
    {
      byte b = paramArrayOfByte[j];
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Byte.valueOf(b);
      localFormatter.format("%02x", arrayOfObject);
    }
    String str = localFormatter.out().toString();
    localFormatter.close();
    return str;
  }

  private static String encodeImageKey(String paramString)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      return convertToHex(localMessageDigest.digest(paramString.getBytes()));
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
    }
    throw new IllegalStateException(localNoSuchAlgorithmException);
  }

  private a getCache()
  {
    File localFile;
    synchronized (this.cacheLock)
    {
      if (this.cache == null)
      {
        localFile = new File(this.cacheDirPath);
        if (!localFile.exists())
          break label65;
        if (localFile.isFile())
        {
          localFile.delete();
          localFile.mkdir();
        }
      }
    }
    try
    {
      while (true)
      {
        this.cache = a.a(localFile);
        label58: monitorexit;
        return this.cache;
        label65: localFile.mkdir();
      }
      localObject = finally;
      monitorexit;
      throw localObject;
    }
    catch (IOException localIOException)
    {
      break label58;
    }
  }

  // ERROR //
  public void clear()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 38	com/wandoujia/rpc/http/cache/FileCache:cacheLock	[B
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 107	com/wandoujia/rpc/http/cache/FileCache:cache	Lcom/b/a/a;
    //   11: astore_3
    //   12: aload_3
    //   13: ifnull +15 -> 28
    //   16: aload_0
    //   17: getfield 107	com/wandoujia/rpc/http/cache/FileCache:cache	Lcom/b/a/a;
    //   20: invokevirtual 134	com/b/a/a:b	()V
    //   23: aload_0
    //   24: aconst_null
    //   25: putfield 107	com/wandoujia/rpc/http/cache/FileCache:cache	Lcom/b/a/a;
    //   28: aload_1
    //   29: monitorexit
    //   30: return
    //   31: astore 5
    //   33: aload_0
    //   34: aconst_null
    //   35: putfield 107	com/wandoujia/rpc/http/cache/FileCache:cache	Lcom/b/a/a;
    //   38: goto -10 -> 28
    //   41: astore_2
    //   42: aload_1
    //   43: monitorexit
    //   44: aload_2
    //   45: athrow
    //   46: astore 4
    //   48: aload_0
    //   49: aconst_null
    //   50: putfield 107	com/wandoujia/rpc/http/cache/FileCache:cache	Lcom/b/a/a;
    //   53: aload 4
    //   55: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   16	23	31	java/io/IOException
    //   7	12	41	finally
    //   23	28	41	finally
    //   28	30	41	finally
    //   33	38	41	finally
    //   42	44	41	finally
    //   48	56	41	finally
    //   16	23	46	finally
  }

  public boolean exists(String paramString)
  {
    try
    {
      a locala = getCache();
      if (locala == null)
        return false;
      g localg = locala.a(encodeImageKey(paramString));
      if (localg != null)
        return true;
    }
    catch (IOException localIOException)
    {
    }
    return false;
  }

  protected void finalize()
  {
    if (this.cache != null)
      this.cache.close();
    super.finalize();
  }

  // ERROR //
  public CacheItemWrapper get(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 137	com/wandoujia/rpc/http/cache/FileCache:getCache	()Lcom/b/a/a;
    //   4: astore 7
    //   6: aload 7
    //   8: ifnull +75 -> 83
    //   11: aload 7
    //   13: aload_1
    //   14: invokestatic 139	com/wandoujia/rpc/http/cache/FileCache:encodeImageKey	(Ljava/lang/String;)Ljava/lang/String;
    //   17: invokevirtual 142	com/b/a/a:a	(Ljava/lang/String;)Lcom/b/a/g;
    //   20: astore 8
    //   22: aload 8
    //   24: astore_3
    //   25: aload_3
    //   26: ifnull +59 -> 85
    //   29: new 152	com/wandoujia/gson/stream/a
    //   32: dup
    //   33: new 154	java/io/BufferedReader
    //   36: dup
    //   37: new 156	java/io/InputStreamReader
    //   40: dup
    //   41: aload_3
    //   42: invokevirtual 161	com/b/a/g:a	()Ljava/io/InputStream;
    //   45: invokespecial 164	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   48: invokespecial 167	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   51: invokespecial 168	com/wandoujia/gson/stream/a:<init>	(Ljava/io/Reader;)V
    //   54: astore 9
    //   56: aload_0
    //   57: getfield 43	com/wandoujia/rpc/http/cache/FileCache:gson	Lcom/wandoujia/gson/c;
    //   60: aload 9
    //   62: ldc 170
    //   64: invokevirtual 173	com/wandoujia/gson/c:a	(Lcom/wandoujia/gson/stream/a;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    //   67: checkcast 170	com/wandoujia/rpc/http/cache/CacheItemWrapper
    //   70: astore 12
    //   72: aload_3
    //   73: ifnull +7 -> 80
    //   76: aload_3
    //   77: invokevirtual 174	com/b/a/g:close	()V
    //   80: aload 12
    //   82: areturn
    //   83: aconst_null
    //   84: astore_3
    //   85: aload_3
    //   86: ifnull +7 -> 93
    //   89: aload_3
    //   90: invokevirtual 174	com/b/a/g:close	()V
    //   93: aconst_null
    //   94: areturn
    //   95: astore 5
    //   97: aconst_null
    //   98: astore 6
    //   100: aload 6
    //   102: ifnull -9 -> 93
    //   105: aload 6
    //   107: invokevirtual 174	com/b/a/g:close	()V
    //   110: goto -17 -> 93
    //   113: astore 4
    //   115: aconst_null
    //   116: astore_3
    //   117: aload_3
    //   118: ifnull -25 -> 93
    //   121: aload_3
    //   122: invokevirtual 174	com/b/a/g:close	()V
    //   125: goto -32 -> 93
    //   128: astore_2
    //   129: aconst_null
    //   130: astore_3
    //   131: aload_3
    //   132: ifnull +7 -> 139
    //   135: aload_3
    //   136: invokevirtual 174	com/b/a/g:close	()V
    //   139: aload_2
    //   140: athrow
    //   141: astore_2
    //   142: goto -11 -> 131
    //   145: astore 11
    //   147: goto -30 -> 117
    //   150: astore 10
    //   152: aload_3
    //   153: astore 6
    //   155: goto -55 -> 100
    //
    // Exception table:
    //   from	to	target	type
    //   0	6	95	java/io/IOException
    //   11	22	95	java/io/IOException
    //   0	6	113	com/wandoujia/gson/JsonParseException
    //   11	22	113	com/wandoujia/gson/JsonParseException
    //   0	6	128	finally
    //   11	22	128	finally
    //   29	72	141	finally
    //   29	72	145	com/wandoujia/gson/JsonParseException
    //   29	72	150	java/io/IOException
  }

  // ERROR //
  public void put(String paramString, CacheItemWrapper paramCacheItemWrapper)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: invokespecial 137	com/wandoujia/rpc/http/cache/FileCache:getCache	()Lcom/b/a/a;
    //   6: astore 11
    //   8: aload 11
    //   10: ifnonnull +4 -> 14
    //   13: return
    //   14: aload 11
    //   16: aload_1
    //   17: invokestatic 139	com/wandoujia/rpc/http/cache/FileCache:encodeImageKey	(Ljava/lang/String;)Ljava/lang/String;
    //   20: invokevirtual 181	com/b/a/a:b	(Ljava/lang/String;)Lcom/b/a/d;
    //   23: astore 12
    //   25: aload 12
    //   27: ifnull +138 -> 165
    //   30: new 183	com/wandoujia/gson/stream/c
    //   33: dup
    //   34: new 185	java/io/OutputStreamWriter
    //   37: dup
    //   38: new 187	java/io/BufferedOutputStream
    //   41: dup
    //   42: aload 12
    //   44: invokevirtual 192	com/b/a/d:a	()Ljava/io/OutputStream;
    //   47: invokespecial 195	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   50: invokespecial 196	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;)V
    //   53: invokespecial 199	com/wandoujia/gson/stream/c:<init>	(Ljava/io/Writer;)V
    //   56: astore 9
    //   58: aload_0
    //   59: getfield 43	com/wandoujia/rpc/http/cache/FileCache:gson	Lcom/wandoujia/gson/c;
    //   62: aload_2
    //   63: ldc 170
    //   65: aload 9
    //   67: invokevirtual 202	com/wandoujia/gson/c:a	(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/wandoujia/gson/stream/c;)V
    //   70: aload 9
    //   72: invokevirtual 205	com/wandoujia/gson/stream/c:flush	()V
    //   75: aload 12
    //   77: invokevirtual 206	com/b/a/d:b	()V
    //   80: aload 9
    //   82: invokevirtual 207	com/wandoujia/gson/stream/c:close	()V
    //   85: return
    //   86: astore 16
    //   88: return
    //   89: astore 8
    //   91: aconst_null
    //   92: astore 9
    //   94: aload 9
    //   96: ifnull +69 -> 165
    //   99: aload 9
    //   101: invokevirtual 207	com/wandoujia/gson/stream/c:close	()V
    //   104: return
    //   105: astore 10
    //   107: return
    //   108: astore 6
    //   110: aload_3
    //   111: ifnull +54 -> 165
    //   114: aload_3
    //   115: invokevirtual 207	com/wandoujia/gson/stream/c:close	()V
    //   118: return
    //   119: astore 7
    //   121: return
    //   122: astore 4
    //   124: aload_3
    //   125: ifnull +7 -> 132
    //   128: aload_3
    //   129: invokevirtual 207	com/wandoujia/gson/stream/c:close	()V
    //   132: aload 4
    //   134: athrow
    //   135: astore 5
    //   137: goto -5 -> 132
    //   140: astore 15
    //   142: aload 9
    //   144: astore_3
    //   145: aload 15
    //   147: astore 4
    //   149: goto -25 -> 124
    //   152: astore 14
    //   154: aload 9
    //   156: astore_3
    //   157: goto -47 -> 110
    //   160: astore 13
    //   162: goto -68 -> 94
    //   165: return
    //
    // Exception table:
    //   from	to	target	type
    //   80	85	86	java/io/IOException
    //   2	8	89	java/io/IOException
    //   14	25	89	java/io/IOException
    //   30	58	89	java/io/IOException
    //   99	104	105	java/io/IOException
    //   2	8	108	com/wandoujia/gson/JsonIOException
    //   14	25	108	com/wandoujia/gson/JsonIOException
    //   30	58	108	com/wandoujia/gson/JsonIOException
    //   114	118	119	java/io/IOException
    //   2	8	122	finally
    //   14	25	122	finally
    //   30	58	122	finally
    //   128	132	135	java/io/IOException
    //   58	80	140	finally
    //   58	80	152	com/wandoujia/gson/JsonIOException
    //   58	80	160	java/io/IOException
  }

  public void remove(String paramString)
  {
    try
    {
      a locala = getCache();
      if (locala != null)
        locala.c(encodeImageKey(paramString));
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  public long size()
  {
    a locala = getCache();
    if (locala == null)
      return 0L;
    return locala.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.cache.FileCache
 * JD-Core Version:    0.6.0
 */