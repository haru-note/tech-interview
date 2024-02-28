package net.harunote.collection.sort.actor;

import java.util.Comparator;

// 수상 연도별로 정렬하기 위해 Comparator 인터페이스를 구현
class PrizeYearComparator implements Comparator<Object> {

    public int compare(Object o1, Object o2) {
        int year1 = ((Actor) o1).prizeYear;
        int year2 = ((Actor) o2).prizeYear;
        return year1 > year2 ? -1 : (year1 == year2 ? 0 : 1);
    }
}
