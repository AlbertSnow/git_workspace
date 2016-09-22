package com.wandoujia.gamepacket;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.DownloadUrl;
import com.wandoujia.base.utils.CollectionUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class b
{
  private Context a;
  private String b;
  private String c;
  private String d;
  private String e;
  private DialogInterface.OnClickListener f;
  private DialogInterface.OnClickListener g;
  private View h;

  public b(Context paramContext)
  {
    this.a = paramContext;
  }

  public static DownloadUrl a(List<DownloadUrl> paramList, long paramLong)
  {
    if (Looper.getMainLooper() == Looper.myLooper())
      throw new IllegalStateException("Must not run on UI thread");
    if (!CollectionUtils.isEmpty(paramList))
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        DownloadUrl localDownloadUrl = (DownloadUrl)localIterator.next();
        if ((localDownloadUrl != null) && (d(localDownloadUrl.url) == paramLong))
          return localDownloadUrl;
      }
    }
    return null;
  }

  public static String a(String paramString1, String paramString2)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
      return null;
    HashMap localHashMap = new HashMap();
    localHashMap.put("src_path", paramString1);
    localHashMap.put("dst_path", paramString2);
    return new com.wandoujia.gson.c().a(localHashMap);
  }

  public static boolean a(AppDetail paramAppDetail)
  {
    return (paramAppDetail != null) && (!CollectionUtils.isEmpty(paramAppDetail.extension_pack));
  }

  public static Map<String, String> c(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return null;
    try
    {
      Map localMap = (Map)new com.wandoujia.gson.c().a(paramString, new o().getType());
      return localMap;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  // ERROR //
  private static long d(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 124	java/net/URL
    //   5: dup
    //   6: aload_0
    //   7: invokespecial 125	java/net/URL:<init>	(Ljava/lang/String;)V
    //   10: invokevirtual 129	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   13: astore 8
    //   15: aload 8
    //   17: invokevirtual 135	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   20: astore 9
    //   22: aload 9
    //   24: astore_3
    //   25: aload 8
    //   27: invokevirtual 138	java/net/URLConnection:connect	()V
    //   30: aload 8
    //   32: invokevirtual 142	java/net/URLConnection:getContentLength	()I
    //   35: istore 11
    //   37: iload 11
    //   39: i2l
    //   40: lstore 12
    //   42: aload_3
    //   43: ifnull +7 -> 50
    //   46: aload_3
    //   47: invokevirtual 147	java/io/InputStream:close	()V
    //   50: lload 12
    //   52: lreturn
    //   53: astore 6
    //   55: aload_1
    //   56: ifnull +7 -> 63
    //   59: aload_1
    //   60: invokevirtual 147	java/io/InputStream:close	()V
    //   63: lconst_0
    //   64: lreturn
    //   65: astore_2
    //   66: aconst_null
    //   67: astore_3
    //   68: aload_2
    //   69: astore 4
    //   71: aload_3
    //   72: ifnull +7 -> 79
    //   75: aload_3
    //   76: invokevirtual 147	java/io/InputStream:close	()V
    //   79: aload 4
    //   81: athrow
    //   82: astore 14
    //   84: lload 12
    //   86: lreturn
    //   87: astore 7
    //   89: goto -26 -> 63
    //   92: astore 5
    //   94: goto -15 -> 79
    //   97: astore 4
    //   99: goto -28 -> 71
    //   102: astore 10
    //   104: aload_3
    //   105: astore_1
    //   106: goto -51 -> 55
    //
    // Exception table:
    //   from	to	target	type
    //   2	22	53	java/io/IOException
    //   2	22	65	finally
    //   46	50	82	java/io/IOException
    //   59	63	87	java/io/IOException
    //   75	79	92	java/io/IOException
    //   25	37	97	finally
    //   25	37	102	java/io/IOException
  }

  public final a a()
  {
    a locala = new a(this.a, 0);
    if (!TextUtils.isEmpty(this.b))
    {
      a.a(locala).setText(this.b);
      if (TextUtils.isEmpty(this.c))
        break label168;
      a.b(locala).setText(this.c);
    }
    while (true)
    {
      if (!TextUtils.isEmpty(this.d))
      {
        a.c(locala).setText(this.d);
        a.c(locala).setOnClickListener(new c(this, locala));
      }
      if (!TextUtils.isEmpty(this.e))
      {
        a.d(locala).setText(this.e);
        a.d(locala).setOnClickListener(new d(this, locala));
      }
      if (this.h != null)
      {
        a.e(locala).removeAllViews();
        a.e(locala).addView(this.h);
      }
      return locala;
      a.a(locala).setVisibility(8);
      break;
      label168: a.b(locala).setVisibility(8);
    }
  }

  public final b a(View paramView)
  {
    this.h = paramView;
    return this;
  }

  public final b a(String paramString)
  {
    this.b = paramString;
    return this;
  }

  public final b a(String paramString, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.d = paramString;
    this.f = paramOnClickListener;
    return this;
  }

  public final b b(String paramString)
  {
    this.c = paramString;
    return this;
  }

  public final b b(String paramString, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.e = paramString;
    this.g = paramOnClickListener;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gamepacket.b
 * JD-Core Version:    0.6.0
 */