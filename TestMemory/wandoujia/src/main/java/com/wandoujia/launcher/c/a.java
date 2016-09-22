package com.wandoujia.launcher.c;

import com.wandoujia.gson.JsonSyntaxException;
import com.wandoujia.gson.c;
import com.wandoujia.rpc.http.client.DataApi;
import com.wandoujia.rpc.http.exception.ContentParseException;
import com.wandoujia.rpc.http.exception.HttpException;
import com.wandoujia.rpc.http.processor.GZipHttpResponseProcessor;
import java.lang.reflect.Type;
import java.util.concurrent.ExecutionException;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;

public final class a
{
  private static final c a = new c();
  private final DataApi b;

  public a(DataApi paramDataApi)
  {
    this.b = paramDataApi;
  }

  private static <T> T a(String paramString, Type paramType)
  {
    try
    {
      Object localObject = a.a(paramString, paramType);
      return localObject;
    }
    catch (JsonSyntaxException localJsonSyntaxException)
    {
    }
    throw new ContentParseException(localJsonSyntaxException.getMessage(), paramString);
  }

  public final <T> T a(HttpUriRequest paramHttpUriRequest, Type paramType)
  {
    com.wandoujia.launcher_base.a.a.a locala = new com.wandoujia.launcher_base.a.a.a();
    locala.a((HttpRequestBase)paramHttpUriRequest);
    HttpResponse localHttpResponse = (HttpResponse)this.b.execute(locala);
    try
    {
      Object localObject = a(new GZipHttpResponseProcessor().process(localHttpResponse), paramType);
      return localObject;
    }
    catch (ContentParseException localContentParseException)
    {
      throw new ExecutionException(localContentParseException);
    }
    catch (HttpException localHttpException)
    {
    }
    throw new ExecutionException(localHttpException);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.c.a
 * JD-Core Version:    0.6.0
 */