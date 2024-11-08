public class SelectionMadness {

    // no instance variables //
    
    public SelectionMadness() { }
  
    /* Returns 1 of 5 randomly generated fortunes as a string;
       you should write your own 5 fortunes! (see output for examples)
     */
    public String fortune() {
        int num = (int) (Math.random() * 5);
        if (num == 0){
            return "Go buy a lottery ticket";
        }
        else if (num == 1){
            return "You will see great success in your current endevours";
        }
        else if (num == 2){
            return "The sun will shine on you";
        }
        else if (num == 3){
            return "Today will be a good day for you";
        }
        else if (num == 4){
            return "Your doom is nigh";
        }
        else{
            return "";
        }
    }
  
    /* Returns the largest of three provided integers: num1, num2, or num3
     */
    public int largest(int num1, int num2, int num3) {
       /* implement this method */
       int greater = Math.max(num1, num2);
       return Math.max(greater, num3);
    }
  
        /* Returns true if the three provided lengths create a right triangle, in
     other words, a2 + b2 = c2, where c is the longest side; returns false
     Otherwise (hint: use the largest() method that you wrote).
     Note the "largest" side could be any of the 3 numbers, i.e. your method
     should work if side1 = 3, side2 = 4, and side3 = 5 and also if
     side1 = 5, side2 = 4, and side3 = 3
    */
    public boolean rightTriangle(int side1, int side2, int side3) {
        int hyp = largest(side1, side2, side3);
        int a;
        int b;
        if (hyp == side1){
            a = side2;
            b = side3;
        }
        else if (hyp == side2){
            a = side1;
            b = side3;
        }
        else{
            a = side1;
            b = side2;
        }
        return hyp == Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            
    }


  }
  