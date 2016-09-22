package com.unipay.unipay_sdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.widget.Button;
import com.unipay.beans.GameBaseBean;
import java.text.Format;
import java.text.SimpleDateFormat;

public class MainActivity extends Activity
{
  Format a = new SimpleDateFormat("yyMMddHHmmss");
  private Button b;
  private Handler c = new d(this);

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903040);
    setRequestedOrientation(1);
    GameBaseBean localGameBaseBean = new GameBaseBean("90234616120120921431100", "902346161", "86000504", "科技科技", "400 600 999", "游戏游戏", "uid", "00012243");
    this.b = ((Button)findViewById(2131165184));
    this.b.setOnClickListener(new l(this, localGameBaseBean));
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    return true;
  }

  protected void onDestroy()
  {
    super.onDestroy();
  }

  protected void onPause()
  {
    super.onPause();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.unipay_sdk.MainActivity
 * JD-Core Version:    0.6.0
 */