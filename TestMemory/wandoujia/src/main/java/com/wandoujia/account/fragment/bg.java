package com.wandoujia.account.fragment;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;

final class bg extends AsyncTask<Void, Integer, Bitmap>
{
  private String a;
  private WeakReference<AccountModifyProfileFragment> b;

  public bg(String paramString, AccountModifyProfileFragment paramAccountModifyProfileFragment)
  {
    this.a = paramString;
    this.b = new WeakReference(paramAccountModifyProfileFragment);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.bg
 * JD-Core Version:    0.6.0
 */