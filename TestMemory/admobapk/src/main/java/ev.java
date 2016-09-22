import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;

public abstract class ev
  implements Comparable
{
  final fi a;
  public final int b;
  public final String c;
  final int d;
  final fa e;
  Integer f;
  ey g;
  boolean h;
  boolean i;
  public fd j;
  public ej k;
  private boolean l;
  private long m;

  public ev(int paramInt, String paramString, fa paramfa)
  {
    fi localfi;
    String str;
    if (fi.a)
    {
      localfi = new fi();
      this.a = localfi;
      this.h = true;
      this.l = false;
      this.i = false;
      this.m = 0L;
      this.k = null;
      this.b = paramInt;
      this.c = paramString;
      this.e = paramfa;
      this.j = new em();
      if (TextUtils.isEmpty(paramString))
        break label126;
      Uri localUri = Uri.parse(paramString);
      if (localUri == null)
        break label126;
      str = localUri.getHost();
      if (str == null)
        break label126;
    }
    label126: for (int n = str.hashCode(); ; n = 0)
    {
      this.d = n;
      return;
      localfi = null;
      break;
    }
  }

  private static byte[] a(Map paramMap, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    String str1;
    try
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localStringBuilder.append(URLEncoder.encode((String)localEntry.getKey(), paramString));
        localStringBuilder.append('=');
        localStringBuilder.append(URLEncoder.encode((String)localEntry.getValue(), paramString));
        localStringBuilder.append('&');
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      str1 = String.valueOf(paramString);
      if (str1.length() == 0);
    }
    for (String str2 = "Encoding not supported: ".concat(str1); ; str2 = new String("Encoding not supported: "))
    {
      throw new RuntimeException(str2, localUnsupportedEncodingException);
      byte[] arrayOfByte = localStringBuilder.toString().getBytes(paramString);
      return arrayOfByte;
    }
  }

  public abstract ez a(et paramet);

  public Map a()
  {
    return Collections.emptyMap();
  }

  public abstract void a(Object paramObject);

  public final void a(String paramString)
  {
    if (fi.a)
      this.a.a(paramString, Thread.currentThread().getId());
    do
      return;
    while (this.m != 0L);
    this.m = SystemClock.elapsedRealtime();
  }

  final void b(String paramString)
  {
    ey localey;
    if (this.g != null)
    {
      localey = this.g;
      synchronized (localey.b)
      {
        localey.b.remove(this);
        synchronized (localey.d)
        {
          Iterator localIterator = localey.d.iterator();
          if (localIterator.hasNext())
            localIterator.next();
        }
      }
      monitorexit;
      if (!this.h);
    }
    label277: long l1;
    do
    {
      long l2;
      synchronized (localey.a)
      {
        String str = this.c;
        Queue localQueue = (Queue)localey.a.remove(str);
        if (localQueue != null)
        {
          if (fh.b)
          {
            Object[] arrayOfObject2 = new Object[2];
            arrayOfObject2[0] = Integer.valueOf(localQueue.size());
            arrayOfObject2[1] = str;
            fh.a("Releasing %d waiting requests for cacheKey=%s.", arrayOfObject2);
          }
          localey.c.addAll(localQueue);
        }
        if (!fi.a)
          break label277;
        l2 = Thread.currentThread().getId();
        if (Looper.myLooper() != Looper.getMainLooper())
        {
          new Handler(Looper.getMainLooper()).post(new ew(this, paramString, l2));
          return;
        }
      }
      this.a.a(paramString, l2);
      this.a.a(toString());
      return;
      l1 = SystemClock.elapsedRealtime() - this.m;
    }
    while (l1 < 3000L);
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Long.valueOf(l1);
    arrayOfObject1[1] = toString();
    fh.b("%d ms: %s", arrayOfObject1);
  }

  @Deprecated
  public final byte[] b()
  {
    byte[] arrayOfByte = null;
    if (0 != 0)
    {
      int n = null.size();
      arrayOfByte = null;
      if (n > 0)
        arrayOfByte = a(null, "UTF-8");
    }
    return arrayOfByte;
  }

  public final String c()
  {
    String str = String.valueOf("UTF-8");
    if (str.length() != 0)
      return "application/x-www-form-urlencoded; charset=".concat(str);
    return new String("application/x-www-form-urlencoded; charset=");
  }

  public byte[] d()
  {
    return null;
  }

  public final int e()
  {
    return this.j.a();
  }

  public String toString()
  {
    String str1 = String.valueOf(Integer.toHexString(this.d));
    if (str1.length() != 0);
    for (String str2 = "0x".concat(str1); ; str2 = new String("0x"))
    {
      String str3 = String.valueOf(this.c);
      String str4 = String.valueOf(ex.a);
      String str5 = String.valueOf(this.f);
      return 3 + String.valueOf("[ ] ").length() + String.valueOf(str3).length() + String.valueOf(str2).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + "[ ] " + str3 + " " + str2 + " " + str4 + " " + str5;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ev
 * JD-Core Version:    0.6.0
 */