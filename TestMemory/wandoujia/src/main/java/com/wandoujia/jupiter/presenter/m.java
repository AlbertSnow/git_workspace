package com.wandoujia.jupiter.presenter;

import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.wandoujia.api.proto.MorphData;
import com.wandoujia.api.proto.MorphDataProperty;

final class m
  implements Runnable
{
  m(k paramk, ImageView paramImageView, MorphData paramMorphData)
  {
  }

  public final void run()
  {
    if (this.a.getScaleType() != ImageView.ScaleType.CENTER_CROP)
    {
      int i = this.a.getWidth();
      ViewGroup.LayoutParams localLayoutParams = this.a.getLayoutParams();
      localLayoutParams.height = (i * this.b.property.height.intValue() / this.b.property.width.intValue());
      this.a.setLayoutParams(localLayoutParams);
    }
    this.a.post(new n(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.m
 * JD-Core Version:    0.6.0
 */