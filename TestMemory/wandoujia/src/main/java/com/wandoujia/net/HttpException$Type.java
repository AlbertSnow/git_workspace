package com.wandoujia.net;

public enum HttpException$Type
{
  static
  {
    CONNECT_ERROR = new Type("CONNECT_ERROR", 2);
    SOCKET_IO_ERROR = new Type("SOCKET_IO_ERROR", 3);
    DOWNLOAD_IO_ERROR = new Type("DOWNLOAD_IO_ERROR", 4);
    NOT_HTTP = new Type("NOT_HTTP", 5);
    CHUNK_ERROR = new Type("CHUNK_ERROR", 6);
    UNSUPPORT_TRANSFER_ENCODING = new Type("UNSUPPORT_TRANSFER_ENCODING", 7);
    REQUEST_BODY_ERROR = new Type("REQUEST_BODY_ERROR", 8);
    HTTPS_ERROR = new Type("HTTPS_ERROR", 9);
    BAD_RESPONSE = new Type("BAD_RESPONSE", 10);
    CONNECTION_TIMEOUT = new Type("CONNECTION_TIMEOUT", 11);
    TRANSPORT_TIMEOUT = new Type("TRANSPORT_TIMEOUT", 12);
    Type[] arrayOfType = new Type[13];
    arrayOfType[0] = INVALID_URL;
    arrayOfType[1] = RESOLVE_IP_FAILED;
    arrayOfType[2] = CONNECT_ERROR;
    arrayOfType[3] = SOCKET_IO_ERROR;
    arrayOfType[4] = DOWNLOAD_IO_ERROR;
    arrayOfType[5] = NOT_HTTP;
    arrayOfType[6] = CHUNK_ERROR;
    arrayOfType[7] = UNSUPPORT_TRANSFER_ENCODING;
    arrayOfType[8] = REQUEST_BODY_ERROR;
    arrayOfType[9] = HTTPS_ERROR;
    arrayOfType[10] = BAD_RESPONSE;
    arrayOfType[11] = CONNECTION_TIMEOUT;
    arrayOfType[12] = TRANSPORT_TIMEOUT;
    $VALUES = arrayOfType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.HttpException.Type
 * JD-Core Version:    0.6.0
 */