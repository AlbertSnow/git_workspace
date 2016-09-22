package com.wandoujia.ripple_framework.download;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.net.http.AndroidHttpClient;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.IOUtils;
import com.wandoujia.base.utils.SystemUtil;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpMessage;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;

public final class HttpUtils
{
  private static String a = "Mozilla/5.0 (Linux; Android " + Build.VERSION.RELEASE + "; " + Build.MODEL + "; Wandoujia " + SystemUtil.getFullVersion() + ") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";

  public static String a(String paramString)
  {
    AndroidHttpClient localAndroidHttpClient = AndroidHttpClient.newInstance(a, GlobalConfig.getAppContext());
    try
    {
      if (TextUtils.isEmpty(paramString))
        throw new IllegalStateException("url can't be null");
    }
    finally
    {
      localAndroidHttpClient.close();
    }
    Context localContext = GlobalConfig.getAppContext();
    Uri.Builder localBuilder = Uri.parse(paramString).buildUpon();
    localBuilder.appendQueryParameter("v", SystemUtil.getVersionName(localContext));
    localBuilder.appendQueryParameter("vc", String.valueOf(SystemUtil.getVersionCode(localContext)));
    HttpResponse localHttpResponse1 = localAndroidHttpClient.execute(new HttpGet(localBuilder.toString()));
    Object localObject2;
    int j;
    if (localHttpResponse1 != null)
    {
      int i = localHttpResponse1.getStatusLine().getStatusCode();
      localObject2 = localHttpResponse1;
      j = i;
      break label240;
      String str1 = a((HttpResponse)localObject2, paramString);
      if (!TextUtils.isEmpty(str1))
      {
        HttpResponse localHttpResponse2 = localAndroidHttpClient.execute(new HttpGet(str1));
        if (localHttpResponse2 != null)
        {
          int k = localHttpResponse2.getStatusLine().getStatusCode();
          localObject2 = localHttpResponse2;
          j = k;
          break label240;
        }
      }
    }
    while (true)
    {
      label183: String str2 = IOUtils.readString(((HttpResponse)localObject2).getEntity().getContent(), "utf-8");
      localAndroidHttpClient.close();
      return str2;
      label240: 
      do
      {
        throw new IllegalStateException("Get unexpect response code:" + j);
        localObject2 = null;
        break label183;
        if ((j == 301) || (j == 302) || (j == 303) || (j == 307))
          break;
      }
      while (j != 200);
    }
  }

  // ERROR //
  private static String a(java.lang.Throwable paramThrowable)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 161	java/io/StringWriter
    //   5: dup
    //   6: invokespecial 163	java/io/StringWriter:<init>	()V
    //   9: astore_2
    //   10: new 165	java/io/PrintWriter
    //   13: dup
    //   14: aload_2
    //   15: invokespecial 168	java/io/PrintWriter:<init>	(Ljava/io/Writer;)V
    //   18: astore_3
    //   19: aload_0
    //   20: aload_3
    //   21: invokevirtual 174	java/lang/Throwable:printStackTrace	(Ljava/io/PrintWriter;)V
    //   24: aload_2
    //   25: invokevirtual 175	java/io/StringWriter:toString	()Ljava/lang/String;
    //   28: astore 7
    //   30: aload_3
    //   31: invokevirtual 176	java/io/PrintWriter:close	()V
    //   34: aload 7
    //   36: areturn
    //   37: astore 10
    //   39: aload_1
    //   40: ifnull +7 -> 47
    //   43: aload_1
    //   44: invokevirtual 176	java/io/PrintWriter:close	()V
    //   47: ldc 178
    //   49: areturn
    //   50: astore 9
    //   52: aload_1
    //   53: ifnull -6 -> 47
    //   56: aload_1
    //   57: invokevirtual 176	java/io/PrintWriter:close	()V
    //   60: goto -13 -> 47
    //   63: astore 8
    //   65: aconst_null
    //   66: astore_3
    //   67: aload 8
    //   69: astore 6
    //   71: aload_3
    //   72: ifnull +7 -> 79
    //   75: aload_3
    //   76: invokevirtual 176	java/io/PrintWriter:close	()V
    //   79: aload 6
    //   81: athrow
    //   82: astore 6
    //   84: goto -13 -> 71
    //   87: astore 5
    //   89: aload_3
    //   90: astore_1
    //   91: goto -39 -> 52
    //   94: astore 4
    //   96: aload_3
    //   97: astore_1
    //   98: goto -59 -> 39
    //
    // Exception table:
    //   from	to	target	type
    //   2	19	37	java/lang/AssertionError
    //   2	19	50	java/lang/NullPointerException
    //   2	19	63	finally
    //   19	30	82	finally
    //   19	30	87	java/lang/NullPointerException
    //   19	30	94	java/lang/AssertionError
  }

  private static String a(HttpMessage paramHttpMessage)
  {
    StringBuilder localStringBuilder = new StringBuilder(10);
    if ((paramHttpMessage instanceof HttpResponse))
    {
      HttpResponse localHttpResponse = (HttpResponse)paramHttpMessage;
      localStringBuilder.append("status: ").append(localHttpResponse.getStatusLine().getStatusCode()).append(" message: ").append(localHttpResponse.getStatusLine().getReasonPhrase()).append('\n');
    }
    while (true)
    {
      for (Header localHeader : paramHttpMessage.getAllHeaders())
        localStringBuilder.append(localHeader.getName()).append(":").append(localHeader.getValue()).append('\n');
      if (!(paramHttpMessage instanceof HttpRequest))
        continue;
      HttpRequest localHttpRequest = (HttpRequest)paramHttpMessage;
      localStringBuilder.append(" request-url:").append(localHttpRequest.getRequestLine().getUri()).append('\n');
    }
    return localStringBuilder.toString();
  }

  private static String a(HttpResponse paramHttpResponse, String paramString)
  {
    Header localHeader = paramHttpResponse.getFirstHeader("Location");
    if (localHeader == null)
      throw new HttpUtils.RedirectUrlNotFoundException("getRedirectUrl can't found location header : " + a(paramHttpResponse));
    try
    {
      String str = new URL(new URL(paramString), localHeader.getValue(), null).toString();
      return str;
    }
    catch (MalformedURLException localMalformedURLException)
    {
    }
    throw new HttpUtils.RedirectUrlNotFoundException("getRedirectUrl catch MalformedURLException : " + a(localMalformedURLException));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.HttpUtils
 * JD-Core Version:    0.6.0
 */