package com.wandoujia.account.dto;

import java.io.Serializable;

public class AccountResponse
  implements Serializable
{
  private String args;
  private int error;
  private AccountBean member;
  private String msg;
  private AccountVerificationGroup[] verificationGroups;

  public AccountResponse()
  {
    setAccountError(AccountError.SUCCESS);
  }

  public AccountResponse(int paramInt, String paramString)
  {
    this.error = paramInt;
    this.msg = paramString;
  }

  public AccountResponse(AccountBean paramAccountBean)
  {
    this();
    setMember(paramAccountBean);
  }

  public AccountResponse(AccountError paramAccountError)
  {
    setAccountError(paramAccountError);
  }

  public AccountResponse(AccountError paramAccountError, AccountBean paramAccountBean)
  {
    this(paramAccountError);
    this.member = paramAccountBean;
  }

  public AccountResponse(AccountError paramAccountError, String paramString)
  {
    this(paramAccountError);
    this.args = paramString;
  }

  public AccountResponse(AccountVerificationGroup[] paramArrayOfAccountVerificationGroup)
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

  public AccountBean getMember()
  {
    return this.member;
  }

  public String getMsg()
  {
    return this.msg;
  }

  public AccountVerificationGroup[] getVerificationGroups()
  {
    return this.verificationGroups;
  }

  public void setAccountError(AccountError paramAccountError)
  {
    this.error = paramAccountError.getError();
    this.msg = paramAccountError.getMessage();
  }

  public void setArgs(String paramString)
  {
    this.args = paramString;
  }

  public void setError(int paramInt)
  {
    this.error = paramInt;
  }

  public void setMember(AccountBean paramAccountBean)
  {
    this.member = paramAccountBean;
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
    return "AccountResponse [error=" + this.error + ", msg=" + this.msg + ", obj=" + this.member + "]";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.dto.AccountResponse
 * JD-Core Version:    0.6.0
 */