package com.wandoujia.p4.community.fragmant;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.widget.EditText;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.AccountParams.Page;
import com.wandoujia.account.a;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.account.activity.AccountModifyProfileActivity;
import com.wandoujia.p4.account.manager.AccountUtil;
import java.util.ArrayList;
import java.util.List;

final class x
  implements Action
{
  private x(CommunityPostContentFragment paramCommunityPostContentFragment)
  {
  }

  public final void execute()
  {
    FragmentActivity localFragmentActivity = this.a.getActivity();
    String str = String.valueOf(CommunityPostContentFragment.d(this.a).getText());
    if ((TextUtils.isEmpty(str)) && (!CommunityPostContentFragment.e(this.a)))
      str = this.a.getString(2131624493);
    if (TextUtils.isEmpty(str))
    {
      p.a(localFragmentActivity, 2131624494, p.b).a();
      return;
    }
    if (str.length() > CommunityPostContentFragment.f(this.a))
    {
      CommunityPostContentFragment localCommunityPostContentFragment2 = this.a;
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(str.length() - CommunityPostContentFragment.f(this.a));
      p.a(localFragmentActivity, localCommunityPostContentFragment2.getString(2131624497, arrayOfObject3), p.b).a();
      return;
    }
    if (!a.z())
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = this.a.b();
      p.a(localFragmentActivity, localFragmentActivity.getString(2131624495, arrayOfObject2), p.b).a();
      AccountParams localAccountParams = new AccountParams("community", 0);
      if (!a.w())
        localAccountParams.a(AccountParams.Page.TEL_REGISTER);
      while (true)
      {
        localAccountParams.a(0);
        localAccountParams.n();
        localAccountParams.a(false);
        AccountUtil.a(localFragmentActivity, localAccountParams);
        return;
        localAccountParams.a(AccountParams.Page.LOG_IN);
      }
    }
    if (a.m())
    {
      localFragmentActivity.startActivityForResult(new Intent(localFragmentActivity, AccountModifyProfileActivity.class), 2);
      CommunityPostContentFragment localCommunityPostContentFragment1 = this.a;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = this.a.b();
      p.a(localFragmentActivity, localCommunityPostContentFragment1.getString(2131624496, arrayOfObject1), p.b).a();
      return;
    }
    new ArrayList(CommunityPostContentFragment.a(this.a)).remove("");
    this.a.c().a(str, CommunityPostContentFragment.a(this.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.x
 * JD-Core Version:    0.6.0
 */