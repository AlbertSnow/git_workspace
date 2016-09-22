package com.wandoujia.ripple_framework.view;

import android.support.v4.app.b;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.R.layout;

public class av extends ax
{
  protected int a()
  {
    return R.layout.rip_spinner_item;
  }

  public final View a(ViewGroup paramViewGroup)
  {
    return b.a(paramViewGroup, b());
  }

  protected int b()
  {
    return R.layout.rip_spinner_divider;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ViewGroup localViewGroup = (ViewGroup)b.a(paramViewGroup, a());
    ay localay = a(paramInt);
    ImageView localImageView = (ImageView)localViewGroup.findViewById(R.id.icon);
    if (localImageView != null)
      localImageView.setVisibility(8);
    TextView localTextView = (TextView)localViewGroup.findViewById(R.id.title);
    if (localTextView != null)
      Spinner.a(localay, localTextView);
    return localViewGroup;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.av
 * JD-Core Version:    0.6.0
 */