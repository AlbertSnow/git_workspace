package com.google.android.libraries.appstreaming.framework;

import com.google.android.apps.common.proguard.UsedByNative;
import java.nio.ByteBuffer;

@UsedByNative
public class NativeControlStreamer
{

  @UsedByNative
  private final ByteBuffer mNativeInstance;

  public NativeControlStreamer(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, int paramInt3)
  {
    this.mNativeInstance = newNativeInstance(paramString1, paramInt1, paramString2, paramString3, paramInt2, paramInt3);
  }

  private static native ByteBuffer newNativeInstance(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, int paramInt3);

  public native boolean connect();

  public native void release();

  public native boolean send(byte[] paramArrayOfByte);
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.libraries.appstreaming.framework.NativeControlStreamer
 * JD-Core Version:    0.6.0
 */