package com.wandoujia.p4.gift.a;

import android.app.Activity;
import android.content.ClipboardManager;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.gift.http.model.GiftModel;

public final class a
  implements Action
{
  private final Activity a;
  private final GiftModel b;

  public a(Activity paramActivity, GiftModel paramGiftModel)
  {
    this.a = paramActivity;
    this.b = paramGiftModel;
  }

  public final void execute()
  {
    if (SystemUtil.aboveApiLevel(11))
      ((ClipboardManager)this.a.getSystemService("clipboard")).setText(this.b.getCdkey());
    String str = this.b.getPackageName();
    AppManager.a();
    AppManager.b(str);
    p.a(this.a, 2131624862, p.b).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.a.a
 * JD-Core Version:    0.6.0
 */