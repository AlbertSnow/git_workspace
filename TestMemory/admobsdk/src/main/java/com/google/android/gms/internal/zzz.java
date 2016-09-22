package com.google.android.gms.internal;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public class zzz
  implements zzy
{
  private final zza zzaE;
  private final SSLSocketFactory zzaF;

  public zzz()
  {
    this(null);
  }

  public zzz(zza paramzza)
  {
    this(paramzza, null);
  }

  public zzz(zza paramzza, SSLSocketFactory paramSSLSocketFactory)
  {
    this.zzaE = paramzza;
    this.zzaF = paramSSLSocketFactory;
  }

  public HttpResponse zza(zzk<?> paramzzk, Map<String, String> paramMap)
    throws IOException, zza
  {
    Object localObject1 = paramzzk.getUrl();
    HashMap localHashMap = new HashMap();
    localHashMap.putAll(paramzzk.getHeaders());
    localHashMap.putAll(paramMap);
    if (this.zzaE != null)
    {
      localObject2 = this.zzaE.zzh((String)localObject1);
      if (localObject2 == null)
        throw new IOException("URL blocked by rewriter: " + (String)localObject1);
      localObject1 = localObject2;
    }
    Object localObject2 = new URL((String)localObject1);
    HttpURLConnection localHttpURLConnection = zza((URL)localObject2, paramzzk);
    Object localObject3 = localHashMap.keySet().iterator();
    while (((Iterator)localObject3).hasNext())
    {
      String str = (String)((Iterator)localObject3).next();
      localHttpURLConnection.addRequestProperty(str, (String)localHashMap.get(str));
    }
    zza(localHttpURLConnection, paramzzk);
    localObject3 = new ProtocolVersion("HTTP", 1, 1);
    int i = localHttpURLConnection.getResponseCode();
    if (i == -1)
      throw new IOException("Could not retrieve response code from HttpUrlConnection.");
    BasicStatusLine localBasicStatusLine = new BasicStatusLine((ProtocolVersion)localObject3, localHttpURLConnection.getResponseCode(), localHttpURLConnection.getResponseMessage());
    BasicHttpResponse localBasicHttpResponse = new BasicHttpResponse(localBasicStatusLine);
    localBasicHttpResponse.setEntity(zza(localHttpURLConnection));
    Iterator localIterator = localHttpURLConnection.getHeaderFields().entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (localEntry.getKey() != null)
      {
        BasicHeader localBasicHeader = new BasicHeader((String)localEntry.getKey(), (String)((List)localEntry.getValue()).get(0));
        localBasicHttpResponse.addHeader(localBasicHeader);
      }
    }
    return (HttpResponse)(HttpResponse)(HttpResponse)localBasicHttpResponse;
  }

  private static HttpEntity zza(HttpURLConnection paramHttpURLConnection)
  {
    BasicHttpEntity localBasicHttpEntity = new BasicHttpEntity();
    InputStream localInputStream;
    try
    {
      localInputStream = paramHttpURLConnection.getInputStream();
    }
    catch (IOException localIOException)
    {
      localInputStream = paramHttpURLConnection.getErrorStream();
    }
    localBasicHttpEntity.setContent(localInputStream);
    localBasicHttpEntity.setContentLength(paramHttpURLConnection.getContentLength());
    localBasicHttpEntity.setContentEncoding(paramHttpURLConnection.getContentEncoding());
    localBasicHttpEntity.setContentType(paramHttpURLConnection.getContentType());
    return localBasicHttpEntity;
  }

  protected HttpURLConnection zza(URL paramURL)
    throws IOException
  {
    return (HttpURLConnection)paramURL.openConnection();
  }

  private HttpURLConnection zza(URL paramURL, zzk<?> paramzzk)
    throws IOException
  {
    HttpURLConnection localHttpURLConnection = zza(paramURL);
    int i = paramzzk.zzt();
    localHttpURLConnection.setConnectTimeout(i);
    localHttpURLConnection.setReadTimeout(i);
    localHttpURLConnection.setUseCaches(false);
    localHttpURLConnection.setDoInput(true);
    if (("https".equals(paramURL.getProtocol())) && (this.zzaF != null))
      ((HttpsURLConnection)localHttpURLConnection).setSSLSocketFactory(this.zzaF);
    return localHttpURLConnection;
  }

  static void zza(HttpURLConnection paramHttpURLConnection, zzk<?> paramzzk)
    throws IOException, zza
  {
    switch (paramzzk.getMethod())
    {
    case -1:
      byte[] arrayOfByte = paramzzk.zzm();
      if (arrayOfByte == null)
        break;
      paramHttpURLConnection.setDoOutput(true);
      paramHttpURLConnection.setRequestMethod("POST");
      paramHttpURLConnection.addRequestProperty("Content-Type", paramzzk.zzl());
      DataOutputStream localDataOutputStream = new DataOutputStream(paramHttpURLConnection.getOutputStream());
      localDataOutputStream.write(arrayOfByte);
      localDataOutputStream.close();
      break;
    case 0:
      paramHttpURLConnection.setRequestMethod("GET");
      break;
    case 3:
      paramHttpURLConnection.setRequestMethod("DELETE");
      break;
    case 1:
      paramHttpURLConnection.setRequestMethod("POST");
      zzb(paramHttpURLConnection, paramzzk);
      break;
    case 2:
      paramHttpURLConnection.setRequestMethod("PUT");
      zzb(paramHttpURLConnection, paramzzk);
      break;
    case 4:
      paramHttpURLConnection.setRequestMethod("HEAD");
      break;
    case 5:
      paramHttpURLConnection.setRequestMethod("OPTIONS");
      break;
    case 6:
      paramHttpURLConnection.setRequestMethod("TRACE");
      break;
    case 7:
      paramHttpURLConnection.setRequestMethod("PATCH");
      zzb(paramHttpURLConnection, paramzzk);
      break;
    default:
      throw new IllegalStateException("Unknown method type.");
    }
  }

  private static void zzb(HttpURLConnection paramHttpURLConnection, zzk<?> paramzzk)
    throws IOException, zza
  {
    byte[] arrayOfByte = paramzzk.zzq();
    if (arrayOfByte != null)
    {
      paramHttpURLConnection.setDoOutput(true);
      paramHttpURLConnection.addRequestProperty("Content-Type", paramzzk.zzp());
      DataOutputStream localDataOutputStream = new DataOutputStream(paramHttpURLConnection.getOutputStream());
      localDataOutputStream.write(arrayOfByte);
      localDataOutputStream.close();
    }
  }

  public static abstract interface zza
  {
    public abstract String zzh(String paramString);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzz
 * JD-Core Version:    0.6.0
 */