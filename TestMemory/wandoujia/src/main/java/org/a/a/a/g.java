package org.a.a.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.DefaultHandler;

public final class g extends DefaultHandler
  implements h, XMLReader, LexicalHandler
{
  private static char[] I;
  private static String K;
  private static boolean i = true;
  private static boolean j = true;
  private static boolean k = true;
  private static boolean l = true;
  private static boolean m = true;
  private String A;
  private String B;
  private String C;
  private String D;
  private c E;
  private c F;
  private c G;
  private int H;
  private boolean J;
  private ContentHandler a = this;
  private LexicalHandler b = this;
  private DTDHandler c = this;
  private ErrorHandler d = this;
  private EntityResolver e = this;
  private j f;
  private i g;
  private b h;
  private boolean n = i;
  private boolean o = false;
  private boolean p = false;
  private boolean q = j;
  private boolean r = k;
  private boolean s = false;
  private boolean t = l;
  private boolean u = false;
  private boolean v = m;
  private HashMap w = new HashMap();
  private c x;
  private String y;
  private boolean z;

  static
  {
    I = new char[] { 60, 47, 62 };
    K = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-'()+,./:=?;!*#@$_%";
  }

  public g()
  {
    this.w.put("http://xml.org/sax/features/namespaces", a(i));
    this.w.put("http://xml.org/sax/features/namespace-prefixes", Boolean.FALSE);
    this.w.put("http://xml.org/sax/features/external-general-entities", Boolean.FALSE);
    this.w.put("http://xml.org/sax/features/external-parameter-entities", Boolean.FALSE);
    this.w.put("http://xml.org/sax/features/is-standalone", Boolean.FALSE);
    this.w.put("http://xml.org/sax/features/lexical-handler/parameter-entities", Boolean.FALSE);
    this.w.put("http://xml.org/sax/features/resolve-dtd-uris", Boolean.TRUE);
    this.w.put("http://xml.org/sax/features/string-interning", Boolean.TRUE);
    this.w.put("http://xml.org/sax/features/use-attributes2", Boolean.FALSE);
    this.w.put("http://xml.org/sax/features/use-locator2", Boolean.FALSE);
    this.w.put("http://xml.org/sax/features/use-entity-resolver2", Boolean.FALSE);
    this.w.put("http://xml.org/sax/features/validation", Boolean.FALSE);
    this.w.put("http://xml.org/sax/features/xmlns-uris", Boolean.FALSE);
    this.w.put("http://xml.org/sax/features/xmlns-uris", Boolean.FALSE);
    this.w.put("http://xml.org/sax/features/xml-1.1", Boolean.FALSE);
    this.w.put("http://www.ccil.org/~cowan/tagsoup/features/ignore-bogons", a(false));
    this.w.put("http://www.ccil.org/~cowan/tagsoup/features/bogons-empty", a(false));
    this.w.put("http://www.ccil.org/~cowan/tagsoup/features/root-bogons", a(j));
    this.w.put("http://www.ccil.org/~cowan/tagsoup/features/default-attributes", a(k));
    this.w.put("http://www.ccil.org/~cowan/tagsoup/features/translate-colons", a(false));
    this.w.put("http://www.ccil.org/~cowan/tagsoup/features/restart-elements", a(l));
    this.w.put("http://www.ccil.org/~cowan/tagsoup/features/ignorable-whitespace", a(false));
    this.w.put("http://www.ccil.org/~cowan/tagsoup/features/cdata-elements", a(m));
    this.x = null;
    this.y = null;
    this.z = false;
    this.A = null;
    this.B = null;
    this.C = null;
    this.D = null;
    this.E = null;
    this.F = null;
    this.G = null;
    this.H = 0;
    this.J = true;
  }

  private int a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (paramInt2 <= 0)
      return 0;
    if ((paramArrayOfChar[paramInt1] != '#') || ((paramInt2 > 1) && ((paramArrayOfChar[(paramInt1 + 1)] == 'x') || (paramArrayOfChar[(paramInt1 + 1)] == 'X'))));
    try
    {
      int i2 = Integer.parseInt(new String(paramArrayOfChar, paramInt1 + 2, paramInt2 - 2), 16);
      return i2;
      try
      {
        int i1 = Integer.parseInt(new String(paramArrayOfChar, paramInt1 + 1, paramInt2 - 1), 10);
        return i1;
        return this.f.b(new String(paramArrayOfChar, paramInt1, paramInt2));
      }
      catch (NumberFormatException localNumberFormatException1)
      {
        return 0;
      }
    }
    catch (NumberFormatException localNumberFormatException2)
    {
    }
    return 0;
  }

  private static Reader a(InputSource paramInputSource)
  {
    Object localObject = paramInputSource.getCharacterStream();
    InputStream localInputStream = paramInputSource.getByteStream();
    String str1 = paramInputSource.getEncoding();
    paramInputSource.getPublicId();
    String str2 = paramInputSource.getSystemId();
    if (localObject == null)
    {
      if (localInputStream == null)
        localInputStream = new URL(new URL("file", "", System.getProperty("user.dir") + "/."), str2).openConnection().getInputStream();
      if (str1 == null)
        localObject = new InputStreamReader(localInputStream);
    }
    else
    {
      return localObject;
    }
    try
    {
      InputStreamReader localInputStreamReader = new InputStreamReader(localInputStream, str1);
      return localInputStreamReader;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    return (Reader)new InputStreamReader(localInputStream);
  }

  private static Boolean a(boolean paramBoolean)
  {
    if (paramBoolean)
      return Boolean.TRUE;
    return Boolean.FALSE;
  }

  private String a(String paramString)
  {
    int i1 = paramString.length();
    char[] arrayOfChar = new char[i1];
    int i2 = 0;
    int i3 = 0;
    int i4 = -1;
    int i5;
    int i6;
    if (i2 < i1)
    {
      char c1 = paramString.charAt(i2);
      i5 = i3 + 1;
      arrayOfChar[i3] = c1;
      if ((c1 == '&') && (i4 == -1))
        i4 = i5;
      do
      {
        i2++;
        i3 = i5;
        break;
      }
      while ((i4 == -1) || (Character.isLetter(c1)) || (Character.isDigit(c1)) || (c1 == '#'));
      if (c1 == ';')
      {
        i6 = a(arrayOfChar, i4, -1 + (i5 - i4));
        if (i6 > 65535)
        {
          int i7 = i6 - 65536;
          arrayOfChar[(i4 - 1)] = (char)(55296 + (i7 >> 10));
          arrayOfChar[i4] = (char)(56320 + (i7 & 0x3FF));
          i4++;
        }
      }
    }
    while (true)
    {
      i5 = i4;
      i4 = -1;
      break;
      if (i6 != 0)
      {
        arrayOfChar[(i4 - 1)] = (char)i6;
        continue;
        i4 = -1;
        break;
        return new String(arrayOfChar, 0, i3);
      }
      i4 = i5;
    }
  }

  private void a(c paramc)
  {
    while ((this.F != null) && (this.E.b(this.F)) && ((paramc == null) || (this.F.b(paramc))))
    {
      c localc = this.F.b();
      b(this.F);
      this.F = localc;
    }
  }

  private boolean a(String paramString1, String paramString2)
  {
    return (!paramString1.equals("")) && (!paramString2.equals("")) && (!paramString2.equals(this.f.b()));
  }

  private static String b(String paramString)
  {
    int i1 = paramString.indexOf(':');
    String str = "";
    if (i1 != -1)
      str = paramString.substring(0, i1);
    return str;
  }

  private String b(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    StringBuffer localStringBuffer = new StringBuffer(paramInt2 + 2);
    int i1 = 1;
    int i2 = 0;
    int i3 = paramInt2 - 1;
    char c1;
    int i5;
    int i6;
    if (paramInt2 > 0)
    {
      c1 = paramArrayOfChar[paramInt1];
      if ((Character.isLetter(c1)) || (c1 == '_'))
      {
        localStringBuffer.append(c1);
        i5 = 0;
        i6 = i2;
      }
    }
    while (true)
    {
      paramInt1++;
      i2 = i6;
      paramInt2 = i3;
      i1 = i5;
      break;
      if ((Character.isDigit(c1)) || (c1 == '-') || (c1 == '.'))
      {
        if (i1 != 0)
          localStringBuffer.append('_');
        localStringBuffer.append(c1);
        i6 = i2;
        i5 = 0;
        continue;
      }
      if ((c1 == ':') && (i2 == 0))
      {
        if (i1 != 0)
          localStringBuffer.append('_');
        if (this.s)
          c1 = '_';
        localStringBuffer.append(c1);
        i5 = 1;
        i6 = 1;
        continue;
        int i4 = localStringBuffer.length();
        if ((i4 == 0) || (localStringBuffer.charAt(i4 - 1) == ':'))
          localStringBuffer.append('_');
        return localStringBuffer.toString().intern();
      }
      i5 = i1;
      i6 = i2;
    }
  }

  private void b(c paramc)
  {
    String str1 = paramc.c();
    Object localObject = paramc.e();
    String str2 = paramc.d();
    String str3 = b(str1);
    paramc.j();
    if (!this.n)
    {
      str2 = "";
      localObject = str2;
    }
    if ((this.J) && (((String)localObject).equalsIgnoreCase(this.C)));
    try
    {
      this.e.resolveEntity(this.A, this.B);
      label76: if (a(str3, str2))
        this.a.startPrefixMapping(str3, str2);
      a locala = paramc.a();
      int i1 = locala.getLength();
      for (int i2 = 0; i2 < i1; i2++)
      {
        String str4 = locala.getURI(i2);
        String str5 = b(locala.getQName(i2));
        if (!a(str5, str4))
          continue;
        this.a.startPrefixMapping(str5, str4);
      }
      this.a.startElement(str2, (String)localObject, str1, paramc.a());
      paramc.a(this.E);
      this.E = paramc;
      this.J = false;
      if ((this.v) && ((0x2 & this.E.g()) != 0))
        this.g.a();
      return;
    }
    catch (IOException localIOException)
    {
      break label76;
    }
  }

  private static String c(String paramString)
  {
    if (paramString == null);
    int i1;
    int i2;
    do
    {
      do
      {
        return paramString;
        i1 = paramString.length();
      }
      while (i1 == 0);
      i2 = paramString.charAt(0);
    }
    while ((i2 != paramString.charAt(i1 - 1)) || ((i2 != 39) && (i2 != 34)));
    return paramString.substring(1, -1 + paramString.length());
  }

  private void c(c paramc)
  {
    c localc1;
    while (true)
    {
      for (localc1 = this.E; (localc1 != null) && (!localc1.b(paramc)); localc1 = localc1.b());
      if (localc1 != null)
        break;
      d locald = paramc.h();
      if (locald == null)
        break;
      c localc3 = new c(locald, this.r);
      localc3.a(paramc);
      paramc = localc3;
    }
    if (localc1 == null)
      return;
    while ((this.E != localc1) && (this.E != null) && (this.E.b() != null) && (this.E.b().b() != null))
      e();
    while (paramc != null)
    {
      c localc2 = paramc.b();
      if (!paramc.c().equals("<pcdata>"))
        b(paramc);
      a(localc2);
      paramc = localc2;
    }
    this.x = null;
  }

  private void d()
  {
    if (this.E == null)
      return;
    String str1 = this.E.c();
    Object localObject = this.E.e();
    String str2 = this.E.d();
    String str3 = b(str1);
    if (!this.n)
    {
      str2 = "";
      localObject = str2;
    }
    this.a.endElement(str2, (String)localObject, str1);
    if (a(str3, str2))
      this.a.endPrefixMapping(str3);
    a locala = this.E.a();
    for (int i1 = -1 + locala.getLength(); i1 >= 0; i1--)
    {
      String str4 = locala.getURI(i1);
      String str5 = b(locala.getQName(i1));
      if (!a(str5, str4))
        continue;
      this.a.endPrefixMapping(str5);
    }
    this.E = this.E.b();
  }

  private static String[] d(String paramString)
  {
    String str = paramString.trim();
    if (str.length() == 0)
      return new String[0];
    ArrayList localArrayList = new ArrayList();
    int i1 = str.length();
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    if (i5 < i1)
    {
      char c1 = str.charAt(i5);
      if ((i3 == 0) && (c1 == '\'') && (i2 != 92))
        if (i4 == 0)
        {
          i4 = 1;
          label86: if (i6 < 0)
            i6 = i5;
        }
      while (true)
      {
        i5++;
        i2 = c1;
        break;
        i4 = 0;
        break label86;
        if ((i4 == 0) && (c1 == '"') && (i2 != 92))
        {
          if (i3 == 0);
          for (i3 = 1; ; i3 = 0)
          {
            if (i6 >= 0)
              break label154;
            i6 = i5;
            break;
          }
          label154: continue;
        }
        if ((i4 != 0) || (i3 != 0))
          continue;
        if (Character.isWhitespace(c1))
        {
          if (i6 >= 0)
            localArrayList.add(str.substring(i6, i5));
          i6 = -1;
          continue;
        }
        if ((i6 >= 0) || (c1 == ' '))
          continue;
        i6 = i5;
      }
    }
    localArrayList.add(str.substring(i6, i5));
    return (String[])localArrayList.toArray(new String[0]);
  }

  private static String e(String paramString)
  {
    if (paramString == null)
      return null;
    int i1 = paramString.length();
    StringBuffer localStringBuffer = new StringBuffer(i1);
    int i2 = 0;
    int i3 = 1;
    if (i2 < i1)
    {
      char c1 = paramString.charAt(i2);
      if (K.indexOf(c1) != -1)
      {
        localStringBuffer.append(c1);
        i3 = 0;
      }
      while (true)
      {
        i2++;
        break;
        if (i3 != 0)
          continue;
        localStringBuffer.append(' ');
        i3 = 1;
      }
    }
    return localStringBuffer.toString().trim();
  }

  private void e()
  {
    c localc = this.E;
    d();
    if ((this.t) && ((0x1 & localc.g()) != 0))
    {
      localc.i();
      localc.a(this.F);
      this.F = localc;
    }
  }

  private void m(char[] paramArrayOfChar, int paramInt)
  {
    this.x = null;
    d locald;
    if (paramInt != 0)
    {
      String str2 = b(paramArrayOfChar, 0, paramInt);
      locald = this.f.a(str2);
      if (locald != null);
    }
    int i1;
    c localc2;
    do
    {
      return;
      for (String str1 = locald.a(); ; str1 = this.E.c())
      {
        c localc1 = this.E;
        i1 = 0;
        for (localc2 = localc1; (localc2 != null) && (!localc2.c().equals(str1)); localc2 = localc2.b())
        {
          if ((0x4 & localc2.g()) == 0)
            continue;
          i1 = 1;
        }
      }
    }
    while ((localc2 == null) || (localc2.b() == null) || (localc2.b().b() == null));
    if (i1 != 0)
      localc2.k();
    while (true)
    {
      if (!this.E.l())
      {
        a(null);
        return;
        while (this.E != localc2)
          e();
      }
      d();
    }
  }

  public final void a()
  {
    if ((this.x == null) || (this.y == null))
      return;
    this.x.a(this.y, this.y);
    this.y = null;
  }

  public final void a(char[] paramArrayOfChar, int paramInt)
  {
    if (this.x == null)
      return;
    this.y = b(paramArrayOfChar, 0, paramInt).toLowerCase();
  }

  public final void b()
  {
    if (this.J)
      c(this.G);
    while (this.E.b() != null)
      d();
    if (!this.f.b().equals(""))
      this.a.endPrefixMapping(this.f.c());
    this.a.endDocument();
  }

  public final void b(char[] paramArrayOfChar, int paramInt)
  {
    if ((this.x == null) || (this.y == null))
      return;
    String str = a(new String(paramArrayOfChar, 0, paramInt));
    this.x.a(this.y, str);
    this.y = null;
  }

  public final int c()
  {
    return this.H;
  }

  public final void c(char[] paramArrayOfChar, int paramInt)
  {
    this.H = a(paramArrayOfChar, 1, paramInt);
  }

  public final void comment(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
  }

  public final void d(char[] paramArrayOfChar, int paramInt)
  {
    int i1 = 1;
    String str = this.E.c();
    int i2;
    int i3;
    if ((this.v) && ((0x2 & this.E.g()) != 0))
      if (paramInt == str.length())
      {
        i2 = i1;
        if (i2 != 0)
        {
          i3 = 0;
          label50: if (i3 < paramInt)
          {
            if (Character.toLowerCase(paramArrayOfChar[(i3 + 0)]) == Character.toLowerCase(str.charAt(i3)))
              break label146;
            i2 = 0;
          }
        }
        if (i2 != 0)
          break label152;
        this.a.characters(I, 0, 2);
        this.a.characters(paramArrayOfChar, 0, paramInt);
        this.a.characters(I, 2, i1);
        this.g.a();
      }
    while (true)
    {
      if (i1 == 0)
        break label157;
      return;
      i2 = 0;
      break;
      label146: i3++;
      break label50;
      label152: i1 = 0;
    }
    label157: m(paramArrayOfChar, paramInt);
  }

  public final void e(char[] paramArrayOfChar, int paramInt)
  {
    String str1 = null;
    String[] arrayOfString = d(new String(paramArrayOfChar, 0, paramInt));
    String str2;
    String str3;
    if ((arrayOfString.length > 0) && ("DOCTYPE".equalsIgnoreCase(arrayOfString[0])))
    {
      if (this.z)
        return;
      this.z = true;
      if (arrayOfString.length > 1)
      {
        str2 = arrayOfString[1];
        if ((arrayOfString.length > 3) && ("SYSTEM".equals(arrayOfString[2])))
          str3 = arrayOfString[3];
      }
    }
    while (true)
    {
      String str4 = c(str1);
      String str5 = c(str3);
      if (str2 == null)
        break;
      String str6 = e(str4);
      this.b.startDTD(str2, str6, str5);
      this.b.endDTD();
      this.C = str2;
      this.A = str6;
      if (!(this.g instanceof Locator))
        break;
      this.B = ((Locator)this.g).getSystemId();
      try
      {
        this.B = new URL(new URL(this.B), str5).toString();
        return;
      }
      catch (Exception localException)
      {
        return;
      }
      if ((arrayOfString.length > 3) && ("PUBLIC".equals(arrayOfString[2])))
      {
        str1 = arrayOfString[3];
        if (arrayOfString.length > 4)
        {
          str3 = arrayOfString[4];
          continue;
        }
        str3 = "";
        continue;
      }
      str1 = null;
      str3 = null;
      continue;
      str1 = null;
      str2 = null;
      str3 = null;
    }
  }

  public final void endCDATA()
  {
  }

  public final void endDTD()
  {
  }

  public final void endEntity(String paramString)
  {
  }

  public final void f(char[] paramArrayOfChar, int paramInt)
  {
    int i1 = -1;
    if (this.x != null);
    String str;
    d locald;
    int i2;
    while (true)
    {
      return;
      str = b(paramArrayOfChar, 0, paramInt);
      if (str == null)
        continue;
      locald = this.f.a(str);
      if (locald != null)
        break;
      if (this.o)
        continue;
      if (!this.p)
        break label132;
      i2 = 0;
      if (!this.q)
        break label138;
    }
    while (true)
    {
      this.f.a(str, i2, i1, 0);
      if (!this.q)
        this.f.a(str, this.f.a().a());
      locald = this.f.a(str);
      this.x = new c(locald, this.r);
      return;
      label132: i2 = i1;
      break;
      label138: i1 = 2147483647;
    }
  }

  public final void g(char[] paramArrayOfChar, int paramInt)
  {
    if (paramInt == 0);
    while (true)
    {
      return;
      int i1 = 1;
      for (int i2 = 0; i2 < paramInt; i2++)
      {
        if (Character.isWhitespace(paramArrayOfChar[(i2 + 0)]))
          continue;
        i1 = 0;
      }
      if ((i1 == 0) || (this.E.b(this.G)))
        break;
      if (!this.u)
        continue;
      this.a.ignorableWhitespace(paramArrayOfChar, 0, paramInt);
      return;
    }
    c(this.G);
    this.a.characters(paramArrayOfChar, 0, paramInt);
  }

  public final ContentHandler getContentHandler()
  {
    if (this.a == this)
      return null;
    return this.a;
  }

  public final DTDHandler getDTDHandler()
  {
    if (this.c == this)
      return null;
    return this.c;
  }

  public final EntityResolver getEntityResolver()
  {
    if (this.e == this)
      return null;
    return this.e;
  }

  public final ErrorHandler getErrorHandler()
  {
    if (this.d == this)
      return null;
    return this.d;
  }

  public final boolean getFeature(String paramString)
  {
    Boolean localBoolean = (Boolean)this.w.get(paramString);
    if (localBoolean == null)
      throw new SAXNotRecognizedException("Unknown feature " + paramString);
    return localBoolean.booleanValue();
  }

  public final Object getProperty(String paramString)
  {
    if (paramString.equals("http://xml.org/sax/properties/lexical-handler"))
    {
      if (this.b == this)
        return null;
      return this.b;
    }
    if (paramString.equals("http://www.ccil.org/~cowan/tagsoup/properties/scanner"))
      return this.g;
    if (paramString.equals("http://www.ccil.org/~cowan/tagsoup/properties/schema"))
      return this.f;
    if (paramString.equals("http://www.ccil.org/~cowan/tagsoup/properties/auto-detector"))
      return this.h;
    throw new SAXNotRecognizedException("Unknown property " + paramString);
  }

  public final void h(char[] paramArrayOfChar, int paramInt)
  {
    if (this.x != null)
      return;
    this.D = b(paramArrayOfChar, 0, paramInt).replace(':', '_');
  }

  public final void i(char[] paramArrayOfChar, int paramInt)
  {
    if ((this.x != null) || (this.D == null));
    do
      return;
    while ("xml".equalsIgnoreCase(this.D));
    if ((paramInt > 0) && (paramArrayOfChar[(paramInt - 1)] == '?'))
      paramInt--;
    this.a.processingInstruction(this.D, new String(paramArrayOfChar, 0, paramInt));
    this.D = null;
  }

  public final void j(char[] paramArrayOfChar, int paramInt)
  {
    if (this.x == null);
    do
    {
      return;
      c(this.x);
    }
    while (this.E.f() != 0);
    m(paramArrayOfChar, paramInt);
  }

  public final void k(char[] paramArrayOfChar, int paramInt)
  {
    if (this.x == null)
      return;
    c(this.x);
    m(paramArrayOfChar, paramInt);
  }

  public final void l(char[] paramArrayOfChar, int paramInt)
  {
    this.b.comment(paramArrayOfChar, 0, paramInt);
  }

  public final void parse(String paramString)
  {
    parse(new InputSource(paramString));
  }

  public final void parse(InputSource paramInputSource)
  {
    if (this.f == null)
      this.f = new f();
    if (this.g == null)
      this.g = new e();
    if (this.h == null)
      this.h = new b();
    this.E = new c(this.f.a("<root>"), this.r);
    this.G = new c(this.f.a("<pcdata>"), this.r);
    this.x = null;
    this.y = null;
    this.D = null;
    this.F = null;
    this.H = 0;
    this.J = true;
    this.B = null;
    this.A = null;
    this.C = null;
    Reader localReader = a(paramInputSource);
    this.a.startDocument();
    this.g.a(paramInputSource.getPublicId(), paramInputSource.getSystemId());
    if ((this.g instanceof Locator))
      this.a.setDocumentLocator((Locator)this.g);
    if (!this.f.b().equals(""))
      this.a.startPrefixMapping(this.f.c(), this.f.b());
    this.g.a(localReader, this);
  }

  public final void setContentHandler(ContentHandler paramContentHandler)
  {
    if (paramContentHandler == null)
      paramContentHandler = this;
    this.a = paramContentHandler;
  }

  public final void setDTDHandler(DTDHandler paramDTDHandler)
  {
    if (paramDTDHandler == null)
      paramDTDHandler = this;
    this.c = paramDTDHandler;
  }

  public final void setEntityResolver(EntityResolver paramEntityResolver)
  {
    if (paramEntityResolver == null)
      paramEntityResolver = this;
    this.e = paramEntityResolver;
  }

  public final void setErrorHandler(ErrorHandler paramErrorHandler)
  {
    if (paramErrorHandler == null)
      paramErrorHandler = this;
    this.d = paramErrorHandler;
  }

  public final void setFeature(String paramString, boolean paramBoolean)
  {
    if ((Boolean)this.w.get(paramString) == null)
      throw new SAXNotRecognizedException("Unknown feature " + paramString);
    if (paramBoolean)
    {
      this.w.put(paramString, Boolean.TRUE);
      if (!paramString.equals("http://xml.org/sax/features/namespaces"))
        break label85;
      this.n = paramBoolean;
    }
    label85: 
    do
    {
      return;
      this.w.put(paramString, Boolean.FALSE);
      break;
      if (paramString.equals("http://www.ccil.org/~cowan/tagsoup/features/ignore-bogons"))
      {
        this.o = paramBoolean;
        return;
      }
      if (paramString.equals("http://www.ccil.org/~cowan/tagsoup/features/bogons-empty"))
      {
        this.p = paramBoolean;
        return;
      }
      if (paramString.equals("http://www.ccil.org/~cowan/tagsoup/features/root-bogons"))
      {
        this.q = paramBoolean;
        return;
      }
      if (paramString.equals("http://www.ccil.org/~cowan/tagsoup/features/default-attributes"))
      {
        this.r = paramBoolean;
        return;
      }
      if (paramString.equals("http://www.ccil.org/~cowan/tagsoup/features/translate-colons"))
      {
        this.s = paramBoolean;
        return;
      }
      if (paramString.equals("http://www.ccil.org/~cowan/tagsoup/features/restart-elements"))
      {
        this.t = paramBoolean;
        return;
      }
      if (!paramString.equals("http://www.ccil.org/~cowan/tagsoup/features/ignorable-whitespace"))
        continue;
      this.u = paramBoolean;
      return;
    }
    while (!paramString.equals("http://www.ccil.org/~cowan/tagsoup/features/cdata-elements"));
    this.v = paramBoolean;
  }

  public final void setProperty(String paramString, Object paramObject)
  {
    if (paramString.equals("http://xml.org/sax/properties/lexical-handler"))
    {
      if (paramObject == null)
      {
        this.b = this;
        return;
      }
      if ((paramObject instanceof LexicalHandler))
      {
        this.b = ((LexicalHandler)paramObject);
        return;
      }
      throw new SAXNotSupportedException("Your lexical handler is not a LexicalHandler");
    }
    if (paramString.equals("http://www.ccil.org/~cowan/tagsoup/properties/scanner"))
    {
      if ((paramObject instanceof i))
      {
        this.g = ((i)paramObject);
        return;
      }
      throw new SAXNotSupportedException("Your scanner is not a Scanner");
    }
    if (paramString.equals("http://www.ccil.org/~cowan/tagsoup/properties/schema"))
    {
      if ((paramObject instanceof j))
      {
        this.f = ((j)paramObject);
        return;
      }
      throw new SAXNotSupportedException("Your schema is not a Schema");
    }
    if (paramString.equals("http://www.ccil.org/~cowan/tagsoup/properties/auto-detector"))
    {
      if ((paramObject instanceof b))
      {
        this.h = ((b)paramObject);
        return;
      }
      throw new SAXNotSupportedException("Your auto-detector is not an AutoDetector");
    }
    throw new SAXNotRecognizedException("Unknown property " + paramString);
  }

  public final void startCDATA()
  {
  }

  public final void startDTD(String paramString1, String paramString2, String paramString3)
  {
  }

  public final void startEntity(String paramString)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     org.a.a.a.g
 * JD-Core Version:    0.6.0
 */