
public class bubbleSort
{
    public static void bubbleSort(int[] numbers)
    {
        for (int i = numbers.length; i > 0; i--)
        {
            for (int j = 0; j < i-1; j++)
            {
                if (numbers[j] < numbers[j+1])
                {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }
    
}
