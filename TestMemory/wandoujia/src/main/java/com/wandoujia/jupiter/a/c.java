package com.wandoujia.jupiter.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.nirvana.framework.ui.recycler.a;
import com.wandoujia.nirvana.framework.ui.recycler.i;
import com.wandoujia.ripple_framework.adapter.decoration.BaseItemDecoration;
import com.wandoujia.ripple_framework.adapter.decoration.BaseItemDecoration.Direction;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public class c extends BaseItemDecoration
{
  private i<Model> a;
  private boolean b;
  private Drawable c;
  private int d;
  private Drawable e;
  private Drawable f;
  private int g;

  public c(i<Model> parami)
  {
    this(parami, 0);
  }

  public c(i<Model> parami, int paramInt)
  {
    this(parami, false);
    this.d = paramInt;
  }

  public c(i<Model> parami, boolean paramBoolean)
  {
    this.a = parami;
    Resources localResources = JupiterApplication.e().getResources();
    this.c = localResources.getDrawable(2131362002);
    this.e = localResources.getDrawable(2131362003);
    this.f = localResources.getDrawable(2130838404);
    this.g = localResources.getDimensionPixelOffset(2131427707);
    this.b = paramBoolean;
    this.d = 0;
  }

  private int a(int paramInt)
  {
    if ((this.a instanceof a))
      paramInt -= ((a)this.a).c();
    return paramInt;
  }

  protected boolean a(int paramInt1, int paramInt2)
  {
    return true;
  }

  protected final BaseItemDecoration.Direction b(int paramInt1, int paramInt2)
  {
    return BaseItemDecoration.Direction.TOP;
  }

  protected final Drawable c(int paramInt1, int paramInt2)
  {
    if (d(paramInt1, paramInt2) == this.g)
    {
      int i = a(paramInt2);
      int j;
      if ((i <= 0) || (this.a == null) || (this.a.f() == null) || (i >= this.a.f().size()))
        j = 0;
      while (j != 0)
      {
        return this.f;
        Model localModel = (Model)this.a.f().get(i - 1);
        if ((localModel != null) && (!CollectionUtils.isEmpty(localModel.B())) && (((Model)localModel.B().get(0)).g() == TemplateTypeEnum.TemplateType.SINGLE_HIGHLIGHT));
        for (int k = 1; ; k = 0)
        {
          if ((k != 0) || (localModel.g() == TemplateTypeEnum.TemplateType.NAVIGATION))
            break label159;
          j = 1;
          break;
        }
        label159: j = 0;
      }
      return this.e;
    }
    return this.c;
  }

  protected int d(int paramInt1, int paramInt2)
  {
    int i = 1;
    if (CollectionUtils.isEmpty(this.a.f()));
    do
      return 0;
    while ((paramInt2 == -1 + this.a.f().size()) && (((Model)this.a.f().get(-1 + this.a.f().size())).g() == TemplateTypeEnum.TemplateType.END));
    if (paramInt2 == 0)
      return this.d;
    int j = a(paramInt2);
    if ((j > 0) && (j < this.a.f().size()))
    {
      Model localModel1 = (Model)this.a.f().get(j - 1);
      Model localModel2 = (Model)this.a.f().get(j);
      int k;
      if (localModel2.N())
        if (this.b)
          k = 0;
      label387: 
      while (true)
      {
        if ((localModel1.g() == TemplateTypeEnum.TemplateType.SEARCH_FILTER) || (localModel1.g() == TemplateTypeEnum.TemplateType.APP) || (localModel1.g() == TemplateTypeEnum.TemplateType.INTRODUCTION) || (localModel1.g() == TemplateTypeEnum.TemplateType.SEARCH_CATEGORY))
          k = 0;
        if ((localModel2.g() == TemplateTypeEnum.TemplateType.APP) && (localModel1.g() == TemplateTypeEnum.TemplateType.SINGLE_MINI))
          k = 0;
        if (k != 0)
          i = this.g;
        if (localModel1.g() == TemplateTypeEnum.TemplateType.DIVIDER)
          break;
        return i;
        if ((localModel2.c() != localModel1) && (localModel2.c() != localModel1.c()))
          break;
        k = 0;
        continue;
        if (localModel1.g() != localModel2.g());
        for (k = i; ; k = 0)
        {
          if ((localModel1.g() != localModel2.g()) || ((localModel1.g() != TemplateTypeEnum.TemplateType.SECTION_PORTRAIT) && (localModel1.g() != TemplateTypeEnum.TemplateType.SECTION_PORTRAIT_HEADER_BOTTOM) && (localModel1.g() != TemplateTypeEnum.TemplateType.SECTION_AUTO_GRID) && (localModel1.g() != TemplateTypeEnum.TemplateType.SECTION_AUTO_GRID_HEADER_BOTTOM) && (localModel1.g() != TemplateTypeEnum.TemplateType.MORPH_CARD)))
            break label387;
          k = i;
          break;
        }
      }
    }
    return super.d(paramInt1, paramInt2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.a.c
 * JD-Core Version:    0.6.0
 */