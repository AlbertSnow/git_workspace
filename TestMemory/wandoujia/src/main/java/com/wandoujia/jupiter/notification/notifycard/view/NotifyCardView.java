package com.wandoujia.jupiter.notification.notifycard.view;

import android.content.Context;
import android.support.v4.app.r;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.wandoujia.jupiter.notification.notifycard.generator.INotifyCardGenerator.EntryType;

public abstract class NotifyCardView extends RelativeLayout
{
  public NotifyCardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public NotifyCardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public void setEntryType(INotifyCardGenerator.EntryType paramEntryType)
  {
  }

  public void setOnHandledListener$4de7cafc(r paramr)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.notification.notifycard.view.NotifyCardView
 * JD-Core Version:    0.6.0
 */