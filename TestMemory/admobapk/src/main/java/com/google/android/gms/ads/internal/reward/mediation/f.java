package com.google.android.gms.ads.internal.reward.mediation;

import apj;
import apn;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.b;

@a
public final class f extends b
{
  d a;
  g b;
  private e c;

  public f(e parame)
  {
    this.c = parame;
  }

  public final void a(apj paramapj)
  {
    if (this.a != null)
      this.a.e();
  }

  public final void a(apj paramapj, int paramInt)
  {
    if (this.a != null)
      this.a.f();
  }

  public final void a(apj paramapj, RewardItemParcel paramRewardItemParcel)
  {
    if (this.c != null)
      this.c.b(paramRewardItemParcel);
  }

  public final void b(apj paramapj)
  {
    if (this.b != null)
      this.b.a(apn.a(paramapj).getClass().getName());
  }

  public final void b(apj paramapj, int paramInt)
  {
    if (this.b != null)
    {
      g localg = this.b;
      apn.a(paramapj).getClass().getName();
      localg.a(paramInt);
    }
  }

  public final void c(apj paramapj)
  {
    if (this.c != null)
      this.c.I();
  }

  public final void d(apj paramapj)
  {
    if (this.c != null)
      this.c.J();
  }

  public final void e(apj paramapj)
  {
    if (this.c != null)
      this.c.K();
  }

  public final void f(apj paramapj)
  {
    if (this.c != null)
      this.c.L();
  }

  public final void g(apj paramapj)
  {
    if (this.c != null)
      this.c.M();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.reward.mediation.f
 * JD-Core Version:    0.6.0
 */