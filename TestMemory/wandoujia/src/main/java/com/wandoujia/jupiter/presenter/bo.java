package com.wandoujia.jupiter.presenter;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.wandoujia.api.proto.Image;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.c.h;
import com.wandoujia.ripple_framework.k;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.e;
import java.util.List;

public final class bo extends c
{
  private com.wandoujia.nirvana.framework.ui.a a;

  public final void a()
  {
    super.a();
    if (this.a != null)
      this.a.a();
    this.a = null;
  }

  protected final void a(Model paramModel)
  {
    label88: label118: List localList;
    if (!CollectionUtils.isEmpty(paramModel.x()))
    {
      h().b(2131492889).e();
      new e();
      e.b(h().h(), ((Image)paramModel.x().get(0)).url, 0);
      if (TextUtils.isEmpty(paramModel.n()))
        break label187;
      h().b(2131493960).a(paramModel.n()).e();
      if (TextUtils.isEmpty(paramModel.r()))
        break label203;
      h().b(2131492966).a(paramModel.r()).e();
      a();
      localList = paramModel.A();
      if (!localList.isEmpty())
        break label219;
      h().b(2131493953).c();
    }
    label187: label203: label219: Model localModel;
    ViewGroup localViewGroup;
    do
    {
      return;
      h().b(2131492889).c();
      new e();
      e.a(h().h(), null);
      break;
      h().b(2131493960).c();
      break label88;
      h().b(2131492966).c();
      break label118;
      h().b(2131493953).e();
      localModel = (Model)localList.get(0);
      localViewGroup = h().b(2131493953).i();
      if (localModel.g() != TemplateTypeEnum.TemplateType.APP_ATTACH)
        continue;
      this.a = h.k(localViewGroup, (k)g());
      this.a.a(localModel);
      return;
    }
    while (localModel.g() != TemplateTypeEnum.TemplateType.VIDEO_ATTACH);
    this.a = h.l(localViewGroup, (k)g());
    this.a.a(localModel);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.bo
 * JD-Core Version:    0.6.0
 */