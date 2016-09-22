package com.wandoujia.p4.netcheck.fragment;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.view.View;
import com.wandoujia.p4.netcheck.controller.NetCheckController.NetcheckType;
import com.wandoujia.p4.netcheck.controller.g;

final class a
  implements g
{
  a(NetCheckCheckingFragment paramNetCheckCheckingFragment, View paramView)
  {
  }

  public final void a(NetCheckController.NetcheckType paramNetcheckType)
  {
    switch (b.a[paramNetcheckType.ordinal()])
    {
    default:
    case 1:
      do
        return;
      while (this.b.getActivity() == null);
      this.b.getActivity().getSupportFragmentManager().a().b(2131493502, new NetCheckFailedFragment()).b();
      return;
    case 2:
      this.a.findViewById(2131493218).setVisibility(0);
      NetCheckCheckingFragment.a(this.b, NetCheckCheckingFragment.e(this.b));
      return;
    case 3:
      this.a.findViewById(2131493219).setVisibility(0);
      NetCheckCheckingFragment.a(this.b, NetCheckCheckingFragment.e(this.b));
      return;
    case 4:
      this.a.findViewById(2131493220).setVisibility(0);
      NetCheckCheckingFragment.a(this.b, NetCheckCheckingFragment.e(this.b));
      return;
    case 5:
      this.a.findViewById(2131493221).setVisibility(0);
      NetCheckCheckingFragment.a(this.b, NetCheckCheckingFragment.e(this.b));
      return;
    case 6:
      this.a.findViewById(2131493222).setVisibility(0);
      NetCheckCheckingFragment.a(this.b, NetCheckCheckingFragment.e(this.b));
      return;
    case 7:
      this.a.findViewById(2131493223).setVisibility(0);
      NetCheckCheckingFragment.a(this.b, NetCheckCheckingFragment.e(this.b));
      return;
    case 8:
    case 9:
    }
    NetCheckCheckingFragment.a(this.b, 0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.fragment.a
 * JD-Core Version:    0.6.0
 */