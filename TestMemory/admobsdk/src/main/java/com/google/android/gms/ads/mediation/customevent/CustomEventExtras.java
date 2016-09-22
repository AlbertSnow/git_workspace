package com.google.android.gms.ads.mediation.customevent;

import com.google.ads.mediation.NetworkExtras;
import java.util.HashMap;

@Deprecated
public final class CustomEventExtras
  implements NetworkExtras
{
  private final HashMap<String, Object> zzOv = new HashMap();

  public Object getExtra(String label)
  {
    return this.zzOv.get(label);
  }

  public void setExtra(String label, Object value)
  {
    this.zzOv.put(label, value);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.customevent.CustomEventExtras
 * JD-Core Version:    0.6.0
 */