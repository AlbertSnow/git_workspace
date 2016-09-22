import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ah;
import com.google.android.gms.ads.internal.client.b;
import com.google.android.gms.ads.internal.client.bi;
import com.google.android.gms.ads.internal.client.bm;
import com.google.android.gms.ads.internal.client.c;
import com.google.android.gms.ads.internal.client.h;
import com.google.android.gms.ads.internal.client.k;
import com.google.android.gms.ads.internal.client.n;
import com.google.android.gms.ads.internal.client.q;
import com.google.android.gms.ads.internal.reward.client.o;
import com.google.android.gms.ads.internal.util.client.e;

public final class mm
{
  public final bm a;

  public mm(Context paramContext)
  {
    this.a = new bm(paramContext);
  }

  public final void a(String paramString)
  {
    bm localbm = this.a;
    if (localbm.f != null)
      throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    localbm.f = paramString;
  }

  public final void a(mg parammg)
  {
    bm localbm = this.a;
    bi localbi = parammg.b;
    try
    {
      if (localbm.e == null)
      {
        if (localbm.f == null)
          localbm.a("loadAd");
        if (!localbm.h)
          break label203;
      }
      label203: for (AdSizeParcel localAdSizeParcel = AdSizeParcel.b(); ; localAdSizeParcel = new AdSizeParcel())
      {
        k localk = q.a().b;
        Context localContext = localbm.b;
        localbm.e = ((ah)k.a(localContext, false, new n(localk, localContext, localAdSizeParcel, localbm.f, localbm.a)));
        if (localbm.c != null)
          localbm.e.a(new c(localbm.c));
        if (localbm.d != null)
          localbm.e.a(new b(localbm.d));
        if (localbm.g != null)
          localbm.e.a(new o(localbm.g));
        if (!localbm.e.a(h.a(localbm.b, localbi)))
          break;
        localbm.a.a = localbi.i;
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Failed to load ad.", localRemoteException);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     mm
 * JD-Core Version:    0.6.0
 */