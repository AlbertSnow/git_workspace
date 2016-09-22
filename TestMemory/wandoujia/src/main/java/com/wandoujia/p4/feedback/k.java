package com.wandoujia.p4.feedback;

import java.lang.ref.WeakReference;

final class k
  implements com.wandoujia.p4.feedback.zendesk.k
{
  private final WeakReference<FeedbackActivity> a;

  private k(FeedbackActivity paramFeedbackActivity)
  {
    this.a = new WeakReference(paramFeedbackActivity);
  }

  public final void a(int paramInt)
  {
    if (this.a.get() != null)
      FeedbackActivity.a((FeedbackActivity)this.a.get(), paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.k
 * JD-Core Version:    0.6.0
 */