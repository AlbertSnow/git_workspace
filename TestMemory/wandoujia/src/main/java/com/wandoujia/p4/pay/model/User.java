package com.wandoujia.p4.pay.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

public class User
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final String TAG = User.class.getSimpleName();
  private String nick;
  private String token;
  private Long uid;
  private String username;

  static
  {
    CREATOR = new User.1();
  }

  public User()
  {
  }

  public User(Parcel paramParcel)
  {
    readFromParcel(paramParcel);
  }

  public User(Long paramLong, String paramString1, String paramString2, String paramString3)
  {
    this.uid = paramLong;
    this.nick = paramString1;
    this.username = paramString2;
    this.token = paramString3;
  }

  private void readFromParcel(Parcel paramParcel)
  {
    this.uid = Long.valueOf(paramParcel.readLong());
    this.nick = paramParcel.readString();
    this.username = paramParcel.readString();
    this.token = paramParcel.readString();
  }

  public int describeContents()
  {
    return 0;
  }

  public User fromJSON(JSONObject paramJSONObject)
  {
    this.uid = Long.valueOf(paramJSONObject.optLong("uid"));
    this.nick = paramJSONObject.optString("nick");
    this.username = paramJSONObject.optString("username");
    this.token = paramJSONObject.optString("token");
    return this;
  }

  public String getNick()
  {
    return this.nick;
  }

  public String getToken()
  {
    return this.token;
  }

  public Long getUid()
  {
    return this.uid;
  }

  public String getUsername()
  {
    return this.username;
  }

  public void setNick(String paramString)
  {
    this.nick = paramString;
  }

  public void setToken(String paramString)
  {
    this.token = paramString;
  }

  public void setUid(long paramLong)
  {
    this.uid = Long.valueOf(paramLong);
  }

  public void setUsername(String paramString)
  {
    this.username = paramString;
  }

  public String toString()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("uid", this.uid);
      localJSONObject.put("nick", this.nick);
      localJSONObject.put("username", this.username);
      localJSONObject.put("token", this.token);
      return localJSONObject.toString();
    }
    catch (JSONException localJSONException)
    {
    }
    return localJSONException.toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(this.uid.longValue());
    paramParcel.writeString(this.nick);
    paramParcel.writeString(this.username);
    paramParcel.writeString(this.token);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.model.User
 * JD-Core Version:    0.6.0
 */