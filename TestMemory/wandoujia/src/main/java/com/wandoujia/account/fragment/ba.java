package com.wandoujia.account.fragment;

import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.wandoujia.account.R.string;
import com.wandoujia.account.g.j;

final class ba
  implements View.OnClickListener
{
  ba(AccountModifyProfileFragment paramAccountModifyProfileFragment)
  {
  }

  public final void onClick(View paramView)
  {
    String str = AccountModifyProfileFragment.b(this.a).getText().toString().trim();
    if (TextUtils.isEmpty(str))
    {
      com.wandoujia.account.h.a.a(this.a.getActivity(), this.a.getString(R.string.account_sdk_nick_empty), this.a.getString(R.string.account_sdk_complete_failure), new bb()).show();
      return;
    }
    if (!com.wandoujia.account.a.l().equals(str))
    {
      this.a.b(this.a.getString(R.string.account_sdk_complete_waiting));
      new Thread(new j(str, "complete_profile_tag", AccountModifyProfileFragment.c(this.a), this.a.f)).start();
      return;
    }
    this.a.getActivity().finish();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.ba
 * JD-Core Version:    0.6.0
 */