package com.wandoujia.p4.community.eventbus;

public final class CommunityEvent
{
  public final CommunityEvent.Type a;
  public final boolean b;
  public final Object c;

  public CommunityEvent(CommunityEvent.Type paramType, boolean paramBoolean, Object paramObject)
  {
    this.a = paramType;
    this.b = paramBoolean;
    this.c = paramObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.eventbus.CommunityEvent
 * JD-Core Version:    0.6.0
 */