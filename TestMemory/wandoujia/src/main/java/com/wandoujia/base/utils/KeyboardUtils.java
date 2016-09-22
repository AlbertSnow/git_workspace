package com.wandoujia.base.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class KeyboardUtils
{
  @TargetApi(3)
  public static void hideSoftInput(View paramView)
  {
    if (paramView == null)
      return;
    ((InputMethodManager)paramView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(paramView.getWindowToken(), 0);
  }

  public static void showKeyBoard(View paramView)
  {
    if (paramView == null)
      return;
    paramView.requestFocus();
    paramView.post(new e(paramView));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.KeyboardUtils
 * JD-Core Version:    0.6.0
 */