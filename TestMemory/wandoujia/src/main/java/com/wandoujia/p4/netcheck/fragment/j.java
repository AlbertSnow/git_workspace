package com.wandoujia.p4.netcheck.fragment;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.p4.feedback.FeedbackActivity;
import com.wandoujia.p4.netcheck.controller.NetCheckController;

final class j
  implements View.OnClickListener
{
  j(NetCheckPostFailedFragment paramNetCheckPostFailedFragment)
  {
  }

  public final void onClick(View paramView)
  {
    NetCheckPostFailedFragment.a(this.a).d();
    FragmentActivity localFragmentActivity = this.a.getActivity();
    if ((localFragmentActivity != null) && (!localFragmentActivity.isFinishing()))
    {
      FeedbackActivity.a(localFragmentActivity);
      this.a.getActivity().finish();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.fragment.j
 * JD-Core Version:    0.6.0
 */