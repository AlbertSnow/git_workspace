package com.wandoujia.rpc.http.processor;

import com.wandoujia.gson.JsonSyntaxException;
import com.wandoujia.gson.b.a;
import com.wandoujia.gson.c;
import com.wandoujia.rpc.http.exception.ContentParseException;
import java.util.Map;

public class JsonMapProcessor<T, U>
  implements Processor<String, Map<T, U>, ContentParseException>
{
  private c gson;
  private final a<Map<T, U>> typeToken;

  public JsonMapProcessor(c paramc, a<Map<T, U>> parama)
  {
    this.gson = paramc;
    this.typeToken = parama;
  }

  public Map<T, U> process(String paramString)
  {
    try
    {
      Map localMap = (Map)this.gson.a(paramString, this.typeToken.getType());
      return localMap;
    }
    catch (JsonSyntaxException localJsonSyntaxException)
    {
    }
    throw new ContentParseException(localJsonSyntaxException.getMessage(), paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.processor.JsonMapProcessor
 * JD-Core Version:    0.6.0
 */