package com.wandoujia.p4.account.activity;

import android.app.ProgressDialog;
import android.text.TextUtils;
import com.wandoujia.account.dto.WandouResponse;
import com.wandoujia.jupiter.activity.BaseToolBarActivity;

public abstract class AccountBaseActivity extends BaseToolBarActivity
{
  protected ProgressDialog a;
  protected c b = new c(this, 0);

  abstract void a();

  abstract void a(WandouResponse paramWandouResponse);

  protected final void a(String paramString)
  {
    if (this.a != null)
      this.a.dismiss();
    this.a = ProgressDialog.show(this, "", paramString);
  }

  protected final void a(String paramString, WandouResponse paramWandouResponse)
  {
    if (paramWandouResponse != null);
    try
    {
      String str = paramWandouResponse.getMsg();
      if (TextUtils.isEmpty(str))
        str = getString(2131625173);
      com.wandoujia.account.h.a.a(this, str, paramString, new a()).show();
      return;
      com.wandoujia.account.h.a.a(this, getString(2131625173), paramString, new b()).show();
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.activity.AccountBaseActivity
 * JD-Core Version:    0.6.0
 */