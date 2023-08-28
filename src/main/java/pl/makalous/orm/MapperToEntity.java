package pl.makalous.orm;

public class MapperToEntity {
    public static TestEntity mapToEntity(ControllerInputDto controllerInputDto) {
        TestEntity testEntity = new TestEntity();
        testEntity.setColumn1(controllerInputDto.getColumn());
        return testEntity;
    }

    public static TestEntity2 mapToEntity2(ControllerInputDto controllerInputDto) {
        TestEntity2 testEntity2 = new TestEntity2();
        testEntity2.setColumn2(controllerInputDto.getColumn());
        return testEntity2;
    }
}
