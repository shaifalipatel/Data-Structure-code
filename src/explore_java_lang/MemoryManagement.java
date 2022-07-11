package explore_java_lang;

public class MemoryManagement {
    public static void main(String[] args){
        Runtime r = Runtime.getRuntime();
        long memory1, memory2;
        Integer sometime[] = new Integer[1000];

        /*Total memory space*/
        System.out.println("Total memory is "+ r.totalMemory());
        memory1 = r.freeMemory();
        System.out.println("Initial Free memory "+ memory1);

        /*Calling garbage collector*/
        r.gc();
        memory1 = r.freeMemory();
        System.out.println(" after garbage collector  Free memory "+ memory1);

    }
}
