import java.util.PriorityQueue;

public class PriQJCF {
    static class Student implements Comparable<Student> {
        int rank;
        String name;
        Student(String name,int rank){
            this.rank=rank;
            this.name=name;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
        
    }
    public static void main(String[] args) {
        PriorityQueue<Student>pq=new PriorityQueue<>();
        /* for reverse 
         *         PriorityQueue<Student>pq=new PriorityQueue<>(Comparator.reverseOrder());

         */
        pq.add(new Student("A",4));
        pq.add(new Student("B",3));
        pq.add(new Student("C",5));
        pq.add(new Student("D",1));
          while (!pq.isEmpty()) {
              System.out.println(pq.peek().name+"->"+pq.peek().rank);
              pq.remove();
          }
    }
}
