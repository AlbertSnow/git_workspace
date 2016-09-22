package com.wandoujia.p4.imagepicker.activity;

import android.support.v4.app.Fragment;
import android.support.v4.view.ck;
import com.wandoujia.p4.imagepicker.fragment.BaseImageTabFragment;

final class b
  implements ck
{
  b(ImageChooserActivity paramImageChooserActivity)
  {
  }

  public final void a(int paramInt)
  {
    Fragment localFragment = ImageChooserActivity.a(this.a).b(paramInt);
    if ((localFragment instanceof BaseImageTabFragment))
      ((BaseImageTabFragment)localFragment).c();
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
  }

  public final void b(int paramInt)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.imagepicker.activity.b
 * JD-Core Version:    0.6.0
 */