package com.wandoujia.ripple_framework.view;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.i;

public final class ToolbarMenuThemeBinder
{
  private static final int[] a;

  static
  {
    int[] arrayOfInt = new int[6];
    arrayOfInt[0] = R.id.open_app;
    arrayOfInt[1] = R.id.share_operation;
    arrayOfInt[2] = R.id.close;
    arrayOfInt[3] = R.id.unfavorited;
    arrayOfInt[4] = R.id.fav_number;
    arrayOfInt[5] = R.id.share_number;
    a = arrayOfInt;
  }

  public static void a(View paramView, ToolbarMenuThemeBinder.Theme paramTheme)
  {
    for (int i = 0; i < 6; i++)
    {
      View localView = paramView.findViewById(a[i]);
      if (a[i] == R.id.unfavorited)
      {
        if ((localView.getParent() instanceof FavorView))
          ((FavorView)localView.getParent()).setLevel(paramTheme.drawableLevel);
        if ("Night".equals(i.k().e()))
          continue;
      }
      if ((localView instanceof ImageView))
        ((ImageView)localView).getDrawable().setLevel(paramTheme.drawableLevel);
      if (!(localView instanceof TextView))
        continue;
      ((TextView)localView).setTextColor(paramTheme.textColor);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.ToolbarMenuThemeBinder
 * JD-Core Version:    0.6.0
 */