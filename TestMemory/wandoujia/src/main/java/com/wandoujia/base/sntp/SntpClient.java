package com.wandoujia.base.sntp;

import android.os.SystemClock;

public class SntpClient
{
  private static final int CONST_1000 = 1000;
  private static final long CONST_100000000L = 100000000L;
  private static final long CONST_1000L = 1000L;
  private static final int CONST_16 = 16;
  private static final int CONST_2000 = 2000;
  private static final int CONST_24 = 24;
  private static final float CONST_255F = 255.0F;
  private static final int CONST_3 = 3;
  private static final int CONST_4 = 4;
  private static final int CONST_8 = 8;
  private static final int CONST_X7F = 127;
  private static final int CONST_X80 = 128;
  private static final int NTP_MODE_CLIENT = 3;
  private static final int NTP_PACKET_SIZE = 48;
  private static final int NTP_PORT = 123;
  private static final int NTP_VERSION = 3;
  private static final long OFFSET_1900_TO_1970 = 2208988800L;
  private static final int ORIGINATE_TIME_OFFSET = 24;
  private static final int RECEIVE_TIME_OFFSET = 32;
  private static final int REFERENCE_TIME_OFFSET = 16;
  private static final String TAG = "SntpClient";
  private static final int TRANSMIT_TIME_OFFSET = 40;
  private static long ntpOffset = -1L;
  private long mNtpTime;
  private long mNtpTimeReference;
  private long mRoundTripTime;

  public static long currentTimeInMillis()
  {
    if (ntpOffset < 0L)
    {
      SntpClient localSntpClient = new SntpClient();
      if (localSntpClient.requestTime("1.cn.pool.ntp.org", 2000))
      {
        ntpOffset = localSntpClient.getNtpTime() - localSntpClient.getNtpTimeReference();
        new StringBuilder("ntp offset = ").append(ntpOffset);
      }
    }
    if (ntpOffset > 0L)
      return SystemClock.elapsedRealtime() + ntpOffset;
    return System.currentTimeMillis();
  }

  private long read32(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte[paramInt];
    int j = paramArrayOfByte[(paramInt + 1)];
    int k = paramArrayOfByte[(paramInt + 2)];
    int m = paramArrayOfByte[(paramInt + 3)];
    if ((i & 0x80) == 128)
      i = 128 + (i & 0x7F);
    if ((j & 0x80) == 128)
      j = 128 + (j & 0x7F);
    if ((k & 0x80) == 128)
      k = 128 + (k & 0x7F);
    if ((m & 0x80) == 128)
      m = 128 + (m & 0x7F);
    return (i << 24) + (j << 16) + (k << 8) + m;
  }

  private long readTimeStamp(byte[] paramArrayOfByte, int paramInt)
  {
    long l1 = read32(paramArrayOfByte, paramInt);
    long l2 = read32(paramArrayOfByte, paramInt + 4);
    return 1000L * (l1 - 2208988800L) + l2 * 1000L / 100000000L;
  }

  public static boolean sntpSuccess()
  {
    return ntpOffset >= 0L;
  }

  private void writeTimeStamp(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    long l1 = paramLong / 1000L;
    long l2 = paramLong - 1000L * l1;
    long l3 = l1 + 2208988800L;
    int i = paramInt + 1;
    paramArrayOfByte[paramInt] = (byte)(int)(l3 >> 24);
    int j = i + 1;
    paramArrayOfByte[i] = (byte)(int)(l3 >> 16);
    int k = j + 1;
    paramArrayOfByte[j] = (byte)(int)(l3 >> 8);
    int m = k + 1;
    paramArrayOfByte[k] = (byte)(int)l3;
    long l4 = 100000000L * l2 / 1000L;
    int n = m + 1;
    paramArrayOfByte[m] = (byte)(int)(l4 >> 24);
    int i1 = n + 1;
    paramArrayOfByte[n] = (byte)(int)(l4 >> 16);
    int i2 = i1 + 1;
    paramArrayOfByte[i1] = (byte)(int)(l4 >> 8);
    paramArrayOfByte[i2] = (byte)(int)(255.0D * Math.random());
  }

  public long getNtpTime()
  {
    return this.mNtpTime;
  }

  public long getNtpTimeReference()
  {
    return this.mNtpTimeReference;
  }

  public long getRoundTripTime()
  {
    return this.mRoundTripTime;
  }

