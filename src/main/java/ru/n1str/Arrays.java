package ru.n1str;

import java.util.Comparator;

public class Arrays {

    public static int binarySearch(byte[] array, byte searchValue) {
        if (array == null) {
            throw new NullPointerException("Массив не может быть пустым");
        }
        return binarySearch(array, 0, array.length, searchValue);
    }

    public static int binarySearch(byte[] array, int startPosition, int endPosition, byte searchValue) {
        if (array == null) {
            throw new NullPointerException("Массив не может быть пустым");
        }
        validateRange(array.length, startPosition, endPosition);

        while (startPosition < endPosition) {
            int middlePosition = (startPosition + endPosition) >>> 1;
            byte currentValue = array[middlePosition];
            
            if (currentValue < searchValue)
                startPosition = middlePosition + 1;
            else if (currentValue > searchValue)
                endPosition = middlePosition;
            else
                return middlePosition;
        }
        return -(startPosition + 1);
    }

    public static int binarySearch(char[] array, char searchValue) {
        if (array == null) {
            throw new NullPointerException("Массив не может быть пустым");
        }
        return binarySearch(array, 0, array.length, searchValue);
    }

    public static int binarySearch(char[] array, int startPosition, int endPosition, char searchValue) {
        if (array == null) {
            throw new NullPointerException("Массив не может быть пустым");
        }
        validateRange(array.length, startPosition, endPosition);

        while (startPosition < endPosition) {
            int middlePosition = (startPosition + endPosition) >>> 1;
            char currentValue = array[middlePosition];
            
            if (currentValue < searchValue)
                startPosition = middlePosition + 1;
            else if (currentValue > searchValue)
                endPosition = middlePosition;
            else
                return middlePosition;
        }
        return -(startPosition + 1);
    }

    public static int binarySearch(double[] array, double searchValue) {
        if (array == null) {
            throw new NullPointerException("Массив не может быть пустым");
        }
        return binarySearch(array, 0, array.length, searchValue);
    }

    public static int binarySearch(double[] array, int startPosition, int endPosition, double searchValue) {
        if (array == null) {
            throw new NullPointerException("Массив не может быть пустым");
        }
        validateRange(array.length, startPosition, endPosition);

        if (Double.isNaN(searchValue)) {
            for (int currentPosition = startPosition; currentPosition < endPosition; currentPosition++) {
                if (Double.isNaN(array[currentPosition])) {
                    return currentPosition;
                }
            }
            return -(startPosition + 1);
        }

        while (startPosition < endPosition) {
            int middlePosition = (startPosition + endPosition) >>> 1;
            double currentValue = array[middlePosition];
            
            if (currentValue < searchValue)
                startPosition = middlePosition + 1;
            else if (currentValue > searchValue)
                endPosition = middlePosition;
            else
                return middlePosition;
        }
        return -(startPosition + 1);
    }

    public static int binarySearch(float[] array, float searchValue) {
        if (array == null) {
            throw new NullPointerException("Массив не может быть пустым");
        }
        return binarySearch(array, 0, array.length, searchValue);
    }

    public static int binarySearch(float[] array, int startPosition, int endPosition, float searchValue) {
        if (array == null) {
            throw new NullPointerException("Массив не может быть пустым");
        }
        validateRange(array.length, startPosition, endPosition);

        while (startPosition < endPosition) {
            int middlePosition = (startPosition + endPosition) >>> 1;
            float currentValue = array[middlePosition];
            
            if (currentValue < searchValue)
                startPosition = middlePosition + 1;
            else if (currentValue > searchValue)
                endPosition = middlePosition;
            else
                return middlePosition;
        }
        return -(startPosition + 1);
    }

    public static int binarySearch(int[] array, int searchValue) {
        if (array == null) {
            throw new NullPointerException("Массив не может быть пустым");
        }
        return binarySearch(array, 0, array.length, searchValue);
    }

    public static int binarySearch(int[] array, int startPosition, int endPosition, int searchValue) {
        if (array == null) {
            throw new NullPointerException("Массив не может быть пустым");
        }
        validateRange(array.length, startPosition, endPosition);

        while (startPosition < endPosition) {
            int middlePosition = (startPosition + endPosition) >>> 1;
            int currentValue = array[middlePosition];
            
            if (currentValue < searchValue)
                startPosition = middlePosition + 1;
            else if (currentValue > searchValue)
                endPosition = middlePosition;
            else
                return middlePosition;
        }
        return -(startPosition + 1);
    }

    public static int binarySearch(long[] array, long searchValue) {
        if (array == null) {
            throw new NullPointerException("Массив не может быть пустым");
        }
        return binarySearch(array, 0, array.length, searchValue);
    }

    public static int binarySearch(long[] array, int startPosition, int endPosition, long searchValue) {
        if (array == null) {
            throw new NullPointerException("Массив не может быть пустым");
        }
        validateRange(array.length, startPosition, endPosition);

        while (startPosition < endPosition) {
            int middlePosition = (startPosition + endPosition) >>> 1;
            long currentValue = array[middlePosition];
            
            if (currentValue < searchValue)
                startPosition = middlePosition + 1;
            else if (currentValue > searchValue)
                endPosition = middlePosition;
            else
                return middlePosition;
        }
        return -(startPosition + 1);
    }

    public static int binarySearch(short[] array, short searchValue) {
        if (array == null) {
            throw new NullPointerException("Массив не может быть пустым");
        }
        return binarySearch(array, 0, array.length, searchValue);
    }

    public static int binarySearch(short[] array, int startPosition, int endPosition, short searchValue) {
        if (array == null) {
            throw new NullPointerException("Массив не может быть пустым");
        }
        validateRange(array.length, startPosition, endPosition);

        while (startPosition < endPosition) {
            int middlePosition = (startPosition + endPosition) >>> 1;
            short currentValue = array[middlePosition];
            
            if (currentValue < searchValue)
                startPosition = middlePosition + 1;
            else if (currentValue > searchValue)
                endPosition = middlePosition;
            else
                return middlePosition;
        }
        return -(startPosition + 1);
    }

    public static <T> int binarySearch(T[] array, T searchValue, Comparator<? super T> comparator) {
        if (array == null) {
            throw new NullPointerException("Массив не может быть пустым");
        }
        return binarySearch(array, 0, array.length, searchValue, comparator);
    }

    public static <T> int binarySearch(T[] array, int startPosition, int endPosition, T searchValue, Comparator<? super T> comparator) {
        if (array == null) {
            throw new NullPointerException("Массив не может быть пустым");
        }
        validateRange(array.length, startPosition, endPosition);

        while (startPosition < endPosition) {
            int middlePosition = (startPosition + endPosition) >>> 1;
            int comparisonResult = comparator.compare(array[middlePosition], searchValue);
            
            if (comparisonResult < 0)
                startPosition = middlePosition + 1;
            else if (comparisonResult > 0)
                endPosition = middlePosition;
            else
                return middlePosition;
        }
        return -(startPosition + 1);
    }

    private static void validateRange(int arrayLength, int startPosition, int endPosition) {
        if (startPosition > endPosition) {
            throw new IllegalArgumentException(
                "Начальная позиция(" + startPosition + ") больше конечной(" + endPosition + ")");
        }
        if (startPosition < 0) {
            throw new ArrayIndexOutOfBoundsException("Начальная позиция не может быть отрицательной: " + startPosition);
        }
        if (endPosition > arrayLength) {
            throw new ArrayIndexOutOfBoundsException("Конечная позиция не может быть больше длины массива: " + endPosition);
        }
    }
}