package com.wandoujia.account.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.sdk.openapi.d;
import com.tencent.mm.sdk.openapi.e;
import com.tencent.mm.sdk.openapi.g;
import com.wandoujia.base.log.Log;

public class WDJWXEntryActivity extends Activity
  implements e
{
  private com.wandoujia.account.f.b a;

  private void a(Intent paramIntent)
  {
    if (paramIntent == null)
    {
      finish();
      return;
    }
    this.a = android.support.v4.app.b.y();
    if (this.a != null)
      d.a(paramIntent, this);
    finish();
  }

  public void a(com.tencent.mm.sdk.openapi.a parama)
  {
    Log.d("WDJWXEntryActivity", "on WXRequest: %s", new Object[] { parama });
  }

  public void a(com.tencent.mm.sdk.openapi.b paramb)
  {
    Log.d("WDJWXEntryActivity", "on WXResponse: %s", new Object[] { paramb });
    if ((paramb == null) || (this.a == null) || (this.a.d() == null));
    do
    {
      return;
      switch (paramb.a())
      {
      default:
        return;
      case 1:
      }
    }
    while (paramb.a != 0);
    String str = ((g)paramb).c;
    Log.d("WDJWXEntryActivity", "code %s, url %s, state %s", new Object[] { str, null, ((g)paramb).d });
    this.a.d().a(str, this.a.a());
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a(getIntent());
  }

  protected void onDestroy()
  {
    super.onDestroy();
    android.support.v4.app.b.z();
  }

  protected void onNewIntent(Intent paramIntent)
  {
    a(paramIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.activities.WDJWXEntryActivity
 * JD-Core Version:    0.6.0
 */