class LinkedListTest {
   public static void main(String[] args) {
        LinkedList ml = new LinkedList();

        System.out.println("Populate List");
        ml.add(new Node("bob")); //0
        ml.add(new Node("jill")); //1
        ml.add(new Node("sue")); //2
        ml.add(new Node("tom")); //3
        ml.add(new Node("jim")); //4

      //   System.out.println("Insert Before");
        ml.insertBefore(0, new Node("head"));
        ml.insertBefore(3, new Node("kim"));

      //   System.out.print("Insert After");
        ml.insertAfter(2, new Node("kavi"));
        ml.insertAfter(7, new Node("tail"));

      //   System.out.println("Remove ");
        ml.removeNodeAt(2);
        ml.removeNodeAt(0);

      //   System.out.println("Print Index");
        int indexTest1 = ml.indexOf("sue");
        int indexTest2 = ml.indexOf("kavi");
        System.out.println(indexTest1);
        System.out.println(indexTest2);

    

        ml.printList();
   }

}