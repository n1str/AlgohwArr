В этом проекте я реализовал классы Arrays и Collections, которые выполняют бинарный поиск — и на примитивных типах, и на коллекциях с объектами. Разработанные методы позволяют искать элементы в отсортированных массивах и списках, используя как стандартное сравнение (через Comparable), так и настраиваемое с помощью Comparator.

Класс Arrays содержит реализации следующих методов:

    static int binarySearch(byte[] a, byte key) 
    static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key)
    static int binarySearch(char[] a, char key)
    static int binarySearch(char[] a, int fromIndex, int toIndex, char key) 
    static int binarySearch(double[] a, double key)
    static int binarySearch(double[] a, int fromIndex, int toIndex, double key) 
    static int binarySearch(float[] a, float key) 
    static int binarySearch(float[] a, int fromIndex, int toIndex, float key)
    static int binarySearch(int[] a, int key) 
    static int binarySearch(int[] a, int fromIndex, int toIndex, int key) 
    static int binarySearch(long[] a, long key) 
    static int binarySearch(long[] a, int fromIndex, int toIndex, long key) 
    static int binarySearch(short[] a, short key) 
    static int binarySearch(short[] a, int fromIndex, int toIndex, short key) 
    static int binarySearch(T[] a, T key, Comparator c) 
    static int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator c) 

Ваш класс Collections содержит реализации следующих методов:

    static int binarySearch(List> list, T key) 
    static int binarySearch(List list, T key, Comparator c) 
