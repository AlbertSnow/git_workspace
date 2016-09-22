package com.wandoujia.ripple_framework.c;

import android.content.Context;
import android.content.res.Resources;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.ripple_framework.R.dimen;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.SectionItemContainer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class bn extends c
{
  private static final List<TemplateTypeEnum.TemplateType> a;

  static
  {
    TemplateTypeEnum.TemplateType[] arrayOfTemplateType = new TemplateTypeEnum.TemplateType[3];
    arrayOfTemplateType[0] = TemplateTypeEnum.TemplateType.SINGLE_TINY;
    arrayOfTemplateType[1] = TemplateTypeEnum.TemplateType.SINGLE_TINY_NO_BUTTON;
    arrayOfTemplateType[2] = TemplateTypeEnum.TemplateType.SINGLE_HIGHLIGHT;
    a = Arrays.asList(arrayOfTemplateType);
  }

  public final void a()
  {
    if ((e() instanceof SectionItemContainer))
      ((SectionItemContainer)e()).setItemHeightInjector(null);
    super.a();
  }

  protected final void a(Model paramModel)
  {
    SectionItemContainer localSectionItemContainer;
    int i;
    if ((e() instanceof SectionItemContainer))
    {
      localSectionItemContainer = (SectionItemContainer)e();
      localSectionItemContainer.setMaxLines(paramModel.U());
      if (!CollectionUtils.isEmpty(paramModel.B()))
        break label74;
      i = 0;
    }
    while (true)
    {
      if (i != 0)
      {
        localSectionItemContainer.setMinItemWidth(f().getResources().getDimensionPixelOffset(R.dimen.card_section_item_width));
        localSectionItemContainer.setItemHeightInjector(new bo(this));
      }
      return;
      label74: Iterator localIterator = paramModel.B().iterator();
      while (true)
        if (localIterator.hasNext())
        {
          Model localModel = (Model)localIterator.next();
          if (a.contains(localModel.g()))
            continue;
          i = 0;
          break;
        }
      i = 1;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.bn
 * JD-Core Version:    0.6.0
 */