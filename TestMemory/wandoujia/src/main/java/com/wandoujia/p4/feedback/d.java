package com.wandoujia.p4.feedback;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;

final class d
  implements View.OnFocusChangeListener
{
  d(FeedbackActivity paramFeedbackActivity)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      String str = FeedbackActivity.a(this.a).getText().toString().replace(" ", "");
      FeedbackActivity.a(this.a).setText(str);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.d
 * JD-Core Version:    0.6.0
 */