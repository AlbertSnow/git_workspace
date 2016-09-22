package com.wandoujia.gamepacket;

import android.view.ViewGroup;

public final class GpuDetectUtils
{
  private static boolean a = false;

  public static void a(ViewGroup paramViewGroup)
  {
    if (!a)
      paramViewGroup.addView(new GpuDetectUtils.GpuInfoFetcherView(paramViewGroup.getContext()));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gamepacket.GpuDetectUtils
 * JD-Core Version:    0.6.0
 */