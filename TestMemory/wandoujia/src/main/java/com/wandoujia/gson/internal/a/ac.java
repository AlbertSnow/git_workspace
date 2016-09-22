package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.JsonSyntaxException;
import com.wandoujia.gson.stream.JsonToken;
import com.wandoujia.gson.stream.a;
import com.wandoujia.gson.u;
import java.math.BigDecimal;

final class ac extends u<BigDecimal>
{
  private static BigDecimal b(a parama)
  {
    if (parama.f() == JsonToken.NULL)
    {
      parama.j();
      return null;
    }
    try
    {
      BigDecimal localBigDecimal = new BigDecimal(parama.h());
      return localBigDecimal;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    throw new JsonSyntaxException(localNumberFormatException);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.ac
 * JD-Core Version:    0.6.0
 */