package com.alipay.test.ui.core;

public enum EventObject
{
  static
  {
    OnPause = new EventObject("OnPause", 2);
    OnDestroy = new EventObject("OnDestroy", 3);
    OnException = new EventObject("OnException", 4);
    OnDialogShown = new EventObject("OnDialogShown", 5);
    OnAbort = new EventObject("OnAbort", 6);
    OnPopupWindowShown = new EventObject("OnPopupWindowShown", 7);
    OnToastShown = new EventObject("OnToastShown", 8);
    Others = new EventObject("Others", 9);
    EventObject[] arrayOfEventObject = new EventObject[10];
    arrayOfEventObject[0] = OnCreate;
    arrayOfEventObject[1] = OnResume;
    arrayOfEventObject[2] = OnPause;
    arrayOfEventObject[3] = OnDestroy;
    arrayOfEventObject[4] = OnException;
    arrayOfEventObject[5] = OnDialogShown;
    arrayOfEventObject[6] = OnAbort;
    arrayOfEventObject[7] = OnPopupWindowShown;
    arrayOfEventObject[8] = OnToastShown;
    arrayOfEventObject[9] = Others;
    ENUM$VALUES = arrayOfEventObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.test.ui.core.EventObject
 * JD-Core Version:    0.6.0
 */