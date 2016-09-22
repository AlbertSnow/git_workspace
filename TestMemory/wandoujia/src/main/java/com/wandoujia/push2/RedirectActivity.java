package com.wandoujia.push2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.wandoujia.base.utils.AsyncTaskUtils;

public class RedirectActivity extends Activity
{
  private static void a(Intent paramIntent)
  {
    if (paramIntent.hasExtra("push2_download"))
    {
      r localr = new r(0);
      String[] arrayOfString = new String[1];
      arrayOfString[0] = paramIntent.getStringExtra("push2_download");
      AsyncTaskUtils.runAsyncTask(localr, arrayOfString);
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Intent localIntent = getIntent();
    if (localIntent != null)
    {
      if (!"phoenix.intent.action.PUSH_DOWNLOAD".equals(localIntent.getAction()))
        break label35;
      a(localIntent);
    }
    while (true)
    {
      finish();
      return;
      label35: if (!localIntent.hasExtra("push2_flag"))
        continue;
      c localc = new c();
      localc.a("push2_id", localIntent.getStringExtra("push2_id")).a("push2_title", localIntent.getStringExtra("push2_title")).a("push2_type", localIntent.getStringExtra("push2_type"));
      if (!"push2_delete_action".equals(localIntent.getAction()))
      {
        i locali = g.a().f();
        if (locali != null)
        {
          locali.a(localIntent);
          a(localIntent);
        }
        LogHelper.a(LogHelper.Action.NOTIFICATION_CLICK, localc);
        continue;
      }
      LogHelper.a(LogHelper.Action.NOTIFICATION_CANCELED, localc);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.RedirectActivity
 * JD-Core Version:    0.6.0
 */