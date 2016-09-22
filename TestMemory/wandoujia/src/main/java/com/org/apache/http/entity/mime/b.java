package com.org.apache.http.entity.mime;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class b
  implements Iterable<f>
{
  private final List<f> a = new LinkedList();
  private final Map<String, List<f>> b = new HashMap();

  public final f a(String paramString)
  {
    String str = paramString.toLowerCase(Locale.US);
    List localList = (List)this.b.get(str);
    if ((localList != null) && (!localList.isEmpty()))
      return (f)localList.get(0);
    return null;
  }

  public final void a(f paramf)
  {
    String str = paramf.a().toLowerCase(Locale.US);
    Object localObject = (List)this.b.get(str);
    if (localObject == null)
    {
      localObject = new LinkedList();
      this.b.put(str, localObject);
    }
    ((List)localObject).add(paramf);
    this.a.add(paramf);
  }

  public final Iterator<f> iterator()
  {
    return Collections.unmodifiableList(this.a).iterator();
  }

  public final String toString()
  {
    return this.a.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.org.apache.http.entity.mime.b
 * JD-Core Version:    0.6.0
 */