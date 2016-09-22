package com.wandoujia.account.fragment;

import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.account.R.id;
import com.wandoujia.account.R.string;

final class ca
  implements View.OnClickListener
{
  ca(AccountRegisterFragment paramAccountRegisterFragment)
  {
  }

  public final void onClick(View paramView)
  {
    if (this.a.i != null)
      this.a.i.onViewWidgetClicked(paramView);
    WebViewFragment localWebViewFragment = WebViewFragment.a(this.a.c, this.a.d, "http://www.wandoujia.com/terms", this.a.getString(R.string.account_sdk_title_terms));
    ac localac = this.a.d().a();
    localac.b(R.id.account_fragment_layout, localWebViewFragment);
    localac.a("register");
    localac.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.ca
 * JD-Core Version:    0.6.0
 */