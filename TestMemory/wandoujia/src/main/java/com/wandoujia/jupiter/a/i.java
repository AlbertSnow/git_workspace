package com.wandoujia.jupiter.a;

import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.nirvana.framework.ui.b.c;
import com.wandoujia.ripple_framework.model.Model;

public class i extends c<Model>
{
  private d b;

  public i(d paramd)
  {
    this.b = paramd;
    this.a = paramd.f();
  }

  public int getCount()
  {
    return this.b.d();
  }

  public long getItemId(int paramInt)
  {
    return this.b.b(paramInt);
  }

  public int getItemViewType(int paramInt)
  {
    return this.b.a(paramInt);
  }

  public int getViewTypeCount()
  {
    return TemplateTypeEnum.TemplateType.values().length;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.a.i
 * JD-Core Version:    0.6.0
 */