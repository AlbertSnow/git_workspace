package com.wandoujia.p4.d;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.wandoujia.p4.connection.ui.ConnectionActivity;
import com.wandoujia.ripple_framework.view.a.h;

public final class a
{
  public static void a(Activity paramActivity, Intent paramIntent)
  {
    if (paramIntent == null);
    while (true)
    {
      return;
      String str = paramIntent.getAction();
      if (TextUtils.isEmpty(str))
        break;
      if (!str.contains("conn.wandoujia.com/qr"))
        continue;
      if (com.wandoujia.p4.connection.a.a.b(paramActivity))
      {
        Intent localIntent = new Intent(paramActivity, ConnectionActivity.class);
        localIntent.addFlags(67108864);
        localIntent.setData(Uri.parse(str));
        paramActivity.startActivity(localIntent);
        return;
      }
      new com.wandoujia.p4.app.view.a.a(paramActivity, false).a();
      return;
    }
    new h(paramActivity).a(2131625299).b(2131625301).a(new c()).a(2131625300, new b()).b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.d.a
 * JD-Core Version:    0.6.0
 */