package com.wandoujia.ripple_framework.c;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.ripple_framework.R.string;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import com.wandoujia.ripple_framework.util.BadgeUtil.SubBadgeType;
import java.util.List;

public final class bq extends c
{
  protected final void a(Model paramModel)
  {
    if (ContentTypeEnum.ContentType.VIDEO.equals(paramModel.f()))
      ((TextView)e()).setText(R.string.video);
    do
      return;
    while ((paramModel.f() != ContentTypeEnum.ContentType.APP) || (paramModel.F() == null));
    TextView localTextView = (TextView)e();
    boolean bool = BadgeUtil.b(paramModel).contains(BadgeUtil.SubBadgeType.SPREAD);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    String str = paramModel.F().installed_count_str + f().getResources().getString(R.string.app_detail_meta_installed_num);
    if (bool)
      if (!TextUtils.isEmpty(paramModel.F().tagline))
        str = paramModel.F().tagline;
    while (true)
    {
      localSpannableStringBuilder.append(str);
      localTextView.setText(localSpannableStringBuilder);
      return;
      if (TextUtils.isEmpty(paramModel.o()))
        continue;
      str = paramModel.o();
      continue;
      if (!BadgeUtil.c(paramModel))
        continue;
      localSpannableStringBuilder.append(BadgeUtil.a((int)localTextView.getTextSize(), BadgeUtil.SubBadgeType.VERIFIED));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.bq
 * JD-Core Version:    0.6.0
 */