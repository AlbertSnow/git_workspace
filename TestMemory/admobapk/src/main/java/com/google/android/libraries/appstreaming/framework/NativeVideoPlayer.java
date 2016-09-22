package com.google.android.libraries.appstreaming.framework;

import auf;
import avk;
import com.google.android.apps.common.proguard.UsedByNative;
import java.nio.ByteBuffer;

@UsedByNative
public class NativeVideoPlayer
{
  private final auf a;

  @UsedByNative
  private final ByteBuffer mNativeInstance;

  public NativeVideoPlayer(avk paramavk, String paramString1, int paramInt, String paramString2, String paramString3, auf paramauf)
  {
    this.mNativeInstance = newNativeInstance(avk.a(paramavk), paramString1, paramInt, paramString2, paramString3);
    this.a = paramauf;
    registerPlayback();
  }

  private static native ByteBuffer newNativeInstance(byte[] paramArrayOfByte, String paramString1, int paramInt, String paramString2, String paramString3);

  @UsedByNative
  private ByteBuffer playback(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2)
  {
    return this.a.a(paramByteBuffer1, paramByteBuffer2);
  }

  private native void registerPlayback();

  public native int error();

  public native void release();

  public native void start();

  public native void stop();
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.libraries.appstreaming.framework.NativeVideoPlayer
 * JD-Core Version:    0.6.0
 */