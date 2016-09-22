package com.wandoujia.rpc.http.processor;

import com.wandoujia.rpc.http.exception.HttpException;
import org.apache.http.HttpResponse;

public class GZipHttpResponseProcessor
  implements Processor<HttpResponse, String, HttpException>
{
  private static final String CONTENT_ENCODING = "Content-Encoding";
  private static final String CONTENT_TYPE = "Content-Type";
  private static final String GB2312 = "text/html; charset=GB2312";
  private static final String GZIP = "gzip";

  // ERROR //
  public String process(HttpResponse paramHttpResponse)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface 37 1 0
    //   6: invokeinterface 43 1 0
    //   11: istore 4
    //   13: iload 4
    //   15: tableswitch	default:+17 -> 32, 200:+84->99
    //   33: invokeinterface 47 1 0
    //   38: invokeinterface 53 1 0
    //   43: ldc 55
    //   45: invokestatic 61	com/wandoujia/base/utils/IOUtils:readString	(Ljava/io/InputStream;Ljava/lang/String;)Ljava/lang/String;
    //   48: astore 16
    //   50: aload 16
    //   52: astore 15
    //   54: aload 15
    //   56: invokestatic 67	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   59: ifeq +14 -> 73
    //   62: aload_1
    //   63: invokeinterface 37 1 0
    //   68: invokevirtual 71	java/lang/Object:toString	()Ljava/lang/String;
    //   71: astore 15
    //   73: new 73	com/wandoujia/rpc/http/exception/HttpException
    //   76: dup
    //   77: iload 4
    //   79: aload 15
    //   81: invokespecial 76	com/wandoujia/rpc/http/exception/HttpException:<init>	(ILjava/lang/String;)V
    //   84: athrow
    //   85: astore_2
    //   86: aload_1
    //   87: invokeinterface 47 1 0
    //   92: invokeinterface 79 1 0
    //   97: aload_2
    //   98: athrow
    //   99: aload_1
    //   100: invokeinterface 47 1 0
    //   105: invokeinterface 53 1 0
    //   110: astore 6
    //   112: aload_1
    //   113: ldc 11
    //   115: invokeinterface 83 2 0
    //   120: astore 7
    //   122: aload 7
    //   124: ifnull +144 -> 268
    //   127: ldc 20
    //   129: aload 7
    //   131: invokeinterface 88 1 0
    //   136: invokevirtual 94	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   139: ifeq +129 -> 268
    //   142: new 96	java/util/zip/GZIPInputStream
    //   145: dup
    //   146: aload 6
    //   148: invokespecial 99	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   151: astore 8
    //   153: aload_1
    //   154: ldc 14
    //   156: invokeinterface 83 2 0
    //   161: astore 9
    //   163: aload 9
    //   165: ifnull +41 -> 206
    //   168: ldc 17
    //   170: aload 9
    //   172: invokeinterface 88 1 0
    //   177: invokevirtual 94	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   180: ifeq +26 -> 206
    //   183: aload 8
    //   185: ldc 101
    //   187: invokestatic 61	com/wandoujia/base/utils/IOUtils:readString	(Ljava/io/InputStream;Ljava/lang/String;)Ljava/lang/String;
    //   190: astore 12
    //   192: aload_1
    //   193: invokeinterface 47 1 0
    //   198: invokeinterface 79 1 0
    //   203: aload 12
    //   205: areturn
    //   206: aload 8
    //   208: ldc 55
    //   210: invokestatic 61	com/wandoujia/base/utils/IOUtils:readString	(Ljava/io/InputStream;Ljava/lang/String;)Ljava/lang/String;
    //   213: astore 10
    //   215: aload_1
    //   216: invokeinterface 47 1 0
    //   221: invokeinterface 79 1 0
    //   226: aload 10
    //   228: areturn
    //   229: astore 11
    //   231: aload 10
    //   233: areturn
    //   234: astore 5
    //   236: new 73	com/wandoujia/rpc/http/exception/HttpException
    //   239: dup
    //   240: iload 4
    //   242: aload 5
    //   244: invokevirtual 104	java/io/IOException:getMessage	()Ljava/lang/String;
    //   247: invokespecial 76	com/wandoujia/rpc/http/exception/HttpException:<init>	(ILjava/lang/String;)V
    //   250: athrow
    //   251: astore_3
    //   252: goto -155 -> 97
    //   255: astore 14
    //   257: aconst_null
    //   258: astore 15
    //   260: goto -206 -> 54
    //   263: astore 13
    //   265: aload 12
    //   267: areturn
    //   268: aload 6
    //   270: astore 8
    //   272: goto -119 -> 153
    //
    // Exception table:
    //   from	to	target	type
    //   0	13	85	finally
    //   32	50	85	finally
    //   54	73	85	finally
    //   73	85	85	finally
    //   99	122	85	finally
    //   127	153	85	finally
    //   153	163	85	finally
    //   168	192	85	finally
    //   206	215	85	finally
    //   236	251	85	finally
    //   215	226	229	java/io/IOException
    //   99	122	234	java/io/IOException
    //   127	153	234	java/io/IOException
    //   153	163	234	java/io/IOException
    //   168	192	234	java/io/IOException
    //   206	215	234	java/io/IOException
    //   86	97	251	java/io/IOException
    //   32	50	255	java/io/IOException
    //   192	203	263	java/io/IOException
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.processor.GZipHttpResponseProcessor
 * JD-Core Version:    0.6.0
 */