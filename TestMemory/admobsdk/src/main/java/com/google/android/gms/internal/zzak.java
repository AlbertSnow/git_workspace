package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.ads.afma.nano.NanoAfmaSignals.AFMASignals;
import com.google.android.gms.common.api.GoogleApiClient;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

public abstract class zzak
  implements zzaj
{
  protected MotionEvent zznx;
  protected LinkedList<MotionEvent> zzny = new LinkedList();
  protected long zznz = 0L;
  protected long zznA = 0L;
  protected long zznB = 0L;
  protected long zznC = 0L;
  private boolean zznD = false;
  protected DisplayMetrics zznE;
  protected zzap zznF;
  protected static GoogleApiClient zznG;

  protected zzak(Context paramContext, zzap paramzzap)
  {
    this.zznF = paramzzap;
    try
    {
      this.zznE = paramContext.getResources().getDisplayMetrics();
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      this.zznE = new DisplayMetrics();
      this.zznE.density = 1.0F;
    }
  }

  protected abstract NanoAfmaSignals.AFMASignals zzc(Context paramContext);

  protected abstract NanoAfmaSignals.AFMASignals zzd(Context paramContext);

  public String zzb(Context paramContext)
  {
    return zza(paramContext, null, false);
  }

  public String zzb(Context paramContext, String paramString)
  {
    return zza(paramContext, paramString, true);
  }

  public void zza(MotionEvent paramMotionEvent)
  {
    if (this.zznD)
    {
      this.zznz = (this.zznA = this.zznB = this.zznC = 0L);
      Iterator localIterator = this.zzny.iterator();
      while (localIterator.hasNext())
      {
        MotionEvent localMotionEvent = (MotionEvent)localIterator.next();
        localMotionEvent.recycle();
      }
      this.zzny.clear();
      this.zznx = null;
      this.zznD = false;
    }
    switch (paramMotionEvent.getAction())
    {
    case 1:
      this.zznx = MotionEvent.obtain(paramMotionEvent);
      this.zzny.add(this.zznx);
      if (this.zzny.size() > 6)
        ((MotionEvent)this.zzny.remove()).recycle();
      this.zznB += 1L;
      break;
    case 0:
      this.zznz += 1L;
      break;
    case 3:
      this.zznC += 1L;
      break;
    case 2:
      this.zznA += paramMotionEvent.getHistorySize() + 1;
    }
  }

  public void zza(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.zznx != null)
      this.zznx.recycle();
    this.zznx = MotionEvent.obtain(0L, paramInt3, 1, paramInt1 * this.zznE.density, paramInt2 * this.zznE.density, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);
  }

  private String zza(Context paramContext, String paramString, boolean paramBoolean)
  {
    String str;
    try
    {
      NanoAfmaSignals.AFMASignals localAFMASignals;
      if (paramBoolean)
      {
        localAFMASignals = zzd(paramContext);
        this.zznD = true;
      }
      else
      {
        localAFMASignals = zzc(paramContext);
      }
      if ((localAFMASignals == null) || (localAFMASignals.getSerializedSize() == 0))
        str = Integer.toString(5);
      else
        str = zza(localAFMASignals, paramString);
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      str = Integer.toString(7);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      str = Integer.toString(7);
    }
    catch (IOException localIOException)
    {
      str = Integer.toString(3);
    }
    return str;
  }

  protected String zza(NanoAfmaSignals.AFMASignals paramAFMASignals, String paramString)
    throws NoSuchAlgorithmException, UnsupportedEncodingException, IOException
  {
    byte[] arrayOfByte = zzsu.toByteArray(paramAFMASignals);
    return zza(arrayOfByte, paramString);
  }

  String zza(byte[] paramArrayOfByte, String paramString)
    throws NoSuchAlgorithmException, UnsupportedEncodingException, IOException
  {
    Object localObject1;
    if (paramArrayOfByte.length > 239)
    {
      localObject1 = new NanoAfmaSignals.AFMASignals();
      ((NanoAfmaSignals.AFMASignals)localObject1).psnSignal = Long.valueOf(1L);
      paramArrayOfByte = zzsu.toByteArray((zzsu)localObject1);
    }
    if (paramArrayOfByte.length < 239)
    {
      localObject2 = new byte[239 - paramArrayOfByte.length];
      new SecureRandom().nextBytes(localObject2);
      localObject1 = ByteBuffer.allocate(240).put((byte)paramArrayOfByte.length).put(paramArrayOfByte).put(localObject2).array();
    }
    else
    {
      localObject1 = ByteBuffer.allocate(240).put((byte)paramArrayOfByte.length).put(paramArrayOfByte).array();
    }
    Object localObject2 = MessageDigest.getInstance("MD5");
    ((MessageDigest)localObject2).update(localObject1);
    byte[] arrayOfByte1 = ((MessageDigest)localObject2).digest();
    byte[] arrayOfByte2 = ByteBuffer.allocate(256).put(arrayOfByte1).put(localObject1).array();
    byte[] arrayOfByte3 = new byte[256];
    new zzai().zzb(arrayOfByte2, arrayOfByte3);
    if ((paramString != null) && (paramString.length() > 0))
      zza(paramString, arrayOfByte3);
    return (String)(String)this.zznF.zza(arrayOfByte3, true);
  }

  void zza(String paramString, byte[] paramArrayOfByte)
    throws UnsupportedEncodingException
  {
    if (paramString.length() > 32)
      paramString = paramString.substring(0, 32);
    byte[] arrayOfByte = paramString.getBytes("UTF-8");
    new zzsl(arrayOfByte).zzC(paramArrayOfByte);
  }

  protected String zzk(String paramString)
  {
    if ((paramString != null) && (paramString.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")))
    {
      UUID localUUID = UUID.fromString(paramString);
      byte[] arrayOfByte = new byte[16];
      ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
      localByteBuffer.putLong(localUUID.getMostSignificantBits());
      localByteBuffer.putLong(localUUID.getLeastSignificantBits());
      paramString = this.zznF.zza(arrayOfByte, true);
    }
    return paramString;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzak
 * JD-Core Version:    0.6.0
 */