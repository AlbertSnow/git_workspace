import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;

final class ij
  implements ii
{
  public final int a()
  {
    return MediaCodecList.getCodecCount();
  }

  public final MediaCodecInfo a(int paramInt)
  {
    return MediaCodecList.getCodecInfoAt(paramInt);
  }

  public final boolean a(String paramString, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return "video/avc".equals(paramString);
  }

  public final boolean b()
  {
    return false;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ij
 * JD-Core Version:    0.6.0
 */