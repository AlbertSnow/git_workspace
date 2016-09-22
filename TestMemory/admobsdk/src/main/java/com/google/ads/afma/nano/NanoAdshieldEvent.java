package com.google.ads.afma.nano;

import com.google.android.gms.internal.zzsm;
import com.google.android.gms.internal.zzsn;
import com.google.android.gms.internal.zzss;
import com.google.android.gms.internal.zzst;
import com.google.android.gms.internal.zzsu;
import com.google.android.gms.internal.zzsx;
import java.io.IOException;

public abstract interface NanoAdshieldEvent
{
  public static final class AdShieldEvent extends zzsu
  {
    private static volatile AdShieldEvent[] zzaK;
    public String appId;

    public static AdShieldEvent[] emptyArray()
    {
      if (zzaK == null)
        synchronized (zzss.zzbut)
        {
          if (zzaK == null)
            zzaK = new AdShieldEvent[0];
        }
      return zzaK;
    }

    public AdShieldEvent()
    {
      clear();
    }

    public AdShieldEvent clear()
    {
      this.appId = "";
      this.zzbuu = -1;
      return this;
    }

    public void writeTo(zzsn output)
      throws IOException
    {
      if (!this.appId.equals(""))
        output.zzn(1, this.appId);
      super.writeTo(output);
    }

    protected int zzz()
    {
      int i = super.zzz();
      if (!this.appId.equals(""))
        i += zzsn.zzo(1, this.appId);
      return i;
    }

    public AdShieldEvent mergeFrom(zzsm input)
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
          this.appId = input.readString();
        }
      }
    }

    public static AdShieldEvent parseFrom(byte[] data)
      throws zzst
    {
      return (AdShieldEvent)zzsu.mergeFrom(new AdShieldEvent(), data);
    }

    public static AdShieldEvent parseFrom(zzsm input)
      throws IOException
    {
      return new AdShieldEvent().mergeFrom(input);
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.ads.afma.nano.NanoAdshieldEvent
 * JD-Core Version:    0.6.0
 */