package com.tencent.mm.sdk.openapi;

import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.b;
import java.io.File;

public class WXAppExtendObject
  implements l
{
  public String extInfo;
  public byte[] fileData;
  public String filePath;

  public WXAppExtendObject()
  {
  }

  public WXAppExtendObject(String paramString1, String paramString2)
  {
    this.extInfo = paramString1;
    this.filePath = paramString2;
  }

  public WXAppExtendObject(String paramString, byte[] paramArrayOfByte)
  {
    this.extInfo = paramString;
    this.fileData = paramArrayOfByte;
  }

  public boolean checkArgs()
  {
    if (((this.extInfo == null) || (this.extInfo.length() == 0)) && ((this.filePath == null) || (this.filePath.length() == 0)) && ((this.fileData == null) || (this.fileData.length == 0)))
    {
      b.a("MicroMsg.SDK.WXAppExtendObject");
      return false;
    }
    if ((this.extInfo != null) && (this.extInfo.length() > 2048))
    {
      b.a("MicroMsg.SDK.WXAppExtendObject");
      return false;
    }
    if ((this.filePath != null) && (this.filePath.length() > 10240))
    {
      b.a("MicroMsg.SDK.WXAppExtendObject");
      return false;
    }
    if (this.filePath != null)
    {
      String str = this.filePath;
      int i;
      if ((str == null) || (str.length() == 0))
        i = 0;
      while (i > 10485760)
      {
        b.a("MicroMsg.SDK.WXAppExtendObject");
        return false;
        File localFile = new File(str);
        if (!localFile.exists())
        {
          i = 0;
          continue;
        }
        i = (int)localFile.length();
      }
    }
    if ((this.fileData != null) && (this.fileData.length > 10485760))
    {
      b.a("MicroMsg.SDK.WXAppExtendObject");
      return false;
    }
    return true;
  }

  public void serialize(Bundle paramBundle)
  {
    paramBundle.putString("_wxappextendobject_extInfo", this.extInfo);
    paramBundle.putByteArray("_wxappextendobject_fileData", this.fileData);
    paramBundle.putString("_wxappextendobject_filePath", this.filePath);
  }

  public int type()
  {
    return 7;
  }

  public void unserialize(Bundle paramBundle)
  {
    this.extInfo = paramBundle.getString("_wxappextendobject_extInfo");
    this.fileData = paramBundle.getByteArray("_wxappextendobject_fileData");
    this.filePath = paramBundle.getString("_wxappextendobject_filePath");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.mm.sdk.openapi.WXAppExtendObject
 * JD-Core Version:    0.6.0
 */