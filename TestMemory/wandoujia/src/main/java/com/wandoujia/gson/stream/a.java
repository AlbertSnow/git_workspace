package com.wandoujia.gson.stream;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

public class a
  implements Closeable
{
  private static final char[] a = ")]}'\n".toCharArray();
  private final Reader b;
  private boolean c = false;
  private final char[] d = new char[1024];
  private int e = 0;
  private int f = 0;
  private int g = 0;
  private int h = 0;
  private int i = 0;
  private long j;
  private int k;
  private String l;
  private int[] m = new int[32];
  private int n = 0;

  static
  {
    com.wandoujia.gson.internal.p.a = new b();
  }

  public a(Reader paramReader)
  {
    int[] arrayOfInt = this.m;
    int i1 = this.n;
    this.n = (i1 + 1);
    arrayOfInt[i1] = 6;
    if (paramReader == null)
      throw new NullPointerException("in == null");
    this.b = paramReader;
  }

  private IOException a(String paramString)
  {
    throw new MalformedJsonException(paramString + " at line " + (1 + this.g) + " column " + t());
  }

  private void a(int paramInt)
  {
    if (this.n == this.m.length)
    {
      int[] arrayOfInt2 = new int[2 * this.n];
      System.arraycopy(this.m, 0, arrayOfInt2, 0, this.n);
      this.m = arrayOfInt2;
    }
    int[] arrayOfInt1 = this.m;
    int i1 = this.n;
    this.n = (i1 + 1);
    arrayOfInt1[i1] = paramInt;
  }

  private boolean a(char paramChar)
  {
    switch (paramChar)
    {
    default:
      return true;
    case '#':
    case '/':
    case ';':
    case '=':
    case '\\':
      u();
    case '\t':
    case '\n':
    case '\f':
    case '\r':
    case ' ':
    case ',':
    case ':':
    case '[':
    case ']':
    case '{':
    case '}':
    }
    return false;
  }

  private int b(boolean paramBoolean)
  {
    char[] arrayOfChar = this.d;
    int i1 = this.e;
    int i2 = this.f;
    while (true)
    {
      int i3;
      if (i1 == i2)
      {
        this.e = i1;
        if (b(1))
        {
          i1 = this.e;
          i2 = this.f;
        }
      }
      else
      {
        i3 = i1 + 1;
        int i4 = arrayOfChar[i1];
        if (i4 == 10)
        {
          this.g = (1 + this.g);
          this.h = i3;
          i1 = i3;
          continue;
        }
        if ((i4 == 32) || (i4 == 13) || (i4 == 9))
          break label482;
        if (i4 == 47)
        {
          this.e = i3;
          if (i3 == i2)
          {
            this.e = (-1 + this.e);
            boolean bool = b(2);
            this.e = (1 + this.e);
            if (!bool)
              return i4;
          }
          u();
          switch (arrayOfChar[this.e])
          {
          default:
            return i4;
          case '*':
            this.e = (1 + this.e);
            while ((this.e + "*/".length() <= this.f) || (b("*/".length())))
            {
              if (this.d[this.e] == '\n')
              {
                this.g = (1 + this.g);
                this.h = (1 + this.e);
                this.e = (1 + this.e);
                continue;
              }
              for (int i5 = 0; ; i5++)
              {
                if (i5 >= "*/".length())
                  break label326;
                if (this.d[(i5 + this.e)] != "*/".charAt(i5))
                  break;
              }
            }
            for (int i6 = 1; i6 == 0; i6 = 0)
              throw a("Unterminated comment");
            i1 = 2 + this.e;
            i2 = this.f;
            break;
          case '/':
            label326: this.e = (1 + this.e);
            v();
            i1 = this.e;
            i2 = this.f;
            break;
          }
        }
        if (i4 == 35)
        {
          this.e = i3;
          u();
          v();
          i1 = this.e;
          i2 = this.f;
          continue;
        }
        this.e = i3;
        return i4;
      }
      if (paramBoolean)
        throw new EOFException("End of input at line " + (1 + this.g) + " column " + t());
      return -1;
      label482: i1 = i3;
    }
  }

  private String b(char paramChar)
  {
    char[] arrayOfChar = this.d;
    StringBuilder localStringBuilder = new StringBuilder();
    label150: 
    do
    {
      int i1 = this.e;
      int i2 = this.f;
      int i4;
      for (int i3 = i1; ; i3 = i4)
      {
        if (i3 >= i2)
          break label150;
        i4 = i3 + 1;
        char c1 = arrayOfChar[i3];
        if (c1 == paramChar)
        {
          this.e = i4;
          localStringBuilder.append(arrayOfChar, i1, -1 + (i4 - i1));
          return localStringBuilder.toString();
        }
        if (c1 == '\\')
        {
          this.e = i4;
          localStringBuilder.append(arrayOfChar, i1, -1 + (i4 - i1));
          localStringBuilder.append(w());
          break;
        }
        if (c1 != '\n')
          continue;
        this.g = (1 + this.g);
        this.h = i4;
      }
      localStringBuilder.append(arrayOfChar, i1, i3 - i1);
      this.e = i3;
    }
    while (b(1));
    throw a("Unterminated string");
  }

  private boolean b(int paramInt)
  {
    char[] arrayOfChar = this.d;
    this.h -= this.e;
    if (this.f != this.e)
    {
      this.f -= this.e;
      System.arraycopy(arrayOfChar, this.e, arrayOfChar, 0, this.f);
    }
    while (true)
    {
      this.e = 0;
      int i2;
      while (true)
      {
        int i1 = this.b.read(arrayOfChar, this.f, 1024 - this.f);
        i2 = 0;
        if (i1 == -1)
          break;
        this.f = (i1 + this.f);
        if ((this.g == 0) && (this.h == 0) && (this.f > 0) && (arrayOfChar[0] == 65279))
        {
          this.e = (1 + this.e);
          this.h = (1 + this.h);
          paramInt++;
        }
        if (this.f < paramInt)
          continue;
        i2 = 1;
      }
      return i2;
      this.f = 0;
    }
  }

  private void c(char paramChar)
  {
    char[] arrayOfChar = this.d;
    label95: 
    do
    {
      int i1 = this.e;
      int i2 = this.f;
      while (true)
      {
        if (i1 >= i2)
          break label95;
        int i3 = i1 + 1;
        char c1 = arrayOfChar[i1];
        if (c1 == paramChar)
        {
          this.e = i3;
          return;
        }
        if (c1 == '\\')
        {
          this.e = i3;
          w();
          break;
        }
        if (c1 == '\n')
        {
          this.g = (1 + this.g);
          this.h = i3;
        }
        i1 = i3;
      }
      this.e = i1;
    }
    while (b(1));
    throw a("Unterminated string");
  }

  private int o()
  {
    int i1 = this.m[(-1 + this.n)];
    int i3;
    if (i1 == 1)
    {
      this.m[(-1 + this.n)] = 2;
      switch (b(true))
      {
      default:
        this.e = (-1 + this.e);
        if (this.n == 1)
          u();
        i3 = q();
        if (i3 == 0)
          break;
      case 93:
      case 44:
      case 59:
      case 39:
      case 34:
      case 91:
      case 123:
      }
    }
    do
    {
      return i3;
      if (i1 == 2)
      {
        switch (b(true))
        {
        case 44:
        default:
          throw a("Unterminated array");
        case 93:
          this.i = 4;
          return 4;
        case 59:
        }
        u();
        break;
      }
      if ((i1 == 3) || (i1 == 5))
      {
        this.m[(-1 + this.n)] = 4;
        if (i1 == 5)
          switch (b(true))
          {
          default:
            throw a("Unterminated object");
          case 125:
            this.i = 2;
            return 2;
          case 59:
            u();
          case 44:
          }
        int i2 = b(true);
        switch (i2)
        {
        default:
          u();
          this.e = (-1 + this.e);
          if (!a((char)i2))
            break;
          this.i = 14;
          return 14;
        case 34:
          this.i = 13;
          return 13;
        case 39:
          u();
          this.i = 12;
          return 12;
        case 125:
          if (i1 != 5)
          {
            this.i = 2;
            return 2;
          }
          throw a("Expected name");
        }
        throw a("Expected name");
      }
      if (i1 == 4)
      {
        this.m[(-1 + this.n)] = 5;
        switch (b(true))
        {
        case 58:
        case 59:
        case 60:
        default:
          throw a("Expected ':'");
        case 61:
        }
        u();
        if (((this.e >= this.f) && (!b(1))) || (this.d[this.e] != '>'))
          break;
        this.e = (1 + this.e);
        break;
      }
      if (i1 == 6)
      {
        if (this.c)
        {
          b(true);
          this.e = (-1 + this.e);
          if ((this.e + a.length <= this.f) || (b(a.length)))
          {
            int i4 = 0;
            while (true)
              if (i4 < a.length)
              {
                if (this.d[(i4 + this.e)] != a[i4])
                  break;
                i4++;
                continue;
              }
              else
              {
                this.e += a.length;
              }
          }
        }
        this.m[(-1 + this.n)] = 7;
        break;
      }
      if (i1 == 7)
      {
        if (b(false) == -1)
        {
          this.i = 17;
          return 17;
        }
        u();
        this.e = (-1 + this.e);
        break;
      }
      if (i1 != 8)
        break;
      throw new IllegalStateException("JsonReader is closed");
      if (i1 == 1)
      {
        this.i = 4;
        return 4;
      }
      if ((i1 == 1) || (i1 == 2))
      {
        u();
        this.e = (-1 + this.e);
        this.i = 7;
        return 7;
      }
      throw a("Unexpected value");
      u();
      this.i = 8;
      return 8;
      if (this.n == 1)
        u();
      this.i = 9;
      return 9;
      this.i = 3;
      return 3;
      this.i = 1;
      return 1;
      i3 = r();
    }
    while (i3 != 0);
    if (!a(this.d[this.e]))
      throw a("Expected value");
    u();
    this.i = 10;
    return 10;
  }

  private int q()
  {
    int i1 = this.d[this.e];
    String str1;
    String str2;
    int i2;
    int i3;
    if ((i1 == 116) || (i1 == 84))
    {
      str1 = "true";
      str2 = "TRUE";
      i2 = 5;
      i3 = str1.length();
    }
    for (int i4 = 1; ; i4++)
    {
      if (i4 >= i3)
        break label170;
      if ((i4 + this.e >= this.f) && (!b(i4 + 1)))
      {
        return 0;
        if ((i1 == 102) || (i1 == 70))
        {
          str1 = "false";
          str2 = "FALSE";
          i2 = 6;
          break;
        }
        if ((i1 == 110) || (i1 == 78))
        {
          str1 = "null";
          str2 = "NULL";
          i2 = 7;
          break;
        }
        return 0;
      }
      int i5 = this.d[(i4 + this.e)];
      if ((i5 != str1.charAt(i4)) && (i5 != str2.charAt(i4)))
        return 0;
    }
    label170: if (((i3 + this.e < this.f) || (b(i3 + 1))) && (a(this.d[(i3 + this.e)])))
      return 0;
    this.e = (i3 + this.e);
    this.i = i2;
    return i2;
  }

  private int r()
  {
    char[] arrayOfChar = this.d;
    int i1 = this.e;
    int i2 = this.f;
    long l1 = 0L;
    int i3 = 0;
    int i4 = 1;
    int i5 = 0;
    int i6 = 0;
    int i7 = i2;
    int i8 = i1;
    char c1;
    int i9;
    int i11;
    int i10;
    if (i8 + i6 == i7)
    {
      if (i6 == 1024)
        return 0;
      if (b(i6 + 1))
      {
        i8 = this.e;
        i7 = this.f;
      }
    }
    else
    {
      c1 = arrayOfChar[(i8 + i6)];
      switch (c1)
      {
      default:
        if ((c1 < '0') || (c1 > '9'))
        {
          if (!a(c1))
            break label475;
          return 0;
        }
      case '-':
        if (i5 != 0)
          break;
        i9 = 1;
        int i12 = i4;
        i11 = 1;
        i10 = i12;
      case '+':
      case 'E':
      case 'e':
      case '.':
      }
    }
    while (true)
    {
      i6++;
      i3 = i11;
      i4 = i10;
      i5 = i9;
      break;
      if (i5 == 5)
      {
        i9 = 6;
        i10 = i4;
        i11 = i3;
        continue;
      }
      return 0;
      if (i5 == 5)
      {
        i9 = 6;
        i10 = i4;
        i11 = i3;
        continue;
      }
      return 0;
      if ((i5 == 2) || (i5 == 4))
      {
        i9 = 5;
        i10 = i4;
        i11 = i3;
        continue;
      }
      return 0;
      if (i5 == 2)
      {
        i9 = 3;
        i10 = i4;
        i11 = i3;
        continue;
      }
      return 0;
      if ((i5 == 1) || (i5 == 0))
      {
        l1 = -(c1 - '0');
        i9 = 2;
        i10 = i4;
        i11 = i3;
        continue;
      }
      if (i5 == 2)
      {
        if (l1 == 0L)
          return 0;
        long l2 = 10L * l1 - (c1 - '0');
        if ((l1 > -922337203685477580L) || ((l1 == -922337203685477580L) && (l2 < l1)));
        for (int i13 = 1; ; i13 = 0)
        {
          int i14 = i13 & i4;
          i11 = i3;
          l1 = l2;
          int i15 = i5;
          i10 = i14;
          i9 = i15;
          break;
        }
      }
      if (i5 == 3)
      {
        i9 = 4;
        i10 = i4;
        i11 = i3;
        continue;
      }
      if ((i5 == 5) || (i5 == 6))
      {
        i9 = 7;
        i10 = i4;
        i11 = i3;
        continue;
        label475: if ((i5 == 2) && (i4 != 0) && ((l1 != -9223372036854775808L) || (i3 != 0)))
        {
          if (i3 != 0);
          while (true)
          {
            this.j = l1;
            this.e = (i6 + this.e);
            this.i = 15;
            return 15;
            l1 = -l1;
          }
        }
        if ((i5 == 2) || (i5 == 4) || (i5 == 7))
        {
          this.k = i6;
          this.i = 16;
          return 16;
        }
        return 0;
      }
      i9 = i5;
      i10 = i4;
      i11 = i3;
    }
  }

  private String s()
  {
    StringBuilder localStringBuilder = null;
    int i1 = 0;
    while (true)
    {
      if (i1 + this.e < this.f)
        switch (this.d[(i1 + this.e)])
        {
        default:
          i1++;
          break;
        case '#':
        case '/':
        case ';':
        case '=':
        case '\\':
          u();
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
        case ',':
        case ':':
        case '[':
        case ']':
        case '{':
        case '}':
          label178: if (localStringBuilder != null);
        }
      for (String str = new String(this.d, this.e, i1); ; str = localStringBuilder.toString())
      {
        this.e = (i1 + this.e);
        return str;
        if (i1 < 1024)
        {
          if (!b(i1 + 1))
            break label178;
          break;
        }
        if (localStringBuilder == null)
          localStringBuilder = new StringBuilder();
        localStringBuilder.append(this.d, this.e, i1);
        this.e = (i1 + this.e);
        if (b(1))
          break label305;
        i1 = 0;
        break label178;
        localStringBuilder.append(this.d, this.e, i1);
      }
      label305: i1 = 0;
    }
  }

  private int t()
  {
    return 1 + (this.e - this.h);
  }

  private void u()
  {
    if (!this.c)
      throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
  }

  private void v()
  {
    int i2;
    do
    {
      if ((this.e < this.f) || (b(1)))
      {
        char[] arrayOfChar = this.d;
        int i1 = this.e;
        this.e = (i1 + 1);
        i2 = arrayOfChar[i1];
        if (i2 != 10)
          continue;
        this.g = (1 + this.g);
        this.h = this.e;
      }
      return;
    }
    while (i2 != 13);
  }

  private char w()
  {
    if ((this.e == this.f) && (!b(1)))
      throw a("Unterminated escape sequence");
    char[] arrayOfChar = this.d;
    int i1 = this.e;
    this.e = (i1 + 1);
    int i2 = arrayOfChar[i1];
    switch (i2)
    {
    default:
      return i2;
    case 117:
      if ((4 + this.e > this.f) && (!b(4)))
        throw a("Unterminated escape sequence");
      int i3 = this.e;
      int i4 = i3 + 4;
      int i5 = 0;
      int i6 = i3;
      if (i6 < i4)
      {
        int i7 = this.d[i6];
        int i8 = (char)(i5 << 4);
        if ((i7 >= 48) && (i7 <= 57))
          i5 = (char)(i8 + (i7 - 48));
        while (true)
        {
          i6++;
          break;
          if ((i7 >= 97) && (i7 <= 102))
          {
            i5 = (char)(i8 + (10 + (i7 - 97)));
            continue;
          }
          if ((i7 < 65) || (i7 > 70))
            break label281;
          i5 = (char)(i8 + (10 + (i7 - 65)));
        }
        throw new NumberFormatException("\\u" + new String(this.d, this.e, 4));
      }
      this.e = (4 + this.e);
      return i5;
    case 116:
      return '\t';
    case 98:
      return '\b';
    case 110:
      return '\n';
    case 114:
      return '\r';
    case 102:
      label281: return '\f';
    case 10:
    }
    this.g = (1 + this.g);
    this.h = this.e;
    return i2;
  }

  public void a()
  {
    int i1 = this.i;
    if (i1 == 0)
      i1 = o();
    if (i1 == 3)
    {
      a(1);
      this.i = 0;
      return;
    }
    throw new IllegalStateException("Expected BEGIN_ARRAY but was " + f() + " at line " + (1 + this.g) + " column " + t());
  }

  public final void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }

  public void b()
  {
    int i1 = this.i;
    if (i1 == 0)
      i1 = o();
    if (i1 == 4)
    {
      this.n = (-1 + this.n);
      this.i = 0;
      return;
    }
    throw new IllegalStateException("Expected END_ARRAY but was " + f() + " at line " + (1 + this.g) + " column " + t());
  }

  public void c()
  {
    int i1 = this.i;
    if (i1 == 0)
      i1 = o();
    if (i1 == 1)
    {
      a(3);
      this.i = 0;
      return;
    }
    throw new IllegalStateException("Expected BEGIN_OBJECT but was " + f() + " at line " + (1 + this.g) + " column " + t());
  }

  public void close()
  {
    this.i = 0;
    this.m[0] = 8;
    this.n = 1;
    this.b.close();
  }

  public void d()
  {
    int i1 = this.i;
    if (i1 == 0)
      i1 = o();
    if (i1 == 2)
    {
      this.n = (-1 + this.n);
      this.i = 0;
      return;
    }
    throw new IllegalStateException("Expected END_OBJECT but was " + f() + " at line " + (1 + this.g) + " column " + t());
  }

  public boolean e()
  {
    int i1 = this.i;
    if (i1 == 0)
      i1 = o();
    return (i1 != 2) && (i1 != 4);
  }

  public JsonToken f()
  {
    int i1 = this.i;
    if (i1 == 0)
      i1 = o();
    switch (i1)
    {
    default:
      throw new AssertionError();
    case 1:
      return JsonToken.BEGIN_OBJECT;
    case 2:
      return JsonToken.END_OBJECT;
    case 3:
      return JsonToken.BEGIN_ARRAY;
    case 4:
      return JsonToken.END_ARRAY;
    case 12:
    case 13:
    case 14:
      return JsonToken.NAME;
    case 5:
    case 6:
      return JsonToken.BOOLEAN;
    case 7:
      return JsonToken.NULL;
    case 8:
    case 9:
    case 10:
    case 11:
      return JsonToken.STRING;
    case 15:
    case 16:
      return JsonToken.NUMBER;
    case 17:
    }
    return JsonToken.END_DOCUMENT;
  }

  public String g()
  {
    int i1 = this.i;
    if (i1 == 0)
      i1 = o();
    String str;
    if (i1 == 14)
      str = s();
    while (true)
    {
      this.i = 0;
      return str;
      if (i1 == 12)
      {
        str = b('\'');
        continue;
      }
      if (i1 != 13)
        break;
      str = b('"');
    }
    throw new IllegalStateException("Expected a name but was " + f() + " at line " + (1 + this.g) + " column " + t());
  }

  public String h()
  {
    int i1 = this.i;
    if (i1 == 0)
      i1 = o();
    String str;
    if (i1 == 10)
      str = s();
    while (true)
    {
      this.i = 0;
      return str;
      if (i1 == 8)
      {
        str = b('\'');
        continue;
      }
      if (i1 == 9)
      {
        str = b('"');
        continue;
      }
      if (i1 == 11)
      {
        str = this.l;
        this.l = null;
        continue;
      }
      if (i1 == 15)
      {
        str = Long.toString(this.j);
        continue;
      }
      if (i1 != 16)
        break;
      str = new String(this.d, this.e, this.k);
      this.e += this.k;
    }
    throw new IllegalStateException("Expected a string but was " + f() + " at line " + (1 + this.g) + " column " + t());
  }

  public boolean i()
  {
    int i1 = this.i;
    if (i1 == 0)
      i1 = o();
    if (i1 == 5)
    {
      this.i = 0;
      return true;
    }
    if (i1 == 6)
    {
      this.i = 0;
      return false;
    }
    throw new IllegalStateException("Expected a boolean but was " + f() + " at line " + (1 + this.g) + " column " + t());
  }

  public void j()
  {
    int i1 = this.i;
    if (i1 == 0)
      i1 = o();
    if (i1 == 7)
    {
      this.i = 0;
      return;
    }
    throw new IllegalStateException("Expected null but was " + f() + " at line " + (1 + this.g) + " column " + t());
  }

  public double k()
  {
    int i1 = this.i;
    if (i1 == 0)
      i1 = o();
    if (i1 == 15)
    {
      this.i = 0;
      return this.j;
    }
    if (i1 == 16)
    {
      this.l = new String(this.d, this.e, this.k);
      this.e += this.k;
    }
    double d1;
    while (true)
    {
      this.i = 11;
      d1 = Double.parseDouble(this.l);
      if ((this.c) || ((!Double.isNaN(d1)) && (!Double.isInfinite(d1))))
        break;
      throw new MalformedJsonException("JSON forbids NaN and infinities: " + d1 + " at line " + (1 + this.g) + " column " + t());
      if ((i1 == 8) || (i1 == 9))
      {
        if (i1 == 8);
        for (char c1 = '\''; ; c1 = '"')
        {
          this.l = b(c1);
          break;
        }
      }
      if (i1 == 10)
      {
        this.l = s();
        continue;
      }
      if (i1 == 11)
        continue;
      throw new IllegalStateException("Expected a double but was " + f() + " at line " + (1 + this.g) + " column " + t());
    }
    this.l = null;
    this.i = 0;
    return d1;
  }

  public long l()
  {
    int i1 = this.i;
    if (i1 == 0)
      i1 = o();
    if (i1 == 15)
    {
      this.i = 0;
      return this.j;
    }
    long l1;
    if (i1 == 16)
    {
      this.l = new String(this.d, this.e, this.k);
      this.e += this.k;
      this.i = 11;
      double d1 = Double.parseDouble(this.l);
      l1 = ()d1;
      if (l1 != d1)
        throw new NumberFormatException("Expected a long but was " + this.l + " at line " + (1 + this.g) + " column " + t());
    }
    else
    {
      if ((i1 == 8) || (i1 == 9))
      {
        if (i1 == 8);
        for (char c1 = '\''; ; c1 = '"')
        {
          this.l = b(c1);
          try
          {
            long l2 = Long.parseLong(this.l);
            this.i = 0;
            return l2;
          }
          catch (NumberFormatException localNumberFormatException)
          {
          }
          break;
        }
      }
      throw new IllegalStateException("Expected a long but was " + f() + " at line " + (1 + this.g) + " column " + t());
    }
    this.l = null;
    this.i = 0;
    return l1;
  }

  public int m()
  {
    int i1 = this.i;
    if (i1 == 0)
      i1 = o();
    if (i1 == 15)
    {
      int i4 = (int)this.j;
      if (this.j != i4)
        throw new NumberFormatException("Expected an int but was " + this.j + " at line " + (1 + this.g) + " column " + t());
      this.i = 0;
      return i4;
    }
    int i2;
    if (i1 == 16)
    {
      this.l = new String(this.d, this.e, this.k);
      this.e += this.k;
      this.i = 11;
      double d1 = Double.parseDouble(this.l);
      i2 = (int)d1;
      if (i2 != d1)
        throw new NumberFormatException("Expected an int but was " + this.l + " at line " + (1 + this.g) + " column " + t());
    }
    else
    {
      if ((i1 == 8) || (i1 == 9))
      {
        if (i1 == 8);
        for (char c1 = '\''; ; c1 = '"')
        {
          this.l = b(c1);
          try
          {
            int i3 = Integer.parseInt(this.l);
            this.i = 0;
            return i3;
          }
          catch (NumberFormatException localNumberFormatException)
          {
          }
          break;
        }
      }
      throw new IllegalStateException("Expected an int but was " + f() + " at line " + (1 + this.g) + " column " + t());
    }
    this.l = null;
    this.i = 0;
    return i2;
  }

  public void n()
  {
    int i1 = 0;
    int i2 = this.i;
    if (i2 == 0)
      i2 = o();
    if (i2 == 3)
    {
      a(1);
      i1++;
    }
    while (true)
    {
      label29: this.i = 0;
      if (i1 != 0)
        break;
      return;
      if (i2 == 1)
      {
        a(3);
        i1++;
        continue;
      }
      if (i2 == 4)
      {
        this.n = (-1 + this.n);
        i1--;
        continue;
      }
      if (i2 == 2)
      {
        this.n = (-1 + this.n);
        i1--;
        continue;
      }
      if ((i2 == 14) || (i2 == 10))
      {
        do
        {
          int i3 = 0;
          while (true)
            if (i3 + this.e < this.f)
              switch (this.d[(i3 + this.e)])
              {
              default:
                i3++;
                break;
              case '#':
              case '/':
              case ';':
              case '=':
              case '\\':
                u();
              case '\t':
              case '\n':
              case '\f':
              case '\r':
              case ' ':
              case ',':
              case ':':
              case '[':
              case ']':
              case '{':
              case '}':
                this.e = (i3 + this.e);
                break label29;
              }
          this.e = (i3 + this.e);
        }
        while (b(1));
        continue;
      }
      if ((i2 == 8) || (i2 == 12))
      {
        c('\'');
        continue;
      }
      if ((i2 == 9) || (i2 == 13))
      {
        c('"');
        continue;
      }
      if (i2 != 16)
        continue;
      this.e += this.k;
    }
  }

  public final boolean p()
  {
    return this.c;
  }

  public String toString()
  {
    return getClass().getSimpleName() + " at line " + (1 + this.g) + " column " + t();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.stream.a
 * JD-Core Version:    0.6.0
 */