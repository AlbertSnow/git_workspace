package com.wandoujia.nirvana.framework.network.a;

import android.annotation.SuppressLint;
import android.net.http.AndroidHttpClient;
import android.os.Build.VERSION;
import com.android.volley.i;
import com.android.volley.toolbox.d;
import com.android.volley.toolbox.f;
import com.android.volley.toolbox.g;
import com.android.volley.toolbox.h;
import com.wandoujia.base.http.HttpClientWrapper;
import java.io.File;
import java.util.Map;

public final class a
{
  public final byte[] a;
  public final Map<String, String> b;
  public final boolean c;

  public a(byte[] paramArrayOfByte, Map<String, String> paramMap)
  {
    this(paramArrayOfByte, paramMap, false);
  }

  public a(byte[] paramArrayOfByte, Map<String, String> paramMap, boolean paramBoolean)
  {
    this.a = paramArrayOfByte;
    this.b = paramMap;
    this.c = paramBoolean;
  }

  @SuppressLint({"NewApi"})
  public static i a(File paramFile, String paramString)
  {
    d locald = new d(paramFile, 5242880);
    if (Build.VERSION.SDK_INT >= 9);
    for (Object localObject = new h(new b()); ; localObject = new f(HttpClientWrapper.newInstance(AndroidHttpClient.newInstance(paramString))))
    {
      i locali = new i(locald, new com.android.volley.toolbox.a((g)localObject), 4);
      locali.a();
      return locali;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.network.a.a
 * JD-Core Version:    0.6.0
 */