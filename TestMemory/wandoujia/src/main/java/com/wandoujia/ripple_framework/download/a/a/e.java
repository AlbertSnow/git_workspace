package com.wandoujia.ripple_framework.download.a.a;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.download2.DownloadRequestParam;
import com.wandoujia.download2.DownloadRequestParam.Type;
import com.wandoujia.gson.JsonSyntaxException;
import com.wandoujia.gson.c;
import com.wandoujia.logv3.model.packages.DownloadPackage.VerifyType;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.DownloadInfo.Status;
import java.util.HashMap;

public final class e
{
  private static final c a = new c();

  private static int a(Cursor paramCursor, String paramString, int paramInt)
  {
    int i = paramCursor.getColumnIndex(paramString);
    if (i < 0)
      return paramInt;
    return paramCursor.getInt(i);
  }

  private static long a(Cursor paramCursor, String paramString)
  {
    int i = paramCursor.getColumnIndex(paramString);
    if (i < 0)
      return 0L;
    return paramCursor.getLong(i);
  }

  private static DownloadInfo a(Cursor paramCursor)
  {
    DownloadInfo localDownloadInfo = new DownloadInfo();
    localDownloadInfo.b = b(paramCursor, "resouce_identity");
    if (localDownloadInfo.b == null)
      return null;
    localDownloadInfo.a = (localDownloadInfo.b + System.currentTimeMillis());
    if (a(paramCursor, "status", 200) == 200)
      localDownloadInfo.c = DownloadInfo.Status.SUCCESS;
    while (true)
    {
      DownloadRequestParam localDownloadRequestParam = new DownloadRequestParam();
      String str1;
      switch (a(paramCursor, "resource_type", 0))
      {
      default:
        localDownloadRequestParam.a = DownloadRequestParam.Type.APP;
        localDownloadRequestParam.b = b(paramCursor, "uri");
        if (localDownloadRequestParam.b == null)
          break;
        localDownloadRequestParam.e = b(paramCursor, "_data");
        if (localDownloadRequestParam.e == null)
          break;
        str1 = b(paramCursor, "verify_type");
        if (TextUtils.isEmpty(str1));
      case 14:
      case 15:
        try
        {
          localDownloadRequestParam.f = DownloadPackage.VerifyType.valueOf(str1);
          localDownloadRequestParam.g = b(paramCursor, "verify_value");
          DownloadInfo2 localDownloadInfo2 = new DownloadInfo2(localDownloadRequestParam);
          if (localDownloadInfo.c == DownloadInfo.Status.SUCCESS)
          {
            localDownloadInfo2.d = a(paramCursor, "total_bytes");
            localDownloadInfo2.e = a(paramCursor, "current_bytes");
          }
          localDownloadInfo.d = localDownloadInfo2;
          localDownloadInfo.f = b(paramCursor, "title");
          localDownloadInfo.g = b(paramCursor, "icon_url");
          localDownloadInfo.h = true;
          localDownloadInfo.i = System.currentTimeMillis();
          localDownloadInfo.e = ContentTypeEnum.ContentType.APP;
          localDownloadInfo.m = localDownloadInfo.b;
          String str2 = b(paramCursor, "resource_extras");
          if (str2 != null)
          {
            HashMap localHashMap = a(str2);
            if (localHashMap != null)
            {
              if (localHashMap.containsKey("version"))
                localDownloadInfo.n = Integer.valueOf((String)localHashMap.get("version")).intValue();
              if ((localHashMap.containsKey("extra.packet.dst.path")) && (localHashMap.containsKey("extra.packet.src.path")))
              {
                localDownloadInfo.p = "game_packet";
                localDownloadInfo.q = com.wandoujia.gamepacket.b.a((String)localHashMap.get("extra.packet.dst.path"), (String)localHashMap.get("extra.packet.src.path"));
              }
            }
          }
          return localDownloadInfo;
          localDownloadInfo.c = DownloadInfo.Status.PAUSED_BY_APP;
          continue;
          localDownloadRequestParam.a = DownloadRequestParam.Type.GAME_PACKET;
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          while (true)
          {
            localDownloadRequestParam.f = DownloadPackage.VerifyType.NONE;
            localDownloadRequestParam.g = null;
          }
        }
      }
    }
  }

  private static HashMap<String, String> a(String paramString)
  {
    try
    {
      HashMap localHashMap = (HashMap)a.a(paramString, new f().getType());
      return localHashMap;
    }
    catch (JsonSyntaxException localJsonSyntaxException)
    {
    }
    return null;
  }

