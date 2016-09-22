package com.google.ads.mediation;

import android.location.Location;
import com.google.ads.AdRequest.Gender;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

@Deprecated
public class MediationAdRequest
{
  private final Date zzbf;
  private final AdRequest.Gender zzbg;
  private final Set<String> zzbh;
  private final boolean zzbi;
  private final Location zzbj;

  public MediationAdRequest(Date birthday, AdRequest.Gender gender, Set<String> keywords, boolean isTesting, Location location)
  {
    this.zzbf = birthday;
    this.zzbg = gender;
    this.zzbh = keywords;
    this.zzbi = isTesting;
    this.zzbj = location;
  }

  public Integer getAgeInYears()
  {
    if (this.zzbf != null)
    {
      Calendar localCalendar1 = Calendar.getInstance();
      Calendar localCalendar2 = Calendar.getInstance();
      localCalendar1.setTime(this.zzbf);
      Integer localInteger1 = Integer.valueOf(localCalendar2.get(1) - localCalendar1.get(1));
      Integer localInteger2;
      if ((localCalendar2.get(2) < localCalendar1.get(2)) || ((localCalendar2.get(2) == localCalendar1.get(2)) && (localCalendar2.get(5) < localCalendar1.get(5))))
      {
        localInteger2 = localInteger1;
        Integer localInteger3 = localInteger1 = Integer.valueOf(localInteger1.intValue() - 1);
      }
      return localInteger1;
    }
    return null;
  }

  public Date getBirthday()
  {
    return this.zzbf;
  }

  public AdRequest.Gender getGender()
  {
    return this.zzbg;
  }

  public Set<String> getKeywords()
  {
    return this.zzbh;
  }

  public Location getLocation()
  {
    return this.zzbj;
  }

  public boolean isTesting()
  {
    return this.zzbi;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.ads.mediation.MediationAdRequest
 * JD-Core Version:    0.6.0
 */