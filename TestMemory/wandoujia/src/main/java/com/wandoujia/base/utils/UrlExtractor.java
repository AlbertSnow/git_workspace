package com.wandoujia.base.utils;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class UrlExtractor
{
  private URL url;

  public UrlExtractor(String paramString)
  {
    try
    {
      this.url = new URL(paramString);
      return;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      this.url = null;
    }
  }

  public UrlExtractor(URL paramURL)
  {
    this.url = paramURL;
  }

  private URL extractUrl()
  {
    if (this.url != null)
    {
      Map localMap = splitUrlQuery(this.url.getQuery());
      if (localMap.containsKey("url"))
      {
        String str = (String)localMap.get("url");
        try
        {
          URL localURL = new URL(URLDecoder.decode(str, "UTF-8"));
          return localURL;
        }
        catch (MalformedURLException localMalformedURLException)
        {
          return null;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          return null;
        }
      }
      return null;
    }
    return null;
  }

  public static Set<String> getQueryParameterNames(Uri paramUri)
  {
    if (SystemUtil.aboveApiLevel(11))
      return paramUri.getQueryParameterNames();
    if (paramUri.isOpaque())
      throw new UnsupportedOperationException("This isn't a hierarchical URI.");
    String str = paramUri.getEncodedQuery();
    if (str == null)
      return Collections.emptySet();
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    int i = 0;
    do
    {
      int j = str.indexOf('&', i);
      if (j == -1)
        j = str.length();
      int k = str.indexOf('=', i);
      if ((k > j) || (k == -1))
        k = j;
      localLinkedHashSet.add(Uri.decode(str.substring(i, k)));
      i = j + 1;
    }
    while (i < str.length());
    return Collections.unmodifiableSet(localLinkedHashSet);
  }

  private boolean isContainHost(String paramString)
  {
    if (this.url != null)
      return this.url.getHost().contains(paramString);
    return false;
  }

  private static Map<String, String> splitUrlQuery(String paramString)
  {
    HashMap localHashMap = new HashMap();
    String[] arrayOfString1 = paramString.split("&");
    if ((arrayOfString1 != null) && (arrayOfString1.length > 0))
    {
      int i = arrayOfString1.length;
      for (int j = 0; j < i; j++)
      {
        String[] arrayOfString2 = arrayOfString1[j].split("=", 2);
        if ((arrayOfString2 == null) || (arrayOfString2.length != 2))
          continue;
        localHashMap.put(arrayOfString2[0], arrayOfString2[1]);
      }
    }
    return localHashMap;
  }

  public String extractHost(String paramString)
  {
    String str;
    if (isContainHost(paramString))
    {
      URL localURL2 = extractUrl();
      str = null;
      if (localURL2 != null)
        str = localURL2.getHost();
    }
    URL localURL1;
    do
    {
      return str;
      localURL1 = this.url;
      str = null;
    }
    while (localURL1 == null);
    return this.url.getHost();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.UrlExtractor
 * JD-Core Version:    0.6.0
 */