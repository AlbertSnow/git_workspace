package com.wandoujia.shared_storage;

import android.text.TextUtils;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class AppIgnoreUpdateStorage extends e<AppIgnoreUpdateStorage.IgnoreUpdateApp>
{
  private static AppIgnoreUpdateStorage a;

  public static AppIgnoreUpdateStorage a()
  {
    monitorenter;
    try
    {
      if (a == null)
        a = new AppIgnoreUpdateStorage();
      AppIgnoreUpdateStorage localAppIgnoreUpdateStorage = a;
      return localAppIgnoreUpdateStorage;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
      a(new AppIgnoreUpdateStorage.IgnoreUpdateApp(paramString));
  }

  public final void a(List<String> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      localArrayList.add(new AppIgnoreUpdateStorage.IgnoreUpdateApp((String)localIterator.next()));
    a(localArrayList);
  }

  public final String b()
  {
    return "ignore_update_apps";
  }

  public final void b(String paramString)
  {
    d(paramString);
  }

  protected final Type c()
  {
    return new a().getType();
  }

  public final Set<String> d()
  {
    return h();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.shared_storage.AppIgnoreUpdateStorage
 * JD-Core Version:    0.6.0
 */