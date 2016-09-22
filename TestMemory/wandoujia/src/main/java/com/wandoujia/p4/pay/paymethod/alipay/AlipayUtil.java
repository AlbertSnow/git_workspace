package com.wandoujia.p4.pay.paymethod.alipay;

import com.wandoujia.p4.pay.utils.Rsa;

public class AlipayUtil
{
  public static String getOrderInfo(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    String str1 = "partner=\"2088801080635704\"" + "&";
    String str2 = str1 + "seller_id=\"2088801080635704\"";
    String str3 = str2 + "&";
    String str4 = str3 + "out_trade_no=\"" + paramString4 + "\"";
    String str5 = str4 + "&";
    String str6 = str5 + "subject=\"" + paramString1 + "\"";
    String str7 = str6 + "&";
    String str8 = str7 + "body=\"" + paramString2 + "\"";
    String str9 = str8 + "&";
    String str10 = str9 + "total_fee=\"" + paramString3 + "\"";
    String str11 = str10 + "&";
    String str12 = str11 + "notify_url=\"" + paramString5 + "\"";
    String str13 = str12 + "&service=\"mobile.securitypay.pay\"";
    String str14 = str13 + "&payment_type=\"1\"";
    String str15 = str14 + "&_input_charset=\"utf-8\"";
    String str16 = str15 + "&it_b_pay=\"30m\"";
    return str16 + "&show_url=\"m.alipay.com\"";
  }

  public static String getSignType()
  {
    return "sign_type=\"RSA\"";
  }

  public static String sign(String paramString1, String paramString2)
  {
    return Rsa.sign(paramString2, "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAL8sIDUqP+i2uFv9e3/ckR2NdgZ4DncX4KMTBfZbUU6Xzi9uGKiOF420D5lBPGnJos7vLbJjL3Tw/1cvxfORWpTbOhvT3qedxZAexlnW+oXP9/XWI6D6QSelwmSND/vu8MbvPni7Nsi5YVrQv2VUDt0SO3syPa1Ommn0vQtMKbR7AgMBAAECgYB0Vtsm35ZS/deGC+W7czRQwsTfvPI4oaxQMYSAXyRE6vdMP/j7orVMxBZ2EpA8ZLwSqNWraNb5mKwbl/QkfQGc5c1gv7fDojUP2kHlKunipiIYAmFEnI3Ko4gNRAlgjkOx+gPZKpGfqF4jXd9A7B+AZt5OiGXLRtiv2Cssmlf9oQJBAONQObaHe5eaa3i6XLDlrIw3qKkTIjXGhPm8V4+RXeUgEnKnAjm8gcAjTtW4dNQln5z3NUm4zcbKN9hLWasRCrECQQDXTEx+CuBLqqOO/6Y1KkvvmknfrYscqFegxGAJJ0RQBa8dtDsPDtNTm3ER3hd411+NXv3qzVFK819j2/o3RCTrAkA4+gPtT5pYDrm/gh73rCoK32ykLIqXphHwsxfTgaFibB6TpG73X9u5+F+rTFfkUSXn50LxHqRdnpRO39wy98uRAkEAnhgM41EhOu7mg47+gXO5pwvoyzMoP7buAcOxsYcABrLl0C4UYA5G59HwyWoIWlfsdmcWlWCHHT5xAWb66bJEWQJBAKHXcBaCsDnH/4EgflPHJQugAD58DL6wkHfwPCwCWD8WBVWwQU7opW1735rKoGKUWMXeenx0PrFluchbBpmUwvQ=");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.paymethod.alipay.AlipayUtil
 * JD-Core Version:    0.6.0
 */