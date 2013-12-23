package com.blogspot.mydailyjava.bytebuddy.method.bytecode.assign;

public interface AssignmentExaminer {

    Assignment assign(String superTypeName, Class<?> subType, boolean considerRuntimeType);

    Assignment assign(Class<?> superType, String subTypeName, boolean considerRuntimeType);
}
