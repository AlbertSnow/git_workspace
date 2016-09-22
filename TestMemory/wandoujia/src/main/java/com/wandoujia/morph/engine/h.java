package com.wandoujia.morph.engine;

import java.util.HashMap;
import java.util.Map;

public final class h
{
  private static Map<String, MoWidgetType> a = new HashMap();
  private static Map<String, i> b = new HashMap();
  private static Map<String, MoAttrType> c = new HashMap();
  private Map<String, Integer> d;
  private Map<String, String> e;

  public h()
  {
    new HashMap();
    this.d = new HashMap();
    this.e = new HashMap();
  }

  public static MoWidgetType a(String paramString)
  {
    return (MoWidgetType)a.get(paramString);
  }

  public static void a()
  {
    int i = 0;
    for (MoWidgetType localMoWidgetType : MoWidgetType.values())
      a.put(localMoWidgetType.name(), localMoWidgetType);
    MoAttrType[] arrayOfMoAttrType = MoAttrType.values();
    int m = arrayOfMoAttrType.length;
    while (i < m)
    {
      MoAttrType localMoAttrType = arrayOfMoAttrType[i];
      c.put(localMoAttrType.name(), localMoAttrType);
      i++;
    }
  }

  public static void a(String paramString, i parami)
  {
    b.put(paramString, parami);
  }

  public static MoAttrType b(String paramString)
  {
    return (MoAttrType)c.get(paramString);
  }

  public static MoWidgetType b()
  {
    return null;
  }

  public static i c(String paramString)
  {
    return (i)b.get(paramString);
  }

  public final void a(String paramString, int paramInt)
  {
    this.d.put(paramString, Integer.valueOf(paramInt));
  }

  public final void a(String paramString1, String paramString2)
  {
    this.e.put(paramString1, paramString2);
  }

  public final Integer d(String paramString)
  {
    return (Integer)this.d.get(paramString);
  }

  public final String e(String paramString)
  {
    return (String)this.e.get(paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.morph.engine.h
 * JD-Core Version:    0.6.0
 */