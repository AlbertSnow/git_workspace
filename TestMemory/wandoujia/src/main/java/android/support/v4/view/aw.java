package android.support.v4.view;

import android.database.DataSetObserver;

final class aw extends DataSetObserver
  implements cj, ck
{
  private int a;

  private aw(PagerTitleStrip paramPagerTitleStrip)
  {
  }

  public final void a(int paramInt)
  {
    if (this.a == 0)
    {
      this.b.a(this.b.a.getCurrentItem(), this.b.a.getAdapter());
      boolean bool = PagerTitleStrip.a(this.b) < 0.0F;
      float f = 0.0F;
      if (!bool)
        f = PagerTitleStrip.a(this.b);
      this.b.a(this.b.a.getCurrentItem(), f, true);
    }
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    if (paramFloat > 0.5F)
      paramInt1++;
    this.b.a(paramInt1, paramFloat, false);
  }

  public final void a(at paramat1, at paramat2)
  {
    this.b.a(paramat1, paramat2);
  }

  public final void b(int paramInt)
  {
    this.a = paramInt;
  }

  public final void onChanged()
  {
    this.b.a(this.b.a.getCurrentItem(), this.b.a.getAdapter());
    boolean bool = PagerTitleStrip.a(this.b) < 0.0F;
    float f = 0.0F;
    if (!bool)
      f = PagerTitleStrip.a(this.b);
    this.b.a(this.b.a.getCurrentItem(), f, true);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.aw
 * JD-Core Version:    0.6.0
 */