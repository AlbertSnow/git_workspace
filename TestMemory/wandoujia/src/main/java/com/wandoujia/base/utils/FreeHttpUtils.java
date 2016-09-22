package com.wandoujia.base.utils;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

public class FreeHttpUtils
{
  public static final String FREE_HOST_NAME = "vip.wandoujia.com";
  public static final HttpHost FREE_HTTP_HOST = new HttpHost("vip.wandoujia.com", -1, "http");
  private static final String FREE_URL = "http://vip.wandoujia.com/proxy";
  private static final String FREE_URL_EXPRESSION = "http://vip.wandoujia.com/proxy\\?url=[^\\s]*";
  private static final String PARAM_URL = "url";
  private static List<NameValuePair> freeParams;
  private static boolean inFreeMode = false;

  public static HttpRequest buildFreeRequest(HttpRequest paramHttpRequest)
  {
    if ((paramHttpRequest instanceof HttpRequestBase))
    {
      HttpRequestBase localHttpRequestBase = (HttpRequestBase)paramHttpRequest;
      localHttpRequestBase.setURI(generateFreeURI(localHttpRequestBase.getURI()));
    }
    return paramHttpRequest;
  }

  public static URI buildFreeURIIfNeed(URI paramURI)
  {
    if (isInFreeMode())
      paramURI = generateFreeURI(paramURI);
    return paramURI;
  }

  public static String buildFreeURLIfNeed(String paramString)
  {
    if (isInFreeMode())
      paramString = generateFreeURI(URI.create(paramString)).toString();
    return paramString;
  }

  public static URL buildFreeURLIfNeed(URL paramURL)
  {
    if (isInFreeMode());
    try
    {
      URL localURL = generateFreeURI(paramURL.toURI()).toURL();
      paramURL = localURL;
      return paramURL;
    }
    catch (URISyntaxException localURISyntaxException)
    {
      return paramURL;
    }
    catch (MalformedURLException localMalformedURLException)
    {
    }
    return paramURL;
  }

  private static URI generateFreeURI(URI paramURI)
  {
    if ((paramURI == null) || (isProxyUrl(paramURI.toString())))
      return paramURI;
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("url", paramURI.toString()));
    localArrayList.addAll(freeParams);
    return URI.create("http://vip.wandoujia.com/proxy?" + URLEncodedUtils.format(localArrayList, "utf-8"));
  }

  public static String getMimeType(String paramString)
  {
    String str1 = MimeTypeMap.getFileExtensionFromUrl(paramString);
    String str2 = null;
    if (str1 != null)
      str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str1);
    return str2;
  }

  public static boolean isInFreeMode()
  {
    return inFreeMode;
  }

  public static boolean isProxyUrl(String paramString)
  {
    return paramString.matches("http://vip.wandoujia.com/proxy\\?url=[^\\s]*");
  }

  public static void setFreeHttpParams(List<NameValuePair> paramList)
  {
    freeParams = paramList;
  }

  public static void setInFreeMode(boolean paramBoolean)
  {
    inFreeMode = paramBoolean;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.FreeHttpUtils
 * JD-Core Version:    0.6.0
 */