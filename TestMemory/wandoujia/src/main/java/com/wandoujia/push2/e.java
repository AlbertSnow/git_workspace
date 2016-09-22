package com.wandoujia.push2;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v4.app.aw;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.wandoujia.push2.protocol.NormalBody;
import com.wandoujia.push2.protocol.NormalBody.IronStyle;

final class e
  implements Runnable
{
  e(Intent paramIntent, NormalBody paramNormalBody, f paramf, int paramInt)
  {
  }

  @TargetApi(16)
  public final void run()
  {
    PendingIntent localPendingIntent1 = PendingIntent.getActivity(g.a().b(), 0, this.a, 134217728);
    Intent localIntent = LogHelper.b(this.b, "notification");
    PendingIntent localPendingIntent2 = PendingIntent.getActivity(g.a().b(), 0, localIntent, 134217728);
    aw localaw = new aw(g.a().b());
    localaw.a(g.a().c().c()).c(this.b.getTitle()).a(this.b.getTitle()).b(this.b.getDescription()).a().a(System.currentTimeMillis()).a(localPendingIntent1).b(localPendingIntent2);
    if (this.c.a != null)
      localaw.f = Bitmap.createBitmap(this.c.a);
    Notification localNotification = localaw.b();
    localNotification.contentView = new RemoteViews(g.a().b().getPackageName(), R.layout.iron_layout);
    localNotification.contentView.setTextViewText(R.id.title, this.b.getTitle());
    localNotification.contentView.setTextViewText(R.id.content, this.b.getDescription());
    if (this.c.a != null)
    {
      localNotification.contentView.setBitmap(R.id.large_icon, "setImageBitmap", this.c.a);
      switch (this.b.getStyle())
      {
      default:
      case 1:
      case 0:
      }
    }
    while (true)
    {
      if (d.b() >= 16)
        localNotification.priority = 2;
      g.a();
      g.a(this.d, localNotification);
      c localc = new c(this.b);
      localc.a("push2_type", "notification");
      LogHelper.a(LogHelper.Action.NOTIFICATION_SHOW, localc);
      return;
      localNotification.contentView.setImageViewResource(R.id.large_icon, g.a().c().d());
      break;
      if ((this.c.c != null) && (d.b() >= 16))
      {
        localNotification.bigContentView = new RemoteViews(g.a().b().getPackageName(), R.layout.gold_layout);
        localNotification.bigContentView.setBitmap(R.id.big_image, "setImageBitmap", this.c.c);
        localNotification.bigContentView.setTextViewText(R.id.title, this.b.getTitle());
        localNotification.bigContentView.setTextViewText(R.id.content, this.b.getDescription());
      }
      if (this.c.d == null)
        continue;
      localNotification.contentView = new RemoteViews(g.a().b().getPackageName(), R.layout.gold_collapsed_layout);
      localNotification.contentView.setBitmap(R.id.small_image, "setImageBitmap", this.c.d);
      continue;
      if (this.c.b != null)
      {
        localNotification.contentView.setBitmap(R.id.button_icon, "setImageBitmap", this.c.b);
        localNotification.contentView.setViewVisibility(R.id.button_layout, 0);
      }
      if (TextUtils.isEmpty(this.b.getIronStyle().getText()))
        continue;
      localNotification.contentView.setTextViewText(R.id.action_button, this.b.getIronStyle().getText());
      localNotification.contentView.setViewVisibility(R.id.button_layout, 0);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.push2.e
 * JD-Core Version:    0.6.0
 */