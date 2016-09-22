import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;

public class ahx
{
  private static ahx b;
  public final Context a;

  private ahx(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
  }

  public static ahx a(Context paramContext)
  {
    anw.a(paramContext);
    monitorenter;
    try
    {
      if (b == null)
      {
        oz.a(paramContext);
        b = new ahx(paramContext);
      }
      return b;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  static pa a(PackageInfo paramPackageInfo, pa[] paramArrayOfpa)
  {
    int i = 0;
    if (paramPackageInfo.signatures == null)
      return null;
    if (paramPackageInfo.signatures.length != 1)
    {
      Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
      return null;
    }
    pb localpb = new pb(paramPackageInfo.signatures[0].toByteArray());
    while (i < paramArrayOfpa.length)
    {
      if (paramArrayOfpa[i].equals(localpb))
        return paramArrayOfpa[i];
      i++;
    }
    return null;
  }

  public final boolean a(PackageInfo paramPackageInfo, boolean paramBoolean)
  {
    if ((paramPackageInfo != null) && (paramPackageInfo.signatures != null))
    {
      if (paramBoolean);
      pa[] arrayOfpa;
      for (pa localpa = a(paramPackageInfo, pd.a); localpa != null; localpa = a(paramPackageInfo, arrayOfpa))
      {
        return true;
        arrayOfpa = new pa[1];
        arrayOfpa[0] = pd.a[0];
      }
    }
    return false;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ahx
 * JD-Core Version:    0.6.0
 */