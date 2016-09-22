package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.view.MotionEvent;

public class zzan
{
  private String zzor = "googleads.g.doubleclick.net";
  private String zzos = "/pagead/ads";
  private String zzot = "ad.doubleclick.net";
  private String[] zzou = { ".doubleclick.net", ".googleadservices.com", ".googlesyndication.com" };
  private static final String[] zzov = { "/aclk", "/pcs/click" };
  private zzaj zzow;

  public zzan(zzaj paramzzaj)
  {
    this.zzow = paramzzaj;
  }

  public boolean zza(Uri paramUri)
  {
    if (paramUri == null)
      throw new NullPointerException();
    try
    {
      return paramUri.getHost().equals(this.zzot);
    }
    catch (NullPointerException localNullPointerException)
    {
    }
    return false;
  }

  public boolean zzb(Uri paramUri)
  {
    if (paramUri == null)
      throw new NullPointerException();
    try
    {
      String str1 = paramUri.getHost();
      for (String str2 : this.zzou)
        if (str1.endsWith(str2))
          return true;
      return false;
    }
    catch (NullPointerException localNullPointerException)
    {
    }
    return false;
  }

  public zzaj zzab()
  {
    return this.zzow;
  }

  public void zza(MotionEvent paramMotionEvent)
  {
    this.zzow.zza(paramMotionEvent);
  }

  public Uri zza(Uri paramUri, Context paramContext)
    throws zzao
  {
    try
    {
      return zza(paramUri, paramContext, paramUri.getQueryParameter("ai"), true);
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
    }
    throw new zzao("Provided Uri is not in a valid state");
  }

  public boolean zzc(Uri paramUri)
  {
    if (zzb(paramUri))
      for (String str : zzov)
        if (paramUri.getPath().endsWith(str))
          return true;
    return false;
  }

  private Uri zza(Uri paramUri, String paramString1, String paramString2)
    throws UnsupportedOperationException
  {
    String str = paramUri.toString();
    int i = str.indexOf("&adurl");
    if (i == -1)
      i = str.indexOf("?adurl");
    if (i != -1)
    {
      localObject = new StringBuilder(str.substring(0, i + 1));
      return Uri.parse(paramString1 + "=" + paramString2 + "&" + str.substring(i + 1));
    }
    Object localObject = paramUri.buildUpon();
    localObject = ((Uri.Builder)localObject).appendQueryParameter(paramString1, paramString2);
    return (Uri)((Uri.Builder)localObject).build();
  }

  private Uri zzb(Uri paramUri, String paramString1, String paramString2)
  {
    String str = paramUri.toString();
    int i = str.indexOf(";adurl");
    if (i != -1)
    {
      localObject = new StringBuilder(str.substring(0, i + 1));
      return Uri.parse(paramString1 + "=" + paramString2 + ";" + str.substring(i + 1));
    }
    Object localObject = paramUri.getEncodedPath();
    int j = str.indexOf((String)localObject);
    StringBuilder localStringBuilder = new StringBuilder(str.substring(0, j + ((String)localObject).length()));
    return (Uri)Uri.parse(";" + paramString1 + "=" + paramString2 + ";" + str.substring(j + ((String)localObject).length()));
  }

  private Uri zza(Uri paramUri, Context paramContext, String paramString, boolean paramBoolean)
    throws zzao
  {
    try
    {
      boolean bool = zza(paramUri);
      if (bool)
      {
        if (paramUri.toString().contains("dc_ms="))
          throw new zzao("Parameter already exists: dc_ms");
      }
      else if (paramUri.getQueryParameter("ms") != null)
        throw new zzao("Query parameter already exists: ms");
      String str;
      if (paramBoolean)
        str = this.zzow.zzb(paramContext, paramString);
      else
        str = this.zzow.zzb(paramContext);
      if (bool)
        return zzb(paramUri, "dc_ms", str);
      return zza(paramUri, "ms", str);
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
    }
    throw new zzao("Provided Uri is not in a valid state");
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzan
 * JD-Core Version:    0.6.0
 */