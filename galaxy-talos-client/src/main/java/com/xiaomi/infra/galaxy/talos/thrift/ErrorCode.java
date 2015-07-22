/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;


import java.util.Map;
import java.util.HashMap;
import libthrift091.TEnum;

public enum ErrorCode implements libthrift091.TEnum {
  TOPIC_EXIST(0),
  TOPIC_NOT_EXIST(1),
  QUOTA_EXIST(2),
  QUOTA_NOT_EXIST(3),
  MESSAGE_INDEX_UNDESIRED_ERROR(4),
  INVALID_TOPIC_NAME(5),
  INVALID_TOPIC_TALOS_RESOURCE_NAME(6),
  HDFS_OPERATION_FAILED(7),
  HBASE_OPERATION_FAILED(8);

  private final int value;

  private ErrorCode(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ErrorCode findByValue(int value) { 
    switch (value) {
      case 0:
        return TOPIC_EXIST;
      case 1:
        return TOPIC_NOT_EXIST;
      case 2:
        return QUOTA_EXIST;
      case 3:
        return QUOTA_NOT_EXIST;
      case 4:
        return MESSAGE_INDEX_UNDESIRED_ERROR;
      case 5:
        return INVALID_TOPIC_NAME;
      case 6:
        return INVALID_TOPIC_TALOS_RESOURCE_NAME;
      case 7:
        return HDFS_OPERATION_FAILED;
      case 8:
        return HBASE_OPERATION_FAILED;
      default:
        return null;
    }
  }
}
