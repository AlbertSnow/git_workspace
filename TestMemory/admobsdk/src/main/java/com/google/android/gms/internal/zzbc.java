package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;

@zzhb
public class zzbc
{
  private final int zzsK;
  private final int zzsL;
  private final int zzsM;
  private final zzbh zzsN;
  private final Object zzpV = new Object();
  private ArrayList<String> zzsO = new ArrayList();
  private ArrayList<String> zzsP = new ArrayList();
  private int zzsQ = 0;
  private int zzsR = 0;
  private int zzsS = 0;
  private int zzsT;
  private String zzsU = "";
  private String zzsV = "";

  public zzbc(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.zzsK = paramInt1;
    this.zzsL = paramInt2;
    this.zzsM = paramInt3;
    this.zzsN = new zzbh(paramInt4);
  }

  public boolean zzcx()
  {
    synchronized (this.zzpV)
    {
      return this.zzsS == 0;
    }
  }

  public String zzcy()
  {
    return this.zzsU;
  }

  public String zzcz()
  {
    return this.zzsV;
  }

  public void zzcA()
  {
    synchronized (this.zzpV)
    {
      this.zzsT -= 100;
    }
  }

  public void zzcB()
  {
    synchronized (this.zzpV)
    {
      this.zzsS -= 1;
    }
  }

  public void zzcC()
  {
    synchronized (this.zzpV)
    {
      this.zzsS += 1;
    }
  }

  public void zzc(String paramString, boolean paramBoolean)
  {
    zze(paramString, paramBoolean);
    synchronized (this.zzpV)
    {
      if (this.zzsS < 0)
        zzin.zzaI("ActivityContent: negative number of WebViews.");
      zzcD();
    }
  }

  public void zzd(String paramString, boolean paramBoolean)
  {
    zze(paramString, paramBoolean);
  }

  private void zze(String paramString, boolean paramBoolean)
  {
    if ((paramString == null) || (paramString.length() < this.zzsM))
      return;
    synchronized (this.zzpV)
    {
      this.zzsO.add(paramString);
      this.zzsQ += paramString.length();
      if (paramBoolean)
        this.zzsP.add(paramString);
    }
  }

  public void zzcD()
  {
    synchronized (this.zzpV)
    {
      int i = zzb(this.zzsQ, this.zzsR);
      if (i > this.zzsT)
      {
        this.zzsT = i;
        this.zzsU = this.zzsN.zza(this.zzsO);
        this.zzsV = this.zzsN.zza(this.zzsP);
      }
    }
  }

  int zzb(int paramInt1, int paramInt2)
  {
    return paramInt1 * this.zzsK + paramInt2 * this.zzsL;
  }

  public int getScore()
  {
    return this.zzsT;
  }

  public void zzh(int paramInt)
  {
    this.zzsR = paramInt;
  }

  private String zza(ArrayList<String> paramArrayList, int paramInt)
  {
    if (paramArrayList.isEmpty())
      return "";
    StringBuffer localStringBuffer = new StringBuffer();
    Object localObject = paramArrayList.iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      localStringBuffer.append(str);
      localStringBuffer.append(' ');
      if (localStringBuffer.length() > paramInt)
        break;
    }
    localStringBuffer.deleteCharAt(localStringBuffer.length() - 1);
    localObject = localStringBuffer.toString();
    if (((String)localObject).length() < paramInt)
      return localObject;
    return (String)((String)localObject).substring(0, paramInt);
  }

  public String toString()
  {
    return "ActivityContent fetchId: " + this.zzsR + " score:" + this.zzsT + " total_length:" + this.zzsQ + "\n text: " + zza(this.zzsO, 100) + "\n viewableText" + zza(this.zzsP, 100) + "\n signture: " + this.zzsU + "\n viewableSignture: " + this.zzsV;
  }

  int zzcE()
  {
    return this.zzsQ;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof zzbc))
      return false;
    if (obj == this)
      return true;
    zzbc localzzbc = (zzbc)obj;
    return (localzzbc.zzcy() != null) && (localzzbc.zzcy().equals(zzcy()));
  }

  public int hashCode()
  {
    return zzcy().hashCode();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzbc
 * JD-Core Version:    0.6.0
 */