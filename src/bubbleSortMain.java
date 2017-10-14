
public class bubbleSortMain
{
    public static void main(String[] args)
    {
        StopWatch timer = new StopWatch();
        int[] numbers = StopWatch.randomIntArray(60000, 100);
        timer.start();
        bubbleSort.bubbleSort(numbers);
        timer.stop();
        System.out.println(timer.getElapsedTime());
        timer.reset();
    }
    
}
