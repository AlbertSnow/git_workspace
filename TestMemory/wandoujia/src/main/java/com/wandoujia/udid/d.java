package com.wandoujia.udid;

import com.wandoujia.base.utils.FileUtil;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

final class d
  implements Runnable
{
  d(String paramString)
  {
  }

  public final void run()
  {
    try
    {
      UDIDUtil.a();
      FileUtil.deletePath("/data/local/tmp/.config");
      FileUtil.deleteFile("/data/local/tmp/.wdj_config/.udid");
      File localFile = new File("/data/local/tmp/.wdj_config/.udid");
      localFile.getParentFile().mkdirs();
      BufferedWriter localBufferedWriter = new BufferedWriter(new FileWriter(localFile));
      localBufferedWriter.write(this.a);
      localBufferedWriter.close();
      UDIDUtil.b();
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.udid.d
 * JD-Core Version:    0.6.0
 */