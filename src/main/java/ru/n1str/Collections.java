package ru.n1str;

import java.util.Comparator;
import java.util.List;

public class Collections {

    public static <T extends Comparable<? super T>> int binarySearch(List<T> list, T searchValue) {
        if (list == null) {
            throw new NullPointerException("Список не может быть null");
        }
        return binarySearch(list, searchValue, Comparator.naturalOrder());
    }

    public static <T> int binarySearch(List<? extends T> list, T searchValue, Comparator<? super T> comparator) {
        if (list == null) {
            throw new NullPointerException("Список не может быть null");
        }
        if (comparator == null) {
            throw new NullPointerException("Компаратор не может быть null");
        }

        int leftBound = 0;
        int rightBound = list.size();

        while (leftBound < rightBound) {
            int middleIndex = (leftBound + rightBound) >>> 1;
            T currentValue = list.get(middleIndex);
            int comparisonResult = comparator.compare(currentValue, searchValue);
            
            if (comparisonResult < 0)
                leftBound = middleIndex + 1;
            else if (comparisonResult > 0)
                rightBound = middleIndex;
            else
                return middleIndex;
        }
        return -(leftBound + 1);
    }
}