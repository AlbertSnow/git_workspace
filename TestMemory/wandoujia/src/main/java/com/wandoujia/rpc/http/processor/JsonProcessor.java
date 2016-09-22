package com.wandoujia.rpc.http.processor;

import com.wandoujia.gson.JsonSyntaxException;
import com.wandoujia.gson.c;
import com.wandoujia.rpc.http.exception.ContentParseException;

public class JsonProcessor<T>
  implements Processor<String, T, ContentParseException>
{
  protected final c gson;

  public JsonProcessor(c paramc)
  {
    this.gson = paramc;
  }

  public T process(String paramString)
  {
    Class localClass = (Class)((java.lang.reflect.ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    try
    {
      Object localObject = this.gson.a(paramString, localClass);
      return localObject;
    }
    catch (JsonSyntaxException localJsonSyntaxException)
    {
    }
    throw new ContentParseException(localJsonSyntaxException.getMessage(), paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.processor.JsonProcessor
 * JD-Core Version:    0.6.0
 */