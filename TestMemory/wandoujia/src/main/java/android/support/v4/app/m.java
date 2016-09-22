package android.support.v4.app;

import android.os.Handler;
import android.os.Message;

final class m extends Handler
{
  m(FragmentActivity paramFragmentActivity)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      super.handleMessage(paramMessage);
    case 1:
      do
        return;
      while (!this.a.mStopped);
      this.a.doReallyStop(false);
      return;
    case 2:
    }
    this.a.onResumeFragments();
    this.a.mFragments.h();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.m
 * JD-Core Version:    0.6.0
 */