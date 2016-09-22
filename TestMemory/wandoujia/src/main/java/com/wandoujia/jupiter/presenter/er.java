package com.wandoujia.jupiter.presenter;

import android.content.Context;
import com.android.volley.k;
import com.wandoujia.api.proto.HttpResponse;
import java.lang.ref.WeakReference;

final class er
  implements k<HttpResponse>
{
  private final WeakReference<Context> a;

  private er(Context paramContext)
  {
    this.a = new WeakReference(paramContext);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.er
 * JD-Core Version:    0.6.0
 */