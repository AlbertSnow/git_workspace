package com.google.android.ads.tasks;

import dalvik.system.DexClassLoader;
import hc;
import hd;
import hf;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class p
{
  private final hf a;
  private final String b;
  private final String c;
  private volatile Method d = null;
  private List e;
  private CountDownLatch f = new CountDownLatch(1);

  static
  {
    p.class.getSimpleName();
  }

  public p(hf paramhf, String paramString1, String paramString2, List paramList)
  {
    this.a = paramhf;
    this.b = paramString1;
    this.c = paramString2;
    this.e = new ArrayList(paramList);
    this.a.b.submit(new q(this));
  }

  private final String a(byte[] paramArrayOfByte, String paramString)
  {
    return new String(this.a.d.a(paramArrayOfByte, paramString), "UTF-8");
  }

  final void a()
  {
    try
    {
      Class localClass = this.a.c.loadClass(a(this.a.e, this.b));
      if (localClass == null)
        return;
      this.d = localClass.getMethod(a(this.a.e, this.c), (Class[])this.e.toArray(new Class[this.e.size()]));
      Method localMethod = this.d;
      if (localMethod == null)
        return;
      return;
    }
    catch (hd localhd)
    {
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
      return;
    }
    finally
    {
      this.f.countDown();
    }
    throw localObject;
  }

  public final Method b()
  {
    Method localMethod1;
    if (this.d != null)
      localMethod1 = this.d;
    while (true)
    {
      return localMethod1;
      try
      {
        boolean bool = this.f.await(2L, TimeUnit.SECONDS);
        localMethod1 = null;
        if (!bool)
          continue;
        Method localMethod2 = this.d;
        return localMethod2;
      }
      catch (InterruptedException localInterruptedException)
      {
      }
    }
    return null;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.ads.tasks.p
 * JD-Core Version:    0.6.0
 */