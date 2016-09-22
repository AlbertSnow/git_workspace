package com.wandoujia.ripple_framework.html;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.ParagraphStyle;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.Display;
import android.view.WindowManager;
import com.wandoujia.ripple_framework.R.dimen;
import com.wandoujia.ripple_framework.html.style.QuoteTextSpan;
import com.wandoujia.ripple_framework.html.style.RippleQuoteSpan;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

final class f
  implements ContentHandler
{
  private static final float[] a = { 1.2F, 1.1F, 1.0F, 0.9F, 0.8F, 0.7F };
  private static final HashMap<String, Integer> b;
  private static final int c;
  private static final String[] d;
  private boolean e = true;
  private String f;
  private XMLReader g;
  private SpannableStringBuilder h;
  private List<Object> i = new ArrayList();
  private e j;

  static
  {
    ((WindowManager)com.wandoujia.ripple_framework.i.k().g().getSystemService("window")).getDefaultDisplay().getWidth();
    com.wandoujia.ripple_framework.i.k().g().getResources().getDimensionPixelSize(R.dimen.detail_margin);
    c = com.wandoujia.ripple_framework.i.k().g().getResources().getDimensionPixelSize(R.dimen.detail_text_size);
    d = new String[] { "wdjAvatar", "wdjEmoji", "wdjOthers" };
    HashMap localHashMap = new HashMap();
    b = localHashMap;
    localHashMap.put("black", Integer.valueOf(-16777216));
    b.put("darkgray", Integer.valueOf(-12303292));
    b.put("gray", Integer.valueOf(-7829368));
    b.put("lightgray", Integer.valueOf(-3355444));
    b.put("white", Integer.valueOf(-1));
    b.put("red", Integer.valueOf(-65536));
    b.put("green", Integer.valueOf(-16711936));
    b.put("blue", Integer.valueOf(-16776961));
    b.put("yellow", Integer.valueOf(-256));
    b.put("cyan", Integer.valueOf(-16711681));
    b.put("magenta", Integer.valueOf(-65281));
    b.put("aqua", Integer.valueOf(-16711681));
    b.put("fuchsia", Integer.valueOf(-65281));
    b.put("darkgrey", Integer.valueOf(-12303292));
    b.put("grey", Integer.valueOf(-7829368));
    b.put("lightgrey", Integer.valueOf(-3355444));
    b.put("lime", Integer.valueOf(-16711936));
    b.put("maroon", Integer.valueOf(-8388608));
    b.put("navy", Integer.valueOf(-16777088));
    b.put("olive", Integer.valueOf(-8355840));
    b.put("purple", Integer.valueOf(-8388480));
    b.put("silver", Integer.valueOf(-4144960));
    b.put("teal", Integer.valueOf(-16744320));
  }

  public f(String paramString, e parame, org.a.a.a.g paramg)
  {
    this.f = paramString;
    this.h = new SpannableStringBuilder();
    this.j = parame;
    this.g = paramg;
  }

  private static int a(String paramString)
  {
    int k = 1;
    Integer localInteger = (Integer)b.get(paramString.toLowerCase(Locale.ROOT));
    if (localInteger != null)
      return localInteger.intValue();
    if (paramString == null)
      return -1;
    while (true)
    {
      try
      {
        String str = paramString.toString();
        int m = str.length();
        n = 10;
        if ('-' != str.charAt(0))
          break label167;
        i1 = -1;
        if ('0' != str.charAt(k))
          continue;
        if (k == m - 1)
          return 0;
        int i2 = str.charAt(k + 1);
        if (120 == i2)
          break label175;
        if (88 != i2)
          break label187;
        break label175;
        return i1 * Integer.parseInt(str.substring(i3), n);
        int i4 = str.charAt(k);
        if (35 == i4)
        {
          i3 = k + 1;
          n = 16;
          continue;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        return -1;
      }
      int i3 = k;
      continue;
      label167: int i1 = k;
      k = 0;
      continue;
      label175: i3 = k + 2;
      int n = 16;
      continue;
      label187: i3 = k + 1;
      n = 8;
    }
  }

  private static Object a(Spanned paramSpanned, Class paramClass)
  {
    Object[] arrayOfObject = paramSpanned.getSpans(0, paramSpanned.length(), paramClass);
    if (arrayOfObject.length == 0)
      return null;
    return arrayOfObject[(-1 + arrayOfObject.length)];
  }

  private void a(SpannableStringBuilder paramSpannableStringBuilder)
  {
    if ((paramSpannableStringBuilder != null) && (paramSpannableStringBuilder.toString().endsWith("● ")));
    int k;
    do
      while (true)
      {
        return;
        k = paramSpannableStringBuilder.length();
        if ((k <= 0) || (paramSpannableStringBuilder.charAt(k - 1) != '\n'))
          break;
        if ((k >= 2) && (paramSpannableStringBuilder.charAt(k - 2) == '\n'))
          continue;
        paramSpannableStringBuilder.append("\n");
        e(this.h);
        this.h = new SpannableStringBuilder();
        return;
      }
    while (k == 0);
    paramSpannableStringBuilder.append("\n\n");
    e(this.h);
    this.h = new SpannableStringBuilder();
  }

  private static void a(SpannableStringBuilder paramSpannableStringBuilder, Class paramClass, Object paramObject)
  {
    int k = paramSpannableStringBuilder.length();
    Object localObject = a(paramSpannableStringBuilder, paramClass);
    int m = paramSpannableStringBuilder.getSpanStart(localObject);
    paramSpannableStringBuilder.removeSpan(localObject);
    if ((m != k) && (m >= 0))
      paramSpannableStringBuilder.setSpan(paramObject, m, k, 33);
  }

  private static void a(SpannableStringBuilder paramSpannableStringBuilder, Object paramObject)
  {
    int k = paramSpannableStringBuilder.length();
    paramSpannableStringBuilder.setSpan(paramObject, k, k, 17);
  }

  private void a(Attributes paramAttributes)
  {
    e(this.h);
    d locald = new d();
    locald.a(paramAttributes.getValue("", "src"));
    locald.b(paramAttributes.getValue("", "poster"));
    this.i.add(locald);
    this.h = new SpannableStringBuilder();
  }

  private static void b(SpannableStringBuilder paramSpannableStringBuilder)
  {
    if ((paramSpannableStringBuilder != null) && (paramSpannableStringBuilder.toString().endsWith("● ")));
    int k;
    do
      while (true)
      {
        return;
        k = paramSpannableStringBuilder.length();
        if ((k <= 0) || (paramSpannableStringBuilder.charAt(k - 1) != '\n'))
          break;
        if ((k >= 2) && (paramSpannableStringBuilder.charAt(k - 2) == '\n'))
          continue;
        paramSpannableStringBuilder.append("\n");
        return;
      }
    while (k == 0);
    paramSpannableStringBuilder.append("\n\n");
  }

  private static void c(SpannableStringBuilder paramSpannableStringBuilder)
  {
    if (paramSpannableStringBuilder == null)
      return;
    if (paramSpannableStringBuilder.toString().contains("@@@@"))
    {
      int k = paramSpannableStringBuilder.length() - (4 + paramSpannableStringBuilder.toString().lastIndexOf("@@@@"));
      int m = c / 2 - k;
      if (m > 0)
        for (int n = 0; n < m; n++)
          paramSpannableStringBuilder.append(" ");
      paramSpannableStringBuilder.append("    ");
      paramSpannableStringBuilder.replace(paramSpannableStringBuilder.toString().lastIndexOf("@@@@"), 4 + paramSpannableStringBuilder.toString().lastIndexOf("@@@@"), "");
      return;
    }
    paramSpannableStringBuilder.append("\n");
  }

  private static void d(SpannableStringBuilder paramSpannableStringBuilder)
  {
    int k = paramSpannableStringBuilder.length();
    Object localObject = a(paramSpannableStringBuilder, k.class);
    int m = paramSpannableStringBuilder.getSpanStart(localObject);
    if (m < 0);
    do
    {
      return;
      paramSpannableStringBuilder.removeSpan(localObject);
      while ((k > m) && (paramSpannableStringBuilder.charAt(k - 1) == '\n'))
        k--;
    }
    while (m == k);
    k localk = (k)localObject;
    paramSpannableStringBuilder.setSpan(new RelativeSizeSpan(a[k.a(localk)]), m, k, 33);
    paramSpannableStringBuilder.setSpan(new StyleSpan(1), m, k, 33);
  }

  private void e(SpannableStringBuilder paramSpannableStringBuilder)
  {
    int k = 0;
    Object[] arrayOfObject = paramSpannableStringBuilder.getSpans(0, paramSpannableStringBuilder.length(), ParagraphStyle.class);
    if (k < arrayOfObject.length)
    {
      int n = paramSpannableStringBuilder.getSpanStart(arrayOfObject[k]);
      int i1 = paramSpannableStringBuilder.getSpanEnd(arrayOfObject[k]);
      if ((i1 - 2 >= 0) && (paramSpannableStringBuilder.charAt(i1 - 1) == '\n') && (paramSpannableStringBuilder.charAt(i1 - 2) == '\n'))
        i1--;
      if (i1 == n)
        paramSpannableStringBuilder.removeSpan(arrayOfObject[k]);
      while (true)
      {
        k++;
        break;
        try
        {
          paramSpannableStringBuilder.setSpan(arrayOfObject[k], n, i1, 51);
        }
        catch (Exception localException)
        {
        }
      }
    }
    for (int m = -1 + paramSpannableStringBuilder.length(); (m >= 0) && (paramSpannableStringBuilder.charAt(m) == '\n'); m--);
    if (m + 1 < paramSpannableStringBuilder.length())
      paramSpannableStringBuilder.delete(m + 1, paramSpannableStringBuilder.length());
    if (paramSpannableStringBuilder.length() > 0)
    {
      if (paramSpannableStringBuilder.toString().contains("@@@@"))
        paramSpannableStringBuilder.replace(paramSpannableStringBuilder.toString().lastIndexOf("@@@@"), 4 + paramSpannableStringBuilder.toString().lastIndexOf("@@@@"), "");
      this.i.add(paramSpannableStringBuilder);
    }
  }

  public final List<Object> a()
  {
    this.g.setContentHandler(this);
    try
    {
      this.g.parse(new InputSource(new StringReader(this.f)));
      e(this.h);
      return this.i;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(localIOException);
    }
    catch (SAXException localSAXException)
    {
    }
    throw new RuntimeException(localSAXException);
  }

  public final void characters(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int k = 0;
    if (k < paramInt2)
    {
      char c1 = paramArrayOfChar[(k + paramInt1)];
      int m;
      int i1;
      int n;
      if ((c1 == ' ') || (c1 == '\n'))
      {
        m = localStringBuilder.length();
        if (m == 0)
        {
          i1 = this.h.length();
          if (i1 == 0)
          {
            n = 10;
            label70: if ((n != 32) && (n != 10))
              localStringBuilder.append(' ');
          }
        }
      }
      while (true)
      {
        k++;
        break;
        n = this.h.charAt(i1 - 1);
        break label70;
        n = localStringBuilder.charAt(m - 1);
        break label70;
        localStringBuilder.append(c1);
      }
    }
    this.h.append(localStringBuilder);
  }

  public final void endDocument()
  {
  }

  public final void endElement(String paramString1, String paramString2, String paramString3)
  {
    if (paramString2.equalsIgnoreCase("br"))
      a(this.h);
    label517: 
    do
      while (true)
      {
        return;
        if (paramString2.equalsIgnoreCase("p"))
        {
          if (this.e)
          {
            a(this.h);
            return;
          }
          b(this.h);
          return;
        }
        if (paramString2.equalsIgnoreCase("div"))
        {
          a(this.h);
          if (this.h.length() <= 0)
            continue;
          e(this.h);
          this.h = new SpannableStringBuilder();
          return;
        }
        if (paramString2.equalsIgnoreCase("strong"))
        {
          a(this.h, i.class, new StyleSpan(1));
          return;
        }
        if (paramString2.equalsIgnoreCase("b"))
        {
          a(this.h, i.class, new StyleSpan(1));
          return;
        }
        if (paramString2.equalsIgnoreCase("em"))
        {
          a(this.h, m.class, new StyleSpan(2));
          return;
        }
        if (paramString2.equalsIgnoreCase("cite"))
        {
          a(this.h, m.class, new StyleSpan(2));
          return;
        }
        if (paramString2.equalsIgnoreCase("dfn"))
        {
          a(this.h, m.class, new StyleSpan(2));
          return;
        }
        if (paramString2.equalsIgnoreCase("i"))
        {
          a(this.h, m.class, new StyleSpan(2));
          return;
        }
        if (paramString2.equalsIgnoreCase("big"))
        {
          a(this.h, g.class, new RelativeSizeSpan(1.25F));
          return;
        }
        if (paramString2.equalsIgnoreCase("small"))
        {
          a(this.h, o.class, new RelativeSizeSpan(0.8F));
          return;
        }
        if (paramString2.equalsIgnoreCase("font"))
        {
          SpannableStringBuilder localSpannableStringBuilder3 = this.h;
          int i1 = localSpannableStringBuilder3.length();
          Object localObject2 = a(localSpannableStringBuilder3, j.class);
          int i2 = localSpannableStringBuilder3.getSpanStart(localObject2);
          localSpannableStringBuilder3.removeSpan(localObject2);
          if (i2 == i1)
            continue;
          j localj = (j)localObject2;
          if (!TextUtils.isEmpty(localj.a))
          {
            if (!localj.a.startsWith("@"))
              break label517;
            Resources localResources = Resources.getSystem();
            int i4 = localResources.getIdentifier(localj.a.substring(1), "color", "android");
            if (i4 != 0)
              localSpannableStringBuilder3.setSpan(new TextAppearanceSpan(null, 0, 0, localResources.getColorStateList(i4), null), i2, i1, 33);
          }
          while (localj.b != null)
          {
            localSpannableStringBuilder3.setSpan(new TypefaceSpan(localj.b), i2, i1, 33);
            return;
            int i3 = a(localj.a);
            if (i3 == -1)
              continue;
            localSpannableStringBuilder3.setSpan(new ForegroundColorSpan(i3 | 0xFF000000), i2, i1, 33);
          }
          continue;
        }
        if (paramString2.equalsIgnoreCase("blockquote"))
        {
          this.e = true;
          b(this.h);
          a(this.h, h.class, new RippleQuoteSpan());
          return;
        }
        if (paramString2.equalsIgnoreCase("tt"))
        {
          a(this.h, n.class, new TypefaceSpan("monospace"));
          return;
        }
        if (paramString2.equalsIgnoreCase("a"))
        {
          SpannableStringBuilder localSpannableStringBuilder2 = this.h;
          int m = localSpannableStringBuilder2.length();
          Object localObject1 = a(localSpannableStringBuilder2, l.class);
          int n = localSpannableStringBuilder2.getSpanStart(localObject1);
          localSpannableStringBuilder2.removeSpan(localObject1);
          if (n == m)
            continue;
          l locall = (l)localObject1;
          if ((locall == null) || (locall.a == null))
            continue;
          if (this.j != null)
          {
            localSpannableStringBuilder2.setSpan(this.j.a(locall.a), n, m, 33);
            return;
          }
          localSpannableStringBuilder2.setSpan(new URLSpan(locall.a), n, m, 33);
          return;
        }
        if (paramString2.equalsIgnoreCase("u"))
        {
          a(this.h, r.class, new UnderlineSpan());
          return;
        }
        if (paramString2.equalsIgnoreCase("sup"))
        {
          a(this.h, q.class, new SuperscriptSpan());
          return;
        }
        if (paramString2.equalsIgnoreCase("sub"))
        {
          a(this.h, p.class, new SubscriptSpan());
          return;
        }
        if ((paramString2.length() == 2) && (Character.toLowerCase(paramString2.charAt(0)) == 'h') && (paramString2.charAt(1) >= '1') && (paramString2.charAt(1) <= '6'))
        {
          b(this.h);
          d(this.h);
          return;
        }
        if (paramString2.equalsIgnoreCase("pq"))
        {
          a(this.h, i.class, new QuoteTextSpan());
          return;
        }
        if (!paramString2.equalsIgnoreCase("li"))
          break;
        SpannableStringBuilder localSpannableStringBuilder1 = this.h;
        int k = localSpannableStringBuilder1.length();
        if ((k > 0) && (localSpannableStringBuilder1.charAt(k - 1) == '\n'))
        {
          if ((k >= 2) && (localSpannableStringBuilder1.charAt(k - 2) == '\n'))
            continue;
          localSpannableStringBuilder1.append("\n");
          return;
        }
        if (k == 0)
          continue;
        localSpannableStringBuilder1.append("\n\n");
        return;
      }
    while (!paramString2.equalsIgnoreCase("td"));
    c(this.h);
  }

  public final void endPrefixMapping(String paramString)
  {
  }

  public final void ignorableWhitespace(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
  }

  public final void processingInstruction(String paramString1, String paramString2)
  {
  }

  public final void setDocumentLocator(Locator paramLocator)
  {
  }

  public final void skippedEntity(String paramString)
  {
  }

  public final void startDocument()
  {
  }

  public final void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes)
  {
    int k = 1;
    if (!paramString2.equalsIgnoreCase("br"))
    {
      if (!paramString2.equalsIgnoreCase("p"))
        break label31;
      b(this.h);
    }
    while (true)
    {
      return;
      label31: if (paramString2.equalsIgnoreCase("div"))
      {
        a(this.h);
        return;
      }
      if (paramString2.equalsIgnoreCase("strong"))
      {
        a(this.h, new i(0));
        return;
      }
      if (paramString2.equalsIgnoreCase("b"))
      {
        a(this.h, new i(0));
        return;
      }
      if (paramString2.equalsIgnoreCase("em"))
      {
        a(this.h, new m(0));
        return;
      }
      if (paramString2.equalsIgnoreCase("cite"))
      {
        a(this.h, new m(0));
        return;
      }
      if (paramString2.equalsIgnoreCase("dfn"))
      {
        a(this.h, new m(0));
        return;
      }
      if (paramString2.equalsIgnoreCase("i"))
      {
        a(this.h, new m(0));
        return;
      }
      if (paramString2.equalsIgnoreCase("big"))
      {
        a(this.h, new g(0));
        return;
      }
      if (paramString2.equalsIgnoreCase("small"))
      {
        a(this.h, new o(0));
        return;
      }
      if (paramString2.equalsIgnoreCase("font"))
      {
        SpannableStringBuilder localSpannableStringBuilder5 = this.h;
        String str6 = paramAttributes.getValue("", "color");
        String str7 = paramAttributes.getValue("", "face");
        int i7 = localSpannableStringBuilder5.length();
        localSpannableStringBuilder5.setSpan(new j(str6, str7), i7, i7, 17);
        return;
      }
      if (paramString2.equalsIgnoreCase("blockquote"))
      {
        this.e = false;
        b(this.h);
        a(this.h, new h(0));
        return;
      }
      if (paramString2.equalsIgnoreCase("tt"))
      {
        a(this.h, new n(0));
        return;
      }
      if (paramString2.equalsIgnoreCase("a"))
      {
        SpannableStringBuilder localSpannableStringBuilder4 = this.h;
        String str5 = paramAttributes.getValue("", "href");
        int i6 = localSpannableStringBuilder4.length();
        localSpannableStringBuilder4.setSpan(new l(str5), i6, i6, 17);
        return;
      }
      if (paramString2.equalsIgnoreCase("u"))
      {
        a(this.h, new r(0));
        return;
      }
      if (paramString2.equalsIgnoreCase("sup"))
      {
        a(this.h, new q(0));
        return;
      }
      if (paramString2.equalsIgnoreCase("sub"))
      {
        a(this.h, new p(0));
        return;
      }
      if ((paramString2.length() == 2) && (Character.toLowerCase(paramString2.charAt(0)) == 'h') && (paramString2.charAt(k) >= '1') && (paramString2.charAt(k) <= '6'))
      {
        b(this.h);
        a(this.h, new k('ￏ' + paramString2.charAt(k)));
        return;
      }
      SpannableStringBuilder localSpannableStringBuilder3;
      String str1;
      String str2;
      if (paramString2.equalsIgnoreCase("img"))
      {
        localSpannableStringBuilder3 = this.h;
        str1 = paramAttributes.getValue("", "src");
        str2 = paramAttributes.getValue("", "class");
      }
      try
      {
        Object localObject3;
        if (paramAttributes.getValue("", "original-width") != null)
        {
          localObject3 = paramAttributes.getValue("", "original-width");
          Integer localInteger8 = Integer.valueOf(Integer.parseInt((String)localObject3));
          localInteger1 = localInteger8;
        }
        try
        {
          Object localObject2;
          label731: int i1;
          label765: int i5;
          if (paramAttributes.getValue("", "original-height") != null)
          {
            localObject2 = paramAttributes.getValue("", "original-height");
            Integer localInteger7 = Integer.valueOf(Integer.parseInt((String)localObject2));
            localInteger2 = localInteger7;
            if (str1 == null)
              continue;
            if (!str1.startsWith("http://res.smzdm.com/images/emotions/"))
              break label1024;
            i1 = 60;
            if (i1 <= 0)
              break label1433;
            Integer localInteger5 = Integer.valueOf(i1);
            Integer localInteger6 = Integer.valueOf(i1);
            localInteger3 = localInteger5;
            localInteger4 = localInteger6;
            if ((localInteger3 == null) || (localInteger4 == null) || (localInteger3.intValue() > 100) || (localInteger4.intValue() > 100) || (localInteger3.intValue() <= 0) || (localInteger4.intValue() <= 0))
            {
              if (TextUtils.isEmpty(str2))
                break label1067;
              String[] arrayOfString = d;
              i5 = 0;
              label854: if (i5 >= 3)
                break label1067;
              if (!arrayOfString[i5].equals(str2))
                break label1061;
            }
          }
          while (true)
          {
            if ((k == 0) || (localInteger3 == null) || (localInteger4 == null))
              break label1073;
            Resources.getSystem();
            s locals = new s(str1);
            localInteger3.intValue();
            localInteger4.intValue();
            locals.setBounds(0, 0, 100, 100);
            locals.a();
            locals.getIntrinsicHeight();
            int i4 = localSpannableStringBuilder3.length();
            localSpannableStringBuilder3.append("￼");
            localSpannableStringBuilder3.setSpan(new ImageSpan(locals, str1, 0), i4, localSpannableStringBuilder3.length(), 33);
            return;
            String str4 = paramAttributes.getValue("", "width");
            localObject3 = str4;
            break;
            String str3 = paramAttributes.getValue("", "height");
            localObject2 = str3;
            break label731;
            label1024: if ((str1.startsWith(".zhimg.com/", 11)) && (str1.endsWith("_is.jpg")))
            {
              i1 = 40;
              break label765;
            }
            i1 = 0;
            break label765;
            label1061: i5++;
            break label854;
            label1067: k = 0;
          }
          label1073: e(this.h);
          b localb = new b();
          localb.a(str1);
          int i2;
          int i3;
          if (localInteger4 == null)
          {
            i2 = 0;
            localb.b(i2);
            i3 = 0;
            if (localInteger3 != null)
              break label1161;
          }
          while (true)
          {
            localb.a(i3);
            this.i.add(localb);
            this.h = new SpannableStringBuilder();
            return;
            i2 = localInteger4.intValue();
            break;
            label1161: i3 = localInteger3.intValue();
          }
          if (paramString2.equalsIgnoreCase("video"))
          {
            a(paramAttributes);
            return;
          }
          if (paramString2.equalsIgnoreCase("source"))
          {
            if (this.i.isEmpty())
              continue;
            Object localObject1 = this.i.get(-1 + this.i.size());
            if (!(localObject1 instanceof d))
              continue;
            ((d)localObject1).a(paramAttributes.getValue("", "src"));
            return;
          }
          if (paramString2.equalsIgnoreCase("pq"))
          {
            a(this.h, new i(0));
            return;
          }
          if (paramString2.equalsIgnoreCase("li"))
          {
            this.h.append("● ");
            return;
          }
          if (paramString2.equalsIgnoreCase("tr"))
          {
            SpannableStringBuilder localSpannableStringBuilder2 = this.h;
            int n = localSpannableStringBuilder2.length();
            if (((n > 0) && (localSpannableStringBuilder2.charAt(n - 1) == '\n')) || (n == 0))
              continue;
            localSpannableStringBuilder2.append("\n");
            return;
          }
          if (!paramString2.equalsIgnoreCase("td"))
            continue;
          SpannableStringBuilder localSpannableStringBuilder1 = this.h;
          int m = localSpannableStringBuilder1.length();
          if ((m <= 0) || (localSpannableStringBuilder1.charAt(m - 1) != '\n'))
            continue;
          localSpannableStringBuilder1.append("@@@@");
          return;
        }
        catch (Exception localException2)
        {
          while (true)
            localInteger2 = null;
        }
      }
      catch (Exception localException1)
      {
        while (true)
        {
          Integer localInteger2;
          Integer localInteger1 = null;
          continue;
          label1433: Integer localInteger3 = localInteger1;
          Integer localInteger4 = localInteger2;
        }
      }
    }
  }

  public final void startPrefixMapping(String paramString1, String paramString2)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.html.f
 * JD-Core Version:    0.6.0
 */