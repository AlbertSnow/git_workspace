package com.wandoujia.p4.fragment;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.nispok.snackbar.Snackbar;
import com.wandoujia.jupiter.view.p;

final class i extends Handler
{
  i(h paramh)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    NetworkListAsyncloadFragment.Message localMessage = NetworkListAsyncloadFragment.Message.values()[i];
    switch (g.a[localMessage.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      new Handler(Looper.getMainLooper()).postDelayed(new j(this), 1000L);
      return;
      h.a(this.a, p.a(h.b(this.a), 2131625241, p.b));
      h.c(this.a).a();
      h.d(this.a);
      continue;
      Snackbar.a(this.a.a.getActivity()).a(2131625240).b(this.a.a.getActivity());
      continue;
      Snackbar.a(this.a.a.getActivity()).a(2131625236).b(this.a.a.getActivity());
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.fragment.i
 * JD-Core Version:    0.6.0
 */