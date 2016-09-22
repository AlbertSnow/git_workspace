package com.wandoujia.p4.netcheck.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.wandoujia.p4.fragment.AsyncLoadFragment;
import com.wandoujia.p4.netcheck.controller.NetCheckController;
import com.wandoujia.p4.netcheck.controller.g;

public class NetCheckCheckingFragment extends AsyncLoadFragment
{
  private int a = 5;
  private ProgressBar b;
  private TextView c;
  private int d = 0;
  private int e;
  private final NetCheckController f = new NetCheckController();
  private g g;

  public final void a()
  {
    this.a = (1 + this.a);
  }

  protected int getLayoutResId()
  {
    return 2130903084;
  }

  protected void onInflated(View paramView, Bundle paramBundle)
  {
    this.c = ((TextView)paramView.findViewById(2131493209));
    this.b = ((ProgressBar)paramView.findViewById(2131493210));
    this.e = (this.b.getMax() / this.a);
    this.g = new a(this, paramView);
    this.f.a(this.g);
    new c(this, 0).execute(new Void[0]);
  }

  protected void onPrepareLoading()
  {
  }

  protected void onStartLoading()
  {
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    setTitle(getString(2131625172));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.fragment.NetCheckCheckingFragment
 * JD-Core Version:    0.6.0
 */