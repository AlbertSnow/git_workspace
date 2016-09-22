package com.wandoujia.p4.netcheck.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.wandoujia.p4.fragment.AsyncLoadFragment;
import com.wandoujia.p4.netcheck.controller.NetCheckController;

public class NetCheckEmailFragment extends AsyncLoadFragment
{
  private NetCheckController a;

  public final void a(NetCheckController paramNetCheckController)
  {
    this.a = paramNetCheckController;
  }

  protected int getLayoutResId()
  {
    return 2130903085;
  }

  protected void onInflated(View paramView, Bundle paramBundle)
  {
    EditText localEditText = (EditText)paramView.findViewById(2131493176);
    ((Button)paramView.findViewById(2131493227)).setOnClickListener(new e(this, localEditText, paramView));
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
 * Qualified Name:     com.wandoujia.p4.netcheck.fragment.NetCheckEmailFragment
 * JD-Core Version:    0.6.0
 */