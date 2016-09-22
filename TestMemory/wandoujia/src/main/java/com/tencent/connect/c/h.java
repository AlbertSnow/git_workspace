package com.tencent.connect.c;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.open.utils.d;
import java.util.ArrayList;

final class h extends Handler
{
  h(Looper paramLooper, d paramd)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      super.handleMessage(paramMessage);
      return;
    case 101:
    }
    ArrayList localArrayList = paramMessage.getData().getStringArrayList("images");
    this.a.a(localArrayList);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.c.h
 * JD-Core Version:    0.6.0
 */