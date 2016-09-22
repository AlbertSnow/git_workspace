package com.wandoujia.ripple_framework.download;

import android.content.Context;
import com.wandoujia.api.proto.Action.Builder;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.ripple_framework.R.string;
import com.wandoujia.ripple_framework.action.ActionType;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;

 enum DownloadDataList$DownloadSection
{
  private Model headerModel;

  static
  {
    COMPLETE_MM = new DownloadSection("COMPLETE_MM", 1);
    COMPLETE_APP = new DownloadSection("COMPLETE_APP", 2);
    DownloadSection[] arrayOfDownloadSection = new DownloadSection[3];
    arrayOfDownloadSection[0] = INCOMPLETE;
    arrayOfDownloadSection[1] = COMPLETE_MM;
    arrayOfDownloadSection[2] = COMPLETE_APP;
    $VALUES = arrayOfDownloadSection;
  }

  private Model getHeaderModel()
  {
    if (this.headerModel == null)
      switch (c.c[ordinal()])
      {
      default:
      case 1:
      case 2:
      case 3:
      }
    while (true)
    {
      return this.headerModel;
      this.headerModel = new Model(new Entity.Builder().title(GlobalConfig.getAppContext().getString(R.string.running_tasks)).content_type(ContentTypeEnum.ContentType.DOWNLOAD_INFO).template_type(TemplateTypeEnum.TemplateType.SECTION_TITLE_LITE).build());
      continue;
      this.headerModel = new Model(new Entity.Builder().title(GlobalConfig.getAppContext().getString(R.string.complete_tasks)).content_type(ContentTypeEnum.ContentType.DOWNLOAD_INFO).template_type(TemplateTypeEnum.TemplateType.SECTION_TITLE_LITE).action_positive(new Action.Builder().text(i.k().g().getString(R.string.clear)).type(Integer.valueOf(ActionType.CLEAR_DOWNLOAD_COMPLETE_APP.ordinal())).build()).build());
      continue;
      this.headerModel = new Model(new Entity.Builder().title(GlobalConfig.getAppContext().getString(R.string.cached_tasks)).content_type(ContentTypeEnum.ContentType.DOWNLOAD_INFO).template_type(TemplateTypeEnum.TemplateType.SECTION_TITLE_LITE).action_positive(new Action.Builder().text(i.k().g().getString(R.string.clear)).type(Integer.valueOf(ActionType.CLEAR_DOWNLOAD_COMPLETE_MM.ordinal())).build()).build());
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.DownloadDataList.DownloadSection
 * JD-Core Version:    0.6.0
 */