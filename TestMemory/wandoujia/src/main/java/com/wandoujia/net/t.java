package com.wandoujia.net;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class t
{
  private Multimap a = new Headers.1(this);

  private StringBuilder a()
  {
    StringBuilder localStringBuilder = new StringBuilder(256);
    Iterator localIterator1 = this.a.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str1 = (String)localIterator1.next();
      TaggedList localTaggedList = (TaggedList)this.a.get(str1);
      Iterator localIterator2 = localTaggedList.iterator();
      while (localIterator2.hasNext())
      {
        String str2 = (String)localIterator2.next();
        localStringBuilder.append((String)localTaggedList.tag()).append(": ").append(str2).append("\r\n");
      }
    }
    localStringBuilder.append("\r\n");
    return localStringBuilder;
  }

  private t b(String paramString1, String paramString2)
  {
    String str = paramString1.toLowerCase();
    this.a.add(str, paramString2);
    ((TaggedList)this.a.get(str)).tagNull(paramString1);
    return this;
  }

  public final t a(String paramString1, String paramString2)
  {
    String str = paramString1.toLowerCase();
    this.a.put(str, paramString2);
    ((TaggedList)this.a.get(str)).tagNull(paramString1);
    return this;
  }

  public final String a(String paramString)
  {
    return this.a.getString(paramString.toLowerCase());
  }

  public final t b(String paramString)
  {
    String[] arrayOfString;
    if (paramString != null)
    {
      arrayOfString = paramString.trim().split(":", 2);
      if (arrayOfString.length == 2)
        b(arrayOfString[0].trim(), arrayOfString[1].trim());
    }
    else
    {
      return this;
    }
    b(arrayOfString[0].trim(), "");
    return this;
  }

  public final String c(String paramString)
  {
    String str = paramString.toLowerCase();
    List localList = (List)this.a.remove(str.toLowerCase());
    if ((localList == null) || (localList.size() == 0))
      return null;
    return (String)localList.get(0);
  }

  public final String d(String paramString)
  {
    return a().insert(0, paramString + "\r\n").toString();
  }

  public final String toString()
  {
    return a().toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.t
 * JD-Core Version:    0.6.0
 */