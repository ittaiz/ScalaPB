// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.trueaccord.scalapb.scalapb



object ScalapbProto {
  private lazy val ProtoBytes: Array[Byte] =
      com.trueaccord.scalapb.Encoding.fromBase64(scala.collection.Seq(
  """ChVzY2FsYXBiL3NjYWxhcGIucHJvdG8SB3NjYWxhcGIaIGdvb2dsZS9wcm90b2J1Zi9kZXNjcmlwdG9yLnByb3RvIvsCCg5TY
  2FsYVBiT3B0aW9ucxIhCgxwYWNrYWdlX25hbWUYASABKAlSC3BhY2thZ2VOYW1lEiEKDGZsYXRfcGFja2FnZRgCIAEoCFILZmxhd
  FBhY2thZ2USFgoGaW1wb3J0GAMgAygJUgZpbXBvcnQSGgoIcHJlYW1ibGUYBCADKAlSCHByZWFtYmxlEh8KC3NpbmdsZV9maWxlG
  AUgASgIUgpzaW5nbGVGaWxlEjIKFW5vX3ByaW1pdGl2ZV93cmFwcGVycxgHIAEoCFITbm9QcmltaXRpdmVXcmFwcGVycxItChJwc
  mltaXRpdmVfd3JhcHBlcnMYBiABKAhSEXByaW1pdGl2ZVdyYXBwZXJzEicKD2NvbGxlY3Rpb25fdHlwZRgIIAEoCVIOY29sbGVjd
  GlvblR5cGUSQgoddGVzdF9vbmx5X25vX2phdmFfY29udmVyc2lvbnMYoY0GIAEoCFIZdGVzdE9ubHlOb0phdmFDb252ZXJzaW9uc
  yJXCg5NZXNzYWdlT3B0aW9ucxIYCgdleHRlbmRzGAEgAygJUgdleHRlbmRzEisKEWNvbXBhbmlvbl9leHRlbmRzGAIgAygJUhBjb
  21wYW5pb25FeHRlbmRzIqQBCgxGaWVsZE9wdGlvbnMSEgoEdHlwZRgBIAEoCVIEdHlwZRIdCgpzY2FsYV9uYW1lGAIgASgJUglzY
  2FsYU5hbWUSJwoPY29sbGVjdGlvbl90eXBlGAMgASgJUg5jb2xsZWN0aW9uVHlwZRIZCghrZXlfdHlwZRgEIAEoCVIHa2V5VHlwZ
  RIdCgp2YWx1ZV90eXBlGAUgASgJUgl2YWx1ZVR5cGUiVAoLRW51bU9wdGlvbnMSGAoHZXh0ZW5kcxgBIAMoCVIHZXh0ZW5kcxIrC
  hFjb21wYW5pb25fZXh0ZW5kcxgCIAMoCVIQY29tcGFuaW9uRXh0ZW5kcyIsChBFbnVtVmFsdWVPcHRpb25zEhgKB2V4dGVuZHMYA
  SADKAlSB2V4dGVuZHM6UAoHb3B0aW9ucxIcLmdvb2dsZS5wcm90b2J1Zi5GaWxlT3B0aW9ucxj8ByABKAsyFy5zY2FsYXBiLlNjY
  WxhUGJPcHRpb25zUgdvcHRpb25zOlMKB21lc3NhZ2USHy5nb29nbGUucHJvdG9idWYuTWVzc2FnZU9wdGlvbnMY/AcgASgLMhcuc
  2NhbGFwYi5NZXNzYWdlT3B0aW9uc1IHbWVzc2FnZTpLCgVmaWVsZBIdLmdvb2dsZS5wcm90b2J1Zi5GaWVsZE9wdGlvbnMY/AcgA
  SgLMhUuc2NhbGFwYi5GaWVsZE9wdGlvbnNSBWZpZWxkOlYKDGVudW1fb3B0aW9ucxIcLmdvb2dsZS5wcm90b2J1Zi5FbnVtT3B0a
  W9ucxj8ByABKAsyFC5zY2FsYXBiLkVudW1PcHRpb25zUgtlbnVtT3B0aW9uczpcCgplbnVtX3ZhbHVlEiEuZ29vZ2xlLnByb3RvY
  nVmLkVudW1WYWx1ZU9wdGlvbnMY/AcgASgLMhkuc2NhbGFwYi5FbnVtVmFsdWVPcHRpb25zUgllbnVtVmFsdWVCGAoWY29tLnRyd
  WVhY2NvcmQuc2NhbGFwYg=="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, Seq(
      com.google.protobuf.descriptor.DescriptorProtoCompanion.scalaDescriptor
    ))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
      com.google.protobuf.descriptor.DescriptorProtoCompanion.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
  val options: _root_.com.trueaccord.scalapb.GeneratedExtension[com.google.protobuf.descriptor.FileOptions, scala.Option[com.trueaccord.scalapb.scalapb.ScalaPbOptions]] =
    _root_.com.trueaccord.scalapb.GeneratedExtension.forOptionalUnknownField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.com.trueaccord.scalapb.GeneratedExtension.readMessageFromByteString(com.trueaccord.scalapb.scalapb.ScalaPbOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val message: _root_.com.trueaccord.scalapb.GeneratedExtension[com.google.protobuf.descriptor.MessageOptions, scala.Option[com.trueaccord.scalapb.scalapb.MessageOptions]] =
    _root_.com.trueaccord.scalapb.GeneratedExtension.forOptionalUnknownField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.com.trueaccord.scalapb.GeneratedExtension.readMessageFromByteString(com.trueaccord.scalapb.scalapb.MessageOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val field: _root_.com.trueaccord.scalapb.GeneratedExtension[com.google.protobuf.descriptor.FieldOptions, scala.Option[com.trueaccord.scalapb.scalapb.FieldOptions]] =
    _root_.com.trueaccord.scalapb.GeneratedExtension.forOptionalUnknownField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.com.trueaccord.scalapb.GeneratedExtension.readMessageFromByteString(com.trueaccord.scalapb.scalapb.FieldOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val enumOptions: _root_.com.trueaccord.scalapb.GeneratedExtension[com.google.protobuf.descriptor.EnumOptions, scala.Option[com.trueaccord.scalapb.scalapb.EnumOptions]] =
    _root_.com.trueaccord.scalapb.GeneratedExtension.forOptionalUnknownField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.com.trueaccord.scalapb.GeneratedExtension.readMessageFromByteString(com.trueaccord.scalapb.scalapb.EnumOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val enumValue: _root_.com.trueaccord.scalapb.GeneratedExtension[com.google.protobuf.descriptor.EnumValueOptions, scala.Option[com.trueaccord.scalapb.scalapb.EnumValueOptions]] =
    _root_.com.trueaccord.scalapb.GeneratedExtension.forOptionalUnknownField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.com.trueaccord.scalapb.GeneratedExtension.readMessageFromByteString(com.trueaccord.scalapb.scalapb.EnumValueOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
}