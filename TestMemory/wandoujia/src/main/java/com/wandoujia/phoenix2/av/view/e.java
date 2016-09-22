package com.wandoujia.phoenix2.av.view;

import android.graphics.Rect;
import android.text.TextPaint;
import android.widget.LinearLayout;
import android.widget.TextView;

final class e
  implements Runnable
{
  e(TextView paramTextView, String paramString, LinearLayout paramLinearLayout)
  {
  }

  public final void run()
  {
    Rect localRect = new Rect();
    this.a.getPaint().getTextBounds(this.b, 0, this.b.length(), localRect);
    LinearLayout localLinearLayout = (LinearLayout)this.c.findViewById(2131493410);
    if (2 * localRect.height() < this.a.getHeight())
    {
      localLinearLayout.setOrientation(1);
      return;
    }
    localLinearLayout.setOrientation(0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.av.view.e
 * JD-Core Version:    0.6.0
 */