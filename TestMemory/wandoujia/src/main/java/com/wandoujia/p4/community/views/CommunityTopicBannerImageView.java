package com.wandoujia.p4.community.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.wandoujia.image.view.AsyncImageView;

public class CommunityTopicBannerImageView extends AsyncImageView
{
  private Paint a = new Paint();
  private Rect b;

  public CommunityTopicBannerImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a.setAntiAlias(true);
  }

  protected void onAttachedToWindow()
  {
    a(true);
    super.onAttachedToWindow();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((getDrawable() != null) && (this.b != null))
      paramCanvas.drawRect(this.b, this.a);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramBoolean) || ((this.b == null) && (paramInt3 - paramInt1 > 0) && (paramInt4 - paramInt2 > 0)))
    {
      this.a.setColor(-1728053248);
      this.b = new Rect(0, 0, getWidth(), getHeight());
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.CommunityTopicBannerImageView
 * JD-Core Version:    0.6.0
 */