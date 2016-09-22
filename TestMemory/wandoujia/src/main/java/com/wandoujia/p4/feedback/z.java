package com.wandoujia.p4.feedback;

import android.os.AsyncTask;
import com.wandoujia.p4.feedback.zendesk.ZendeskModels.AuditsBundle;
import com.wandoujia.p4.tips.TipsType;
import com.wandoujia.p4.tips.a;
import java.util.List;

final class z extends AsyncTask<Void, Void, List<ZendeskModels.AuditsBundle>>
{
  private z(FeedbackListActivity paramFeedbackListActivity)
  {
  }

  protected final void onPreExecute()
  {
    a.a(FeedbackListActivity.a(this.a), TipsType.LOADING);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.z
 * JD-Core Version:    0.6.0
 */