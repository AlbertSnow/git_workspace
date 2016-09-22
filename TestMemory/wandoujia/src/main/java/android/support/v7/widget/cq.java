package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.f;
import android.view.View;

final class cq extends a
{
  cq(cp paramcp)
  {
  }

  public final void a(View paramView, f paramf)
  {
    super.a(paramView, paramf);
    if ((!this.b.b.e()) && (this.b.b.getLayoutManager() != null))
      this.b.b.getLayoutManager().a(paramView, paramf);
  }

  public final boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    int i;
    if (super.a(paramView, paramInt, paramBundle))
      i = 1;
    ce localce1;
    do
    {
      boolean bool;
      do
      {
        return i;
        bool = this.b.b.e();
        i = 0;
      }
      while (bool);
      localce1 = this.b.b.getLayoutManager();
      i = 0;
    }
    while (localce1 == null);
    ce localce2 = this.b.b.getLayoutManager();
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.cq
 * JD-Core Version:    0.6.0
 */