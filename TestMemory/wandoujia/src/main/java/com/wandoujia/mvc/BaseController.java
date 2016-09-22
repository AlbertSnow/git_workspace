package com.wandoujia.mvc;

public abstract interface BaseController<V extends BaseView, M extends BaseModel>
{
  public abstract void bind(V paramV, M paramM);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.mvc.BaseController
 * JD-Core Version:    0.6.0
 */