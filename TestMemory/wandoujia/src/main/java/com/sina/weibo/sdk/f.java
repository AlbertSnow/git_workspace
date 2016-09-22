package com.sina.weibo.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

public class f
{
  private static final Uri a;
  private static f b;
  private Context c;

  static
  {
    f.class.getName();
    a = Uri.parse("content://com.sina.weibo.sdkProvider/query/package");
  }

  private f(Context paramContext)
  {
    this.c = paramContext.getApplicationContext();
  }

  public static f a(Context paramContext)
  {
    monitorenter;
    try
    {
      if (b == null)
        b = new f(paramContext);
      f localf = b;
      return localf;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  // ERROR //
  private g a(java.lang.String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 60	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   4: ifeq +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: aload_0
    //   10: getfield 40	com/sina/weibo/sdk/f:c	Landroid/content/Context;
    //   13: aload_1
    //   14: iconst_2
    //   15: invokevirtual 64	android/content/Context:createPackageContext	(Ljava/lang/String;I)Landroid/content/Context;
    //   18: astore 23
    //   20: sipush 4096
    //   23: newarray byte
    //   25: astore 24
    //   27: aload 23
    //   29: invokevirtual 68	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   32: ldc 70
    //   34: invokevirtual 76	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   37: astore 25
    //   39: aload 25
    //   41: astore_3
    //   42: new 78	java/lang/StringBuilder
    //   45: dup
    //   46: invokespecial 79	java/lang/StringBuilder:<init>	()V
    //   49: astore 26
    //   51: aload_3
    //   52: aload 24
    //   54: iconst_0
    //   55: sipush 4096
    //   58: invokevirtual 85	java/io/InputStream:read	([BII)I
    //   61: istore 27
    //   63: iload 27
    //   65: iconst_m1
    //   66: if_icmpne +49 -> 115
    //   69: aload 26
    //   71: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   74: invokestatic 60	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   77: ifne +18 -> 95
    //   80: aload_0
    //   81: getfield 40	com/sina/weibo/sdk/f:c	Landroid/content/Context;
    //   84: aload_1
    //   85: invokestatic 93	com/sina/weibo/sdk/a:a	(Landroid/content/Context;Ljava/lang/String;)Z
    //   88: istore 30
    //   90: iload 30
    //   92: ifne +70 -> 162
    //   95: aload_3
    //   96: ifnull -89 -> 7
    //   99: aload_3
    //   100: invokevirtual 96	java/io/InputStream:close	()V
    //   103: aconst_null
    //   104: areturn
    //   105: astore 28
    //   107: aload 28
    //   109: invokevirtual 99	java/io/IOException:getMessage	()Ljava/lang/String;
    //   112: pop
    //   113: aconst_null
    //   114: areturn
    //   115: aload 26
    //   117: new 101	java/lang/String
    //   120: dup
    //   121: aload 24
    //   123: iconst_0
    //   124: iload 27
    //   126: invokespecial 104	java/lang/String:<init>	([BII)V
    //   129: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: pop
    //   133: goto -82 -> 51
    //   136: astore_2
    //   137: aload_2
    //   138: invokevirtual 109	android/content/pm/PackageManager$NameNotFoundException:getMessage	()Ljava/lang/String;
    //   141: pop
    //   142: aload_3
    //   143: ifnull -136 -> 7
    //   146: aload_3
    //   147: invokevirtual 96	java/io/InputStream:close	()V
    //   150: aconst_null
    //   151: areturn
    //   152: astore 8
    //   154: aload 8
    //   156: invokevirtual 99	java/io/IOException:getMessage	()Ljava/lang/String;
    //   159: pop
    //   160: aconst_null
    //   161: areturn
    //   162: new 111	org/json/JSONObject
    //   165: dup
    //   166: aload 26
    //   168: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   171: invokespecial 114	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   174: ldc 116
    //   176: iconst_m1
    //   177: invokevirtual 120	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   180: istore 31
    //   182: new 122	com/sina/weibo/sdk/g
    //   185: dup
    //   186: invokespecial 123	com/sina/weibo/sdk/g:<init>	()V
    //   189: astore 32
    //   191: aload 32
    //   193: aload_1
    //   194: invokestatic 126	com/sina/weibo/sdk/g:a	(Lcom/sina/weibo/sdk/g;Ljava/lang/String;)V
    //   197: aload 32
    //   199: iload 31
    //   201: invokestatic 129	com/sina/weibo/sdk/g:a	(Lcom/sina/weibo/sdk/g;I)V
    //   204: aload_3
    //   205: ifnull +7 -> 212
    //   208: aload_3
    //   209: invokevirtual 96	java/io/InputStream:close	()V
    //   212: aload 32
    //   214: areturn
    //   215: astore 33
    //   217: aload 33
    //   219: invokevirtual 99	java/io/IOException:getMessage	()Ljava/lang/String;
    //   222: pop
    //   223: goto -11 -> 212
    //   226: astore 19
    //   228: aconst_null
    //   229: astore_3
    //   230: aload 19
    //   232: invokevirtual 99	java/io/IOException:getMessage	()Ljava/lang/String;
    //   235: pop
    //   236: aload_3
    //   237: ifnull -230 -> 7
    //   240: aload_3
    //   241: invokevirtual 96	java/io/InputStream:close	()V
    //   244: aconst_null
    //   245: areturn
    //   246: astore 21
    //   248: aload 21
    //   250: invokevirtual 99	java/io/IOException:getMessage	()Ljava/lang/String;
    //   253: pop
    //   254: aconst_null
    //   255: areturn
    //   256: astore 15
    //   258: aconst_null
    //   259: astore_3
    //   260: aload 15
    //   262: invokevirtual 130	org/json/JSONException:getMessage	()Ljava/lang/String;
    //   265: pop
    //   266: aload_3
    //   267: ifnull -260 -> 7
    //   270: aload_3
    //   271: invokevirtual 96	java/io/InputStream:close	()V
    //   274: aconst_null
    //   275: areturn
    //   276: astore 17
    //   278: aload 17
    //   280: invokevirtual 99	java/io/IOException:getMessage	()Ljava/lang/String;
    //   283: pop
    //   284: aconst_null
    //   285: areturn
    //   286: astore 11
    //   288: aconst_null
    //   289: astore_3
    //   290: aload 11
    //   292: invokevirtual 131	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   295: pop
    //   296: aload_3
    //   297: ifnull -290 -> 7
    //   300: aload_3
    //   301: invokevirtual 96	java/io/InputStream:close	()V
    //   304: aconst_null
    //   305: areturn
    //   306: astore 13
    //   308: aload 13
    //   310: invokevirtual 99	java/io/IOException:getMessage	()Ljava/lang/String;
    //   313: pop
    //   314: aconst_null
    //   315: areturn
    //   316: astore 10
    //   318: aconst_null
    //   319: astore_3
    //   320: aload 10
    //   322: astore 4
    //   324: aload_3
    //   325: ifnull +7 -> 332
    //   328: aload_3
    //   329: invokevirtual 96	java/io/InputStream:close	()V
    //   332: aload 4
    //   334: athrow
    //   335: astore 5
    //   337: aload 5
    //   339: invokevirtual 99	java/io/IOException:getMessage	()Ljava/lang/String;
    //   342: pop
    //   343: goto -11 -> 332
    //   346: astore 4
    //   348: goto -24 -> 324
    //   351: astore 11
    //   353: goto -63 -> 290
    //   356: astore 15
    //   358: goto -98 -> 260
    //   361: astore 19
    //   363: goto -133 -> 230
    //   366: astore_2
    //   367: aconst_null
    //   368: astore_3
    //   369: goto -232 -> 137
    //
    // Exception table:
    //   from	to	target	type
    //   99	103	105	java/io/IOException
    //   42	51	136	android/content/pm/PackageManager$NameNotFoundException
    //   51	63	136	android/content/pm/PackageManager$NameNotFoundException
    //   69	90	136	android/content/pm/PackageManager$NameNotFoundException
    //   115	133	136	android/content/pm/PackageManager$NameNotFoundException
    //   162	204	136	android/content/pm/PackageManager$NameNotFoundException
    //   146	150	152	java/io/IOException
    //   208	212	215	java/io/IOException
    //   9	39	226	java/io/IOException
    //   240	244	246	java/io/IOException
    //   9	39	256	org/json/JSONException
    //   270	274	276	java/io/IOException
    //   9	39	286	java/lang/Exception
    //   300	304	306	java/io/IOException
    //   9	39	316	finally
    //   328	332	335	java/io/IOException
    //   42	51	346	finally
    //   51	63	346	finally
    //   69	90	346	finally
    //   115	133	346	finally
    //   137	142	346	finally
    //   162	204	346	finally
    //   230	236	346	finally
    //   260	266	346	finally
    //   290	296	346	finally
    //   42	51	351	java/lang/Exception
    //   51	63	351	java/lang/Exception
    //   69	90	351	java/lang/Exception
    //   115	133	351	java/lang/Exception
    //   162	204	351	java/lang/Exception
    //   42	51	356	org/json/JSONException
    //   51	63	356	org/json/JSONException
    //   69	90	356	org/json/JSONException
    //   115	133	356	org/json/JSONException
    //   162	204	356	org/json/JSONException
    //   42	51	361	java/io/IOException
    //   51	63	361	java/io/IOException
    //   69	90	361	java/io/IOException
    //   115	133	361	java/io/IOException
    //   162	204	361	java/io/IOException
    //   9	39	366	android/content/pm/PackageManager$NameNotFoundException
  }

  // ERROR //
  private static g b(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 138	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore_1
    //   5: aload_1
    //   6: getstatic 28	com/sina/weibo/sdk/f:a	Landroid/net/Uri;
    //   9: aconst_null
    //   10: aconst_null
    //   11: aconst_null
    //   12: aconst_null
    //   13: invokevirtual 144	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   16: astore 6
    //   18: aload 6
    //   20: astore_3
    //   21: aload_3
    //   22: ifnonnull +19 -> 41
    //   25: aload_3
    //   26: ifnull +9 -> 35
    //   29: aload_3
    //   30: invokeinterface 147 1 0
    //   35: aconst_null
    //   36: astore 13
    //   38: aload 13
    //   40: areturn
    //   41: aload_3
    //   42: ldc 116
    //   44: invokeinterface 151 2 0
    //   49: istore 7
    //   51: aload_3
    //   52: ldc 153
    //   54: invokeinterface 151 2 0
    //   59: istore 8
    //   61: aload_3
    //   62: invokeinterface 157 1 0
    //   67: ifeq +132 -> 199
    //   70: aload_3
    //   71: iload 7
    //   73: invokeinterface 161 2 0
    //   78: astore 9
    //   80: aload 9
    //   82: invokestatic 166	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   85: istore 14
    //   87: iload 14
    //   89: istore 11
    //   91: aload_3
    //   92: iload 8
    //   94: invokeinterface 161 2 0
    //   99: astore 12
    //   101: aload 12
    //   103: invokestatic 60	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   106: ifne +93 -> 199
    //   109: aload_0
    //   110: aload 12
    //   112: invokestatic 93	com/sina/weibo/sdk/a:a	(Landroid/content/Context;Ljava/lang/String;)Z
    //   115: ifeq +84 -> 199
    //   118: new 122	com/sina/weibo/sdk/g
    //   121: dup
    //   122: invokespecial 123	com/sina/weibo/sdk/g:<init>	()V
    //   125: astore 13
    //   127: aload 13
    //   129: aload 12
    //   131: invokestatic 126	com/sina/weibo/sdk/g:a	(Lcom/sina/weibo/sdk/g;Ljava/lang/String;)V
    //   134: aload 13
    //   136: iload 11
    //   138: invokestatic 129	com/sina/weibo/sdk/g:a	(Lcom/sina/weibo/sdk/g;I)V
    //   141: aload_3
    //   142: ifnull -104 -> 38
    //   145: aload_3
    //   146: invokeinterface 147 1 0
    //   151: aload 13
    //   153: areturn
    //   154: astore 10
    //   156: iconst_m1
    //   157: istore 11
    //   159: goto -68 -> 91
    //   162: astore 4
    //   164: aconst_null
    //   165: astore_3
    //   166: aload 4
    //   168: invokevirtual 131	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   171: pop
    //   172: aload_3
    //   173: ifnull +9 -> 182
    //   176: aload_3
    //   177: invokeinterface 147 1 0
    //   182: aconst_null
    //   183: areturn
    //   184: astore_2
    //   185: aconst_null
    //   186: astore_3
    //   187: aload_3
    //   188: ifnull +9 -> 197
    //   191: aload_3
    //   192: invokeinterface 147 1 0
    //   197: aload_2
    //   198: athrow
    //   199: aload_3
    //   200: ifnull -18 -> 182
    //   203: aload_3
    //   204: invokeinterface 147 1 0
    //   209: goto -27 -> 182
    //   212: astore_2
    //   213: goto -26 -> 187
    //   216: astore 4
    //   218: goto -52 -> 166
    //
    // Exception table:
    //   from	to	target	type
    //   80	87	154	java/lang/NumberFormatException
    //   5	18	162	java/lang/Exception
    //   5	18	184	finally
    //   41	80	212	finally
    //   80	87	212	finally
    //   91	141	212	finally
    //   166	172	212	finally
    //   41	80	216	java/lang/Exception
    //   80	87	216	java/lang/Exception
    //   91	141	216	java/lang/Exception
  }

  public final g a()
  {
    int i = 1;
    monitorenter;
    while (true)
    {
      g localg1;
      try
      {
        Context localContext = this.c;
        localg1 = b(localContext);
        Intent localIntent = new Intent("com.sina.weibo.action.sdkidentity");
        localIntent.addCategory("android.intent.category.DEFAULT");
        List localList = localContext.getPackageManager().queryIntentServices(localIntent, 0);
        if (localList != null)
        {
          if (!localList.isEmpty())
            continue;
          break label280;
          if ((j == 0) || (i == 0))
            continue;
          int k = localg1.b();
          int m = ((g)localObject2).b();
          if (k < m)
            continue;
          localObject2 = localg1;
          return localObject2;
          Iterator localIterator = localList.iterator();
          Object localObject3 = null;
          if (localIterator.hasNext())
            continue;
          localObject2 = localObject3;
          break label283;
          ResolveInfo localResolveInfo = (ResolveInfo)localIterator.next();
          if ((localResolveInfo.serviceInfo == null) || (localResolveInfo.serviceInfo.applicationInfo == null) || (TextUtils.isEmpty(localResolveInfo.serviceInfo.applicationInfo.packageName)))
            continue;
          g localg2 = a(localResolveInfo.serviceInfo.applicationInfo.packageName);
          if (localg2 == null)
            continue;
          if (localObject3 != null)
            continue;
          localObject3 = localg2;
          continue;
          int n = localObject3.b();
          int i1 = localg2.b();
          if (n >= i1)
            continue;
          localObject3 = localg2;
          continue;
          j = 0;
          break label291;
          i = 0;
          continue;
          if (j == 0)
            continue;
          localObject2 = localg1;
          continue;
          if (i != 0)
            continue;
          localObject2 = null;
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      label280: Object localObject2 = null;
      label283: if (localg1 == null)
        continue;
      int j = i;
      label291: if (localObject2 == null)
        continue;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.f
 * JD-Core Version:    0.6.0
 */