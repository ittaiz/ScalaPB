// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.wrappers

/** Wrapper message for `uint64`.
  *
  * The JSON representation for `UInt64Value` is JSON string.
  *
  * @param value
  *   The uint64 value.
  */
@SerialVersionUID(0L)
final class UInt64Value(
    val value: _root_.scala.Long = 0L,
    val unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[UInt64Value] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = value
        if (__value != 0L) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt64Size(1, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = value
        if (__v != 0L) {
          _output__.writeUInt64(1, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withValue(__v: _root_.scala.Long): UInt64Value = copy(value = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = value
          if (__t != 0L) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PLong(value)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    override def toString(): _root_.scala.Predef.String = s"UInt64Value(${value}, ${unknownFields})"
    def copy(
      value: _root_.scala.Long = value,
      unknownFields: _root_.scalapb.UnknownFieldSet = unknownFields
    ): UInt64Value = new UInt64Value(
      value,
      unknownFields
    )
    override def equals(__that: _root_.scala.Any): _root_.scala.Boolean = __that match {
      case __that: UInt64Value =>
        this.value == __that.value &&
        this.unknownFields == __that.unknownFields
      case _ => false
    }
    override def hashCode(): _root_.scala.Int = {
      var __hash: _root_.scala.Int = (19 * 41) + com.google.protobuf.wrappers.UInt64Value.scalaDescriptor.hashCode()
      __hash = (37 * __hash) + _root_.scalapb.internal.Hashing.hashLong(value)
      __hash = (37 * __hash) + unknownFields.hashCode()
      __hash
    }
    def companion = com.google.protobuf.wrappers.UInt64Value
}

object UInt64Value extends scalapb.GeneratedMessageCompanion[com.google.protobuf.wrappers.UInt64Value] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.wrappers.UInt64Value] = this
  def merge(`_message__`: com.google.protobuf.wrappers.UInt64Value, `_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.wrappers.UInt64Value = {
    var __value = `_message__`.value
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 8 =>
          __value = _input__.readUInt64()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    com.google.protobuf.wrappers.UInt64Value(
        value = __value,
        unknownFields = if (_unknownFields__ == null) _message__.unknownFields else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.wrappers.UInt64Value] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.wrappers.UInt64Value(
        value = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Long]).getOrElse(0L)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = WrappersProto.javaDescriptor.getMessageTypes.get(3)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = WrappersProto.scalaDescriptor.messages(3)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.wrappers.UInt64Value(
    value = 0L
  )
  implicit class UInt64ValueLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.wrappers.UInt64Value]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.wrappers.UInt64Value](_l) {
    def value: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Long] = field(_.value)((c_, f_) => c_.copy(value = f_))
  }
  final val VALUE_FIELD_NUMBER = 1
  def of(
    value: _root_.scala.Long
  ): _root_.com.google.protobuf.wrappers.UInt64Value = new _root_.com.google.protobuf.wrappers.UInt64Value(
    value
  )
  def apply(
    value: _root_.scala.Long = 0L,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
  ): _root_.com.google.protobuf.wrappers.UInt64Value = new _root_.com.google.protobuf.wrappers.UInt64Value(
    value,
    unknownFields
  )
  def unapply(__value: _root_.com.google.protobuf.wrappers.UInt64Value): Option[(
    _root_.scala.Long
  )] = Some((
    __value.value
  ))
}
