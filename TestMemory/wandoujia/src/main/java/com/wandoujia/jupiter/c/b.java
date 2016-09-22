package com.wandoujia.jupiter.c;

import android.view.View;
import android.widget.TextView;
import com.wandoujia.ripple_framework.view.a.h;
import java.util.concurrent.CountDownLatch;

final class b
  implements Runnable
{
  b(a parama, boolean[] paramArrayOfBoolean, CountDownLatch paramCountDownLatch)
  {
  }

  public final void run()
  {
    View localView = com.wandoujia.p4.utils.c.a(a.a(this.c), 2130903258);
    ((TextView)localView.findViewById(2131492998)).setText(2131624176);
    h localh = new h(a.b(this.c));
    localh.a(2131624156, new c(this, localView));
    localh.b(2131624330, new d(this, localView));
    localh.a(new e(this));
    localh.a(localView);
    localh.a().show();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.c.b
 * JD-Core Version:    0.6.0
 */