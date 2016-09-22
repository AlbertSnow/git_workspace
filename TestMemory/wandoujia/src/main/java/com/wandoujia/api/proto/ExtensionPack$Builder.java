package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class ExtensionPack$Builder extends Message.Builder<ExtensionPack>
{
  public Integer cpu_type;
  public String description;
  public List<DownloadUrl> download_urls;
  public String dst_path;
  public String filepath;
  public String humansize;
  public Boolean matched;
  public String md5;
  public String pf5;
  public Long size;
  public String src_path;
  public List<String> supported_cpu_types;
  public ExtensionPack.PacketType type;
  public Integer version_code;

  public ExtensionPack$Builder()
  {
  }

  public ExtensionPack$Builder(ExtensionPack paramExtensionPack)
  {
    super(paramExtensionPack);
    if (paramExtensionPack == null)
      return;
    this.filepath = paramExtensionPack.filepath;
    this.humansize = paramExtensionPack.humansize;
    this.pf5 = paramExtensionPack.pf5;
    this.size = paramExtensionPack.size;
    this.version_code = paramExtensionPack.version_code;
    this.src_path = paramExtensionPack.src_path;
    this.dst_path = paramExtensionPack.dst_path;
    this.md5 = paramExtensionPack.md5;
    this.description = paramExtensionPack.description;
    this.matched = paramExtensionPack.matched;
    this.cpu_type = paramExtensionPack.cpu_type;
    this.type = paramExtensionPack.type;
    this.download_urls = ExtensionPack.access$000(paramExtensionPack.download_urls);
    this.supported_cpu_types = ExtensionPack.access$100(paramExtensionPack.supported_cpu_types);
  }

  public final ExtensionPack build()
  {
    return new ExtensionPack(this, null);
  }

  public final Builder cpu_type(Integer paramInteger)
  {
    this.cpu_type = paramInteger;
    return this;
  }

  public final Builder description(String paramString)
  {
    this.description = paramString;
    return this;
  }

  public final Builder download_urls(List<DownloadUrl> paramList)
  {
    this.download_urls = checkForNulls(paramList);
    return this;
  }

  public final Builder dst_path(String paramString)
  {
    this.dst_path = paramString;
    return this;
  }

  public final Builder filepath(String paramString)
  {
    this.filepath = paramString;
    return this;
  }

  public final Builder humansize(String paramString)
  {
    this.humansize = paramString;
    return this;
  }

  public final Builder matched(Boolean paramBoolean)
  {
    this.matched = paramBoolean;
    return this;
  }

  public final Builder md5(String paramString)
  {
    this.md5 = paramString;
    return this;
  }

  public final Builder pf5(String paramString)
  {
    this.pf5 = paramString;
    return this;
  }

  public final Builder size(Long paramLong)
  {
    this.size = paramLong;
    return this;
  }

  public final Builder src_path(String paramString)
  {
    this.src_path = paramString;
    return this;
  }

  public final Builder supported_cpu_types(List<String> paramList)
  {
    this.supported_cpu_types = checkForNulls(paramList);
    return this;
  }

  public final Builder type(ExtensionPack.PacketType paramPacketType)
  {
    this.type = paramPacketType;
    return this;
  }

  public final Builder version_code(Integer paramInteger)
  {
    this.version_code = paramInteger;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ExtensionPack.Builder
 * JD-Core Version:    0.6.0
 */