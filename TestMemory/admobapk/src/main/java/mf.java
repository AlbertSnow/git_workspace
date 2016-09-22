import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.g;
import com.google.android.gms.ads.formats.i;
import com.google.android.gms.ads.internal.client.ab;
import com.google.android.gms.ads.internal.client.k;
import com.google.android.gms.ads.internal.client.o;
import com.google.android.gms.ads.internal.client.q;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.client.ai;
import com.google.android.gms.ads.internal.formats.client.aj;
import com.google.android.gms.ads.internal.mediation.client.a;
import com.google.android.gms.ads.internal.util.client.e;

public final class mf
{
  private final Context a;
  private final ab b;

  private mf(Context paramContext, ab paramab)
  {
    this.a = paramContext;
    this.b = paramab;
  }

  public mf(Context paramContext, String paramString)
  {
    this((Context)anw.a(paramContext, "context cannot be null"), (ab)k.a(paramContext, false, new o(q.a().b, paramContext, paramString, new a())));
  }

  public final me a()
  {
    try
    {
      me localme = new me(this.a, this.b.a());
      return localme;
    }
    catch (RemoteException localRemoteException)
    {
      e.b("Failed to build AdLoader.", localRemoteException);
    }
    return null;
  }

  public final mf a(com.google.android.gms.ads.formats.c paramc)
  {
    try
    {
      this.b.a(new NativeAdOptionsParcel(paramc));
      return this;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Failed to specify native ad options", localRemoteException);
    }
    return this;
  }

  public final mf a(g paramg)
  {
    try
    {
      this.b.a(new ai(paramg));
      return this;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Failed to add app install ad listener", localRemoteException);
    }
    return this;
  }

  public final mf a(i parami)
  {
    try
    {
      this.b.a(new aj(parami));
      return this;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Failed to add content ad listener", localRemoteException);
    }
    return this;
  }

  public final mf a(md parammd)
  {
    try
    {
      this.b.a(new com.google.android.gms.ads.internal.client.c(parammd));
      return this;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Failed to set AdListener.", localRemoteException);
    }
    return this;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     mf
 * JD-Core Version:    0.6.0
 */