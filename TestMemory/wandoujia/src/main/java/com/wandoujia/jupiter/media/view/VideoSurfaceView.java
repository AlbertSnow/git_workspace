package com.wandoujia.jupiter.media.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewStub;
import com.wandoujia.jupiter.media.controller.PlayerImpControl;

public class VideoSurfaceView extends VideoPlayView
{
  private SurfaceView b;

  public VideoSurfaceView(Context paramContext)
  {
    super(paramContext);
  }

  public VideoSurfaceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public VideoSurfaceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected final View m()
  {
    this.b = ((SurfaceView)((ViewStub)findViewById(2131494017)).inflate());
    this.b.getHolder().setType(3);
    this.b.getHolder().addCallback(new d(this));
    return this.b;
  }

  protected void setDisplay(PlayerImpControl paramPlayerImpControl)
  {
    paramPlayerImpControl.a(this.b.getHolder(), this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.media.view.VideoSurfaceView
 * JD-Core Version:    0.6.0
 */