package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.a.a;
import com.wandoujia.gson.u;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

final class be<T extends Enum<T>> extends u<T>
{
  private final Map<String, T> a = new HashMap();
  private final Map<T, String> b = new HashMap();

  public be(Class<T> paramClass)
  {
    while (true)
    {
      String str1;
      try
      {
        Enum[] arrayOfEnum = (Enum[])paramClass.getEnumConstants();
        int i = arrayOfEnum.length;
        int j = 0;
        if (j < i)
        {
          Enum localEnum = arrayOfEnum[j];
          str1 = localEnum.name();
          a locala = (a)paramClass.getField(str1).getAnnotation(a.class);
          if (locala == null)
            break label135;
          str2 = locala.a();
          this.a.put(str2, localEnum);
          this.b.put(localEnum, str2);
          j++;
          continue;
        }
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        throw new AssertionError();
      }
      return;
      label135: String str2 = str1;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.be
 * JD-Core Version:    0.6.0
 */