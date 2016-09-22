package com.wandoujia.ripple_framework.c;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.LinearLayout.LayoutParams;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.R.dimen;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public final class bm extends c
{
  protected final void a(Model paramModel)
  {
    int i;
    if (TextUtils.isEmpty(paramModel.n()))
    {
      h().b(R.id.header).f(8);
      if ((CollectionUtils.isEmpty(paramModel.B())) || (((Model)paramModel.B().get(0)).g() != TemplateTypeEnum.TemplateType.SINGLE_HIGHLIGHT))
        break label177;
      i = 1;
      label60: if (i == 0)
        break label182;
      LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
      localLayoutParams1.setMargins(0, 0, 0, 0);
      h().b(R.id.header).f(8);
      h().b(R.id.container).a(localLayoutParams1);
      h().b(R.id.container).m();
      if (CollectionUtils.isEmpty(paramModel.w()))
        h().b(R.id.container).g(R.color.grey_96);
    }
    label177: label182: 
    do
    {
      return;
      h().b(R.id.header).f(0);
      break;
      i = 0;
      break label60;
      LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
      localLayoutParams2.setMargins(0, f().getResources().getDimensionPixelOffset(R.dimen.section_margin_top), 0, 0);
      h().b(R.id.container).a(localLayoutParams2);
      h().b(R.id.container).m();
    }
    while (!CollectionUtils.isEmpty(paramModel.w()));
    h().b(R.id.container).g(R.color.white_no_transparency);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.bm
 * JD-Core Version:    0.6.0
 */