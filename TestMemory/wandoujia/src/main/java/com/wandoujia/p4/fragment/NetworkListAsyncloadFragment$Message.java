package com.wandoujia.p4.fragment;

 enum NetworkListAsyncloadFragment$Message
{
  static
  {
    REFRESH_FAILED = new Message("REFRESH_FAILED", 3);
    Message[] arrayOfMessage = new Message[4];
    arrayOfMessage[0] = REFRESHING;
    arrayOfMessage[1] = REFRESH_IS_SLOW;
    arrayOfMessage[2] = REFRESH_SUCCESS;
    arrayOfMessage[3] = REFRESH_FAILED;
    $VALUES = arrayOfMessage;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.fragment.NetworkListAsyncloadFragment.Message
 * JD-Core Version:    0.6.0
 */