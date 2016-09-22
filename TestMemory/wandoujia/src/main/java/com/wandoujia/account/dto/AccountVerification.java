package com.wandoujia.account.dto;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class AccountVerification
  implements Serializable
{
  private String arg;
  private AccountVerification.AccountVerificationMethod method;

  public AccountVerification()
  {
  }

  public AccountVerification(AccountVerification.AccountVerificationMethod paramAccountVerificationMethod, String paramString)
  {
    this.method = paramAccountVerificationMethod;
    this.arg = paramString;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    AccountVerification localAccountVerification;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
        return false;
      localAccountVerification = (AccountVerification)paramObject;
      if (this.arg != null)
        if (this.arg.equals(localAccountVerification.arg))
          continue;
      do
        return false;
      while (localAccountVerification.arg != null);
    }
    while (this.method == localAccountVerification.method);
    return false;
  }

  public String getArg()
  {
    return this.arg;
  }

  public AccountVerification.AccountVerificationMethod getMethod()
  {
    return this.method;
  }

  public int hashCode()
  {
    if (this.method != null);
    for (int i = this.method.hashCode(); ; i = 0)
    {
      int j = i * 31;
      String str = this.arg;
      int k = 0;
      if (str != null)
        k = this.arg.hashCode();
      return j + k;
    }
  }

  public void setArg(String paramString)
  {
    this.arg = paramString;
  }

  public void setMethod(AccountVerification.AccountVerificationMethod paramAccountVerificationMethod)
  {
    this.method = paramAccountVerificationMethod;
  }

  public String toString()
  {
    return "AccountVerification{method=" + this.method + ", arg='" + this.arg + '\'' + '}';
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.dto.AccountVerification
 * JD-Core Version:    0.6.0
 */