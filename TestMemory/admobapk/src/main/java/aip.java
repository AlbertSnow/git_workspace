import android.content.Context;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.chimera.Activity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

public final class aip
{
  public final ArrayList a = new ArrayList();
  public final ArrayList b = new ArrayList();
  private final Set c = new HashSet();
  private final Set d = new HashSet();
  private String e;
  private String f;
  private final Map g = new cw();
  private final Context h;
  private final Map i = new cw();
  private int j = -1;
  private Looper k;
  private ox l = ox.a;
  private aib m = ark.a;

  public aip(Context paramContext)
  {
    this.h = paramContext;
    this.k = paramContext.getMainLooper();
    this.e = paramContext.getPackageName();
    this.f = paramContext.getClass().getName();
  }

  public final aip a(aia paramaia)
  {
    anw.a(paramaia, "Api must not be null");
    this.i.put(paramaia, null);
    List localList = Collections.emptyList();
    this.d.addAll(localList);
    this.c.addAll(localList);
    return this;
  }

  public final amk a()
  {
    arp localarp = arp.a;
    if (this.i.containsKey(ark.b))
      localarp = (arp)this.i.get(ark.b);
    return new amk(null, this.c, this.g, 0, null, this.e, this.f, localarp);
  }

  public final aio b()
  {
    if (!this.i.isEmpty());
    amk localamk;
    cw localcw1;
    cw localcw2;
    ArrayList localArrayList;
    for (boolean bool1 = true; ; bool1 = false)
    {
      anw.b(bool1, "must call addApi() to add at least one API");
      localamk = a();
      Map localMap = localamk.d;
      localcw1 = new cw();
      localcw2 = new cw();
      localArrayList = new ArrayList();
      Iterator localIterator = this.i.keySet().iterator();
      while (localIterator.hasNext())
      {
        aia localaia = (aia)localIterator.next();
        Object localObject3 = this.i.get(localaia);
        Object localObject4 = localMap.get(localaia);
        int i2 = 0;
        if (localObject4 != null)
        {
          localMap.get(localaia);
          i2 = 2;
        }
        localcw1.put(localaia, Integer.valueOf(i2));
        ajr localajr = new ajr(localaia, i2);
        localArrayList.add(localajr);
        aif localaif = localaia.a().a(this.h, this.k, localamk, localObject3, localajr, localajr);
        localcw2.put(localaia.b(), localaif);
      }
    }
    int n = akk.a(localcw2.values(), true);
    akk localakk = new akk(this.h, new ReentrantLock(), this.k, localamk, this.l, this.m, localcw1, this.a, this.b, localcw2, this.j, n, localArrayList);
    while (true)
    {
      synchronized (aio.a)
      {
        aio.a.add(localakk);
        if (this.j < 0)
          continue;
        if ((null instanceof ac))
        {
          localObject2 = alj.a(null);
          localajd = (ajd)((ald)localObject2).a("AutoManageHelper", ajd.class);
          if (localajd == null)
            break label609;
          int i1 = this.j;
          anw.a(localakk, "GoogleApiClient instance cannot be null");
          if (localajd.a.indexOfKey(i1) >= 0)
            break label623;
          bool2 = true;
          anw.a(bool2, 54 + "Already managing a GoogleApiClient with id " + i1);
          boolean bool3 = localajd.b;
          boolean bool4 = localajd.c;
          Log.d("AutoManageHelper", 54 + "starting AutoManage for client " + i1 + " " + bool3 + " " + bool4);
          aje localaje = new aje(localajd, i1, localakk, null);
          localajd.a.put(i1, localaje);
          if ((!localajd.b) || (localajd.c))
            continue;
          String str = String.valueOf(localakk);
          Log.d("AutoManageHelper", 11 + String.valueOf(str).length() + "connecting " + str);
          localakk.b();
          return localakk;
        }
      }
      if ((amj.c) && ((null instanceof Activity)))
      {
        localObject2 = ajp.a(null);
        continue;
      }
      Object localObject2 = ale.a(null);
      continue;
      label609: ajd localajd = new ajd((ald)localObject2);
      continue;
      label623: boolean bool2 = false;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aip
 * JD-Core Version:    0.6.0
 */