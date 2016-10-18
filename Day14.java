// Add your code here

    public Difference(int[] array){
        this.elements = array;       
    }

    public void computeDifference(){
        int max = elements[0];
        int min = elements[0];
        for(int i=1;i < elements.length;i++){
           if(elements[i]>max){
               max = elements[i];
           }
           if(elements[i]<min){
               min = elements[i];
           }
        }
        maximumDifference = max - min;
    }

