package com.wandoujia.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

public class c
  implements Closeable, Flushable
{
  private static final String[] a = new String[''];
  private static final String[] b;
  private final Writer c;
  private int[] d = new int[32];
  private int e = 0;
  private String f;
  private boolean g;
  private boolean h;
  private String i;
  private boolean j;

  static
  {
    for (int k = 0; k <= 31; k++)
    {
      String[] arrayOfString2 = a;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(k);
      arrayOfString2[k] = String.format("\\u%04x", arrayOfObject);
    }
    a[34] = "\\\"";
    a[92] = "\\\\";
    a[9] = "\\t";
    a[8] = "\\b";
    a[10] = "\\n";
    a[13] = "\\r";
    a[12] = "\\f";
    String[] arrayOfString1 = (String[])a.clone();
    b = arrayOfString1;
    arrayOfString1[60] = "\\u003c";
    b[62] = "\\u003e";
    b[38] = "\\u0026";
    b[61] = "\\u003d";
    b[39] = "\\u0027";
  }

  public c(Writer paramWriter)
  {
    a(6);
    this.f = ":";
    this.j = true;
    if (paramWriter == null)
      throw new NullPointerException("out == null");
    this.c = paramWriter;
  }

  private c a(int paramInt1, int paramInt2, String paramString)
  {
    int k = i();
    if ((k != paramInt2) && (k != paramInt1))
      throw new IllegalStateException("Nesting problem.");
    if (this.i != null)
      throw new IllegalStateException("Dangling name: " + this.i);
    this.e = (-1 + this.e);
    if (k == paramInt2);
    this.c.write(paramString);
    return this;
  }

  private c a(int paramInt, String paramString)
  {
    e(true);
    a(paramInt);
    this.c.write(paramString);
    return this;
  }

  private void a(int paramInt)
  {
    if (this.e == this.d.length)
    {
      int[] arrayOfInt2 = new int[2 * this.e];
      System.arraycopy(this.d, 0, arrayOfInt2, 0, this.e);
      this.d = arrayOfInt2;
    }
    int[] arrayOfInt1 = this.d;
    int k = this.e;
    this.e = (k + 1);
    arrayOfInt1[k] = paramInt;
  }

  private void b(int paramInt)
  {
    this.d[(-1 + this.e)] = paramInt;
  }

  private void c(String paramString)
  {
    int k = 0;
    String[] arrayOfString;
    if (this.h)
      arrayOfString = b;
    int m;
    int n;
    int i1;
    while (true)
    {
      this.c.write("\"");
      m = paramString.length();
      n = 0;
      while (true)
      {
        if (n >= m)
          break label141;
        i1 = paramString.charAt(n);
        if (i1 < 128)
        {
          str = arrayOfString[i1];
          if (str != null)
            break label90;
          n++;
          continue;
          arrayOfString = a;
          break;
        }
      }
      if (i1 != 8232)
        break label126;
    }
    for (String str = "\\u2028"; ; str = "\\u2029")
    {
      label90: if (k < n)
        this.c.write(paramString, k, n - k);
      this.c.write(str);
      k = n + 1;
      break;
      label126: if (i1 != 8233)
        break;
    }
    label141: if (k < m)
      this.c.write(paramString, k, m - k);
    this.c.write("\"");
  }

  private void e(boolean paramBoolean)
  {
    switch (i())
    {
    case 3:
    case 5:
    default:
      throw new IllegalStateException("Nesting problem.");
    case 7:
      if (this.g)
        break;
      throw new IllegalStateException("JSON must have only one top-level value.");
    case 6:
      if ((!this.g) && (!paramBoolean))
        throw new IllegalStateException("JSON must start with an array or an object.");
      b(7);
      return;
    case 1:
      b(2);
      return;
    case 2:
      this.c.append(',');
      return;
    case 4:
    }
    this.c.append(this.f);
    b(5);
  }

  private int i()
  {
    if (this.e == 0)
      throw new IllegalStateException("JsonWriter is closed.");
    return this.d[(-1 + this.e)];
  }

  private void j()
  {
    int k;
    if (this.i != null)
    {
      k = i();
      if (k != 5)
        break label45;
      this.c.write(44);
    }
    label45: 
    do
    {
      b(4);
      c(this.i);
      this.i = null;
      return;
    }
    while (k == 3);
    throw new IllegalStateException("Nesting problem.");
  }

  public c a(long paramLong)
  {
    j();
    e(false);
    this.c.write(Long.toString(paramLong));
    return this;
  }

  public c a(Number paramNumber)
  {
    if (paramNumber == null)
      return h();
    j();
    String str = paramNumber.toString();
    if ((!this.g) && ((str.equals("-Infinity")) || (str.equals("Infinity")) || (str.equals("NaN"))))
      throw new IllegalArgumentException("Numeric values must be finite, but was " + paramNumber);
    e(false);
    this.c.append(str);
    return this;
  }

  public c a(String paramString)
  {
    if (paramString == null)
      throw new NullPointerException("name == null");
    if (this.i != null)
      throw new IllegalStateException();
    if (this.e == 0)
      throw new IllegalStateException("JsonWriter is closed.");
    this.i = paramString;
    return this;
  }

  public final void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }

  public final boolean a()
  {
    return this.g;
  }

  public c b(String paramString)
  {
    if (paramString == null)
      return h();
    j();
    e(false);
    c(paramString);
    return this;
  }

  public final void b(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }

  public final boolean b()
  {
    return this.h;
  }

  public final void c(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }

  public final boolean c()
  {
    return this.j;
  }

  public void close()
  {
    this.c.close();
    int k = this.e;
    if ((k > 1) || ((k == 1) && (this.d[(k - 1)] != 7)))
      throw new IOException("Incomplete document");
    this.e = 0;
  }

  public c d()
  {
    j();
    return a(1, "[");
  }

  public c d(boolean paramBoolean)
  {
    j();
    e(false);
    Writer localWriter = this.c;
    if (paramBoolean);
    for (String str = "true"; ; str = "false")
    {
      localWriter.write(str);
      return this;
    }
  }

  public c e()
  {
    return a(1, 2, "]");
  }

  public c f()
  {
    j();
    return a(3, "{");
  }

  public void flush()
  {
    if (this.e == 0)
      throw new IllegalStateException("JsonWriter is closed.");
    this.c.flush();
  }

  public c g()
  {
    return a(3, 5, "}");
  }

  public c h()
  {
    if (this.i != null)
    {
      if (this.j)
        j();
    }
    else
    {
      e(false);
      this.c.write("null");
      return this;
    }
    this.i = null;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.stream.c
 * JD-Core Version:    0.6.0
 */