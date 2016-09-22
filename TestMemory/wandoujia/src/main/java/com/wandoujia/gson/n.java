package com.wandoujia.gson;

import com.wandoujia.gson.internal.b;
import com.wandoujia.gson.stream.c;
import java.io.IOException;
import java.io.StringWriter;

public abstract class n
{
  public Number a()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }

  public String b()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }

  public double c()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }

  public long d()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }

  public int e()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }

  public boolean f()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }

  public final q g()
  {
    if ((this instanceof q))
      return (q)this;
    throw new IllegalStateException("This is not a JSON Primitive.");
  }

  public String toString()
  {
    try
    {
      StringWriter localStringWriter = new StringWriter();
      c localc = new c(localStringWriter);
      localc.a(true);
      b.a(this, localc);
      String str = localStringWriter.toString();
      return str;
    }
    catch (IOException localIOException)
    {
    }
    throw new AssertionError(localIOException);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.n
 * JD-Core Version:    0.6.0
 */