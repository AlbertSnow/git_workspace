package com.wandoujia.rpc.http.request;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import com.wandoujia.base.utils.CipherUtil;
import com.wandoujia.base.utils.GZipUtil;
import com.wandoujia.base.utils.IOUtils;
import com.wandoujia.rpc.http.provider.CookieProvider;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpParams;

public abstract class AbstractHttpRequestBuilder
  implements HttpRequestBuilder
{
  private static final String ACCEPT_ENCODING = "Accept-Encoding";
  private static final String CONTENT_ENCODING = "Content-Encoding";
  private static final String COOKIE = "Cookie";
  private static final String GZIP = "gzip";
  private static final String GZIP_ENCODING = "gzip, deflate";
  private static final String TAG = AbstractHttpRequestBuilder.class.getSimpleName();
  private String additionalParams;
  private boolean attachDefaultCookie;
  private boolean compress = false;
  private Context context;
  private final CookieProvider cookieProvider;
  private boolean encrypt = false;
  private boolean isCallingHeaders = false;
  private boolean isCallingParams = false;
  private AbstractHttpRequestBuilder.Method method = AbstractHttpRequestBuilder.Method.GET;
  private boolean paramsInUrl = false;

  public AbstractHttpRequestBuilder()
  {
    this.cookieProvider = null;
  }

  public AbstractHttpRequestBuilder(CookieProvider paramCookieProvider)
  {
    this.cookieProvider = paramCookieProvider;
  }

  private static List<NameValuePair> createNamePairs(AbstractHttpRequestBuilder.Params paramParams)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = AbstractHttpRequestBuilder.Params.access$000(paramParams).entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (localEntry.getValue() == null)
        continue;
      localArrayList.add(new BasicNameValuePair((String)localEntry.getKey(), ((AbstractHttpRequestBuilder.Value)localEntry.getValue()).value));
    }
    return localArrayList;
  }

  private static String createUrl(String paramString1, String paramString2)
  {
    if (paramString2 == null)
      return paramString1;
    StringBuilder localStringBuilder = new StringBuilder(paramString1);
    if (paramString1.indexOf("?") >= 0)
      if (!paramString1.endsWith("&"))
        localStringBuilder.append("&");
    while (true)
    {
      localStringBuilder.append(paramString2);
      return localStringBuilder.toString();
      localStringBuilder.append("?");
    }
  }

  private static void generateCacheKey(StringBuilder paramStringBuilder, AbstractHttpRequestBuilder.Params paramParams)
  {
    Iterator localIterator = AbstractHttpRequestBuilder.Params.access$000(paramParams).entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (!((AbstractHttpRequestBuilder.Value)localEntry.getValue()).isCacheableParam)
        continue;
      paramStringBuilder.append((String)localEntry.getKey()).append("=").append(((AbstractHttpRequestBuilder.Value)localEntry.getValue()).value).append("&");
    }
  }

  public final HttpUriRequest build()
  {
    String str1 = getUrl();
    if (str1 == null)
      return null;
    AbstractHttpRequestBuilder.Params localParams1 = new AbstractHttpRequestBuilder.Params();
    setParams(localParams1);
    Object localObject1;
    switch (AbstractHttpRequestBuilder.1.$SwitchMap$com$wandoujia$rpc$http$request$AbstractHttpRequestBuilder$Method[this.method.ordinal()])
    {
    default:
      localObject1 = null;
    case 1:
    case 2:
    }
    while (true)
    {
      if (localObject1 != null)
      {
        AbstractHttpRequestBuilder.Params localParams2 = new AbstractHttpRequestBuilder.Params();
        setHeaders(localParams2);
        Iterator localIterator1 = AbstractHttpRequestBuilder.Params.access$000(localParams2).entrySet().iterator();
        while (true)
          if (localIterator1.hasNext())
          {
            Map.Entry localEntry1 = (Map.Entry)localIterator1.next();
            ((HttpUriRequest)localObject1).setHeader((String)localEntry1.getKey(), ((AbstractHttpRequestBuilder.Value)localEntry1.getValue()).value);
            continue;
            Uri.Builder localBuilder = Uri.parse(str1).buildUpon();
            Iterator localIterator2 = AbstractHttpRequestBuilder.Params.access$000(localParams1).entrySet().iterator();
            while (localIterator2.hasNext())
            {
              Map.Entry localEntry2 = (Map.Entry)localIterator2.next();
              if (localEntry2.getValue() == null)
              {
                new StringBuilder().append((String)localEntry2.getKey()).append(" has null value");
                continue;
              }
              localBuilder.appendQueryParameter((String)localEntry2.getKey(), ((AbstractHttpRequestBuilder.Value)localEntry2.getValue()).value);
            }
            localObject1 = new HttpGet(createUrl(localBuilder.toString(), this.additionalParams));
            if (getTimeout() <= 0)
              break;
            ((HttpGet)localObject1).getParams().setIntParameter("http.socket.timeout", getTimeout());
            ((HttpGet)localObject1).getParams().setIntParameter("http.connection.timeout", getTimeout());
            break;
            String str2 = createUrl(str1, this.additionalParams);
            if (this.paramsInUrl)
            {
              str2 = createUrl(str2, localParams1.toString());
              localParams1.clear();
            }
            localObject1 = new HttpPost(str2);
          }
      }
      try
      {
        Object localObject2 = genEntity(localParams1);
        if (this.compress)
          localObject2 = new ByteArrayEntity(GZipUtil.zipBytes(IOUtils.readBytes(((HttpEntity)localObject2).getContent())));
        if (this.encrypt)
          localObject2 = new ByteArrayEntity(CipherUtil.encrypt(IOUtils.readBytes(((HttpEntity)localObject2).getContent()), CipherUtil.getAESKey(this.context)));
        ((HttpPost)localObject1).setEntity((HttpEntity)localObject2);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        return null;
        return localObject1;
      }
      catch (GeneralSecurityException localGeneralSecurityException)
      {
      }
      catch (IOException localIOException)
      {
      }
      catch (IllegalStateException localIllegalStateException)
      {
      }
    }
  }

  public AbstractHttpRequestBuilder enableCompressRequestContent()
  {
    this.compress = true;
    if ((this.encrypt) && (this.compress))
      throw new IllegalStateException("Already encrypt, could not compress");
    return this;
  }

  public AbstractHttpRequestBuilder enableEncryptRequestContent(Context paramContext)
  {
    this.encrypt = true;
    this.context = paramContext.getApplicationContext();
    if ((this.encrypt) && (this.compress))
      throw new IllegalStateException("Already compress, could not encrypt");
    return this;
  }

  public AbstractHttpRequestBuilder enableParamsInUrl()
  {
    this.paramsInUrl = true;
    return this;
  }

  protected void finalize()
  {
    super.finalize();
    if (!this.isCallingParams)
      throw new IllegalStateException(getClass().getSimpleName() + ".setParams() must call super.setParams()");
    if (!this.isCallingHeaders)
      throw new IllegalStateException(getClass().getSimpleName() + ".setHeaders() must call super.setHeaders()");
  }

  protected HttpEntity genEntity(AbstractHttpRequestBuilder.Params paramParams)
  {
    return new UrlEncodedFormEntity(createNamePairs(paramParams), "UTF-8");
  }

  public String getCacheKey()
  {
    StringBuilder localStringBuilder = new StringBuilder(this.method.name()).append("_").append(getUrl()).append("?");
    AbstractHttpRequestBuilder.Params localParams1 = new AbstractHttpRequestBuilder.Params();
    setParams(localParams1);
    generateCacheKey(localStringBuilder, localParams1);
    AbstractHttpRequestBuilder.Params localParams2 = new AbstractHttpRequestBuilder.Params();
    setHeaders(localParams2);
    generateCacheKey(localStringBuilder, localParams2);
    return localStringBuilder.toString();
  }

  protected int getTimeout()
  {
    return -1;
  }

  protected abstract String getUrl();

  public AbstractHttpRequestBuilder setAdditionalParams(String paramString)
  {
    this.additionalParams = paramString;
    return this;
  }

  public AbstractHttpRequestBuilder setAttachDefaultCookie(boolean paramBoolean)
  {
    this.attachDefaultCookie = paramBoolean;
    return this;
  }

  protected void setCompress(boolean paramBoolean)
  {
    this.compress = paramBoolean;
  }

  protected void setHeaders(AbstractHttpRequestBuilder.Params paramParams)
  {
    paramParams.put("Accept-Encoding", "gzip, deflate", false);
    if ((this.attachDefaultCookie) && (this.cookieProvider != null))
      paramParams.put("Cookie", this.cookieProvider.getDefaultCookie());
    if (this.compress)
      paramParams.put("Content-Encoding", "gzip", false);
    this.isCallingHeaders = true;
  }

  public AbstractHttpRequestBuilder setMethod(AbstractHttpRequestBuilder.Method paramMethod)
  {
    this.method = paramMethod;
    return this;
  }

  protected void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    this.isCallingParams = true;
  }

  protected void setParamsInUrl(boolean paramBoolean)
  {
    this.paramsInUrl = paramBoolean;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder
 * JD-Core Version:    0.6.0
 */