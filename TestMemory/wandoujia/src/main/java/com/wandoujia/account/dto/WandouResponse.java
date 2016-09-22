package com.wandoujia.account.dto;

import java.io.Serializable;

public class WandouResponse
  implements Serializable
{
  private String args;
  private int error;
  private String msg;
  private AccountVerificationGroup[] verificationGroups;

  public WandouResponse()
  {
    this.error = 0;
    this.msg = "";
  }

  public WandouResponse(int paramInt, String paramString)
  {
    this.error = paramInt;
    this.msg = paramString;
  }

  public WandouResponse(int paramInt, String paramString, AccountVerificationGroup[] paramArrayOfAccountVerificationGroup)
  {
    this.error = paramInt;
    this.msg = paramString;
    this.verificationGroups = paramArrayOfAccountVerificationGroup;
  }

  public WandouResponse(int paramInt, String paramString1, AccountVerificationGroup[] paramArrayOfAccountVerificationGroup, String paramString2)
  {
    this.error = paramInt;
    this.msg = paramString1;
    this.verificationGroups = paramArrayOfAccountVerificationGroup;
    this.args = paramString2;
  }

  public WandouResponse(AccountError paramAccountError)
  {
    this.error = paramAccountError.getError();
    this.msg = paramAccountError.getMessage();
  }

  public WandouResponse(AccountVerificationGroup[] paramArrayOfAccountVerificationGroup)
  {
    this(AccountError.NEED_VERIFY_ACCOUNT);
    this.verificationGroups = paramArrayOfAccountVerificationGroup;
  }

  public String getArgs()
  {
    return this.args;
  }

  public int getError()
  {
    return this.error;
  }

  public String getMsg()
  {
    return this.msg;
  }

  public AccountVerificationGroup[] getVerificationGroups()
  {
    return this.verificationGroups;
  }

  public void setArgs(String paramString)
  {
    this.args = paramString;
  }

  public void setError(int paramInt)
  {
    this.error = paramInt;
  }

  public void setMsg(String paramString)
  {
    this.msg = paramString;
  }

  public void setVerificationGroups(AccountVerificationGroup[] paramArrayOfAccountVerificationGroup)
  {
    this.verificationGroups = paramArrayOfAccountVerificationGroup;
  }

  public String toString()
  {
    return "WandouResponse [error=" + this.error + ", msg=" + this.msg + "]";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.dto.WandouResponse
 * JD-Core Version:    0.6.0
 */