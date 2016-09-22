package com.wandoujia.p4.imagepicker.activity;

import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import com.wandoujia.p4.imagepicker.fragment.BaseImageTabFragment;

final class a extends Handler
{
  a(ImageChooserActivity paramImageChooserActivity)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 2:
    }
    Fragment localFragment;
    do
    {
      return;
      localFragment = ImageChooserActivity.a(this.a).b(ImageChooserActivity.a(this.a).d());
    }
    while (!(localFragment instanceof BaseImageTabFragment));
    ((BaseImageTabFragment)localFragment).c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.imagepicker.activity.a
 * JD-Core Version:    0.6.0
 */