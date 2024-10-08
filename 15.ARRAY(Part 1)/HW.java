public class HW {
    public static int FindKey(String[] menu,String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==key){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        String[] menu={"Samosa","Dosa","Idli","Kachori","Menduvada"};
        String key="Idli";
        int index=FindKey(menu, key);
            if(index==-1){
                System.out.println("Key not found");
            }else{
                System.out.println("Key found at index:"+index);
            }
        
    }
}
