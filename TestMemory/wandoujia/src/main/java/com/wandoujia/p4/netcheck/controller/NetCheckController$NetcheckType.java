package com.wandoujia.p4.netcheck.controller;

public enum NetCheckController$NetcheckType
{
  static
  {
    DNS = new NetcheckType("DNS", 1);
    PING = new NetcheckType("PING", 2);
    TRACE = new NetcheckType("TRACE", 3);
    DOWN = new NetcheckType("DOWN", 4);
    TCP = new NetcheckType("TCP", 5);
    FAILED = new NetcheckType("FAILED", 6);
    EMAIL = new NetcheckType("EMAIL", 7);
    RETRY_POST = new NetcheckType("RETRY_POST", 8);
    NetcheckType[] arrayOfNetcheckType = new NetcheckType[9];
    arrayOfNetcheckType[0] = IP;
    arrayOfNetcheckType[1] = DNS;
    arrayOfNetcheckType[2] = PING;
    arrayOfNetcheckType[3] = TRACE;
    arrayOfNetcheckType[4] = DOWN;
    arrayOfNetcheckType[5] = TCP;
    arrayOfNetcheckType[6] = FAILED;
    arrayOfNetcheckType[7] = EMAIL;
    arrayOfNetcheckType[8] = RETRY_POST;
    $VALUES = arrayOfNetcheckType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.controller.NetCheckController.NetcheckType
 * JD-Core Version:    0.6.0
 */