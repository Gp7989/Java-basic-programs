        /*public class encapsulation {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        encapsulation obj = new encapsulation();

        obj.setAge(23);
        obj.setName("gaurav");
        System.out.println(obj.getAge() +" " + obj.getName());
    }
}
*/
public class         encapsulation {
    public static void main(String[] args) {
        int arr[] = {43,45,65,65,43,2456,654,767,657};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i =0 ; i<arr.length ; i++){
            if (arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (secondLargest < arr[i] && secondLargest != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("largest value is "+ largest);
        System.out.println("second largest value is " + secondLargest);
    }
}