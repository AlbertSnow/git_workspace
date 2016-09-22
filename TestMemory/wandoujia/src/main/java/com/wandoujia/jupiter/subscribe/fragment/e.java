package com.wandoujia.jupiter.subscribe.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.api.proto.PublisherDetail;
import com.wandoujia.api.proto.RelatedApp;
import com.wandoujia.jupiter.activity.DetailActivity;
import com.wandoujia.ripple_framework.model.Model;

final class e
  implements View.OnClickListener
{
  e(Model paramModel)
  {
  }

  public final void onClick(View paramView)
  {
    DetailActivity.a(paramView.getContext(), this.a.I().relatedApp.packageName);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.fragment.e
 * JD-Core Version:    0.6.0
 */