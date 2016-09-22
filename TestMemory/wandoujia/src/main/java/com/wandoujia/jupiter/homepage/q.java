package com.wandoujia.jupiter.homepage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout.LayoutParams;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.image.view.j;
import com.wandoujia.jupiter.homepage.splashwindow.k;

final class q
  implements j
{
  q(HomePageFragment paramHomePageFragment)
  {
  }

  public final void a(Bitmap paramBitmap)
  {
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)HomePageFragment.q(this.a).getLayoutParams();
    localLayoutParams.height = k.a(paramBitmap, (int)HomePageFragment.q(this.a).getContext().getResources().getDimension(2131427743));
    HomePageFragment.q(this.a).setLayoutParams(localLayoutParams);
    HomePageFragment.q(this.a).getViewTreeObserver().addOnPreDrawListener(new r(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.q
 * JD-Core Version:    0.6.0
 */