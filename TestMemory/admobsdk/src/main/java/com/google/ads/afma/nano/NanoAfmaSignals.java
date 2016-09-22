package com.google.ads.afma.nano;

import com.google.android.gms.internal.zzsm;
import com.google.android.gms.internal.zzsn;
import com.google.android.gms.internal.zzss;
import com.google.android.gms.internal.zzst;
import com.google.android.gms.internal.zzsu;
import com.google.android.gms.internal.zzsx;
import java.io.IOException;

public abstract interface NanoAfmaSignals
{
  public static final class AdSignalsContainer extends zzsu
  {
    private static volatile AdSignalsContainer[] zzaO;
    public byte[] encryptedSpamSignals;
    public byte[] encryptedDidSignal;

    public static AdSignalsContainer[] emptyArray()
    {
      if (zzaO == null)
        synchronized (zzss.zzbut)
        {
          if (zzaO == null)
            zzaO = new AdSignalsContainer[0];
        }
      return zzaO;
    }

    public AdSignalsContainer()
    {
      clear();
    }

    public AdSignalsContainer clear()
    {
      this.encryptedSpamSignals = null;
      this.encryptedDidSignal = null;
      this.zzbuu = -1;
      return this;
    }

    public void writeTo(zzsn output)
      throws IOException
    {
      if (this.encryptedSpamSignals != null)
        output.zza(1, this.encryptedSpamSignals);
      if (this.encryptedDidSignal != null)
        output.zza(2, this.encryptedDidSignal);
      super.writeTo(output);
    }

    protected int zzz()
    {
      int i = super.zzz();
      if (this.encryptedSpamSignals != null)
        i += zzsn.zzb(1, this.encryptedSpamSignals);
      if (this.encryptedDidSignal != null)
        i += zzsn.zzb(2, this.encryptedDidSignal);
      return i;
    }

    public AdSignalsContainer mergeFrom(zzsm input)
      throws IOException
    {
      while (true)
      {
        int i = input.zzIX();
        switch (i)
        {
        case 0:
          return this;
        default:
          if (zzsx.zzb(input, i))
            break;
          return this;
        case 10:
          this.encryptedSpamSignals = input.readBytes();
          break;
        case 18:
          this.encryptedDidSignal = input.readBytes();
        }
      }
    }

    public static AdSignalsContainer parseFrom(byte[] data)
      throws zzst
    {
      return (AdSignalsContainer)zzsu.mergeFrom(new AdSignalsContainer(), data);
    }

    public static AdSignalsContainer parseFrom(zzsm input)
      throws IOException
    {
      return new AdSignalsContainer().mergeFrom(input);
    }
  }

  public static final class AFMASignals extends zzsu
  {
    private static volatile AFMASignals[] zzaL;
    public String osVersion;
    public String afmaVersion;
    public Long atvSignal;
    public Long attSignal;
    public Long btsSignal;
    public Long btlSignal;
    public Long acxSignal;
    public Long acySignal;
    public Long aczSignal;
    public Long actSignal;
    public Long netSignal;
    public Long ornSignal;
    public String stkSignal;
    public Long tcxSignal;
    public Long tcySignal;
    public Long tctSignal;
    public Long uptSignal;
    public Long visSignal;
    public Long swzSignal;
    public Long psnSignal;
    public Long jbkSignal;
    public Long usgSignal;
    public String intSignal;
    public String cerSignal;
    public Long uwSignal;
    public Long uhSignal;
    public Long utzSignal;
    public String vnmSignal;
    public Long vcdSignal;
    public Long tcpSignal;
    public Long tcdSignal;
    public NanoAfmaSignals.AdAttestationSignal adAttestationSignal;
    public Long tcuSignal;
    public Long tcmSignal;
    public Long tcdnSignal;
    public Long tccSignal;
    public TouchInfo[] previousTouches;
    public Long reqType;
    public String didSignal;
    public Integer didSignalType;
    public Boolean didOptOut;
    public String didSignalAndroidAdId;
    public Long evtTime;
    public NanoAfmaSignals.RawAdAttestationSignal rawAdAttestationSignal;

