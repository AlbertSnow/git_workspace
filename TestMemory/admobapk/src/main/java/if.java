import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.util.Log;
import android.util.Pair;
import java.util.HashMap;

@TargetApi(16)
public final class if
{
  private static final HashMap a = new HashMap();

  private static Pair a(ig paramig, ii paramii)
  {
    while (true)
    {
      String str1;
      int j;
      String str2;
      int k;
      MediaCodecInfo.CodecCapabilities localCodecCapabilities;
      boolean bool2;
      try
      {
        str1 = paramig.a;
        int i = paramii.a();
        boolean bool1 = paramii.b();
        j = 0;
        if (j >= i)
          break label331;
        MediaCodecInfo localMediaCodecInfo = paramii.a(j);
        str2 = localMediaCodecInfo.getName();
        if ((localMediaCodecInfo.isEncoder()) || (!str2.startsWith("OMX.")) || ((!bool1) && (str2.endsWith(".secure"))))
          break label325;
        String[] arrayOfString = localMediaCodecInfo.getSupportedTypes();
        k = 0;
        if (k >= arrayOfString.length)
          break label325;
        String str3 = arrayOfString[k];
        if (!str3.equalsIgnoreCase(str1))
          break label319;
        localCodecCapabilities = localMediaCodecInfo.getCapabilitiesForType(str3);
        bool2 = paramii.a(paramig.a, localCodecCapabilities);
        if (!bool1)
        {
          HashMap localHashMap1 = a;
          if (!paramig.b)
            break label333;
          localig1 = new ig(str1, false);
          localHashMap1.put(localig1, Pair.create(str2, localCodecCapabilities));
          if (!bool2)
            continue;
          HashMap localHashMap2 = a;
          if (!paramig.b)
            continue;
          ig localig2 = paramig;
          localHashMap2.put(localig2, Pair.create(String.valueOf(str2).concat(".secure"), localCodecCapabilities));
          if (!a.containsKey(paramig))
            break label319;
          return (Pair)a.get(paramig);
          localig2 = new ig(str1, true);
          continue;
        }
      }
      catch (Exception localException)
      {
        throw new ih(localException);
      }
      HashMap localHashMap3 = a;
      if (paramig.b == bool2);
      for (ig localig3 = paramig; ; localig3 = new ig(str1, bool2))
      {
        localHashMap3.put(localig3, Pair.create(str2, localCodecCapabilities));
        break;
      }
      label319: k++;
      continue;
      label325: j++;
      continue;
      label331: return null;
      label333: ig localig1 = paramig;
    }
  }

  public static hl a(String paramString, boolean paramBoolean)
  {
    Pair localPair = b(paramString, paramBoolean);
    if (localPair == null)
      return null;
    String str = (String)localPair.first;
    MediaCodecInfo.CodecCapabilities localCodecCapabilities = (MediaCodecInfo.CodecCapabilities)localPair.second;
    if (ly.a >= 19);
    for (boolean bool = localCodecCapabilities.isFeatureSupported("adaptive-playback"); ; bool = false)
      return new hl(str, bool);
  }

  private static Pair b(String paramString, boolean paramBoolean)
  {
    monitorenter;
    while (true)
    {
      Pair localPair;
      try
      {
        ig localig = new ig(paramString, paramBoolean);
        if (!a.containsKey(localig))
          continue;
        localObject3 = (Pair)a.get(localig);
        return localObject3;
        if (ly.a < 21)
          continue;
        Object localObject2 = new ik(paramBoolean);
        localObject3 = a(localig, (ii)localObject2);
        if ((!paramBoolean) || (localObject3 != null) || (ly.a < 21))
          continue;
        localPair = a(localig, new ij());
        if (localPair != null)
        {
          String str = (String)localPair.first;
          Log.w("MediaCodecUtil", 63 + String.valueOf(paramString).length() + String.valueOf(str).length() + "MediaCodecList API didn't list secure decoder for: " + paramString + ". Assuming: " + str);
          break label187;
          localObject2 = new ij();
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      label187: Object localObject3 = localPair;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     if
 * JD-Core Version:    0.6.0
 */