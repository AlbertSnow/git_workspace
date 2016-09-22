package com.google.android.gms.ads.internal.overlay;

import hm;
import hp;

final class c
  implements hp
{
  hp a = null;

  c(a parama)
  {
  }

  public final void a(hm paramhm)
  {
    this.b.a("PlayerError", paramhm.getMessage());
    if (this.a != null)
      this.a.a(paramhm);
  }

  public final void a(boolean paramBoolean, int paramInt)
  {
    if (this.a != null)
      this.a.a(paramBoolean, paramInt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.c
 * JD-Core Version:    0.6.0
 */