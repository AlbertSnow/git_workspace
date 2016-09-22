package com.wandoujia.rpc.http.processor;

import com.wandoujia.gson.JsonSyntaxException;
import com.wandoujia.gson.b.a;
import com.wandoujia.gson.c;
import com.wandoujia.rpc.http.exception.ContentParseException;
import java.util.List;

public class JsonListProcessor<T>
  implements Processor<String, List<T>, ContentParseException>
{
  protected final c gson;
  private final a<List<T>> typeToken;

  public JsonListProcessor(c paramc, a<List<T>> parama)
  {
    this.gson = paramc;
    this.typeToken = parama;
  }

  public List<T> process(String paramString)
  {
    try
    {
      List localList = (List)this.gson.a(paramString, this.typeToken.getType());
      return localList;
    }
    catch (JsonSyntaxException localJsonSyntaxException)
    {
    }
    throw new ContentParseException(localJsonSyntaxException.getMessage(), paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.processor.JsonListProcessor
 * JD-Core Version:    0.6.0
 */