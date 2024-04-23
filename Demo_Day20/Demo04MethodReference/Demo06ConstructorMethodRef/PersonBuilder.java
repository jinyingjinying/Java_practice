package Demo04MethodReference.Demo06ConstructorMethodRef;
@FunctionalInterface
public interface PersonBuilder {
    // 根据传递的姓名创建Person对象并返回
    Person buildPerson(String name);
}
