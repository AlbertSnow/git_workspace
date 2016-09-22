package com.wandoujia.push2.protocol;

import com.wandoujia.gson.a.a;
import java.io.Serializable;

public class Message
  implements Serializable
{
  public static final int BODY_PROTOCOL_NORMAL = 1;
  public static final String CHANNEL_NORMAL = "normal";
  public static final String CHANNEL_PAID = "paid";

  @a(a="apps")
  private String[] apps;

  @a(a="body")
  private String body;

  @a(a="body_protocol")
  private int bodyProtocol;

  @a(a="channel")
  private String[] channel;

  @a(a="expired")
  private long expired;
  private transient long id;

  public Message(long paramLong1, long paramLong2, int paramInt, String paramString)
  {
    this(paramLong1, paramLong2, paramInt, paramString, null);
  }

  public Message(long paramLong1, long paramLong2, int paramInt, String paramString, String[] paramArrayOfString)
  {
    this.id = paramLong1;
    this.expired = paramLong2;
    this.bodyProtocol = paramInt;
    this.body = paramString;
    this.channel = paramArrayOfString;
  }

  public String[] getApps()
  {
    return this.apps;
  }

  public String getBody()
  {
    return this.body;
  }

  public int getBodyProtocol()
  {
    return this.bodyProtocol;
  }

  public String[] getChannel()
  {
    return this.channel;
  }

  public long getExpired()
  {
    return this.expired;
  }

  public long getId()
  {
    return this.id;
  }

  public void setId(long paramLong)
  {
    this.id = paramLong;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.protocol.Message
 * JD-Core Version:    0.6.0
 */