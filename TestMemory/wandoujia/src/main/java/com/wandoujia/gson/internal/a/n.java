package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.b;
import com.wandoujia.gson.c;
import com.wandoujia.gson.internal..Gson.Types;
import com.wandoujia.gson.internal.y;
import com.wandoujia.gson.u;
import com.wandoujia.gson.v;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

public final class n
  implements v
{
  private final com.wandoujia.gson.internal.a a;
  private final b b;
  private final com.wandoujia.gson.internal.n c;

  public n(com.wandoujia.gson.internal.a parama, b paramb, com.wandoujia.gson.internal.n paramn)
  {
    this.a = parama;
    this.b = paramb;
    this.c = paramn;
  }

  private Map<String, q> a(c paramc, com.wandoujia.gson.b.a<?> parama, Class<?> paramClass)
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    if (paramClass.isInterface())
      return localLinkedHashMap;
    Type localType1 = parama.getType();
    while (paramClass != Object.class)
    {
      for (Field localField : paramClass.getDeclaredFields())
      {
        boolean bool1 = a(localField, true);
        boolean bool2 = a(localField, false);
        if ((!bool1) && (!bool2))
          continue;
        localField.setAccessible(true);
        Type localType4 = parama.getType();
        Type localType5 = localField.getGenericType();
        Type localType6 = .Gson.Types.a(localType4, paramClass, localType5);
        com.wandoujia.gson.a.a locala = (com.wandoujia.gson.a.a)localField.getAnnotation(com.wandoujia.gson.a.a.class);
        if (locala == null);
        for (String str = this.b.translateName(localField); ; str = locala.a())
        {
          com.wandoujia.gson.b.a locala1 = com.wandoujia.gson.b.a.get(localType6);
          o localo = new o(str, bool1, bool2, paramc, locala1, localField, y.a(locala1.getRawType()));
          q localq = (q)localLinkedHashMap.put(localo.a, localo);
          if (localq == null)
            break;
          throw new IllegalArgumentException(localType1 + " declares multiple JSON fields named " + localq.a);
        }
      }
      Type localType2 = parama.getType();
      Type localType3 = paramClass.getGenericSuperclass();
      parama = com.wandoujia.gson.b.a.get(.Gson.Types.a(localType2, paramClass, localType3));
      paramClass = parama.getRawType();
    }
    return localLinkedHashMap;
  }

  private boolean a(Field paramField, boolean paramBoolean)
  {
    return (!this.c.a(paramField.getType(), paramBoolean)) && (!this.c.a(paramField, paramBoolean));
  }

  public final <T> u<T> a(c paramc, com.wandoujia.gson.b.a<T> parama)
  {
    Class localClass = parama.getRawType();
    if (!Object.class.isAssignableFrom(localClass))
      return null;
    return new p(this.a.a(parama), a(paramc, parama, localClass), 0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.n
 * JD-Core Version:    0.6.0
 */