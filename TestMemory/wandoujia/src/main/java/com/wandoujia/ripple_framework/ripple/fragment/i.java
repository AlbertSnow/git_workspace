package com.wandoujia.ripple_framework.ripple.fragment;

import android.support.v4.app.b;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.R.drawable;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.theme.e;

final class i
  implements e
{
  i(FeedDetailFragment paramFeedDetailFragment)
  {
  }

  public final void a()
  {
    b.c(FeedDetailFragment.j(this.a).findViewById(R.id.detail_toolbar), R.color.bg_default);
    ((ImageView)FeedDetailFragment.k(this.a).findViewById(R.id.close)).setImageDrawable(b.o(R.drawable.cancel_black));
    ((ImageView)FeedDetailFragment.l(this.a).findViewById(R.id.share_operation)).setImageDrawable(b.o(R.drawable.ic_share));
    ((ImageView)FeedDetailFragment.m(this.a).findViewById(R.id.open_app)).setImageDrawable(b.o(R.drawable.go));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.ripple.fragment.i
 * JD-Core Version:    0.6.0
 */