package net.harunote.algorithm.sort.actor;

class Actor implements Comparable<Object> {

    String name;
    String title;
    int prizeYear;

    // Constructor
    public Actor(String name, String title, int birthYear) {
        this.prizeYear = birthYear;
        this.name = name;
        this.title = title;
    }

    @Override
    public String toString() {
        return "수상 배우 목록 {" + "배우 = " + name + ", 영화 제목 [" + title + "]" + ", 청룡영화제 남우주연상 수상 연도="
            + prizeYear + '}';
    }

    // 정렬될 때 배우 이름 기준으로 오름차순 정렬한다.
    @Override
    public int compareTo(Object o) {
        return name.compareTo(((Actor) o).name);
    }
}
