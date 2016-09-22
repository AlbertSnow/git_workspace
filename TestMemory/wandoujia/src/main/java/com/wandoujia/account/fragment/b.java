package com.wandoujia.account.fragment;

import android.app.ProgressDialog;
import com.wandoujia.account.dto.WandouResponse;
import com.wandoujia.account.listener.a;

final class b
  implements a
{
  b(AccountBaseFragment paramAccountBaseFragment)
  {
  }

  public final void a()
  {
    if (this.a.e != null)
      this.a.e.dismiss();
    this.a.f();
  }

  public final void a(WandouResponse paramWandouResponse)
  {
    if (this.a.e != null)
      this.a.e.dismiss();
    this.a.b(paramWandouResponse);
  }

  public final void a(String paramString)
  {
    if (this.a.e != null)
      this.a.e.dismiss();
    this.a.d(paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.b
 * JD-Core Version:    0.6.0
 */