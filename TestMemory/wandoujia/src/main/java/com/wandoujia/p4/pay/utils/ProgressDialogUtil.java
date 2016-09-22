package com.wandoujia.p4.pay.utils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.view.Window;

public class ProgressDialogUtil
{
  private static final String TAG = ProgressDialogUtil.class.getSimpleName();
  private static ProgressDialog progressDialog;

  public static void dismiss()
  {
    monitorenter;
    try
    {
      if (progressDialog != null)
      {
        SLog.d(TAG, "Dismiss existing progress dialog.");
        progressDialog.dismiss();
        progressDialog = null;
      }
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public static void show(Activity paramActivity, String paramString1, String paramString2)
  {
    monitorenter;
    try
    {
      if (progressDialog == null)
        progressDialog = new ProgressDialog(paramActivity, 2131690070);
      while (true)
      {
        progressDialog.setTitle(paramString1);
        progressDialog.setMessage(paramString2);
        SLog.d(TAG, "Show progress dialog.");
        progressDialog.show();
        progressDialog.getWindow().setGravity(17);
        return;
        if (!progressDialog.isShowing())
          continue;
        SLog.d(TAG, "Dismiss first when it is showing.");
        progressDialog.dismiss();
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.utils.ProgressDialogUtil
 * JD-Core Version:    0.6.0
 */