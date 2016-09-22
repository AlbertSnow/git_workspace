package com.wandoujia.jupiter.util;

 enum AutoInstallGuideUtil$DialogAction
{
  static
  {
    CLICK_POSITIVE = new DialogAction("CLICK_POSITIVE", 1);
    CLICK_NEGATIVE = new DialogAction("CLICK_NEGATIVE", 2);
    CANCEL = new DialogAction("CANCEL", 3);
    DialogAction[] arrayOfDialogAction = new DialogAction[4];
    arrayOfDialogAction[0] = SHOW;
    arrayOfDialogAction[1] = CLICK_POSITIVE;
    arrayOfDialogAction[2] = CLICK_NEGATIVE;
    arrayOfDialogAction[3] = CANCEL;
    $VALUES = arrayOfDialogAction;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.util.AutoInstallGuideUtil.DialogAction
 * JD-Core Version:    0.6.0
 */