    public static AFMASignals[] emptyArray()
    {
      if (zzaL == null)
        synchronized (zzss.zzbut)
        {
          if (zzaL == null)
            zzaL = new AFMASignals[0];
        }
      return zzaL;
    }

    public AFMASignals()
    {
      clear();
    }

    public AFMASignals clear()
    {
      this.osVersion = null;
      this.afmaVersion = null;
      this.atvSignal = null;
      this.attSignal = null;
      this.btsSignal = null;
      this.btlSignal = null;
      this.acxSignal = null;
      this.acySignal = null;
      this.aczSignal = null;
      this.actSignal = null;
      this.netSignal = null;
      this.ornSignal = null;
      this.stkSignal = null;
      this.tcxSignal = null;
      this.tcySignal = null;
      this.tctSignal = null;
      this.uptSignal = null;
      this.visSignal = null;
      this.swzSignal = null;
      this.psnSignal = null;
      this.jbkSignal = null;
      this.usgSignal = null;
      this.intSignal = null;
      this.cerSignal = null;
      this.uwSignal = null;
      this.uhSignal = null;
      this.utzSignal = null;
      this.vnmSignal = null;
      this.vcdSignal = null;
      this.tcpSignal = null;
      this.tcdSignal = null;
      this.adAttestationSignal = null;
      this.tcuSignal = null;
      this.tcmSignal = null;
      this.tcdnSignal = null;
      this.tccSignal = null;
      this.previousTouches = TouchInfo.emptyArray();
      this.reqType = null;
      this.didSignal = null;
      this.didSignalType = null;
      this.didOptOut = null;
      this.didSignalAndroidAdId = null;
      this.evtTime = null;
      this.rawAdAttestationSignal = null;
      this.zzbuu = -1;
      return this;
    }

