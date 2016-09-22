package com.wandoujia.p4.b;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.provider.MediaStore.Images.Media;
import android.support.v7.app.f;
import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.ripple_framework.ReceiverMonitor;
import com.wandoujia.ripple_framework.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class b extends a<f>
{
  private static Uri a = Uri.withAppendedPath(Uri.parse("content://com.wandoujia.image"), "folders");
  private ArrayList<j> b = new ArrayList();
  private ArrayList<h> c = new ArrayList();
  private HashMap<String, ArrayList<h>> d = new HashMap();
  private HashMap<String, i> e = new LinkedHashMap();
  private Looper f;
  private k g;
  private ArrayList<i> h;
  private ArrayList<j> i;
  private HashMap<String, i> j;
  private HashMap<String, Integer> k;
  private long l;
  private final m m = new c(this);
  private Comparator<h> n = new d();
  private ContentObserver o = new e(this);

  public b()
  {
    HandlerThread localHandlerThread = new HandlerThread("image-sync-service", 10);
    localHandlerThread.start();
    this.f = localHandlerThread.getLooper();
    this.g = new k(this, this.f);
    this.k = new HashMap();
    ReceiverMonitor.a().a(this.m);
  }

  public static void a(Context paramContext, String paramString)
  {
    String str = "image/" + FileUtil.getFileExtension(paramString);
    ContentValues localContentValues = new ContentValues(4);
    localContentValues.put("_display_name", FileUtil.getFileName(paramString));
    localContentValues.put("description", "this is description");
    localContentValues.put("mime_type", str);
    localContentValues.put("_data", paramString);
    paramContext.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, localContentValues);
  }

  private void a(ArrayList<i> paramArrayList, ArrayList<j> paramArrayList1, HashMap<String, Integer> paramHashMap)
  {
    monitorenter;
    try
    {
      this.h = paramArrayList;
      this.i = paramArrayList1;
      if (paramHashMap != null)
        this.k = paramHashMap;
      Handler localHandler = a();
      if (localHandler != null)
        localHandler.sendEmptyMessage(2);
      new g();
      b();
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private void a(HashMap<String, i> paramHashMap, List<j> paramList, HashMap<String, Integer> paramHashMap1)
  {
    if ((paramHashMap == null) || (paramList == null))
      return;
    this.j = paramHashMap;
    Iterator localIterator1 = paramHashMap.values().iterator();
    ArrayList localArrayList1 = new ArrayList();
    while ((localIterator1 != null) && (localIterator1.hasNext()))
      localArrayList1.add(localIterator1.next());
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator2 = paramList.iterator();
    while (localIterator2.hasNext())
      localArrayList2.add((j)localIterator2.next());
    a(localArrayList1, localArrayList2, paramHashMap1);
  }

  public final void c()
  {
    this.g.sendEmptyMessage(0);
  }

  public final HashMap<String, i> d()
  {
    monitorenter;
    try
    {
      HashMap localHashMap = this.j;
      monitorexit;
      return localHashMap;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final ArrayList<i> e()
  {
    monitorenter;
    try
    {
      ArrayList localArrayList = this.h;
      monitorexit;
      return localArrayList;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final ArrayList<j> f()
  {
    monitorenter;
    try
    {
      ArrayList localArrayList = this.i;
      monitorexit;
      return localArrayList;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final HashMap<String, Integer> g()
  {
    monitorenter;
    try
    {
      HashMap localHashMap = this.k;
      monitorexit;
      return localHashMap;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.b.b
 * JD-Core Version:    0.6.0
 */