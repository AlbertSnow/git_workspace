package com.tencent.mm.sdk.openapi;

import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.b;

public class WXVideoObject
  implements l
{
  public String videoLowBandUrl;
  public String videoUrl;

  public boolean checkArgs()
  {
    if (((this.videoUrl == null) || (this.videoUrl.length() == 0)) && ((this.videoLowBandUrl == null) || (this.videoLowBandUrl.length() == 0)))
    {
      b.a("MicroMsg.SDK.WXVideoObject");
      return false;
    }
    if ((this.videoUrl != null) && (this.videoUrl.length() > 10240))
    {
      b.a("MicroMsg.SDK.WXVideoObject");
      return false;
    }
    if ((this.videoLowBandUrl != null) && (this.videoLowBandUrl.length() > 10240))
    {
      b.a("MicroMsg.SDK.WXVideoObject");
      return false;
    }
    return true;
  }

  public void serialize(Bundle paramBundle)
  {
    paramBundle.putString("_wxvideoobject_videoUrl", this.videoUrl);
    paramBundle.putString("_wxvideoobject_videoLowBandUrl", this.videoLowBandUrl);
  }

  public int type()
  {
    return 4;
  }

  public void unserialize(Bundle paramBundle)
  {
    this.videoUrl = paramBundle.getString("_wxvideoobject_videoUrl");
    this.videoLowBandUrl = paramBundle.getString("_wxvideoobject_videoLowBandUrl");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.mm.sdk.openapi.WXVideoObject
 * JD-Core Version:    0.6.0
 */