    public void writeTo(zzsn output)
      throws IOException
    {
      if (this.osVersion != null)
        output.zzn(1, this.osVersion);
      if (this.afmaVersion != null)
        output.zzn(2, this.afmaVersion);
      if (this.atvSignal != null)
        output.zzb(3, this.atvSignal.longValue());
      if (this.attSignal != null)
        output.zzb(4, this.attSignal.longValue());
      if (this.btsSignal != null)
        output.zzb(5, this.btsSignal.longValue());
      if (this.btlSignal != null)
        output.zzb(6, this.btlSignal.longValue());
      if (this.acxSignal != null)
        output.zzb(7, this.acxSignal.longValue());
      if (this.acySignal != null)
        output.zzb(8, this.acySignal.longValue());
      if (this.aczSignal != null)
        output.zzb(9, this.aczSignal.longValue());
      if (this.actSignal != null)
        output.zzb(10, this.actSignal.longValue());
      if (this.netSignal != null)
        output.zzb(11, this.netSignal.longValue());
      if (this.ornSignal != null)
        output.zzb(12, this.ornSignal.longValue());
      if (this.stkSignal != null)
        output.zzn(13, this.stkSignal);
      if (this.tcxSignal != null)
        output.zzb(14, this.tcxSignal.longValue());
      if (this.tcySignal != null)
        output.zzb(15, this.tcySignal.longValue());
      if (this.tctSignal != null)
        output.zzb(16, this.tctSignal.longValue());
      if (this.uptSignal != null)
        output.zzb(17, this.uptSignal.longValue());
      if (this.visSignal != null)
        output.zzb(18, this.visSignal.longValue());
      if (this.swzSignal != null)
        output.zzb(19, this.swzSignal.longValue());
      if (this.psnSignal != null)
        output.zzb(20, this.psnSignal.longValue());
      if (this.reqType != null)
        output.zzb(21, this.reqType.longValue());
      if (this.jbkSignal != null)
        output.zzb(22, this.jbkSignal.longValue());
      if (this.usgSignal != null)
        output.zzb(23, this.usgSignal.longValue());
      if (this.didSignal != null)
        output.zzn(24, this.didSignal);
      if (this.evtTime != null)
        output.zzb(25, this.evtTime.longValue());
      if (this.didSignalType != null)
        output.zzA(26, this.didSignalType.intValue());
      if (this.intSignal != null)
        output.zzn(27, this.intSignal);
      if (this.didOptOut != null)
        output.zze(28, this.didOptOut.booleanValue());
      if (this.cerSignal != null)
        output.zzn(29, this.cerSignal);
      if (this.didSignalAndroidAdId != null)
        output.zzn(30, this.didSignalAndroidAdId);
      if (this.uwSignal != null)
        output.zzb(31, this.uwSignal.longValue());
      if (this.uhSignal != null)
        output.zzb(32, this.uhSignal.longValue());
      if (this.utzSignal != null)
        output.zzb(33, this.utzSignal.longValue());
      if (this.vnmSignal != null)
        output.zzn(34, this.vnmSignal);
      if (this.vcdSignal != null)
        output.zzb(35, this.vcdSignal.longValue());
      if (this.tcpSignal != null)
        output.zzb(36, this.tcpSignal.longValue());
      if (this.tcdSignal != null)
        output.zzb(37, this.tcdSignal.longValue());
      if (this.adAttestationSignal != null)
        output.zza(38, this.adAttestationSignal);
      if (this.tcuSignal != null)
        output.zzb(39, this.tcuSignal.longValue());
      if (this.tcmSignal != null)
        output.zzb(40, this.tcmSignal.longValue());
      if (this.tcdnSignal != null)
        output.zzb(41, this.tcdnSignal.longValue());
      if (this.tccSignal != null)
        output.zzb(42, this.tccSignal.longValue());
      if ((this.previousTouches != null) && (this.previousTouches.length > 0))
        for (int i = 0; i < this.previousTouches.length; i++)
        {
          TouchInfo localTouchInfo = this.previousTouches[i];
          if (localTouchInfo == null)
            continue;
          output.zza(43, localTouchInfo);
        }
      if (this.rawAdAttestationSignal != null)
        output.zza(201, this.rawAdAttestationSignal);
      super.writeTo(output);
    }

