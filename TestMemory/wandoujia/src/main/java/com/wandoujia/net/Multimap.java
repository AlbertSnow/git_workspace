package com.wandoujia.net;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class Multimap extends LinkedHashMap<String, List<String>>
  implements Iterable<NameValuePair>
{
  private static final ab QUERY_DECODER = new z();
  private static final ab URL_DECODER = new aa();

  public Multimap()
  {
  }

  public Multimap(Multimap paramMultimap)
  {
    putAll(paramMultimap);
  }

  public Multimap(List<NameValuePair> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      NameValuePair localNameValuePair = (NameValuePair)localIterator.next();
      add(localNameValuePair.getName(), localNameValuePair.getValue());
    }
  }

  public static Multimap parse(String paramString1, String paramString2, boolean paramBoolean, ab paramab)
  {
    Multimap localMultimap = new Multimap();
    if (paramString1 == null)
      return localMultimap;
    String[] arrayOfString1 = paramString1.split(paramString2);
    int i = arrayOfString1.length;
    for (int j = 0; j < i; j++)
    {
      String[] arrayOfString2 = arrayOfString1[j].split("=", 2);
      String str1 = arrayOfString2[0].trim();
      int k = arrayOfString2.length;
      String str2 = null;
      if (k > 1)
        str2 = arrayOfString2[1];
      if ((paramBoolean) && (str2 != null) && (str2.endsWith("\"")) && (str2.startsWith("\"")))
        str2 = str2.substring(1, -1 + str2.length());
      if (paramab != null)
      {
        str1 = paramab.a(str1);
        str2 = paramab.a(str2);
      }
      localMultimap.add(str1, str2);
    }
    return localMultimap;
  }

  public static Multimap parseCommaDelimited(String paramString)
  {
    return parse(paramString, ",", true, null);
  }

  public static Multimap parseQuery(String paramString)
  {
    return parse(paramString, "&", false, QUERY_DECODER);
  }

  public static Multimap parseSemicolonDelimited(String paramString)
  {
    return parse(paramString, ";", true, null);
  }

  public static Multimap parseUrlEncoded(String paramString)
  {
    return parse(paramString, "&", false, URL_DECODER);
  }

  public void add(String paramString1, String paramString2)
  {
    List localList = (List)get(paramString1);
    if (localList == null)
    {
      localList = newList();
      put(paramString1, localList);
    }
    localList.add(paramString2);
  }

  public String getString(String paramString)
  {
    List localList = (List)get(paramString);
    if ((localList == null) || (localList.size() == 0))
      return null;
    return (String)localList.get(0);
  }

  public Iterator<NameValuePair> iterator()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str = (String)localIterator1.next();
      Iterator localIterator2 = ((List)get(str)).iterator();
      while (localIterator2.hasNext())
        localArrayList.add(new BasicNameValuePair(str, (String)localIterator2.next()));
    }
    return localArrayList.iterator();
  }

  protected List<String> newList()
  {
    return new ArrayList();
  }

  public void put(String paramString1, String paramString2)
  {
    List localList = newList();
    localList.add(paramString2);
    put(paramString1, localList);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.Multimap
 * JD-Core Version:    0.6.0
 */