package com.wandoujia.ripple_framework.c;

import android.text.TextUtils;
import android.widget.TextView;
import com.wandoujia.api.proto.ArticleDetail;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.util.r;

final class u extends c
{
  protected final void a(Model paramModel)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    String str1 = paramModel.K().author;
    Long localLong = paramModel.K().published_date;
    String str2 = paramModel.m().n();
    if ((localLong != null) && (localLong.longValue() > 0L))
    {
      if (!TextUtils.isEmpty(str2))
        localStringBuilder.append(str2).append(" · ");
      if (!TextUtils.isEmpty(str1))
        localStringBuilder.append(str1).append(" · ");
      localStringBuilder.append(r.a(localLong));
    }
    ((TextView)e()).setText(localStringBuilder);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.u
 * JD-Core Version:    0.6.0
 */