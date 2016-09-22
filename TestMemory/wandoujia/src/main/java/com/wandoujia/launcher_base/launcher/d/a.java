package com.wandoujia.launcher_base.launcher.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import com.wandoujia.launcher_base.R.dimen;
import com.wandoujia.launcher_base.R.layout;

public final class a
{
  private View a;
  private String b;
  private String c;
  private String d;
  private int e = -1;

  public a(View paramView, String paramString1, String paramString2)
  {
    this.a = paramView;
    this.b = paramString1;
    this.c = paramString2;
  }

  public final a a(String paramString, int paramInt)
  {
    this.d = paramString;
    this.e = paramInt;
    return this;
  }

  public final void a()
  {
    View localView = LayoutInflater.from(this.a.getContext()).inflate(R.layout.popup_uninstall, null);
    PopupWindow localPopupWindow = new PopupWindow(localView, -2, -2, true);
    localPopupWindow.setTouchable(true);
    localPopupWindow.setBackgroundDrawable(new BitmapDrawable());
    localPopupWindow.setOutsideTouchable(true);
    int[] arrayOfInt = new int[2];
    this.a.getLocationOnScreen(arrayOfInt);
    localPopupWindow.showAtLocation(this.a, 51, arrayOfInt[0], arrayOfInt[1] + this.a.getHeight() - this.a.getResources().getDimensionPixelOffset(R.dimen.margin_huge));
    ((Vibrator)this.a.getContext().getSystemService("vibrator")).vibrate(200L);
    localView.setOnClickListener(new b(this, localPopupWindow));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.launcher.d.a
 * JD-Core Version:    0.6.0
 */