package com.wandoujia.launcher.launcher.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.wandoujia.base.utils.ImageUtil;
import com.wandoujia.image.view.AsyncImageView;

public class CircleAsyncImageView extends AsyncImageView
{
  public CircleAsyncImageView(Context paramContext)
  {
    super(paramContext);
  }

  public CircleAsyncImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public CircleAsyncImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    if (paramBitmap != null)
      paramBitmap = ImageUtil.toRoundBitmap(paramBitmap);
    super.setImageBitmap(paramBitmap);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.views.CircleAsyncImageView
 * JD-Core Version:    0.6.0
 */