package com.wandoujia.update.toolkit;

import com.wandoujia.gson.a.a;
import com.wandoujia.update.protocol.UpdateInfo;
import java.io.Serializable;

public class SelfUpdateResult
  implements Serializable
{

  @a(a="installerPath")
  public String installerPath;

  @a(a="updateInfo")
  public UpdateInfo updateInfo;

  public SelfUpdateResult(UpdateInfo paramUpdateInfo, String paramString)
  {
    this.updateInfo = paramUpdateInfo;
    this.installerPath = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.toolkit.SelfUpdateResult
 * JD-Core Version:    0.6.0
 */