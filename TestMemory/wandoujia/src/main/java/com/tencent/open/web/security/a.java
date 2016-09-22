package com.tencent.open.web.security;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.tencent.open.a.f;

public final class a extends InputConnectionWrapper
{
  private static String a;

  public a(InputConnection paramInputConnection)
  {
    super(paramInputConnection, false);
  }

  public final boolean commitText(CharSequence paramCharSequence, int paramInt)
  {
    a = paramCharSequence.toString();
    f.a("openSDK_LOG.CaptureInputConnection", "-->commitText: " + paramCharSequence.toString());
    return super.commitText(paramCharSequence, paramInt);
  }

  public final boolean sendKeyEvent(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() == 0)
    {
      f.c("openSDK_LOG.CaptureInputConnection", "sendKeyEvent");
      a = String.valueOf((char)paramKeyEvent.getUnicodeChar());
      f.b("openSDK_LOG.CaptureInputConnection", "s: " + a);
    }
    f.b("openSDK_LOG.CaptureInputConnection", "-->sendKeyEvent: " + a);
    return super.sendKeyEvent(paramKeyEvent);
  }

  public final boolean setComposingText(CharSequence paramCharSequence, int paramInt)
  {
    a = paramCharSequence.toString();
    f.a("openSDK_LOG.CaptureInputConnection", "-->setComposingText: " + paramCharSequence.toString());
    return super.setComposingText(paramCharSequence, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.web.security.a
 * JD-Core Version:    0.6.0
 */