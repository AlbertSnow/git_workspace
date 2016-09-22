import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class akp
  implements ala
{
  final Lock a;
  final Condition b;
  final Context c;
  final oy d;
  final akr e;
  final Map f;
  final Map g = new HashMap();
  final amk h;
  final Map i;
  final aib j;
  volatile ako k;
  int l;
  final akk m;
  final alb n;

  public akp(Context paramContext, akk paramakk, Lock paramLock, Looper paramLooper, oy paramoy, Map paramMap1, amk paramamk, Map paramMap2, aib paramaib, ArrayList paramArrayList, alb paramalb)
  {
    this.c = paramContext;
    this.a = paramLock;
    this.d = paramoy;
    this.f = paramMap1;
    this.h = paramamk;
    this.i = paramMap2;
    this.j = paramaib;
    this.m = paramakk;
    this.n = paramalb;
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
      ((ajr)localIterator.next()).b = this;
    this.e = new akr(this, paramLooper);
    this.b = paramLock.newCondition();
    this.k = new akj(this);
  }

  public final ajh a(ajh paramajh)
  {
    paramajh.e();
    return this.k.a(paramajh);
  }

  public final void a()
  {
    this.k.c();
  }

  public final void a(int paramInt)
  {
    this.a.lock();
    try
    {
      this.k.a(paramInt);
      return;
    }
    finally
    {
      this.a.unlock();
    }
    throw localObject;
  }

  final void a(akq paramakq)
  {
    Message localMessage = this.e.obtainMessage(1, paramakq);
    this.e.sendMessage(localMessage);
  }

  final void a(ConnectionResult paramConnectionResult)
  {
    this.a.lock();
    try
    {
      this.k = new akj(this);
      this.k.a();
      this.b.signalAll();
      return;
    }
    finally
    {
      this.a.unlock();
    }
    throw localObject;
  }

  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    String str = String.valueOf(paramString).concat("  ");
    paramPrintWriter.append(paramString).append("mState=").println(this.k);
    Iterator localIterator = this.i.keySet().iterator();
    while (localIterator.hasNext())
    {
      aia localaia = (aia)localIterator.next();
      paramPrintWriter.append(paramString).append(localaia.a).println(":");
      ((aif)this.f.get(localaia.b())).a(str, paramPrintWriter);
    }
  }

  public final ajh b(ajh paramajh)
  {
    paramajh.e();
    return this.k.b(paramajh);
  }

  public final void b()
  {
    if (this.k.b())
      this.g.clear();
  }

  public final boolean c()
  {
    return this.k instanceof ajv;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     akp
 * JD-Core Version:    0.6.0
 */