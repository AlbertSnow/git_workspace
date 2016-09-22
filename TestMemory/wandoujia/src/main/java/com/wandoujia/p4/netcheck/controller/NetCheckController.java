package com.wandoujia.p4.netcheck.controller;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.wandoujia.base.utils.DateUtil;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.p4.netcheck.model.Configs;
import com.wandoujia.p4.netcheck.model.Configs.Publics;
import com.wandoujia.p4.netcheck.model.Configs.TestDomain;
import com.wandoujia.p4.netcheck.model.NetCheckInfo;
import com.wandoujia.p4.netcheck.model.NetCheckInfo.Common;
import com.wandoujia.p4.netcheck.model.NetCheckInfo.DnsInfo;
import com.wandoujia.p4.netcheck.model.NetCheckInfo.Infos;
import com.wandoujia.udid.UDIDUtil;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

public final class NetCheckController
{
  private final List<NetCheckInfo.Infos> a = new ArrayList();
  private final List<NetCheckInfo.Infos> b = new ArrayList();
  private final NetCheckInfo c = new NetCheckInfo();
  private final NetCheckInfo.Common d = new NetCheckInfo.Common();
  private int e;
  private final List<WeakReference<g>> f = new ArrayList();
  private Handler g = new f(this, Looper.getMainLooper());

  public static Configs b()
  {
    try
    {
      String str = UDIDUtil.a(com.wandoujia.p4.a.a());
      com.wandoujia.p4.netcheck.a.a locala = new com.wandoujia.p4.netcheck.a.a();
      ((com.wandoujia.p4.netcheck.b.a)locala.getRequestBuilder()).a(str);
      Configs localConfigs = (Configs)com.wandoujia.p4.a.b().execute(locala);
      return localConfigs;
    }
    catch (ExecutionException localExecutionException)
    {
    }
    return null;
  }

