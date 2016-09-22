package com.alipay.ut.device;

import android.support.v4.app.b;
import com.alipay.ut.a.a.a.a.a;
import java.util.Random;

public final class c
{
  private static Random b = new Random();
  private String a = "XwYp8WL8bm6S4wu6yEYmLGy4RRRdJDIhxCBdk3CiNZTwGoj1bScVZEeVp9vBiiIsgwDtqZHP8QLoFM6o6MRYjW8QqyrZBI654mqoUk5SOLDyzordzOU5QhYguEJh54q3K1KqMEXpdEQJJjs1Urqjm2s4jgPfCZ4hMuIjAMRrEQluA7FeoqWMJOwghcLcPVleQ8PLzAcaKidybmwhvNAxIyKRpbZlcDjNCcUvsJYvyzEA9VUIaHkIAJ62lpA3EE3H";

  public final String a(String paramString)
  {
    String str = b.f(this.a, paramString);
    if (str != null)
      return str;
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = 0; i < 24; i++)
      localStringBuffer.append((char)(65 + b.nextInt(25)));
    return localStringBuffer.toString();
  }

  public final String a(byte[] paramArrayOfByte)
  {
    String str = a.a(paramArrayOfByte);
    return b.e(this.a, str);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.ut.device.c
 * JD-Core Version:    0.6.0
 */