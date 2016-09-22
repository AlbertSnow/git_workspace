package com.wandoujia.account.fragment;

import com.wandoujia.account.f;
import java.lang.ref.WeakReference;

final class aa
  implements f
{
  private final WeakReference<AccountFragment> a;

  public aa(AccountFragment paramAccountFragment)
  {
    this.a = new WeakReference(paramAccountFragment);
  }

  public final void a()
  {
    AccountFragment localAccountFragment = (AccountFragment)this.a.get();
    if (localAccountFragment == null)
      return;
    AccountFragment.a(localAccountFragment);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.aa
 * JD-Core Version:    0.6.0
 */