    protected int zzz()
    {
      int i = super.zzz();
      if (this.osVersion != null)
        i += zzsn.zzo(1, this.osVersion);
      if (this.afmaVersion != null)
        i += zzsn.zzo(2, this.afmaVersion);
      if (this.atvSignal != null)
        i += zzsn.zzd(3, this.atvSignal.longValue());
      if (this.attSignal != null)
        i += zzsn.zzd(4, this.attSignal.longValue());
      if (this.btsSignal != null)
        i += zzsn.zzd(5, this.btsSignal.longValue());
      if (this.btlSignal != null)
        i += zzsn.zzd(6, this.btlSignal.longValue());
      if (this.acxSignal != null)
        i += zzsn.zzd(7, this.acxSignal.longValue());
      if (this.acySignal != null)
        i += zzsn.zzd(8, this.acySignal.longValue());
      if (this.aczSignal != null)
        i += zzsn.zzd(9, this.aczSignal.longValue());
      if (this.actSignal != null)
        i += zzsn.zzd(10, this.actSignal.longValue());
      if (this.netSignal != null)
        i += zzsn.zzd(11, this.netSignal.longValue());
      if (this.ornSignal != null)
        i += zzsn.zzd(12, this.ornSignal.longValue());
      if (this.stkSignal != null)
        i += zzsn.zzo(13, this.stkSignal);
      if (this.tcxSignal != null)
        i += zzsn.zzd(14, this.tcxSignal.longValue());
      if (this.tcySignal != null)
        i += zzsn.zzd(15, this.tcySignal.longValue());
      if (this.tctSignal != null)
        i += zzsn.zzd(16, this.tctSignal.longValue());
      if (this.uptSignal != null)
        i += zzsn.zzd(17, this.uptSignal.longValue());
      if (this.visSignal != null)
        i += zzsn.zzd(18, this.visSignal.longValue());
      if (this.swzSignal != null)
        i += zzsn.zzd(19, this.swzSignal.longValue());
      if (this.psnSignal != null)
        i += zzsn.zzd(20, this.psnSignal.longValue());
      if (this.reqType != null)
        i += zzsn.zzd(21, this.reqType.longValue());
      if (this.jbkSignal != null)
        i += zzsn.zzd(22, this.jbkSignal.longValue());
      if (this.usgSignal != null)
        i += zzsn.zzd(23, this.usgSignal.longValue());
      if (this.didSignal != null)
        i += zzsn.zzo(24, this.didSignal);
      if (this.evtTime != null)
        i += zzsn.zzd(25, this.evtTime.longValue());
      if (this.didSignalType != null)
        i += zzsn.zzC(26, this.didSignalType.intValue());
      if (this.intSignal != null)
        i += zzsn.zzo(27, this.intSignal);
      if (this.didOptOut != null)
        i += zzsn.zzf(28, this.didOptOut.booleanValue());
      if (this.cerSignal != null)
        i += zzsn.zzo(29, this.cerSignal);
      if (this.didSignalAndroidAdId != null)
        i += zzsn.zzo(30, this.didSignalAndroidAdId);
      if (this.uwSignal != null)
        i += zzsn.zzd(31, this.uwSignal.longValue());
      if (this.uhSignal != null)
        i += zzsn.zzd(32, this.uhSignal.longValue());
      if (this.utzSignal != null)
        i += zzsn.zzd(33, this.utzSignal.longValue());
      if (this.vnmSignal != null)
        i += zzsn.zzo(34, this.vnmSignal);
      if (this.vcdSignal != null)
        i += zzsn.zzd(35, this.vcdSignal.longValue());
      if (this.tcpSignal != null)
        i += zzsn.zzd(36, this.tcpSignal.longValue());
      if (this.tcdSignal != null)
        i += zzsn.zzd(37, this.tcdSignal.longValue());
      if (this.adAttestationSignal != null)
        i += zzsn.zzc(38, this.adAttestationSignal);
      if (this.tcuSignal != null)
        i += zzsn.zzd(39, this.tcuSignal.longValue());
      if (this.tcmSignal != null)
        i += zzsn.zzd(40, this.tcmSignal.longValue());
      if (this.tcdnSignal != null)
        i += zzsn.zzd(41, this.tcdnSignal.longValue());
      if (this.tccSignal != null)
        i += zzsn.zzd(42, this.tccSignal.longValue());
      if ((this.previousTouches != null) && (this.previousTouches.length > 0))
        for (int j = 0; j < this.previousTouches.length; j++)
        {
          TouchInfo localTouchInfo = this.previousTouches[j];
          if (localTouchInfo == null)
            continue;
          i += zzsn.zzc(43, localTouchInfo);
        }
      if (this.rawAdAttestationSignal != null)
        i += zzsn.zzc(201, this.rawAdAttestationSignal);
      return i;
    }

