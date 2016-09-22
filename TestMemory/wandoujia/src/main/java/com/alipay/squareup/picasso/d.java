package com.alipay.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.alipay.squareup.okhttp.HttpResponseCache;
import com.alipay.squareup.okhttp.OkHttpClient;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class d
  implements Loader
{
  private final OkHttpClient a;

  public d(Context paramContext)
  {
    this(p.b(paramContext));
  }

  private d(OkHttpClient paramOkHttpClient)
  {
    this.a = paramOkHttpClient;
  }

  private d(File paramFile)
  {
    this(paramFile, p.a(paramFile));
  }

  private d(File paramFile, int paramInt)
  {
    this(new OkHttpClient());
    try
    {
      this.a.setResponseCache(new HttpResponseCache(paramFile, paramInt));
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  public final b load(Uri paramUri, boolean paramBoolean)
  {
    HttpURLConnection localHttpURLConnection = this.a.open(new URL(paramUri.toString()));
    localHttpURLConnection.setUseCaches(true);
    if (paramBoolean)
      localHttpURLConnection.setRequestProperty("Cache-Control", "only-if-cached");
    boolean bool = p.b(localHttpURLConnection.getHeaderField("X-Android-Response-Source"));
    return new b(localHttpURLConnection.getInputStream(), bool);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.squareup.picasso.d
 * JD-Core Version:    0.6.0
 */