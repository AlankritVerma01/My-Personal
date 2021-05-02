public class A1_Person 
{
        private String name; // creating the class attributes
        private int age ;
        private boolean isAdult;

        public A1_Person(String nm, int ag, boolean ad) // using it as a constructor ,  This is used initialise a value to the variables    its name should be same as that of the class 
        {
            name = nm;
            age = ag;
            isAdult = ad;
        }

        public void increaseAge()
        {
            age +=1;
            System.out.println(age + name + isAdult);
        }


}
