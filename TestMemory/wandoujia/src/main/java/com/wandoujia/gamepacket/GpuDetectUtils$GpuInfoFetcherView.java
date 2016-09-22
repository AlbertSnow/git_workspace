package com.wandoujia.gamepacket;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

class GpuDetectUtils$GpuInfoFetcherView extends GLSurfaceView
{
  public GpuDetectUtils$GpuInfoFetcherView(Context paramContext)
  {
    super(paramContext);
    setRenderer(new q(this));
  }

  public GpuDetectUtils$GpuInfoFetcherView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setRenderer(new q(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gamepacket.GpuDetectUtils.GpuInfoFetcherView
 * JD-Core Version:    0.6.0
 */