  private static List<NetCheckInfo.Infos> b(Configs.Publics paramPublics)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramPublics.getUrls().iterator();
    while (true)
      if (localIterator.hasNext())
      {
        List localList = (List)localIterator.next();
        NetCheckInfo.Infos localInfos = new NetCheckInfo.Infos();
        localInfos.setValue((String)localList.get(0));
        try
        {
          if (localList.size() >= 3)
          {
            com.wandoujia.p4.netcheck.a.f localf = new com.wandoujia.p4.netcheck.a.f();
            ((com.wandoujia.p4.netcheck.b.b)localf.getRequestBuilder()).a((String)localList.get(0));
            String str = (String)com.wandoujia.p4.a.b().execute(localf);
            localInfos.setInfo(str);
            if (!str.equals(localList.get(2)))
              break label156;
            localInfos.setResult("success");
          }
          while (true)
          {
            localArrayList.add(localInfos);
            break;
            label156: localInfos.setResult("failed");
          }
        }
        catch (ExecutionException localExecutionException)
        {
          while (true)
            localInfos.setResult("failed");
        }
      }
    return localArrayList;
  }

  // ERROR //
  private static List<NetCheckInfo.Infos> b(Configs.TestDomain paramTestDomain)
  {
    // Byte code:
    //   0: new 24	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 25	java/util/ArrayList:<init>	()V
    //   7: astore_1
    //   8: aload_0
    //   9: invokevirtual 172	com/wandoujia/p4/netcheck/model/Configs$TestDomain:getDomains	()Ljava/util/List;
    //   12: astore_2
    //   13: iconst_0
    //   14: istore_3
    //   15: iload_3
    //   16: iconst_3
    //   17: if_icmpge +196 -> 213
    //   20: aload_2
    //   21: invokeinterface 110 1 0
    //   26: astore 4
    //   28: aconst_null
    //   29: astore 5
    //   31: aload 4
    //   33: invokeinterface 116 1 0
    //   38: ifeq +164 -> 202
    //   41: aload 4
    //   43: invokeinterface 120 1 0
    //   48: checkcast 129	java/lang/String
    //   51: astore 6
    //   53: new 122	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos
    //   56: dup
    //   57: invokespecial 123	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:<init>	()V
    //   60: astore 7
    //   62: aload 7
    //   64: aload 6
    //   66: invokevirtual 133	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:setValue	(Ljava/lang/String;)V
    //   69: new 174	java/net/Socket
    //   72: dup
    //   73: invokespecial 175	java/net/Socket:<init>	()V
    //   76: astore 8
    //   78: aload 8
    //   80: new 177	java/net/InetSocketAddress
    //   83: dup
    //   84: aload 6
    //   86: bipush 80
    //   88: invokespecial 180	java/net/InetSocketAddress:<init>	(Ljava/lang/String;I)V
    //   91: sipush 10000
    //   94: invokevirtual 184	java/net/Socket:connect	(Ljava/net/SocketAddress;I)V
    //   97: aload 8
    //   99: invokevirtual 187	java/net/Socket:isConnected	()Z
    //   102: ifeq +35 -> 137
    //   105: aload 7
    //   107: ldc 155
    //   109: invokevirtual 158	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:setResult	(Ljava/lang/String;)V
    //   112: aload 8
    //   114: invokevirtual 190	java/net/Socket:close	()V
    //   117: aload 8
    //   119: astore 12
    //   121: aload_1
    //   122: aload 7
    //   124: invokeinterface 161 2 0
    //   129: pop
    //   130: aload 12
    //   132: astore 5
    //   134: goto -103 -> 31
    //   137: aload 7
    //   139: ldc 192
    //   141: invokevirtual 158	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:setResult	(Ljava/lang/String;)V
    //   144: goto -32 -> 112
    //   147: astore 11
    //   149: aload 8
    //   151: astore 12
    //   153: aload 7
    //   155: ldc 163
    //   157: invokevirtual 158	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:setResult	(Ljava/lang/String;)V
    //   160: aload 12
    //   162: ifnull -41 -> 121
    //   165: aload 12
    //   167: invokevirtual 190	java/net/Socket:close	()V
    //   170: goto -49 -> 121
    //   173: astore 14
    //   175: goto -54 -> 121
    //   178: astore 16
    //   180: aload 8
    //   182: astore 12
    //   184: goto -63 -> 121
    //   187: astore 9
    //   189: aload 8
    //   191: ifnull +8 -> 199
    //   194: aload 8
    //   196: invokevirtual 190	java/net/Socket:close	()V
    //   199: aload 9
    //   201: athrow
    //   202: iinc 3 1
    //   205: goto -190 -> 15
    //   208: astore 10
    //   210: goto -11 -> 199
    //   213: aload_1
    //   214: areturn
    //   215: astore 13
    //   217: aload 12
    //   219: astore 8
    //   221: aload 13
    //   223: astore 9
    //   225: goto -36 -> 189
    //   228: astore 9
    //   230: aload 5
    //   232: astore 8
    //   234: goto -45 -> 189
    //   237: astore 17
    //   239: aload 5
    //   241: astore 12
    //   243: goto -90 -> 153
    //
    // Exception table:
    //   from	to	target	type
    //   78	112	147	java/lang/Exception
    //   137	144	147	java/lang/Exception
    //   165	170	173	java/io/IOException
    //   112	117	178	java/io/IOException
    //   78	112	187	finally
    //   137	144	187	finally
    //   194	199	208	java/io/IOException
    //   153	160	215	finally
    //   69	78	228	finally
    //   69	78	237	java/lang/Exception
  }

  // ERROR //
  private static NetCheckInfo.Infos e(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 122	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos
    //   5: dup
    //   6: invokespecial 123	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:<init>	()V
    //   9: astore_2
    //   10: aload_2
    //   11: aload_0
    //   12: invokevirtual 133	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:setValue	(Ljava/lang/String;)V
    //   15: new 206	java/lang/StringBuilder
    //   18: dup
    //   19: invokespecial 207	java/lang/StringBuilder:<init>	()V
    //   22: astore_3
    //   23: invokestatic 213	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   26: new 206	java/lang/StringBuilder
    //   29: dup
    //   30: ldc 215
    //   32: invokespecial 217	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   35: aload_0
    //   36: invokevirtual 221	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: invokevirtual 225	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   42: invokevirtual 229	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   45: astore 19
    //   47: aload 19
    //   49: astore 9
    //   51: new 231	java/io/InputStreamReader
    //   54: dup
    //   55: aload 9
    //   57: invokevirtual 237	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   60: invokespecial 240	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   63: astore 10
    //   65: new 242	java/io/LineNumberReader
    //   68: dup
    //   69: aload 10
    //   71: invokespecial 245	java/io/LineNumberReader:<init>	(Ljava/io/Reader;)V
    //   74: astore 5
    //   76: aload 5
    //   78: invokevirtual 248	java/io/LineNumberReader:readLine	()Ljava/lang/String;
    //   81: astore 23
    //   83: aload 23
    //   85: ifnull +76 -> 161
    //   88: aload_3
    //   89: aload 23
    //   91: invokevirtual 221	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: pop
    //   95: aload_3
    //   96: ldc 250
    //   98: invokevirtual 221	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: goto -26 -> 76
    //   105: astore 22
    //   107: aload 10
    //   109: astore 6
    //   111: aload 9
    //   113: astore 7
    //   115: aload_2
    //   116: ldc 163
    //   118: invokevirtual 158	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:setResult	(Ljava/lang/String;)V
    //   121: aload 6
    //   123: ifnull +8 -> 131
    //   126: aload 6
    //   128: invokevirtual 251	java/io/InputStreamReader:close	()V
    //   131: aload 5
    //   133: ifnull +8 -> 141
    //   136: aload 5
    //   138: invokevirtual 252	java/io/LineNumberReader:close	()V
    //   141: aload 7
    //   143: ifnull +8 -> 151
    //   146: aload 7
    //   148: invokevirtual 255	java/lang/Process:destroy	()V
    //   151: aload_2
    //   152: aload_3
    //   153: invokevirtual 225	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   156: invokevirtual 149	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:setInfo	(Ljava/lang/String;)V
    //   159: aload_2
    //   160: areturn
    //   161: aload 9
    //   163: invokevirtual 258	java/lang/Process:waitFor	()I
    //   166: ifne +32 -> 198
    //   169: aload_2
    //   170: ldc 155
    //   172: invokevirtual 158	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:setResult	(Ljava/lang/String;)V
    //   175: aload 10
    //   177: invokevirtual 251	java/io/InputStreamReader:close	()V
    //   180: aload 5
    //   182: invokevirtual 252	java/io/LineNumberReader:close	()V
    //   185: aload 9
    //   187: ifnull -36 -> 151
    //   190: aload 9
    //   192: invokevirtual 255	java/lang/Process:destroy	()V
    //   195: goto -44 -> 151
    //   198: aload_2
    //   199: ldc 163
    //   201: invokevirtual 158	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:setResult	(Ljava/lang/String;)V
    //   204: goto -29 -> 175
    //   207: astore 21
    //   209: aload 5
    //   211: astore_1
    //   212: aload_2
    //   213: ldc 163
    //   215: invokevirtual 158	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:setResult	(Ljava/lang/String;)V
    //   218: aload 10
    //   220: ifnull +8 -> 228
    //   223: aload 10
    //   225: invokevirtual 251	java/io/InputStreamReader:close	()V
    //   228: aload_1
    //   229: ifnull +7 -> 236
    //   232: aload_1
    //   233: invokevirtual 252	java/io/LineNumberReader:close	()V
    //   236: aload 9
    //   238: ifnull -87 -> 151
    //   241: aload 9
    //   243: invokevirtual 255	java/lang/Process:destroy	()V
    //   246: goto -95 -> 151
    //   249: astore 11
    //   251: aconst_null
    //   252: astore 10
    //   254: aconst_null
    //   255: astore 9
    //   257: aload 10
    //   259: ifnull +8 -> 267
    //   262: aload 10
    //   264: invokevirtual 251	java/io/InputStreamReader:close	()V
    //   267: aload_1
    //   268: ifnull +7 -> 275
    //   271: aload_1
    //   272: invokevirtual 252	java/io/LineNumberReader:close	()V
    //   275: aload 9
    //   277: ifnull +8 -> 285
    //   280: aload 9
    //   282: invokevirtual 255	java/lang/Process:destroy	()V
    //   285: aload 11
    //   287: athrow
    //   288: astore 26
    //   290: goto -110 -> 180
    //   293: astore 27
    //   295: goto -110 -> 185
    //   298: astore 15
    //   300: goto -169 -> 131
    //   303: astore 14
    //   305: goto -164 -> 141
    //   308: astore 18
    //   310: goto -82 -> 228
    //   313: astore 17
    //   315: goto -79 -> 236
    //   318: astore 13
    //   320: goto -53 -> 267
    //   323: astore 12
    //   325: goto -50 -> 275
    //   328: astore 11
    //   330: aconst_null
    //   331: astore_1
    //   332: aconst_null
    //   333: astore 10
    //   335: goto -78 -> 257
    //   338: astore 11
    //   340: goto -83 -> 257
    //   343: astore 20
    //   345: aload 5
    //   347: astore_1
    //   348: aload 20
    //   350: astore 11
    //   352: goto -95 -> 257
    //   355: astore 8
    //   357: aload 7
    //   359: astore 9
    //   361: aload 6
    //   363: astore 10
    //   365: aload 5
    //   367: astore_1
    //   368: aload 8
    //   370: astore 11
    //   372: goto -115 -> 257
    //   375: astore 16
    //   377: aconst_null
    //   378: astore_1
    //   379: aconst_null
    //   380: astore 10
    //   382: aconst_null
    //   383: astore 9
    //   385: goto -173 -> 212
    //   388: astore 31
    //   390: aconst_null
    //   391: astore_1
    //   392: aconst_null
    //   393: astore 10
    //   395: goto -183 -> 212
    //   398: astore 29
    //   400: aconst_null
    //   401: astore_1
    //   402: goto -190 -> 212
    //   405: astore 4
    //   407: aconst_null
    //   408: astore 5
    //   410: aconst_null
    //   411: astore 6
    //   413: aconst_null
    //   414: astore 7
    //   416: goto -301 -> 115
    //   419: astore 30
    //   421: aload 9
    //   423: astore 7
    //   425: aconst_null
    //   426: astore 5
    //   428: aconst_null
    //   429: astore 6
    //   431: goto -316 -> 115
    //   434: astore 28
    //   436: aload 10
    //   438: astore 6
    //   440: aload 9
    //   442: astore 7
    //   444: aconst_null
    //   445: astore 5
    //   447: goto -332 -> 115
    //
    // Exception table:
    //   from	to	target	type
    //   76	83	105	java/io/IOException
    //   88	102	105	java/io/IOException
    //   161	175	105	java/io/IOException
    //   198	204	105	java/io/IOException
    //   76	83	207	java/lang/InterruptedException
    //   88	102	207	java/lang/InterruptedException
    //   161	175	207	java/lang/InterruptedException
    //   198	204	207	java/lang/InterruptedException
    //   23	47	249	finally
    //   175	180	288	java/io/IOException
    //   180	185	293	java/io/IOException
    //   126	131	298	java/io/IOException
    //   136	141	303	java/io/IOException
    //   223	228	308	java/io/IOException
    //   232	236	313	java/io/IOException
    //   262	267	318	java/io/IOException
    //   271	275	323	java/io/IOException
    //   51	65	328	finally
    //   65	76	338	finally
    //   212	218	338	finally
    //   76	83	343	finally
    //   88	102	343	finally
    //   161	175	343	finally
    //   198	204	343	finally
    //   115	121	355	finally
    //   23	47	375	java/lang/InterruptedException
    //   51	65	388	java/lang/InterruptedException
    //   65	76	398	java/lang/InterruptedException
    //   23	47	405	java/io/IOException
    //   51	65	419	java/io/IOException
    //   65	76	434	java/io/IOException
  }

  private static NetCheckInfo.DnsInfo f()
  {
    try
    {
      com.wandoujia.p4.netcheck.a.c localc = new com.wandoujia.p4.netcheck.a.c();
      NetCheckInfo.DnsInfo localDnsInfo = new NetCheckInfo.DnsInfo();
      localDnsInfo.setDns((String)com.wandoujia.p4.a.b().execute(localc));
      return localDnsInfo;
    }
    catch (ExecutionException localExecutionException)
    {
    }
    return null;
  }

  // ERROR //
  private static NetCheckInfo.Infos f(String paramString)
  {
    // Byte code:
    //   0: new 122	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos
    //   3: dup
    //   4: invokespecial 123	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:<init>	()V
    //   7: astore_1
    //   8: aload_1
    //   9: aload_0
    //   10: invokevirtual 133	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:setValue	(Ljava/lang/String;)V
    //   13: aconst_null
    //   14: astore_2
    //   15: aconst_null
    //   16: astore_3
    //   17: new 274	java/util/Date
    //   20: dup
    //   21: invokespecial 275	java/util/Date:<init>	()V
    //   24: invokevirtual 279	java/util/Date:getTime	()J
    //   27: lstore 17
    //   29: new 206	java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial 207	java/lang/StringBuilder:<init>	()V
    //   36: astore 19
    //   38: new 281	com/wandoujia/p4/netcheck/a/e
    //   41: dup
    //   42: invokespecial 282	com/wandoujia/p4/netcheck/a/e:<init>	()V
    //   45: astore 20
    //   47: aload 20
    //   49: aload_0
    //   50: invokevirtual 285	com/wandoujia/p4/netcheck/a/e:a	(Ljava/lang/String;)Lcom/wandoujia/p4/netcheck/a/e;
    //   53: pop
    //   54: aload 19
    //   56: aload_0
    //   57: invokevirtual 221	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: pop
    //   61: invokestatic 89	com/wandoujia/p4/a:b	()Lcom/wandoujia/p4/http/a/a;
    //   64: aload 20
    //   66: invokevirtual 95	com/wandoujia/p4/http/a/a:execute	(Lcom/wandoujia/rpc/http/delegate/ApiDelegate;)Ljava/lang/Object;
    //   69: checkcast 287	org/apache/http/HttpResponse
    //   72: astore 23
    //   74: aload 23
    //   76: invokeinterface 291 1 0
    //   81: invokeinterface 296 1 0
    //   86: istore 24
    //   88: aconst_null
    //   89: astore_3
    //   90: aconst_null
    //   91: astore_2
    //   92: iload 24
    //   94: sipush 302
    //   97: if_icmpne +91 -> 188
    //   100: new 298	java/net/URI
    //   103: dup
    //   104: aload_0
    //   105: invokespecial 299	java/net/URI:<init>	(Ljava/lang/String;)V
    //   108: new 298	java/net/URI
    //   111: dup
    //   112: aload 23
    //   114: ldc_w 301
    //   117: invokeinterface 305 2 0
    //   122: invokeinterface 310 1 0
    //   127: invokespecial 299	java/net/URI:<init>	(Ljava/lang/String;)V
    //   130: invokevirtual 314	java/net/URI:resolve	(Ljava/net/URI;)Ljava/net/URI;
    //   133: invokevirtual 315	java/net/URI:toString	()Ljava/lang/String;
    //   136: astore_0
    //   137: aload 19
    //   139: ldc 250
    //   141: invokevirtual 221	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: pop
    //   145: goto -107 -> 38
    //   148: astore 13
    //   150: aconst_null
    //   151: astore 14
    //   153: aload_1
    //   154: ldc 163
    //   156: invokevirtual 158	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:setResult	(Ljava/lang/String;)V
    //   159: aload_1
    //   160: aload 13
    //   162: invokevirtual 318	java/io/IOException:getMessage	()Ljava/lang/String;
    //   165: invokevirtual 149	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:setInfo	(Ljava/lang/String;)V
    //   168: aload_3
    //   169: ifnull +7 -> 176
    //   172: aload_3
    //   173: invokevirtual 321	java/io/ByteArrayOutputStream:close	()V
    //   176: aload 14
    //   178: ifnull +8 -> 186
    //   181: aload 14
    //   183: invokevirtual 324	java/io/InputStream:close	()V
    //   186: aload_1
    //   187: areturn
    //   188: iload 24
    //   190: sipush 200
    //   193: if_icmplt +456 -> 649
    //   196: iload 24
    //   198: sipush 300
    //   201: if_icmpge +448 -> 649
    //   204: aload_1
    //   205: aload 19
    //   207: invokevirtual 225	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   210: invokevirtual 133	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:setValue	(Ljava/lang/String;)V
    //   213: new 274	java/util/Date
    //   216: dup
    //   217: invokespecial 275	java/util/Date:<init>	()V
    //   220: invokevirtual 279	java/util/Date:getTime	()J
    //   223: lstore 30
    //   225: new 320	java/io/ByteArrayOutputStream
    //   228: dup
    //   229: invokespecial 325	java/io/ByteArrayOutputStream:<init>	()V
    //   232: astore 27
    //   234: aload 23
    //   236: invokeinterface 329 1 0
    //   241: invokeinterface 334 1 0
    //   246: astore 32
    //   248: aload 32
    //   250: astore 26
    //   252: aload 23
    //   254: invokeinterface 329 1 0
    //   259: invokeinterface 337 1 0
    //   264: lstore 34
    //   266: lload 34
    //   268: lconst_0
    //   269: lcmp
    //   270: ifle +122 -> 392
    //   273: aload 26
    //   275: ifnull +117 -> 392
    //   278: aload 26
    //   280: iconst_0
    //   281: aload 27
    //   283: iconst_0
    //   284: invokestatic 343	com/wandoujia/base/utils/IOUtils:write	(Ljava/io/InputStream;ZLjava/io/OutputStream;Z)V
    //   287: aload_1
    //   288: ldc 155
    //   290: invokevirtual 158	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:setResult	(Ljava/lang/String;)V
    //   293: aload 27
    //   295: invokevirtual 347	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   298: arraylength
    //   299: i2l
    //   300: lload 34
    //   302: lcmp
    //   303: ifeq +16 -> 319
    //   306: aload_1
    //   307: ldc 163
    //   309: invokevirtual 158	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:setResult	(Ljava/lang/String;)V
    //   312: aload_1
    //   313: ldc_w 349
    //   316: invokevirtual 149	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:setInfo	(Ljava/lang/String;)V
    //   319: new 274	java/util/Date
    //   322: dup
    //   323: invokespecial 275	java/util/Date:<init>	()V
    //   326: invokevirtual 279	java/util/Date:getTime	()J
    //   329: lstore 36
    //   331: lload 36
    //   333: lload 30
    //   335: lsub
    //   336: l2d
    //   337: ldc2_w 350
    //   340: ddiv
    //   341: dstore 38
    //   343: lload 34
    //   345: ldc2_w 352
    //   348: ldiv
    //   349: l2d
    //   350: dload 38
    //   352: ddiv
    //   353: dstore 40
    //   355: aload_1
    //   356: new 206	java/lang/StringBuilder
    //   359: dup
    //   360: invokespecial 207	java/lang/StringBuilder:<init>	()V
    //   363: dload 40
    //   365: invokevirtual 356	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   368: ldc 250
    //   370: invokevirtual 221	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: lload 36
    //   375: lload 17
    //   377: lsub
    //   378: l2d
    //   379: ldc2_w 350
    //   382: ddiv
    //   383: invokevirtual 356	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   386: invokevirtual 225	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   389: invokevirtual 149	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:setInfo	(Ljava/lang/String;)V
    //   392: aload 27
    //   394: ifnull +8 -> 402
    //   397: aload 27
    //   399: invokevirtual 321	java/io/ByteArrayOutputStream:close	()V
    //   402: aload 26
    //   404: ifnull -218 -> 186
    //   407: aload 26
    //   409: invokevirtual 324	java/io/InputStream:close	()V
    //   412: aload_1
    //   413: areturn
    //   414: astore 28
    //   416: aload_1
    //   417: areturn
    //   418: astore 10
    //   420: aload_1
    //   421: ldc 163
    //   423: invokevirtual 158	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:setResult	(Ljava/lang/String;)V
    //   426: aload_1
    //   427: aload 10
    //   429: invokevirtual 357	java/net/URISyntaxException:getMessage	()Ljava/lang/String;
    //   432: invokevirtual 149	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:setInfo	(Ljava/lang/String;)V
    //   435: aload_3
    //   436: ifnull +7 -> 443
    //   439: aload_3
    //   440: invokevirtual 321	java/io/ByteArrayOutputStream:close	()V
    //   443: aload_2
    //   444: ifnull -258 -> 186
    //   447: aload_2
    //   448: invokevirtual 324	java/io/InputStream:close	()V
    //   451: aload_1
    //   452: areturn
    //   453: astore 11
    //   455: aload_1
    //   456: areturn
    //   457: astore 7
    //   459: aload_1
    //   460: ldc 163
    //   462: invokevirtual 158	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:setResult	(Ljava/lang/String;)V
    //   465: aload_1
    //   466: aload 7
    //   468: invokevirtual 358	java/util/concurrent/ExecutionException:getMessage	()Ljava/lang/String;
    //   471: invokevirtual 149	com/wandoujia/p4/netcheck/model/NetCheckInfo$Infos:setInfo	(Ljava/lang/String;)V
    //   474: aload_3
    //   475: ifnull +7 -> 482
    //   478: aload_3
    //   479: invokevirtual 321	java/io/ByteArrayOutputStream:close	()V
    //   482: aload_2
    //   483: ifnull -297 -> 186
    //   486: aload_2
    //   487: invokevirtual 324	java/io/InputStream:close	()V
    //   490: aload_1
    //   491: areturn
    //   492: astore 8
    //   494: aload_1
    //   495: areturn
    //   496: astore 4
    //   498: aload_3
    //   499: ifnull +7 -> 506
    //   502: aload_3
    //   503: invokevirtual 321	java/io/ByteArrayOutputStream:close	()V
    //   506: aload_2
    //   507: ifnull +7 -> 514
    //   510: aload_2
    //   511: invokevirtual 324	java/io/InputStream:close	()V
    //   514: aload 4
    //   516: athrow
    //   517: astore 29
    //   519: goto -117 -> 402
    //   522: astore 16
    //   524: goto -348 -> 176
    //   527: astore 15
    //   529: aload_1
    //   530: areturn
    //   531: astore 12
    //   533: goto -90 -> 443
    //   536: astore 9
    //   538: goto -56 -> 482
    //   541: astore 6
    //   543: goto -37 -> 506
    //   546: astore 5
    //   548: goto -34 -> 514
    //   551: astore 4
    //   553: aload 27
    //   555: astore_3
    //   556: aconst_null
    //   557: astore_2
    //   558: goto -60 -> 498
    //   561: astore 4
    //   563: aload 26
    //   565: astore_2
    //   566: aload 27
    //   568: astore_3
    //   569: goto -71 -> 498
    //   572: astore 4
    //   574: aload 14
    //   576: astore_2
    //   577: goto -79 -> 498
    //   580: astore 7
    //   582: aload 27
    //   584: astore_3
    //   585: aconst_null
    //   586: astore_2
    //   587: goto -128 -> 459
    //   590: astore 7
    //   592: aload 26
    //   594: astore_2
    //   595: aload 27
    //   597: astore_3
    //   598: goto -139 -> 459
    //   601: astore 10
    //   603: aload 27
    //   605: astore_3
    //   606: aconst_null
    //   607: astore_2
    //   608: goto -188 -> 420
    //   611: astore 10
    //   613: aload 26
    //   615: astore_2
    //   616: aload 27
    //   618: astore_3
    //   619: goto -199 -> 420
    //   622: astore 13
    //   624: aload 27
    //   626: astore_3
    //   627: aconst_null
    //   628: astore 14
    //   630: goto -477 -> 153
    //   633: astore 13
    //   635: aload 27
    //   637: astore 33
    //   639: aload 26
    //   641: astore 14
    //   643: aload 33
    //   645: astore_3
    //   646: goto -493 -> 153
    //   649: aconst_null
    //   650: astore 26
    //   652: aconst_null
    //   653: astore 27
    //   655: goto -263 -> 392
    //
    // Exception table:
    //   from	to	target	type
    //   17	38	148	java/io/IOException
    //   38	88	148	java/io/IOException
    //   100	145	148	java/io/IOException
    //   204	234	148	java/io/IOException
    //   407	412	414	java/io/IOException
    //   17	38	418	java/net/URISyntaxException
    //   38	88	418	java/net/URISyntaxException
    //   100	145	418	java/net/URISyntaxException
    //   204	234	418	java/net/URISyntaxException
    //   447	451	453	java/io/IOException
    //   17	38	457	java/util/concurrent/ExecutionException
    //   38	88	457	java/util/concurrent/ExecutionException
    //   100	145	457	java/util/concurrent/ExecutionException
    //   204	234	457	java/util/concurrent/ExecutionException
    //   486	490	492	java/io/IOException
    //   17	38	496	finally
    //   38	88	496	finally
    //   100	145	496	finally
    //   204	234	496	finally
    //   420	435	496	finally
    //   459	474	496	finally
    //   397	402	517	java/io/IOException
    //   172	176	522	java/io/IOException
    //   181	186	527	java/io/IOException
    //   439	443	531	java/io/IOException
    //   478	482	536	java/io/IOException
    //   502	506	541	java/io/IOException
    //   510	514	546	java/io/IOException
    //   234	248	551	finally
    //   252	266	561	finally
    //   278	319	561	finally
    //   319	392	561	finally
    //   153	168	572	finally
    //   234	248	580	java/util/concurrent/ExecutionException
    //   252	266	590	java/util/concurrent/ExecutionException
    //   278	319	590	java/util/concurrent/ExecutionException
    //   319	392	590	java/util/concurrent/ExecutionException
    //   234	248	601	java/net/URISyntaxException
    //   252	266	611	java/net/URISyntaxException
    //   278	319	611	java/net/URISyntaxException
    //   319	392	611	java/net/URISyntaxException
    //   234	248	622	java/io/IOException
    //   252	266	633	java/io/IOException
    //   278	319	633	java/io/IOException
    //   319	392	633	java/io/IOException
  }

  public final String a()
  {
    return this.d.getUdid();
  }

  public final void a(NetCheckController.NetcheckType paramNetcheckType)
  {
    ArrayList localArrayList = new ArrayList();
    while (true)
    {
      Iterator localIterator;
      synchronized (this.f)
      {
        localIterator = this.f.iterator();
        if (!localIterator.hasNext())
          break;
        g localg = (g)((WeakReference)localIterator.next()).get();
        if (localg != null)
          localArrayList.add(localg);
      }
      localIterator.remove();
    }
    monitorexit;
    com.wandoujia.p4.a.d().post(new e(localArrayList, paramNetcheckType));
  }

  public final void a(g paramg)
  {
    if (paramg == null)
      return;
    synchronized (this.f)
    {
      Iterator localIterator = this.f.iterator();
      while (localIterator.hasNext())
        if (paramg.equals((g)((WeakReference)localIterator.next()).get()))
          return;
    }
    this.f.add(new WeakReference(paramg));
    monitorexit;
  }

  public final void a(Configs.Publics paramPublics, Configs.TestDomain paramTestDomain)
  {
    ThreadPool.execute(new c(this, paramPublics, paramTestDomain));
  }

  public final void a(String paramString)
  {
    this.d.setUdid(paramString);
  }

  public final void a(List<List<String>> paramList)
  {
    ThreadPool.execute(new a(this, paramList));
  }

  public final void b(List<String> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      ThreadPool.execute(new b(this, (String)localIterator.next(), paramList));
  }

  public final boolean b(String paramString)
  {
    try
    {
      NetCheckInfo.Common localCommon = this.d;
      String str1;
      if (NetworkUtil.isWifiConnected(com.wandoujia.p4.a.a()))
        str1 = "WIFI";
      while (true)
      {
        localCommon.setNetwork(str1);
        this.d.setDatetime(DateUtil.timeStamp2Date(String.valueOf(System.currentTimeMillis()), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")));
        this.d.setSpace(SystemUtil.getAvailableExternalStorage() / 1024L / 1024L + "M/" + SystemUtil.getTotalExternalMemorySize() / 1024L / 1024L + "M");
        if (!TextUtils.isEmpty(paramString))
          this.d.setUdid(paramString);
        this.c.setCommon(this.d);
        String str2 = new com.wandoujia.gson.c().a(this.c);
        com.wandoujia.p4.netcheck.a.h localh = new com.wandoujia.p4.netcheck.a.h();
        localh.a(this.d.getUdid()).b(str2);
        if (((HttpResponse)com.wandoujia.p4.a.b().execute(localh)).getStatusLine().getStatusCode() != 200)
          break;
        return true;
        if (NetworkUtil.isMobileNetworkConnected(com.wandoujia.p4.a.a()))
        {
          str1 = "2G/3G";
          continue;
        }
        str1 = "NO_NETWORK";
      }
      return false;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public final void c()
  {
    ThreadPool.execute(new d(this));
  }

  public final void d()
  {
    this.g.postDelayed(new h(this, 0), 60000L);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.controller.NetCheckController
 * JD-Core Version:    0.6.0
 */