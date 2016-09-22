package com.wandoujia.ripple_framework.c;

import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.wandoujia.api.proto.Image;
import com.wandoujia.base.log.Log;

final class bj
  implements Runnable
{
  bj(ImageView paramImageView, float paramFloat, Image paramImage)
  {
  }

  public final void run()
  {
    int i = (int)(this.a.getWidth() / this.c);
    ViewGroup.LayoutParams localLayoutParams = this.a.getLayoutParams();
    localLayoutParams.height = i;
    this.a.setLayoutParams(localLayoutParams);
    String str = bi.b();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(i);
    arrayOfObject[1] = Integer.valueOf(this.a.getHeight());
    Log.d(str, "1 coverView want height=%s and actual height = %s", arrayOfObject);
    this.a.post(new bk(this, i));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.bj
 * JD-Core Version:    0.6.0
 */