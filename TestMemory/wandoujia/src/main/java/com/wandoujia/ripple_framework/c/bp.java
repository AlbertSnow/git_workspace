package com.wandoujia.ripple_framework.c;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.wandoujia.api.proto.Action;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.api.proto.Image;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.R.dimen;
import com.wandoujia.ripple_framework.R.drawable;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public final class bp extends c
{
  private boolean a = true;

  public bp()
  {
    this.a = false;
  }

  public bp(byte paramByte)
  {
  }

  protected final void a(Model paramModel)
  {
    if (i.k().h() != null)
      i.k().h().g(e());
    TextView localTextView1 = (TextView)h().a(R.id.title).a();
    TextView localTextView2 = (TextView)h().a(R.id.sub_title).a();
    View localView1 = h().a(R.id.action_more).a();
    if (!this.a);
    for (View localView2 = null; ; localView2 = localView1)
    {
      View localView3;
      if (localView2 != null)
      {
        if ((paramModel.b().action == null) || ((TextUtils.isEmpty(paramModel.b().action.intent)) && (TextUtils.isEmpty(paramModel.b().action.url))))
          localView2.setVisibility(8);
      }
      else
      {
        localView3 = h().a(R.id.model).a();
        if (localView3 == null)
          localView3 = e();
        if ((paramModel.b().action != null) && ((!TextUtils.isEmpty(paramModel.b().action.intent)) || (!TextUtils.isEmpty(paramModel.b().action.url))))
          break label395;
        localView3.setBackgroundResource(R.color.white_no_transparency);
        label212: if ((paramModel.w() != null) && (!paramModel.w().isEmpty()) && (!TextUtils.isEmpty(((Image)paramModel.w().get(0)).url)))
          break label406;
        h().a(R.id.cover).f(8);
        localTextView1.setTextColor(e().getResources().getColor(R.color.grey_20));
        localTextView2.setTextColor(e().getResources().getColor(R.color.grey_60));
        if (localView2 != null)
          localView2.setBackgroundResource(R.drawable.ic_section_more);
        label316: if ((localTextView1.getLayoutParams() instanceof LinearLayout.LayoutParams))
        {
          if (!TextUtils.isEmpty(paramModel.b().sub_title))
            break label503;
          if (paramModel.g() != TemplateTypeEnum.TemplateType.GROUP)
            break label471;
          LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localTextView1.getLayoutParams();
          localTextView1.setPadding(localTextView1.getPaddingLeft(), localTextView1.getPaddingTop(), localTextView1.getPaddingRight(), localLayoutParams.topMargin);
        }
      }
      while (true)
      {
        localTextView2.setVisibility(8);
        return;
        localView2.setVisibility(0);
        break;
        label395: localView3.setBackgroundResource(R.drawable.jupiter_card_bg);
        break label212;
        label406: h().a(R.id.cover).f(0);
        localTextView1.setTextColor(e().getResources().getColor(R.color.white_no_transparency));
        localTextView2.setTextColor(e().getResources().getColor(R.color.white_no_transparency));
        if (localView2 == null)
          break label316;
        localView2.setBackgroundResource(R.drawable.ic_section_more);
        break label316;
        label471: localTextView1.setPadding(localTextView1.getPaddingLeft(), localTextView1.getPaddingTop(), localTextView1.getPaddingRight(), e().getResources().getDimensionPixelOffset(R.dimen.section_card_title_margin_bottom_no_subtitle));
      }
      label503: localTextView1.setPadding(localTextView1.getPaddingLeft(), localTextView1.getPaddingTop(), localTextView1.getPaddingRight(), e().getResources().getDimensionPixelOffset(R.dimen.section_card_title_margin_bottom));
      localTextView2.setVisibility(0);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.bp
 * JD-Core Version:    0.6.0
 */