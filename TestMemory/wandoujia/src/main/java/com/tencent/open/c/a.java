package com.tencent.open.c;

import android.app.Activity;
import android.view.Display;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

public class a extends RelativeLayout
{
  static
  {
    a.class.getName();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    View.MeasureSpec.getSize(paramInt2);
    Activity localActivity = (Activity)getContext();
    localActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(null);
    localActivity.getWindowManager().getDefaultDisplay().getHeight();
    super.onMeasure(paramInt1, paramInt2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.c.a
 * JD-Core Version:    0.6.0
 */