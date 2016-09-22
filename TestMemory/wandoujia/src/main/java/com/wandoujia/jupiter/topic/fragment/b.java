package com.wandoujia.jupiter.topic.fragment;

import android.view.ViewGroup;
import com.wandoujia.nirvana.framework.ui.recycler.g;
import com.wandoujia.ripple_framework.adapter.f;
import com.wandoujia.ripple_framework.model.Model;
import java.lang.ref.WeakReference;

final class b
  implements com.wandoujia.jupiter.topic.b
{
  private WeakReference<TopicFragment> a;

  public b(TopicFragment paramTopicFragment)
  {
    this.a = new WeakReference(paramTopicFragment);
  }

  public final void a(Model paramModel)
  {
    TopicFragment localTopicFragment = (TopicFragment)this.a.get();
    if (localTopicFragment == null)
      return;
    c localc = new c((ViewGroup)android.support.v4.app.b.b(localTopicFragment.getActivity(), 2130903406));
    localc.a(paramModel);
    TopicFragment.d(localTopicFragment).b(localc);
    TopicFragment.e(localTopicFragment).b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.topic.fragment.b
 * JD-Core Version:    0.6.0
 */