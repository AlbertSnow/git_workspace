package com.google.android.gms.ads.internal.formats;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.zzhb;
import java.util.List;

@zzhb
public class zza
{
  private static final int zzxI = Color.rgb(12, 174, 206);
  private static final int zzxJ = Color.rgb(204, 204, 204);
  static final int zzxK = zzxJ;
  static final int zzxL = zzxI;
  private final String zzxM;
  private final List<Drawable> zzxN;
  private final int zzxO;
  private final int mTextColor;
  private final int zzxP;
  private final int zzxQ;

  public zza(String paramString, List<Drawable> paramList, Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, int paramInt)
  {
    this.zzxM = paramString;
    this.zzxN = paramList;
    this.zzxO = (paramInteger1 != null ? paramInteger1.intValue() : zzxK);
    this.mTextColor = (paramInteger2 != null ? paramInteger2.intValue() : zzxL);
    this.zzxP = (paramInteger3 != null ? paramInteger3.intValue() : 12);
    this.zzxQ = paramInt;
  }

  public String getText()
  {
    return this.zzxM;
  }

  public List<Drawable> zzdG()
  {
    return this.zzxN;
  }

  public int getBackgroundColor()
  {
    return this.zzxO;
  }

  public int getTextColor()
  {
    return this.mTextColor;
  }

  public int getTextSize()
  {
    return this.zzxP;
  }

  public int zzdH()
  {
    return this.zzxQ;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.zza
 * JD-Core Version:    0.6.0
 */