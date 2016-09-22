package com.wandoujia.jupiter.subscribe;

import android.view.View;
import android.widget.TextView;
import com.wandoujia.api.proto.PublisherDetail;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.CustomFontTextView;
import com.wandoujia.ripple_framework.view.e;

public final class m extends c
{
  private PublisherButtonPresenter a;
  private e g;

  protected final void a(Model paramModel)
  {
    h().i(2131362232);
    if (this.a == null)
      this.a = new PublisherButtonPresenter((CustomFontTextView)e().findViewById(2131493763));
    while (true)
    {
      if (this.g == null)
        this.g = new e();
      this.a.a(paramModel);
      e.a((AsyncImageView)e().findViewById(2131493101), paramModel.I().avatar);
      ((TextView)h().b(2131492998).a()).setText(paramModel.I().nick);
      ((TextView)h().b(2131493413).a()).setText(paramModel.I().description);
      return;
      this.a.a();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.m
 * JD-Core Version:    0.6.0
 */