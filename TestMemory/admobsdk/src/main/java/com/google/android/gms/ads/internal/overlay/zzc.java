package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View.MeasureSpec;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzmq;
import java.util.HashMap;
import java.util.Map;

@TargetApi(14)
@zzhb
public class zzc extends zzi
  implements AudioManager.OnAudioFocusChangeListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener
{
  private static final Map<Integer, String> zzDN = new HashMap();
  private final zzt zzDO;
  private int zzDP = 0;
  private int zzDQ = 0;
  private MediaPlayer zzDR;
  private Uri zzDS;
  private int zzDT;
  private int zzDU;
  private int zzDV;
  private int zzDW;
  private int zzDX;
  private float zzDY = 1.0F;
  private boolean zzDZ;
  private boolean zzEa;
  private int zzEb;
  private zzh zzEc;

  public zzc(Context paramContext, zzt paramzzt)
  {
    super(paramContext);
    setSurfaceTextureListener(this);
    this.zzDO = paramzzt;
    this.zzDO.zza(this);
  }

  public String zzeZ()
  {
    return "MediaPlayer";
  }

  public void zza(zzh paramzzh)
  {
    this.zzEc = paramzzh;
  }

  public void setMimeType(String mimeType)
  {
  }

  public void setVideoPath(String path)
  {
    setVideoURI(Uri.parse(path));
  }

  public void setVideoURI(Uri uri)
  {
    this.zzDS = uri;
    this.zzEb = 0;
    zzfa();
    requestLayout();
    invalidate();
  }

  public void stop()
  {
    zzin.v("AdMediaPlayerView stop");
    if (this.zzDR != null)
    {
      this.zzDR.stop();
      this.zzDR.release();
      this.zzDR = null;
      zzw(0);
      zzx(0);
      zzfd();
    }
    this.zzDO.onStop();
  }

  public void onVideoSizeChanged(MediaPlayer mp, int width, int height)
  {
    zzin.v("AdMediaPlayerView size changed: " + width + " x " + height);
    this.zzDT = mp.getVideoWidth();
    this.zzDU = mp.getVideoHeight();
    if ((this.zzDT != 0) && (this.zzDU != 0))
      requestLayout();
  }

  public void onPrepared(MediaPlayer mediaPlayer)
  {
    zzin.v("AdMediaPlayerView prepared");
    zzw(2);
    this.zzDO.zzfz();
    zzir.zzMc.post(new Runnable()
    {
      public void run()
      {
        if (zzc.zza(zzc.this) != null)
          zzc.zza(zzc.this).zzfz();
      }
    });
    this.zzDT = mediaPlayer.getVideoWidth();
    this.zzDU = mediaPlayer.getVideoHeight();
    if (this.zzEb != 0)
      seekTo(this.zzEb);
    zzfb();
    zzin.zzaJ("AdMediaPlayerView stream dimensions: " + this.zzDT + " x " + this.zzDU);
    if (this.zzDQ == 3)
      play();
    zzfc();
    zzfj();
  }

  public void onCompletion(MediaPlayer mp)
  {
    zzin.v("AdMediaPlayerView completion");
    zzw(5);
    zzx(5);
    zzir.zzMc.post(new Runnable()
    {
      public void run()
      {
        if (zzc.zza(zzc.this) != null)
          zzc.zza(zzc.this).zzfB();
      }
    });
  }

  public boolean onInfo(MediaPlayer mp, int what, int extra)
  {
    String str1 = (String)zzDN.get(Integer.valueOf(what));
    String str2 = (String)zzDN.get(Integer.valueOf(extra));
    zzin.v("AdMediaPlayerView MediaPlayer info: " + str1 + ":" + str2);
    return true;
  }

  public boolean onError(MediaPlayer mp, int what, int extra)
  {
    String str1 = (String)zzDN.get(Integer.valueOf(what));
    String str2 = (String)zzDN.get(Integer.valueOf(extra));
    zzin.zzaK("AdMediaPlayerView MediaPlayer error: " + str1 + ":" + str2);
    zzw(-1);
    zzx(-1);
    zzir.zzMc.post(new Runnable(str1, str2)
    {
      public void run()
      {
        if (zzc.zza(zzc.this) != null)
          zzc.zza(zzc.this).zzg(this.zzEe, this.zzEf);
      }
    });
    return true;
  }

  public void onBufferingUpdate(MediaPlayer mp, int percent)
  {
    this.zzDV = percent;
  }

  public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height)
  {
    zzin.v("AdMediaPlayerView surface created");
    zzfa();
    zzir.zzMc.post(new Runnable()
    {
      public void run()
      {
        if (zzc.zza(zzc.this) != null)
          zzc.zza(zzc.this).zzfy();
      }
    });
  }

  public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int w, int h)
  {
    zzin.v("AdMediaPlayerView surface changed");
    int i = this.zzDQ == 3 ? 1 : 0;
    int j = (this.zzDT == w) && (this.zzDU == h) ? 1 : 0;
    if ((this.zzDR != null) && (i != 0) && (j != 0))
    {
      if (this.zzEb != 0)
        seekTo(this.zzEb);
      play();
    }
  }

  public boolean onSurfaceTextureDestroyed(SurfaceTexture surface)
  {
    zzin.v("AdMediaPlayerView surface destroyed");
    if ((this.zzDR != null) && (this.zzEb == 0))
      this.zzEb = this.zzDR.getCurrentPosition();
    zzir.zzMc.post(new Runnable()
    {
      public void run()
      {
        if (zzc.zza(zzc.this) != null)
        {
          zzc.zza(zzc.this).onPaused();
          zzc.zza(zzc.this).zzfC();
        }
      }
    });
    zzv(true);
    return true;
  }

  public void onSurfaceTextureUpdated(SurfaceTexture surface)
  {
    this.zzDO.zzb(this);
  }

  protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
  {
    int i = getDefaultSize(this.zzDT, widthMeasureSpec);
    int j = getDefaultSize(this.zzDU, heightMeasureSpec);
    if ((this.zzDT > 0) && (this.zzDU > 0))
    {
      int k = View.MeasureSpec.getMode(widthMeasureSpec);
      int m = View.MeasureSpec.getSize(widthMeasureSpec);
      int n = View.MeasureSpec.getMode(heightMeasureSpec);
      int i1 = View.MeasureSpec.getSize(heightMeasureSpec);
      if ((k == 1073741824) && (n == 1073741824))
      {
        i = m;
        j = i1;
        if (this.zzDT * j < i * this.zzDU)
          i = j * this.zzDT / this.zzDU;
        else if (this.zzDT * j > i * this.zzDU)
          j = i * this.zzDU / this.zzDT;
      }
      else if (k == 1073741824)
      {
        i = m;
        j = i * this.zzDU / this.zzDT;
        if ((n == -2147483648) && (j > i1))
          j = i1;
      }
      else if (n == 1073741824)
      {
        j = i1;
        i = j * this.zzDT / this.zzDU;
        if ((k == -2147483648) && (i > m))
          i = m;
      }
      else
      {
        i = this.zzDT;
        j = this.zzDU;
        if ((n == -2147483648) && (j > i1))
        {
          j = i1;
          i = j * this.zzDT / this.zzDU;
        }
        if ((k == -2147483648) && (i > m))
        {
          i = m;
          j = i * this.zzDU / this.zzDT;
        }
      }
    }
    setMeasuredDimension(i, j);
    if (Build.VERSION.SDK_INT == 16)
    {
      if (((this.zzDW > 0) && (this.zzDW != i)) || ((this.zzDX > 0) && (this.zzDX != j)))
        zzfb();
      this.zzDW = i;
      this.zzDX = j;
    }
  }

  public String toString()
  {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
  }

  private void zzfa()
  {
    zzin.v("AdMediaPlayerView init MediaPlayer");
    SurfaceTexture localSurfaceTexture = getSurfaceTexture();
    if ((this.zzDS == null) || (localSurfaceTexture == null))
      return;
    zzv(false);
    try
    {
      this.zzDR = new MediaPlayer();
      this.zzDR.setOnBufferingUpdateListener(this);
      this.zzDR.setOnCompletionListener(this);
      this.zzDR.setOnErrorListener(this);
      this.zzDR.setOnInfoListener(this);
      this.zzDR.setOnPreparedListener(this);
      this.zzDR.setOnVideoSizeChangedListener(this);
      this.zzDV = 0;
      this.zzDR.setDataSource(getContext(), this.zzDS);
      this.zzDR.setSurface(new Surface(localSurfaceTexture));
      this.zzDR.setAudioStreamType(3);
      this.zzDR.setScreenOnWhilePlaying(true);
      this.zzDR.prepareAsync();
      zzw(1);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      zzin.zzd("Failed to initialize MediaPlayer at " + this.zzDS, localIllegalArgumentException);
      onError(this.zzDR, 1, 0);
    }
  }

  private void zzfb()
  {
    if ((zzfe()) && (this.zzDR.getCurrentPosition() > 0) && (this.zzDQ != 3))
    {
      zzin.v("AdMediaPlayerView nudging MediaPlayer");
      zzb(0.0F);
      this.zzDR.start();
      int i = this.zzDR.getCurrentPosition();
      long l1 = zzr.zzbG().currentTimeMillis();
      while ((zzfe()) && (this.zzDR.getCurrentPosition() == i))
      {
        long l2 = zzr.zzbG().currentTimeMillis();
        if (l2 - l1 > 250L)
          break;
      }
      this.zzDR.pause();
      zzfj();
    }
  }

  private void zzfc()
  {
    AudioManager localAudioManager = zzfk();
    if ((localAudioManager != null) && (!this.zzEa))
    {
      int i = localAudioManager.requestAudioFocus(this, 3, 2);
      if (i == 1)
        zzfh();
      else
        zzin.zzaK("AdMediaPlayerView audio focus request failed");
    }
  }

  private void zzfd()
  {
    zzin.v("AdMediaPlayerView abandon audio focus");
    AudioManager localAudioManager = zzfk();
    if ((localAudioManager != null) && (this.zzEa))
    {
      int i = localAudioManager.abandonAudioFocus(this);
      if (i == 1)
        this.zzEa = false;
      else
        zzin.zzaK("AdMediaPlayerView abandon audio focus failed");
    }
  }

  private void zzv(boolean paramBoolean)
  {
    zzin.v("AdMediaPlayerView release");
    if (this.zzDR != null)
    {
      this.zzDR.reset();
      this.zzDR.release();
      this.zzDR = null;
      zzw(0);
      if (paramBoolean)
      {
        this.zzDQ = 0;
        zzx(0);
      }
      zzfd();
    }
  }

  public void play()
  {
    zzin.v("AdMediaPlayerView play");
    if (zzfe())
    {
      this.zzDR.start();
      zzw(3);
      zzir.zzMc.post(new Runnable()
      {
        public void run()
        {
          if (zzc.zza(zzc.this) != null)
            zzc.zza(zzc.this).zzfA();
        }
      });
    }
    zzx(3);
  }

  public void pause()
  {
    zzin.v("AdMediaPlayerView pause");
    if ((zzfe()) && (this.zzDR.isPlaying()))
    {
      this.zzDR.pause();
      zzw(4);
      zzir.zzMc.post(new Runnable()
      {
        public void run()
        {
          if (zzc.zza(zzc.this) != null)
            zzc.zza(zzc.this).onPaused();
        }
      });
    }
    zzx(4);
  }

  public int getDuration()
  {
    if (zzfe())
      return this.zzDR.getDuration();
    return -1;
  }

  public int getCurrentPosition()
  {
    if (zzfe())
      return this.zzDR.getCurrentPosition();
    return 0;
  }

  public void seekTo(int millis)
  {
    zzin.v("AdMediaPlayerView seek " + millis);
    if (zzfe())
    {
      this.zzDR.seekTo(millis);
      this.zzEb = 0;
    }
    else
    {
      this.zzEb = millis;
    }
  }

  private boolean zzfe()
  {
    return (this.zzDR != null) && (this.zzDP != -1) && (this.zzDP != 0) && (this.zzDP != 1);
  }

  public void onAudioFocusChange(int focusChange)
  {
    if (focusChange > 0)
      zzfh();
    else if (focusChange < 0)
      zzfi();
  }

  public void zzff()
  {
    this.zzDZ = true;
    zzfj();
  }

  public void zzfg()
  {
    this.zzDZ = false;
    zzfj();
  }

  public void zza(float paramFloat)
  {
    this.zzDY = paramFloat;
    zzfj();
  }

  public int getVideoWidth()
  {
    if (this.zzDR != null)
      return this.zzDR.getVideoWidth();
    return 0;
  }

  public int getVideoHeight()
  {
    if (this.zzDR != null)
      return this.zzDR.getVideoHeight();
    return 0;
  }

  private void zzfh()
  {
    zzin.v("AdMediaPlayerView audio focus gained");
    this.zzEa = true;
    zzfj();
  }

  private void zzfi()
  {
    zzin.v("AdMediaPlayerView audio focus lost");
    this.zzEa = false;
    zzfj();
  }

  private void zzfj()
  {
    if ((!this.zzDZ) && (this.zzEa))
      zzb(this.zzDY);
    else
      zzb(0.0F);
  }

  private void zzb(float paramFloat)
  {
    if (this.zzDR != null)
      try
      {
        this.zzDR.setVolume(paramFloat, paramFloat);
      }
      catch (IllegalStateException localIllegalStateException)
      {
      }
    else
      zzin.zzaK("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
  }

  private AudioManager zzfk()
  {
    Context localContext = getContext();
    return (AudioManager)localContext.getSystemService("audio");
  }

  private void zzw(int paramInt)
  {
    if (paramInt == 3)
      this.zzDO.zzfO();
    else if ((this.zzDP == 3) && (paramInt != 3))
      this.zzDO.zzfP();
    this.zzDP = paramInt;
  }

  private void zzx(int paramInt)
  {
    this.zzDQ = paramInt;
  }

  static
  {
    zzDN.put(Integer.valueOf(-1004), "MEDIA_ERROR_IO");
    zzDN.put(Integer.valueOf(-1007), "MEDIA_ERROR_MALFORMED");
    zzDN.put(Integer.valueOf(-1010), "MEDIA_ERROR_UNSUPPORTED");
    zzDN.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
    zzDN.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
    zzDN.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
    zzDN.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
    zzDN.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
    zzDN.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
    zzDN.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
    zzDN.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
    zzDN.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
    zzDN.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
    zzDN.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
    zzDN.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
    zzDN.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zzc
 * JD-Core Version:    0.6.0
 */