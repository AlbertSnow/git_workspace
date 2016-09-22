package com.wandoujia.ripple_framework.html;

import java.util.List;
import org.a.a.a.g;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

public final class a
{
  private final byte[] a;
  private int b;
  private int c;

  public a(byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
  }

  public static List<Object> a(String paramString, e parame)
  {
    String str = paramString.replaceAll("<blockquote>", "<blockquote><pq>").replaceAll("</blockquote>", "</pq></blockquote>");
    g localg = new g();
    try
    {
      localg.setProperty("http://www.ccil.org/~cowan/tagsoup/properties/schema", c.a());
      return new f(str, parame, localg).a();
    }
    catch (SAXNotRecognizedException localSAXNotRecognizedException)
    {
      throw new RuntimeException(localSAXNotRecognizedException);
    }
    catch (SAXNotSupportedException localSAXNotSupportedException)
    {
    }
    throw new RuntimeException(localSAXNotSupportedException);
  }

  public final int a()
  {
    return this.c;
  }

  public final int a(int paramInt)
  {
    if ((paramInt <= 0) || (paramInt > 32) || (paramInt > c()))
      throw new IllegalArgumentException(String.valueOf(paramInt));
    int n;
    int i1;
    int j;
    int i;
    if (this.c > 0)
    {
      n = 8 - this.c;
      if (paramInt < n)
      {
        i1 = paramInt;
        int i2 = n - i1;
        int i3 = (255 >> 8 - i1 << i2 & this.a[this.b]) >> i2;
        int i4 = paramInt - i1;
        this.c = (i1 + this.c);
        if (this.c == 8)
        {
          this.c = 0;
          this.b = (1 + this.b);
        }
        j = i3;
        i = i4;
      }
    }
    while (true)
    {
      if (i > 0)
      {
        while (true)
          if (i >= 8)
          {
            j = j << 8 | 0xFF & this.a[this.b];
            this.b = (1 + this.b);
            i -= 8;
            continue;
            i1 = n;
            break;
          }
        if (i > 0)
        {
          int k = 8 - i;
          int m = 255 >> k << k;
          j = j << i | (m & this.a[this.b]) >> k;
          this.c = (i + this.c);
        }
      }
      return j;
      i = paramInt;
      j = 0;
    }
  }

  public final int b()
  {
    return this.b;
  }

  public final int c()
  {
    return 8 * (this.a.length - this.b) - this.c;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.html.a
 * JD-Core Version:    0.6.0
 */