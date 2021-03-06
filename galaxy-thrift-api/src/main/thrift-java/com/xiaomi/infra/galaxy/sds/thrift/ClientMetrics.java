/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;

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
/**
 * 客户端用于传输metrics的数据结构
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2019-4-24")
public class ClientMetrics implements libthrift091.TBase<ClientMetrics, ClientMetrics._Fields>, java.io.Serializable, Cloneable, Comparable<ClientMetrics> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("ClientMetrics");

  private static final libthrift091.protocol.TField METRIC_DATA_LIST_FIELD_DESC = new libthrift091.protocol.TField("metricDataList", libthrift091.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ClientMetricsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ClientMetricsTupleSchemeFactory());
  }

  /**
   * 添加/获取客户端metrics数据
   */
  public List<MetricData> metricDataList; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 添加/获取客户端metrics数据
     */
    METRIC_DATA_LIST((short)1, "metricDataList");

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
        case 1: // METRIC_DATA_LIST
          return METRIC_DATA_LIST;
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
  private static final _Fields optionals[] = {_Fields.METRIC_DATA_LIST};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.METRIC_DATA_LIST, new libthrift091.meta_data.FieldMetaData("metricDataList", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, MetricData.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(ClientMetrics.class, metaDataMap);
  }

  public ClientMetrics() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClientMetrics(ClientMetrics other) {
    if (other.isSetMetricDataList()) {
      List<MetricData> __this__metricDataList = new ArrayList<MetricData>(other.metricDataList.size());
      for (MetricData other_element : other.metricDataList) {
        __this__metricDataList.add(new MetricData(other_element));
      }
      this.metricDataList = __this__metricDataList;
    }
  }

  public ClientMetrics deepCopy() {
    return new ClientMetrics(this);
  }

  @Override
  public void clear() {
    this.metricDataList = null;
  }

  public int getMetricDataListSize() {
    return (this.metricDataList == null) ? 0 : this.metricDataList.size();
  }

  public java.util.Iterator<MetricData> getMetricDataListIterator() {
    return (this.metricDataList == null) ? null : this.metricDataList.iterator();
  }

  public void addToMetricDataList(MetricData elem) {
    if (this.metricDataList == null) {
      this.metricDataList = new ArrayList<MetricData>();
    }
    this.metricDataList.add(elem);
  }

  /**
   * 添加/获取客户端metrics数据
   */
  public List<MetricData> getMetricDataList() {
    return this.metricDataList;
  }

  /**
   * 添加/获取客户端metrics数据
   */
  public ClientMetrics setMetricDataList(List<MetricData> metricDataList) {
    this.metricDataList = metricDataList;
    return this;
  }

  public void unsetMetricDataList() {
    this.metricDataList = null;
  }

  /** Returns true if field metricDataList is set (has been assigned a value) and false otherwise */
  public boolean isSetMetricDataList() {
    return this.metricDataList != null;
  }

  public void setMetricDataListIsSet(boolean value) {
    if (!value) {
      this.metricDataList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case METRIC_DATA_LIST:
      if (value == null) {
        unsetMetricDataList();
      } else {
        setMetricDataList((List<MetricData>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case METRIC_DATA_LIST:
      return getMetricDataList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case METRIC_DATA_LIST:
      return isSetMetricDataList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ClientMetrics)
      return this.equals((ClientMetrics)that);
    return false;
  }

  public boolean equals(ClientMetrics that) {
    if (that == null)
      return false;

    boolean this_present_metricDataList = true && this.isSetMetricDataList();
    boolean that_present_metricDataList = true && that.isSetMetricDataList();
    if (this_present_metricDataList || that_present_metricDataList) {
      if (!(this_present_metricDataList && that_present_metricDataList))
        return false;
      if (!this.metricDataList.equals(that.metricDataList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_metricDataList = true && (isSetMetricDataList());
    list.add(present_metricDataList);
    if (present_metricDataList)
      list.add(metricDataList);

    return list.hashCode();
  }

  @Override
  public int compareTo(ClientMetrics other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMetricDataList()).compareTo(other.isSetMetricDataList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetricDataList()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.metricDataList, other.metricDataList);
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
    StringBuilder sb = new StringBuilder("ClientMetrics(");
    boolean first = true;

    if (isSetMetricDataList()) {
      sb.append("metricDataList:");
      if (this.metricDataList == null) {
        sb.append("null");
      } else {
        sb.append(this.metricDataList);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
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

  private static class ClientMetricsStandardSchemeFactory implements SchemeFactory {
    public ClientMetricsStandardScheme getScheme() {
      return new ClientMetricsStandardScheme();
    }
  }

  private static class ClientMetricsStandardScheme extends StandardScheme<ClientMetrics> {

    public void read(libthrift091.protocol.TProtocol iprot, ClientMetrics struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // METRIC_DATA_LIST
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list20 = iprot.readListBegin();
                struct.metricDataList = new ArrayList<MetricData>(_list20.size);
                MetricData _elem21;
                for (int _i22 = 0; _i22 < _list20.size; ++_i22)
                {
                  _elem21 = new MetricData();
                  _elem21.read(iprot);
                  struct.metricDataList.add(_elem21);
                }
                iprot.readListEnd();
              }
              struct.setMetricDataListIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, ClientMetrics struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.metricDataList != null) {
        if (struct.isSetMetricDataList()) {
          oprot.writeFieldBegin(METRIC_DATA_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.metricDataList.size()));
            for (MetricData _iter23 : struct.metricDataList)
            {
              _iter23.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ClientMetricsTupleSchemeFactory implements SchemeFactory {
    public ClientMetricsTupleScheme getScheme() {
      return new ClientMetricsTupleScheme();
    }
  }

  private static class ClientMetricsTupleScheme extends TupleScheme<ClientMetrics> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, ClientMetrics struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMetricDataList()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetMetricDataList()) {
        {
          oprot.writeI32(struct.metricDataList.size());
          for (MetricData _iter24 : struct.metricDataList)
          {
            _iter24.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, ClientMetrics struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TList _list25 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.metricDataList = new ArrayList<MetricData>(_list25.size);
          MetricData _elem26;
          for (int _i27 = 0; _i27 < _list25.size; ++_i27)
          {
            _elem26 = new MetricData();
            _elem26.read(iprot);
            struct.metricDataList.add(_elem26);
          }
        }
        struct.setMetricDataListIsSet(true);
      }
    }
  }

}

