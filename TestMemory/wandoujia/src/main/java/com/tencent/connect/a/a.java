package com.tencent.connect.a;

import android.content.Context;
import com.tencent.connect.b.c;
import com.tencent.open.utils.i;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class a
{
  private static Class<?> a = null;
  private static Class<?> b = null;
  private static Method c = null;
  private static Method d = null;
  private static boolean e = false;

  public static void a(Context paramContext, c paramc)
  {
    String str1 = paramc.b();
    String str2 = "Aqc" + str1;
    try
    {
      a = Class.forName("com.tencent.stat.StatConfig");
      Class localClass1 = Class.forName("com.tencent.stat.StatService");
      b = localClass1;
      localClass1.getMethod("reportQQ", new Class[] { Context.class, String.class });
      c = b.getMethod("trackCustomEvent", new Class[] { Context.class, String.class, [Ljava.lang.String.class });
      Class localClass2 = b;
      Class[] arrayOfClass1 = new Class[2];
      arrayOfClass1[0] = Context.class;
      arrayOfClass1[1] = Integer.TYPE;
      localClass2.getMethod("commitEvents", arrayOfClass1);
      Class localClass3 = a;
      Class[] arrayOfClass2 = new Class[1];
      arrayOfClass2[0] = Boolean.TYPE;
      d = localClass3.getMethod("setEnableStatService", arrayOfClass2);
      b(paramContext, paramc);
      Class localClass4 = a;
      Class[] arrayOfClass3 = new Class[1];
      arrayOfClass3[0] = Boolean.TYPE;
      Method localMethod1 = localClass4.getMethod("setAutoExceptionCaught", arrayOfClass3);
      Class localClass5 = a;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Boolean.valueOf(false);
      localMethod1.invoke(localClass5, arrayOfObject1);
      Class localClass6 = a;
      Class[] arrayOfClass4 = new Class[1];
      arrayOfClass4[0] = Boolean.TYPE;
      Method localMethod2 = localClass6.getMethod("setEnableSmartReporting", arrayOfClass4);
      Class localClass7 = a;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Boolean.valueOf(true);
      localMethod2.invoke(localClass7, arrayOfObject2);
      Class localClass8 = a;
      Class[] arrayOfClass5 = new Class[1];
      arrayOfClass5[0] = Integer.TYPE;
      Method localMethod3 = localClass8.getMethod("setSendPeriodMinutes", arrayOfClass5);
      Class localClass9 = a;
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(1440);
      localMethod3.invoke(localClass9, arrayOfObject3);
      Class localClass10 = Class.forName("com.tencent.stat.StatReportStrategy");
      Method localMethod4 = a.getMethod("setStatSendStrategy", new Class[] { localClass10 });
      Class localClass11 = a;
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = localClass10.getField("PERIOD").get(null);
      localMethod4.invoke(localClass11, arrayOfObject4);
      Method localMethod5 = b.getMethod("startStatService", new Class[] { Context.class, String.class, String.class });
      Class localClass12 = b;
      Object[] arrayOfObject5 = new Object[3];
      arrayOfObject5[0] = paramContext;
      arrayOfObject5[1] = str2;
      arrayOfObject5[2] = Class.forName("com.tencent.stat.common.StatConstants").getField("VERSION").get(null);
      localMethod5.invoke(localClass12, arrayOfObject5);
      e = true;
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static void a(Context paramContext, c paramc, String paramString, String[] paramArrayOfString)
  {
    if (!e)
      return;
    b(paramContext, paramc);
    try
    {
      c.invoke(b, new Object[] { paramContext, paramString, paramArrayOfString });
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private static void b(Context paramContext, c paramc)
  {
    try
    {
      if (i.a(paramContext, paramc.b()).b("Common_ta_enable"))
      {
        Method localMethod2 = d;
        Class localClass2 = a;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Boolean.valueOf(true);
        localMethod2.invoke(localClass2, arrayOfObject2);
        return;
      }
      Method localMethod1 = d;
      Class localClass1 = a;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Boolean.valueOf(false);
      localMethod1.invoke(localClass1, arrayOfObject1);
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.a.a
 * JD-Core Version:    0.6.0
 */