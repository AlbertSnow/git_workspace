package com.wandoujia.jupiter.update;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v4.app.b;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.p4.utils.c;
import com.wandoujia.p4.views.CommonPopupView;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.view.CustomFontTextView;
import com.wandoujia.ripple_framework.view.a.a;
import com.wandoujia.update.protocol.UpdateInfo;
import com.wandoujia.update.protocol.UpdateInfo.SelfUpdatePriority;
import com.wandoujia.update.toolkit.SelfUpdateResult;

public final class UpdateNotification
{
  private CommonPopupView a;
  private a b;
  private a c;
  private SelfUpdateResult d;
  private Activity e;
  private boolean f;
  private m g;
  private com.wandoujia.ripple_framework.log.h h = new d(this);

  public UpdateNotification(Activity paramActivity, SelfUpdateResult paramSelfUpdateResult)
  {
    this.e = paramActivity;
    this.d = paramSelfUpdateResult;
    if (!TextUtils.isEmpty(this.d.installerPath));
    for (boolean bool = true; ; bool = false)
    {
      this.f = bool;
      return;
    }
  }

  private void a(a parama)
  {
    parama.show();
    com.wandoujia.ripple_framework.i.k().h().a(Logger.Module.SELF_UPGRADE, ViewLogPackage.Action.POPUP, "upgrade_dialog", Long.valueOf(this.d.updateInfo.getPriority().ordinal()));
  }

  private void c()
  {
    p.a(this.e, new e(this), new f()).a();
    com.wandoujia.ripple_framework.i.k().h().a(Logger.Module.SELF_UPGRADE, ViewLogPackage.Action.POPUP, "upgrade_snackbar", Long.valueOf(this.d.updateInfo.getPriority().ordinal()));
  }

  private void d()
  {
    com.wandoujia.ripple_framework.view.a.h localh = new com.wandoujia.ripple_framework.view.a.h(this.e);
    View localView1 = c.a(this.e, 2130903412);
    localh.a(localView1);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    localSpannableStringBuilder.append(this.d.updateInfo.getUpdateSubTitle());
    localSpannableStringBuilder.append(Html.fromHtml(this.e.getResources().getString(2131625554)));
    localSpannableStringBuilder.setSpan(new g(this), this.d.updateInfo.getUpdateSubTitle().length(), localSpannableStringBuilder.length(), 33);
    TextView localTextView1 = (TextView)localView1.findViewById(2131492972);
    localTextView1.setMovementMethod(LinkMovementMethod.getInstance());
    localTextView1.setText(localSpannableStringBuilder);
    TextView localTextView2 = (TextView)localView1.findViewById(2131492997);
    View localView2 = localView1.findViewById(2131492866);
    if (this.d.updateInfo.getPriority() == UpdateInfo.SelfUpdatePriority.STRONG)
    {
      localTextView2.setVisibility(8);
      localView2.setVisibility(8);
      localh.a(2131625547).a(2131624960, new i(this)).b(2131624939, new h(this));
    }
    while (true)
    {
      this.b = localh.a();
      return;
      localTextView2.setVisibility(0);
      localView2.setVisibility(0);
      localView2.setOnClickListener(this.h);
      localh.a(false);
      String str1 = this.e.getResources().getString(2131625550);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.d.updateInfo.getVersion();
      String str2 = String.format(str1, arrayOfObject);
      if (this.f)
        str2 = str2 + this.e.getResources().getString(2131625545);
      localTextView2.setText(str2);
      localh.a(2131625546);
    }
  }

  private void e()
  {
    if (this.a != null)
      return;
    this.a = CommonPopupView.a(this.e);
    View localView1 = c.a(this.a, 2130903413);
    this.a.setContentView(localView1);
    CustomFontTextView localCustomFontTextView1 = (CustomFontTextView)localView1.findViewById(2131492998);
    if (!TextUtils.isEmpty(this.d.updateInfo.getUpdateTitle()))
      localCustomFontTextView1.setText(this.d.updateInfo.getUpdateTitle());
    CustomFontTextView localCustomFontTextView2 = (CustomFontTextView)localView1.findViewById(2131493320);
    Resources localResources = this.e.getResources();
    int i;
    int j;
    label192: View localView2;
    if (this.f)
    {
      i = 2131625553;
      String str = localResources.getString(i);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.d.updateInfo.getVersion();
      localCustomFontTextView2.setText(String.format(str, arrayOfObject));
      ((CustomFontTextView)localView1.findViewById(2131492972)).setText(this.d.updateInfo.getUpdateSubTitle());
      if (TextUtils.isEmpty(this.d.updateInfo.getUpdateLog()))
        break label295;
      j = 1;
      if (j != 0)
        ((CustomFontTextView)localView1.findViewById(2131493767)).setText(this.d.updateInfo.getUpdateLog());
      localView2 = localView1.findViewById(2131493764);
      if (j == 0)
        break label301;
    }
    label295: label301: for (int k = 0; ; k = 8)
    {
      localView2.setVisibility(k);
      localView1.findViewById(2131492866).setOnClickListener(this.h);
      localView1.findViewById(2131492885).setOnClickListener(this.h);
      this.a.setOnDismissListener$f79fa32(new j(this));
      return;
      i = 2131625552;
      break;
      j = 0;
      break label192;
    }
  }

  public final void a()
  {
    if (!this.f)
      if (this.d.updateInfo.getPriority() == UpdateInfo.SelfUpdatePriority.EXTREME)
      {
        d();
        a(this.b);
      }
    do
    {
      return;
      switch (k.a[this.d.updateInfo.getPriority().ordinal()])
      {
      case 1:
      default:
        return;
      case 2:
      case 3:
      case 4:
      }
    }
    while (b.P("NORMAL_SNACKBAR_KEY").equals(this.d.updateInfo.getVersion()));
    b.k("NORMAL_SNACKBAR_KEY", this.d.updateInfo.getVersion());
    c();
    return;
    c();
    d();
    this.c = this.b;
    return;
    d();
    a(this.b);
  }

  public final boolean b()
  {
    if (this.c != null)
    {
      a(this.c);
      this.c = null;
      return true;
    }
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.update.UpdateNotification
 * JD-Core Version:    0.6.0
 */