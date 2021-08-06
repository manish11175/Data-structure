package Practice;

public class Client {
    public static  void main(String args[]){

        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(4,2);
        map.put(1,8);
        map.put(2,2);
        map.put(3,8);
        map.put(5,2);
        map.put(6,8);
        map.put(7,2);
        map.put(8,8);
        map.put(9,2);
        map.put(10,8);
        map.put(40,2);
        map.put(11,8);
        map.display();
        System.out.println(map.get(1));
        System.out.println(map.ketSet());
        System.out.print(map.containsKey(11));
        System.out.print(map.remove(9));
        map.display();

    }

}
