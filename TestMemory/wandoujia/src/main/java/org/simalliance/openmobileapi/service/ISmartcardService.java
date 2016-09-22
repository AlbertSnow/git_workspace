package org.simalliance.openmobileapi.service;

import android.os.IInterface;

public abstract interface ISmartcardService extends IInterface
{
  public abstract void closeChannel(long paramLong, SmartcardError paramSmartcardError);

  public abstract byte[] getAtr(String paramString, SmartcardError paramSmartcardError);

  public abstract String[] getReaders(SmartcardError paramSmartcardError);

  public abstract byte[] getSelectResponse(long paramLong, SmartcardError paramSmartcardError);

  public abstract boolean isCardPresent(String paramString, SmartcardError paramSmartcardError);

  public abstract long openBasicChannel(String paramString, ISmartcardServiceCallback paramISmartcardServiceCallback, SmartcardError paramSmartcardError);

  public abstract long openBasicChannelAid(String paramString, byte[] paramArrayOfByte, ISmartcardServiceCallback paramISmartcardServiceCallback, SmartcardError paramSmartcardError);

  public abstract long openLogicalChannel(String paramString, byte[] paramArrayOfByte, ISmartcardServiceCallback paramISmartcardServiceCallback, SmartcardError paramSmartcardError);

  public abstract byte[] transmit(long paramLong, byte[] paramArrayOfByte, SmartcardError paramSmartcardError);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     org.simalliance.openmobileapi.service.ISmartcardService
 * JD-Core Version:    0.6.0
 */