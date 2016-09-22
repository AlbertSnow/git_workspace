package com.wandoujia.account.dto;

import java.io.Serializable;
import java.util.Arrays;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class AccountVerificationGroup
  implements Serializable
{
  private String token;
  private AccountVerification[] verifications;

  public AccountVerificationGroup()
  {
  }

  public AccountVerificationGroup(String paramString, AccountVerification[] paramArrayOfAccountVerification)
  {
    this.token = paramString;
    this.verifications = paramArrayOfAccountVerification;
  }

  public AccountVerificationGroup(AccountVerification[] paramArrayOfAccountVerification)
  {
    this.verifications = paramArrayOfAccountVerification;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    AccountVerificationGroup localAccountVerificationGroup;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
        return false;
      localAccountVerificationGroup = (AccountVerificationGroup)paramObject;
      if (this.token != null)
        if (this.token.equals(localAccountVerificationGroup.token))
          continue;
      do
        return false;
      while (localAccountVerificationGroup.token != null);
    }
    while (Arrays.equals(this.verifications, localAccountVerificationGroup.verifications));
    return false;
  }

  public String getToken()
  {
    return this.token;
  }

  public AccountVerification[] getVerifications()
  {
    return this.verifications;
  }

  public int hashCode()
  {
    if (this.verifications != null);
    for (int i = Arrays.hashCode(this.verifications); ; i = 0)
    {
      int j = i * 31;
      String str = this.token;
      int k = 0;
      if (str != null)
        k = this.token.hashCode();
      return j + k;
    }
  }

  public void setToken(String paramString)
  {
    this.token = paramString;
  }

  public void setVerifications(AccountVerification[] paramArrayOfAccountVerification)
  {
    this.verifications = paramArrayOfAccountVerification;
  }

  public int size()
  {
    if (this.verifications != null)
      return this.verifications.length;
    return 0;
  }

  public String toString()
  {
    return "AccountVerificationGroup{verifications=" + Arrays.toString(this.verifications) + ", token='" + this.token + '\'' + '}';
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.dto.AccountVerificationGroup
 * JD-Core Version:    0.6.0
 */