package com.google.android.gms.common.server.response;

import android.support.v4.app.b;
import android.support.v4.app.d;
import com.google.android.gms.internal.t;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class FastJsonResponse
{
  private Object a(FastJsonResponse.Field paramField)
  {
    String str1 = paramField.f();
    if (paramField.h() != null)
    {
      paramField.f();
      boolean bool;
      if (b() == null)
        bool = true;
      while (true)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = paramField.f();
        d.a(bool, "Concrete field shouldn't be value object: %s", arrayOfObject);
        paramField.e();
        try
        {
          String str2 = "get" + Character.toUpperCase(str1.charAt(0)) + str1.substring(1);
          Object localObject = getClass().getMethod(str2, new Class[0]).invoke(this, new Object[0]);
          return localObject;
          bool = false;
        }
        catch (Exception localException)
        {
          throw new RuntimeException(localException);
        }
      }
    }
    paramField.f();
    return b();
  }

  protected static <O, I> I a(FastJsonResponse.Field<I, O> paramField, Object paramObject)
  {
    if (FastJsonResponse.Field.a(paramField) != null)
      paramObject = paramField.a(paramObject);
    return paramObject;
  }

  private static void a(StringBuilder paramStringBuilder, FastJsonResponse.Field paramField, Object paramObject)
  {
    if (paramField.b() == 11)
    {
      paramStringBuilder.append(((FastJsonResponse)paramField.h().cast(paramObject)).toString());
      return;
    }
    if (paramField.b() == 7)
    {
      paramStringBuilder.append("\"");
      paramStringBuilder.append(t.a((String)paramObject));
      paramStringBuilder.append("\"");
      return;
    }
    paramStringBuilder.append(paramObject);
  }

  private static void a(StringBuilder paramStringBuilder, FastJsonResponse.Field paramField, ArrayList<Object> paramArrayList)
  {
    paramStringBuilder.append("[");
    int i = 0;
    int j = paramArrayList.size();
    while (i < j)
    {
      if (i > 0)
        paramStringBuilder.append(",");
      Object localObject = paramArrayList.get(i);
      if (localObject != null)
        a(paramStringBuilder, paramField, localObject);
      i++;
    }
    paramStringBuilder.append("]");
  }

  public abstract Map<String, FastJsonResponse.Field<?, ?>> a();

  protected abstract Object b();

  protected abstract boolean c();

  public String toString()
  {
    Map localMap = a();
    StringBuilder localStringBuilder = new StringBuilder(100);
    Iterator localIterator = localMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      FastJsonResponse.Field localField = (FastJsonResponse.Field)localMap.get(str);
      if (localField.d() == 11)
      {
        if (localField.e())
        {
          localField.f();
          throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        localField.f();
        throw new UnsupportedOperationException("Concrete types not supported");
      }
      localField.f();
      if (!c())
        continue;
      Object localObject = a(localField, a(localField));
      if (localStringBuilder.length() == 0)
        localStringBuilder.append("{");
      while (true)
      {
        localStringBuilder.append("\"").append(str).append("\":");
        if (localObject != null)
          break label192;
        localStringBuilder.append("null");
        break;
        localStringBuilder.append(",");
      }
      label192: switch (localField.d())
      {
      default:
        if (localField.c())
          a(localStringBuilder, localField, (ArrayList)localObject);
        break;
      case 8:
        localStringBuilder.append("\"").append(b.b((byte[])localObject)).append("\"");
        break;
      case 9:
        localStringBuilder.append("\"").append(b.c((byte[])localObject)).append("\"");
        break;
      case 10:
        b.a(localStringBuilder, (HashMap)localObject);
        continue;
        a(localStringBuilder, localField, localObject);
      }
    }
    if (localStringBuilder.length() > 0)
      localStringBuilder.append("}");
    while (true)
    {
      return localStringBuilder.toString();
      localStringBuilder.append("{}");
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.server.response.FastJsonResponse
 * JD-Core Version:    0.6.0
 */