package com.wandoujia.p4.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView.ScaleType;
import com.wandoujia.image.view.AsyncImageView;

public class LocalThumbnailAsyncImageView extends AsyncImageView
{
  public LocalThumbnailAsyncImageView(Context paramContext)
  {
    super(paramContext);
  }

  public LocalThumbnailAsyncImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public LocalThumbnailAsyncImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    setScaleType(ImageView.ScaleType.CENTER_CROP);
    super.setImageBitmap(paramBitmap);
  }

  public void setImageResource(int paramInt)
  {
    setScaleType(ImageView.ScaleType.CENTER);
    super.setImageResource(paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.LocalThumbnailAsyncImageView
 * JD-Core Version:    0.6.0
 */