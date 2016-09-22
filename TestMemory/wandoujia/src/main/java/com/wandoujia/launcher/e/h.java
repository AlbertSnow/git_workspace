package com.wandoujia.launcher.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.game_launcher.lib.R.id;

public final class h
{
  private static final int a = R.id.tag_layout_id;

  public static View a(ViewGroup paramViewGroup, int paramInt)
  {
    View localView = LayoutInflater.from(paramViewGroup.getContext()).inflate(paramInt, paramViewGroup, false);
    localView.setTag(a, Integer.valueOf(paramInt));
    return localView;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.e.h
 * JD-Core Version:    0.6.0
 */