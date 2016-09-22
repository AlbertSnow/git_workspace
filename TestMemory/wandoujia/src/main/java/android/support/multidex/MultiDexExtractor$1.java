package android.support.multidex;

import java.io.File;
import java.io.FileFilter;

final class MultiDexExtractor$1
  implements FileFilter
{
  public final boolean accept(File paramFile)
  {
    return !paramFile.getName().startsWith(this.val$extractedFilePrefix);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.multidex.MultiDexExtractor.1
 * JD-Core Version:    0.6.0
 */