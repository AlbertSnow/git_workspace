package com.wandoujia.jupiter.imageviewer.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.v4.app.b;
import android.util.AttributeSet;
import com.wandoujia.base.utils.ImageUtil;

public class GalleryImageView extends TouchImageView
{
  private String c;

  public GalleryImageView(Context paramContext)
  {
    this(paramContext, null);
  }

  public GalleryImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public Bitmap getImageBitmap()
  {
    return ImageUtil.drawableToBitmap(getDrawable(), new Bitmap.Config[0]);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramBoolean) && (paramInt3 - paramInt1 > 0) && (paramInt4 - paramInt2 > 0))
    {
      if (b.E(this.c))
        a(this.c, 2131361864);
    }
    else
      return;
    e(this.c, 2131361864);
  }

  public void setUrl(String paramString)
  {
    this.c = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.imageviewer.views.GalleryImageView
 * JD-Core Version:    0.6.0
 */