    public AFMASignals mergeFrom(zzsm input)
      throws IOException
    {
      while (true)
      {
        int i = input.zzIX();
        int j;
        switch (i)
        {
        case 0:
          return this;
        default:
          if (zzsx.zzb(input, i))
            break;
          return this;
        case 10:
          this.osVersion = input.readString();
          break;
        case 18:
          this.afmaVersion = input.readString();
          break;
        case 24:
          this.atvSignal = Long.valueOf(input.zzJa());
          break;
        case 32:
          this.attSignal = Long.valueOf(input.zzJa());
          break;
        case 40:
          this.btsSignal = Long.valueOf(input.zzJa());
          break;
        case 48:
          this.btlSignal = Long.valueOf(input.zzJa());
          break;
        case 56:
          this.acxSignal = Long.valueOf(input.zzJa());
          break;
        case 64:
          this.acySignal = Long.valueOf(input.zzJa());
          break;
        case 72:
          this.aczSignal = Long.valueOf(input.zzJa());
          break;
        case 80:
          this.actSignal = Long.valueOf(input.zzJa());
          break;
        case 88:
          this.netSignal = Long.valueOf(input.zzJa());
          break;
        case 96:
          this.ornSignal = Long.valueOf(input.zzJa());
          break;
        case 106:
          this.stkSignal = input.readString();
          break;
        case 112:
          this.tcxSignal = Long.valueOf(input.zzJa());
          break;
        case 120:
          this.tcySignal = Long.valueOf(input.zzJa());
          break;
        case 128:
          this.tctSignal = Long.valueOf(input.zzJa());
          break;
        case 136:
          this.uptSignal = Long.valueOf(input.zzJa());
          break;
        case 144:
          this.visSignal = Long.valueOf(input.zzJa());
          break;
        case 152:
          this.swzSignal = Long.valueOf(input.zzJa());
          break;
        case 160:
          this.psnSignal = Long.valueOf(input.zzJa());
          break;
        case 168:
          this.reqType = Long.valueOf(input.zzJa());
          break;
        case 176:
          this.jbkSignal = Long.valueOf(input.zzJa());
          break;
        case 184:
          this.usgSignal = Long.valueOf(input.zzJa());
          break;
        case 194:
          this.didSignal = input.readString();
          break;
        case 200:
          this.evtTime = Long.valueOf(input.zzJa());
          break;
        case 208:
          j = input.zzJb();
          switch (j)
          {
          case 0:
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          case 6:
            this.didSignalType = Integer.valueOf(j);
          }
          break;
        case 218:
          this.intSignal = input.readString();
          break;
        case 224:
          this.didOptOut = Boolean.valueOf(input.zzJc());
          break;
        case 234:
          this.cerSignal = input.readString();
          break;
        case 242:
          this.didSignalAndroidAdId = input.readString();
          break;
        case 248:
          this.uwSignal = Long.valueOf(input.zzJa());
          break;
        case 256:
          this.uhSignal = Long.valueOf(input.zzJa());
          break;
        case 264:
          this.utzSignal = Long.valueOf(input.zzJa());
          break;
        case 274:
          this.vnmSignal = input.readString();
          break;
        case 280:
          this.vcdSignal = Long.valueOf(input.zzJa());
          break;
        case 288:
          this.tcpSignal = Long.valueOf(input.zzJa());
          break;
        case 296:
          this.tcdSignal = Long.valueOf(input.zzJa());
          break;
        case 306:
          if (this.adAttestationSignal == null)
            this.adAttestationSignal = new NanoAfmaSignals.AdAttestationSignal();
          input.zza(this.adAttestationSignal);
          break;
        case 312:
          this.tcuSignal = Long.valueOf(input.zzJa());
          break;
        case 320:
          this.tcmSignal = Long.valueOf(input.zzJa());
          break;
        case 328:
          this.tcdnSignal = Long.valueOf(input.zzJa());
          break;
        case 336:
          this.tccSignal = Long.valueOf(input.zzJa());
          break;
        case 346:
          j = zzsx.zzc(input, 346);
          int k = this.previousTouches == null ? 0 : this.previousTouches.length;
          TouchInfo[] arrayOfTouchInfo = new TouchInfo[k + j];
          if (k != 0)
            System.arraycopy(this.previousTouches, 0, arrayOfTouchInfo, 0, k);
          while (k < arrayOfTouchInfo.length - 1)
          {
            arrayOfTouchInfo[k] = new TouchInfo();
            input.zza(arrayOfTouchInfo[k]);
            input.zzIX();
            k++;
          }
          arrayOfTouchInfo[k] = new TouchInfo();
          input.zza(arrayOfTouchInfo[k]);
          this.previousTouches = arrayOfTouchInfo;
          break;
        case 1610:
          if (this.rawAdAttestationSignal == null)
            this.rawAdAttestationSignal = new NanoAfmaSignals.RawAdAttestationSignal();
          input.zza(this.rawAdAttestationSignal);
        }
      }
    }

