package com.wandoujia.morph.engine;

import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class i
{
  private MoWidgetType a;
  private MoWidgetType b;
  private Map<MoStyleable, a> c;
  private List<j> d;
  private List<i> e;

  static
  {
    i.class.getSimpleName();
  }

  public i(MoWidgetType paramMoWidgetType, XmlPullParser paramXmlPullParser)
  {
    this.a = paramMoWidgetType;
    a(paramXmlPullParser);
  }

  private void a(MoStyleable paramMoStyleable, MoAttrType paramMoAttrType, Object paramObject)
  {
    if (paramObject == null)
      return;
    g localg = new g();
    localg.a = paramMoStyleable;
    localg.b = paramMoAttrType;
    localg.c = paramObject;
    a(localg);
  }

  private void a(g paramg)
  {
    if (this.c == null)
      this.c = new HashMap();
    a locala = (a)this.c.get(paramg.a);
    if (locala == null)
    {
      locala = new a();
      this.c.put(paramg.a, locala);
    }
    locala.a(paramg.b, paramg.c);
  }

  private void a(XmlPullParser paramXmlPullParser)
  {
    try
    {
      while (true)
      {
        int i;
        int n;
        try
        {
          i = paramXmlPullParser.getEventType();
          int j = -1;
          break label409;
          i = paramXmlPullParser.next();
          break label409;
          if (j >= 0)
            continue;
          int k = paramXmlPullParser.getDepth();
          String str1 = paramXmlPullParser.getName();
          com.wandoujia.morph.a.a();
          this.b = h.a(str1);
          AttributeSet localAttributeSet = Xml.asAttributeSet(paramXmlPullParser);
          MoWidgetType localMoWidgetType1 = this.b;
          MoWidgetType localMoWidgetType2 = MoWidgetType.MorphCommonView;
          MoWidgetType localMoWidgetType3 = null;
          if (localMoWidgetType1 != localMoWidgetType2)
            continue;
          String str2 = localAttributeSet.getAttributeValue("Morph Common View", MoAttrType.baseWidgetType.name());
          com.wandoujia.morph.a.a();
          localMoWidgetType3 = h.a(str2);
          a(MoStyleable.MorphCommonView, MoAttrType.baseWidgetType, localMoWidgetType3);
          String str3 = localAttributeSet.getAttributeValue("Morph Common View", MoAttrType.className.name());
          a(MoStyleable.MorphCommonView, MoAttrType.className, str3);
          new StringBuilder("START_TAG: ").append(str1).append(", type: ").append(this.b);
          if (this.b == null)
            continue;
          int m = localAttributeSet.getAttributeCount();
          n = 0;
          if (n >= m)
            continue;
          String str4 = localAttributeSet.getAttributeName(n);
          String str5 = localAttributeSet.getAttributeValue(n);
          if (localMoWidgetType3 == null)
            continue;
          MoWidgetType localMoWidgetType4 = localMoWidgetType3;
          g localg = e.a(this.a, localMoWidgetType4, str4, str5);
          if ((localg.a == null) || (localg.b == null))
            continue;
          a(localg);
          break label455;
          localMoWidgetType4 = this.b;
          continue;
          j localj = new j(str4, str5);
          if (this.d != null)
            continue;
          this.d = new ArrayList();
          this.d.add(localj);
          break label455;
          i = paramXmlPullParser.next();
          j = k;
          break label409;
          if (paramXmlPullParser.getDepth() <= j)
            break;
          i locali = new i(this.b, paramXmlPullParser);
          if (this.e != null)
            continue;
          this.e = new ArrayList();
          this.e.add(locali);
        }
        catch (IOException localIOException)
        {
          return;
        }
        label409: 
        while (i != 1)
          switch (i)
          {
          case 0:
          case 3:
          case 4:
          case 2:
          case 1:
          }
        label455: n++;
      }
    }
    catch (XmlPullParserException localXmlPullParserException)
    {
    }
  }

  public final MoWidgetType a()
  {
    return this.b;
  }

  public final a a(MoStyleable paramMoStyleable)
  {
    if (this.c == null)
      return null;
    return (a)this.c.get(paramMoStyleable);
  }

  public final i a(int paramInt)
  {
    if ((this.e != null) && (paramInt >= 0) && (paramInt < this.e.size()))
      return (i)this.e.get(paramInt);
    return null;
  }

  public final String a(String paramString)
  {
    if (this.d != null)
    {
      Iterator localIterator = this.d.iterator();
      while (localIterator.hasNext())
      {
        j localj = (j)localIterator.next();
        if (localj.a.equals(paramString))
          return localj.b;
      }
    }
    return null;
  }

  public final int b()
  {
    if (this.e == null)
      return 0;
    return this.e.size();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.morph.engine.i
 * JD-Core Version:    0.6.0
 */