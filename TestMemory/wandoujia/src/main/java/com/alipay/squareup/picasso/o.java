package com.alipay.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import android.os.Build.VERSION;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class o
  implements Loader
{
  private static final Object a = new Object();
  private static volatile Object b;
  private final Context c;

  public o(Context paramContext)
  {
    this.c = paramContext.getApplicationContext();
  }

  public final b load(Uri paramUri, boolean paramBoolean)
  {
    Context localContext;
    if (Build.VERSION.SDK_INT >= 14)
    {
      localContext = this.c;
      if (b != null);
    }
    try
    {
      synchronized (a)
      {
        if (b == null)
        {
          File localFile = p.b(localContext);
          HttpResponseCache localHttpResponseCache = HttpResponseCache.getInstalled();
          if (localHttpResponseCache == null)
            localHttpResponseCache = HttpResponseCache.install(localFile, p.a(localFile));
          b = localHttpResponseCache;
        }
        label72: HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(paramUri.toString()).openConnection();
        localHttpURLConnection.setUseCaches(true);
        if (paramBoolean)
          localHttpURLConnection.setRequestProperty("Cache-Control", "only-if-cached");
        boolean bool = p.b(localHttpURLConnection.getHeaderField("X-Android-Response-Source"));
        return new b(localHttpURLConnection.getInputStream(), bool);
      }
    }
    catch (IOException localIOException)
    {
      break label72;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.squareup.picasso.o
 * JD-Core Version:    0.6.0
 */