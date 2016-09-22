package com.wandoujia.p4.netcheck.fragment;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.p4.feedback.FeedbackActivity;

final class g
  implements View.OnClickListener
{
  g(NetCheckFinishFragment paramNetCheckFinishFragment)
  {
  }

  public final void onClick(View paramView)
  {
    FragmentActivity localFragmentActivity = this.a.getActivity();
    if ((localFragmentActivity != null) && (!localFragmentActivity.isFinishing()))
    {
      FeedbackActivity.a(localFragmentActivity);
      localFragmentActivity.finish();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.fragment.g
 * JD-Core Version:    0.6.0
 */