package com.wandoujia.jupiter.topic.fragment;

import android.widget.FrameLayout;
import com.wandoujia.api.proto.PublisherDetail;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.jupiter.topic.b;
import com.wandoujia.jupiter.topic.e;
import com.wandoujia.jupiter.topic.view.TopicHeaderView;
import com.wandoujia.nirvana.framework.ui.recycler.g;
import com.wandoujia.ripple_framework.adapter.f;
import com.wandoujia.ripple_framework.model.Model;
import java.lang.ref.WeakReference;

final class d
  implements b
{
  private WeakReference<TopicFragment> a;
  private g b;

  public d(TopicFragment paramTopicFragment, g paramg)
  {
    this.a = new WeakReference(paramTopicFragment);
    this.b = paramg;
  }

  public final void a(Model paramModel)
  {
    TopicFragment localTopicFragment = (TopicFragment)this.a.get();
    if (localTopicFragment == null);
    do
      return;
    while (!localTopicFragment.isAdded());
    this.b.a(paramModel);
    TopicFragment.a(localTopicFragment, paramModel);
    if ((!OemUtil.isOemOrPaid()) && (paramModel.I().subscribed != null))
      TopicFragment.a(localTopicFragment).f.addView(TopicFragment.b(localTopicFragment, paramModel));
    TopicFragment.b(localTopicFragment).b();
    TopicFragment.a(localTopicFragment, paramModel.n());
    TopicFragment.c(localTopicFragment).a(TopicFragment.a(paramModel), paramModel.n());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.topic.fragment.d
 * JD-Core Version:    0.6.0
 */