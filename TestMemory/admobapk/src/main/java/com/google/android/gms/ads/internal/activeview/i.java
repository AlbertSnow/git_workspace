package com.google.android.gms.ads.internal.activeview;

import android.view.View;
import com.google.android.gms.ads.internal.state.a;
import java.lang.ref.WeakReference;

public final class i
  implements v
{
  private final WeakReference a;
  private final WeakReference b;

  public i(View paramView, a parama)
  {
    this.a = new WeakReference(paramView);
    this.b = new WeakReference(parama);
  }

  public final View a()
  {
    return (View)this.a.get();
  }

  public final boolean b()
  {
    return (this.a.get() == null) || (this.b.get() == null);
  }

  public final v c()
  {
    return new h((View)this.a.get(), (a)this.b.get());
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.activeview.i
 * JD-Core Version:    0.6.0
 */