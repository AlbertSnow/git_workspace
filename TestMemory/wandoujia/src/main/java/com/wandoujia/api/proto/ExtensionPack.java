package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ExtensionPack extends Message
{
  public static final Integer DEFAULT_CPU_TYPE;
  public static final String DEFAULT_DESCRIPTION = "";
  public static final List<DownloadUrl> DEFAULT_DOWNLOAD_URLS;
  public static final String DEFAULT_DST_PATH = "";
  public static final String DEFAULT_FILEPATH = "";
  public static final String DEFAULT_HUMANSIZE = "";
  public static final Boolean DEFAULT_MATCHED;
  public static final String DEFAULT_MD5 = "";
  public static final String DEFAULT_PF5 = "";
  public static final Long DEFAULT_SIZE = Long.valueOf(0L);
  public static final String DEFAULT_SRC_PATH = "";
  public static final List<String> DEFAULT_SUPPORTED_CPU_TYPES;
  public static final ExtensionPack.PacketType DEFAULT_TYPE;
  public static final Integer DEFAULT_VERSION_CODE = Integer.valueOf(0);

  @ProtoField(tag=13, type=Message.Datatype.INT32)
  public final Integer cpu_type;

  @ProtoField(tag=11, type=Message.Datatype.STRING)
  public final String description;

  @ProtoField(label=Message.Label.REPEATED, tag=15)
  public final List<DownloadUrl> download_urls;

  @ProtoField(tag=9, type=Message.Datatype.STRING)
  public final String dst_path;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String filepath;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String humansize;

  @ProtoField(tag=12, type=Message.Datatype.BOOL)
  public final Boolean matched;

  @ProtoField(tag=10, type=Message.Datatype.STRING)
  public final String md5;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String pf5;

  @ProtoField(tag=4, type=Message.Datatype.INT64)
  public final Long size;

  @ProtoField(tag=8, type=Message.Datatype.STRING)
  public final String src_path;

  @ProtoField(label=Message.Label.REPEATED, tag=16, type=Message.Datatype.STRING)
  public final List<String> supported_cpu_types;

  @ProtoField(tag=14, type=Message.Datatype.ENUM)
  public final ExtensionPack.PacketType type;

  @ProtoField(tag=7, type=Message.Datatype.INT32)
  public final Integer version_code;

  static
  {
    DEFAULT_MATCHED = Boolean.valueOf(false);
    DEFAULT_CPU_TYPE = Integer.valueOf(0);
    DEFAULT_TYPE = ExtensionPack.PacketType.WPK;
    DEFAULT_DOWNLOAD_URLS = Collections.emptyList();
    DEFAULT_SUPPORTED_CPU_TYPES = Collections.emptyList();
  }

  private ExtensionPack(ExtensionPack.Builder paramBuilder)
  {
    super(paramBuilder);
    this.filepath = paramBuilder.filepath;
    this.humansize = paramBuilder.humansize;
    this.pf5 = paramBuilder.pf5;
    this.size = paramBuilder.size;
    this.version_code = paramBuilder.version_code;
    this.src_path = paramBuilder.src_path;
    this.dst_path = paramBuilder.dst_path;
    this.md5 = paramBuilder.md5;
    this.description = paramBuilder.description;
    this.matched = paramBuilder.matched;
    this.cpu_type = paramBuilder.cpu_type;
    this.type = paramBuilder.type;
    this.download_urls = immutableCopyOf(paramBuilder.download_urls);
    this.supported_cpu_types = immutableCopyOf(paramBuilder.supported_cpu_types);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ExtensionPack localExtensionPack;
    do
    {
      return true;
      if (!(paramObject instanceof ExtensionPack))
        return false;
      localExtensionPack = (ExtensionPack)paramObject;
    }
    while ((equals(this.filepath, localExtensionPack.filepath)) && (equals(this.humansize, localExtensionPack.humansize)) && (equals(this.pf5, localExtensionPack.pf5)) && (equals(this.size, localExtensionPack.size)) && (equals(this.version_code, localExtensionPack.version_code)) && (equals(this.src_path, localExtensionPack.src_path)) && (equals(this.dst_path, localExtensionPack.dst_path)) && (equals(this.md5, localExtensionPack.md5)) && (equals(this.description, localExtensionPack.description)) && (equals(this.matched, localExtensionPack.matched)) && (equals(this.cpu_type, localExtensionPack.cpu_type)) && (equals(this.type, localExtensionPack.type)) && (equals(this.download_urls, localExtensionPack.download_urls)) && (equals(this.supported_cpu_types, localExtensionPack.supported_cpu_types)));
    return false;
  }

  public final int hashCode()
  {
    int i = 1;
    int j = this.hashCode;
    int k;
    int n;
    label48: int i2;
    label74: int i4;
    label100: int i6;
    label126: int i8;
    label152: int i10;
    label178: int i12;
    label204: int i14;
    label230: int i16;
    label256: int i18;
    label282: int i21;
    if (j == 0)
    {
      if (this.filepath == null)
        break label382;
      k = this.filepath.hashCode();
      int m = k * 37;
      if (this.humansize == null)
        break label387;
      n = this.humansize.hashCode();
      int i1 = 37 * (n + m);
      if (this.pf5 == null)
        break label393;
      i2 = this.pf5.hashCode();
      int i3 = 37 * (i2 + i1);
      if (this.size == null)
        break label399;
      i4 = this.size.hashCode();
      int i5 = 37 * (i4 + i3);
      if (this.version_code == null)
        break label405;
      i6 = this.version_code.hashCode();
      int i7 = 37 * (i6 + i5);
      if (this.src_path == null)
        break label411;
      i8 = this.src_path.hashCode();
      int i9 = 37 * (i8 + i7);
      if (this.dst_path == null)
        break label417;
      i10 = this.dst_path.hashCode();
      int i11 = 37 * (i10 + i9);
      if (this.md5 == null)
        break label423;
      i12 = this.md5.hashCode();
      int i13 = 37 * (i12 + i11);
      if (this.description == null)
        break label429;
      i14 = this.description.hashCode();
      int i15 = 37 * (i14 + i13);
      if (this.matched == null)
        break label435;
      i16 = this.matched.hashCode();
      int i17 = 37 * (i16 + i15);
      if (this.cpu_type == null)
        break label441;
      i18 = this.cpu_type.hashCode();
      int i19 = 37 * (i18 + i17);
      ExtensionPack.PacketType localPacketType = this.type;
      int i20 = 0;
      if (localPacketType != null)
        i20 = this.type.hashCode();
      i21 = 37 * (i19 + i20);
      if (this.download_urls == null)
        break label447;
    }
    label387: label393: label399: label405: label411: label417: label423: label429: label435: label441: label447: for (int i22 = this.download_urls.hashCode(); ; i22 = i)
    {
      int i23 = 37 * (i22 + i21);
      if (this.supported_cpu_types != null)
        i = this.supported_cpu_types.hashCode();
      j = i23 + i;
      this.hashCode = j;
      return j;
      label382: k = 0;
      break;
      n = 0;
      break label48;
      i2 = 0;
      break label74;
      i4 = 0;
      break label100;
      i6 = 0;
      break label126;
      i8 = 0;
      break label152;
      i10 = 0;
      break label178;
      i12 = 0;
      break label204;
      i14 = 0;
      break label230;
      i16 = 0;
      break label256;
      i18 = 0;
      break label282;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ExtensionPack
 * JD-Core Version:    0.6.0
 */