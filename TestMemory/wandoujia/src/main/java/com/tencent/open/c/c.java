package com.tencent.open.c;

import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.tencent.open.a.f;
import com.tencent.open.web.security.a;

public class c extends b
{
  private static boolean b;
  private a a;

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    f.b("openSDK_LOG.SecureWebView", "-->dispatchKeyEvent, is device support: " + b);
    if (!b)
      return super.dispatchKeyEvent(paramKeyEvent);
    if (paramKeyEvent.getAction() == 0)
    {
      switch (paramKeyEvent.getKeyCode())
      {
      default:
        if (paramKeyEvent.getUnicodeChar() != 0)
          break;
        return super.dispatchKeyEvent(paramKeyEvent);
      case 67:
        return super.dispatchKeyEvent(paramKeyEvent);
      case 4:
        return super.dispatchKeyEvent(paramKeyEvent);
      case 66:
        return super.dispatchKeyEvent(paramKeyEvent);
      }
      return super.dispatchKeyEvent(paramKeyEvent);
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }

  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    f.c("openSDK_LOG.SecureWebView", "-->create input connection, is edit: false");
    InputConnection localInputConnection = super.onCreateInputConnection(paramEditorInfo);
    f.a("openSDK_LOG.SecureWebView", "-->onCreateInputConnection, inputConn is " + localInputConnection);
    if (localInputConnection != null)
    {
      b = true;
      this.a = new a(super.onCreateInputConnection(paramEditorInfo));
      return this.a;
    }
    b = false;
    return localInputConnection;
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    f.b("openSDK_LOG.SecureWebView", "-->onKeyDown, is device support: " + b);
    if (!b)
      return super.onKeyDown(paramInt, paramKeyEvent);
    if (paramKeyEvent.getAction() == 0)
    {
      switch (paramKeyEvent.getKeyCode())
      {
      default:
        if (paramKeyEvent.getUnicodeChar() != 0)
          break;
        return super.onKeyDown(paramInt, paramKeyEvent);
      case 67:
        return super.onKeyDown(paramInt, paramKeyEvent);
      case 4:
        return super.onKeyDown(paramInt, paramKeyEvent);
      case 66:
        return super.onKeyDown(paramInt, paramKeyEvent);
      }
      return super.onKeyDown(paramInt, paramKeyEvent);
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.c.c
 * JD-Core Version:    0.6.0
 */