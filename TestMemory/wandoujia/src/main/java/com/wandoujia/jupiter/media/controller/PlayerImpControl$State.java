package com.wandoujia.jupiter.media.controller;

 enum PlayerImpControl$State
{
  static
  {
    PREPARED = new State("PREPARED", 3);
    PLAYING = new State("PLAYING", 4);
    PAUSED = new State("PAUSED", 5);
    PLAYBACK_COMPLETED = new State("PLAYBACK_COMPLETED", 6);
    State[] arrayOfState = new State[7];
    arrayOfState[0] = ERROR;
    arrayOfState[1] = IDLE;
    arrayOfState[2] = PREPARING;
    arrayOfState[3] = PREPARED;
    arrayOfState[4] = PLAYING;
    arrayOfState[5] = PAUSED;
    arrayOfState[6] = PLAYBACK_COMPLETED;
    $VALUES = arrayOfState;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.media.controller.PlayerImpControl.State
 * JD-Core Version:    0.6.0
 */