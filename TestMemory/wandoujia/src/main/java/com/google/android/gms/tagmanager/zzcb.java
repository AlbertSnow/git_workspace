package com.google.android.gms.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

class zzcb
{
  private static zzcb a;
  private volatile zzcb.zza b = zzcb.zza.zzaMI;
  private volatile String c = null;
  private volatile String d = null;
  private volatile String e = null;

  static zzcb a()
  {
    monitorenter;
    try
    {
      if (a == null)
        a = new zzcb();
      zzcb localzzcb = a;
      return localzzcb;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private static String a(String paramString)
  {
    return paramString.split("&")[0].split("=")[1];
  }

  final boolean a(Uri paramUri)
  {
    int i = 1;
    monitorenter;
    while (true)
    {
      String str;
      try
      {
        str = URLDecoder.decode(paramUri.toString(), "UTF-8");
        if (str.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$"))
        {
          q.e();
          if (!str.matches(".*?&gtm_debug=x$"))
            continue;
          this.b = zzcb.zza.zzaMK;
          this.e = paramUri.getQuery().replace("&gtm_debug=x", "");
          if ((this.b != zzcb.zza.zzaMJ) && (this.b != zzcb.zza.zzaMK))
            continue;
          this.d = ("/r?" + this.e);
          this.c = a(this.e);
          return i;
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        i = 0;
        continue;
        this.b = zzcb.zza.zzaMJ;
        continue;
      }
      finally
      {
        monitorexit;
      }
      if (str.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$"))
      {
        if (a(paramUri.getQuery()).equals(this.c))
        {
          new StringBuilder("Exit preview mode for container: ").append(this.c);
          q.e();
          this.b = zzcb.zza.zzaMI;
          this.d = null;
          continue;
        }
      }
      else
      {
        q.c();
        i = 0;
        continue;
      }
      i = 0;
    }
  }

  final zzcb.zza b()
  {
    return this.b;
  }

  final String c()
  {
    return this.d;
  }

  final String d()
  {
    return this.c;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.tagmanager.zzcb
 * JD-Core Version:    0.6.0
 */