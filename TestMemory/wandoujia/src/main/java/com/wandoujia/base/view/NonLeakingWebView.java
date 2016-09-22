package com.wandoujia.base.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.WindowManager.BadTokenException;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class NonLeakingWebView extends WebView
{
  private static final String TAG = "NonLeakingWebView";

  public NonLeakingWebView(Context paramContext)
  {
    super(paramContext.getApplicationContext());
    init();
  }

  public NonLeakingWebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext.getApplicationContext(), paramAttributeSet);
    init();
  }

  public NonLeakingWebView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext.getApplicationContext(), paramAttributeSet, paramInt);
    init();
  }

  private void init()
  {
    setWebViewClient(new NonLeakingWebView.NonLeakingWebViewClient(this));
    getSettings().setSavePassword(false);
    setScrollBarStyle(0);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    try
    {
      super.onDraw(paramCanvas);
      return;
    }
    catch (WindowManager.BadTokenException localBadTokenException)
    {
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
    }
  }

  protected boolean shouldJumpToBrowser(String paramString)
  {
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.view.NonLeakingWebView
 * JD-Core Version:    0.6.0
 */