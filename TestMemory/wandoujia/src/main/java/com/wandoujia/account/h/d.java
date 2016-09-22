package com.wandoujia.account.h;

import android.content.Context;
import android.os.CountDownTimer;
import android.widget.Button;
import com.wandoujia.account.R.string;

final class d extends CountDownTimer
{
  d(boolean paramBoolean, Button paramButton, Context paramContext)
  {
    super(30000L, 1000L);
  }

  public final void onFinish()
  {
    if (this.a)
      this.b.setText(this.c.getString(R.string.account_sdk_verify_emial_complete));
    while (true)
    {
      this.b.setEnabled(true);
      return;
      this.b.setText(this.c.getString(R.string.account_sdk_verify_captcha_complete));
    }
  }

  public final void onTick(long paramLong)
  {
    if (this.a)
    {
      Button localButton2 = this.b;
      Context localContext2 = this.c;
      int j = R.string.account_sdk_verify_email_again;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Long.valueOf(paramLong / 1000L);
      localButton2.setText(localContext2.getString(j, arrayOfObject2));
      return;
    }
    Button localButton1 = this.b;
    Context localContext1 = this.c;
    int i = R.string.account_sdk_verify_captcha_again;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Long.valueOf(paramLong / 1000L);
    localButton1.setText(localContext1.getString(i, arrayOfObject1));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.h.d
 * JD-Core Version:    0.6.0
 */