package com.wandoujia.p4.c;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.rpc.http.exception.HttpExceptionUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

public abstract class a<T>
{
  private Handler a = new Handler(Looper.getMainLooper());
  private final Set<String> b = new HashSet();
  private final Set<Runnable> c = new HashSet();

  private static String a(String paramString, Class<? extends a> paramClass)
  {
    if (TextUtils.isEmpty(paramString))
      return null;
    return paramClass.getName() + '*' + paramString;
  }

  private h<T> b()
  {
    String str = a(a(), getClass());
    if (str != null)
      return i.a(str);
    return null;
  }

  private List<T> c(int paramInt1, int paramInt2)
  {
    int i = 3;
    int j = i - 1;
    if (i > 0);
    while (true)
    {
      h localh;
      int k;
      try
      {
        List localList2 = a(paramInt1, paramInt2);
        localList1 = localList2;
        localh = b();
        if (localh == null)
          break label194;
        k = 0;
        if (k >= paramInt2)
          break label194;
        if ((localList1 == null) || (k >= localList1.size()))
          break label166;
        localObject = localList1.get(k);
        if (localObject == null)
          break label172;
        localh.a(paramInt1 + k, new WeakReference(localObject));
        k++;
        continue;
      }
      catch (ExecutionException localExecutionException)
      {
        while (true)
        {
          if ((!HttpExceptionUtils.canRetry(localExecutionException)) || (j <= 0))
            break label149;
          long l = 1000L * (1 << -1 + (3 - j));
          try
          {
            Thread.sleep(l);
            i = j;
          }
          catch (InterruptedException localInterruptedException)
          {
            i = j;
          }
        }
        break;
        label149: if (HttpExceptionUtils.is404NotFound(localExecutionException))
          continue;
        throw localExecutionException;
        i = j;
      }
      break;
      label166: Object localObject = null;
      continue;
      label172: if (k < localh.a())
      {
        localh.a(paramInt1 + k);
        continue;
      }
      label194: return localList1;
      List localList1 = null;
    }
  }

  private List<T> e(int paramInt1, int paramInt2)
  {
    h localh = b();
    ArrayList localArrayList = new ArrayList();
    if (localh == null);
    label69: 
    while (true)
    {
      return localArrayList;
      int i = paramInt1 + paramInt2;
      if (i < 0)
        i = localh.a();
      while (true)
      {
        if (paramInt1 >= i)
          break label69;
        Object localObject = localh.b(paramInt1);
        if (localObject == null)
          break;
        localArrayList.add(localObject);
        paramInt1++;
      }
    }
  }

  protected abstract String a();

  protected abstract List<T> a(int paramInt1, int paramInt2);

  public final void a(int paramInt1, int paramInt2, j<T> paramj)
  {
    monitorenter;
    try
    {
      a(paramInt1, paramInt2, paramj, false);
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final void a(int paramInt1, int paramInt2, j<T> paramj, boolean paramBoolean)
  {
    monitorenter;
    try
    {
      String str = paramInt1 + "." + paramInt2 + "." + String.valueOf(paramj);
      boolean bool = this.b.contains(str);
      if (bool);
      while (true)
      {
        return;
        b localb = new b(this, paramInt1, paramBoolean, paramInt2, paramj, str);
        this.b.add(str);
        this.c.add(localb);
        ThreadPool.execute(localb);
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  protected k<T> b(int paramInt1, int paramInt2)
  {
    return null;
  }

  protected List<T> d(int paramInt1, int paramInt2)
  {
    List localList1 = e(paramInt1, paramInt2);
    if (localList1.size() < paramInt2)
    {
      List localList2 = c(paramInt1 + localList1.size(), paramInt2 - localList1.size());
      if (localList2 != null)
        localList1.addAll(localList2);
    }
    return localList1;
  }

  public void d()
  {
    String str = a(a(), getClass());
    if (str != null)
    {
      h localh = i.a(str);
      if (localh != null)
        localh.b();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.c.a
 * JD-Core Version:    0.6.0
 */