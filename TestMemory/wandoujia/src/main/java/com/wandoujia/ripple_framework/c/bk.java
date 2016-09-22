package com.wandoujia.ripple_framework.c;

import android.widget.ImageView;
import com.wandoujia.api.proto.Image;
import com.wandoujia.base.log.Log;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.view.e;

final class bk
  implements Runnable
{
  bk(bj parambj, int paramInt)
  {
  }

  public final void run()
  {
    String str = bi.b();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = Integer.valueOf(this.b.a.getHeight());
    Log.d(str, "2 coverView want height=%s and actual height = %s", arrayOfObject);
    new e();
    e.b(this.b.a, this.b.b.url, R.color.grey_96);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.bk
 * JD-Core Version:    0.6.0
 */