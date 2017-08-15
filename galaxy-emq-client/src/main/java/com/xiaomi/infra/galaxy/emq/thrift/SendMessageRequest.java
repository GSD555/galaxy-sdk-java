/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emq.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-8-15")
public class SendMessageRequest implements libthrift091.TBase<SendMessageRequest, SendMessageRequest._Fields>, java.io.Serializable, Cloneable, Comparable<SendMessageRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("SendMessageRequest");

  private static final libthrift091.protocol.TField QUEUE_NAME_FIELD_DESC = new libthrift091.protocol.TField("queueName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField MESSAGE_BODY_FIELD_DESC = new libthrift091.protocol.TField("messageBody", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField DELAY_SECONDS_FIELD_DESC = new libthrift091.protocol.TField("delaySeconds", libthrift091.protocol.TType.I32, (short)3);
  private static final libthrift091.protocol.TField INVISIBILITY_SECONDS_FIELD_DESC = new libthrift091.protocol.TField("invisibilitySeconds", libthrift091.protocol.TType.I32, (short)4);
  private static final libthrift091.protocol.TField MESSAGE_ATTRIBUTES_FIELD_DESC = new libthrift091.protocol.TField("messageAttributes", libthrift091.protocol.TType.MAP, (short)5);
  private static final libthrift091.protocol.TField TOPIC_FIELD_DESC = new libthrift091.protocol.TField("topic", libthrift091.protocol.TType.STRING, (short)6);
  private static final libthrift091.protocol.TField PRIORITY_FIELD_DESC = new libthrift091.protocol.TField("priority", libthrift091.protocol.TType.I32, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SendMessageRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SendMessageRequestTupleSchemeFactory());
  }

  /**
   * Queue name;
   * 
   */
  public String queueName; // required
  /**
   * Message body;
   * 
   */
  public String messageBody; // required
  /**
   * Delay seconds for this message, this will overwrite delaySecond of this
   * queue, default 0s (0s ~ 15min);
   * 
   */
  public int delaySeconds; // optional
  /**
   * Invisibility seconds for this message, this will overwrite
   * invisibilitySeconds of this queue, default 30s (2s ~ 12hour);
   * 
   */
  public int invisibilitySeconds; // optional
  /**
   * User-defined attributes attached to message
   * 
   */
  public Map<String,MessageAttribute> messageAttributes; // optional
  /**
   * Topic of this message
   * 
   */
  public String topic; // optional
  /**
   * The priority of the message, default 8 (1 ~ 16);
   * 
   */
  public int priority; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * Queue name;
     * 
     */
    QUEUE_NAME((short)1, "queueName"),
    /**
     * Message body;
     * 
     */
    MESSAGE_BODY((short)2, "messageBody"),
    /**
     * Delay seconds for this message, this will overwrite delaySecond of this
     * queue, default 0s (0s ~ 15min);
     * 
     */
    DELAY_SECONDS((short)3, "delaySeconds"),
    /**
     * Invisibility seconds for this message, this will overwrite
     * invisibilitySeconds of this queue, default 30s (2s ~ 12hour);
     * 
     */
    INVISIBILITY_SECONDS((short)4, "invisibilitySeconds"),
    /**
     * User-defined attributes attached to message
     * 
     */
    MESSAGE_ATTRIBUTES((short)5, "messageAttributes"),
    /**
     * Topic of this message
     * 
     */
    TOPIC((short)6, "topic"),
    /**
     * The priority of the message, default 8 (1 ~ 16);
     * 
     */
    PRIORITY((short)7, "priority");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // QUEUE_NAME
          return QUEUE_NAME;
        case 2: // MESSAGE_BODY
          return MESSAGE_BODY;
        case 3: // DELAY_SECONDS
          return DELAY_SECONDS;
        case 4: // INVISIBILITY_SECONDS
          return INVISIBILITY_SECONDS;
        case 5: // MESSAGE_ATTRIBUTES
          return MESSAGE_ATTRIBUTES;
        case 6: // TOPIC
          return TOPIC;
        case 7: // PRIORITY
          return PRIORITY;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __DELAYSECONDS_ISSET_ID = 0;
  private static final int __INVISIBILITYSECONDS_ISSET_ID = 1;
  private static final int __PRIORITY_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.DELAY_SECONDS,_Fields.INVISIBILITY_SECONDS,_Fields.MESSAGE_ATTRIBUTES,_Fields.TOPIC,_Fields.PRIORITY};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUEUE_NAME, new libthrift091.meta_data.FieldMetaData("queueName", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.MESSAGE_BODY, new libthrift091.meta_data.FieldMetaData("messageBody", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.DELAY_SECONDS, new libthrift091.meta_data.FieldMetaData("delaySeconds", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.INVISIBILITY_SECONDS, new libthrift091.meta_data.FieldMetaData("invisibilitySeconds", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.MESSAGE_ATTRIBUTES, new libthrift091.meta_data.FieldMetaData("messageAttributes", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.MapMetaData(libthrift091.protocol.TType.MAP, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING), 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, MessageAttribute.class))));
    tmpMap.put(_Fields.TOPIC, new libthrift091.meta_data.FieldMetaData("topic", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.PRIORITY, new libthrift091.meta_data.FieldMetaData("priority", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(SendMessageRequest.class, metaDataMap);
  }

  public SendMessageRequest() {
  }

  public SendMessageRequest(
    String queueName,
    String messageBody)
  {
    this();
    this.queueName = queueName;
    this.messageBody = messageBody;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SendMessageRequest(SendMessageRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetQueueName()) {
      this.queueName = other.queueName;
    }
    if (other.isSetMessageBody()) {
      this.messageBody = other.messageBody;
    }
    this.delaySeconds = other.delaySeconds;
    this.invisibilitySeconds = other.invisibilitySeconds;
    if (other.isSetMessageAttributes()) {
      Map<String,MessageAttribute> __this__messageAttributes = new HashMap<String,MessageAttribute>(other.messageAttributes.size());
      for (Map.Entry<String, MessageAttribute> other_element : other.messageAttributes.entrySet()) {

        String other_element_key = other_element.getKey();
        MessageAttribute other_element_value = other_element.getValue();

        String __this__messageAttributes_copy_key = other_element_key;

        MessageAttribute __this__messageAttributes_copy_value = new MessageAttribute(other_element_value);

        __this__messageAttributes.put(__this__messageAttributes_copy_key, __this__messageAttributes_copy_value);
      }
      this.messageAttributes = __this__messageAttributes;
    }
    if (other.isSetTopic()) {
      this.topic = other.topic;
    }
    this.priority = other.priority;
  }

  public SendMessageRequest deepCopy() {
    return new SendMessageRequest(this);
  }

  @Override
  public void clear() {
    this.queueName = null;
    this.messageBody = null;
    setDelaySecondsIsSet(false);
    this.delaySeconds = 0;
    setInvisibilitySecondsIsSet(false);
    this.invisibilitySeconds = 0;
    this.messageAttributes = null;
    this.topic = null;
    setPriorityIsSet(false);
    this.priority = 0;
  }

  /**
   * Queue name;
   * 
   */
  public String getQueueName() {
    return this.queueName;
  }

  /**
   * Queue name;
   * 
   */
  public SendMessageRequest setQueueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

  public void unsetQueueName() {
    this.queueName = null;
  }

  /** Returns true if field queueName is set (has been assigned a value) and false otherwise */
  public boolean isSetQueueName() {
    return this.queueName != null;
  }

  public void setQueueNameIsSet(boolean value) {
    if (!value) {
      this.queueName = null;
    }
  }

  /**
   * Message body;
   * 
   */
  public String getMessageBody() {
    return this.messageBody;
  }

  /**
   * Message body;
   * 
   */
  public SendMessageRequest setMessageBody(String messageBody) {
    this.messageBody = messageBody;
    return this;
  }

  public void unsetMessageBody() {
    this.messageBody = null;
  }

  /** Returns true if field messageBody is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageBody() {
    return this.messageBody != null;
  }

  public void setMessageBodyIsSet(boolean value) {
    if (!value) {
      this.messageBody = null;
    }
  }

  /**
   * Delay seconds for this message, this will overwrite delaySecond of this
   * queue, default 0s (0s ~ 15min);
   * 
   */
  public int getDelaySeconds() {
    return this.delaySeconds;
  }

  /**
   * Delay seconds for this message, this will overwrite delaySecond of this
   * queue, default 0s (0s ~ 15min);
   * 
   */
  public SendMessageRequest setDelaySeconds(int delaySeconds) {
    this.delaySeconds = delaySeconds;
    setDelaySecondsIsSet(true);
    return this;
  }

  public void unsetDelaySeconds() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DELAYSECONDS_ISSET_ID);
  }

  /** Returns true if field delaySeconds is set (has been assigned a value) and false otherwise */
  public boolean isSetDelaySeconds() {
    return EncodingUtils.testBit(__isset_bitfield, __DELAYSECONDS_ISSET_ID);
  }

  public void setDelaySecondsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DELAYSECONDS_ISSET_ID, value);
  }

  /**
   * Invisibility seconds for this message, this will overwrite
   * invisibilitySeconds of this queue, default 30s (2s ~ 12hour);
   * 
   */
  public int getInvisibilitySeconds() {
    return this.invisibilitySeconds;
  }

  /**
   * Invisibility seconds for this message, this will overwrite
   * invisibilitySeconds of this queue, default 30s (2s ~ 12hour);
   * 
   */
  public SendMessageRequest setInvisibilitySeconds(int invisibilitySeconds) {
    this.invisibilitySeconds = invisibilitySeconds;
    setInvisibilitySecondsIsSet(true);
    return this;
  }

  public void unsetInvisibilitySeconds() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INVISIBILITYSECONDS_ISSET_ID);
  }

  /** Returns true if field invisibilitySeconds is set (has been assigned a value) and false otherwise */
  public boolean isSetInvisibilitySeconds() {
    return EncodingUtils.testBit(__isset_bitfield, __INVISIBILITYSECONDS_ISSET_ID);
  }

  public void setInvisibilitySecondsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INVISIBILITYSECONDS_ISSET_ID, value);
  }

  public int getMessageAttributesSize() {
    return (this.messageAttributes == null) ? 0 : this.messageAttributes.size();
  }

  public void putToMessageAttributes(String key, MessageAttribute val) {
    if (this.messageAttributes == null) {
      this.messageAttributes = new HashMap<String,MessageAttribute>();
    }
    this.messageAttributes.put(key, val);
  }

  /**
   * User-defined attributes attached to message
   * 
   */
  public Map<String,MessageAttribute> getMessageAttributes() {
    return this.messageAttributes;
  }

  /**
   * User-defined attributes attached to message
   * 
   */
  public SendMessageRequest setMessageAttributes(Map<String,MessageAttribute> messageAttributes) {
    this.messageAttributes = messageAttributes;
    return this;
  }

  public void unsetMessageAttributes() {
    this.messageAttributes = null;
  }

  /** Returns true if field messageAttributes is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageAttributes() {
    return this.messageAttributes != null;
  }

  public void setMessageAttributesIsSet(boolean value) {
    if (!value) {
      this.messageAttributes = null;
    }
  }

  /**
   * Topic of this message
   * 
   */
  public String getTopic() {
    return this.topic;
  }

  /**
   * Topic of this message
   * 
   */
  public SendMessageRequest setTopic(String topic) {
    this.topic = topic;
    return this;
  }

  public void unsetTopic() {
    this.topic = null;
  }

  /** Returns true if field topic is set (has been assigned a value) and false otherwise */
  public boolean isSetTopic() {
    return this.topic != null;
  }

  public void setTopicIsSet(boolean value) {
    if (!value) {
      this.topic = null;
    }
  }

  /**
   * The priority of the message, default 8 (1 ~ 16);
   * 
   */
  public int getPriority() {
    return this.priority;
  }

  /**
   * The priority of the message, default 8 (1 ~ 16);
   * 
   */
  public SendMessageRequest setPriority(int priority) {
    this.priority = priority;
    setPriorityIsSet(true);
    return this;
  }

  public void unsetPriority() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PRIORITY_ISSET_ID);
  }

  /** Returns true if field priority is set (has been assigned a value) and false otherwise */
  public boolean isSetPriority() {
    return EncodingUtils.testBit(__isset_bitfield, __PRIORITY_ISSET_ID);
  }

  public void setPriorityIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PRIORITY_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUEUE_NAME:
      if (value == null) {
        unsetQueueName();
      } else {
        setQueueName((String)value);
      }
      break;

    case MESSAGE_BODY:
      if (value == null) {
        unsetMessageBody();
      } else {
        setMessageBody((String)value);
      }
      break;

    case DELAY_SECONDS:
      if (value == null) {
        unsetDelaySeconds();
      } else {
        setDelaySeconds((Integer)value);
      }
      break;

    case INVISIBILITY_SECONDS:
      if (value == null) {
        unsetInvisibilitySeconds();
      } else {
        setInvisibilitySeconds((Integer)value);
      }
      break;

    case MESSAGE_ATTRIBUTES:
      if (value == null) {
        unsetMessageAttributes();
      } else {
        setMessageAttributes((Map<String,MessageAttribute>)value);
      }
      break;

    case TOPIC:
      if (value == null) {
        unsetTopic();
      } else {
        setTopic((String)value);
      }
      break;

    case PRIORITY:
      if (value == null) {
        unsetPriority();
      } else {
        setPriority((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUEUE_NAME:
      return getQueueName();

    case MESSAGE_BODY:
      return getMessageBody();

    case DELAY_SECONDS:
      return Integer.valueOf(getDelaySeconds());

    case INVISIBILITY_SECONDS:
      return Integer.valueOf(getInvisibilitySeconds());

    case MESSAGE_ATTRIBUTES:
      return getMessageAttributes();

    case TOPIC:
      return getTopic();

    case PRIORITY:
      return Integer.valueOf(getPriority());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUEUE_NAME:
      return isSetQueueName();
    case MESSAGE_BODY:
      return isSetMessageBody();
    case DELAY_SECONDS:
      return isSetDelaySeconds();
    case INVISIBILITY_SECONDS:
      return isSetInvisibilitySeconds();
    case MESSAGE_ATTRIBUTES:
      return isSetMessageAttributes();
    case TOPIC:
      return isSetTopic();
    case PRIORITY:
      return isSetPriority();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SendMessageRequest)
      return this.equals((SendMessageRequest)that);
    return false;
  }

  public boolean equals(SendMessageRequest that) {
    if (that == null)
      return false;

    boolean this_present_queueName = true && this.isSetQueueName();
    boolean that_present_queueName = true && that.isSetQueueName();
    if (this_present_queueName || that_present_queueName) {
      if (!(this_present_queueName && that_present_queueName))
        return false;
      if (!this.queueName.equals(that.queueName))
        return false;
    }

    boolean this_present_messageBody = true && this.isSetMessageBody();
    boolean that_present_messageBody = true && that.isSetMessageBody();
    if (this_present_messageBody || that_present_messageBody) {
      if (!(this_present_messageBody && that_present_messageBody))
        return false;
      if (!this.messageBody.equals(that.messageBody))
        return false;
    }

    boolean this_present_delaySeconds = true && this.isSetDelaySeconds();
    boolean that_present_delaySeconds = true && that.isSetDelaySeconds();
    if (this_present_delaySeconds || that_present_delaySeconds) {
      if (!(this_present_delaySeconds && that_present_delaySeconds))
        return false;
      if (this.delaySeconds != that.delaySeconds)
        return false;
    }

    boolean this_present_invisibilitySeconds = true && this.isSetInvisibilitySeconds();
    boolean that_present_invisibilitySeconds = true && that.isSetInvisibilitySeconds();
    if (this_present_invisibilitySeconds || that_present_invisibilitySeconds) {
      if (!(this_present_invisibilitySeconds && that_present_invisibilitySeconds))
        return false;
      if (this.invisibilitySeconds != that.invisibilitySeconds)
        return false;
    }

    boolean this_present_messageAttributes = true && this.isSetMessageAttributes();
    boolean that_present_messageAttributes = true && that.isSetMessageAttributes();
    if (this_present_messageAttributes || that_present_messageAttributes) {
      if (!(this_present_messageAttributes && that_present_messageAttributes))
        return false;
      if (!this.messageAttributes.equals(that.messageAttributes))
        return false;
    }

    boolean this_present_topic = true && this.isSetTopic();
    boolean that_present_topic = true && that.isSetTopic();
    if (this_present_topic || that_present_topic) {
      if (!(this_present_topic && that_present_topic))
        return false;
      if (!this.topic.equals(that.topic))
        return false;
    }

    boolean this_present_priority = true && this.isSetPriority();
    boolean that_present_priority = true && that.isSetPriority();
    if (this_present_priority || that_present_priority) {
      if (!(this_present_priority && that_present_priority))
        return false;
      if (this.priority != that.priority)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_queueName = true && (isSetQueueName());
    list.add(present_queueName);
    if (present_queueName)
      list.add(queueName);

    boolean present_messageBody = true && (isSetMessageBody());
    list.add(present_messageBody);
    if (present_messageBody)
      list.add(messageBody);

    boolean present_delaySeconds = true && (isSetDelaySeconds());
    list.add(present_delaySeconds);
    if (present_delaySeconds)
      list.add(delaySeconds);

    boolean present_invisibilitySeconds = true && (isSetInvisibilitySeconds());
    list.add(present_invisibilitySeconds);
    if (present_invisibilitySeconds)
      list.add(invisibilitySeconds);

    boolean present_messageAttributes = true && (isSetMessageAttributes());
    list.add(present_messageAttributes);
    if (present_messageAttributes)
      list.add(messageAttributes);

    boolean present_topic = true && (isSetTopic());
    list.add(present_topic);
    if (present_topic)
      list.add(topic);

    boolean present_priority = true && (isSetPriority());
    list.add(present_priority);
    if (present_priority)
      list.add(priority);

    return list.hashCode();
  }

  @Override
  public int compareTo(SendMessageRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetQueueName()).compareTo(other.isSetQueueName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueueName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.queueName, other.queueName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageBody()).compareTo(other.isSetMessageBody());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageBody()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.messageBody, other.messageBody);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDelaySeconds()).compareTo(other.isSetDelaySeconds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDelaySeconds()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.delaySeconds, other.delaySeconds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInvisibilitySeconds()).compareTo(other.isSetInvisibilitySeconds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInvisibilitySeconds()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.invisibilitySeconds, other.invisibilitySeconds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageAttributes()).compareTo(other.isSetMessageAttributes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageAttributes()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.messageAttributes, other.messageAttributes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTopic()).compareTo(other.isSetTopic());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopic()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topic, other.topic);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPriority()).compareTo(other.isSetPriority());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPriority()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.priority, other.priority);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SendMessageRequest(");
    boolean first = true;

    sb.append("queueName:");
    if (this.queueName == null) {
      sb.append("null");
    } else {
      sb.append(this.queueName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageBody:");
    if (this.messageBody == null) {
      sb.append("null");
    } else {
      sb.append(this.messageBody);
    }
    first = false;
    if (isSetDelaySeconds()) {
      if (!first) sb.append(", ");
      sb.append("delaySeconds:");
      sb.append(this.delaySeconds);
      first = false;
    }
    if (isSetInvisibilitySeconds()) {
      if (!first) sb.append(", ");
      sb.append("invisibilitySeconds:");
      sb.append(this.invisibilitySeconds);
      first = false;
    }
    if (isSetMessageAttributes()) {
      if (!first) sb.append(", ");
      sb.append("messageAttributes:");
      if (this.messageAttributes == null) {
        sb.append("null");
      } else {
        sb.append(this.messageAttributes);
      }
      first = false;
    }
    if (isSetTopic()) {
      if (!first) sb.append(", ");
      sb.append("topic:");
      if (this.topic == null) {
        sb.append("null");
      } else {
        sb.append(this.topic);
      }
      first = false;
    }
    if (isSetPriority()) {
      if (!first) sb.append(", ");
      sb.append("priority:");
      sb.append(this.priority);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (queueName == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'queueName' was not present! Struct: " + toString());
    }
    if (messageBody == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'messageBody' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SendMessageRequestStandardSchemeFactory implements SchemeFactory {
    public SendMessageRequestStandardScheme getScheme() {
      return new SendMessageRequestStandardScheme();
    }
  }

  private static class SendMessageRequestStandardScheme extends StandardScheme<SendMessageRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, SendMessageRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUEUE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.queueName = iprot.readString();
              struct.setQueueNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MESSAGE_BODY
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.messageBody = iprot.readString();
              struct.setMessageBodyIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DELAY_SECONDS
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.delaySeconds = iprot.readI32();
              struct.setDelaySecondsIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // INVISIBILITY_SECONDS
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.invisibilitySeconds = iprot.readI32();
              struct.setInvisibilitySecondsIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MESSAGE_ATTRIBUTES
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map0 = iprot.readMapBegin();
                struct.messageAttributes = new HashMap<String,MessageAttribute>(2*_map0.size);
                String _key1;
                MessageAttribute _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  _val2 = new MessageAttribute();
                  _val2.read(iprot);
                  struct.messageAttributes.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setMessageAttributesIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TOPIC
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.topic = iprot.readString();
              struct.setTopicIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // PRIORITY
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.priority = iprot.readI32();
              struct.setPriorityIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, SendMessageRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.queueName != null) {
        oprot.writeFieldBegin(QUEUE_NAME_FIELD_DESC);
        oprot.writeString(struct.queueName);
        oprot.writeFieldEnd();
      }
      if (struct.messageBody != null) {
        oprot.writeFieldBegin(MESSAGE_BODY_FIELD_DESC);
        oprot.writeString(struct.messageBody);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDelaySeconds()) {
        oprot.writeFieldBegin(DELAY_SECONDS_FIELD_DESC);
        oprot.writeI32(struct.delaySeconds);
        oprot.writeFieldEnd();
      }
      if (struct.isSetInvisibilitySeconds()) {
        oprot.writeFieldBegin(INVISIBILITY_SECONDS_FIELD_DESC);
        oprot.writeI32(struct.invisibilitySeconds);
        oprot.writeFieldEnd();
      }
      if (struct.messageAttributes != null) {
        if (struct.isSetMessageAttributes()) {
          oprot.writeFieldBegin(MESSAGE_ATTRIBUTES_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, struct.messageAttributes.size()));
            for (Map.Entry<String, MessageAttribute> _iter4 : struct.messageAttributes.entrySet())
            {
              oprot.writeString(_iter4.getKey());
              _iter4.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.topic != null) {
        if (struct.isSetTopic()) {
          oprot.writeFieldBegin(TOPIC_FIELD_DESC);
          oprot.writeString(struct.topic);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetPriority()) {
        oprot.writeFieldBegin(PRIORITY_FIELD_DESC);
        oprot.writeI32(struct.priority);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SendMessageRequestTupleSchemeFactory implements SchemeFactory {
    public SendMessageRequestTupleScheme getScheme() {
      return new SendMessageRequestTupleScheme();
    }
  }

  private static class SendMessageRequestTupleScheme extends TupleScheme<SendMessageRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, SendMessageRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.queueName);
      oprot.writeString(struct.messageBody);
      BitSet optionals = new BitSet();
      if (struct.isSetDelaySeconds()) {
        optionals.set(0);
      }
      if (struct.isSetInvisibilitySeconds()) {
        optionals.set(1);
      }
      if (struct.isSetMessageAttributes()) {
        optionals.set(2);
      }
      if (struct.isSetTopic()) {
        optionals.set(3);
      }
      if (struct.isSetPriority()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetDelaySeconds()) {
        oprot.writeI32(struct.delaySeconds);
      }
      if (struct.isSetInvisibilitySeconds()) {
        oprot.writeI32(struct.invisibilitySeconds);
      }
      if (struct.isSetMessageAttributes()) {
        {
          oprot.writeI32(struct.messageAttributes.size());
          for (Map.Entry<String, MessageAttribute> _iter5 : struct.messageAttributes.entrySet())
          {
            oprot.writeString(_iter5.getKey());
            _iter5.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetTopic()) {
        oprot.writeString(struct.topic);
      }
      if (struct.isSetPriority()) {
        oprot.writeI32(struct.priority);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, SendMessageRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.queueName = iprot.readString();
      struct.setQueueNameIsSet(true);
      struct.messageBody = iprot.readString();
      struct.setMessageBodyIsSet(true);
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.delaySeconds = iprot.readI32();
        struct.setDelaySecondsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.invisibilitySeconds = iprot.readI32();
        struct.setInvisibilitySecondsIsSet(true);
      }
      if (incoming.get(2)) {
        {
          libthrift091.protocol.TMap _map6 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.messageAttributes = new HashMap<String,MessageAttribute>(2*_map6.size);
          String _key7;
          MessageAttribute _val8;
          for (int _i9 = 0; _i9 < _map6.size; ++_i9)
          {
            _key7 = iprot.readString();
            _val8 = new MessageAttribute();
            _val8.read(iprot);
            struct.messageAttributes.put(_key7, _val8);
          }
        }
        struct.setMessageAttributesIsSet(true);
      }
      if (incoming.get(3)) {
        struct.topic = iprot.readString();
        struct.setTopicIsSet(true);
      }
      if (incoming.get(4)) {
        struct.priority = iprot.readI32();
        struct.setPriorityIsSet(true);
      }
    }
  }

}

