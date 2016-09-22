package com.wandoujia.jupiter.fragment;

import com.android.volley.VolleyError;
import com.android.volley.j;
import com.android.volley.k;
import com.wandoujia.api.proto.HttpResponse;
import java.lang.ref.WeakReference;

final class bo
  implements j, k<HttpResponse>
{
  private WeakReference<ReviewTopicFragment> a;

  public bo(ReviewTopicFragment paramReviewTopicFragment)
  {
    this.a = new WeakReference(paramReviewTopicFragment);
  }

  public final void onErrorResponse(VolleyError paramVolleyError)
  {
    if (this.a != null)
    {
      ReviewTopicFragment localReviewTopicFragment = (ReviewTopicFragment)this.a.get();
      if ((localReviewTopicFragment != null) && (localReviewTopicFragment.isAdded()))
        ReviewTopicFragment.a(localReviewTopicFragment, null);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.bo
 * JD-Core Version:    0.6.0
 */