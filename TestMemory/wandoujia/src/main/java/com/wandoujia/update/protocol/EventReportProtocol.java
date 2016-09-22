package com.wandoujia.update.protocol;

import com.wandoujia.gson.a.a;
import java.io.Serializable;

public class EventReportProtocol
  implements Serializable
{
  public static final String URL = "https://upgrade.wandoujia.com/event";

  @a(a="app_name")
  public String appName;

  @a(a="download_time_ms")
  public long downloadTimeMS = -1L;

  @a(a="ekey")
  public String ekey;

  @a(a="error_info")
  public String errorInfo;

  @a(a="error_type")
  public String errorType;

  @a(a="event_datetime")
  public long eventDateTime;

  @a(a="event_status")
  public EventReportProtocol.EventStatus eventStatus;

  @a(a="event_type")
  public EventReportProtocol.EventType eventType;

  @a(a="protocol_version")
  public String protocolVersion = "1.0.0.1";

  @a(a="rom")
  public String rom;

  @a(a="rom_version")
  public String romVersion;

  @a(a="source")
  public String source;

  @a(a="udid")
  public String udid;

  @a(a="version_code")
  public int versionCode;

  @a(a="version_name")
  public String versionName;
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.protocol.EventReportProtocol
 * JD-Core Version:    0.6.0
 */