    public static AFMASignals parseFrom(byte[] data)
      throws zzst
    {
      return (AFMASignals)zzsu.mergeFrom(new AFMASignals(), data);
    }

    public static AFMASignals parseFrom(zzsm input)
      throws IOException
    {
      return new AFMASignals().mergeFrom(input);
    }

    public static final class TouchInfo extends zzsu
    {
      private static volatile TouchInfo[] zzaM;
      public Long tcxSignal;
      public Long tcySignal;

      public static TouchInfo[] emptyArray()
      {
        if (zzaM == null)
          synchronized (zzss.zzbut)
          {
            if (zzaM == null)
              zzaM = new TouchInfo[0];
          }
        return zzaM;
      }

      public TouchInfo()
      {
        clear();
      }

      public TouchInfo clear()
      {
        this.tcxSignal = null;
        this.tcySignal = null;
        this.zzbuu = -1;
        return this;
      }

      public void writeTo(zzsn output)
        throws IOException
      {
        if (this.tcxSignal != null)
          output.zzb(1, this.tcxSignal.longValue());
        if (this.tcySignal != null)
          output.zzb(2, this.tcySignal.longValue());
        super.writeTo(output);
      }

      protected int zzz()
      {
        int i = super.zzz();
        if (this.tcxSignal != null)
          i += zzsn.zzd(1, this.tcxSignal.longValue());
        if (this.tcySignal != null)
          i += zzsn.zzd(2, this.tcySignal.longValue());
        return i;
      }

      public TouchInfo mergeFrom(zzsm input)
        throws IOException
      {
        while (true)
        {
          int i = input.zzIX();
          switch (i)
          {
          case 0:
            return this;
          default:
            if (zzsx.zzb(input, i))
              break;
            return this;
          case 8:
            this.tcxSignal = Long.valueOf(input.zzJa());
            break;
          case 16:
            this.tcySignal = Long.valueOf(input.zzJa());
          }
        }
      }

      public static TouchInfo parseFrom(byte[] data)
        throws zzst
      {
        return (TouchInfo)zzsu.mergeFrom(new TouchInfo(), data);
      }

      public static TouchInfo parseFrom(zzsm input)
        throws IOException
      {
        return new TouchInfo().mergeFrom(input);
      }
    }

    public static abstract interface DeviceIdType
    {
      public static final int DEVICE_IDENTIFIER_NO_ID = 0;
      public static final int DEVICE_IDENTIFIER_APP_SPECIFIC_ID = 1;
      public static final int DEVICE_IDENTIFIER_GLOBAL_ID = 2;
      public static final int DEVICE_IDENTIFIER_ADVERTISER_ID = 3;
      public static final int DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED = 4;
      public static final int DEVICE_IDENTIFIER_ANDROID_AD_ID = 5;
      public static final int DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID = 6;
    }
  }

  public static final class AdAttestationSignal extends zzsu
  {
    private static volatile AdAttestationSignal[] zzaN;
    public Long timestampMs;
    public Integer responseType;
    public Boolean suspicious;
    public Integer reasons;

    public static AdAttestationSignal[] emptyArray()
    {
      if (zzaN == null)
        synchronized (zzss.zzbut)
        {
          if (zzaN == null)
            zzaN = new AdAttestationSignal[0];
        }
      return zzaN;
    }

    public AdAttestationSignal()
    {
      clear();
    }

    public AdAttestationSignal clear()
    {
      this.timestampMs = null;
      this.responseType = null;
      this.suspicious = null;
      this.reasons = null;
      this.zzbuu = -1;
      return this;
    }

