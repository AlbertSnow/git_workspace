package com.wandoujia.p4.feedback;

import android.os.AsyncTask;
import com.wandoujia.p4.tips.TipsType;
import com.wandoujia.p4.tips.a;

final class g extends AsyncTask<Void, Void, Void>
{
  g(FeedbackActivity paramFeedbackActivity)
  {
  }

  protected final void onPreExecute()
  {
    a.a(this.a.findViewById(2131493174), TipsType.LOADING);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.g
 * JD-Core Version:    0.6.0
 */