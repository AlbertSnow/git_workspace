package com.wandoujia.jupiter.media.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewStub;
import com.wandoujia.jupiter.media.controller.PlayerImpControl;

@TargetApi(14)
public class VideoTextureView extends VideoPlayView
{
  private TextureView b;

  public VideoTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public VideoTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected final View m()
  {
    this.b = ((TextureView)((ViewStub)findViewById(2131494017)).inflate());
    if (this.b.isAvailable())
      g();
    this.b.setSurfaceTextureListener(new e(this));
    return this.b;
  }

  protected void setDisplay(PlayerImpControl paramPlayerImpControl)
  {
    paramPlayerImpControl.a(new Surface(this.b.getSurfaceTexture()), this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.media.view.VideoTextureView
 * JD-Core Version:    0.6.0
 */