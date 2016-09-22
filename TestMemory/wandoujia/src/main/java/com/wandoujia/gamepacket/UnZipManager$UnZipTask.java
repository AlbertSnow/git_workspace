package com.wandoujia.gamepacket;

import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.base.utils.ZipUtil;
import com.wandoujia.base.utils.ZipUtil.ZipResultCode;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class UnZipManager$UnZipTask
  implements Runnable
{
  private final ab callback;
  private long currentSize;
  private final String destPath;
  private final ac filter;
  private final String sourceFilePath;
  private final String token;
  private long totalSize;
  private Set<String> unzippedFiles;

  public UnZipManager$UnZipTask(UnZipManager paramUnZipManager, String paramString1, String paramString2, String paramString3, ac paramac, ab paramab)
  {
    this.token = paramString1;
    this.filter = paramac;
    this.sourceFilePath = paramString2;
    this.destPath = paramString3;
    this.callback = paramab;
    this.currentSize = 0L;
    this.unzippedFiles = new HashSet();
  }

  public void nativeExtractCallback(String paramString1, String paramString2, int paramInt)
  {
    this.currentSize += paramInt;
    UnZipManager.a(this.this$0, paramString1, this.currentSize, this.totalSize, this.callback);
    this.unzippedFiles.add(this.destPath + File.separator + paramString2);
  }

  public void run()
  {
    String str1;
    if (this.filter != null)
    {
      str1 = ac.a(this.filter);
      if (this.filter == null)
        break label89;
    }
    label89: for (String str2 = ac.b(this.filter); ; str2 = "")
    {
      this.totalSize = ZipUtil.getUnCompressedSize(UnZipManager.a(this.this$0), this.sourceFilePath, str1, str2);
      if (FileUtil.getAvailableBytes(e.a) >= this.totalSize)
        break label95;
      UnZipManager.a(this.this$0, this.token, UnZipManager.UnZipStatus.FAILED_INSUFFICIENT_STORAGE, this.callback);
      return;
      str1 = "";
      break;
    }
    label95: UnZipManager.b(this.this$0).put(this.token, Integer.valueOf(0));
    UnZipManager.a(this.this$0, this.token, UnZipManager.UnZipStatus.UNZIPPING, this.callback);
    if (ZipUtil.extractGamePacket(UnZipManager.a(this.this$0), this.sourceFilePath, this.destPath, this, "nativeExtractCallback", this.token, str1, str2, false) != ZipUtil.ZipResultCode.UNZ_OK)
    {
      UnZipManager.a(this.this$0, this.token, UnZipManager.UnZipStatus.FAILED, this.callback);
      UnZipManager.b(this.destPath);
      return;
    }
    UnZipManager.a(this.this$0, this.token, UnZipManager.UnZipStatus.SUCCESS, this.callback);
    UnZipManager.a(this.this$0, this.unzippedFiles, this.callback);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gamepacket.UnZipManager.UnZipTask
 * JD-Core Version:    0.6.0
 */