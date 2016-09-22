package com.wandoujia.p4.app.button.model;

import com.wandoujia.entities.app.ApkObbInfo;
import com.wandoujia.entities.app.ExtensionPack;
import com.wandoujia.entities.app.UseInfo;
import java.io.Serializable;
import java.util.List;

public class AppModelWrapper
  implements Serializable
{
  private boolean ad;
  private int adType;
  private List<ApkObbInfo> apkObbs;
  private String bid;
  private boolean compatible;
  private String detailParam;
  private String displayStatUrl;
  private String downloadMd5;
  private long downloadSize;
  private String downloadUrl;
  private int downloadVersionCode;
  private List<ExtensionPack> extensionPacks;
  private boolean freeTraffic;
  private String icon;
  private List<String> incompatibleDetail;
  private String packageName;
  private String paidStatus;
  private String title;
  private UseInfo useInfo;

  public AppModelWrapper(a parama)
  {
    this.title = parama.a();
    this.icon = parama.b();
    this.downloadSize = parama.c();
    this.packageName = parama.d();
    this.downloadVersionCode = parama.f();
    this.downloadMd5 = parama.g();
    this.downloadUrl = parama.e();
    this.compatible = parama.h();
    this.freeTraffic = parama.k();
    this.extensionPacks = parama.o();
    this.apkObbs = parama.p();
    this.displayStatUrl = parama.q();
    this.paidStatus = parama.j();
    this.incompatibleDetail = parama.i();
    this.bid = parama.r();
    this.detailParam = parama.l();
    this.ad = parama.m();
    this.adType = parama.n();
    this.useInfo = parama.s();
  }

  public a getAppModel()
  {
    return new c(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.button.model.AppModelWrapper
 * JD-Core Version:    0.6.0
 */