package edu.bsu.cs222.project2menu;

import java.util.ArrayList;

public class Format {
    public ArrayList<task> formatTaskList(ArrayList<task> tasklist) {

        int i;
        int j;

        task taskHold;

        int compareyear1;
        int comparemonth1;
        int compareday1;

        int compareyear2;
        int comparemonth2;
        int compareday2;

        //formats the array to be in order
        for (i = 0; i <= tasklist.size() - 1; i++) {
            compareyear1 = tasklist.get(i).getYear();
            comparemonth1 = tasklist.get(i).getMonth();
            compareday1 = tasklist.get(i).getDay();
            for (j = 0; j <= tasklist.size() - 1; j++) {
                compareyear2 = tasklist.get(j).getYear();
                comparemonth2 = tasklist.get(j).getMonth();
                compareday2 = tasklist.get(j).getDay();
                if (compareyear1 < compareyear2) {
                    taskHold = tasklist.get(j);
                    tasklist.set(j, tasklist.get(i));
                    tasklist.set(i, taskHold);
                } else if (comparemonth1 < comparemonth2) {
                    taskHold = tasklist.get(j);
                    tasklist.set(j, tasklist.get(i));
                    tasklist.set(i, taskHold);
                } else if (compareday1 < compareday2) {
                    taskHold = tasklist.get(j);
                    tasklist.set(j, tasklist.get(i));
                    tasklist.set(i, taskHold);
                }
            }
        }
        return tasklist;
    }

}

