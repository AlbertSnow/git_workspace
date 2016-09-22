package com.alipay.ut.b;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.xmlpull.v1.XmlSerializer;

final class a
  implements XmlSerializer
{
  private static final String[] a = { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null };
  private final char[] b = new char[8192];
  private int c;
  private Writer d;
  private OutputStream e;
  private CharsetEncoder f;
  private ByteBuffer g = ByteBuffer.allocate(8192);
  private boolean h;

  private void a()
  {
    int i = this.g.position();
    if (i > 0)
    {
      this.g.flip();
      this.e.write(this.g.array(), 0, i);
      this.g.clear();
    }
  }

  private void a(char paramChar)
  {
    int i = this.c;
    if (i >= 8191)
    {
      flush();
      i = this.c;
    }
    this.b[i] = paramChar;
    this.c = (i + 1);
  }

  private void a(String paramString)
  {
    a(paramString, 0, paramString.length());
  }

  private void a(String paramString, int paramInt1, int paramInt2)
  {
    if (paramInt2 > 8192)
    {
      int j = paramInt1 + paramInt2;
      if (paramInt1 < j)
      {
        int k = paramInt1 + 8192;
        if (k < j);
        for (int m = 8192; ; m = j - paramInt1)
        {
          a(paramString, paramInt1, m);
          paramInt1 = k;
          break;
        }
      }
    }
    else
    {
      int i = this.c;
      if (i + paramInt2 > 8192)
      {
        flush();
        i = this.c;
      }
      paramString.getChars(paramInt1, paramInt1 + paramInt2, this.b, i);
      this.c = (i + paramInt2);
    }
  }

  private void a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (paramInt2 > 8192)
    {
      int j = paramInt1 + paramInt2;
      if (paramInt1 < j)
      {
        int k = paramInt1 + 8192;
        if (k < j);
        for (int m = 8192; ; m = j - paramInt1)
        {
          a(paramArrayOfChar, paramInt1, m);
          paramInt1 = k;
          break;
        }
      }
    }
    else
    {
      int i = this.c;
      if (i + paramInt2 > 8192)
      {
        flush();
        i = this.c;
      }
      System.arraycopy(paramArrayOfChar, paramInt1, this.b, i, paramInt2);
      this.c = (i + paramInt2);
    }
  }

  private void b(String paramString)
  {
    int i = 0;
    int j = paramString.length();
    String[] arrayOfString = a;
    for (int k = 0; k < j; k++)
    {
      int m = paramString.charAt(k);
      if (m >= 64)
        continue;
      String str = arrayOfString[m];
      if (str == null)
        continue;
      if (i < k)
        a(paramString, i, k - i);
      i = k + 1;
      a(str);
    }
    if (i < k)
      a(paramString, i, k - i);
  }

  public final XmlSerializer attribute(String paramString1, String paramString2, String paramString3)
  {
    a(' ');
    if (paramString1 != null)
    {
      a(paramString1);
      a(':');
    }
    a(paramString2);
    a("=\"");
    b(paramString3);
    a('"');
    return this;
  }

  public final void cdsect(String paramString)
  {
    throw new UnsupportedOperationException();
  }

  public final void comment(String paramString)
  {
    throw new UnsupportedOperationException();
  }

  public final void docdecl(String paramString)
  {
    throw new UnsupportedOperationException();
  }

  public final void endDocument()
  {
    flush();
  }

  public final XmlSerializer endTag(String paramString1, String paramString2)
  {
    if (this.h)
      a(" />\n");
    while (true)
    {
      this.h = false;
      return this;
      a("</");
      if (paramString1 != null)
      {
        a(paramString1);
        a(':');
      }
      a(paramString2);
      a(">\n");
    }
  }

  public final void entityRef(String paramString)
  {
    throw new UnsupportedOperationException();
  }

  public final void flush()
  {
    if (this.c > 0)
    {
      if (this.e == null)
        break label105;
      CharBuffer localCharBuffer = CharBuffer.wrap(this.b, 0, this.c);
      for (CoderResult localCoderResult = this.f.encode(localCharBuffer, this.g, true); ; localCoderResult = this.f.encode(localCharBuffer, this.g, true))
      {
        if (localCoderResult.isError())
          throw new IOException(localCoderResult.toString());
        if (!localCoderResult.isOverflow())
          break;
        a();
      }
      a();
      this.e.flush();
    }
    while (true)
    {
      this.c = 0;
      return;
      label105: this.d.write(this.b, 0, this.c);
      this.d.flush();
    }
  }

  public final int getDepth()
  {
    throw new UnsupportedOperationException();
  }

  public final boolean getFeature(String paramString)
  {
    throw new UnsupportedOperationException();
  }

  public final String getName()
  {
    throw new UnsupportedOperationException();
  }

  public final String getNamespace()
  {
    throw new UnsupportedOperationException();
  }

  public final String getPrefix(String paramString, boolean paramBoolean)
  {
    throw new UnsupportedOperationException();
  }

  public final Object getProperty(String paramString)
  {
    throw new UnsupportedOperationException();
  }

  public final void ignorableWhitespace(String paramString)
  {
    throw new UnsupportedOperationException();
  }

  public final void processingInstruction(String paramString)
  {
    throw new UnsupportedOperationException();
  }

  public final void setFeature(String paramString, boolean paramBoolean)
  {
    if (paramString.equals("http://xmlpull.org/v1/doc/features.html#indent-output"))
      return;
    throw new UnsupportedOperationException();
  }

  public final void setOutput(OutputStream paramOutputStream, String paramString)
  {
    if (paramOutputStream == null)
      throw new IllegalArgumentException();
    try
    {
      this.f = Charset.forName(paramString).newEncoder();
      this.e = paramOutputStream;
      return;
    }
    catch (IllegalCharsetNameException localIllegalCharsetNameException)
    {
      throw ((UnsupportedEncodingException)new UnsupportedEncodingException(paramString).initCause(localIllegalCharsetNameException));
    }
    catch (UnsupportedCharsetException localUnsupportedCharsetException)
    {
    }
    throw ((UnsupportedEncodingException)new UnsupportedEncodingException(paramString).initCause(localUnsupportedCharsetException));
  }

  public final void setOutput(Writer paramWriter)
  {
    this.d = paramWriter;
  }

  public final void setPrefix(String paramString1, String paramString2)
  {
    throw new UnsupportedOperationException();
  }

  public final void setProperty(String paramString, Object paramObject)
  {
    throw new UnsupportedOperationException();
  }

  public final void startDocument(String paramString, Boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder("<?xml version='1.0' encoding='utf-8' standalone='");
    if (paramBoolean.booleanValue());
    for (String str = "yes"; ; str = "no")
    {
      a(str + "' ?>\n");
      return;
    }
  }

  public final XmlSerializer startTag(String paramString1, String paramString2)
  {
    if (this.h)
      a(">\n");
    a('<');
    if (paramString1 != null)
    {
      a(paramString1);
      a(':');
    }
    a(paramString2);
    this.h = true;
    return this;
  }

  public final XmlSerializer text(String paramString)
  {
    if (this.h)
    {
      a(">");
      this.h = false;
    }
    b(paramString);
    return this;
  }

  public final XmlSerializer text(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this.h)
    {
      a(">");
      this.h = false;
    }
    String[] arrayOfString = a;
    int i = paramInt1 + paramInt2;
    int j = paramInt1;
    while (paramInt1 < i)
    {
      int k = paramArrayOfChar[paramInt1];
      if (k < 64)
      {
        String str = arrayOfString[k];
        if (str != null)
        {
          if (j < paramInt1)
            a(paramArrayOfChar, j, paramInt1 - j);
          j = paramInt1 + 1;
          a(str);
        }
      }
      paramInt1++;
    }
    if (j < paramInt1)
      a(paramArrayOfChar, j, paramInt1 - j);
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.ut.b.a
 * JD-Core Version:    0.6.0
 */