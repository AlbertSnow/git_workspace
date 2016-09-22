package com.wandoujia.push.protocol;

import java.io.Serializable;

public class StandardPushEntity
  implements Serializable
{
  public static final String CHANNEL_UNKNOWN = "unknown";
  public static final int DEVICE_ANDROID = 2;
  public static final int DEVICE_PC = 1;
  public static final int DEVICE_WEB = 4;
  public static final int MSG_TYPE_COMMUNITY = 513;
  public static final int MSG_TYPE_MARIO = 256;
  public static final int MSG_TYPE_NORMAL = 0;
  public static final int MSG_TYPE_NORMAL_V2 = 1;
  public static final int MSG_TYPE_NORMAL_V3 = 2;
  public static final int MSG_TYPE_SUBSCRIBE = 769;
  protected StandardPushEntity.Callback callback;
  protected String destDid;
  protected int destType;
  protected String destUid;
  protected int msgType;
  protected String srcChannel;
  protected String srcDid;
  protected int srcType;
  protected String srcUid;
  protected boolean test;

  public StandardPushEntity.Callback getCallback()
  {
    return this.callback;
  }

  public String getDestDid()
  {
    return this.destDid;
  }

  public int getDestType()
  {
    return this.destType;
  }

  public String getDestUid()
  {
    return this.destUid;
  }

  public int getMsgType()
  {
    return this.msgType;
  }

  public String getSrcChannel()
  {
    return this.srcChannel;
  }

  public String getSrcDid()
  {
    return this.srcDid;
  }

  public int getSrcType()
  {
    return this.srcType;
  }

  public String getSrcUid()
  {
    return this.srcUid;
  }

  public boolean isTest()
  {
    return this.test;
  }

  public void setCallback(StandardPushEntity.Callback paramCallback)
  {
    this.callback = paramCallback;
  }

  public void setDestDid(String paramString)
  {
    this.destDid = paramString;
  }

  public void setDestType(int paramInt)
  {
    this.destType = paramInt;
  }

  public void setDestUid(String paramString)
  {
    this.destUid = paramString;
  }

  public void setMsgType(int paramInt)
  {
    this.msgType = paramInt;
  }

  public void setSrcChannel(String paramString)
  {
    this.srcChannel = paramString;
  }

  public void setSrcDid(String paramString)
  {
    this.srcDid = paramString;
  }

  public void setSrcType(int paramInt)
  {
    this.srcType = paramInt;
  }

  public void setSrcUid(String paramString)
  {
    this.srcUid = paramString;
  }

  public void setTest(boolean paramBoolean)
  {
    this.test = paramBoolean;
  }

  public String toString()
  {
    return "StandardPushEntity{srcType=" + this.srcType + ", srcDid='" + this.srcDid + '\'' + ", srcUid='" + this.srcUid + '\'' + ", srcChannel='" + this.srcChannel + '\'' + ", destType=" + this.destType + ", destDid='" + this.destDid + '\'' + ", destUid='" + this.destUid + '\'' + ", msgType=" + this.msgType + ", callback=" + this.callback + '}';
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.push.protocol.StandardPushEntity
 * JD-Core Version:    0.6.0
 */