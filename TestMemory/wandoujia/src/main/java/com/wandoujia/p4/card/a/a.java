package com.wandoujia.p4.card.a;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.image.ImageUri;
import com.wandoujia.image.ImageUri.ImageUriType;
import com.wandoujia.mvc.Action;
import com.wandoujia.mvc.BaseController;
import com.wandoujia.p4.button.views.SubActionButton;
import com.wandoujia.p4.card.models.CardViewModel;
import com.wandoujia.p4.card.models.CardViewModel.SubBadgeType;
import java.util.Iterator;
import java.util.List;

public final class a
  implements BaseController<com.wandoujia.p4.card.views.a, CardViewModel>
{
  public static void a(com.wandoujia.p4.card.views.a parama, CardViewModel paramCardViewModel)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramCardViewModel.b() != null)
    {
      Iterator localIterator = paramCardViewModel.b().iterator();
      while (localIterator.hasNext())
      {
        localStringBuilder.append(((CardViewModel.SubBadgeType)localIterator.next()).name());
        localStringBuilder.append(',');
      }
      if (localStringBuilder.length() > 0)
        localStringBuilder.deleteCharAt(-1 + localStringBuilder.length());
    }
    if (parama.a() != null)
      parama.a().setText(paramCardViewModel.g());
    if (parama.b() != null)
    {
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
      List localList1 = paramCardViewModel.b();
      if ((localList1 != null) && (!localList1.isEmpty()))
        localSpannableStringBuilder.append(com.wandoujia.p4.community.a.a(parama.b().getContext(), (int)parama.b().getTextSize(), localList1));
      CharSequence localCharSequence = paramCardViewModel.a();
      if (localCharSequence != null)
        localSpannableStringBuilder.append(localCharSequence);
      parama.b().setText(localSpannableStringBuilder);
    }
    if (parama.d() != null)
      parama.d().setText(paramCardViewModel.f());
    if (parama.f() != null)
      parama.f().setVisibility(8);
    if (parama.c() != null)
      com.wandoujia.image.c.a.a(parama.c(), new ImageUri(paramCardViewModel.c(), ImageUri.ImageUriType.UNSPECIFIED), 2131361864);
    List localList2;
    if (parama.g() != null)
    {
      localList2 = paramCardViewModel.d();
      if (CollectionUtils.isEmpty(localList2))
        parama.g().setVisibility(8);
    }
    else if (parama.e() != null)
    {
      if (!TextUtils.isEmpty(paramCardViewModel.e()))
        break label386;
      parama.e().setVisibility(8);
    }
    while (true)
    {
      if (parama.getView() != null)
      {
        Action localAction = paramCardViewModel.b(parama.getView());
        if (localAction != null)
          parama.getView().setOnClickListener(new c(localAction));
      }
      return;
      parama.g().setVisibility(0);
      parama.g().setData(localList2);
      break;
      label386: parama.e().setVisibility(0);
      parama.e().setText(paramCardViewModel.e());
      parama.e().setOnClickListener(new b(paramCardViewModel, parama));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.card.a.a
 * JD-Core Version:    0.6.0
 */