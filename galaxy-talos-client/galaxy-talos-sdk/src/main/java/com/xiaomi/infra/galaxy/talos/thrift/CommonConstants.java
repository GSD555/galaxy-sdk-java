/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
public class CommonConstants {

  /**
   * SDK auto retry according to ErrorCode and backOff reference time,
   * waitTime = 2 ^ retryTime * backOff reference time
   */
  public static final Map<ErrorCode,Long> ERROR_BACKOFF = new HashMap<ErrorCode,Long>();
  static {
    ERROR_BACKOFF.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.TOPIC_NOT_EXIST, 1000L);
    ERROR_BACKOFF.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.QUOTA_NOT_EXIST, 1000L);
    ERROR_BACKOFF.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.OPERATION_FAILED, 2000L);
    ERROR_BACKOFF.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.PARTITION_NOT_SERVING, 2000L);
    ERROR_BACKOFF.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.REST_SERVER_INIT_ERROR, 1000L);
    ERROR_BACKOFF.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.UNEXPECTED_ERROR, 1000L);
    ERROR_BACKOFF.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.MESSAGE_MISSING, 1000L);
    ERROR_BACKOFF.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.MESSAGE_INCOMPLETE, 1000L);
    ERROR_BACKOFF.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.MESSAGE_INDEX_UNDESIRED_ERROR, 1000L);
    ERROR_BACKOFF.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.MESSAGE_INDEX_NOT_EXIST, 1000L);
    ERROR_BACKOFF.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.MESSAGE_OFFSET_OUT_OF_RANGE, 1000L);
    ERROR_BACKOFF.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.INVALID_NAME_ERROR, 1000L);
    ERROR_BACKOFF.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.INTERNAL_SERVER_ERROR, 1000L);
  }

  /**
   * UNSAFE
   */
  public static final Map<ErrorCode,RetryType> ERROR_RETRY_TYPE = new HashMap<ErrorCode,RetryType>();
  static {
    ERROR_RETRY_TYPE.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.TOPIC_NOT_EXIST, com.xiaomi.infra.galaxy.talos.thrift.RetryType.SAFE);
    ERROR_RETRY_TYPE.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.QUOTA_NOT_EXIST, com.xiaomi.infra.galaxy.talos.thrift.RetryType.SAFE);
    ERROR_RETRY_TYPE.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.OPERATION_FAILED, com.xiaomi.infra.galaxy.talos.thrift.RetryType.SAFE);
    ERROR_RETRY_TYPE.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.PARTITION_NOT_SERVING, com.xiaomi.infra.galaxy.talos.thrift.RetryType.SAFE);
    ERROR_RETRY_TYPE.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.REST_SERVER_INIT_ERROR, com.xiaomi.infra.galaxy.talos.thrift.RetryType.SAFE);
    ERROR_RETRY_TYPE.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.UNEXPECTED_ERROR, com.xiaomi.infra.galaxy.talos.thrift.RetryType.UNSAFE);
    ERROR_RETRY_TYPE.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.MESSAGE_MISSING, com.xiaomi.infra.galaxy.talos.thrift.RetryType.UNSAFE);
    ERROR_RETRY_TYPE.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.MESSAGE_INCOMPLETE, com.xiaomi.infra.galaxy.talos.thrift.RetryType.UNSAFE);
    ERROR_RETRY_TYPE.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.MESSAGE_INDEX_UNDESIRED_ERROR, com.xiaomi.infra.galaxy.talos.thrift.RetryType.UNSAFE);
    ERROR_RETRY_TYPE.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.MESSAGE_INDEX_NOT_EXIST, com.xiaomi.infra.galaxy.talos.thrift.RetryType.UNSAFE);
    ERROR_RETRY_TYPE.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.MESSAGE_OFFSET_OUT_OF_RANGE, com.xiaomi.infra.galaxy.talos.thrift.RetryType.UNSAFE);
    ERROR_RETRY_TYPE.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.INVALID_NAME_ERROR, com.xiaomi.infra.galaxy.talos.thrift.RetryType.UNSAFE);
    ERROR_RETRY_TYPE.put(com.xiaomi.infra.galaxy.talos.thrift.ErrorCode.INTERNAL_SERVER_ERROR, com.xiaomi.infra.galaxy.talos.thrift.RetryType.UNSAFE);
  }

}