  // ERROR //
  public static java.util.List<DownloadInfo> a(Context paramContext)
  {
    // Byte code:
    //   0: new 178	java/util/HashMap
    //   3: dup
    //   4: invokespecial 243	java/util/HashMap:<init>	()V
    //   7: astore_1
    //   8: aconst_null
    //   9: astore_2
    //   10: aload_0
    //   11: invokestatic 248	com/wandoujia/ripple_framework/download/a/a/b:a	(Landroid/content/Context;)Lcom/wandoujia/ripple_framework/download/a/a/b;
    //   14: getstatic 253	com/wandoujia/ripple_framework/download/a/a/a:a	Landroid/net/Uri;
    //   17: ldc 255
    //   19: invokevirtual 258	com/wandoujia/ripple_framework/download/a/a/b:a	(Landroid/net/Uri;Ljava/lang/String;)Landroid/database/Cursor;
    //   22: astore 7
    //   24: aload 7
    //   26: astore 4
    //   28: aload 4
    //   30: ifnull +100 -> 130
    //   33: aload 4
    //   35: invokeinterface 261 1 0
    //   40: ifle +90 -> 130
    //   43: aload 4
    //   45: invokeinterface 265 1 0
    //   50: istore 9
    //   52: iload 9
    //   54: ifeq +76 -> 130
    //   57: aload 4
    //   59: invokestatic 267	com/wandoujia/ripple_framework/download/a/a/e:a	(Landroid/database/Cursor;)Lcom/wandoujia/ripple_framework/download/DownloadInfo;
    //   62: astore 11
    //   64: aload 11
    //   66: ifnull -23 -> 43
    //   69: aload_1
    //   70: aload 11
    //   72: getfield 46	com/wandoujia/ripple_framework/download/DownloadInfo:b	Ljava/lang/String;
    //   75: invokeinterface 270 2 0
    //   80: ifeq +28 -> 108
    //   83: aload 11
    //   85: getfield 201	com/wandoujia/ripple_framework/download/DownloadInfo:n	I
    //   88: aload_1
    //   89: aload 11
    //   91: getfield 46	com/wandoujia/ripple_framework/download/DownloadInfo:b	Ljava/lang/String;
    //   94: invokeinterface 271 2 0
    //   99: checkcast 36	com/wandoujia/ripple_framework/download/DownloadInfo
    //   102: getfield 201	com/wandoujia/ripple_framework/download/DownloadInfo:n	I
    //   105: if_icmple -62 -> 43
    //   108: aload_1
    //   109: aload 11
    //   111: getfield 46	com/wandoujia/ripple_framework/download/DownloadInfo:b	Ljava/lang/String;
    //   114: aload 11
    //   116: invokeinterface 275 3 0
    //   121: pop
    //   122: goto -79 -> 43
    //   125: astore 10
    //   127: goto -84 -> 43
    //   130: aload 4
    //   132: ifnull +10 -> 142
    //   135: aload 4
    //   137: invokeinterface 278 1 0
    //   142: new 280	java/util/ArrayList
    //   145: dup
    //   146: aload_1
    //   147: invokeinterface 284 1 0
    //   152: invokespecial 287	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
    //   155: areturn
    //   156: astore 6
    //   158: aload_2
    //   159: ifnull -17 -> 142
    //   162: aload_2
    //   163: invokeinterface 278 1 0
    //   168: goto -26 -> 142
    //   171: astore_3
    //   172: aconst_null
    //   173: astore 4
    //   175: aload_3
    //   176: astore 5
    //   178: aload 4
    //   180: ifnull +10 -> 190
    //   183: aload 4
    //   185: invokeinterface 278 1 0
    //   190: aload 5
    //   192: athrow
    //   193: astore 5
    //   195: goto -17 -> 178
    //   198: astore 8
    //   200: aload 4
    //   202: astore_2
    //   203: goto -45 -> 158
    //
    // Exception table:
    //   from	to	target	type
    //   57	64	125	java/lang/Exception
    //   69	108	125	java/lang/Exception
    //   108	122	125	java/lang/Exception
    //   10	24	156	java/lang/Exception
    //   10	24	171	finally
    //   33	43	193	finally
    //   43	52	193	finally
    //   57	64	193	finally
    //   69	108	193	finally
    //   108	122	193	finally
    //   33	43	198	java/lang/Exception
    //   43	52	198	java/lang/Exception
  }

  private static String b(Cursor paramCursor, String paramString)
  {
    int i = paramCursor.getColumnIndex(paramString);
    if (i < 0)
      return null;
    return paramCursor.getString(i);
  }

  public static void b(Context paramContext)
  {
    b.a(paramContext).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.a.a.e
 * JD-Core Version:    0.6.0
 */