package pl.makalous.sierpien.adapter.adaptee;

public class Adaptee {
    public String withOkapiVer(Long id) {
        return "OKAPI" + id;
    }

    public String withMockVer(Long id) {
        return "MOCK" + id;
    }
}
