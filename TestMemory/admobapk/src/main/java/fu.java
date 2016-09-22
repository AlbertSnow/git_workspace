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

public final class fu
  implements ft
{
  private final fv a;
  private final SSLSocketFactory b;

  public fu()
  {
    this(null);
  }

  private fu(fv paramfv)
  {
    this(null, null);
  }

  private fu(fv paramfv, SSLSocketFactory paramSSLSocketFactory)
  {
    this.a = paramfv;
    this.b = null;
  }

  private static HttpEntity a(HttpURLConnection paramHttpURLConnection)
  {
    BasicHttpEntity localBasicHttpEntity = new BasicHttpEntity();
    try
    {
      InputStream localInputStream2 = paramHttpURLConnection.getInputStream();
      localInputStream1 = localInputStream2;
      localBasicHttpEntity.setContent(localInputStream1);
      localBasicHttpEntity.setContentLength(paramHttpURLConnection.getContentLength());
      localBasicHttpEntity.setContentEncoding(paramHttpURLConnection.getContentEncoding());
      localBasicHttpEntity.setContentType(paramHttpURLConnection.getContentType());
      return localBasicHttpEntity;
    }
    catch (IOException localIOException)
    {
      while (true)
        InputStream localInputStream1 = paramHttpURLConnection.getErrorStream();
    }
  }

  private static void a(HttpURLConnection paramHttpURLConnection, ev paramev)
  {
    byte[] arrayOfByte = paramev.d();
    if (arrayOfByte != null)
    {
      paramHttpURLConnection.setDoOutput(true);
      paramHttpURLConnection.addRequestProperty("Content-Type", paramev.c());
      DataOutputStream localDataOutputStream = new DataOutputStream(paramHttpURLConnection.getOutputStream());
      localDataOutputStream.write(arrayOfByte);
      localDataOutputStream.close();
    }
  }

  public final HttpResponse a(ev paramev, Map paramMap)
  {
    String str1 = paramev.c;
    HashMap localHashMap = new HashMap();
    localHashMap.putAll(paramev.a());
    localHashMap.putAll(paramMap);
    String str2;
    if (this.a != null)
    {
      str2 = this.a.a();
      if (str2 == null)
      {
        String str4 = String.valueOf(str1);
        if (str4.length() != 0);
        for (String str5 = "URL blocked by rewriter: ".concat(str4); ; str5 = new String("URL blocked by rewriter: "))
          throw new IOException(str5);
      }
    }
    else
    {
      str2 = str1;
    }
    URL localURL = new URL(str2);
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)localURL.openConnection();
    int i = paramev.e();
    localHttpURLConnection.setConnectTimeout(i);
    localHttpURLConnection.setReadTimeout(i);
    localHttpURLConnection.setUseCaches(false);
    localHttpURLConnection.setDoInput(true);
    if (("https".equals(localURL.getProtocol())) && (this.b != null))
      ((HttpsURLConnection)localHttpURLConnection).setSSLSocketFactory(this.b);
    Iterator localIterator1 = localHashMap.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str3 = (String)localIterator1.next();
      localHttpURLConnection.addRequestProperty(str3, (String)localHashMap.get(str3));
    }
    switch (paramev.b)
    {
    default:
      throw new IllegalStateException("Unknown method type.");
    case -1:
      byte[] arrayOfByte = paramev.b();
      if (arrayOfByte == null)
        break;
      localHttpURLConnection.setDoOutput(true);
      localHttpURLConnection.setRequestMethod("POST");
      localHttpURLConnection.addRequestProperty("Content-Type", paramev.c());
      DataOutputStream localDataOutputStream = new DataOutputStream(localHttpURLConnection.getOutputStream());
      localDataOutputStream.write(arrayOfByte);
      localDataOutputStream.close();
    case 0:
    case 3:
    case 1:
    case 2:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    ProtocolVersion localProtocolVersion;
    while (true)
    {
      localProtocolVersion = new ProtocolVersion("HTTP", 1, 1);
      if (localHttpURLConnection.getResponseCode() != -1)
        break;
      throw new IOException("Could not retrieve response code from HttpUrlConnection.");
      localHttpURLConnection.setRequestMethod("GET");
      continue;
      localHttpURLConnection.setRequestMethod("DELETE");
      continue;
      localHttpURLConnection.setRequestMethod("POST");
      a(localHttpURLConnection, paramev);
      continue;
      localHttpURLConnection.setRequestMethod("PUT");
      a(localHttpURLConnection, paramev);
      continue;
      localHttpURLConnection.setRequestMethod("HEAD");
      continue;
      localHttpURLConnection.setRequestMethod("OPTIONS");
      continue;
      localHttpURLConnection.setRequestMethod("TRACE");
      continue;
      localHttpURLConnection.setRequestMethod("PATCH");
      a(localHttpURLConnection, paramev);
    }
    BasicHttpResponse localBasicHttpResponse = new BasicHttpResponse(new BasicStatusLine(localProtocolVersion, localHttpURLConnection.getResponseCode(), localHttpURLConnection.getResponseMessage()));
    localBasicHttpResponse.setEntity(a(localHttpURLConnection));
    Iterator localIterator2 = localHttpURLConnection.getHeaderFields().entrySet().iterator();
    while (localIterator2.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator2.next();
      if (localEntry.getKey() == null)
        continue;
      localBasicHttpResponse.addHeader(new BasicHeader((String)localEntry.getKey(), (String)((List)localEntry.getValue()).get(0)));
    }
    return localBasicHttpResponse;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     fu
 * JD-Core Version:    0.6.0
 */