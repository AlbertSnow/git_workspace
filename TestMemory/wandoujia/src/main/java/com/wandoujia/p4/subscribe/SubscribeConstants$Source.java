package com.wandoujia.p4.subscribe;

public enum SubscribeConstants$Source
{
  static
  {
    DIVERSION_START_CONTENT_ORIENTATION = new Source("DIVERSION_START_CONTENT_ORIENTATION", 1);
    DIVERSION_START_CONTENT_LANDSCAPE = new Source("DIVERSION_START_CONTENT_LANDSCAPE", 2);
    DIVERSION_START_HOT_PUBLISHERS = new Source("DIVERSION_START_HOT_PUBLISHERS", 3);
    DIVERSION_START_RECOMMENDATION = new Source("DIVERSION_START_RECOMMENDATION", 4);
    FUNCTION_LIST_PUBLISHER_ITEM = new Source("FUNCTION_LIST_PUBLISHER_ITEM", 5);
    FUNCTION_PROFILE_PUBLISHER_BUTTON = new Source("FUNCTION_PROFILE_PUBLISHER_BUTTON", 6);
    FUNCTION_PROFILE_SUBSET_BUTTON = new Source("FUNCTION_PROFILE_SUBSET_BUTTON", 7);
    FUNCTION_ONBOARD_GUIDE = new Source("FUNCTION_ONBOARD_GUIDE", 8);
    Source[] arrayOfSource = new Source[9];
    arrayOfSource[0] = GUIDE_PROMPT_BLACK_BUTTON;
    arrayOfSource[1] = DIVERSION_START_CONTENT_ORIENTATION;
    arrayOfSource[2] = DIVERSION_START_CONTENT_LANDSCAPE;
    arrayOfSource[3] = DIVERSION_START_HOT_PUBLISHERS;
    arrayOfSource[4] = DIVERSION_START_RECOMMENDATION;
    arrayOfSource[5] = FUNCTION_LIST_PUBLISHER_ITEM;
    arrayOfSource[6] = FUNCTION_PROFILE_PUBLISHER_BUTTON;
    arrayOfSource[7] = FUNCTION_PROFILE_SUBSET_BUTTON;
    arrayOfSource[8] = FUNCTION_ONBOARD_GUIDE;
    $VALUES = arrayOfSource;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.subscribe.SubscribeConstants.Source
 * JD-Core Version:    0.6.0
 */