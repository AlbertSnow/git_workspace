package com.wandoujia.p4.pay.fragment;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;

class PayFragment$4
  implements View.OnClickListener
{
  public void onClick(View paramView)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.wandoujia.com/account/?source=paysdk#find"));
    this.this$0.getActivity().startActivity(localIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.PayFragment.4
 * JD-Core Version:    0.6.0
 */