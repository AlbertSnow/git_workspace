import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public final class fq
  implements ft
{
  private HttpClient a;

  public fq(HttpClient paramHttpClient)
  {
    this.a = paramHttpClient;
  }

  private static void a(HttpEntityEnclosingRequestBase paramHttpEntityEnclosingRequestBase, ev paramev)
  {
    byte[] arrayOfByte = paramev.d();
    if (arrayOfByte != null)
      paramHttpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(arrayOfByte));
  }

  private static void a(HttpUriRequest paramHttpUriRequest, Map paramMap)
  {
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramHttpUriRequest.setHeader(str, (String)paramMap.get(str));
    }
  }

  public final HttpResponse a(ev paramev, Map paramMap)
  {
    Object localObject;
    switch (paramev.b)
    {
    default:
      throw new IllegalStateException("Unknown request method.");
    case -1:
      byte[] arrayOfByte = paramev.b();
      if (arrayOfByte == null)
        break;
      localObject = new HttpPost(paramev.c);
      ((HttpPost)localObject).addHeader("Content-Type", paramev.c());
      ((HttpPost)localObject).setEntity(new ByteArrayEntity(arrayOfByte));
    case 0:
    case 3:
    case 1:
    case 2:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      a((HttpUriRequest)localObject, paramMap);
      a((HttpUriRequest)localObject, paramev.a());
      HttpParams localHttpParams = ((HttpUriRequest)localObject).getParams();
      int i = paramev.e();
      HttpConnectionParams.setConnectionTimeout(localHttpParams, 5000);
      HttpConnectionParams.setSoTimeout(localHttpParams, i);
      return this.a.execute((HttpUriRequest)localObject);
      localObject = new HttpGet(paramev.c);
      continue;
      localObject = new HttpGet(paramev.c);
      continue;
      localObject = new HttpDelete(paramev.c);
      continue;
      localObject = new HttpPost(paramev.c);
      ((HttpPost)localObject).addHeader("Content-Type", paramev.c());
      a((HttpEntityEnclosingRequestBase)localObject, paramev);
      continue;
      localObject = new HttpPut(paramev.c);
      ((HttpPut)localObject).addHeader("Content-Type", paramev.c());
      a((HttpEntityEnclosingRequestBase)localObject, paramev);
      continue;
      localObject = new HttpHead(paramev.c);
      continue;
      localObject = new HttpOptions(paramev.c);
      continue;
      localObject = new HttpTrace(paramev.c);
      continue;
      localObject = new fr(paramev.c);
      ((fr)localObject).addHeader("Content-Type", paramev.c());
      a((HttpEntityEnclosingRequestBase)localObject, paramev);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     fq
 * JD-Core Version:    0.6.0
 */