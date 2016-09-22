package com.wandoujia.ripple_framework.ripple.b;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.c.h;
import com.wandoujia.ripple_framework.k;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public final class e extends c
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
    label62: List localList;
    if (!TextUtils.isEmpty(paramModel.n()))
    {
      h().b(R.id.title).a(paramModel.n()).e();
      if (TextUtils.isEmpty(paramModel.r()))
        break label114;
      h().b(R.id.snippet).a(paramModel.r()).e();
      a();
      localList = paramModel.A();
      if (!localList.isEmpty())
        break label131;
      h().b(R.id.attachment).c();
    }
    label114: Model localModel;
    label131: ViewGroup localViewGroup;
    do
    {
      return;
      h().b(R.id.title).c();
      break;
      h().b(R.id.snippet).c();
      break label62;
      h().b(R.id.attachment).e();
      localModel = (Model)localList.get(0);
      localViewGroup = h().b(R.id.attachment).i();
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

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.ripple.b.e
 * JD-Core Version:    0.6.0
 */