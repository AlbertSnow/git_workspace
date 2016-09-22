package com.wandoujia.jupiter.update;

import com.wandoujia.jupiter.util.n;
import com.wandoujia.update.protocol.UpdateInfo;
import com.wandoujia.update.protocol.UpdateInfo.SelfUpdatePriority;
import com.wandoujia.update.toolkit.SelfUpdateResult;

final class j
  implements n
{
  j(UpdateNotification paramUpdateNotification)
  {
  }

  public final void a()
  {
    if (UpdateNotification.c(this.a).updateInfo.getPriority() == UpdateInfo.SelfUpdatePriority.EXTREME)
      UpdateNotification.a(this.a, UpdateNotification.a(this.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.update.j
 * JD-Core Version:    0.6.0
 */