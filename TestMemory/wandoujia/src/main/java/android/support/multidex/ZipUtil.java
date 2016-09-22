package android.support.multidex;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

final class ZipUtil
{
  private static final int BUFFER_SIZE = 16384;
  private static final int ENDHDR = 22;
  private static final int ENDSIG = 101010256;

  static long computeCrcOfCentralDir(RandomAccessFile paramRandomAccessFile, ZipUtil.CentralDirectory paramCentralDirectory)
  {
    CRC32 localCRC32 = new CRC32();
    long l = paramCentralDirectory.size;
    paramRandomAccessFile.seek(paramCentralDirectory.offset);
    int i = (int)Math.min(16384L, l);
    byte[] arrayOfByte = new byte[16384];
    for (int j = paramRandomAccessFile.read(arrayOfByte, 0, i); j != -1; j = paramRandomAccessFile.read(arrayOfByte, 0, (int)Math.min(16384L, l)))
    {
      localCRC32.update(arrayOfByte, 0, j);
      l -= j;
      if (l == 0L)
        break;
    }
    return localCRC32.getValue();
  }

  static ZipUtil.CentralDirectory findCentralDirectory(RandomAccessFile paramRandomAccessFile)
  {
    long l1 = 0L;
    long l2 = paramRandomAccessFile.length() - 22L;
    if (l2 < l1)
      throw new ZipException("File too short to be a zip file: " + paramRandomAccessFile.length());
    long l3 = l2 - 65536L;
    if (l3 < l1);
    while (true)
    {
      int i = Integer.reverseBytes(101010256);
      long l4 = l2;
      while (true)
      {
        paramRandomAccessFile.seek(l4);
        if (paramRandomAccessFile.readInt() == i)
          break;
        l4 -= 1L;
        if (l4 >= l1)
          continue;
        throw new ZipException("End Of Central Directory signature not found");
      }
      paramRandomAccessFile.skipBytes(2);
      paramRandomAccessFile.skipBytes(2);
      paramRandomAccessFile.skipBytes(2);
      paramRandomAccessFile.skipBytes(2);
      ZipUtil.CentralDirectory localCentralDirectory = new ZipUtil.CentralDirectory();
      localCentralDirectory.size = (0xFFFFFFFF & Integer.reverseBytes(paramRandomAccessFile.readInt()));
      localCentralDirectory.offset = (0xFFFFFFFF & Integer.reverseBytes(paramRandomAccessFile.readInt()));
      return localCentralDirectory;
      l1 = l3;
    }
  }

  static long getZipCrc(File paramFile)
  {
    RandomAccessFile localRandomAccessFile = new RandomAccessFile(paramFile, "r");
    try
    {
      long l = computeCrcOfCentralDir(localRandomAccessFile, findCentralDirectory(localRandomAccessFile));
      return l;
    }
    finally
    {
      localRandomAccessFile.close();
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.multidex.ZipUtil
 * JD-Core Version:    0.6.0
 */