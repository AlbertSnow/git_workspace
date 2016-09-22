package com.wandoujia.account.g;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import com.wandoujia.account.dto.AccountError;
import com.wandoujia.account.dto.AccountResponse;

public final class p extends a
  implements Runnable
{
  private final String e;
  private final String f;
  private final String g;
  private s h;
  private CountDownTimer i;

  public p(String paramString1, String paramString2, String paramString3, String paramString4, com.wandoujia.account.listener.a parama, com.wandoujia.account.f.b paramb)
  {
    super(paramString4, parama, paramb);
    this.e = paramString1;
    this.f = paramString3;
    this.g = paramString2;
  }

  public final void run()
  {
    if (a())
    {
      if (this.d == null)
        b();
      AccountResponse localAccountResponse;
      do
      {
        return;
        localAccountResponse = this.d.c(this.e, this.f, this.g);
        a(localAccountResponse);
      }
      while ((localAccountResponse == null) || (localAccountResponse.getError() != AccountError.SUCCESS.getError()));
      if (this.h == null)
        this.h = new s(this, new Handler(Looper.getMainLooper()));
      if (this.i != null)
      {
        this.i.cancel();
        this.i.start();
      }
      while (true)
      {
        Uri localUri = Uri.parse("content://sms");
        android.support.v4.app.b.A().getContentResolver().registerContentObserver(localUri, true, this.h);
        return;
        new Handler(Looper.getMainLooper()).post(new q(this));
      }
    }
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.g.p
 * JD-Core Version:    0.6.0
 */