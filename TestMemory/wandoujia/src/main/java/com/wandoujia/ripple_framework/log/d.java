package com.wandoujia.ripple_framework.log;

import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.http.HttpClientWrapper;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.logv3.model.packages.CardPackage.Builder;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Builder;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.rpc.http.client.HttpClientFactory;
import java.io.PrintWriter;
import java.io.StringWriter;

final class d
  implements Runnable
{
  private static HttpClientWrapper a = new HttpClientWrapper(HttpClientFactory.newInstance(60000, 30000));
  private String b;

  public d(String paramString)
  {
    this.b = paramString;
  }

  private static String a(String paramString)
  {
    if (paramString != null)
    {
      String str = paramString.replace("\n", "#").replace("\t", "#");
      if (str.length() > 500)
        str = str.subSequence(0, 500).toString();
      return str;
    }
    return "";
  }

  private static String a(Throwable paramThrowable)
  {
    StringWriter localStringWriter = new StringWriter();
    paramThrowable.printStackTrace(new PrintWriter(localStringWriter));
    return localStringWriter.toString().replace("\n", "#").replace("\t", "#");
  }

  private static void a(TaskEvent.Result paramResult, String paramString1, int paramInt, String paramString2)
  {
    TaskEvent.Builder localBuilder = new TaskEvent.Builder().status(TaskEvent.Status.END).result(paramResult).action(TaskEvent.Action.OPEN).view_log_package(new ViewLogPackage.Builder().module("debug_ad_card_show").name(String.valueOf(paramInt)).build()).result_info(paramString2);
    ExtraPackage.Builder localBuilder1 = new ExtraPackage.Builder();
    localBuilder1.card_package(new CardPackage.Builder().sub_status(paramString1).type(NetworkUtil.getNetworkTypeName(GlobalConfig.getAppContext())).build());
    v.b().a(localBuilder, localBuilder1);
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: new 178	org/apache/http/client/methods/HttpGet
    //   3: dup
    //   4: aload_0
    //   5: getfield 32	com/wandoujia/ripple_framework/log/d:b	Ljava/lang/String;
    //   8: invokespecial 180	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   11: astore_1
    //   12: getstatic 27	com/wandoujia/ripple_framework/log/d:a	Lcom/wandoujia/base/http/HttpClientWrapper;
    //   15: aload_1
    //   16: invokevirtual 184	com/wandoujia/base/http/HttpClientWrapper:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   19: astore 6
    //   21: aload 6
    //   23: invokeinterface 190 1 0
    //   28: invokeinterface 195 1 0
    //   33: sipush 200
    //   36: if_icmpne +134 -> 170
    //   39: aload 6
    //   41: invokeinterface 199 1 0
    //   46: invokeinterface 205 1 0
    //   51: astore 10
    //   53: aload 6
    //   55: ldc 207
    //   57: invokeinterface 211 2 0
    //   62: astore 11
    //   64: aload 11
    //   66: ifnull +270 -> 336
    //   69: ldc 213
    //   71: aload 11
    //   73: invokeinterface 218 1 0
    //   78: invokevirtual 222	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   81: ifeq +255 -> 336
    //   84: new 224	java/util/zip/GZIPInputStream
    //   87: dup
    //   88: aload 10
    //   90: invokespecial 227	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   93: astore 12
    //   95: aload 6
    //   97: ldc 229
    //   99: invokeinterface 211 2 0
    //   104: astore 13
    //   106: aload 13
    //   108: ifnull +46 -> 154
    //   111: ldc 231
    //   113: aload 13
    //   115: invokeinterface 218 1 0
    //   120: invokevirtual 222	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   123: ifeq +31 -> 154
    //   126: aload 12
    //   128: ldc 233
    //   130: invokestatic 239	com/wandoujia/base/utils/IOUtils:readString	(Ljava/io/InputStream;Ljava/lang/String;)Ljava/lang/String;
    //   133: astore 15
    //   135: getstatic 245	com/wandoujia/logv3/model/packages/TaskEvent$Result:SUCCESS	Lcom/wandoujia/logv3/model/packages/TaskEvent$Result;
    //   138: aload_0
    //   139: getfield 32	com/wandoujia/ripple_framework/log/d:b	Ljava/lang/String;
    //   142: sipush 200
    //   145: aload 15
    //   147: invokestatic 247	com/wandoujia/ripple_framework/log/d:a	(Ljava/lang/String;)Ljava/lang/String;
    //   150: invokestatic 249	com/wandoujia/ripple_framework/log/d:a	(Lcom/wandoujia/logv3/model/packages/TaskEvent$Result;Ljava/lang/String;ILjava/lang/String;)V
    //   153: return
    //   154: aload 12
    //   156: ldc 251
    //   158: invokestatic 239	com/wandoujia/base/utils/IOUtils:readString	(Ljava/io/InputStream;Ljava/lang/String;)Ljava/lang/String;
    //   161: astore 14
    //   163: aload 14
    //   165: astore 15
    //   167: goto -32 -> 135
    //   170: aload 6
    //   172: invokeinterface 199 1 0
    //   177: invokeinterface 205 1 0
    //   182: ldc 251
    //   184: invokestatic 239	com/wandoujia/base/utils/IOUtils:readString	(Ljava/io/InputStream;Ljava/lang/String;)Ljava/lang/String;
    //   187: astore 9
    //   189: aload 9
    //   191: astore 8
    //   193: aload 8
    //   195: invokestatic 257	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   198: ifeq +15 -> 213
    //   201: aload 6
    //   203: invokeinterface 190 1 0
    //   208: invokevirtual 258	java/lang/Object:toString	()Ljava/lang/String;
    //   211: astore 8
    //   213: getstatic 261	com/wandoujia/logv3/model/packages/TaskEvent$Result:FAIL	Lcom/wandoujia/logv3/model/packages/TaskEvent$Result;
    //   216: aload_0
    //   217: getfield 32	com/wandoujia/ripple_framework/log/d:b	Ljava/lang/String;
    //   220: aload 6
    //   222: invokeinterface 190 1 0
    //   227: invokeinterface 195 1 0
    //   232: aload 8
    //   234: invokestatic 247	com/wandoujia/ripple_framework/log/d:a	(Ljava/lang/String;)Ljava/lang/String;
    //   237: invokestatic 249	com/wandoujia/ripple_framework/log/d:a	(Lcom/wandoujia/logv3/model/packages/TaskEvent$Result;Ljava/lang/String;ILjava/lang/String;)V
    //   240: return
    //   241: astore 4
    //   243: getstatic 261	com/wandoujia/logv3/model/packages/TaskEvent$Result:FAIL	Lcom/wandoujia/logv3/model/packages/TaskEvent$Result;
    //   246: aload_0
    //   247: getfield 32	com/wandoujia/ripple_framework/log/d:b	Ljava/lang/String;
    //   250: bipush 156
    //   252: aload 4
    //   254: invokestatic 263	com/wandoujia/ripple_framework/log/d:a	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   257: invokestatic 249	com/wandoujia/ripple_framework/log/d:a	(Lcom/wandoujia/logv3/model/packages/TaskEvent$Result;Ljava/lang/String;ILjava/lang/String;)V
    //   260: aload_1
    //   261: invokevirtual 266	org/apache/http/client/methods/HttpGet:abort	()V
    //   264: return
    //   265: astore 5
    //   267: getstatic 261	com/wandoujia/logv3/model/packages/TaskEvent$Result:FAIL	Lcom/wandoujia/logv3/model/packages/TaskEvent$Result;
    //   270: aload_0
    //   271: getfield 32	com/wandoujia/ripple_framework/log/d:b	Ljava/lang/String;
    //   274: sipush -200
    //   277: aload 4
    //   279: invokestatic 263	com/wandoujia/ripple_framework/log/d:a	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   282: invokestatic 249	com/wandoujia/ripple_framework/log/d:a	(Lcom/wandoujia/logv3/model/packages/TaskEvent$Result;Ljava/lang/String;ILjava/lang/String;)V
    //   285: return
    //   286: astore_2
    //   287: getstatic 261	com/wandoujia/logv3/model/packages/TaskEvent$Result:FAIL	Lcom/wandoujia/logv3/model/packages/TaskEvent$Result;
    //   290: aload_0
    //   291: getfield 32	com/wandoujia/ripple_framework/log/d:b	Ljava/lang/String;
    //   294: sipush -500
    //   297: aload_2
    //   298: invokestatic 263	com/wandoujia/ripple_framework/log/d:a	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   301: invokestatic 249	com/wandoujia/ripple_framework/log/d:a	(Lcom/wandoujia/logv3/model/packages/TaskEvent$Result;Ljava/lang/String;ILjava/lang/String;)V
    //   304: aload_1
    //   305: invokevirtual 266	org/apache/http/client/methods/HttpGet:abort	()V
    //   308: return
    //   309: astore_3
    //   310: getstatic 261	com/wandoujia/logv3/model/packages/TaskEvent$Result:FAIL	Lcom/wandoujia/logv3/model/packages/TaskEvent$Result;
    //   313: aload_0
    //   314: getfield 32	com/wandoujia/ripple_framework/log/d:b	Ljava/lang/String;
    //   317: sipush -600
    //   320: aload_2
    //   321: invokestatic 263	com/wandoujia/ripple_framework/log/d:a	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   324: invokestatic 249	com/wandoujia/ripple_framework/log/d:a	(Lcom/wandoujia/logv3/model/packages/TaskEvent$Result;Ljava/lang/String;ILjava/lang/String;)V
    //   327: return
    //   328: astore 7
    //   330: aconst_null
    //   331: astore 8
    //   333: goto -140 -> 193
    //   336: aload 10
    //   338: astore 12
    //   340: goto -245 -> 95
    //
    // Exception table:
    //   from	to	target	type
    //   12	64	241	java/io/IOException
    //   69	95	241	java/io/IOException
    //   95	106	241	java/io/IOException
    //   111	135	241	java/io/IOException
    //   135	153	241	java/io/IOException
    //   154	163	241	java/io/IOException
    //   193	213	241	java/io/IOException
    //   213	240	241	java/io/IOException
    //   260	264	265	java/lang/Throwable
    //   12	64	286	java/lang/Throwable
    //   69	95	286	java/lang/Throwable
    //   95	106	286	java/lang/Throwable
    //   111	135	286	java/lang/Throwable
    //   135	153	286	java/lang/Throwable
    //   154	163	286	java/lang/Throwable
    //   170	189	286	java/lang/Throwable
    //   193	213	286	java/lang/Throwable
    //   213	240	286	java/lang/Throwable
    //   304	308	309	java/lang/Throwable
    //   170	189	328	java/io/IOException
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.log.d
 * JD-Core Version:    0.6.0
 */