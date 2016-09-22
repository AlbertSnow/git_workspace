package org.simalliance.openmobileapi;

public class Channel
{
  private long mHChannel;
  private boolean mIsClosed;
  private boolean mIsLogicalChannel;
  private Session mSession;

  Channel(Session paramSession, long paramLong, boolean paramBoolean)
  {
    this.mSession = paramSession;
    this.mHChannel = paramLong;
    this.mIsLogicalChannel = paramBoolean;
    this.mIsClosed = false;
  }

  public void close()
  {
    if (isClosed())
      return;
    this.mSession.closeChannel(this);
  }

  long getHandle()
  {
    return this.mHChannel;
  }

  public byte[] getSelectResponse()
  {
    byte[] arrayOfByte = this.mSession.getReader().getSEService().getSelectResponse(this);
    if ((arrayOfByte != null) && (arrayOfByte.length == 0))
      arrayOfByte = null;
    return arrayOfByte;
  }

  public Session getSession()
  {
    return this.mSession;
  }

  public boolean isBasicChannel()
  {
    return !this.mIsLogicalChannel;
  }

  public boolean isClosed()
  {
    return this.mIsClosed;
  }

  void setClosed()
  {
    this.mIsClosed = true;
  }

  public byte[] transmit(byte[] paramArrayOfByte)
  {
    if (isClosed())
      throw new IllegalStateException("channel is closed");
    return this.mSession.getReader().getSEService().transmit(this, paramArrayOfByte);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     org.simalliance.openmobileapi.Channel
 * JD-Core Version:    0.6.0
 */