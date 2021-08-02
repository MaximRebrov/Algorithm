import java.util.Arrays;

public class Bike {

    private String model;
    private int serialNumber;
    static String[] arr;
    static int[] array;

    public static void main(String[] args) {
        ArraySearch arraySearch = new ArraySearch();
        ArraySort arraySort = new ArraySort();

        arr = new String[]{"Bee", "Cheel", "Bals", "Milk", "Nous", "Beep"};

        Bike bmx = new Bike("BMX", 15333);
        Bike salut = new Bike("Salut", 20003);
//        bmx.info();
//        salut.info();
        bmx.model.equals(salut.model);

        for (String o : arr){
            if(o.equals("Milk")) System.out.println(o);
        }
        System.out.println("Array <<arr>> : " + Arrays.toString(arr));
        System.out.println("-------- --------- --------");

        long c = System.nanoTime();
        arraySearch.linearSearch(arr, "Bals");
        System.out.println(System.nanoTime() - c);
        System.out.println("-------- --------- --------");

        Arrays.sort(arr);
        System.out.println("Sort array <<arr>> : " + Arrays.toString(arr));
        long x = System.nanoTime();
        System.out.println("Binary search: " + arraySearch.binarySearch(arr, "Bals"));
        System.out.println(System.nanoTime() - x);
        System.out.println("-------- --------- --------");

        array = arraySort.generationArray(400);
        System.out.println(Arrays.toString(array));
        long w = System.nanoTime();
        arraySort.sort(array);
        System.out.println(System.nanoTime() - w);
        System.out.println(Arrays.toString(array));
        System.out.println("-------- --------- --------");

        array = arraySort.generationArray(400);
        System.out.println(Arrays.toString(array));
        long q = System.nanoTime();
        arraySort.bubbleSort(array);
        System.out.println(System.nanoTime() - q);
        System.out.println(Arrays.toString(array));
        System.out.println("-------- --------- --------");

        array = arraySort.generationArray(400);
        System.out.println(Arrays.toString(array));
        long a = System.nanoTime();
        arraySort.selectionSort(array);
        System.out.println(System.nanoTime() - a);
        System.out.println(Arrays.toString(array));
        System.out.println("-------- --------- --------");

        array = arraySort.generationArray(400);
        System.out.println(Arrays.toString(array));
        long b = System.nanoTime();
        arraySort.insertionSort(array);
        System.out.println(System.nanoTime() - b);
        System.out.println(Arrays.toString(array));
    }

    public Bike (String model, int serialNumber){

        this.serialNumber = serialNumber;
        this.model = model;
    }

    public void info(){

        System.out.println("model: " + model + "\n" + "serial number: " + serialNumber);
    }
}
