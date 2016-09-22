package org.simalliance.openmobileapi;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import org.simalliance.openmobileapi.service.CardException;
import org.simalliance.openmobileapi.service.ISmartcardService;
import org.simalliance.openmobileapi.service.ISmartcardServiceCallback;
import org.simalliance.openmobileapi.service.SmartcardError;

public class SEService
{
  private static final String SERVICE_TAG = "SEService";
  private final ISmartcardServiceCallback mCallback = new SEService.1(this);
  private SEService.CallBack mCallerCallback;
  private ServiceConnection mConnection;
  private final Context mContext;
  private Reader[] mReaders;
  private volatile ISmartcardService mSmartcardService;

  public SEService(Context paramContext, SEService.CallBack paramCallBack)
  {
    if (paramContext == null)
      throw new NullPointerException("context must not be null");
    this.mContext = paramContext;
    this.mCallerCallback = paramCallBack;
    this.mConnection = new SEService.2(this);
    this.mContext.bindService(new Intent(ISmartcardService.class.getName()), this.mConnection, 1);
  }

  private boolean basicChannelInUse(SmartcardError paramSmartcardError)
  {
    Exception localException = paramSmartcardError.createException();
    if (localException != null)
    {
      String str = localException.getMessage();
      if ((str != null) && (str.contains("basic channel in use")))
        return true;
    }
    return false;
  }

  private boolean channelCannotBeEstablished(SmartcardError paramSmartcardError)
  {
    Exception localException = paramSmartcardError.createException();
    if (localException != null)
    {
      if ((localException instanceof MissingResourceException));
      String str;
      do
      {
        return true;
        str = localException.getMessage();
      }
      while ((str != null) && ((str.contains("channel in use")) || (str.contains("open channel failed")) || (str.contains("out of channels")) || (str.contains("MANAGE CHANNEL"))));
    }
    return false;
  }

  private void checkForException(SmartcardError paramSmartcardError)
  {
    try
    {
      paramSmartcardError.throwException();
      return;
    }
    catch (CardException localCardException)
    {
      throw new IllegalStateException(localCardException.getMessage());
    }
    catch (AccessControlException localAccessControlException)
    {
    }
    throw new SecurityException(localAccessControlException.getMessage());
  }

  private void checkIfAppletAvailable(SmartcardError paramSmartcardError)
  {
    Exception localException = paramSmartcardError.createException();
    if ((localException != null) && ((localException instanceof NoSuchElementException)))
      throw new NoSuchElementException("Applet with the defined aid does not exist in the SE");
  }

  private boolean isDefaultApplicationSelected(SmartcardError paramSmartcardError)
  {
    Exception localException = paramSmartcardError.createException();
    if (localException != null)
    {
      String str = localException.getMessage();
      if ((str != null) && (str.contains("default application is not selected")))
        return false;
    }
    return true;
  }

  void closeChannel(Channel paramChannel)
  {
    if (this.mSmartcardService == null)
      throw new IllegalStateException("service not connected to system");
    if (paramChannel == null)
      throw new NullPointerException("channel must not be null");
    if (paramChannel.isClosed())
      return;
    SmartcardError localSmartcardError = new SmartcardError();
    try
    {
      this.mSmartcardService.closeChannel(paramChannel.getHandle(), localSmartcardError);
      checkForException(localSmartcardError);
      return;
    }
    catch (Exception localException)
    {
    }
    throw new IOException(localException.getMessage());
  }

