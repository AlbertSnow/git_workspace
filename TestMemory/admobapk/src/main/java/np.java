import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class np
{
  public static final aia a;
  private static aig o = new aig();
  private static aib p = new nq();
  private static nv q;
  final Context b;
  final String c;
  final int d;
  String e;
  int f = -1;
  String g;
  String h;
  final boolean i;
  public final nv j;
  final aom k;
  final no l;
  nu m;
  public final ns n;
  private int r = 0;

  static
  {
    a = new aia("ClearcutLogger.API", p, o);
    q = new nx();
  }

  private np(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean, nv paramnv, aom paramaom, nu paramnu, no paramno, ns paramns)
  {
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null)
    {
      this.b = localContext;
      this.c = paramContext.getPackageName();
      this.d = a(paramContext);
      this.f = -1;
      this.e = paramString1;
      this.g = paramString2;
      this.h = null;
      this.i = false;
      this.j = paramnv;
      this.k = paramaom;
      this.m = new nu();
      this.l = paramno;
      this.r = 0;
      this.n = paramns;
      if (this.i)
        if (this.g != null)
          break label144;
    }
    label144: for (boolean bool = true; ; bool = false)
    {
      anw.b(bool, "can't be anonymous with an upload account");
      return;
      localContext = paramContext;
      break;
    }
  }

  public np(Context paramContext, String paramString1, String paramString2)
  {
    this(paramContext, -1, paramString1, null, null, false, q, aon.d(), null, no.b, new or(paramContext));
  }

  private static int a(Context paramContext)
  {
    try
    {
      int i1 = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode;
      return i1;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Log.wtf("ClearcutLogger", "This can't happen.");
    }
    return 0;
  }

  static int[] a(ArrayList paramArrayList)
  {
    if (paramArrayList == null)
      return null;
    int[] arrayOfInt = new int[paramArrayList.size()];
    Iterator localIterator = paramArrayList.iterator();
    int i3;
    for (int i1 = 0; localIterator.hasNext(); i1 = i3)
    {
      int i2 = ((Integer)localIterator.next()).intValue();
      i3 = i1 + 1;
      arrayOfInt[i1] = i2;
    }
    return arrayOfInt;
  }

  static String[] b(ArrayList paramArrayList)
  {
    if (paramArrayList == null)
      return null;
    return (String[])paramArrayList.toArray(new String[0]);
  }

  static byte[][] c(ArrayList paramArrayList)
  {
    if (paramArrayList == null)
      return null;
    return (byte[][])paramArrayList.toArray(new byte[0][]);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     np
 * JD-Core Version:    0.6.0
 */