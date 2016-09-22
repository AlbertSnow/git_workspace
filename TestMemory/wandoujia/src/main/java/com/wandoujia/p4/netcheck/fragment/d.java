package com.wandoujia.p4.netcheck.fragment;

import android.os.AsyncTask;
import android.widget.ProgressBar;
import android.widget.TextView;

final class d extends AsyncTask<String, Void, Boolean>
{
  private d(NetCheckCheckingFragment paramNetCheckCheckingFragment)
  {
  }

  protected final void onPreExecute()
  {
    if (this.a.getActivity() != null)
    {
      NetCheckCheckingFragment.c(this.a).setProgress(0);
      NetCheckCheckingFragment.d(this.a).setText(this.a.getString(2131625165));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.fragment.d
 * JD-Core Version:    0.6.0
 */