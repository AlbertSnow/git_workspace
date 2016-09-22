package com.wandoujia.shared_storage;

import android.os.Handler;
import android.os.HandlerThread;
import com.wandoujia.gson.JsonSyntaxException;
import com.wandoujia.gson.c;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public abstract class e<T extends StorageLine> extends b
{
  private Handler a;
  private final HashMap<String, T> b = new HashMap();

  protected e()
  {
    HandlerThread localHandlerThread = new HandlerThread("ListSharedStorage");
    localHandlerThread.start();
    this.a = new Handler(localHandlerThread.getLooper());
    e();
  }

  protected final void a(T paramT)
  {
    this.a.post(new i(this, paramT));
  }

  protected final void a(Collection<T> paramCollection)
  {
    this.a.post(new g(this, paramCollection));
  }

  protected abstract Type c();

  protected final void d(String paramString)
  {
    this.a.post(new k(this, paramString));
  }

  protected final void e()
  {
    this.a.post(new f(this));
  }

  protected final void e(String paramString)
  {
    try
    {
      localc = new c();
      localType = c();
      Collection localCollection = (Collection)localc.a(f(), localType);
      localArrayList = new ArrayList();
      if (localCollection != null)
      {
        Iterator localIterator = localCollection.iterator();
        while (localIterator.hasNext())
        {
          StorageLine localStorageLine = (StorageLine)localIterator.next();
          if (localStorageLine.getKey().equals(paramString))
            continue;
          localArrayList.add(localStorageLine);
        }
      }
    }
    catch (JsonSyntaxException localJsonSyntaxException)
    {
      c localc;
      Type localType;
      ArrayList localArrayList;
      g();
      return;
      c(localc.a(localArrayList, localType));
      return;
    }
    catch (Exception localException)
    {
      return;
    }
    finally
    {
    }
    throw localObject;
  }

  protected final T f(String paramString)
  {
    return (StorageLine)this.b.get(paramString);
  }

  protected final Set<String> h()
  {
    return this.b.keySet();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.shared_storage.e
 * JD-Core Version:    0.6.0
 */