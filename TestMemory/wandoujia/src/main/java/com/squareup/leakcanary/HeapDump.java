package com.squareup.leakcanary;

import java.io.File;
import java.io.Serializable;

public final class HeapDump
  implements Serializable
{
  public final long gcDurationMs;
  public final long heapDumpDurationMs;
  public final File heapDumpFile;
  public final String referenceKey;
  public final String referenceName;
  public final long watchDurationMs;

  public HeapDump(File paramFile, String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3)
  {
    this.heapDumpFile = ((File)e.a(paramFile, "heapDumpFile"));
    this.referenceKey = ((String)e.a(paramString1, "referenceKey"));
    this.referenceName = ((String)e.a(paramString2, "referenceName"));
    this.watchDurationMs = paramLong1;
    this.gcDurationMs = paramLong2;
    this.heapDumpDurationMs = paramLong3;
  }

  public final HeapDump renameFile(File paramFile)
  {
    this.heapDumpFile.renameTo(paramFile);
    return new HeapDump(paramFile, this.referenceKey, this.referenceName, this.watchDurationMs, this.gcDurationMs, this.heapDumpDurationMs);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.leakcanary.HeapDump
 * JD-Core Version:    0.6.0
 */