package com.wandoujia.jupiter.notification;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import com.wandoujia.push.protocol.NotificationModel;
import com.wandoujia.push.protocol.NotificationModel.Content;
import com.wandoujia.push.protocol.NotificationModel.Icon;
import com.wandoujia.push.protocol.NotificationModel.ViewType;
import java.util.Map;

public final class NotificationController
{
  private static final int[] g = { 2131493250, 2131493251, 2131493252, 2131493253, 2131493254, 2131493255 };
  private static final int h = Build.VERSION.SDK_INT;
  private NotificationModel a;
  private int b;
  private Context c;
  private String d;
  private NotificationController.NotificationType e;
  private Bundle f;

  public NotificationController(NotificationModel paramNotificationModel, int paramInt, NotificationController.NotificationType paramNotificationType, Bundle paramBundle)
  {
    this.a = paramNotificationModel;
    this.b = paramInt;
    this.c = com.wandoujia.p4.a.a();
    this.d = paramNotificationModel.getId();
    this.e = paramNotificationType;
    this.f = paramBundle;
  }

  // ERROR //
  private static Bitmap a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 97	android/webkit/URLUtil:isValidUrl	(Ljava/lang/String;)Z
    //   4: istore_1
    //   5: aconst_null
    //   6: astore_2
    //   7: iload_1
    //   8: ifne +5 -> 13
    //   11: aload_2
    //   12: areturn
    //   13: new 99	java/net/URL
    //   16: dup
    //   17: aload_0
    //   18: invokespecial 102	java/net/URL:<init>	(Ljava/lang/String;)V
    //   21: invokevirtual 106	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   24: invokevirtual 112	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   27: astore 15
    //   29: aload 15
    //   31: astore 4
    //   33: new 114	java/io/BufferedInputStream
    //   36: dup
    //   37: aload 4
    //   39: invokespecial 117	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   42: astore 6
    //   44: aload 6
    //   46: invokestatic 123	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   49: astore 18
    //   51: aload 18
    //   53: astore_2
    //   54: aload 6
    //   56: invokevirtual 126	java/io/BufferedInputStream:close	()V
    //   59: aload 4
    //   61: ifnull -50 -> 11
    //   64: aload 4
    //   66: invokevirtual 129	java/io/InputStream:close	()V
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
    //   90: invokevirtual 126	java/io/BufferedInputStream:close	()V
    //   93: aconst_null
    //   94: astore_2
    //   95: aload 4
    //   97: ifnull -86 -> 11
    //   100: aload 4
    //   102: invokevirtual 129	java/io/InputStream:close	()V
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
    //   126: invokevirtual 126	java/io/BufferedInputStream:close	()V
    //   129: aconst_null
    //   130: astore_2
    //   131: aload 4
    //   133: ifnull -122 -> 11
    //   136: aload 4
    //   138: invokevirtual 129	java/io/InputStream:close	()V
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
    //   164: invokevirtual 126	java/io/BufferedInputStream:close	()V
    //   167: aload 4
    //   169: ifnull +8 -> 177
    //   172: aload 4
    //   174: invokevirtual 129	java/io/InputStream:close	()V
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

  private void a(Intent paramIntent, d paramd)
  {
    Bundle localBundle = new Bundle();
    if (this.f != null)
      localBundle.putAll(this.f);
    localBundle.putString("id", this.d);
    localBundle.putString("title", this.a.getContent().getSummary());
    localBundle.putString("standard_view_type", this.a.getViewType().getStandardViewType());
    localBundle.putString("big_view_type", this.a.getViewType().getBigViewType());
    localBundle.putInt("notification_id", this.b);
    localBundle.putString("notification_type", this.e.name());
    localBundle.putString("click_view_type", paramd.a());
    localBundle.putString("click_view_element", paramd.b());
    localBundle.putString("click_view_text", paramd.c());
    paramIntent.putExtras(localBundle);
  }

  private void a(Map<String, Bitmap> paramMap)
  {
    NotificationModel.Icon localIcon = this.a.getIcon();
    if (!TextUtils.isEmpty(localIcon.getLargeIconPath()))
    {
      Bitmap localBitmap2 = a(localIcon.getLargeIconPath());
      if (localBitmap2 != null)
        paramMap.put(localIcon.getLargeIconPath(), localBitmap2);
    }
    String[] arrayOfString = localIcon.getSmallIconList();
    if ((arrayOfString != null) && (arrayOfString.length > 0))
    {
      int i = arrayOfString.length;
      for (int j = 0; j < i; j++)
      {
        String str = arrayOfString[j];
        if (TextUtils.isEmpty(str))
          continue;
        Bitmap localBitmap1 = a(str);
        if (localBitmap1 == null)
          continue;
        paramMap.put(str, localBitmap1);
      }
    }
  }

  public final void a(a parama)
  {
    android.support.v4.app.b.a(new b(this, parama), new Void[0]);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.notification.NotificationController
 * JD-Core Version:    0.6.0
 */