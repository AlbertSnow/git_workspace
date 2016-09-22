package com.alipay.wandoujia;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ScrollView;

final class cb extends ad
{
  cb(ca paramca, ViewGroup paramViewGroup)
  {
  }

  public final void a(int paramInt)
  {
    if (ca.a(this.a) != null)
    {
      ca.a(this.a).setBackgroundResource(paramInt);
      return;
    }
    this.b.setBackgroundResource(paramInt);
  }

  public final void a(Drawable paramDrawable)
  {
    if (ca.a(this.a) != null)
    {
      ca.a(this.a).setBackgroundDrawable(paramDrawable);
      return;
    }
    this.b.setBackgroundDrawable(paramDrawable);
  }

  public final void onError()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.cb
 * JD-Core Version:    0.6.0
 */