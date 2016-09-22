package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.gmsg.t;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

@a
public final class am
  implements al
{
  private final ak a;
  private final HashSet b;

  public am(ak paramak)
  {
    this.a = paramak;
    this.b = new HashSet();
  }

  public final void a()
  {
    Iterator localIterator = this.b.iterator();
    if (localIterator.hasNext())
    {
      AbstractMap.SimpleEntry localSimpleEntry = (AbstractMap.SimpleEntry)localIterator.next();
      String str1 = String.valueOf(((t)localSimpleEntry.getValue()).toString());
      if (str1.length() != 0);
      for (String str2 = "Unregistering eventhandler: ".concat(str1); ; str2 = new String("Unregistering eventhandler: "))
      {
        c.a(str2);
        this.a.b((String)localSimpleEntry.getKey(), (t)localSimpleEntry.getValue());
        break;
      }
    }
    this.b.clear();
  }

  public final void a(String paramString, t paramt)
  {
    this.a.a(paramString, paramt);
    this.b.add(new AbstractMap.SimpleEntry(paramString, paramt));
  }

  public final void a(String paramString1, String paramString2)
  {
    this.a.a(paramString1, paramString2);
  }

  public final void a(String paramString, JSONObject paramJSONObject)
  {
    this.a.a(paramString, paramJSONObject);
  }

  public final void b(String paramString, t paramt)
  {
    this.a.b(paramString, paramt);
    this.b.remove(new AbstractMap.SimpleEntry(paramString, paramt));
  }

  public final void b(String paramString, JSONObject paramJSONObject)
  {
    this.a.b(paramString, paramJSONObject);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.js.am
 * JD-Core Version:    0.6.0
 */