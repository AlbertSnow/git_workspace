package com.wandoujia.jupiter.imageviewer.views;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.ref.WeakReference;

final class e extends Handler
{
  private final WeakReference<TouchImageView> a;

  e(TouchImageView paramTouchImageView)
  {
    this.a = new WeakReference(paramTouchImageView);
  }

  public final void handleMessage(Message paramMessage)
  {
    ((TouchImageView)this.a.get()).performClick();
    if (TouchImageView.p((TouchImageView)this.a.get()) != null)
      TouchImageView.p((TouchImageView)this.a.get()).onClick((View)this.a.get());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.imageviewer.views.e
 * JD-Core Version:    0.6.0
 */