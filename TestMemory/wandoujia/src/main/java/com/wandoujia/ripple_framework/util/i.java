package com.wandoujia.ripple_framework.util;

import com.wandoujia.api.proto.Action;
import com.wandoujia.api.proto.Action.Builder;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;

public final class i
{
  public static Entity a(String paramString1, String paramString2, String paramString3)
  {
    ContentTypeEnum.ContentType localContentType = ContentTypeEnum.ContentType.TAB;
    TemplateTypeEnum.TemplateType localTemplateType = TemplateTypeEnum.TemplateType.TAB;
    Action localAction = new Action.Builder().url(paramString2).intent(paramString3).build();
    return new Entity.Builder().id(Long.valueOf(-1L)).type(Integer.valueOf(localContentType.getValue())).template(Integer.valueOf(localTemplateType.getValue())).title(paramString1).sub_title(null).action(localAction).datePublished(Long.valueOf(-1L)).build();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.util.i
 * JD-Core Version:    0.6.0
 */