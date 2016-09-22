package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class QueryMetaInfoPackage extends Message
{
  public static final Integer DEFAULT_API_VERSION = Integer.valueOf(0);
  public static final List<String> DEFAULT_CORRECTED_QUERY;
  public static final Integer DEFAULT_EXP_ID = Integer.valueOf(0);
  public static final Boolean DEFAULT_IS_SENSITIVE;
  public static final Integer DEFAULT_LIMIT_SIZE;
  public static final String DEFAULT_MODE = "";
  public static final String DEFAULT_QUERY = "";
  public static final String DEFAULT_SESSION_ID = "";
  public static final Integer DEFAULT_START_INDEX = Integer.valueOf(0);

  @ProtoField(tag=3, type=Message.Datatype.INT32)
  public final Integer api_version;

  @ProtoField(label=Message.Label.REPEATED, tag=10, type=Message.Datatype.STRING)
  public final List<String> corrected_query;

  @ProtoField(tag=4, type=Message.Datatype.INT32)
  public final Integer exp_id;

  @ProtoField(tag=8)
  public final ViewLogPackage from_package;

  @ProtoField(tag=11, type=Message.Datatype.BOOL)
  public final Boolean is_sensitive;

  @ProtoField(tag=6, type=Message.Datatype.INT32)
  public final Integer limit_size;

  @ProtoField(tag=7, type=Message.Datatype.STRING)
  public final String mode;

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.STRING)
  public final String query;

  @ProtoField(tag=9)
  public final ViewLogPackage refer_package;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String session_id;

  @ProtoField(tag=5, type=Message.Datatype.INT32)
  public final Integer start_index;

  static
  {
    DEFAULT_LIMIT_SIZE = Integer.valueOf(0);
    DEFAULT_CORRECTED_QUERY = Collections.emptyList();
    DEFAULT_IS_SENSITIVE = Boolean.valueOf(false);
  }

  private QueryMetaInfoPackage(QueryMetaInfoPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.query = paramBuilder.query;
    this.session_id = paramBuilder.session_id;
    this.api_version = paramBuilder.api_version;
    this.exp_id = paramBuilder.exp_id;
    this.start_index = paramBuilder.start_index;
    this.limit_size = paramBuilder.limit_size;
    this.mode = paramBuilder.mode;
    this.from_package = paramBuilder.from_package;
    this.refer_package = paramBuilder.refer_package;
    this.corrected_query = immutableCopyOf(paramBuilder.corrected_query);
    this.is_sensitive = paramBuilder.is_sensitive;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    QueryMetaInfoPackage localQueryMetaInfoPackage;
    do
    {
      return true;
      if (!(paramObject instanceof QueryMetaInfoPackage))
        return false;
      localQueryMetaInfoPackage = (QueryMetaInfoPackage)paramObject;
    }
    while ((equals(this.query, localQueryMetaInfoPackage.query)) && (equals(this.session_id, localQueryMetaInfoPackage.session_id)) && (equals(this.api_version, localQueryMetaInfoPackage.api_version)) && (equals(this.exp_id, localQueryMetaInfoPackage.exp_id)) && (equals(this.start_index, localQueryMetaInfoPackage.start_index)) && (equals(this.limit_size, localQueryMetaInfoPackage.limit_size)) && (equals(this.mode, localQueryMetaInfoPackage.mode)) && (equals(this.from_package, localQueryMetaInfoPackage.from_package)) && (equals(this.refer_package, localQueryMetaInfoPackage.refer_package)) && (equals(this.corrected_query, localQueryMetaInfoPackage.corrected_query)) && (equals(this.is_sensitive, localQueryMetaInfoPackage.is_sensitive)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int i1;
    label70: int i3;
    label96: int i5;
    label122: int i7;
    label148: int i9;
    label174: int i11;
    label200: int i13;
    label226: int i14;
    if (i == 0)
    {
      if (this.query == null)
        break label300;
      j = this.query.hashCode();
      int k = j * 37;
      if (this.session_id == null)
        break label305;
      m = this.session_id.hashCode();
      int n = 37 * (m + k);
      if (this.api_version == null)
        break label311;
      i1 = this.api_version.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.exp_id == null)
        break label317;
      i3 = this.exp_id.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.start_index == null)
        break label323;
      i5 = this.start_index.hashCode();
      int i6 = 37 * (i5 + i4);
      if (this.limit_size == null)
        break label329;
      i7 = this.limit_size.hashCode();
      int i8 = 37 * (i7 + i6);
      if (this.mode == null)
        break label335;
      i9 = this.mode.hashCode();
      int i10 = 37 * (i9 + i8);
      if (this.from_package == null)
        break label341;
      i11 = this.from_package.hashCode();
      int i12 = 37 * (i11 + i10);
      if (this.refer_package == null)
        break label347;
      i13 = this.refer_package.hashCode();
      i14 = 37 * (i13 + i12);
      if (this.corrected_query == null)
        break label353;
    }
    label300: label305: label311: label317: label323: label329: label335: label341: label347: label353: for (int i15 = this.corrected_query.hashCode(); ; i15 = 1)
    {
      int i16 = 37 * (i15 + i14);
      Boolean localBoolean = this.is_sensitive;
      int i17 = 0;
      if (localBoolean != null)
        i17 = this.is_sensitive.hashCode();
      i = i16 + i17;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
      i1 = 0;
      break label70;
      i3 = 0;
      break label96;
      i5 = 0;
      break label122;
      i7 = 0;
      break label148;
      i9 = 0;
      break label174;
      i11 = 0;
      break label200;
      i13 = 0;
      break label226;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.QueryMetaInfoPackage
 * JD-Core Version:    0.6.0
 */