    public void writeTo(zzsn output)
      throws IOException
    {
      if (this.timestampMs != null)
        output.zzb(1, this.timestampMs.longValue());
      if (this.responseType != null)
        output.zzA(2, this.responseType.intValue());
      if (this.suspicious != null)
        output.zze(3, this.suspicious.booleanValue());
      if (this.reasons != null)
        output.zzA(4, this.reasons.intValue());
      super.writeTo(output);
    }

    protected int zzz()
    {
      int i = super.zzz();
      if (this.timestampMs != null)
        i += zzsn.zzd(1, this.timestampMs.longValue());
      if (this.responseType != null)
        i += zzsn.zzC(2, this.responseType.intValue());
      if (this.suspicious != null)
        i += zzsn.zzf(3, this.suspicious.booleanValue());
      if (this.reasons != null)
        i += zzsn.zzC(4, this.reasons.intValue());
      return i;
    }

    public AdAttestationSignal mergeFrom(zzsm input)
      throws IOException
    {
      while (true)
      {
        int i = input.zzIX();
        int j;
        switch (i)
        {
        case 0:
          return this;
        default:
          if (zzsx.zzb(input, i))
            break;
          return this;
        case 8:
          this.timestampMs = Long.valueOf(input.zzJa());
          break;
        case 16:
          j = input.zzJb();
          switch (j)
          {
          case 0:
          case 1:
          case 2:
          case 3:
            this.responseType = Integer.valueOf(j);
          }
          break;
        case 24:
          this.suspicious = Boolean.valueOf(input.zzJc());
          break;
        case 32:
          j = input.zzJb();
          switch (j)
          {
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          case 6:
          case 7:
          case 8:
          case 9:
          case 10:
          case 11:
          case 12:
          case 13:
          case 14:
          case 15:
          case 16:
          case 17:
          case 18:
          case 19:
          case 20:
          case 21:
          case 22:
          case 23:
          case 24:
          case 25:
          case 26:
          case 27:
          case 28:
          case 29:
          case 30:
          case 31:
            this.reasons = Integer.valueOf(j);
          }
        }
      }
    }

    public static AdAttestationSignal parseFrom(byte[] data)
      throws zzst
    {
      return (AdAttestationSignal)zzsu.mergeFrom(new AdAttestationSignal(), data);
    }

    public static AdAttestationSignal parseFrom(zzsm input)
      throws IOException
    {
      return new AdAttestationSignal().mergeFrom(input);
    }
  }

  public static final class RawAdAttestationSignal extends zzsu
  {
    private static volatile RawAdAttestationSignal[] zzaP;
    public Long timestampMs;
    public String keyIdentifier;
    public byte[] encryptedAdAttestationStatemement;

    public static RawAdAttestationSignal[] emptyArray()
    {
      if (zzaP == null)
        synchronized (zzss.zzbut)
        {
          if (zzaP == null)
            zzaP = new RawAdAttestationSignal[0];
        }
      return zzaP;
    }

    public RawAdAttestationSignal()
    {
      clear();
    }

    public RawAdAttestationSignal clear()
    {
      this.timestampMs = null;
      this.keyIdentifier = null;
      this.encryptedAdAttestationStatemement = null;
      this.zzbuu = -1;
      return this;
    }

    public void writeTo(zzsn output)
      throws IOException
    {
      if (this.timestampMs != null)
        output.zzb(1, this.timestampMs.longValue());
      if (this.keyIdentifier != null)
        output.zzn(3, this.keyIdentifier);
      if (this.encryptedAdAttestationStatemement != null)
        output.zza(4, this.encryptedAdAttestationStatemement);
      super.writeTo(output);
    }

    protected int zzz()
    {
      int i = super.zzz();
      if (this.timestampMs != null)
        i += zzsn.zzd(1, this.timestampMs.longValue());
      if (this.keyIdentifier != null)
        i += zzsn.zzo(3, this.keyIdentifier);
      if (this.encryptedAdAttestationStatemement != null)
        i += zzsn.zzb(4, this.encryptedAdAttestationStatemement);
      return i;
    }

