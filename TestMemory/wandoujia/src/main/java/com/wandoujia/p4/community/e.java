package com.wandoujia.p4.community;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class e
  implements View.OnTouchListener
{
  e(PullToRefreshAsyncloadFragment paramPullToRefreshAsyncloadFragment)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if ((PullToRefreshAsyncloadFragment.a(this.a)) && (paramMotionEvent.getY() >= PullToRefreshAsyncloadFragment.b(this.a)) && (!PullToRefreshAsyncloadFragment.c(this.a)))
      switch (paramMotionEvent.getAction())
      {
      default:
      case 0:
      case 2:
      case 1:
      }
    while (true)
    {
      return false;
      PullToRefreshAsyncloadFragment.b(this.a, (int)paramMotionEvent.getRawY());
      PullToRefreshAsyncloadFragment.d(this.a).b();
      continue;
      if (PullToRefreshAsyncloadFragment.e(this.a) == 0)
      {
        PullToRefreshAsyncloadFragment.b(this.a, (int)paramMotionEvent.getRawY());
        PullToRefreshAsyncloadFragment.d(this.a).b();
        continue;
      }
      int i = (int)(0.25F * (int)(paramMotionEvent.getRawY() - PullToRefreshAsyncloadFragment.e(this.a)));
      if (i > 0)
      {
        PullToRefreshAsyncloadFragment.d(this.a).b();
        PullToRefreshAsyncloadFragment.d(this.a).a(i);
        if (i < PullToRefreshAsyncloadFragment.f())
        {
          PullToRefreshAsyncloadFragment.d(this.a).a(PullToRefreshHeaderView.PullToRefreshState.PULLING);
          PullToRefreshAsyncloadFragment.b(this.a, false);
          return true;
        }
        PullToRefreshAsyncloadFragment.d(this.a).a(PullToRefreshHeaderView.PullToRefreshState.RELEASE);
        PullToRefreshAsyncloadFragment.b(this.a, true);
        return true;
      }
      PullToRefreshAsyncloadFragment.d(this.a).a();
      return false;
      PullToRefreshAsyncloadFragment.b(this.a, 0);
      PullToRefreshAsyncloadFragment.a(this.a, false);
      if (PullToRefreshAsyncloadFragment.f(this.a))
      {
        this.a.e();
        continue;
      }
      PullToRefreshAsyncloadFragment.d(this.a).a();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.e
 * JD-Core Version:    0.6.0
 */