  byte[] getAtr(Reader paramReader)
  {
    if (paramReader == null)
      throw new NullPointerException("reader must not be null");
    if (this.mSmartcardService == null)
      throw new IllegalStateException("service not connected to system");
    SmartcardError localSmartcardError = new SmartcardError();
    try
    {
      byte[] arrayOfByte = this.mSmartcardService.getAtr(paramReader.getName(), localSmartcardError);
      checkForException(localSmartcardError);
      return arrayOfByte;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public Reader[] getReaders()
  {
    int i = 0;
    if (this.mSmartcardService == null)
      throw new IllegalStateException("service not connected to system");
    SmartcardError localSmartcardError = new SmartcardError();
    try
    {
      String[] arrayOfString = this.mSmartcardService.getReaders(localSmartcardError);
      checkForException(localSmartcardError);
      this.mReaders = new Reader[arrayOfString.length];
      int j = arrayOfString.length;
      int k = 0;
      while (i < j)
      {
        String str = arrayOfString[i];
        this.mReaders[k] = new Reader(str, this);
        k++;
        i++;
      }
    }
    catch (Exception localException)
    {
      throw new IllegalStateException(localException);
    }
    return this.mReaders;
  }

  byte[] getSelectResponse(Channel paramChannel)
  {
    if (this.mSmartcardService == null)
      throw new IllegalStateException("service not connected to system");
    if (paramChannel == null)
      throw new NullPointerException("channel must not be null");
    if (paramChannel.isClosed())
      throw new IllegalStateException("channel is closed");
    SmartcardError localSmartcardError = new SmartcardError();
    try
    {
      byte[] arrayOfByte = this.mSmartcardService.getSelectResponse(paramChannel.getHandle(), localSmartcardError);
      checkForException(localSmartcardError);
      checkForException(localSmartcardError);
      return arrayOfByte;
    }
    catch (Exception localException)
    {
    }
    throw null;
  }

  public boolean isConnected()
  {
    return this.mSmartcardService != null;
  }

  boolean isSecureElementPresent(Reader paramReader)
  {
    if (paramReader == null)
      throw new NullPointerException("reader must not be null");
    if (this.mSmartcardService == null)
      throw new IllegalStateException("service not connected to system");
    SmartcardError localSmartcardError = new SmartcardError();
    try
    {
      boolean bool = this.mSmartcardService.isCardPresent(paramReader.getName(), localSmartcardError);
      checkForException(localSmartcardError);
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  Channel openBasicChannel(Session paramSession, byte[] paramArrayOfByte)
  {
    if (paramSession == null)
      throw new NullPointerException("session must not be null");
    if (paramSession.getReader() == null)
      throw new NullPointerException("reader must not be null");
    if (this.mSmartcardService == null)
      throw new IllegalStateException("service not connected to system");
    if (paramSession.isClosed())
      throw new IllegalStateException("session is closed");
    SmartcardError localSmartcardError = new SmartcardError();
    long l;
    do
    {
      do
        try
        {
          l = this.mSmartcardService.openBasicChannelAid(paramSession.getReader().getName(), paramArrayOfByte, this.mCallback, localSmartcardError);
          if (basicChannelInUse(localSmartcardError))
            return null;
        }
        catch (Exception localException)
        {
          throw new IOException(localException.getMessage());
        }
      while ((channelCannotBeEstablished(localSmartcardError)) || (((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) && (!isDefaultApplicationSelected(localSmartcardError))));
      checkIfAppletAvailable(localSmartcardError);
      checkForException(localSmartcardError);
    }
    while (l == 0L);
    return new Channel(paramSession, l, false);
  }

  Channel openLogicalChannel(Session paramSession, byte[] paramArrayOfByte)
  {
    if (paramSession == null)
      throw new NullPointerException("session must not be null");
    if (paramSession.getReader() == null)
      throw new NullPointerException("reader must not be null");
    if (this.mSmartcardService == null)
      throw new IllegalStateException("service not connected to system");
    if (paramSession.isClosed())
      throw new IllegalStateException("session is closed");
    SmartcardError localSmartcardError = new SmartcardError();
    long l;
    do
    {
      try
      {
        l = this.mSmartcardService.openLogicalChannel(paramSession.getReader().getName(), paramArrayOfByte, this.mCallback, localSmartcardError);
        if (channelCannotBeEstablished(localSmartcardError))
          return null;
      }
      catch (Exception localException)
      {
        throw new IOException(localException.getMessage());
      }
      checkIfAppletAvailable(localSmartcardError);
      checkForException(localSmartcardError);
    }
    while (l == 0L);
    return new Channel(paramSession, l, true);
  }

  public void shutdown()
  {
    while (true)
    {
      int j;
      Reader localReader;
      synchronized (this.mConnection)
      {
        if ((this.mSmartcardService != null) && (this.mReaders != null))
          synchronized (this.mReaders)
          {
            Reader[] arrayOfReader2 = this.mReaders;
            int i = arrayOfReader2.length;
            j = 0;
            if (j < i)
              localReader = arrayOfReader2[j];
          }
      }
      try
      {
        localReader.closeSessions();
        j++;
        continue;
        monitorexit;
      }
      catch (Exception localException)
      {
        try
        {
          this.mContext.unbindService(this.mConnection);
          label83: monitorexit;
          this.mSmartcardService = null;
          return;
          localObject2 = finally;
          monitorexit;
          throw localObject2;
          localObject1 = finally;
          monitorexit;
          throw localObject1;
          localException = localException;
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          break label83;
        }
      }
    }
  }

  byte[] transmit(Channel paramChannel, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      throw new NullPointerException("command must not be null");
    if (paramArrayOfByte.length < 4)
      throw new IllegalArgumentException("command must have at least 4 bytes");
    if (this.mSmartcardService == null)
      throw new IllegalStateException("service not connected to system");
    if (paramChannel == null)
      throw new NullPointerException("channel must not be null");
    if (paramChannel.isClosed())
      throw new IllegalStateException("channel is closed");
    SmartcardError localSmartcardError = new SmartcardError();
    try
    {
      byte[] arrayOfByte = this.mSmartcardService.transmit(paramChannel.getHandle(), paramArrayOfByte, localSmartcardError);
      checkForException(localSmartcardError);
      return arrayOfByte;
    }
    catch (Exception localException)
    {
    }
    throw new IOException(localException.getMessage());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     org.simalliance.openmobileapi.SEService
 * JD-Core Version:    0.6.0
 */