package com.wandoujia.p4.app.detail.fragment;

import android.support.v4.app.FragmentActivity;
import com.wandoujia.jupiter.view.p;

final class g
  implements Runnable
{
  g(AppCommentsFragment paramAppCommentsFragment)
  {
  }

  public final void run()
  {
    FragmentActivity localFragmentActivity = this.a.getActivity();
    if (localFragmentActivity == null)
      return;
    p.a(localFragmentActivity, new h(this, localFragmentActivity)).a(AppCommentsFragment.h(this.a));
    AppCommentsFragment.l(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.fragment.g
 * JD-Core Version:    0.6.0
 */