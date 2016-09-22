package com.wandoujia.p4.pay.feedback;

import java.util.List;

abstract interface FeedbackCategorySpinner$SpinnerPopup
{
  public abstract void dismiss();

  public abstract CharSequence getHintText();

  public abstract boolean isShowing();

  public abstract void setData(List<String> paramList, List<List<String>> paramList1, String paramString);

  public abstract void setPromptText(CharSequence paramCharSequence);

  public abstract void show();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.feedback.FeedbackCategorySpinner.SpinnerPopup
 * JD-Core Version:    0.6.0
 */