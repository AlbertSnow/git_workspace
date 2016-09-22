package com.wandoujia.account.dto;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.codehaus.jackson.map.annotate.JsonFilter;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown=true)
@org.codehaus.jackson.annotate.JsonIgnoreProperties(ignoreUnknown=true)
@JsonFilter("account_bean_filter")
public class AccountBean
  implements Serializable
{
  public static final List<String> defaultFields = Arrays.asList(new String[] { "uid", "username", "email", "avatar" });
  private static final long serialVersionUID = 7411336705877575069L;
  private String avatar;
  private boolean complete;
  private Set<DeviceBean> devices = new TreeSet();
  private String email;
  private boolean emailValidated;
  private boolean enabled;
  private boolean needUpdatePassword;
  private String nick;
  private String registerChannel;
  private RegisterSource registerSource;
  private Set<Role> roles = new HashSet();
  private Set<SocialBean> socials = new HashSet();
  private String telephone;
  private boolean telephoneValidated;
  private boolean trusted;
  private Long uid;
  private String username;

  public void addDevice(DeviceBean paramDeviceBean)
  {
    if (this.devices == null)
      this.devices = new HashSet();
    removeDevice(paramDeviceBean.getUdid());
    this.devices.add(paramDeviceBean);
  }

  public void addSocial(SocialBean paramSocialBean)
  {
    if (this.socials == null)
      this.socials = new HashSet();
    removeSocial(paramSocialBean.getPlatform());
    this.socials.add(paramSocialBean);
  }

  public String getAvatar()
  {
    return this.avatar;
  }

  public Set<DeviceBean> getDevices()
  {
    return this.devices;
  }

  public String getEmail()
  {
    return this.email;
  }

  public String getNick()
  {
    return this.nick;
  }

  public String getRegisterChannel()
  {
    return this.registerChannel;
  }

  public RegisterSource getRegisterSource()
  {
    return this.registerSource;
  }

  public Set<Role> getRoles()
  {
    return this.roles;
  }

  public Set<SocialBean> getSocials()
  {
    return this.socials;
  }

  public String getTelephone()
  {
    return this.telephone;
  }

  public Long getUid()
  {
    return this.uid;
  }

  public String getUsername()
  {
    return this.username;
  }

  public boolean isComplete()
  {
    return this.complete;
  }

  public boolean isEmailValidated()
  {
    return this.emailValidated;
  }

  public boolean isEnabled()
  {
    return this.enabled;
  }

  public boolean isNeedUpdatePassword()
  {
    return this.needUpdatePassword;
  }

  public boolean isTelephoneValidated()
  {
    return this.telephoneValidated;
  }

  public boolean isTrusted()
  {
    return this.trusted;
  }

  public void removeDevice(String paramString)
  {
    Iterator localIterator = this.devices.iterator();
    while (localIterator.hasNext())
    {
      if (!((DeviceBean)localIterator.next()).getUdid().equals(paramString))
        continue;
      localIterator.remove();
    }
  }

  public void removeSocial(Platform paramPlatform)
  {
    Iterator localIterator = this.socials.iterator();
    while (localIterator.hasNext())
    {
      if (((SocialBean)localIterator.next()).getPlatform() != paramPlatform)
        continue;
      localIterator.remove();
    }
  }

  public void setAvatar(String paramString)
  {
    this.avatar = paramString;
  }

  public void setComplete(boolean paramBoolean)
  {
    this.complete = paramBoolean;
  }

  public void setDevices(Set<DeviceBean> paramSet)
  {
    this.devices = paramSet;
  }

  public void setEmail(String paramString)
  {
    if ((this.emailValidated) && (this.email != null) && (!this.email.equals(paramString)))
      this.emailValidated = false;
    this.email = paramString;
  }

  public void setEmailValidated(boolean paramBoolean)
  {
    this.emailValidated = paramBoolean;
  }

  public void setEnabled(boolean paramBoolean)
  {
    this.enabled = paramBoolean;
  }

  public void setNeedUpdatePassword(boolean paramBoolean)
  {
    this.needUpdatePassword = paramBoolean;
  }

  public void setNick(String paramString)
  {
    this.nick = paramString;
  }

  public void setRegisterChannel(String paramString)
  {
    this.registerChannel = paramString;
  }

  public void setRegisterSource(RegisterSource paramRegisterSource)
  {
    this.registerSource = paramRegisterSource;
  }

  public void setRoles(Set<Role> paramSet)
  {
    this.roles = paramSet;
  }

  public void setSocials(Set<SocialBean> paramSet)
  {
    this.socials = paramSet;
  }

  public void setTelephone(String paramString)
  {
    if ((this.telephoneValidated) && (this.telephone != null) && (!this.telephone.equals(paramString)))
      this.telephoneValidated = false;
    this.telephone = paramString;
  }

  public void setTelephoneValidated(boolean paramBoolean)
  {
    this.telephoneValidated = paramBoolean;
  }

  public void setTrusted(boolean paramBoolean)
  {
    this.trusted = paramBoolean;
  }

  public void setUid(Long paramLong)
  {
    this.uid = paramLong;
  }

  public void setUsername(String paramString)
  {
    this.username = paramString;
  }

  public String toString()
  {
    return "AccountBean [uid=" + this.uid + ", nick=" + this.nick + ", avatar=" + this.avatar + ", username=" + this.username + ", email=" + this.email + ", telephone=" + this.telephone + ", emailValidated=" + this.emailValidated + ", telephoneValidated=" + this.telephoneValidated + ", socials=" + this.socials + ", devices=" + this.devices + ", roles=" + this.roles + ", registerSource=" + this.registerSource + ", needUpdatePassword=" + this.needUpdatePassword + ", trusted=" + this.trusted + ", complete=" + this.complete + "]";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.dto.AccountBean
 * JD-Core Version:    0.6.0
 */