  // ERROR //
  public boolean requestTime(String paramString, int paramInt)
  {
    // Byte code:
    //   0: new 129	java/net/DatagramSocket
    //   3: dup
    //   4: invokespecial 130	java/net/DatagramSocket:<init>	()V
    //   7: astore_3
    //   8: aload_3
    //   9: iload_2
    //   10: invokevirtual 134	java/net/DatagramSocket:setSoTimeout	(I)V
    //   13: aload_1
    //   14: invokestatic 140	java/net/InetAddress:getByName	(Ljava/lang/String;)Ljava/net/InetAddress;
    //   17: astore 7
    //   19: bipush 48
    //   21: newarray byte
    //   23: astore 8
    //   25: new 142	java/net/DatagramPacket
    //   28: dup
    //   29: aload 8
    //   31: bipush 48
    //   33: aload 7
    //   35: bipush 123
    //   37: invokespecial 145	java/net/DatagramPacket:<init>	([BILjava/net/InetAddress;I)V
    //   40: astore 9
    //   42: aload 8
    //   44: iconst_0
    //   45: bipush 27
    //   47: bastore
    //   48: invokestatic 101	java/lang/System:currentTimeMillis	()J
    //   51: lstore 10
    //   53: invokestatic 96	android/os/SystemClock:elapsedRealtime	()J
    //   56: lstore 12
    //   58: aload_0
    //   59: aload 8
    //   61: bipush 40
    //   63: lload 10
    //   65: invokespecial 147	com/wandoujia/base/sntp/SntpClient:writeTimeStamp	([BIJ)V
    //   68: aload_3
    //   69: aload 9
    //   71: invokevirtual 151	java/net/DatagramSocket:send	(Ljava/net/DatagramPacket;)V
    //   74: aload_3
    //   75: new 142	java/net/DatagramPacket
    //   78: dup
    //   79: aload 8
    //   81: bipush 48
    //   83: invokespecial 154	java/net/DatagramPacket:<init>	([BI)V
    //   86: invokevirtual 157	java/net/DatagramSocket:receive	(Ljava/net/DatagramPacket;)V
    //   89: invokestatic 96	android/os/SystemClock:elapsedRealtime	()J
    //   92: lstore 14
    //   94: lload 10
    //   96: lload 14
    //   98: lload 12
    //   100: lsub
    //   101: ladd
    //   102: lstore 16
    //   104: aload_0
    //   105: aload 8
    //   107: bipush 24
    //   109: invokespecial 159	com/wandoujia/base/sntp/SntpClient:readTimeStamp	([BI)J
    //   112: lstore 18
    //   114: aload_0
    //   115: aload 8
    //   117: bipush 32
    //   119: invokespecial 159	com/wandoujia/base/sntp/SntpClient:readTimeStamp	([BI)J
    //   122: lstore 20
    //   124: aload_0
    //   125: aload 8
    //   127: bipush 40
    //   129: invokespecial 159	com/wandoujia/base/sntp/SntpClient:readTimeStamp	([BI)J
    //   132: lstore 22
    //   134: lload 14
    //   136: lload 12
    //   138: lsub
    //   139: lload 22
    //   141: lload 20
    //   143: lsub
    //   144: lsub
    //   145: lstore 24
    //   147: aload_0
    //   148: lload 16
    //   150: lload 20
    //   152: lload 18
    //   154: lsub
    //   155: lload 22
    //   157: lload 16
    //   159: lsub
    //   160: ladd
    //   161: ldc2_w 160
    //   164: ldiv
    //   165: ladd
    //   166: putfield 120	com/wandoujia/base/sntp/SntpClient:mNtpTime	J
    //   169: aload_0
    //   170: lload 14
    //   172: putfield 122	com/wandoujia/base/sntp/SntpClient:mNtpTimeReference	J
    //   175: aload_0
    //   176: lload 24
    //   178: putfield 125	com/wandoujia/base/sntp/SntpClient:mRoundTripTime	J
    //   181: aload_3
    //   182: invokevirtual 164	java/net/DatagramSocket:close	()V
    //   185: iconst_1
    //   186: ireturn
    //   187: astore 4
    //   189: aconst_null
    //   190: astore_3
    //   191: invokestatic 169	com/wandoujia/base/config/GlobalConfig:isDebug	()Z
    //   194: ifeq +18 -> 212
    //   197: new 82	java/lang/StringBuilder
    //   200: dup
    //   201: ldc 171
    //   203: invokespecial 87	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   206: aload 4
    //   208: invokevirtual 174	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   211: pop
    //   212: aload_3
    //   213: ifnull +7 -> 220
    //   216: aload_3
    //   217: invokevirtual 164	java/net/DatagramSocket:close	()V
    //   220: iconst_0
    //   221: ireturn
    //   222: astore 5
    //   224: aconst_null
    //   225: astore_3
    //   226: aload_3
    //   227: ifnull +7 -> 234
    //   230: aload_3
    //   231: invokevirtual 164	java/net/DatagramSocket:close	()V
    //   234: aload 5
    //   236: athrow
    //   237: astore 5
    //   239: goto -13 -> 226
    //   242: astore 4
    //   244: goto -53 -> 191
    //
    // Exception table:
    //   from	to	target	type
    //   0	8	187	java/lang/Exception
    //   0	8	222	finally
    //   8	94	237	finally
    //   104	134	237	finally
    //   147	181	237	finally
    //   191	212	237	finally
    //   8	94	242	java/lang/Exception
    //   104	134	242	java/lang/Exception
    //   147	181	242	java/lang/Exception
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.sntp.SntpClient
 * JD-Core Version:    0.6.0
 */