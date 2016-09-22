import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.client.ah;
import com.google.android.gms.ads.internal.client.b;
import com.google.android.gms.ads.internal.client.bi;
import com.google.android.gms.ads.internal.client.bk;
import com.google.android.gms.ads.internal.client.c;
import com.google.android.gms.ads.internal.client.h;
import com.google.android.gms.ads.internal.client.k;
import com.google.android.gms.ads.internal.client.l;
import com.google.android.gms.ads.internal.client.m;
import com.google.android.gms.ads.internal.client.q;
import com.google.android.gms.ads.internal.client.r;
import com.google.android.gms.ads.internal.util.client.e;

class ml extends ViewGroup
{
  private bk a = new bk(this, false);

  public ml(Context paramContext, int paramInt)
  {
    super(paramContext);
  }

  public void a()
  {
    bk localbk = this.a;
    try
    {
      if (localbk.f != null)
        localbk.f.i();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Failed to call resume.", localRemoteException);
    }
  }

  public void a(String paramString)
  {
    bk localbk = this.a;
    if (localbk.g != null)
      throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    localbk.g = paramString;
  }

  public void a(md parammd)
  {
    this.a.c.a(parammd);
    if ((parammd != null) && ((parammd instanceof a)))
      this.a.a((a)parammd);
    do
      return;
    while (parammd != null);
    this.a.a(null);
  }

  public void a(mg parammg)
  {
    bk localbk = this.a;
    bi localbi = parammg.b;
    try
    {
      if (localbk.f != null)
        break label194;
      if (((localbk.e != null) && (localbk.g != null)) || (localbk.f != null))
        break label58;
      throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Failed to load ad.", localRemoteException);
    }
    return;
    label58: Context localContext = localbk.h.getContext();
    AdSizeParcel localAdSizeParcel = bk.a(localContext, localbk.e, localbk.i);
    if ("search_v2".equals(localAdSizeParcel.b));
    for (ah localah = (ah)k.a(localContext, false, new m(q.a().b, localContext, localAdSizeParcel, localbk.g)); ; localah = (ah)k.a(localContext, false, new l(q.a().b, localContext, localAdSizeParcel, localbk.g, localbk.a)))
    {
      localbk.f = localah;
      localbk.f.a(new c(localbk.c));
      if (localbk.d != null)
        localbk.f.a(new b(localbk.d));
      localbk.f.a(false);
      localbk.c();
      label194: if (!localbk.f.a(h.a(localbk.h.getContext(), localbi)))
        break;
      localbk.a.a = localbi.i;
      return;
    }
  }

  public void a(mi parammi)
  {
    bk localbk = this.a;
    mi[] arrayOfmi = { parammi };
    if (localbk.e != null)
      throw new IllegalStateException("The ad size can only be set once on AdView.");
    localbk.a(arrayOfmi);
  }

  public void b()
  {
    bk localbk = this.a;
    try
    {
      if (localbk.f != null)
        localbk.f.h();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Failed to call pause.", localRemoteException);
    }
  }

  public mi c()
  {
    return this.a.a();
  }

  public void d()
  {
    bk localbk = this.a;
    try
    {
      if (localbk.f != null)
        localbk.f.a();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Failed to destroy AdView.", localRemoteException);
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = getChildAt(0);
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      int i = localView.getMeasuredWidth();
      int j = localView.getMeasuredHeight();
      int k = (paramInt3 - paramInt1 - i) / 2;
      int m = (paramInt4 - paramInt2 - j) / 2;
      localView.layout(k, m, i + k, j + m);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    View localView = getChildAt(0);
    int j;
    int i;
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      measureChild(localView, paramInt1, paramInt2);
      j = localView.getMeasuredWidth();
      i = localView.getMeasuredHeight();
    }
    while (true)
    {
      int k = Math.max(j, getSuggestedMinimumWidth());
      int m = Math.max(i, getSuggestedMinimumHeight());
      setMeasuredDimension(View.resolveSize(k, paramInt1), View.resolveSize(m, paramInt2));
      return;
      mi localmi = c();
      if (localmi != null)
      {
        Context localContext = getContext();
        j = localmi.b(localContext);
        i = localmi.a(localContext);
        continue;
      }
      i = 0;
      j = 0;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ml
 * JD-Core Version:    0.6.0
 */