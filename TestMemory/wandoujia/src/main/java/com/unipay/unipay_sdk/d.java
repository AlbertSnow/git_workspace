package com.unipay.unipay_sdk;

import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

final class d extends Handler
{
  d(MainActivity paramMainActivity)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    Toast.makeText(this.a, paramMessage.obj.toString(), 0).show();
    paramMessage.obj.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.unipay_sdk.d
 * JD-Core Version:    0.6.0
 */