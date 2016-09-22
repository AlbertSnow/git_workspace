public final class auf
{
  auf(aub paramaub)
  {
  }

  // ERROR //
  public final java.nio.ByteBuffer a(java.nio.ByteBuffer paramByteBuffer1, java.nio.ByteBuffer paramByteBuffer2)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 10	auf:a	Laub;
    //   4: getfield 24	aub:f	Z
    //   7: ifne +23 -> 30
    //   10: aload_0
    //   11: getfield 10	auf:a	Laub;
    //   14: getfield 28	aub:g	Laud;
    //   17: invokeinterface 32 1 0
    //   22: aload_0
    //   23: getfield 10	auf:a	Laub;
    //   26: iconst_1
    //   27: putfield 24	aub:f	Z
    //   30: aload_2
    //   31: ifnull +106 -> 137
    //   34: aload_2
    //   35: invokevirtual 38	java/nio/ByteBuffer:capacity	()I
    //   38: newarray byte
    //   40: astore 8
    //   42: aload_2
    //   43: aload 8
    //   45: invokevirtual 42	java/nio/ByteBuffer:get	([B)Ljava/nio/ByteBuffer;
    //   48: pop
    //   49: new 44	avl
    //   52: dup
    //   53: invokespecial 45	avl:<init>	()V
    //   56: aload 8
    //   58: invokestatic 50	awb:a	(Lawb;[B)Lawb;
    //   61: checkcast 44	avl
    //   64: astore_3
    //   65: aload_0
    //   66: getfield 10	auf:a	Laub;
    //   69: getfield 54	aub:c	Late;
    //   72: aload_1
    //   73: aload_3
    //   74: invokevirtual 59	ate:a	(Ljava/nio/ByteBuffer;Lavl;)Lavm;
    //   77: astore 5
    //   79: aload 5
    //   81: invokevirtual 64	avm:e	()I
    //   84: invokestatic 68	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   87: astore 6
    //   89: aload 6
    //   91: aload 5
    //   93: invokestatic 71	avm:a	(Lawb;)[B
    //   96: invokevirtual 74	java/nio/ByteBuffer:put	([B)Ljava/nio/ByteBuffer;
    //   99: pop
    //   100: aload 6
    //   102: areturn
    //   103: astore 10
    //   105: getstatic 77	aub:a	Ljava/util/logging/Logger;
    //   108: getstatic 82	asn:a	Ljava/util/logging/Level;
    //   111: ldc 84
    //   113: aload 10
    //   115: invokevirtual 90	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   118: aconst_null
    //   119: areturn
    //   120: astore 4
    //   122: getstatic 77	aub:a	Ljava/util/logging/Logger;
    //   125: getstatic 82	asn:a	Ljava/util/logging/Level;
    //   128: ldc 92
    //   130: aload 4
    //   132: invokevirtual 90	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   135: aconst_null
    //   136: areturn
    //   137: aconst_null
    //   138: astore_3
    //   139: goto -74 -> 65
    //
    // Exception table:
    //   from	to	target	type
    //   49	65	103	awa
    //   65	79	120	java/io/IOException
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     auf
 * JD-Core Version:    0.6.0
 */