package com.unionpay.pboctransaction.sdapdu;

import java.util.ArrayList;

public class NativeSDWriter
{
  public NativeSDWriter()
  {
    b.a();
  }

  private native boolean closeSD();

  private native boolean openSD(ArrayList<String> paramArrayList);

  private native String writeApdu(String paramString);

  public final String a(String paramString)
  {
    return writeApdu(paramString);
  }

  public final boolean a()
  {
    return closeSD();
  }

  public final boolean a(ArrayList<String> paramArrayList)
  {
    return openSD(paramArrayList);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.pboctransaction.sdapdu.NativeSDWriter
 * JD-Core Version:    0.6.0
 */