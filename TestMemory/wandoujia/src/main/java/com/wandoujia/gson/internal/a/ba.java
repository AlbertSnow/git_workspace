package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.JsonSyntaxException;
import com.wandoujia.gson.stream.JsonToken;
import com.wandoujia.gson.stream.a;
import com.wandoujia.gson.u;

final class ba extends u<Number>
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
      Short localShort = Short.valueOf((short)parama.m());
      return localShort;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    throw new JsonSyntaxException(localNumberFormatException);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.ba
 * JD-Core Version:    0.6.0
 */