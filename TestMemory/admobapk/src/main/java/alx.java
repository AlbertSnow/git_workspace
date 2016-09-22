import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class alx
{
  int a;
  long b;
  public final Context c;
  final Handler d;
  final Object e = new Object();
  ank f;
  amd g;
  final ArrayList h = new ArrayList();
  final alz i;
  final ama j;
  public AtomicInteger k = new AtomicInteger(0);
  private long l;
  private int m;
  private long n;
  private final amv o;
  private final oy p;
  private final Object q = new Object();
  private IInterface r;
  private amf s;
  private int t = 1;
  private final int u;
  private final String v;

  static
  {
    new String[] { "service_esmobile", "service_googleme" };
  }

  public alx(Context paramContext, Looper paramLooper, int paramInt, alz paramalz, ama paramama, String paramString)
  {
    this(paramContext, paramLooper, amv.a(paramContext), oy.c, paramInt, (alz)anw.a(paramalz), (ama)anw.a(paramama), null);
  }

  protected alx(Context paramContext, Looper paramLooper, amv paramamv, oy paramoy, int paramInt, alz paramalz, ama paramama, String paramString)
  {
    this.c = ((Context)anw.a(paramContext, "Context must not be null"));
    anw.a(paramLooper, "Looper must not be null");
    this.o = ((amv)anw.a(paramamv, "Supervisor must not be null"));
    this.p = ((oy)anw.a(paramoy, "API availability must not be null"));
    this.d = new amb(this, paramLooper);
    this.u = paramInt;
    this.i = paramalz;
    this.j = paramama;
    this.v = paramString;
  }

  private String c()
  {
    if (this.v == null)
      return this.c.getClass().getName();
    return this.v;
  }

  public abstract IInterface a(IBinder paramIBinder);

  public abstract String a();

  protected final void a(int paramInt1, Bundle paramBundle, int paramInt2)
  {
    this.d.sendMessage(this.d.obtainMessage(5, paramInt2, -1, new ami(this, paramInt1, null)));
  }

  final void a(int paramInt, IInterface paramIInterface)
  {
    int i1 = 1;
    int i2;
    int i3;
    if (paramInt == 3)
    {
      i2 = i1;
      if (paramIInterface == null)
        break label42;
      i3 = i1;
      label17: if (i2 != i3)
        break label48;
    }
    while (true)
    {
      if (i1 != 0)
        break label53;
      throw new IllegalArgumentException();
      i2 = 0;
      break;
      label42: i3 = 0;
      break label17;
      label48: i1 = 0;
    }
    while (true)
    {
      label53: synchronized (this.q)
      {
        this.t = paramInt;
        this.r = paramIInterface;
        switch (paramInt)
        {
        default:
          return;
        case 2:
          if (this.s == null)
            continue;
          String str3 = String.valueOf(a());
          String str4 = String.valueOf("com.google.android.gms");
          Log.e("GmsClient", 70 + String.valueOf(str3).length() + String.valueOf(str4).length() + "Calling connect() while still connected, missing disconnect() for " + str3 + " on " + str4);
          this.o.b(a(), "com.google.android.gms", this.s, c());
          this.k.incrementAndGet();
          this.s = new amf(this, this.k.get());
          if (this.o.a(a(), "com.google.android.gms", this.s, c()))
            continue;
          String str1 = String.valueOf(a());
          String str2 = String.valueOf("com.google.android.gms");
          Log.e("GmsClient", 34 + String.valueOf(str1).length() + String.valueOf(str2).length() + "unable to connect to service: " + str1 + " on " + str2);
          a(16, null, this.k.get());
        case 3:
        case 1:
        }
      }
      this.l = System.currentTimeMillis();
      continue;
      if (this.s == null)
        continue;
      this.o.b(a(), "com.google.android.gms", this.s, c());
      this.s = null;
    }
  }

  public final void a(amd paramamd)
  {
    this.g = ((amd)anw.a(paramamd, "Connection progress callbacks cannot be null."));
    a(2, null);
  }

  public final void a(anb paramanb, Set paramSet)
  {
    try
    {
      Bundle localBundle = k();
      localGetServiceRequest = new GetServiceRequest(this.u);
      localGetServiceRequest.d = this.c.getPackageName();
      localGetServiceRequest.g = localBundle;
      if (paramSet != null)
        localGetServiceRequest.f = ((Scope[])paramSet.toArray(new Scope[paramSet.size()]));
      if (g())
      {
        if (j() == null)
          break label153;
        localAccount = j();
        localGetServiceRequest.h = localAccount;
        if (paramanb != null)
          localGetServiceRequest.e = paramanb.asBinder();
      }
    }
    catch (DeadObjectException localDeadObjectException)
    {
      synchronized (this.e)
      {
        GetServiceRequest localGetServiceRequest;
        Account localAccount;
        while (this.f != null)
        {
          this.f.a(new ame(this, this.k.get()), localGetServiceRequest);
          return;
          localAccount = new Account("<<default account>>", "com.google");
          continue;
          localDeadObjectException = localDeadObjectException;
          Log.w("GmsClient", "service died");
          this.d.sendMessage(this.d.obtainMessage(4, this.k.get(), 1));
          return;
        }
        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
      }
    }
    catch (RemoteException localRemoteException)
    {
      label153: Log.w("GmsClient", "Remote exception occurred", localRemoteException);
    }
  }

  protected final void a(ConnectionResult paramConnectionResult)
  {
    this.m = paramConnectionResult.c;
    this.n = System.currentTimeMillis();
  }

  public final void a(String paramString, PrintWriter paramPrintWriter)
  {
    while (true)
    {
      IInterface localIInterface;
      synchronized (this.q)
      {
        int i1 = this.t;
        localIInterface = this.r;
        paramPrintWriter.append(paramString).append("mConnectState=");
        switch (i1)
        {
        default:
          paramPrintWriter.print("UNKNOWN");
          paramPrintWriter.append(" mService=");
          if (localIInterface != null)
            break label491;
          paramPrintWriter.println("null");
          SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
          if (this.l <= 0L)
            continue;
          PrintWriter localPrintWriter3 = paramPrintWriter.append(paramString).append("lastConnectedTime=");
          long l3 = this.l;
          String str3 = String.valueOf(localSimpleDateFormat.format(new Date(this.l)));
          localPrintWriter3.println(21 + String.valueOf(str3).length() + l3 + " " + str3);
          if (this.b <= 0L)
            continue;
          paramPrintWriter.append(paramString).append("lastSuspendedCause=");
          switch (this.a)
          {
          default:
            paramPrintWriter.append(String.valueOf(this.a));
            PrintWriter localPrintWriter2 = paramPrintWriter.append(" lastSuspendedTime=");
            long l2 = this.b;
            String str2 = String.valueOf(localSimpleDateFormat.format(new Date(this.b)));
            localPrintWriter2.println(21 + String.valueOf(str2).length() + l2 + " " + str2);
            if (this.n <= 0L)
              continue;
            paramPrintWriter.append(paramString).append("lastFailedStatus=").append(aim.a(this.m));
            PrintWriter localPrintWriter1 = paramPrintWriter.append(" lastFailedTime=");
            long l1 = this.n;
            String str1 = String.valueOf(localSimpleDateFormat.format(new Date(this.n)));
            localPrintWriter1.println(21 + String.valueOf(str1).length() + l1 + " " + str1);
            return;
          case 1:
          case 2:
          }
        case 2:
        case 3:
        case 4:
        case 1:
        }
      }
      paramPrintWriter.print("CONNECTING");
      continue;
      paramPrintWriter.print("CONNECTED");
      continue;
      paramPrintWriter.print("DISCONNECTING");
      continue;
      paramPrintWriter.print("DISCONNECTED");
      continue;
      label491: paramPrintWriter.append(b()).append("@").println(Integer.toHexString(System.identityHashCode(localIInterface.asBinder())));
      continue;
      paramPrintWriter.append("CAUSE_SERVICE_DISCONNECTED");
      continue;
      paramPrintWriter.append("CAUSE_NETWORK_LOST");
    }
  }

  final boolean a(int paramInt1, int paramInt2, IInterface paramIInterface)
  {
    synchronized (this.q)
    {
      if (this.t != paramInt1)
        return false;
      a(paramInt2, paramIInterface);
      return true;
    }
  }

  public abstract String b();

  public final void d()
  {
    this.k.incrementAndGet();
    synchronized (this.h)
    {
      int i1 = this.h.size();
      for (int i2 = 0; i2 < i1; i2++)
        ((amc)this.h.get(i2)).c();
      this.h.clear();
    }
    synchronized (this.e)
    {
      this.f = null;
      a(1, null);
      return;
      localObject1 = finally;
      monitorexit;
      throw localObject1;
    }
  }

  public final boolean e()
  {
    while (true)
    {
      synchronized (this.q)
      {
        if (this.t == 3)
        {
          i1 = 1;
          return i1;
        }
      }
      int i1 = 0;
    }
  }

  public final boolean f()
  {
    while (true)
    {
      synchronized (this.q)
      {
        if (this.t == 2)
        {
          i1 = 1;
          return i1;
        }
      }
      int i1 = 0;
    }
  }

  public boolean g()
  {
    return false;
  }

  public final Intent h()
  {
    throw new UnsupportedOperationException("Not a sign in API");
  }

  public final void i()
  {
    int i1 = this.p.a(this.c);
    if (i1 != 0)
    {
      a(1, null);
      this.g = new amg(this);
      this.d.sendMessage(this.d.obtainMessage(3, this.k.get(), i1));
      return;
    }
    a(new amg(this));
  }

  public Account j()
  {
    return null;
  }

  public Bundle k()
  {
    return new Bundle();
  }

  public final IInterface l()
  {
    synchronized (this.q)
    {
      if (this.t == 4)
        throw new DeadObjectException();
    }
    if (!e())
      throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    if (this.r != null);
    for (boolean bool = true; ; bool = false)
    {
      anw.a(bool, "Client is connected but service is null");
      IInterface localIInterface = this.r;
      monitorexit;
      return localIInterface;
    }
  }

  protected Set m()
  {
    return Collections.EMPTY_SET;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     alx
 * JD-Core Version:    0.6.0
 */