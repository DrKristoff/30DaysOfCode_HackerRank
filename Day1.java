        /* Declare second integer, double, and String variables. */
        int secondInt;
        double secondDouble;
        String myString = "";

        /* Read and save an integer, double, and String to your variables.*/
        secondInt = scan.nextInt();
        secondDouble = scan.nextDouble();
        while(scan.hasNext()){
           myString = myString + scan.next() + " "; 
        }
        

        /* Print the sum of both integer variables on a new line. */
        System.out.println(String.valueOf(i + secondInt));

        /* Print the sum of the double variables on a new line. */
        DecimalFormat oneDigit = new DecimalFormat("#,##0.0");
        System.out.println(oneDigit.format(d + secondDouble));
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + myString);