package org.simalliance.openmobileapi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Reader
{
  private String mName;
  private SEService mService;
  private final ArrayList<Session> mSessions = new ArrayList();

  Reader(String paramString, SEService paramSEService)
  {
    this.mName = paramString;
    this.mService = paramSEService;
  }

  void closeSession(Session paramSession)
  {
    if (paramSession == null)
      throw new NullPointerException("session is null");
    synchronized (this.mSessions)
    {
      if (!paramSession.isClosed())
      {
        paramSession.closeChannels();
        paramSession.setClosed();
      }
      this.mSessions.remove(paramSession);
      return;
    }
  }

  public void closeSessions()
  {
    synchronized (this.mSessions)
    {
      Iterator localIterator = this.mSessions.iterator();
      while (localIterator.hasNext())
      {
        Session localSession = (Session)localIterator.next();
        if ((localSession == null) || (localSession.isClosed()))
          continue;
        localSession.closeChannels();
        localSession.setClosed();
      }
    }
    this.mSessions.clear();
    monitorexit;
  }

  public String getName()
  {
    return this.mName;
  }

  public SEService getSEService()
  {
    return this.mService;
  }

  public boolean isSecureElementPresent()
  {
    return this.mService.isSecureElementPresent(this);
  }

  public Session openSession()
  {
    if (!this.mService.isSecureElementPresent(this))
      throw new IOException("Secure Element is not presented.");
    synchronized (this.mSessions)
    {
      Session localSession = new Session(getName(), this);
      this.mSessions.add(localSession);
      return localSession;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     org.simalliance.openmobileapi.Reader
 * JD-Core Version:    0.6.0
 */