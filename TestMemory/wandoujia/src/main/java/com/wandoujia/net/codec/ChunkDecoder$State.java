package com.wandoujia.net.codec;

 enum ChunkDecoder$State
{
  static
  {
    CHUNK = new State("CHUNK", 2);
    CHUNK_CR = new State("CHUNK_CR", 3);
    CHUNK_CRLF = new State("CHUNK_CRLF", 4);
    COMPLETE = new State("COMPLETE", 5);
    State[] arrayOfState = new State[6];
    arrayOfState[0] = CHUNK_LEN;
    arrayOfState[1] = CHUNK_LEN_CR;
    arrayOfState[2] = CHUNK;
    arrayOfState[3] = CHUNK_CR;
    arrayOfState[4] = CHUNK_CRLF;
    arrayOfState[5] = COMPLETE;
    $VALUES = arrayOfState;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.codec.ChunkDecoder.State
 * JD-Core Version:    0.6.0
 */