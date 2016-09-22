package com.wandoujia.jupiter.media.controller;

import android.content.Context;
import android.media.AudioManager;
import android.support.v4.app.b;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.wandoujia.base.utils.TextUtil;
import com.wandoujia.jupiter.media.view.VideoPlayView;

final class l
  implements View.OnTouchListener
{
  l(h paramh)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (this.a.a == null);
    float f1;
    float f2;
    label350: label496: 
    do
    {
      do
      {
        return false;
        switch (paramMotionEvent.getAction())
        {
        default:
          return false;
        case 0:
          h.a(this.a, paramMotionEvent.getX());
          h.b(this.a, paramMotionEvent.getY());
          h.a(this.a, this.a.a.d());
          h.a(this.a, false);
          h.b(this.a, this.a.a.e());
          return false;
        case 2:
          f1 = paramMotionEvent.getX() - h.c(this.a);
          f2 = h.d(this.a) - paramMotionEvent.getY();
        case 1:
        case 3:
        }
      }
      while ((Math.abs(f1) < 5.0F) && (Math.abs(f2) < 5.0F));
      h.a(this.a, paramMotionEvent.getX());
      h.b(this.a, paramMotionEvent.getY());
      if (((Math.abs(f1) <= Math.abs(f2)) && (this.a.d.getVisibility() != 0)) || (this.a.h.getVisibility() == 0))
        continue;
      h.a(this.a, true);
      float f3 = f1 / b.x(paramView.getContext());
      h.a(this.a, h.a(this.a, h.e(this.a), (int)(f3 * 50000.0F)));
      if (this.a.a.c() / 3600000 == 0)
      {
        this.a.f.setText(TextUtil.stringForTimeInMinutes(this.a.a.c()));
        this.a.e.setText(TextUtil.stringForTimeInMinutes(h.e(this.a)));
        if (this.a.d.getVisibility() != 0)
          this.a.d.setVisibility(0);
        if (this.a.h.getVisibility() == 0)
          this.a.h.setVisibility(8);
        if (f1 <= 0.0F)
          break label496;
        this.a.g.setImageResource(2130838066);
      }
      while (this.a.a.e())
      {
        this.a.a.b();
        return false;
        this.a.f.setText(TextUtil.stringForTime(this.a.a.c()));
        this.a.e.setText(TextUtil.stringForTime(h.e(this.a)));
        break label350;
        this.a.g.setImageResource(2130837820);
      }
    }
    while (((Math.abs(f2) <= Math.abs(f1)) && (this.a.h.getVisibility() != 0)) || (this.a.d.getVisibility() == 0));
    h.a(this.a, true);
    if (h.f(this.a) == null)
      h.a(this.a, (AudioManager)paramView.getContext().getSystemService("audio"));
    int i = h.f(this.a).getStreamMaxVolume(3);
    int j = h.f(this.a).getStreamVolume(3);
    if (this.a.h.getVisibility() != 0)
      this.a.h.setVisibility(0);
    if (this.a.d.getVisibility() == 0)
      this.a.d.setVisibility(8);
    int k = b.x(this.a.j) / 3;
    int m;
    int n;
    if (this.a.i.getProgress() > 0)
    {
      m = this.a.i.getProgress();
      n = (int)(f2 + m);
      if (n >= 0)
        break label767;
      n = 0;
    }
    while (true)
    {
      this.a.i.setProgress(n);
      h.f(this.a).setStreamVolume(3, n * i / k, 0);
      return false;
      m = j * k / i;
      break;
      label767: if (n <= k)
        continue;
      n = k;
    }
    if (this.a.d.getVisibility() == 0)
    {
      this.a.d.setVisibility(8);
      this.a.b.a(h.e(this.a));
      if (h.g(this.a))
        this.a.a.a();
    }
    if (this.a.h.getVisibility() == 0)
      this.a.h.setVisibility(8);
    return h.h(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.media.controller.l
 * JD-Core Version:    0.6.0
 */