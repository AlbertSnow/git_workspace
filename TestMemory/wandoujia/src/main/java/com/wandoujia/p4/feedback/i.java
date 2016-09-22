package com.wandoujia.p4.feedback;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.p4.netcheck.NetCheckActivity;

final class i
  implements View.OnClickListener
{
  i(FeedbackActivity paramFeedbackActivity)
  {
  }

  public final void onClick(View paramView)
  {
    this.a.startActivity(new Intent(this.a, NetCheckActivity.class));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.i
 * JD-Core Version:    0.6.0
 */