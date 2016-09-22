package com.wandoujia.ripple_framework.adapter;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.wandoujia.api.proto.MorphDetail;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.R.layout;
import com.wandoujia.ripple_framework.c.af;
import com.wandoujia.ripple_framework.c.aj;
import com.wandoujia.ripple_framework.c.bm;
import com.wandoujia.ripple_framework.c.h;
import com.wandoujia.ripple_framework.theme.ThemeType;

public class a extends f
{
  protected static ViewGroup a(ViewGroup paramViewGroup)
  {
    FrameLayout localFrameLayout = new FrameLayout(paramViewGroup.getContext());
    localFrameLayout.addView(paramViewGroup);
    paramViewGroup.setId(R.id.model);
    localFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    return localFrameLayout;
  }

  public com.wandoujia.nirvana.framework.ui.a a(ViewGroup paramViewGroup, MorphDetail paramMorphDetail)
  {
    return null;
  }

  protected com.wandoujia.nirvana.framework.ui.a a(ViewGroup paramViewGroup, TemplateTypeEnum.TemplateType paramTemplateType)
  {
    return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.rip_empty_view));
  }

  protected void a(TemplateTypeEnum.TemplateType paramTemplateType, com.wandoujia.nirvana.framework.ui.a parama)
  {
  }

  public final com.wandoujia.nirvana.framework.ui.a c(ViewGroup paramViewGroup, int paramInt)
  {
    Object localObject2;
    Object localObject1;
    if (j.a(paramInt))
    {
      localObject2 = TemplateTypeEnum.TemplateType.MORPH_CARD;
      localObject1 = a(paramViewGroup, j.b(paramInt));
    }
    while (true)
    {
      a((TemplateTypeEnum.TemplateType)localObject2, (com.wandoujia.nirvana.framework.ui.a)localObject1);
      int i = b.a[localObject2.ordinal()];
      Object localObject3 = null;
      switch (i)
      {
      default:
        label92: if (localObject3 == null)
          break;
        ((com.wandoujia.nirvana.framework.ui.a)localObject1).a((com.wandoujia.nirvana.framework.ui.b)localObject3);
      case 8:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      }
      TemplateTypeEnum.TemplateType localTemplateType;
      com.wandoujia.nirvana.framework.ui.a locala;
      do
      {
        return localObject1;
        localTemplateType = TemplateTypeEnum.TemplateType.values()[paramInt];
        switch (b.a[localTemplateType.ordinal()])
        {
        default:
          locala = null;
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
        case 12:
        case 13:
        case 14:
        case 15:
        case 16:
        case 17:
        case 18:
        case 19:
        case 20:
        case 21:
        case 22:
        case 23:
        case 24:
        case 25:
        case 26:
        case 27:
        case 28:
        case 29:
        case 30:
        case 31:
        case 32:
        case 33:
        case 34:
        case 35:
        case 36:
        case 37:
        case 38:
        case 39:
        case 40:
        }
        while (true)
        {
          if (locala != null)
            break label1203;
          localObject1 = a(paramViewGroup, localTemplateType);
          localObject2 = localTemplateType;
          break;
          locala = h.b((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.rip_detail_article_text));
          continue;
          locala = h.c((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.rip_detail_article_image));
          continue;
          locala = h.e((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.rip_detail_article_video));
          continue;
          locala = h.d((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.rip_detail_article_image));
          continue;
          locala = h.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.rip_detail_article_header));
          continue;
          locala = h.f((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.rip_detail_article_footer));
          continue;
          locala = h.i((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.rip_feed_provider_meta));
          continue;
          locala = h.g((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.rip_empty_view));
          continue;
          locala = h.l((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.rip_detail_video_attachment), g());
          continue;
          locala = h.k((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.rip_detail_app_attachment), g());
          continue;
          locala = h.q((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.rip_feed_video_attachment), g());
          continue;
          locala = h.r((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.rip_feed_video_attachment_for_box), g());
          continue;
          locala = h.q((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.rip_feed_app_attachment), g());
          continue;
          locala = h.r((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.rip_feed_app_attachment_for_box), g());
          continue;
          locala = h.m((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.rip_feed_single_pic), g());
          continue;
          locala = h.n((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.rip_feed_single_pic_for_box), g());
          continue;
          locala = h.o((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.rip_feed_short_text), g());
          continue;
          locala = h.p((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.lite_info_item), g());
          continue;
          locala = h.s((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.rip_feed_text), g());
          continue;
          locala = h.t((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.rip_feed_filter_text), g());
          continue;
          locala = h.u((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.rip_feed_filter_text_for_box), g());
          continue;
          locala = h.v((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.jupiter_single_text), g());
          continue;
          locala = h.b(a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.single_tall)), g());
          continue;
          locala = h.c(a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.single_mini)), g());
          continue;
          locala = h.d(a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.jupiter_card_mini_with_pos)), g());
          continue;
          locala = h.e(a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.jupiter_grand_card)), g());
          continue;
          locala = h.f((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.jupiter_grand_card), g());
          continue;
          locala = h.g(a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.jupiter_section_auto_top_header)), g()).a(new bm());
          continue;
          locala = h.g(a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.jupiter_section_top_header)), g());
          continue;
          locala = h.j(a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.jupiter_section_auto_bottom_more)), g());
          continue;
          locala = h.j(a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.jupiter_section_bottom_more)), g());
          continue;
          locala = h.h((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.jupiter_single_tiny), g());
          continue;
          locala = h.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.jupiter_single_tiny_no_button), g()).b(R.id.sub_title, new aj());
          continue;
          locala = h.i((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.jupiter_single_highlight), g());
          continue;
          locala = new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, R.layout.jupiter_label_no_margin)).a(R.id.title, new af());
        }
        localObject3 = new com.wandoujia.ripple_framework.theme.a();
        break label92;
        localObject3 = new com.wandoujia.ripple_framework.theme.a().a(ThemeType.BACKGROUND, R.color.bg_white);
        break label92;
      }
      while ((!GlobalConfig.isDebug()) || (!"com.wandoujia".equals(GlobalConfig.getAppContext().getPackageName())));
      String str = String.format("no ColorThemePresenter for template %s", new Object[] { localObject2 });
      Toast.makeText(paramViewGroup.getContext(), str, 0).show();
      return localObject1;
      label1203: localObject1 = locala;
      localObject2 = localTemplateType;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.adapter.a
 * JD-Core Version:    0.6.0
 */