package com.wandoujia.phoenix2.videoplayer;

public enum PlayerLogBuilder$Action
{
  static
  {
    PLAY = new Action("PLAY", 2);
    PAUSE = new Action("PAUSE", 3);
    LOADING = new Action("LOADING", 4);
    LOADED = new Action("LOADED", 5);
    BLOCKING_START = new Action("BLOCKING_START", 6);
    BLOCKING_END = new Action("BLOCKING_END", 7);
    SEEK_START = new Action("SEEK_START", 8);
    SEEK_END = new Action("SEEK_END", 9);
    SEEKING = new Action("SEEKING", 10);
    STOP = new Action("STOP", 11);
    EXIT = new Action("EXIT", 12);
    ERROR = new Action("ERROR", 13);
    Action[] arrayOfAction = new Action[14];
    arrayOfAction[0] = ENTER;
    arrayOfAction[1] = READY;
    arrayOfAction[2] = PLAY;
    arrayOfAction[3] = PAUSE;
    arrayOfAction[4] = LOADING;
    arrayOfAction[5] = LOADED;
    arrayOfAction[6] = BLOCKING_START;
    arrayOfAction[7] = BLOCKING_END;
    arrayOfAction[8] = SEEK_START;
    arrayOfAction[9] = SEEK_END;
    arrayOfAction[10] = SEEKING;
    arrayOfAction[11] = STOP;
    arrayOfAction[12] = EXIT;
    arrayOfAction[13] = ERROR;
    $VALUES = arrayOfAction;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.videoplayer.PlayerLogBuilder.Action
 * JD-Core Version:    0.6.0
 */