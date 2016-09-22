package com.wandoujia.ripple_framework.c;

import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public final class av extends c
{
  private com.wandoujia.nirvana.framework.ui.a a;

  public final void a()
  {
    super.a();
    if (this.a != null)
      this.a.a();
  }

  protected final void a(Model paramModel)
  {
    if ((!CollectionUtils.isEmpty(paramModel.B())) && (((Model)paramModel.B().get(0)).g() == TemplateTypeEnum.TemplateType.SINGLE_GRAND))
    {
      if (this.a == null)
        this.a = h.f(h().i(), j());
      this.a.a(paramModel.B().get(0));
    }
    do
      return;
    while (!GlobalConfig.isDebug());
    throw new IllegalArgumentException("GRAND_CONTAINER must contains SINGLE_GRAND with subModels");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.av
 * JD-Core Version:    0.6.0
 */