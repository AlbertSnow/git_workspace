package com.wandoujia.push.protocol;

import android.content.Intent;
import android.support.v4.app.b;
import java.io.Serializable;

public class PushEntityV1$Redirect
  implements Serializable
{
  private PushEntityV1.Download download;
  private PushEntityV1.Intent intent;
  private PushEntityV1.IntentV2 intentV2;
  private String url;

  public PushEntityV1.Download getDownload()
  {
    return this.download;
  }

  public PushEntityV1.Intent getIntent()
  {
    return this.intent;
  }

  public PushEntityV1.IntentV2 getIntentV2()
  {
    PushEntityV1.Intent localIntent;
    PushEntityV1.IntentV2 localIntentV2;
    if (this.intentV2 == null)
    {
      localIntent = this.intent;
      if (localIntent != null)
        break label34;
      localIntentV2 = new PushEntityV1.IntentV2();
    }
    while (true)
    {
      this.intentV2 = localIntentV2;
      return this.intentV2;
      label34: localIntentV2 = new PushEntityV1.IntentV2();
      localIntentV2.setTarget(localIntent.getTarget());
      localIntentV2.setIntentUri(b.a(localIntent).toUri(0));
    }
  }

  public String getUrl()
  {
    return this.url;
  }

  public void setDownload(PushEntityV1.Download paramDownload)
  {
    this.download = paramDownload;
  }

  public void setIntentV2(PushEntityV1.IntentV2 paramIntentV2)
  {
    this.intentV2 = paramIntentV2;
  }

  public void setUrl(String paramString)
  {
    this.url = paramString;
  }

  public String toString()
  {
    return "[ url is " + this.url + ", download is " + this.download + ", intent is " + this.intent + "]";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.push.protocol.PushEntityV1.Redirect
 * JD-Core Version:    0.6.0
 */