package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.JsonIOException;
import com.wandoujia.gson.stream.JsonToken;
import com.wandoujia.gson.stream.a;
import com.wandoujia.gson.u;
import java.net.URI;
import java.net.URISyntaxException;

final class ah extends u<URI>
{
  private static URI b(a parama)
  {
    if (parama.f() == JsonToken.NULL)
      parama.j();
    while (true)
    {
      return null;
      try
      {
        String str = parama.h();
        if ("null".equals(str))
          continue;
        URI localURI = new URI(str);
        return localURI;
      }
      catch (URISyntaxException localURISyntaxException)
      {
      }
    }
    throw new JsonIOException(localURISyntaxException);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.ah
 * JD-Core Version:    0.6.0
 */