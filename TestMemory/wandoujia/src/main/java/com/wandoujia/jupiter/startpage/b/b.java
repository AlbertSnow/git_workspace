package com.wandoujia.jupiter.startpage.b;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.jupiter.j;
import com.wandoujia.jupiter.startpage.manager.LocalFeedManager;

final class b
  implements View.OnClickListener
{
  public final void onClick(View paramView)
  {
    ((LocalFeedManager)j.a().a("local_feed")).a("SelfUpdateFeed");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.startpage.b.b
 * JD-Core Version:    0.6.0
 */