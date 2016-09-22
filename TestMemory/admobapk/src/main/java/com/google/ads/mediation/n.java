package com.google.ads.mediation;

import com.google.android.gms.ads.internal.util.client.e;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@Deprecated
public class n
{
  public final void a(Map paramMap)
  {
    HashMap localHashMap = new HashMap();
    for (Field localField3 : getClass().getFields())
    {
      p localp = (p)localField3.getAnnotation(p.class);
      if (localp == null)
        continue;
      localHashMap.put(localp.a(), localField3);
    }
    if (localHashMap.isEmpty())
      e.e("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
    Iterator localIterator1 = paramMap.entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator1.next();
      Field localField2 = (Field)localHashMap.remove(localEntry.getKey());
      if (localField2 != null)
      {
        try
        {
          localField2.set(this, localEntry.getValue());
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          String str8 = (String)localEntry.getKey();
          e.e(49 + String.valueOf(str8).length() + "Server option \"" + str8 + "\" could not be set: Illegal Access");
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          String str7 = (String)localEntry.getKey();
          e.e(43 + String.valueOf(str7).length() + "Server option \"" + str7 + "\" could not be set: Bad Type");
        }
        continue;
      }
      String str5 = (String)localEntry.getKey();
      String str6 = (String)localEntry.getValue();
      e.b(31 + String.valueOf(str5).length() + String.valueOf(str6).length() + "Unexpected server option: " + str5 + " = \"" + str6 + "\"");
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator2 = localHashMap.values().iterator();
    while (localIterator2.hasNext())
    {
      Field localField1 = (Field)localIterator2.next();
      if (!((p)localField1.getAnnotation(p.class)).b())
        continue;
      String str3 = String.valueOf(((p)localField1.getAnnotation(p.class)).a());
      if (str3.length() != 0);
      for (String str4 = "Required server option missing: ".concat(str3); ; str4 = new String("Required server option missing: "))
      {
        e.e(str4);
        if (localStringBuilder.length() > 0)
          localStringBuilder.append(", ");
        localStringBuilder.append(((p)localField1.getAnnotation(p.class)).a());
        break;
      }
    }
    if (localStringBuilder.length() > 0)
    {
      String str1 = String.valueOf(localStringBuilder.toString());
      if (str1.length() != 0);
      for (String str2 = "Required server option(s) missing: ".concat(str1); ; str2 = new String("Required server option(s) missing: "))
        throw new o(str2);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.n
 * JD-Core Version:    0.6.0
 */