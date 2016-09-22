package com.wandoujia.jupiter.presenter;

import android.support.v4.app.b;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import com.wandoujia.ripple_framework.util.BadgeUtil.SubBadgeType;

public final class eu extends c
{
  private boolean a;

  public eu()
  {
    this(false);
  }

  public eu(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  protected final void a(Model paramModel)
  {
    TextView localTextView1 = (TextView)e();
    TextView localTextView2 = (TextView)e();
    Object localObject;
    if (this.a)
      if ((paramModel.g() != TemplateTypeEnum.TemplateType.SINGLE_TALL) && (!TextUtils.isEmpty(paramModel.b().tag_line)))
      {
        localObject = paramModel.b().tag_line;
        if ((TextUtils.isEmpty((CharSequence)localObject)) || (!BadgeUtil.c(paramModel)))
          break label214;
        SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
        localSpannableStringBuilder.append(BadgeUtil.a((int)localTextView2.getTextSize(), BadgeUtil.SubBadgeType.VERIFIED));
        localSpannableStringBuilder.append((CharSequence)localObject);
        localObject = localSpannableStringBuilder;
      }
    while (true)
    {
      localTextView1.setText((CharSequence)localObject);
      return;
      ContentTypeEnum.ContentType localContentType = paramModel.f();
      switch (ev.a[localContentType.ordinal()])
      {
      default:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      }
      while (true)
      {
        localObject = paramModel.o();
        break;
        localObject = b.a(e().getContext(), paramModel.F()).toString();
        if (!TextUtils.isEmpty((CharSequence)localObject))
          break;
      }
      localObject = paramModel.o();
      break;
      label214: if (localObject != null)
        continue;
      localObject = "";
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.eu
 * JD-Core Version:    0.6.0
 */