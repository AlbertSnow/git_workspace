package com.wandoujia.jupiter.presenter;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.wandoujia.jupiter.util.b;

final class r extends ClickableSpan
{
  r(o paramo)
  {
  }

  public final void onClick(View paramView)
  {
    b.a(paramView, this.a.f(), this.a.i());
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    paramTextPaint.setColor(this.a.e().getResources().getColor(2131361989));
    paramTextPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.r
 * JD-Core Version:    0.6.0
 */