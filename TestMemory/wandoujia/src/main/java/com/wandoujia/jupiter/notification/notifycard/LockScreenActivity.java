package com.wandoujia.jupiter.notification.notifycard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.push2.protocol.NormalBody;
import com.wandoujia.push2.protocol.NormalBody.PopupStyle;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.view.CustomFontTextView;

public class LockScreenActivity extends FragmentActivity
{
  private NormalBody a;
  private View.OnClickListener b = new a(this);
  private View.OnClickListener c = new b(this);

  private void a(Intent paramIntent)
  {
    CustomFontTextView localCustomFontTextView;
    if ((paramIntent != null) && (paramIntent.getExtras() != null))
    {
      this.a = ((NormalBody)paramIntent.getSerializableExtra("lock_screen_notify_content"));
      if (this.a != null)
      {
        ((AsyncImageView)findViewById(2131493716)).a(this.a.getIcon(), 2131361864);
        ((CustomFontTextView)findViewById(2131493717)).setText(this.a.getTitle());
        localCustomFontTextView = (CustomFontTextView)findViewById(2131493718);
        if ((this.a.getPopupStyle() == null) || (this.a.getPopupStyle().getDescription() == null) || (this.a.getPopupStyle().getDescription().isEmpty()))
          break label210;
        localCustomFontTextView.setText(this.a.getPopupStyle().getDescription());
      }
    }
    while (true)
    {
      findViewById(2131493719).setOnClickListener(this.b);
      findViewById(2131493720).setOnClickListener(this.c);
      findViewById(2131493715).setOnClickListener(this.c);
      i.k().h().a(this, "/gamepopup?id=" + this.a.getId()).a(this);
      return;
      label210: localCustomFontTextView.setText(this.a.getDescription());
    }
  }

  public void onBackPressed()
  {
    if ((this.a != null) && (this.a.getType() != 2))
      Config.c(System.currentTimeMillis());
    super.onBackPressed();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().addFlags(6815744);
    setContentView(2130903334);
    a(getIntent());
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    a(paramIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.notification.notifycard.LockScreenActivity
 * JD-Core Version:    0.6.0
 */