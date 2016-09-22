package com.google.android.libraries.appstreaming.framework;

import ast;
import asu;
import asw;
import asy;
import aug;
import com.google.android.apps.common.proguard.UsedByNative;
import java.nio.ByteBuffer;

@UsedByNative
public class NativeAudioPlayer
{
  private final asy a;

  @UsedByNative
  private final ByteBuffer mNativeInstance;

  public NativeAudioPlayer(aug paramaug, String paramString1, int paramInt, String paramString2, String paramString3, asy paramasy)
  {
    this.mNativeInstance = newNativeInstance(aug.a(paramaug), paramString1, paramInt, paramString2, paramString3);
    this.a = paramasy;
    registerPlayback();
  }

  private static native ByteBuffer newNativeInstance(byte[] paramArrayOfByte, String paramString1, int paramInt, String paramString2, String paramString3);

  @UsedByNative
  private void playback(int paramInt, ByteBuffer paramByteBuffer)
  {
    asy localasy = this.a;
    if (!localasy.a.e)
    {
      localasy.a.f.a();
      localasy.a.e = true;
    }
    localasy.a.c.a(paramByteBuffer);
  }

  private native void registerPlayback();

  public native int error();

  public native void release();

  public native void start();

  public native void stop();
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.libraries.appstreaming.framework.NativeAudioPlayer
 * JD-Core Version:    0.6.0
 */