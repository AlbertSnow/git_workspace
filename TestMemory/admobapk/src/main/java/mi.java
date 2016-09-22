import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.q;
import com.google.android.gms.ads.internal.util.client.a;

public final class mi
{
  public static final mi a = new mi(320, 50, "320x50_mb");
  public static final mi b = new mi(468, 60, "468x60_as");
  public static final mi c = new mi(320, 100, "320x100_as");
  public static final mi d = new mi(728, 90, "728x90_as");
  public static final mi e = new mi(300, 250, "300x250_as");
  public static final mi f = new mi(160, 600, "160x600_as");
  public static final mi g = new mi(-1, -2, "smart_banner");
  public static final mi h = new mi(-3, -4, "fluid");
  public final int i;
  public final int j;
  private final String k;

  static
  {
    new mi(-3, 0, "search_v2");
  }

  public mi(int paramInt1, int paramInt2)
  {
  }

  mi(int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 < 0) && (paramInt1 != -1) && (paramInt1 != -3))
      throw new IllegalArgumentException(37 + "Invalid width for AdSize: " + paramInt1);
    if ((paramInt2 < 0) && (paramInt2 != -2) && (paramInt2 != -4))
      throw new IllegalArgumentException(38 + "Invalid height for AdSize: " + paramInt2);
    this.i = paramInt1;
    this.j = paramInt2;
    this.k = paramString;
  }

  public final int a(Context paramContext)
  {
    switch (this.j)
    {
    default:
      return q.a().a.a(paramContext, this.j);
    case -2:
      return AdSizeParcel.b(paramContext.getResources().getDisplayMetrics());
    case -4:
    case -3:
    }
    return -1;
  }

  public final int b(Context paramContext)
  {
    switch (this.i)
    {
    case -2:
    default:
      return q.a().a.a(paramContext, this.i);
    case -1:
      return AdSizeParcel.a(paramContext.getResources().getDisplayMetrics());
    case -4:
    case -3:
    }
    return -1;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    mi localmi;
    do
    {
      return true;
      if (!(paramObject instanceof mi))
        return false;
      localmi = (mi)paramObject;
    }
    while ((this.i == localmi.i) && (this.j == localmi.j) && (this.k.equals(localmi.k)));
    return false;
  }

  public final int hashCode()
  {
    return this.k.hashCode();
  }

  public final String toString()
  {
    return this.k;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     mi
 * JD-Core Version:    0.6.0
 */