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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2019-5-20")
public class GetWorkerIdResponse implements libthrift091.TBase<GetWorkerIdResponse, GetWorkerIdResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetWorkerIdResponse> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("GetWorkerIdResponse");

  private static final libthrift091.protocol.TField WORKER_ID_FIELD_DESC = new libthrift091.protocol.TField("workerId", libthrift091.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetWorkerIdResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetWorkerIdResponseTupleSchemeFactory());
  }

  /**
   * The WorkerId
   * 
   */
  public String workerId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The WorkerId
     * 
     */
    WORKER_ID((short)1, "workerId");

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
        case 1: // WORKER_ID
          return WORKER_ID;
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
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.WORKER_ID, new libthrift091.meta_data.FieldMetaData("workerId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(GetWorkerIdResponse.class, metaDataMap);
  }

  public GetWorkerIdResponse() {
  }

  public GetWorkerIdResponse(
    String workerId)
  {
    this();
    this.workerId = workerId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetWorkerIdResponse(GetWorkerIdResponse other) {
    if (other.isSetWorkerId()) {
      this.workerId = other.workerId;
    }
  }

  public GetWorkerIdResponse deepCopy() {
    return new GetWorkerIdResponse(this);
  }

  @Override
  public void clear() {
    this.workerId = null;
  }

  /**
   * The WorkerId
   * 
   */
  public String getWorkerId() {
    return this.workerId;
  }

  /**
   * The WorkerId
   * 
   */
  public GetWorkerIdResponse setWorkerId(String workerId) {
    this.workerId = workerId;
    return this;
  }

  public void unsetWorkerId() {
    this.workerId = null;
  }

  /** Returns true if field workerId is set (has been assigned a value) and false otherwise */
  public boolean isSetWorkerId() {
    return this.workerId != null;
  }

  public void setWorkerIdIsSet(boolean value) {
    if (!value) {
      this.workerId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case WORKER_ID:
      if (value == null) {
        unsetWorkerId();
      } else {
        setWorkerId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case WORKER_ID:
      return getWorkerId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case WORKER_ID:
      return isSetWorkerId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetWorkerIdResponse)
      return this.equals((GetWorkerIdResponse)that);
    return false;
  }

  public boolean equals(GetWorkerIdResponse that) {
    if (that == null)
      return false;

    boolean this_present_workerId = true && this.isSetWorkerId();
    boolean that_present_workerId = true && that.isSetWorkerId();
    if (this_present_workerId || that_present_workerId) {
      if (!(this_present_workerId && that_present_workerId))
        return false;
      if (!this.workerId.equals(that.workerId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_workerId = true && (isSetWorkerId());
    list.add(present_workerId);
    if (present_workerId)
      list.add(workerId);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetWorkerIdResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetWorkerId()).compareTo(other.isSetWorkerId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWorkerId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.workerId, other.workerId);
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
    StringBuilder sb = new StringBuilder("GetWorkerIdResponse(");
    boolean first = true;

    sb.append("workerId:");
    if (this.workerId == null) {
      sb.append("null");
    } else {
      sb.append(this.workerId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (workerId == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'workerId' was not present! Struct: " + toString());
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
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetWorkerIdResponseStandardSchemeFactory implements SchemeFactory {
    public GetWorkerIdResponseStandardScheme getScheme() {
      return new GetWorkerIdResponseStandardScheme();
    }
  }

  private static class GetWorkerIdResponseStandardScheme extends StandardScheme<GetWorkerIdResponse> {

    public void read(libthrift091.protocol.TProtocol iprot, GetWorkerIdResponse struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // WORKER_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.workerId = iprot.readString();
              struct.setWorkerIdIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, GetWorkerIdResponse struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.workerId != null) {
        oprot.writeFieldBegin(WORKER_ID_FIELD_DESC);
        oprot.writeString(struct.workerId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetWorkerIdResponseTupleSchemeFactory implements SchemeFactory {
    public GetWorkerIdResponseTupleScheme getScheme() {
      return new GetWorkerIdResponseTupleScheme();
    }
  }

  private static class GetWorkerIdResponseTupleScheme extends TupleScheme<GetWorkerIdResponse> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, GetWorkerIdResponse struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.workerId);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, GetWorkerIdResponse struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.workerId = iprot.readString();
      struct.setWorkerIdIsSet(true);
    }
  }

}

