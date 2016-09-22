package org.simalliance.openmobileapi;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Session
{
  private byte[] mAtr;
  private final Set<Channel> mChannels = new HashSet();
  private boolean mIsClosed;
  private String mName;
  private Reader mReader;

  Session(String paramString, Reader paramReader)
  {
    this.mAtr = paramReader.getSEService().getAtr(paramReader);
    this.mReader = paramReader;
    this.mName = paramString;
    this.mIsClosed = false;
  }

  public void close()
  {
    this.mReader.closeSession(this);
  }

  void closeChannel(Channel paramChannel)
  {
    if (paramChannel == null)
      throw new NullPointerException("channel is null");
    synchronized (this.mChannels)
    {
      boolean bool = paramChannel.isClosed();
      if (bool);
    }
    try
    {
      this.mReader.getSEService().closeChannel(paramChannel);
      label43: paramChannel.setClosed();
      this.mChannels.remove(paramChannel);
      monitorexit;
      return;
      localObject = finally;
      monitorexit;
      throw localObject;
    }
    catch (Exception localException)
    {
      break label43;
    }
  }

  public void closeChannels()
  {
    while (true)
    {
      Channel localChannel;
      synchronized (this.mChannels)
      {
        Iterator localIterator = this.mChannels.iterator();
        if (localIterator.hasNext())
        {
          localChannel = (Channel)localIterator.next();
          if (localChannel == null)
            continue;
          boolean bool = localChannel.isClosed();
          if (bool)
            continue;
        }
      }
      try
      {
        this.mReader.getSEService().closeChannel(localChannel);
        label66: localChannel.setClosed();
        continue;
        localObject = finally;
        monitorexit;
        throw localObject;
        this.mChannels.clear();
        monitorexit;
        return;
      }
      catch (Exception localException)
      {
        break label66;
      }
    }
  }

  public byte[] getATR()
  {
    return this.mAtr;
  }

  public Reader getReader()
  {
    return this.mReader;
  }

  public boolean isClosed()
  {
    return this.mIsClosed;
  }

  public Channel openBasicChannel(byte[] paramArrayOfByte)
  {
    synchronized (this.mChannels)
    {
      Channel localChannel = this.mReader.getSEService().openBasicChannel(this, paramArrayOfByte);
      this.mChannels.add(localChannel);
      return localChannel;
    }
  }

  public Channel openLogicalChannel(byte[] paramArrayOfByte)
  {
    synchronized (this.mChannels)
    {
      Channel localChannel = this.mReader.getSEService().openLogicalChannel(this, paramArrayOfByte);
      this.mChannels.add(localChannel);
      return localChannel;
    }
  }

  void setClosed()
  {
    this.mIsClosed = true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     org.simalliance.openmobileapi.Session
 * JD-Core Version:    0.6.0
 */