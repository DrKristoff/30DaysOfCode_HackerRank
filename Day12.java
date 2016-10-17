class Student extends Person{
	private int[] testScores;
    
    public Student(String firstName, String lastName, int id, int[] scores){
        super(firstName, lastName, id);
        this.testScores = scores;
    }
    
    public String calculate(){
        int total = 0;
        for(int i = 0; i < testScores.length;i++){
            total+= testScores[i];
        }
        int average = total / testScores.length;

        if (average >= 90){
            return("O");  
        } else if (90 > average && average >= 80){
            return("E");
        } else if (80 > average && average >= 70){
            return("A");
        } else if (70 > average && average >= 55){
            return("P");
        } else if (55 > average && average >= 40){
            return("D");
        } else{
            return("T");
        }
                            
            
        }
    }