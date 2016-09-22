package com.wandoujia.jupiter.startpage.manager;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.wandoujia.base.utils.Preferences;
import com.wandoujia.base.utils.Preferences.CustomEditor;
import com.wandoujia.base.utils.SharePrefSubmitor;
import com.wandoujia.jupiter.JupiterApplication;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class LocalFeedManager
{
  private Preferences a;
  private List<WeakReference<d>> b = new ArrayList();
  private Handler c = new Handler(Looper.getMainLooper());

  private Map<String, Long> g()
  {
    return (Map)i().getObject("key_closed_feeds", new b().getType(), new HashMap());
  }

  private void h()
  {
    int i = e();
    SharePrefSubmitor.submit(i().edit().putInt("key_launch_times", i + 1));
  }

  private Preferences i()
  {
    if (this.a == null)
      this.a = Preferences.getById(JupiterApplication.e(), "pref_start_page");
    return this.a;
  }

  public final String a()
  {
    Iterator localIterator = g().entrySet().iterator();
    StringBuilder localStringBuilder = new StringBuilder();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localStringBuilder.append((String)localEntry.getKey()).append(':').append(localEntry.getValue()).append(',');
    }
    return localStringBuilder.toString();
  }

  public final void a(long paramLong)
  {
    SharePrefSubmitor.submit(i().edit().putLong("key_first_launch_time", paramLong));
  }

  public final void a(d paramd)
  {
    synchronized (this.b)
    {
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
        if (paramd.equals((d)((WeakReference)localIterator.next()).get()))
          return;
      this.b.add(new WeakReference(paramd));
      return;
    }
  }

  public final void a(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    while (true)
    {
      return;
      Map localMap = g();
      localMap.put(paramString, Long.valueOf(System.currentTimeMillis()));
      SharePrefSubmitor.submit(i().edit().putObject("key_closed_feeds", localMap));
      if (TextUtils.isEmpty(paramString))
        continue;
      ArrayList localArrayList = new ArrayList();
      while (true)
      {
        Iterator localIterator1;
        synchronized (this.b)
        {
          localIterator1 = this.b.iterator();
          if (!localIterator1.hasNext())
            break;
          d locald2 = (d)((WeakReference)localIterator1.next()).get();
          if (locald2 != null)
            localArrayList.add(locald2);
        }
        localIterator1.remove();
      }
      monitorexit;
      Iterator localIterator2 = localArrayList.iterator();
      while (localIterator2.hasNext())
      {
        d locald1 = (d)localIterator2.next();
        this.c.post(new a(locald1, paramString));
      }
    }
  }

  public final long b()
  {
    return i().getLong("key_first_launch_time", 0L);
  }

  public final int c()
  {
    long l = System.currentTimeMillis() - b();
    if (l > 0L)
      return (int)(l / 24L / 60L / 60L / 1000L);
    return 0;
  }

  public final void d()
  {
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      new Thread(new c(this)).start();
      return;
    }
    h();
  }

  public final int e()
  {
    return i().getInt("key_launch_times", 0);
  }

  public final void f()
  {
    SharePrefSubmitor.submit(i().edit().putBoolean("key_first_in_app_feed", true));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.startpage.manager.LocalFeedManager
 * JD-Core Version:    0.6.0
 */