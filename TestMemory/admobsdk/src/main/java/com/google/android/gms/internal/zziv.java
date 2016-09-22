package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.ArrayList;
import java.util.List;

@zzhb
public class zziv
{
  private final String[] zzMn;
  private final double[] zzMo;
  private final double[] zzMp;
  private final int[] zzMq;
  private int zzMr;

  private zziv(zzb paramzzb)
  {
    int i = zzb.zza(paramzzb).size();
    this.zzMn = ((String[])zzb.zzb(paramzzb).toArray(new String[i]));
    this.zzMo = zzk(zzb.zza(paramzzb));
    this.zzMp = zzk(zzb.zzc(paramzzb));
    this.zzMq = new int[i];
    this.zzMr = 0;
  }

  private double[] zzk(List<Double> paramList)
  {
    double[] arrayOfDouble = new double[paramList.size()];
    for (int i = 0; i < arrayOfDouble.length; i++)
      arrayOfDouble[i] = ((Double)paramList.get(i)).doubleValue();
    return arrayOfDouble;
  }

  public void zza(double paramDouble)
  {
    this.zzMr += 1;
    for (int i = 0; i < this.zzMp.length; i++)
    {
      if ((this.zzMp[i] <= paramDouble) && (paramDouble < this.zzMo[i]))
        this.zzMq[i] += 1;
      if (paramDouble < this.zzMp[i])
        break;
    }
  }

  public List<zza> getBuckets()
  {
    ArrayList localArrayList = new ArrayList(this.zzMn.length);
    for (int i = 0; i < this.zzMn.length; i++)
      localArrayList.add(new zza(this.zzMn[i], this.zzMp[i], this.zzMo[i], this.zzMq[i] / this.zzMr, this.zzMq[i]));
    return localArrayList;
  }

  public static class zza
  {
    public final String name;
    public final double zzMs;
    public final double zzMt;
    public final double zzMu;
    public final int count;

    public zza(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt)
    {
      this.name = paramString;
      this.zzMt = paramDouble1;
      this.zzMs = paramDouble2;
      this.zzMu = paramDouble3;
      this.count = paramInt;
    }

    public String toString()
    {
      return zzw.zzy(this).zzg("name", this.name).zzg("minBound", Double.valueOf(this.zzMt)).zzg("maxBound", Double.valueOf(this.zzMs)).zzg("percent", Double.valueOf(this.zzMu)).zzg("count", Integer.valueOf(this.count)).toString();
    }

    public boolean equals(Object other)
    {
      if (!(other instanceof zza))
        return false;
      zza localzza = (zza)other;
      return (zzw.equal(this.name, localzza.name)) && (this.zzMs == localzza.zzMs) && (this.zzMt == localzza.zzMt) && (this.count == localzza.count) && (Double.compare(this.zzMu, localzza.zzMu) == 0);
    }

    public int hashCode()
    {
      return zzw.hashCode(new Object[] { this.name, Double.valueOf(this.zzMs), Double.valueOf(this.zzMt), Double.valueOf(this.zzMu), Integer.valueOf(this.count) });
    }
  }

  public static class zzb
  {
    private final List<String> zzMv = new ArrayList();
    private final List<Double> zzMw = new ArrayList();
    private final List<Double> zzMx = new ArrayList();

    public zzb zza(String paramString, double paramDouble1, double paramDouble2)
    {
      for (int i = 0; i < this.zzMv.size(); i++)
      {
        double d1 = ((Double)this.zzMx.get(i)).doubleValue();
        double d2 = ((Double)this.zzMw.get(i)).doubleValue();
        if ((paramDouble1 < d1) || ((d1 == paramDouble1) && (paramDouble2 < d2)))
          break;
      }
      this.zzMv.add(i, paramString);
      this.zzMx.add(i, Double.valueOf(paramDouble1));
      this.zzMw.add(i, Double.valueOf(paramDouble2));
      return this;
    }

    public zziv zzhA()
    {
      return new zziv(this, null);
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zziv
 * JD-Core Version:    0.6.0
 */