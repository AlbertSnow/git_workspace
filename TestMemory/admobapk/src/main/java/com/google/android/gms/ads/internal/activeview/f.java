package com.google.android.gms.ads.internal.activeview;

import android.view.View;
import com.google.android.gms.ads.internal.formats.h;
import java.lang.ref.WeakReference;

public final class f
  implements v
{
  private WeakReference a;

  public f(h paramh)
  {
    this.a = new WeakReference(paramh);
  }

  public final View a()
  {
    h localh = (h)this.a.get();
    if (localh != null)
      return localh.e();
    return null;
  }

  public final boolean b()
  {
    return this.a.get() == null;
  }

  public final v c()
  {
    return new g((h)this.a.get());
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.activeview.f
 * JD-Core Version:    0.6.0
 */