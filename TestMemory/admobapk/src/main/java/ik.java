import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;

@TargetApi(21)
final class ik
  implements ii
{
  private final int a;
  private MediaCodecInfo[] b;

  public ik(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      this.a = i;
      return;
    }
  }

  private final void c()
  {
    if (this.b == null)
      this.b = new MediaCodecList(this.a).getCodecInfos();
  }

  public final int a()
  {
    c();
    return this.b.length;
  }

  public final MediaCodecInfo a(int paramInt)
  {
    c();
    return this.b[paramInt];
  }

  public final boolean a(String paramString, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return paramCodecCapabilities.isFeatureSupported("secure-playback");
  }

  public final boolean b()
  {
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ik
 * JD-Core Version:    0.6.0
 */