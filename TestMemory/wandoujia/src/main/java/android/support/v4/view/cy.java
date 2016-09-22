package android.support.v4.view;

import android.view.View;

final class cy
  implements dh
{
  private cu a;

  cy(cu paramcu)
  {
    this.a = paramcu;
  }

  public final void a(View paramView)
  {
    if (cu.b(this.a) >= 0)
      bg.a(paramView, 2, null);
    cu.e();
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof dh));
    for (dh localdh = (dh)localObject; ; localdh = null)
    {
      if (localdh != null)
        localdh.a(paramView);
      return;
    }
  }

  public final void b(View paramView)
  {
    if (cu.b(this.a) >= 0)
    {
      bg.a(paramView, cu.b(this.a), null);
      cu.a(this.a);
    }
    cu.f();
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof dh));
    for (dh localdh = (dh)localObject; ; localdh = null)
    {
      if (localdh != null)
        localdh.b(paramView);
      return;
    }
  }

  public final void c(View paramView)
  {
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof dh));
    for (dh localdh = (dh)localObject; ; localdh = null)
    {
      if (localdh != null)
        localdh.c(paramView);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.cy
 * JD-Core Version:    0.6.0
 */