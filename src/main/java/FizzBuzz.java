public class FizzBuzz {

    public String[] fizzBuzz(int start, int end){

        if(start <= end){
            String[] arr = new String[end - start +1];
            for (int i = 0; i < arr.length && start <= end; i++) {
                if(start % 15 == 0) arr[i] = "FizzBuzz";
                else if(start % 3 == 0) arr[i] = "Fizz";
                else if(start % 5 == 0) arr[i] = "Buzz";
                else arr[i] = String.valueOf(start);

                start++ ;
            }
            return arr;
        }
        return new String[0];
    }
}
