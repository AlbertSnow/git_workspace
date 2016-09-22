package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.JsonSyntaxException;
import com.wandoujia.gson.stream.JsonToken;
import com.wandoujia.gson.stream.a;
import com.wandoujia.gson.u;
import java.util.BitSet;

final class ai extends u<BitSet>
{
  private static BitSet b(a parama)
  {
    if (parama.f() == JsonToken.NULL)
    {
      parama.j();
      return null;
    }
    BitSet localBitSet = new BitSet();
    parama.a();
    JsonToken localJsonToken = parama.f();
    int i = 0;
    if (localJsonToken != JsonToken.END_ARRAY)
    {
      boolean bool;
      switch (ax.a[localJsonToken.ordinal()])
      {
      default:
        throw new JsonSyntaxException("Invalid bitset value type: " + localJsonToken);
      case 1:
        if (parama.m() == 0)
          break;
        bool = true;
      case 2:
      case 3:
      }
      while (true)
      {
        if (bool)
          localBitSet.set(i);
        i++;
        localJsonToken = parama.f();
        break;
        bool = false;
        continue;
        bool = parama.i();
        continue;
        String str = parama.h();
        try
        {
          int j = Integer.parseInt(str);
          if (j != 0)
          {
            bool = true;
            continue;
          }
          bool = false;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          throw new JsonSyntaxException("Error: Expecting: bitset number value (1, 0), Found: " + str);
        }
      }
    }
    parama.b();
    return localBitSet;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.ai
 * JD-Core Version:    0.6.0
 */