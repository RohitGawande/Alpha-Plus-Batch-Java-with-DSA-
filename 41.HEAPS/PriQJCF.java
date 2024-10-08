public class PriQJCF {
    static class Student implements Comparable<Student> {
        int rank;
        String name;
        Student(int rank,String name){
            this.rank=rank;
            this.name=name;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
        
    }
    public static void main(String[] args) {
        
    }
}
