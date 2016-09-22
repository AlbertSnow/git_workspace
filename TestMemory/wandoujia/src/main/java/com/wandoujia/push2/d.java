package com.wandoujia.push2;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.wandoujia.base.log.Log;
import com.wandoujia.gson.JsonSyntaxException;
import com.wandoujia.gson.c;
import com.wandoujia.push2.protocol.Download;
import com.wandoujia.push2.protocol.NormalBody;
import com.wandoujia.push2.protocol.NormalBody.GoldStyle;
import com.wandoujia.push2.protocol.NormalBody.IronStyle;
import java.util.Calendar;

public abstract class d
  implements l
{
  private static final int a = Build.VERSION.SDK_INT;

  // ERROR //
  private static android.graphics.Bitmap b(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 33	android/webkit/URLUtil:isValidUrl	(Ljava/lang/String;)Z
    //   4: istore_1
    //   5: aconst_null
    //   6: astore_2
    //   7: iload_1
    //   8: ifne +5 -> 13
    //   11: aload_2
    //   12: areturn
    //   13: new 35	java/net/URL
    //   16: dup
    //   17: aload_0
    //   18: invokespecial 38	java/net/URL:<init>	(Ljava/lang/String;)V
    //   21: invokevirtual 42	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   24: invokevirtual 48	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   27: astore 15
    //   29: aload 15
    //   31: astore 4
    //   33: new 50	java/io/BufferedInputStream
    //   36: dup
    //   37: aload 4
    //   39: invokespecial 53	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   42: astore 6
    //   44: aload 6
    //   46: invokestatic 59	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   49: astore 18
    //   51: aload 18
    //   53: astore_2
    //   54: aload 6
    //   56: invokevirtual 62	java/io/BufferedInputStream:close	()V
    //   59: aload 4
    //   61: ifnull -50 -> 11
    //   64: aload 4
    //   66: invokevirtual 65	java/io/InputStream:close	()V
    //   69: aload_2
    //   70: areturn
    //   71: astore 20
    //   73: aload_2
    //   74: areturn
    //   75: astore 12
    //   77: aconst_null
    //   78: astore 6
    //   80: aconst_null
    //   81: astore 4
    //   83: aload 6
    //   85: ifnull +8 -> 93
    //   88: aload 6
    //   90: invokevirtual 62	java/io/BufferedInputStream:close	()V
    //   93: aconst_null
    //   94: astore_2
    //   95: aload 4
    //   97: ifnull -86 -> 11
    //   100: aload 4
    //   102: invokevirtual 65	java/io/InputStream:close	()V
    //   105: aconst_null
    //   106: areturn
    //   107: astore 13
    //   109: aconst_null
    //   110: areturn
    //   111: astore 9
    //   113: aconst_null
    //   114: astore 6
    //   116: aconst_null
    //   117: astore 4
    //   119: aload 6
    //   121: ifnull +8 -> 129
    //   124: aload 6
    //   126: invokevirtual 62	java/io/BufferedInputStream:close	()V
    //   129: aconst_null
    //   130: astore_2
    //   131: aload 4
    //   133: ifnull -122 -> 11
    //   136: aload 4
    //   138: invokevirtual 65	java/io/InputStream:close	()V
    //   141: aconst_null
    //   142: areturn
    //   143: astore 10
    //   145: aconst_null
    //   146: areturn
    //   147: astore_3
    //   148: aconst_null
    //   149: astore 4
    //   151: aload_3
    //   152: astore 5
    //   154: aconst_null
    //   155: astore 6
    //   157: aload 6
    //   159: ifnull +8 -> 167
    //   162: aload 6
    //   164: invokevirtual 62	java/io/BufferedInputStream:close	()V
    //   167: aload 4
    //   169: ifnull +8 -> 177
    //   172: aload 4
    //   174: invokevirtual 65	java/io/InputStream:close	()V
    //   177: aload 5
    //   179: athrow
    //   180: astore 19
    //   182: goto -123 -> 59
    //   185: astore 14
    //   187: goto -94 -> 93
    //   190: astore 11
    //   192: goto -63 -> 129
    //   195: astore 8
    //   197: goto -30 -> 167
    //   200: astore 7
    //   202: goto -25 -> 177
    //   205: astore 23
    //   207: aload 23
    //   209: astore 5
    //   211: aconst_null
    //   212: astore 6
    //   214: goto -57 -> 157
    //   217: astore 5
    //   219: goto -62 -> 157
    //   222: astore 22
    //   224: aconst_null
    //   225: astore 6
    //   227: goto -108 -> 119
    //   230: astore 17
    //   232: goto -113 -> 119
    //   235: astore 21
    //   237: aconst_null
    //   238: astore 6
    //   240: goto -157 -> 83
    //   243: astore 16
    //   245: goto -162 -> 83
    //
    // Exception table:
    //   from	to	target	type
    //   64	69	71	java/io/IOException
    //   13	29	75	java/net/MalformedURLException
    //   100	105	107	java/io/IOException
    //   13	29	111	java/io/IOException
    //   136	141	143	java/io/IOException
    //   13	29	147	finally
    //   54	59	180	java/io/IOException
    //   88	93	185	java/io/IOException
    //   124	129	190	java/io/IOException
    //   162	167	195	java/io/IOException
    //   172	177	200	java/io/IOException
    //   33	44	205	finally
    //   44	51	217	finally
    //   33	44	222	java/io/IOException
    //   44	51	230	java/io/IOException
    //   33	44	235	java/net/MalformedURLException
    //   44	51	243	java/net/MalformedURLException
  }

  @TargetApi(9)
  private static long c()
  {
    if (a < 9)
      return 0L;
    try
    {
      long l = g.a().b().getPackageManager().getPackageInfo(g.a().b().getPackageName(), 0).firstInstallTime;
      return l;
    }
    catch (Exception localException)
    {
    }
    return 0L;
  }

  protected abstract boolean a();

  protected boolean a(NormalBody paramNormalBody)
  {
    if (!a())
    {
      Log.d("NormalEntityProcessor", "user close push", new Object[0]);
      return true;
    }
    int i;
    if ((!DateUtils.isToday(c())) || (paramNormalBody.getType() == 2))
      if ((paramNormalBody.getType() == 1) || (paramNormalBody.getType() == 2))
        i = 1;
    while (i == 0)
    {
      Log.d("NormalEntityProcessor", "notification should not show", new Object[0]);
      return false;
      int k;
      if (System.currentTimeMillis() - g.a().b().getSharedPreferences("push2", 0).getLong("last_display_time", 0L) > g.a().c().e())
      {
        k = 1;
        label112: if (k == 0)
          break label174;
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.setTimeInMillis(System.currentTimeMillis());
        if (localCalendar.get(11) < 8)
          break label168;
      }
      label168: for (int m = 1; ; m = 0)
      {
        if ((m == 0) || (DateUtils.isToday(0L)))
          break label174;
        i = 1;
        break;
        k = 0;
        break label112;
      }
      label174: i = 0;
    }
    if (TextUtils.isEmpty(paramNormalBody.getIntent()))
    {
      Log.d("NormalEntityProcessor", "No intent", new Object[0]);
      return true;
    }
    Intent localIntent1 = LogHelper.a(paramNormalBody, "notification");
    if (localIntent1 == null)
    {
      Log.d("NormalEntityProcessor", "intent error", new Object[0]);
      return true;
    }
    int j = 100081 + (int)(0xFFF & System.currentTimeMillis());
    Handler localHandler = new Handler(Looper.getMainLooper());
    f localf = new f(0);
    if (!TextUtils.isEmpty(paramNormalBody.getIcon()))
      localf.a = b(paramNormalBody.getIcon());
    if (localf.a == null)
      localf.a = BitmapFactory.decodeResource(g.a().b().getResources(), g.a().c().d());
    switch (paramNormalBody.getStyle())
    {
    default:
      label344: if (paramNormalBody.getDownload() == null)
        break;
      if (paramNormalBody.getDownload().isPreDownload())
      {
        Context localContext = g.a().b();
        Download localDownload2 = paramNormalBody.getDownload();
        Intent localIntent2 = new Intent("phoenix.intent.action.PUSH_DOWNLOAD");
        localIntent2.setComponent(new ComponentName(localContext, RedirectActivity.class));
        localIntent2.putExtra("push2_download", new c().a(localDownload2));
        LogHelper.a(localContext, localIntent2);
      }
    case 1:
    case 0:
    }
    while (true)
    {
      localHandler.post(new e(localIntent1, paramNormalBody, localf, j));
      if (paramNormalBody.getType() != 0)
        break;
      SharedPreferences.Editor localEditor = g.a().b().getSharedPreferences("push2", 0).edit();
      localEditor.putLong("last_display_time", System.currentTimeMillis());
      localEditor.commit();
      return true;
      if (paramNormalBody.getGoldStyle() == null)
      {
        Log.d("NormalEntityProcessor", "No gold style", new Object[0]);
        return true;
      }
      if ((!TextUtils.isEmpty(paramNormalBody.getGoldStyle().getImage())) && (a >= 16))
        localf.c = b(paramNormalBody.getGoldStyle().getImage());
      if (TextUtils.isEmpty(paramNormalBody.getGoldStyle().getCollapsedImage()))
        break label344;
      localf.d = b(paramNormalBody.getGoldStyle().getCollapsedImage());
      break label344;
      if (paramNormalBody.getIronStyle() == null)
      {
        Log.d("NormalEntityProcessor", "No gold style", new Object[0]);
        return true;
      }
      if (TextUtils.isEmpty(paramNormalBody.getIronStyle().getIcon()))
        break label344;
      localf.b = b(paramNormalBody.getIronStyle().getIcon());
      break label344;
      Download localDownload1 = paramNormalBody.getDownload();
      localIntent1.putExtra("push2_download", new c().a(localDownload1));
    }
  }

  public final boolean a(String paramString)
  {
    try
    {
      NormalBody localNormalBody = (NormalBody)new c().a(paramString, NormalBody.class);
      return a(localNormalBody);
    }
    catch (JsonSyntaxException localJsonSyntaxException)
    {
    }
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.d
 * JD-Core Version:    0.6.0
 */