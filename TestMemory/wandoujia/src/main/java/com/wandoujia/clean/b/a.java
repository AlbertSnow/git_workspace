package com.wandoujia.clean.b;

import com.wandoujia.base.storage.StorageManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

public final class a
{
  private Header[] a = null;
  private String b = null;
  private String c = null;

  public static String a(String paramString)
  {
    Iterator localIterator = StorageManager.getInstance().getExternalStorageDirectories().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!paramString.startsWith(str))
        continue;
      paramString = paramString.substring(str.length());
    }
    return paramString;
  }

  public final ArrayList a()
  {
    ArrayList localArrayList;
    if ((this.a == null) || (this.a.length == 0))
      localArrayList = null;
    while (true)
    {
      return localArrayList;
      localArrayList = new ArrayList();
      for (Header localHeader : this.a)
        localArrayList.add(new BasicHeader(localHeader.getName(), localHeader.getValue()));
    }
  }

  public final void a(Header[] paramArrayOfHeader)
  {
    this.a = paramArrayOfHeader;
  }

  public final String b()
  {
    return this.b;
  }

  public final void b(String paramString)
  {
    this.b = paramString;
  }

  public final String c()
  {
    return this.c;
  }

  public final void c(String paramString)
  {
    this.c = paramString;
  }

  public final void d()
  {
    this.c = null;
    this.b = null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.b.a
 * JD-Core Version:    0.6.0
 */