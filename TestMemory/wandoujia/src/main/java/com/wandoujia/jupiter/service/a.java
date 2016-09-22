package com.wandoujia.jupiter.service;

import com.wandoujia.jupiter.service.model.AppActiveDirEntity;

public final class a extends com.wandoujia.ripple_framework.a.a<AppActiveDirEntity>
{
  public a(String paramString)
  {
    super(String.format("http://apis.wandoujia.com/five/v2/apps/%1$s/activedirs", new Object[] { paramString }), AppActiveDirEntity.class, new b(), new c(), new com.wandoujia.gson.c());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.service.a
 * JD-Core Version:    0.6.0
 */