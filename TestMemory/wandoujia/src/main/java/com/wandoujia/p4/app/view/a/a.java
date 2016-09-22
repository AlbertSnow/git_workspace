package com.wandoujia.p4.app.view.a;

import android.content.Context;
import com.wandoujia.ripple_framework.view.a.h;

public final class a
{
  private final Context a;
  private h b;
  private boolean c = false;

  public a(Context paramContext, boolean paramBoolean)
  {
    this.a = paramContext;
    this.c = paramBoolean;
  }

  public final void a()
  {
    this.b = new h(this.a);
    h localh1 = this.b;
    int i;
    int j;
    label53: int k;
    label78: h localh4;
    if (this.c)
    {
      i = 2131624619;
      localh1.a(i);
      h localh2 = this.b;
      if (!this.c)
        break label142;
      j = 2131624617;
      localh2.b(j);
      h localh3 = this.b;
      if (!this.c)
        break label149;
      k = 2131624614;
      localh3.a(k, new b());
      localh4 = this.b;
      if (!this.c)
        break label156;
    }
    label142: label149: label156: for (int m = 2131624611; ; m = 2131624613)
    {
      localh4.b(m, new c());
      this.b.a().show();
      return;
      i = 2131624323;
      break;
      j = 2131624618;
      break label53;
      k = 2131624612;
      break label78;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.view.a.a
 * JD-Core Version:    0.6.0
 */