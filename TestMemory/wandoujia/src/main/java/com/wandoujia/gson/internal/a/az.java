package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.JsonSyntaxException;
import com.wandoujia.gson.stream.JsonToken;
import com.wandoujia.gson.stream.a;
import com.wandoujia.gson.u;

final class az extends u<Number>
{
  private static Number b(a parama)
  {
    if (parama.f() == JsonToken.NULL)
    {
      parama.j();
      return null;
    }
    try
    {
      Byte localByte = Byte.valueOf((byte)parama.m());
      return localByte;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    throw new JsonSyntaxException(localNumberFormatException);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.az
 * JD-Core Version:    0.6.0
 */