package com.google.android.gms.ads.internal.activeview;

import android.view.View;
import com.google.android.gms.ads.internal.state.a;

public final class h
  implements v
{
  private final View a;
  private final a b;

  public h(View paramView, a parama)
  {
    this.a = paramView;
    this.b = parama;
  }

  public final View a()
  {
    return this.a;
  }

  public final boolean b()
  {
    return (this.b == null) || (this.a == null);
  }

  public final v c()
  {
    return this;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.activeview.h
 * JD-Core Version:    0.6.0
 */