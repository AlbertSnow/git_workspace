package com.wandoujia.jupiter.subscribe;

 enum PublisherButtonPresenter$SubscribableState
{
  static
  {
    NOT_SUBSCRIBED = new SubscribableState("NOT_SUBSCRIBED", 1);
    ON_SUBSCRIBE = new SubscribableState("ON_SUBSCRIBE", 2);
    ON_UNSUBSCRIBE = new SubscribableState("ON_UNSUBSCRIBE", 3);
    SubscribableState[] arrayOfSubscribableState = new SubscribableState[4];
    arrayOfSubscribableState[0] = SUBSCRIBED;
    arrayOfSubscribableState[1] = NOT_SUBSCRIBED;
    arrayOfSubscribableState[2] = ON_SUBSCRIBE;
    arrayOfSubscribableState[3] = ON_UNSUBSCRIBE;
    $VALUES = arrayOfSubscribableState;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.PublisherButtonPresenter.SubscribableState
 * JD-Core Version:    0.6.0
 */