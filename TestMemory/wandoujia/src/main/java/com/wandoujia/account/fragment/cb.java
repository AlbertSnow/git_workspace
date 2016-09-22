package com.wandoujia.account.fragment;

import android.app.ProgressDialog;
import android.widget.Toast;
import com.wandoujia.account.R.string;
import com.wandoujia.account.d.b;
import com.wandoujia.account.dto.WandouResponse;
import com.wandoujia.account.j;
import com.wandoujia.account.listener.a;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;

final class cb
  implements a
{
  cb(AccountRegisterFragment paramAccountRegisterFragment)
  {
  }

  public final void a()
  {
    if (AccountRegisterFragment.h(this.a) != null)
      AccountRegisterFragment.h(this.a).a();
    if (this.a.e != null)
      this.a.e.dismiss();
    TaskEvent.Action localAction = TaskEvent.Action.SIGN_UP;
    TaskEvent.Result localResult = TaskEvent.Result.CANCEL;
    if (AccountRegisterFragment.g(this.a));
    for (String str = "telephone_reg"; ; str = "email_reg")
    {
      b.b(localAction, localResult, str);
      return;
    }
  }

  public final void a(WandouResponse paramWandouResponse)
  {
    if (AccountRegisterFragment.h(this.a) != null)
      AccountRegisterFragment.h(this.a).a(paramWandouResponse);
    if (this.a.e != null)
      this.a.e.dismiss();
    this.a.a(paramWandouResponse);
    if (AccountRegisterFragment.g(this.a));
    for (String str1 = "telephone_reg : "; ; str1 = "email_reg : ")
    {
      String str2 = str1 + paramWandouResponse.toString();
      b.b(TaskEvent.Action.SIGN_UP, TaskEvent.Result.FAIL, str2);
      return;
    }
  }

  public final void a(String paramString)
  {
    TaskEvent.Action localAction = TaskEvent.Action.SIGN_UP;
    TaskEvent.Result localResult = TaskEvent.Result.SUCCESS;
    if (AccountRegisterFragment.g(this.a));
    for (String str = "telephone_reg"; ; str = "email_reg")
    {
      b.b(localAction, localResult, str);
      if (AccountRegisterFragment.h(this.a) != null)
        AccountRegisterFragment.h(this.a).a(this.a.getActivity(), AccountRegisterFragment.i(this.a), true);
      if (this.a.e != null)
        this.a.e.dismiss();
      if (this.a.isAdded())
        break;
      return;
    }
    Toast.makeText(this.a.getActivity(), this.a.getString(R.string.account_sdk_register_success), 0).show();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.cb
 * JD-Core Version:    0.6.0
 */