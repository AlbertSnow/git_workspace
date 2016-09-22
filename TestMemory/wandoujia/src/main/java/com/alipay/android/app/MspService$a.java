package com.alipay.android.app;

import com.alipay.android.app.pay.IAlixPay.Stub;
import com.alipay.android.app.pay.IAlixPayCallback;
import java.lang.ref.WeakReference;

public class MspService$a extends IAlixPay.Stub
{
  private WeakReference a;

  public MspService$a(MspService paramMspService)
  {
    this.a = new WeakReference(paramMspService);
  }

  public boolean isAuthenticated()
  {
    return MspService.a((MspService)this.a.get());
  }

  public String pay(String paramString)
  {
    return MspService.a((MspService)this.a.get(), paramString);
  }

  public String payWithURL(String paramString)
  {
    return MspService.b((MspService)this.a.get(), paramString);
  }

  public void registerCallback(IAlixPayCallback paramIAlixPayCallback)
  {
    this.a.get();
    MspService.a(paramIAlixPayCallback);
  }

  public void unregisterCallback(IAlixPayCallback paramIAlixPayCallback)
  {
    this.a.get();
    MspService.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.MspService.a
 * JD-Core Version:    0.6.0
 */