    public RawAdAttestationSignal mergeFrom(zzsm input)
      throws IOException
    {
      while (true)
      {
        int i = input.zzIX();
        switch (i)
        {
        case 0:
          return this;
        default:
          if (zzsx.zzb(input, i))
            break;
          return this;
        case 8:
          this.timestampMs = Long.valueOf(input.zzJa());
          break;
        case 26:
          this.keyIdentifier = input.readString();
          break;
        case 34:
          this.encryptedAdAttestationStatemement = input.readBytes();
        }
      }
    }

    public static RawAdAttestationSignal parseFrom(byte[] data)
      throws zzst
    {
      return (RawAdAttestationSignal)zzsu.mergeFrom(new RawAdAttestationSignal(), data);
    }

    public static RawAdAttestationSignal parseFrom(zzsm input)
      throws IOException
    {
      return new RawAdAttestationSignal().mergeFrom(input);
    }
  }

  public static abstract interface DroidGuardSuspiciousReason
  {
    public static final int REASON_EMPTY_RESPONSE = 1;
    public static final int REASON_INVALID_TAG = 2;
    public static final int REASON_CORRUPTED_RESPONSE = 3;
    public static final int REASON_REPLAY_PROTECTION = 4;
    public static final int REASON_VM_EXCEPTION = 5;
    public static final int REASON_MISSING_PROGRESS_REPORT = 6;
    public static final int REASON_CONTENT_BINDING_FAILED = 7;
    public static final int REASON_DEVICE_SIDE_ERROR = 8;
    public static final int REASON_MISSING_ARM_CPU_CACHE = 9;
    public static final int REASON_CTS_PROFILE_LOOKUP_FAILURE = 10;
    public static final int REASON_CTS_PROFILE_MISMATCH = 11;
    public static final int REASON_GOLDFISH = 12;
    public static final int REASON_VIRTUALBOX = 13;
    public static final int REASON_DEVICE_SIDE_PARSE_ERROR = 14;
    public static final int REASON_EMULATOR = 15;
    public static final int REASON_DROIDGUASSO_VALIDATION_FAILED = 16;
    public static final int REASON_MISSING_REPLAY_PROTECTION = 17;
    public static final int REASON_VM_BINDING_FAILED = 18;
    public static final int REASON_WIDEVINE_VALIDATION_FAILED = 19;
    public static final int REASON_MISSING_RUNTIME_API = 20;
    public static final int REASON_ROOTED = 21;
    public static final int REASON_GMS_CORE_SIGNATURE_MISMATCH = 22;
    public static final int REASON_WIDEVINE_LEVEL_MISMATCH = 23;
    public static final int REASON_BAD_SIGNAL_EVALUATION_ORDER = 24;
    public static final int REASON_INVALID_GMS_CORE_VERSION = 25;
    public static final int REASON_ANDROID_ID_MISMATCH = 26;
    public static final int REASON_CONTEXT_VERIFICATION_FAILED = 27;
    public static final int REASON_BLACKLISTED_MAC_ADDRESS_HASH = 28;
    public static final int REASON_BLACKLISTED_IMEI_HASH = 29;
    public static final int REASON_BLACKLISTED_IMSI_HASH = 30;
    public static final int REASON_XPOSED_INSTALLED = 31;
  }

  public static abstract interface DroidGuardResponseType
  {
    public static final int RESPONSE_TYPE_NORMAL = 0;
    public static final int RESPONSE_TYPE_FALLBACK = 1;
    public static final int RESPONSE_TYPE_PLAIN_TEXT = 2;
    public static final int RESPONSE_TYPE_OTHER = 3;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.ads.afma.nano.NanoAfmaSignals
 * JD-Core Version:    0.6.0
 */