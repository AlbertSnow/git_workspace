package com.wandoujia.p4.gift.a;

import android.app.Activity;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.gift.http.model.GiftModel;
import com.wandoujia.p4.gift.view.model.GiftCardViewModelImpl.GiftType;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.a.h;
import java.util.Map;

public final class c
  implements Action
{
  private GiftModel a;
  private final Activity b;
  private Model c;

  public c(GiftModel paramGiftModel, Activity paramActivity)
  {
    this(null, paramGiftModel, paramActivity);
  }

  public c(Model paramModel, GiftModel paramGiftModel, Activity paramActivity)
  {
    this.a = paramGiftModel;
    this.b = paramActivity;
    this.c = paramModel;
  }

  public final void execute()
  {
    Map localMap = com.wandoujia.p4.app.detail.a.b.a().b();
    String str1 = this.a.getPackageName();
    if ((localMap.containsKey(str1)) && ("wdj://wechat/show_tips".equals(this.a.getSpecialAction())))
    {
      android.support.v4.app.b.v(this.b);
      return;
    }
    if ((localMap.containsKey(str1)) && (this.a.getCdkey() != null) && (this.a.getCdkey().startsWith("http")))
    {
      android.support.v4.app.b.d(this.b, ((GiftModel)localMap.get(str1)).getCdkey(), ((GiftModel)localMap.get(str1)).getTitle());
      return;
    }
    if ((!com.wandoujia.account.a.z()) && (GiftCardViewModelImpl.GiftType.CDKEY.getGiftType().equals(this.a.getProvideType())))
    {
      h localh = new h(this.b).a(true);
      localh.a(this.b.getString(2131624871)).b(this.b.getString(2131624872)).b(this.b.getString(2131624330), null).c(this.b.getString(2131624156), new e(this)).a(this.b.getString(2131624158), new d(this));
      localh.b().setCanceledOnTouchOutside(true);
      return;
    }
    if (((AppManager)i.k().a("app")).h(this.a.getPackageName()))
    {
      if (GiftCardViewModelImpl.GiftType.CDKEY.name().equals(this.a.getProvideType()))
      {
        android.support.v4.app.b.a(new g(this, 0), new Void[0]);
        return;
      }
      i.k().a("app");
      AppManager.b(this.a.getPackageName());
      return;
    }
    String str2 = this.b.getString(2131624885);
    if (!GiftCardViewModelImpl.GiftType.CDKEY.getGiftType().equals(this.a.getProvideType()))
      str2 = this.b.getString(2131624858);
    new h(this.b).a(this.b.getString(2131624871)).b(str2).b(this.b.getString(2131624564), null).a(this.b.getString(2131624875), new f(this)).b().setCanceledOnTouchOutside(true);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.a.c
 * JD-Core Version:    0.6.0
 */