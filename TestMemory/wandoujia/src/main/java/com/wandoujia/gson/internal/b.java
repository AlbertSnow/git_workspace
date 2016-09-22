package com.wandoujia.gson.internal;

import com.wandoujia.gson.JsonIOException;
import com.wandoujia.gson.JsonSyntaxException;
import com.wandoujia.gson.internal.a.w;
import com.wandoujia.gson.k;
import com.wandoujia.gson.n;
import com.wandoujia.gson.o;
import com.wandoujia.gson.stream.MalformedJsonException;
import com.wandoujia.gson.stream.a;
import com.wandoujia.gson.stream.c;
import com.wandoujia.gson.u;
import java.io.EOFException;
import java.io.IOException;

public final class b
  implements x<T>
{
  b(k paramk)
  {
  }

  public static n a(a parama)
  {
    int i = 1;
    try
    {
      parama.f();
      i = 0;
      n localn = (n)w.w.a(parama);
      return localn;
    }
    catch (EOFException localEOFException)
    {
      if (i != 0)
        return o.a;
      throw new JsonSyntaxException(localEOFException);
    }
    catch (MalformedJsonException localMalformedJsonException)
    {
      throw new JsonSyntaxException(localMalformedJsonException);
    }
    catch (IOException localIOException)
    {
      throw new JsonIOException(localIOException);
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    throw new JsonSyntaxException(localNumberFormatException);
  }

  public static void a(n paramn, c paramc)
  {
    w.w.a(paramc, paramn);
  }

  public final T a()
  {
    return this.a.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.b
 * JD-Core Version:    0.6.0
 */