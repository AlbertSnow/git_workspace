package com.wandoujia.launcher_base.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.launcher_base.R.id;

public final class h
{
  private static final int a = R.id.tag_layout_id;

  public static View a(Context paramContext, int paramInt)
  {
    View localView = LayoutInflater.from(paramContext).inflate(paramInt, null);
    a(localView, paramInt);
    return localView;
  }

  public static View a(ViewGroup paramViewGroup, int paramInt)
  {
    View localView = LayoutInflater.from(paramViewGroup.getContext()).inflate(paramInt, paramViewGroup, false);
    paramViewGroup.addView(localView);
    return localView;
  }

  private static void a(View paramView, int paramInt)
  {
    paramView.setTag(a, Integer.valueOf(paramInt));
  }

  @TargetApi(16)
  public static void a(View paramView, Drawable paramDrawable)
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      paramView.setBackground(paramDrawable);
      return;
    }
    paramView.setBackgroundDrawable(paramDrawable);
  }

  public static View b(ViewGroup paramViewGroup, int paramInt)
  {
    View localView = LayoutInflater.from(paramViewGroup.getContext()).inflate(paramInt, paramViewGroup, false);
    a(localView, paramInt);
    return localView;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.utils.h
 * JD-Core Version:    0.6.0
 */