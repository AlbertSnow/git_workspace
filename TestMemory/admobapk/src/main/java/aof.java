import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionEvent;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class aof
{
  private static final Object a = new Object();
  private static aof b;
  private static Integer h;
  private final List c;
  private final List d;
  private final List e;
  private final List f;
  private aoj g;

  private aof()
  {
    if (b() == aoi.b)
    {
      this.c = Collections.EMPTY_LIST;
      this.d = Collections.EMPTY_LIST;
      this.e = Collections.EMPTY_LIST;
      this.f = Collections.EMPTY_LIST;
      return;
    }
    String str1 = (String)aoh.b.c();
    List localList1;
    String str2;
    List localList2;
    label84: String str3;
    List localList3;
    label111: String str4;
    if (str1 == null)
    {
      localList1 = Collections.EMPTY_LIST;
      this.c = localList1;
      str2 = (String)aoh.c.c();
      if (str2 != null)
        break label207;
      localList2 = Collections.EMPTY_LIST;
      this.d = localList2;
      str3 = (String)aoh.d.c();
      if (str3 != null)
        break label221;
      localList3 = Collections.EMPTY_LIST;
      this.e = localList3;
      str4 = (String)aoh.e.c();
      if (str4 != null)
        break label236;
    }
    label207: label221: label236: for (List localList4 = Collections.EMPTY_LIST; ; localList4 = Arrays.asList(str4.split(",")))
    {
      this.f = localList4;
      this.g = new aoj(1024, ((Long)aoh.f.c()).longValue());
      new aoj(1024, ((Long)aoh.f.c()).longValue());
      return;
      localList1 = Arrays.asList(str1.split(","));
      break;
      localList2 = Arrays.asList(str2.split(","));
      break label84;
      localList3 = Arrays.asList(str3.split(","));
      break label111;
    }
  }

  public static aof a()
  {
    synchronized (a)
    {
      if (b == null)
        b = new aof();
      return b;
    }
  }

  private static String a(int paramInt1, int paramInt2)
  {
    StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
    StringBuffer localStringBuffer = new StringBuffer();
    int i = paramInt2 + 3;
    int j = 3;
    if (j < i)
    {
      if (j + 4 >= arrayOfStackTraceElement.length);
      String str1;
      String str2;
      int k;
      for (String str3 = "<bottom of call stack>"; ; str3 = 13 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + "." + str2 + ":" + k)
      {
        localStringBuffer.append(str3).append(" ");
        j++;
        break;
        StackTraceElement localStackTraceElement = arrayOfStackTraceElement[(j + 4)];
        str1 = String.valueOf(localStackTraceElement.getClassName());
        str2 = String.valueOf(localStackTraceElement.getMethodName());
        k = localStackTraceElement.getLineNumber();
      }
    }
    return localStringBuffer.toString();
  }

  public static String a(ServiceConnection paramServiceConnection)
  {
    return String.valueOf(Process.myPid() << 32 | System.identityHashCode(paramServiceConnection));
  }

  private static int b()
  {
    if (h == null);
    try
    {
      if (aol.a());
      for (int i = ((Integer)aoh.a.c()).intValue(); ; i = aoi.b)
      {
        h = Integer.valueOf(i);
        return h.intValue();
      }
    }
    catch (SecurityException localSecurityException)
    {
      while (true)
        h = Integer.valueOf(aoi.b);
    }
  }

  @SuppressLint({"UntrackedBindService"})
  public final void a(Context paramContext, ServiceConnection paramServiceConnection)
  {
    paramContext.unbindService(paramServiceConnection);
    a(paramContext, a(paramServiceConnection), null, null, 1);
  }

  public final void a(Context paramContext, String paramString1, String paramString2, Intent paramIntent, int paramInt)
  {
    int i;
    if (!amj.c)
    {
      i = 0;
      if ((i != 0) && (this.g != null))
        break label43;
    }
    label43: 
    do
    {
      return;
      if (b() == aoi.b)
      {
        i = 0;
        break;
      }
      i = 1;
      break;
      if ((paramInt != 4) && (paramInt != 1))
        break label202;
    }
    while (!this.g.b(paramString1));
    String str1 = null;
    String str2 = null;
    String str3 = null;
    long l1 = System.currentTimeMillis();
    int j = b() & aoi.c;
    String str4 = null;
    if (j != 0)
    {
      str4 = null;
      if (paramInt != 13)
        str4 = a(3, 5);
    }
    long l2 = 0L;
    if ((b() & aoi.e) != 0)
      l2 = Debug.getNativeHeapAllocatedSize();
    if ((paramInt == 1) || (paramInt == 4) || (paramInt == 14));
    for (ConnectionEvent localConnectionEvent = new ConnectionEvent(l1, paramInt, null, null, null, null, str4, paramString1, SystemClock.elapsedRealtime(), l2); ; localConnectionEvent = new ConnectionEvent(l1, paramInt, str3, paramString2, str1, str2, str4, paramString1, SystemClock.elapsedRealtime(), l2))
    {
      paramContext.startService(new Intent().setComponent(aoi.a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", localConnectionEvent));
      return;
      label202: List localList = paramContext.getPackageManager().queryIntentServices(paramIntent, 128);
      ServiceInfo localServiceInfo;
      if ((localList == null) || (localList.size() == 0))
      {
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = paramIntent.toUri(0);
        arrayOfObject1[1] = a(3, 20);
        Log.w("ConnectionTracker", String.format("There are no handler of this intent: %s\n Stack trace: %s", arrayOfObject1));
        localServiceInfo = null;
      }
      while (localServiceInfo == null)
      {
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = paramString2;
        arrayOfObject2[1] = paramIntent.toUri(0);
        Log.w("ConnectionTracker", String.format("Client %s made an invalid request %s", arrayOfObject2));
        return;
        if (localList.size() > 1)
        {
          Object[] arrayOfObject3 = new Object[2];
          arrayOfObject3[0] = paramIntent.toUri(0);
          arrayOfObject3[1] = a(3, 20);
          Log.w("ConnectionTracker", String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", arrayOfObject3));
          Iterator localIterator = localList.iterator();
          while (localIterator.hasNext())
            Log.w("ConnectionTracker", ((ResolveInfo)localIterator.next()).serviceInfo.name);
          localServiceInfo = null;
          continue;
        }
        localServiceInfo = ((ResolveInfo)localList.get(0)).serviceInfo;
      }
      str1 = localServiceInfo.processName;
      str2 = localServiceInfo.name;
      str3 = aor.a(Binder.getCallingPid());
      int k = b();
      if ((this.c.contains(str3)) || (this.d.contains(paramString2)) || (this.e.contains(str1)) || (this.f.contains(str2)) || ((str1.equals(str3)) && ((k & aoi.d) != 0)));
      for (int m = 0; ; m = 1)
      {
        if (m == 0)
          break label564;
        this.g.a(paramString1);
        break;
      }
      label564: break;
    }
  }

  public final boolean a(Context paramContext, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    return a(paramContext, paramContext.getClass().getName(), paramIntent, paramServiceConnection, 1);
  }

  @SuppressLint({"UntrackedBindService"})
  public final boolean a(Context paramContext, String paramString, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    ComponentName localComponentName = paramIntent.getComponent();
    if (localComponentName == null);
    for (boolean bool1 = false; bool1; bool1 = aol.a(paramContext, localComponentName.getPackageName()))
    {
      Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
      return false;
    }
    boolean bool2 = paramContext.bindService(paramIntent, paramServiceConnection, paramInt);
    if (bool2)
      a(paramContext, a(paramServiceConnection), paramString, paramIntent, 2);
    return bool2;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aof
 * JD-Core Version:    0.6.0
 */