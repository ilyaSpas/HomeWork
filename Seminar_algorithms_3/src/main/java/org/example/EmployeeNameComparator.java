package org.example;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
    private SortType sortType;

    public EmployeeNameComparator(SortType sortType) {
        this.sortType = sortType;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        int namRes = sortType == SortType.Ascending ? o1.getName().compareTo(o2.getName()) :
                o2.getName().compareTo(o1.getName()) ;
        if (namRes == 0){
            return sortType == SortType.Ascending ? Integer.compare(o1.getAge(), o2.getAge()):
                    Integer.compare(o2.getAge(), o1.getAge());
        }
        return namRes;
    }
}
