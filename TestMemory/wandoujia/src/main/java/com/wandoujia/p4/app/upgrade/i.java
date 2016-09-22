package com.wandoujia.p4.app.upgrade;

import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.jupiter.notification.NotificationController.NotificationType;
import com.wandoujia.jupiter.notification.a;
import com.wandoujia.logv3.model.packages.CardPackage.Builder;
import com.wandoujia.logv3.model.packages.ContentPackage.Builder;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.ResourcePackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Builder;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.push.protocol.NotificationModel;
import com.wandoujia.push.protocol.NotificationModel.ViewType;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;

final class i
  implements a
{
  i(NotificationModel paramNotificationModel, LocalAppInfo paramLocalAppInfo)
  {
  }

  public final void a()
  {
    TaskEvent.Builder localBuilder = new TaskEvent.Builder().action(TaskEvent.Action.NOTIFICATION_CLICK).status(TaskEvent.Status.START);
    localBuilder.view_log_package(new ViewLogPackage.Builder().module(Logger.Module.NOTIFICATION.name().toLowerCase()).action(ViewLogPackage.Action.REDIRECT).element(ViewLogPackage.Element.NOTIFICATION).name(null).build());
    ExtraPackage.Builder localBuilder1 = new ExtraPackage.Builder();
    localBuilder1.content_package(new ContentPackage.Builder().identity(this.a.getId()).title(this.b.getTitle()).sub_type(NotificationController.NotificationType.IMPORTANT_APP_UPGRADE.name().toLowerCase()).build());
    localBuilder1.card_package(new CardPackage.Builder().identity(this.a.getId()).type(this.a.getViewType().getStandardViewType()).sub_type(this.a.getViewType().getBigViewType()).build());
    localBuilder1.resource_package(new ResourcePackage.Builder().identity(this.b.getPackageName()).build());
    com.wandoujia.ripple_framework.i.k().h().a(localBuilder, localBuilder1);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.upgrade.i
 * JD-Core Version:    0.6.0
 */