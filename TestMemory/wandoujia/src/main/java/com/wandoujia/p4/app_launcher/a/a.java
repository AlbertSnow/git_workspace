package com.wandoujia.p4.app_launcher.a;

import android.content.Context;
import android.widget.Toast;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.mvc.Action;

public final class a
  implements Action
{
  private String a;
  private String b;

  public a(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }

  public final void execute()
  {
    Context localContext = com.wandoujia.p4.a.a();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.b;
    String str = localContext.getString(2131624288, arrayOfObject);
    AppManager.a();
    AppManager.b(this.a);
    Toast.makeText(com.wandoujia.p4.a.a(), str, 0).show();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.a.a
 * JD-Core Version:    0.6.0
 */