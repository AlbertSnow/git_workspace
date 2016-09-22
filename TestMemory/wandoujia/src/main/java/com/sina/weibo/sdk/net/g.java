package com.sina.weibo.sdk.net;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public final class g
{
  private LinkedHashMap<String, Object> a = new LinkedHashMap();
  private String b;

  public g(String paramString)
  {
    this.b = paramString;
  }

  public final Object a(String paramString)
  {
    return this.a.get(paramString);
  }

  public final String a()
  {
    return this.b;
  }

  public final void a(String paramString1, String paramString2)
  {
    this.a.put(paramString1, paramString2);
  }

  public final Set<String> b()
  {
    return this.a.keySet();
  }

  public final void b(String paramString)
  {
    if (this.a.containsKey(paramString))
    {
      this.a.remove(paramString);
      this.a.remove(this.a.get(paramString));
    }
  }

  public final String c()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = this.a.keySet().iterator();
    int j;
    for (int i = 1; ; i = j)
      while (true)
      {
        if (!localIterator.hasNext())
          return localStringBuilder.toString();
        String str1 = (String)localIterator.next();
        String str2;
        if (i != 0)
        {
          j = 0;
          Object localObject = this.a.get(str1);
          if ((localObject instanceof String))
          {
            str2 = (String)localObject;
            if (TextUtils.isEmpty(str2));
          }
        }
        else
        {
          try
          {
            localStringBuilder.append(URLEncoder.encode(str1, "UTF-8") + "=" + URLEncoder.encode(str2, "UTF-8"));
            i = j;
            continue;
            localStringBuilder.append("&");
            j = i;
          }
          catch (UnsupportedEncodingException localUnsupportedEncodingException)
          {
          }
        }
      }
  }

  public final boolean d()
  {
    Iterator localIterator = this.a.keySet().iterator();
    Object localObject;
    do
    {
      if (!localIterator.hasNext())
        return false;
      String str = (String)localIterator.next();
      localObject = this.a.get(str);
    }
    while ((!(localObject instanceof ByteArrayOutputStream)) && (!(localObject instanceof Bitmap)));
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.net.g
 * JD-Core Version:    0.6.0
 */